package org.openmodelica.test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FilenameFilter;
import java.lang.reflect.Constructor;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openmodelica.*;
import org.openmodelica.corba.parser.DefinitionsCreator;

public class TestDefinitionsParser {


	private Path test_files;
	
	@Before
	public void  init_test_file() throws URISyntaxException{
	  ClassLoader classLoader = getClass().getClassLoader();
	  URI uri = classLoader.getResource("test_files").toURI();
	  test_files = Paths.get(uri);
  }
	
  public void test_Simple_mo() throws Exception {
    File jarFile = test_files.resolve("simple.jar").toFile();
    jarFile.delete();
    DefinitionsCreator.createDefinitions(jarFile, "org.openmodelica.program", test_files.toAbsolutePath().toFile(), new String[]{"simple.mo"}, true);
  }

  @Test
  public void test_Simple_mo_classLoader() throws Exception {
    test_Simple_mo();
    // Works in Linux...
    File jarFile = test_files.resolve("simple.jar").toFile();
    URLClassLoader cl = new URLClassLoader(new URL[]{new URL("jar:"+jarFile.toURI()+"!/")});
    for (URL url : cl.getURLs())
      System.out.println(url.toString());
    Class<?> c = cl.loadClass("org.openmodelica.program.test.abc");
    Constructor<?> cons = c.getConstructor(ModelicaInteger.class, ModelicaInteger.class, ModelicaReal.class);
    Object o = cons.newInstance(new ModelicaInteger(1), new ModelicaInteger(2), new ModelicaReal(3));
    assertEquals("test.abc(a=1,b=2,c=3.0)", o.toString());
  }

  @Test
  public void test_meta_modelica_mo() throws Exception {
	String meta_modelica_jarFilename = test_files.resolve("meta_modelica.jar").toString();
	 
    DefinitionsCreator.main(meta_modelica_jarFilename, "org.openmodelica.metamodelicaprogram",
    		test_files.toAbsolutePath().toString(), "meta_modelica.mo");
  }

  @Ignore
  @Test
  public void test_OMC_Util_mo() throws Exception {
    File jarFile = new File("test_files/OMC_Util.jar");
    DefinitionsCreator.createDefinitions(jarFile, "org.openmodelica.OMC",
        new File("../../Compiler/").getAbsoluteFile(),
        new String[]{
      "Util/Util.mo" /* Lots of "replaceable type X subtypeof Any;" */
      },
      true);
  }

  @Ignore
  @Test
  /**
   *  Absyn.mo contains things like "type XXX = tuple<YYY, ZZZ>;"
   *  And some evil class names (like Class !)
   *  However, Values.mo also pulls in this file
   */
  public void test_OMC_Absyn_mo() throws Exception  {
    File jarFile = new File("test_files/OMC_Absyn.jar");
    DefinitionsCreator.createDefinitions(jarFile, "org.openmodelica.OMC",
        new File("../../Compiler/").getAbsoluteFile(),
        new String[]{"FrontEnd/Absyn.mo"},
        true);
  }
  
  @Ignore
  @Test
  public void test_OMC_Values_mo() throws Exception  {
    File jarFile = new File("test_files/OMC_Values.jar");
    DefinitionsCreator.createDefinitions(
        jarFile,
        "org.openmodelica.OMC",
        new File("../../Compiler/FrontEnd").getAbsoluteFile(),
        new String[]{
          "Absyn.mo", "Values.mo"
          },
        true);
  }

  @Ignore
  @Test
  public void test_OMC_ClassInf_mo() throws Exception  {
    File jarFile = new File("test_files/OMC_ClassInf.jar");
    DefinitionsCreator.createDefinitions(jarFile, "org.openmodelica.OMC",
        new File("../../Compiler/").getAbsoluteFile(),
        new String[]{
      "FrontEnd/Absyn.mo", "FrontEnd/ClassInf.mo", "FrontEnd/SCode.mo"
      },
      false);
  }

  class MoFilter implements FilenameFilter {
    @Override
    public boolean accept(File dir, String name) {
      return name.endsWith(".mo");
    }
  }

  @Ignore
  @Test
  public void test_OMC_mo_stripped() throws Exception {
    File jarFile = new File("test_files/OMC_full_no_functions.jar");
    File compilerDir = new File("../../Compiler/");
    String[] files = compilerDir.list(new MoFilter());
    DefinitionsCreator.createDefinitions(jarFile, "org.openmodelica.OMC",
        compilerDir.getAbsoluteFile(),
        files, false);
  }

  /*
   * Takes about 8 minutes to run...
   */
  @Ignore
  @Test
  public void test_OMC_mo() throws Exception {
    File jarFile = new File("test_files/OMC_full.jar");
    File compilerDir = new File("../../Compiler/");
    String[] files = compilerDir.list(new MoFilter());
    DefinitionsCreator.createDefinitions(jarFile, "org.openmodelica.OMC",
        compilerDir.getAbsoluteFile(),
        files, true);
  }
}
