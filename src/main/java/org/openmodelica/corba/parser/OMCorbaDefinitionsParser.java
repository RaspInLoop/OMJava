// $ANTLR 3.5.2 org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g 2018-12-16 10:44:20
package org.openmodelica.corba.parser;import java.util.Vector;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class OMCorbaDefinitionsParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "QID", "WS", "'('", 
		"')'", "','", "'<'", "'>'", "'Boolean'", "'Integer'", "'Option'", "'Real'", 
		"'String'", "'['", "'extends'", "'function'", "'input'", "'list'", "'metarecord'", 
		"'output'", "'package'", "'partial'", "'record'", "'replaceable'", "'tuple'", 
		"'type'", "'uniontype'"
	};
	public static final int EOF=-1;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int ID=4;
	public static final int INT=5;
	public static final int QID=6;
	public static final int WS=7;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public OMCorbaDefinitionsParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public OMCorbaDefinitionsParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return OMCorbaDefinitionsParser.tokenNames; }
	@Override public String getGrammarFileName() { return "org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g"; }


	public Vector<PackageDefinition> defs = new Vector<PackageDefinition>();
	public SymbolTable st = new SymbolTable();
	private Object memory;
	private String curPackage;
	protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
	  MismatchedTokenException ex = new MismatchedTokenException(ttype, input);
	  throw ex;
	}



	// $ANTLR start "definitions"
	// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:23:1: definitions : '(' ( object )* ')' EOF ;
	public final void definitions() throws RecognitionException {
		try {
			// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:23:13: ( '(' ( object )* ')' EOF )
			// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:23:15: '(' ( object )* ')' EOF
			{
			this.curPackage = null; PackageDefinition pack = new PackageDefinition(null);
			match(input,8,FOLLOW_8_in_definitions63); 
			// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:24:7: ( object )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==8) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:24:8: object
					{
					pushFollow(FOLLOW_object_in_definitions66);
					object();
					state._fsp--;

					pack.add(memory);
					}
					break;

				default :
					break loop1;
				}
			}

			match(input,9,FOLLOW_9_in_definitions72); 
			match(input,EOF,FOLLOW_EOF_in_definitions74); 
			defs.add(pack); memory = null; st.add(pack, null);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "definitions"



	// $ANTLR start "object"
	// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:26:1: object : ( package_ | record | function | uniontype | typedef | replaceable_type );
	public final void object() throws RecognitionException {
		try {
			// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:26:8: ( package_ | record | function | uniontype | typedef | replaceable_type )
			int alt2=6;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==8) ) {
				switch ( input.LA(2) ) {
				case 25:
					{
					alt2=1;
					}
					break;
				case 23:
				case 27:
					{
					alt2=2;
					}
					break;
				case 20:
					{
					alt2=3;
					}
					break;
				case 31:
					{
					alt2=4;
					}
					break;
				case 26:
				case 30:
					{
					alt2=5;
					}
					break;
				case 28:
					{
					alt2=6;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:26:10: package_
					{
					pushFollow(FOLLOW_package__in_object84);
					package_();
					state._fsp--;

					}
					break;
				case 2 :
					// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:26:21: record
					{
					pushFollow(FOLLOW_record_in_object88);
					record();
					state._fsp--;

					}
					break;
				case 3 :
					// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:26:30: function
					{
					pushFollow(FOLLOW_function_in_object92);
					function();
					state._fsp--;

					}
					break;
				case 4 :
					// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:26:41: uniontype
					{
					pushFollow(FOLLOW_uniontype_in_object96);
					uniontype();
					state._fsp--;

					}
					break;
				case 5 :
					// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:26:53: typedef
					{
					pushFollow(FOLLOW_typedef_in_object100);
					typedef();
					state._fsp--;

					}
					break;
				case 6 :
					// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:26:63: replaceable_type
					{
					pushFollow(FOLLOW_replaceable_type_in_object104);
					replaceable_type();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "object"



	// $ANTLR start "package_"
	// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:28:1: package_ : '(' 'package' ID ( object )* ')' ;
	public final void package_() throws RecognitionException {
		Token ID1=null;

		try {
			// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:28:10: ( '(' 'package' ID ( object )* ')' )
			// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:28:12: '(' 'package' ID ( object )* ')'
			{
			match(input,8,FOLLOW_8_in_package_112); 
			match(input,25,FOLLOW_25_in_package_114); 
			ID1=(Token)match(input,ID,FOLLOW_ID_in_package_116); 
			String oldPackage = curPackage; curPackage = (curPackage != null ? curPackage + "." + (ID1!=null?ID1.getText():null) : (ID1!=null?ID1.getText():null)); PackageDefinition pack = new PackageDefinition(curPackage);
			// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:29:12: ( object )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==8) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:29:13: object
					{
					pushFollow(FOLLOW_object_in_package_132);
					object();
					state._fsp--;

					pack.add(memory);
					}
					break;

				default :
					break loop3;
				}
			}

			match(input,9,FOLLOW_9_in_package_138); 
			defs.add(pack); memory = null; st.add(pack, null); curPackage = oldPackage;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "package_"



	// $ANTLR start "record"
	// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:30:1: record : ( '(' 'record' ID1= ID ( ( ( '(' varDef ')' ) | extends_ ) | object )* ')' | '(' 'metarecord' ID1= ID INT UT= ID ( ( ( '(' varDef ')' ) | extends_ ) | object )* ')' );
	public final void record() throws RecognitionException {
		Token ID1=null;
		Token UT=null;
		Token INT2=null;

		try {
			// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:30:8: ( '(' 'record' ID1= ID ( ( ( '(' varDef ')' ) | extends_ ) | object )* ')' | '(' 'metarecord' ID1= ID INT UT= ID ( ( ( '(' varDef ')' ) | extends_ ) | object )* ')' )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==8) ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1==27) ) {
					alt8=1;
				}
				else if ( (LA8_1==23) ) {
					alt8=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:30:10: '(' 'record' ID1= ID ( ( ( '(' varDef ')' ) | extends_ ) | object )* ')'
					{
					match(input,8,FOLLOW_8_in_record147); 
					match(input,27,FOLLOW_27_in_record149); 
					ID1=(Token)match(input,ID,FOLLOW_ID_in_record153); 
					String oldPackage = curPackage; curPackage = (curPackage != null ? curPackage + "." : "") + (ID1!=null?ID1.getText():null) ; RecordDefinition rec = new RecordDefinition((ID1!=null?ID1.getText():null), curPackage); PackageDefinition pack = new PackageDefinition(curPackage + ".inner");
					// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:31:10: ( ( ( '(' varDef ')' ) | extends_ ) | object )*
					loop5:
					while (true) {
						int alt5=3;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==8) ) {
							int LA5_2 = input.LA(2);
							if ( (LA5_2==ID||LA5_2==QID||(LA5_2 >= 13 && LA5_2 <= 19)||LA5_2==22||LA5_2==29) ) {
								alt5=1;
							}
							else if ( (LA5_2==20||LA5_2==23||(LA5_2 >= 25 && LA5_2 <= 28)||(LA5_2 >= 30 && LA5_2 <= 31)) ) {
								alt5=2;
							}

						}

						switch (alt5) {
						case 1 :
							// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:31:11: ( ( '(' varDef ')' ) | extends_ )
							{
							// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:31:11: ( ( '(' varDef ')' ) | extends_ )
							int alt4=2;
							int LA4_0 = input.LA(1);
							if ( (LA4_0==8) ) {
								int LA4_1 = input.LA(2);
								if ( (LA4_1==19) ) {
									alt4=2;
								}
								else if ( (LA4_1==ID||LA4_1==QID||(LA4_1 >= 13 && LA4_1 <= 18)||LA4_1==22||LA4_1==29) ) {
									alt4=1;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 4, 1, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 4, 0, input);
								throw nvae;
							}

							switch (alt4) {
								case 1 :
									// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:31:12: ( '(' varDef ')' )
									{
									// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:31:12: ( '(' varDef ')' )
									// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:31:13: '(' varDef ')'
									{
									match(input,8,FOLLOW_8_in_record169); 
									pushFollow(FOLLOW_varDef_in_record171);
									varDef();
									state._fsp--;

									match(input,9,FOLLOW_9_in_record173); 
									}

									}
									break;
								case 2 :
									// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:31:29: extends_
									{
									pushFollow(FOLLOW_extends__in_record176);
									extends_();
									state._fsp--;

									}
									break;

							}

							rec.fields.add(memory);
							}
							break;
						case 2 :
							// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:32:13: object
							{
							pushFollow(FOLLOW_object_in_record192);
							object();
							state._fsp--;

							pack.add(memory);
							}
							break;

						default :
							break loop5;
						}
					}

					match(input,9,FOLLOW_9_in_record209); 
					memory = rec; curPackage = oldPackage; st.add(rec, curPackage);
					}
					break;
				case 2 :
					// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:34:11: '(' 'metarecord' ID1= ID INT UT= ID ( ( ( '(' varDef ')' ) | extends_ ) | object )* ')'
					{
					match(input,8,FOLLOW_8_in_record223); 
					match(input,23,FOLLOW_23_in_record225); 
					ID1=(Token)match(input,ID,FOLLOW_ID_in_record229); 
					String recID = (ID1!=null?ID1.getText():null); String oldPackage = curPackage; curPackage = (curPackage != null ? curPackage + "." : "") + (ID1!=null?ID1.getText():null) ; RecordDefinition rec; PackageDefinition pack = new PackageDefinition(curPackage + ".inner");
					INT2=(Token)match(input,INT,FOLLOW_INT_in_record244); 
					int index = (INT2!=null?Integer.valueOf(INT2.getText()):0);
					UT=(Token)match(input,ID,FOLLOW_ID_in_record261); 
					String uniontype = (UT!=null?UT.getText():null);
					rec = new RecordDefinition(recID, uniontype, index, curPackage);
					// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:38:12: ( ( ( '(' varDef ')' ) | extends_ ) | object )*
					loop7:
					while (true) {
						int alt7=3;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==8) ) {
							int LA7_2 = input.LA(2);
							if ( (LA7_2==ID||LA7_2==QID||(LA7_2 >= 13 && LA7_2 <= 19)||LA7_2==22||LA7_2==29) ) {
								alt7=1;
							}
							else if ( (LA7_2==20||LA7_2==23||(LA7_2 >= 25 && LA7_2 <= 28)||(LA7_2 >= 30 && LA7_2 <= 31)) ) {
								alt7=2;
							}

						}

						switch (alt7) {
						case 1 :
							// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:38:13: ( ( '(' varDef ')' ) | extends_ )
							{
							// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:38:13: ( ( '(' varDef ')' ) | extends_ )
							int alt6=2;
							int LA6_0 = input.LA(1);
							if ( (LA6_0==8) ) {
								int LA6_1 = input.LA(2);
								if ( (LA6_1==19) ) {
									alt6=2;
								}
								else if ( (LA6_1==ID||LA6_1==QID||(LA6_1 >= 13 && LA6_1 <= 18)||LA6_1==22||LA6_1==29) ) {
									alt6=1;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 6, 1, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 6, 0, input);
								throw nvae;
							}

							switch (alt6) {
								case 1 :
									// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:38:14: ( '(' varDef ')' )
									{
									// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:38:14: ( '(' varDef ')' )
									// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:38:15: '(' varDef ')'
									{
									match(input,8,FOLLOW_8_in_record292); 
									pushFollow(FOLLOW_varDef_in_record294);
									varDef();
									state._fsp--;

									match(input,9,FOLLOW_9_in_record296); 
									}

									}
									break;
								case 2 :
									// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:38:31: extends_
									{
									pushFollow(FOLLOW_extends__in_record299);
									extends_();
									state._fsp--;

									}
									break;

							}

							rec.fields.add(memory);
							}
							break;
						case 2 :
							// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:39:15: object
							{
							pushFollow(FOLLOW_object_in_record317);
							object();
							state._fsp--;

							pack.add(memory);
							}
							break;

						default :
							break loop7;
						}
					}

					match(input,9,FOLLOW_9_in_record336); 
					memory = rec; curPackage = oldPackage; st.add(rec, curPackage);
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "record"



	// $ANTLR start "extends_"
	// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:41:1: extends_ : '(' 'extends' fqid ')' ;
	public final void extends_() throws RecognitionException {
		try {
			// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:41:10: ( '(' 'extends' fqid ')' )
			// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:41:12: '(' 'extends' fqid ')'
			{
			match(input,8,FOLLOW_8_in_extends_345); 
			match(input,19,FOLLOW_19_in_extends_347); 
			pushFollow(FOLLOW_fqid_in_extends_349);
			fqid();
			state._fsp--;

			match(input,9,FOLLOW_9_in_extends_351); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "extends_"



	// $ANTLR start "function"
	// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:42:1: function : '(' 'function' ID ( input | output | object )* ')' ;
	public final void function() throws RecognitionException {
		Token ID3=null;

		try {
			// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:42:10: ( '(' 'function' ID ( input | output | object )* ')' )
			// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:42:12: '(' 'function' ID ( input | output | object )* ')'
			{
			match(input,8,FOLLOW_8_in_function358); 
			match(input,20,FOLLOW_20_in_function360); 
			ID3=(Token)match(input,ID,FOLLOW_ID_in_function362); 
			FunctionDefinition fun = new FunctionDefinition((ID3!=null?ID3.getText():null)); String oldPackage = curPackage; curPackage = (curPackage != null ? curPackage + "." : "") + (ID3!=null?ID3.getText():null); PackageDefinition pack = new PackageDefinition(curPackage + ".inner");
			// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:43:13: ( input | output | object )*
			loop9:
			while (true) {
				int alt9=4;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==8) ) {
					switch ( input.LA(2) ) {
					case 21:
						{
						alt9=1;
						}
						break;
					case 24:
						{
						alt9=2;
						}
						break;
					case 20:
					case 23:
					case 25:
					case 26:
					case 27:
					case 28:
					case 30:
					case 31:
						{
						alt9=3;
						}
						break;
					}
				}

				switch (alt9) {
				case 1 :
					// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:43:15: input
					{
					pushFollow(FOLLOW_input_in_function380);
					input();
					state._fsp--;

					fun.input.add((VariableDefinition)memory);
					}
					break;
				case 2 :
					// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:44:15: output
					{
					pushFollow(FOLLOW_output_in_function397);
					output();
					state._fsp--;

					fun.output.add((VariableDefinition)memory);
					}
					break;
				case 3 :
					// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:45:15: object
					{
					pushFollow(FOLLOW_object_in_function414);
					object();
					state._fsp--;

					pack.add(memory);
					}
					break;

				default :
					break loop9;
				}
			}

			match(input,9,FOLLOW_9_in_function445); 
			curPackage = oldPackage; memory = fun; st.add(fun, curPackage);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "function"



	// $ANTLR start "uniontype"
	// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:48:1: uniontype : '(' 'uniontype' ID ')' ;
	public final void uniontype() throws RecognitionException {
		Token ID4=null;

		try {
			// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:48:11: ( '(' 'uniontype' ID ')' )
			// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:48:13: '(' 'uniontype' ID ')'
			{
			match(input,8,FOLLOW_8_in_uniontype454); 
			match(input,31,FOLLOW_31_in_uniontype456); 
			ID4=(Token)match(input,ID,FOLLOW_ID_in_uniontype458); 
			match(input,9,FOLLOW_9_in_uniontype460); 
			UniontypeDefinition union = new UniontypeDefinition((ID4!=null?ID4.getText():null)); memory = union; st.add(union, curPackage);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "uniontype"



	// $ANTLR start "typedef"
	// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:49:1: typedef : ( '(' 'partial' 'function' ID ')' | '(' 'type' ID type ')' );
	public final void typedef() throws RecognitionException {
		Token ID5=null;
		Token ID6=null;

		try {
			// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:49:9: ( '(' 'partial' 'function' ID ')' | '(' 'type' ID type ')' )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==8) ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1==26) ) {
					alt10=1;
				}
				else if ( (LA10_1==30) ) {
					alt10=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:49:11: '(' 'partial' 'function' ID ')'
					{
					match(input,8,FOLLOW_8_in_typedef469); 
					match(input,26,FOLLOW_26_in_typedef471); 
					match(input,20,FOLLOW_20_in_typedef473); 
					ID5=(Token)match(input,ID,FOLLOW_ID_in_typedef475); 
					match(input,9,FOLLOW_9_in_typedef477); 
					memory = new VariableDefinition(new ComplexTypeDefinition(ComplexTypeDefinition.ComplexType.FUNCTION_REFERENCE), (ID5!=null?ID5.getText():null), curPackage);st.add((VariableDefinition)memory, curPackage);
					}
					break;
				case 2 :
					// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:50:11: '(' 'type' ID type ')'
					{
					match(input,8,FOLLOW_8_in_typedef491); 
					match(input,30,FOLLOW_30_in_typedef493); 
					ID6=(Token)match(input,ID,FOLLOW_ID_in_typedef495); 
					pushFollow(FOLLOW_type_in_typedef497);
					type();
					state._fsp--;

					match(input,9,FOLLOW_9_in_typedef499); 
					memory = new VariableDefinition((ComplexTypeDefinition) memory, (ID6!=null?ID6.getText():null), curPackage); st.add((VariableDefinition)memory, curPackage);
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "typedef"



	// $ANTLR start "replaceable_type"
	// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:52:1: replaceable_type : '(' 'replaceable' 'type' ID ')' ;
	public final void replaceable_type() throws RecognitionException {
		Token ID7=null;

		try {
			// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:52:18: ( '(' 'replaceable' 'type' ID ')' )
			// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:52:20: '(' 'replaceable' 'type' ID ')'
			{
			match(input,8,FOLLOW_8_in_replaceable_type509); 
			match(input,28,FOLLOW_28_in_replaceable_type511); 
			match(input,30,FOLLOW_30_in_replaceable_type513); 
			ID7=(Token)match(input,ID,FOLLOW_ID_in_replaceable_type515); 
			match(input,9,FOLLOW_9_in_replaceable_type517); 
			memory = new VariableDefinition(new ComplexTypeDefinition(ComplexTypeDefinition.ComplexType.GENERIC_TYPE, "ModelicaObject"), (ID7!=null?ID7.getText():null), curPackage); st.add((VariableDefinition)memory, curPackage);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "replaceable_type"



	// $ANTLR start "type"
	// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:54:1: type : ( basetype | complextype | '[' INT type | fqid );
	public final void type() throws RecognitionException {
		Token INT8=null;

		try {
			// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:54:6: ( basetype | complextype | '[' INT type | fqid )
			int alt11=4;
			switch ( input.LA(1) ) {
			case 13:
			case 14:
			case 16:
			case 17:
				{
				alt11=1;
				}
				break;
			case 15:
			case 22:
			case 29:
				{
				alt11=2;
				}
				break;
			case 18:
				{
				alt11=3;
				}
				break;
			case ID:
			case QID:
				{
				alt11=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:54:8: basetype
					{
					pushFollow(FOLLOW_basetype_in_type527);
					basetype();
					state._fsp--;

					}
					break;
				case 2 :
					// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:55:8: complextype
					{
					pushFollow(FOLLOW_complextype_in_type536);
					complextype();
					state._fsp--;

					}
					break;
				case 3 :
					// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:56:8: '[' INT type
					{
					match(input,18,FOLLOW_18_in_type545); 
					INT8=(Token)match(input,INT,FOLLOW_INT_in_type547); 
					pushFollow(FOLLOW_type_in_type549);
					type();
					state._fsp--;

					memory = new ComplexTypeDefinition(ComplexTypeDefinition.ComplexType.ARRAY, (ComplexTypeDefinition) memory, (INT8!=null?Integer.valueOf(INT8.getText()):0));
					}
					break;
				case 4 :
					// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:57:8: fqid
					{
					pushFollow(FOLLOW_fqid_in_type560);
					fqid();
					state._fsp--;

					memory = new ComplexTypeDefinition(ComplexTypeDefinition.ComplexType.DEFINED_TYPE, (String) memory);
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "type"



	// $ANTLR start "varDef"
	// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:58:1: varDef : type ID ;
	public final void varDef() throws RecognitionException {
		Token ID9=null;

		try {
			// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:58:8: ( type ID )
			// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:58:10: type ID
			{
			pushFollow(FOLLOW_type_in_varDef569);
			type();
			state._fsp--;

			ID9=(Token)match(input,ID,FOLLOW_ID_in_varDef571); 
			memory = new VariableDefinition((ComplexTypeDefinition)memory, (ID9!=null?ID9.getText():null), curPackage);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varDef"



	// $ANTLR start "input"
	// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:59:1: input : '(' 'input' varDef ')' ;
	public final void input() throws RecognitionException {
		try {
			// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:59:8: ( '(' 'input' varDef ')' )
			// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:59:10: '(' 'input' varDef ')'
			{
			match(input,8,FOLLOW_8_in_input581); 
			match(input,21,FOLLOW_21_in_input583); 
			pushFollow(FOLLOW_varDef_in_input585);
			varDef();
			state._fsp--;

			match(input,9,FOLLOW_9_in_input587); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "input"



	// $ANTLR start "output"
	// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:60:1: output : '(' 'output' varDef ')' ;
	public final void output() throws RecognitionException {
		try {
			// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:60:8: ( '(' 'output' varDef ')' )
			// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:60:10: '(' 'output' varDef ')'
			{
			match(input,8,FOLLOW_8_in_output594); 
			match(input,24,FOLLOW_24_in_output596); 
			pushFollow(FOLLOW_varDef_in_output598);
			varDef();
			state._fsp--;

			match(input,9,FOLLOW_9_in_output600); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "output"



	// $ANTLR start "basetype"
	// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:61:1: basetype : ( 'Integer' | 'Real' | 'Boolean' | 'String' );
	public final void basetype() throws RecognitionException {
		try {
			// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:61:10: ( 'Integer' | 'Real' | 'Boolean' | 'String' )
			int alt12=4;
			switch ( input.LA(1) ) {
			case 14:
				{
				alt12=1;
				}
				break;
			case 16:
				{
				alt12=2;
				}
				break;
			case 13:
				{
				alt12=3;
				}
				break;
			case 17:
				{
				alt12=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:61:12: 'Integer'
					{
					match(input,14,FOLLOW_14_in_basetype607); 
					memory = new ComplexTypeDefinition(ComplexTypeDefinition.ComplexType.BUILT_IN, "ModelicaInteger");
					}
					break;
				case 2 :
					// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:62:12: 'Real'
					{
					match(input,16,FOLLOW_16_in_basetype622); 
					memory = new ComplexTypeDefinition(ComplexTypeDefinition.ComplexType.BUILT_IN, "ModelicaReal");
					}
					break;
				case 3 :
					// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:63:12: 'Boolean'
					{
					match(input,13,FOLLOW_13_in_basetype637); 
					memory = new ComplexTypeDefinition(ComplexTypeDefinition.ComplexType.BUILT_IN, "ModelicaBoolean");
					}
					break;
				case 4 :
					// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:64:12: 'String'
					{
					match(input,17,FOLLOW_17_in_basetype652); 
					memory = new ComplexTypeDefinition(ComplexTypeDefinition.ComplexType.BUILT_IN, "ModelicaString");
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "basetype"



	// $ANTLR start "complextype"
	// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:65:1: complextype : ( ( 'list' ) '<' type '>' | ( 'tuple' ) '<' type ( ',' type )+ '>' | ( 'Option' ) '<' type '>' );
	public final void complextype() throws RecognitionException {
		try {
			// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:65:13: ( ( 'list' ) '<' type '>' | ( 'tuple' ) '<' type ( ',' type )+ '>' | ( 'Option' ) '<' type '>' )
			int alt14=3;
			switch ( input.LA(1) ) {
			case 22:
				{
				alt14=1;
				}
				break;
			case 29:
				{
				alt14=2;
				}
				break;
			case 15:
				{
				alt14=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:66:8: ( 'list' ) '<' type '>'
					{
					// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:66:8: ( 'list' )
					// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:66:9: 'list'
					{
					match(input,22,FOLLOW_22_in_complextype672); 
					}

					ComplexTypeDefinition def = new ComplexTypeDefinition(ComplexTypeDefinition.ComplexType.LIST_TYPE);
					match(input,11,FOLLOW_11_in_complextype684); 
					pushFollow(FOLLOW_type_in_complextype686);
					type();
					state._fsp--;

					def.add((ComplexTypeDefinition)memory);
					match(input,12,FOLLOW_12_in_complextype690); 
					memory = def;
					}
					break;
				case 2 :
					// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:68:8: ( 'tuple' ) '<' type ( ',' type )+ '>'
					{
					// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:68:8: ( 'tuple' )
					// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:68:9: 'tuple'
					{
					match(input,29,FOLLOW_29_in_complextype702); 
					}

					ComplexTypeDefinition def = new ComplexTypeDefinition(ComplexTypeDefinition.ComplexType.TUPLE_TYPE);
					match(input,11,FOLLOW_11_in_complextype714); 
					pushFollow(FOLLOW_type_in_complextype716);
					type();
					state._fsp--;

					def.add((ComplexTypeDefinition)memory);
					// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:69:59: ( ',' type )+
					int cnt13=0;
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( (LA13_0==10) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:69:60: ',' type
							{
							match(input,10,FOLLOW_10_in_complextype721); 
							pushFollow(FOLLOW_type_in_complextype723);
							type();
							state._fsp--;

							def.add((ComplexTypeDefinition)memory);
							}
							break;

						default :
							if ( cnt13 >= 1 ) break loop13;
							EarlyExitException eee = new EarlyExitException(13, input);
							throw eee;
						}
						cnt13++;
					}

					match(input,12,FOLLOW_12_in_complextype729); 
					memory = def;
					}
					break;
				case 3 :
					// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:70:8: ( 'Option' ) '<' type '>'
					{
					// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:70:8: ( 'Option' )
					// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:70:9: 'Option'
					{
					match(input,15,FOLLOW_15_in_complextype741); 
					}

					ComplexTypeDefinition def = new ComplexTypeDefinition(ComplexTypeDefinition.ComplexType.OPTION_TYPE);
					match(input,11,FOLLOW_11_in_complextype753); 
					pushFollow(FOLLOW_type_in_complextype755);
					type();
					state._fsp--;

					def.add((ComplexTypeDefinition)memory);
					match(input,12,FOLLOW_12_in_complextype759); 
					memory = def;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "complextype"



	// $ANTLR start "fqid"
	// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:72:1: fqid : ( ID | QID );
	public final void fqid() throws RecognitionException {
		Token ID10=null;
		Token QID11=null;

		try {
			// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:72:6: ( ID | QID )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==ID) ) {
				alt15=1;
			}
			else if ( (LA15_0==QID) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:72:8: ID
					{
					ID10=(Token)match(input,ID,FOLLOW_ID_in_fqid768); 
					memory = (ID10!=null?ID10.getText():null);
					}
					break;
				case 2 :
					// org\\openmodelica\\corba\\parser\\OMCorbaDefinitions.g:73:8: QID
					{
					QID11=(Token)match(input,QID,FOLLOW_QID_in_fqid779); 
					memory = (QID11!=null?QID11.getText():null);
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "fqid"

	// Delegated rules



	public static final BitSet FOLLOW_8_in_definitions63 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_object_in_definitions66 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_9_in_definitions72 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_definitions74 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_package__in_object84 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_record_in_object88 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_object92 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_uniontype_in_object96 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typedef_in_object100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_replaceable_type_in_object104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_8_in_package_112 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_package_114 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_package_116 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_object_in_package_132 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_9_in_package_138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_8_in_record147 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_record149 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_record153 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_8_in_record169 = new BitSet(new long[]{0x000000002047E050L});
	public static final BitSet FOLLOW_varDef_in_record171 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_record173 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_extends__in_record176 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_object_in_record192 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_9_in_record209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_8_in_record223 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_record225 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_record229 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_INT_in_record244 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_record261 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_8_in_record292 = new BitSet(new long[]{0x000000002047E050L});
	public static final BitSet FOLLOW_varDef_in_record294 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_record296 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_extends__in_record299 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_object_in_record317 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_9_in_record336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_8_in_extends_345 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_extends_347 = new BitSet(new long[]{0x0000000000000050L});
	public static final BitSet FOLLOW_fqid_in_extends_349 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_extends_351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_8_in_function358 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_function360 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_function362 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_input_in_function380 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_output_in_function397 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_object_in_function414 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_9_in_function445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_8_in_uniontype454 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_uniontype456 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_uniontype458 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_uniontype460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_8_in_typedef469 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_typedef471 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_typedef473 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_typedef475 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_typedef477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_8_in_typedef491 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_typedef493 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_typedef495 = new BitSet(new long[]{0x000000002047E050L});
	public static final BitSet FOLLOW_type_in_typedef497 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_typedef499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_8_in_replaceable_type509 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_replaceable_type511 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_replaceable_type513 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_replaceable_type515 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_replaceable_type517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_basetype_in_type527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_complextype_in_type536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_type545 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_INT_in_type547 = new BitSet(new long[]{0x000000002047E050L});
	public static final BitSet FOLLOW_type_in_type549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fqid_in_type560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_varDef569 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_varDef571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_8_in_input581 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_input583 = new BitSet(new long[]{0x000000002047E050L});
	public static final BitSet FOLLOW_varDef_in_input585 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_input587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_8_in_output594 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_output596 = new BitSet(new long[]{0x000000002047E050L});
	public static final BitSet FOLLOW_varDef_in_output598 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_output600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_basetype607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_basetype622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_basetype637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_basetype652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_complextype672 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_complextype684 = new BitSet(new long[]{0x000000002047E050L});
	public static final BitSet FOLLOW_type_in_complextype686 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_complextype690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_complextype702 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_complextype714 = new BitSet(new long[]{0x000000002047E050L});
	public static final BitSet FOLLOW_type_in_complextype716 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_complextype721 = new BitSet(new long[]{0x000000002047E050L});
	public static final BitSet FOLLOW_type_in_complextype723 = new BitSet(new long[]{0x0000000000001400L});
	public static final BitSet FOLLOW_12_in_complextype729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_complextype741 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_complextype753 = new BitSet(new long[]{0x000000002047E050L});
	public static final BitSet FOLLOW_type_in_complextype755 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_complextype759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_fqid768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QID_in_fqid779 = new BitSet(new long[]{0x0000000000000002L});
}
