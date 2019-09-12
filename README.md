# OMJava
OpenModelica Java Interface

[![Build Status](https://travis-ci.org/RaspInLoop/OMJava.svg?branch=master)](https://travis-ci.org/RaspInLoop/OMJava) 
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/Raspinloop/OMJava/badge.svg)](https://maven-badges.herokuapp.com/maven-central/Raspinloop/OMJava)

To build, simply use the command `mvn package` or 'mvn install' on a system having openModelica installed and with environement variable "OPENMODELICAHOME" set accordingly.

To install the released package:
Download the latest package from the release page of this project. then install it locally with this maven command:
<pre>
mvn install:install-file -Dfile=OMJava-0.0.1-SNAPSHOT.jar -DgroupId=org.raspinloop.openmodelica -DartifactId=OMJava -Dversion=0.0.1-SNAPSHOT -Dpackaging=jar
</pre>

