package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.PascalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPascalParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SIGNED_INTEGER_NUMBER", "RULE_INTEGER_NUMBER", "RULE_RELATIONAL_OPERATOR", "RULE_ADDITION_OPERATOR", "RULE_MULTIPLICATION_OPERATOR", "RULE_STRING", "RULE_REAL_NUMBER", "RULE_SIGNED_REAL_NUMBER", "RULE_NUMERIC_SUBRANGE", "RULE_UNSIGNED_DIGIT_SEQUENCE", "RULE_DIGIT_SEQUENCE", "RULE_DIGIT", "RULE_ML_COMMENT", "RULE_INT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'program'", "'('", "')'", "';'", "','", "'begin'", "'end'", "':'", "':='", "'['", "']'", "'^'", "'in'", "'='", "'or'", "'div'", "'mod'", "'and'", "'nil'", "'true'", "'false'", "'not'", "'for'", "'to'", "'downto'", "'do'", "'if'", "'then'", "'else'", "'const'", "'type'", "'..'", "'packed'", "'array'", "'of'", "'set'", "'var'", "'forward'", "'procedure'", "'function'"
    };
    public static final int T__50=50;
    public static final int RULE_UNSIGNED_DIGIT_SEQUENCE=14;
    public static final int RULE_REAL_NUMBER=11;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int RULE_NUMERIC_SUBRANGE=13;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_DIGIT=16;
    public static final int RULE_SIGNED_REAL_NUMBER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=18;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=17;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int RULE_INTEGER_NUMBER=6;
    public static final int RULE_RELATIONAL_OPERATOR=7;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=19;
    public static final int RULE_DIGIT_SEQUENCE=15;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=20;
    public static final int RULE_MULTIPLICATION_OPERATOR=9;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_SIGNED_INTEGER_NUMBER=5;
    public static final int T__48=48;
    public static final int RULE_ADDITION_OPERATOR=8;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalPascalParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPascalParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPascalParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPascal.g"; }



     	private PascalGrammarAccess grammarAccess;

        public InternalPascalParser(TokenStream input, PascalGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "pascal";
       	}

       	@Override
       	protected PascalGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulepascal"
    // InternalPascal.g:64:1: entryRulepascal returns [EObject current=null] : iv_rulepascal= rulepascal EOF ;
    public final EObject entryRulepascal() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepascal = null;


        try {
            // InternalPascal.g:64:47: (iv_rulepascal= rulepascal EOF )
            // InternalPascal.g:65:2: iv_rulepascal= rulepascal EOF
            {
             newCompositeNode(grammarAccess.getPascalRule()); 
            pushFollow(FOLLOW_1);
            iv_rulepascal=rulepascal();

            state._fsp--;

             current =iv_rulepascal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepascal"


    // $ANTLR start "rulepascal"
    // InternalPascal.g:71:1: rulepascal returns [EObject current=null] : ( (lv_program_0_0= ruleprogram ) ) ;
    public final EObject rulepascal() throws RecognitionException {
        EObject current = null;

        EObject lv_program_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:77:2: ( ( (lv_program_0_0= ruleprogram ) ) )
            // InternalPascal.g:78:2: ( (lv_program_0_0= ruleprogram ) )
            {
            // InternalPascal.g:78:2: ( (lv_program_0_0= ruleprogram ) )
            // InternalPascal.g:79:3: (lv_program_0_0= ruleprogram )
            {
            // InternalPascal.g:79:3: (lv_program_0_0= ruleprogram )
            // InternalPascal.g:80:4: lv_program_0_0= ruleprogram
            {

            				newCompositeNode(grammarAccess.getPascalAccess().getProgramProgramParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_program_0_0=ruleprogram();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getPascalRule());
            				}
            				add(
            					current,
            					"program",
            					lv_program_0_0,
            					"org.xtext.example.mydsl.Pascal.program");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulepascal"


    // $ANTLR start "entryRuleprogram"
    // InternalPascal.g:100:1: entryRuleprogram returns [EObject current=null] : iv_ruleprogram= ruleprogram EOF ;
    public final EObject entryRuleprogram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprogram = null;


        try {
            // InternalPascal.g:100:48: (iv_ruleprogram= ruleprogram EOF )
            // InternalPascal.g:101:2: iv_ruleprogram= ruleprogram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprogram=ruleprogram();

            state._fsp--;

             current =iv_ruleprogram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprogram"


    // $ANTLR start "ruleprogram"
    // InternalPascal.g:107:1: ruleprogram returns [EObject current=null] : ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.' ) ;
    public final EObject ruleprogram() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_heading_0_0 = null;

        EObject lv_block_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:113:2: ( ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.' ) )
            // InternalPascal.g:114:2: ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.' )
            {
            // InternalPascal.g:114:2: ( ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.' )
            // InternalPascal.g:115:3: ( (lv_heading_0_0= ruleprogram_heading_block ) ) ( (lv_block_1_0= ruleblock ) ) otherlv_2= '.'
            {
            // InternalPascal.g:115:3: ( (lv_heading_0_0= ruleprogram_heading_block ) )
            // InternalPascal.g:116:4: (lv_heading_0_0= ruleprogram_heading_block )
            {
            // InternalPascal.g:116:4: (lv_heading_0_0= ruleprogram_heading_block )
            // InternalPascal.g:117:5: lv_heading_0_0= ruleprogram_heading_block
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getHeadingProgram_heading_blockParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_heading_0_0=ruleprogram_heading_block();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"heading",
            						lv_heading_0_0,
            						"org.xtext.example.mydsl.Pascal.program_heading_block");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:134:3: ( (lv_block_1_0= ruleblock ) )
            // InternalPascal.g:135:4: (lv_block_1_0= ruleblock )
            {
            // InternalPascal.g:135:4: (lv_block_1_0= ruleblock )
            // InternalPascal.g:136:5: lv_block_1_0= ruleblock
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getBlockBlockParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_block_1_0=ruleblock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"block",
            						lv_block_1_0,
            						"org.xtext.example.mydsl.Pascal.block");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getFullStopKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprogram"


    // $ANTLR start "entryRuleprogram_heading_block"
    // InternalPascal.g:161:1: entryRuleprogram_heading_block returns [EObject current=null] : iv_ruleprogram_heading_block= ruleprogram_heading_block EOF ;
    public final EObject entryRuleprogram_heading_block() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprogram_heading_block = null;


        try {
            // InternalPascal.g:161:62: (iv_ruleprogram_heading_block= ruleprogram_heading_block EOF )
            // InternalPascal.g:162:2: iv_ruleprogram_heading_block= ruleprogram_heading_block EOF
            {
             newCompositeNode(grammarAccess.getProgram_heading_blockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprogram_heading_block=ruleprogram_heading_block();

            state._fsp--;

             current =iv_ruleprogram_heading_block; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprogram_heading_block"


    // $ANTLR start "ruleprogram_heading_block"
    // InternalPascal.g:168:1: ruleprogram_heading_block returns [EObject current=null] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= ')' )? otherlv_5= ';' ) ;
    public final EObject ruleprogram_heading_block() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_identifiers_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:174:2: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= ')' )? otherlv_5= ';' ) )
            // InternalPascal.g:175:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= ')' )? otherlv_5= ';' )
            {
            // InternalPascal.g:175:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= ')' )? otherlv_5= ';' )
            // InternalPascal.g:176:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= ')' )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getProgram_heading_blockAccess().getProgramKeyword_0());
            		
            // InternalPascal.g:180:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPascal.g:181:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPascal.g:181:4: (lv_name_1_0= RULE_ID )
            // InternalPascal.g:182:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProgram_heading_blockAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProgram_heading_blockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPascal.g:198:3: (otherlv_2= '(' ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= ')' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==24) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPascal.g:199:4: otherlv_2= '(' ( (lv_identifiers_3_0= ruleidentifier_list ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getProgram_heading_blockAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalPascal.g:203:4: ( (lv_identifiers_3_0= ruleidentifier_list ) )
                    // InternalPascal.g:204:5: (lv_identifiers_3_0= ruleidentifier_list )
                    {
                    // InternalPascal.g:204:5: (lv_identifiers_3_0= ruleidentifier_list )
                    // InternalPascal.g:205:6: lv_identifiers_3_0= ruleidentifier_list
                    {

                    						newCompositeNode(grammarAccess.getProgram_heading_blockAccess().getIdentifiersIdentifier_listParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_identifiers_3_0=ruleidentifier_list();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProgram_heading_blockRule());
                    						}
                    						set(
                    							current,
                    							"identifiers",
                    							lv_identifiers_3_0,
                    							"org.xtext.example.mydsl.Pascal.identifier_list");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,25,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getProgram_heading_blockAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getProgram_heading_blockAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprogram_heading_block"


    // $ANTLR start "entryRuleidentifier_list"
    // InternalPascal.g:235:1: entryRuleidentifier_list returns [EObject current=null] : iv_ruleidentifier_list= ruleidentifier_list EOF ;
    public final EObject entryRuleidentifier_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleidentifier_list = null;


        try {
            // InternalPascal.g:235:56: (iv_ruleidentifier_list= ruleidentifier_list EOF )
            // InternalPascal.g:236:2: iv_ruleidentifier_list= ruleidentifier_list EOF
            {
             newCompositeNode(grammarAccess.getIdentifier_listRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleidentifier_list=ruleidentifier_list();

            state._fsp--;

             current =iv_ruleidentifier_list; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleidentifier_list"


    // $ANTLR start "ruleidentifier_list"
    // InternalPascal.g:242:1: ruleidentifier_list returns [EObject current=null] : ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleidentifier_list() throws RecognitionException {
        EObject current = null;

        Token lv_names_0_0=null;
        Token otherlv_1=null;
        Token lv_names_2_0=null;


        	enterRule();

        try {
            // InternalPascal.g:248:2: ( ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* ) )
            // InternalPascal.g:249:2: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* )
            {
            // InternalPascal.g:249:2: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* )
            // InternalPascal.g:250:3: ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )*
            {
            // InternalPascal.g:250:3: ( (lv_names_0_0= RULE_ID ) )
            // InternalPascal.g:251:4: (lv_names_0_0= RULE_ID )
            {
            // InternalPascal.g:251:4: (lv_names_0_0= RULE_ID )
            // InternalPascal.g:252:5: lv_names_0_0= RULE_ID
            {
            lv_names_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_names_0_0, grammarAccess.getIdentifier_listAccess().getNamesIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIdentifier_listRule());
            					}
            					addWithLastConsumed(
            						current,
            						"names",
            						lv_names_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPascal.g:268:3: (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==27) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPascal.g:269:4: otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,27,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPascal.g:273:4: ( (lv_names_2_0= RULE_ID ) )
            	    // InternalPascal.g:274:5: (lv_names_2_0= RULE_ID )
            	    {
            	    // InternalPascal.g:274:5: (lv_names_2_0= RULE_ID )
            	    // InternalPascal.g:275:6: lv_names_2_0= RULE_ID
            	    {
            	    lv_names_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    						newLeafNode(lv_names_2_0, grammarAccess.getIdentifier_listAccess().getNamesIDTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getIdentifier_listRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"names",
            	    							lv_names_2_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleidentifier_list"


    // $ANTLR start "entryRuleblock"
    // InternalPascal.g:296:1: entryRuleblock returns [EObject current=null] : iv_ruleblock= ruleblock EOF ;
    public final EObject entryRuleblock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleblock = null;


        try {
            // InternalPascal.g:296:46: (iv_ruleblock= ruleblock EOF )
            // InternalPascal.g:297:2: iv_ruleblock= ruleblock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleblock=ruleblock();

            state._fsp--;

             current =iv_ruleblock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleblock"


    // $ANTLR start "ruleblock"
    // InternalPascal.g:303:1: ruleblock returns [EObject current=null] : ( ( (lv_constant_0_0= ruleconstant_definition_part ) )? ( (lv_type_1_0= ruletype_definition_part ) )? ( (lv_variable_2_0= rulevariable_declaration_part ) )? ( (lv_abstraction_3_0= ruleprocedure_and_function_declaration_part ) )? ( (lv_statement_4_0= rulestatement_part ) ) ) ;
    public final EObject ruleblock() throws RecognitionException {
        EObject current = null;

        EObject lv_constant_0_0 = null;

        EObject lv_type_1_0 = null;

        EObject lv_variable_2_0 = null;

        EObject lv_abstraction_3_0 = null;

        EObject lv_statement_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:309:2: ( ( ( (lv_constant_0_0= ruleconstant_definition_part ) )? ( (lv_type_1_0= ruletype_definition_part ) )? ( (lv_variable_2_0= rulevariable_declaration_part ) )? ( (lv_abstraction_3_0= ruleprocedure_and_function_declaration_part ) )? ( (lv_statement_4_0= rulestatement_part ) ) ) )
            // InternalPascal.g:310:2: ( ( (lv_constant_0_0= ruleconstant_definition_part ) )? ( (lv_type_1_0= ruletype_definition_part ) )? ( (lv_variable_2_0= rulevariable_declaration_part ) )? ( (lv_abstraction_3_0= ruleprocedure_and_function_declaration_part ) )? ( (lv_statement_4_0= rulestatement_part ) ) )
            {
            // InternalPascal.g:310:2: ( ( (lv_constant_0_0= ruleconstant_definition_part ) )? ( (lv_type_1_0= ruletype_definition_part ) )? ( (lv_variable_2_0= rulevariable_declaration_part ) )? ( (lv_abstraction_3_0= ruleprocedure_and_function_declaration_part ) )? ( (lv_statement_4_0= rulestatement_part ) ) )
            // InternalPascal.g:311:3: ( (lv_constant_0_0= ruleconstant_definition_part ) )? ( (lv_type_1_0= ruletype_definition_part ) )? ( (lv_variable_2_0= rulevariable_declaration_part ) )? ( (lv_abstraction_3_0= ruleprocedure_and_function_declaration_part ) )? ( (lv_statement_4_0= rulestatement_part ) )
            {
            // InternalPascal.g:311:3: ( (lv_constant_0_0= ruleconstant_definition_part ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==52) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPascal.g:312:4: (lv_constant_0_0= ruleconstant_definition_part )
                    {
                    // InternalPascal.g:312:4: (lv_constant_0_0= ruleconstant_definition_part )
                    // InternalPascal.g:313:5: lv_constant_0_0= ruleconstant_definition_part
                    {

                    					newCompositeNode(grammarAccess.getBlockAccess().getConstantConstant_definition_partParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_constant_0_0=ruleconstant_definition_part();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBlockRule());
                    					}
                    					set(
                    						current,
                    						"constant",
                    						lv_constant_0_0,
                    						"org.xtext.example.mydsl.Pascal.constant_definition_part");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPascal.g:330:3: ( (lv_type_1_0= ruletype_definition_part ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==53) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPascal.g:331:4: (lv_type_1_0= ruletype_definition_part )
                    {
                    // InternalPascal.g:331:4: (lv_type_1_0= ruletype_definition_part )
                    // InternalPascal.g:332:5: lv_type_1_0= ruletype_definition_part
                    {

                    					newCompositeNode(grammarAccess.getBlockAccess().getTypeType_definition_partParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_type_1_0=ruletype_definition_part();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBlockRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_1_0,
                    						"org.xtext.example.mydsl.Pascal.type_definition_part");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPascal.g:349:3: ( (lv_variable_2_0= rulevariable_declaration_part ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==59) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPascal.g:350:4: (lv_variable_2_0= rulevariable_declaration_part )
                    {
                    // InternalPascal.g:350:4: (lv_variable_2_0= rulevariable_declaration_part )
                    // InternalPascal.g:351:5: lv_variable_2_0= rulevariable_declaration_part
                    {

                    					newCompositeNode(grammarAccess.getBlockAccess().getVariableVariable_declaration_partParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_variable_2_0=rulevariable_declaration_part();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBlockRule());
                    					}
                    					set(
                    						current,
                    						"variable",
                    						lv_variable_2_0,
                    						"org.xtext.example.mydsl.Pascal.variable_declaration_part");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPascal.g:368:3: ( (lv_abstraction_3_0= ruleprocedure_and_function_declaration_part ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=61 && LA6_0<=62)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPascal.g:369:4: (lv_abstraction_3_0= ruleprocedure_and_function_declaration_part )
                    {
                    // InternalPascal.g:369:4: (lv_abstraction_3_0= ruleprocedure_and_function_declaration_part )
                    // InternalPascal.g:370:5: lv_abstraction_3_0= ruleprocedure_and_function_declaration_part
                    {

                    					newCompositeNode(grammarAccess.getBlockAccess().getAbstractionProcedure_and_function_declaration_partParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_abstraction_3_0=ruleprocedure_and_function_declaration_part();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBlockRule());
                    					}
                    					set(
                    						current,
                    						"abstraction",
                    						lv_abstraction_3_0,
                    						"org.xtext.example.mydsl.Pascal.procedure_and_function_declaration_part");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPascal.g:387:3: ( (lv_statement_4_0= rulestatement_part ) )
            // InternalPascal.g:388:4: (lv_statement_4_0= rulestatement_part )
            {
            // InternalPascal.g:388:4: (lv_statement_4_0= rulestatement_part )
            // InternalPascal.g:389:5: lv_statement_4_0= rulestatement_part
            {

            					newCompositeNode(grammarAccess.getBlockAccess().getStatementStatement_partParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_statement_4_0=rulestatement_part();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlockRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_4_0,
            						"org.xtext.example.mydsl.Pascal.statement_part");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleblock"


    // $ANTLR start "entryRulestatement_part"
    // InternalPascal.g:410:1: entryRulestatement_part returns [EObject current=null] : iv_rulestatement_part= rulestatement_part EOF ;
    public final EObject entryRulestatement_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement_part = null;


        try {
            // InternalPascal.g:410:55: (iv_rulestatement_part= rulestatement_part EOF )
            // InternalPascal.g:411:2: iv_rulestatement_part= rulestatement_part EOF
            {
             newCompositeNode(grammarAccess.getStatement_partRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestatement_part=rulestatement_part();

            state._fsp--;

             current =iv_rulestatement_part; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestatement_part"


    // $ANTLR start "rulestatement_part"
    // InternalPascal.g:417:1: rulestatement_part returns [EObject current=null] : (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) ;
    public final EObject rulestatement_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sequence_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:423:2: ( (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) )
            // InternalPascal.g:424:2: (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            {
            // InternalPascal.g:424:2: (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            // InternalPascal.g:425:3: otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getStatement_partAccess().getBeginKeyword_0());
            		
            // InternalPascal.g:429:3: ( (lv_sequence_1_0= rulestatement_sequence ) )
            // InternalPascal.g:430:4: (lv_sequence_1_0= rulestatement_sequence )
            {
            // InternalPascal.g:430:4: (lv_sequence_1_0= rulestatement_sequence )
            // InternalPascal.g:431:5: lv_sequence_1_0= rulestatement_sequence
            {

            					newCompositeNode(grammarAccess.getStatement_partAccess().getSequenceStatement_sequenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_sequence_1_0=rulestatement_sequence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatement_partRule());
            					}
            					set(
            						current,
            						"sequence",
            						lv_sequence_1_0,
            						"org.xtext.example.mydsl.Pascal.statement_sequence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getStatement_partAccess().getEndKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestatement_part"


    // $ANTLR start "entryRulestatement_sequence"
    // InternalPascal.g:456:1: entryRulestatement_sequence returns [EObject current=null] : iv_rulestatement_sequence= rulestatement_sequence EOF ;
    public final EObject entryRulestatement_sequence() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement_sequence = null;


        try {
            // InternalPascal.g:456:59: (iv_rulestatement_sequence= rulestatement_sequence EOF )
            // InternalPascal.g:457:2: iv_rulestatement_sequence= rulestatement_sequence EOF
            {
             newCompositeNode(grammarAccess.getStatement_sequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestatement_sequence=rulestatement_sequence();

            state._fsp--;

             current =iv_rulestatement_sequence; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestatement_sequence"


    // $ANTLR start "rulestatement_sequence"
    // InternalPascal.g:463:1: rulestatement_sequence returns [EObject current=null] : ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* ) ;
    public final EObject rulestatement_sequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_statements_0_0 = null;

        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:469:2: ( ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* ) )
            // InternalPascal.g:470:2: ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* )
            {
            // InternalPascal.g:470:2: ( ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )* )
            // InternalPascal.g:471:3: ( (lv_statements_0_0= rulestatement ) ) (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )*
            {
            // InternalPascal.g:471:3: ( (lv_statements_0_0= rulestatement ) )
            // InternalPascal.g:472:4: (lv_statements_0_0= rulestatement )
            {
            // InternalPascal.g:472:4: (lv_statements_0_0= rulestatement )
            // InternalPascal.g:473:5: lv_statements_0_0= rulestatement
            {

            					newCompositeNode(grammarAccess.getStatement_sequenceAccess().getStatementsStatementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_statements_0_0=rulestatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatement_sequenceRule());
            					}
            					add(
            						current,
            						"statements",
            						lv_statements_0_0,
            						"org.xtext.example.mydsl.Pascal.statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:490:3: (otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPascal.g:491:4: otherlv_1= ';' ( (lv_statements_2_0= rulestatement ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_10); 

            	    				newLeafNode(otherlv_1, grammarAccess.getStatement_sequenceAccess().getSemicolonKeyword_1_0());
            	    			
            	    // InternalPascal.g:495:4: ( (lv_statements_2_0= rulestatement ) )
            	    // InternalPascal.g:496:5: (lv_statements_2_0= rulestatement )
            	    {
            	    // InternalPascal.g:496:5: (lv_statements_2_0= rulestatement )
            	    // InternalPascal.g:497:6: lv_statements_2_0= rulestatement
            	    {

            	    						newCompositeNode(grammarAccess.getStatement_sequenceAccess().getStatementsStatementParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_statements_2_0=rulestatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStatement_sequenceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"statements",
            	    							lv_statements_2_0,
            	    							"org.xtext.example.mydsl.Pascal.statement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestatement_sequence"


    // $ANTLR start "entryRulestatement"
    // InternalPascal.g:519:1: entryRulestatement returns [EObject current=null] : iv_rulestatement= rulestatement EOF ;
    public final EObject entryRulestatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement = null;


        try {
            // InternalPascal.g:519:50: (iv_rulestatement= rulestatement EOF )
            // InternalPascal.g:520:2: iv_rulestatement= rulestatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestatement=rulestatement();

            state._fsp--;

             current =iv_rulestatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestatement"


    // $ANTLR start "rulestatement"
    // InternalPascal.g:526:1: rulestatement returns [EObject current=null] : ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) ) ) ;
    public final EObject rulestatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_label_0_0 = null;

        EObject lv_simple_2_0 = null;

        EObject lv_structured_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:532:2: ( ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) ) ) )
            // InternalPascal.g:533:2: ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) ) )
            {
            // InternalPascal.g:533:2: ( ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) ) )
            // InternalPascal.g:534:3: ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )? ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) )
            {
            // InternalPascal.g:534:3: ( ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_SIGNED_INTEGER_NUMBER && LA8_0<=RULE_INTEGER_NUMBER)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPascal.g:535:4: ( (lv_label_0_0= rulelabel ) ) otherlv_1= ':'
                    {
                    // InternalPascal.g:535:4: ( (lv_label_0_0= rulelabel ) )
                    // InternalPascal.g:536:5: (lv_label_0_0= rulelabel )
                    {
                    // InternalPascal.g:536:5: (lv_label_0_0= rulelabel )
                    // InternalPascal.g:537:6: lv_label_0_0= rulelabel
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getLabelLabelParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_label_0_0=rulelabel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"label",
                    							lv_label_0_0,
                    							"org.xtext.example.mydsl.Pascal.label");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,30,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getColonKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalPascal.g:559:3: ( ( (lv_simple_2_0= rulesimple_statement ) ) | ( (lv_structured_3_0= rulestructured_statement ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==EOF||LA9_0==RULE_ID||LA9_0==26||LA9_0==29||LA9_0==51) ) {
                alt9=1;
            }
            else if ( (LA9_0==28||LA9_0==45||LA9_0==49) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalPascal.g:560:4: ( (lv_simple_2_0= rulesimple_statement ) )
                    {
                    // InternalPascal.g:560:4: ( (lv_simple_2_0= rulesimple_statement ) )
                    // InternalPascal.g:561:5: (lv_simple_2_0= rulesimple_statement )
                    {
                    // InternalPascal.g:561:5: (lv_simple_2_0= rulesimple_statement )
                    // InternalPascal.g:562:6: lv_simple_2_0= rulesimple_statement
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getSimpleSimple_statementParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_simple_2_0=rulesimple_statement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"simple",
                    							lv_simple_2_0,
                    							"org.xtext.example.mydsl.Pascal.simple_statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:580:4: ( (lv_structured_3_0= rulestructured_statement ) )
                    {
                    // InternalPascal.g:580:4: ( (lv_structured_3_0= rulestructured_statement ) )
                    // InternalPascal.g:581:5: (lv_structured_3_0= rulestructured_statement )
                    {
                    // InternalPascal.g:581:5: (lv_structured_3_0= rulestructured_statement )
                    // InternalPascal.g:582:6: lv_structured_3_0= rulestructured_statement
                    {

                    						newCompositeNode(grammarAccess.getStatementAccess().getStructuredStructured_statementParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_structured_3_0=rulestructured_statement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatementRule());
                    						}
                    						set(
                    							current,
                    							"structured",
                    							lv_structured_3_0,
                    							"org.xtext.example.mydsl.Pascal.structured_statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestatement"


    // $ANTLR start "entryRulelabel"
    // InternalPascal.g:604:1: entryRulelabel returns [EObject current=null] : iv_rulelabel= rulelabel EOF ;
    public final EObject entryRulelabel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelabel = null;


        try {
            // InternalPascal.g:604:46: (iv_rulelabel= rulelabel EOF )
            // InternalPascal.g:605:2: iv_rulelabel= rulelabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelabel=rulelabel();

            state._fsp--;

             current =iv_rulelabel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelabel"


    // $ANTLR start "rulelabel"
    // InternalPascal.g:611:1: rulelabel returns [EObject current=null] : ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) ) ;
    public final EObject rulelabel() throws RecognitionException {
        EObject current = null;

        Token lv_number_0_0=null;
        Token lv_number_1_0=null;


        	enterRule();

        try {
            // InternalPascal.g:617:2: ( ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) ) )
            // InternalPascal.g:618:2: ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) )
            {
            // InternalPascal.g:618:2: ( ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_number_1_0= RULE_INTEGER_NUMBER ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_INTEGER_NUMBER) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalPascal.g:619:3: ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    {
                    // InternalPascal.g:619:3: ( (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    // InternalPascal.g:620:4: (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    {
                    // InternalPascal.g:620:4: (lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    // InternalPascal.g:621:5: lv_number_0_0= RULE_SIGNED_INTEGER_NUMBER
                    {
                    lv_number_0_0=(Token)match(input,RULE_SIGNED_INTEGER_NUMBER,FOLLOW_2); 

                    					newLeafNode(lv_number_0_0, grammarAccess.getLabelAccess().getNumberSIGNED_INTEGER_NUMBERTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLabelRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"number",
                    						lv_number_0_0,
                    						"org.xtext.example.mydsl.Pascal.SIGNED_INTEGER_NUMBER");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:638:3: ( (lv_number_1_0= RULE_INTEGER_NUMBER ) )
                    {
                    // InternalPascal.g:638:3: ( (lv_number_1_0= RULE_INTEGER_NUMBER ) )
                    // InternalPascal.g:639:4: (lv_number_1_0= RULE_INTEGER_NUMBER )
                    {
                    // InternalPascal.g:639:4: (lv_number_1_0= RULE_INTEGER_NUMBER )
                    // InternalPascal.g:640:5: lv_number_1_0= RULE_INTEGER_NUMBER
                    {
                    lv_number_1_0=(Token)match(input,RULE_INTEGER_NUMBER,FOLLOW_2); 

                    					newLeafNode(lv_number_1_0, grammarAccess.getLabelAccess().getNumberINTEGER_NUMBERTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLabelRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"number",
                    						lv_number_1_0,
                    						"org.xtext.example.mydsl.Pascal.INTEGER_NUMBER");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelabel"


    // $ANTLR start "entryRulesimple_statement"
    // InternalPascal.g:660:1: entryRulesimple_statement returns [EObject current=null] : iv_rulesimple_statement= rulesimple_statement EOF ;
    public final EObject entryRulesimple_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_statement = null;


        try {
            // InternalPascal.g:660:57: (iv_rulesimple_statement= rulesimple_statement EOF )
            // InternalPascal.g:661:2: iv_rulesimple_statement= rulesimple_statement EOF
            {
             newCompositeNode(grammarAccess.getSimple_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesimple_statement=rulesimple_statement();

            state._fsp--;

             current =iv_rulesimple_statement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesimple_statement"


    // $ANTLR start "rulesimple_statement"
    // InternalPascal.g:667:1: rulesimple_statement returns [EObject current=null] : ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_function_noargs_2_0= RULE_ID ) ) )? ;
    public final EObject rulesimple_statement() throws RecognitionException {
        EObject current = null;

        Token lv_function_noargs_2_0=null;
        EObject lv_assignment_0_0 = null;

        EObject lv_function_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:673:2: ( ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_function_noargs_2_0= RULE_ID ) ) )? )
            // InternalPascal.g:674:2: ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_function_noargs_2_0= RULE_ID ) ) )?
            {
            // InternalPascal.g:674:2: ( ( (lv_assignment_0_0= ruleassignment_statement ) ) | ( (lv_function_1_0= rulefunction_designator ) ) | ( (lv_function_noargs_2_0= RULE_ID ) ) )?
            int alt11=4;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                    case 22:
                    case 31:
                    case 32:
                    case 34:
                        {
                        alt11=1;
                        }
                        break;
                    case 24:
                        {
                        alt11=2;
                        }
                        break;
                    case EOF:
                    case 26:
                    case 29:
                    case 51:
                        {
                        alt11=3;
                        }
                        break;
                }

            }
            switch (alt11) {
                case 1 :
                    // InternalPascal.g:675:3: ( (lv_assignment_0_0= ruleassignment_statement ) )
                    {
                    // InternalPascal.g:675:3: ( (lv_assignment_0_0= ruleassignment_statement ) )
                    // InternalPascal.g:676:4: (lv_assignment_0_0= ruleassignment_statement )
                    {
                    // InternalPascal.g:676:4: (lv_assignment_0_0= ruleassignment_statement )
                    // InternalPascal.g:677:5: lv_assignment_0_0= ruleassignment_statement
                    {

                    					newCompositeNode(grammarAccess.getSimple_statementAccess().getAssignmentAssignment_statementParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_assignment_0_0=ruleassignment_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimple_statementRule());
                    					}
                    					set(
                    						current,
                    						"assignment",
                    						lv_assignment_0_0,
                    						"org.xtext.example.mydsl.Pascal.assignment_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:695:3: ( (lv_function_1_0= rulefunction_designator ) )
                    {
                    // InternalPascal.g:695:3: ( (lv_function_1_0= rulefunction_designator ) )
                    // InternalPascal.g:696:4: (lv_function_1_0= rulefunction_designator )
                    {
                    // InternalPascal.g:696:4: (lv_function_1_0= rulefunction_designator )
                    // InternalPascal.g:697:5: lv_function_1_0= rulefunction_designator
                    {

                    					newCompositeNode(grammarAccess.getSimple_statementAccess().getFunctionFunction_designatorParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_function_1_0=rulefunction_designator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimple_statementRule());
                    					}
                    					set(
                    						current,
                    						"function",
                    						lv_function_1_0,
                    						"org.xtext.example.mydsl.Pascal.function_designator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:715:3: ( (lv_function_noargs_2_0= RULE_ID ) )
                    {
                    // InternalPascal.g:715:3: ( (lv_function_noargs_2_0= RULE_ID ) )
                    // InternalPascal.g:716:4: (lv_function_noargs_2_0= RULE_ID )
                    {
                    // InternalPascal.g:716:4: (lv_function_noargs_2_0= RULE_ID )
                    // InternalPascal.g:717:5: lv_function_noargs_2_0= RULE_ID
                    {
                    lv_function_noargs_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_function_noargs_2_0, grammarAccess.getSimple_statementAccess().getFunction_noargsIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimple_statementRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"function_noargs",
                    						lv_function_noargs_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesimple_statement"


    // $ANTLR start "entryRuleassignment_statement"
    // InternalPascal.g:737:1: entryRuleassignment_statement returns [EObject current=null] : iv_ruleassignment_statement= ruleassignment_statement EOF ;
    public final EObject entryRuleassignment_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleassignment_statement = null;


        try {
            // InternalPascal.g:737:61: (iv_ruleassignment_statement= ruleassignment_statement EOF )
            // InternalPascal.g:738:2: iv_ruleassignment_statement= ruleassignment_statement EOF
            {
             newCompositeNode(grammarAccess.getAssignment_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleassignment_statement=ruleassignment_statement();

            state._fsp--;

             current =iv_ruleassignment_statement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleassignment_statement"


    // $ANTLR start "ruleassignment_statement"
    // InternalPascal.g:744:1: ruleassignment_statement returns [EObject current=null] : ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) ) ;
    public final EObject ruleassignment_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:750:2: ( ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) ) )
            // InternalPascal.g:751:2: ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) )
            {
            // InternalPascal.g:751:2: ( ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) ) )
            // InternalPascal.g:752:3: ( (lv_variable_0_0= rulevariable ) ) otherlv_1= ':=' ( (lv_expression_2_0= ruleexpression ) )
            {
            // InternalPascal.g:752:3: ( (lv_variable_0_0= rulevariable ) )
            // InternalPascal.g:753:4: (lv_variable_0_0= rulevariable )
            {
            // InternalPascal.g:753:4: (lv_variable_0_0= rulevariable )
            // InternalPascal.g:754:5: lv_variable_0_0= rulevariable
            {

            					newCompositeNode(grammarAccess.getAssignment_statementAccess().getVariableVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_variable_0_0=rulevariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignment_statementRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_0_0,
            						"org.xtext.example.mydsl.Pascal.variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignment_statementAccess().getColonEqualsSignKeyword_1());
            		
            // InternalPascal.g:775:3: ( (lv_expression_2_0= ruleexpression ) )
            // InternalPascal.g:776:4: (lv_expression_2_0= ruleexpression )
            {
            // InternalPascal.g:776:4: (lv_expression_2_0= ruleexpression )
            // InternalPascal.g:777:5: lv_expression_2_0= ruleexpression
            {

            					newCompositeNode(grammarAccess.getAssignment_statementAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleexpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignment_statementRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"org.xtext.example.mydsl.Pascal.expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleassignment_statement"


    // $ANTLR start "entryRulevariable"
    // InternalPascal.g:798:1: entryRulevariable returns [EObject current=null] : iv_rulevariable= rulevariable EOF ;
    public final EObject entryRulevariable() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable = null;


        try {
            // InternalPascal.g:798:49: (iv_rulevariable= rulevariable EOF )
            // InternalPascal.g:799:2: iv_rulevariable= rulevariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariable=rulevariable();

            state._fsp--;

             current =iv_rulevariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariable"


    // $ANTLR start "rulevariable"
    // InternalPascal.g:805:1: rulevariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) ) ) ;
    public final EObject rulevariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_variable_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:811:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) ) ) )
            // InternalPascal.g:812:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) ) )
            {
            // InternalPascal.g:812:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) ) )
            // InternalPascal.g:813:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_variable_1_0= rulevar_ ) )
            {
            // InternalPascal.g:813:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascal.g:814:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPascal.g:814:4: (lv_name_0_0= RULE_ID )
            // InternalPascal.g:815:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPascal.g:831:3: ( (lv_variable_1_0= rulevar_ ) )
            // InternalPascal.g:832:4: (lv_variable_1_0= rulevar_ )
            {
            // InternalPascal.g:832:4: (lv_variable_1_0= rulevar_ )
            // InternalPascal.g:833:5: lv_variable_1_0= rulevar_
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getVariableVar_ParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_variable_1_0=rulevar_();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_1_0,
            						"org.xtext.example.mydsl.Pascal.var_");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariable"


    // $ANTLR start "entryRulevar_"
    // InternalPascal.g:854:1: entryRulevar_ returns [EObject current=null] : iv_rulevar_= rulevar_ EOF ;
    public final EObject entryRulevar_() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevar_ = null;


        try {
            // InternalPascal.g:854:45: (iv_rulevar_= rulevar_ EOF )
            // InternalPascal.g:855:2: iv_rulevar_= rulevar_ EOF
            {
             newCompositeNode(grammarAccess.getVar_Rule()); 
            pushFollow(FOLLOW_1);
            iv_rulevar_=rulevar_();

            state._fsp--;

             current =iv_rulevar_; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevar_"


    // $ANTLR start "rulevar_"
    // InternalPascal.g:861:1: rulevar_ returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) ) ) | ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) ) | (otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) ) ) )? ;
    public final EObject rulevar_() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_accessor_4_0=null;
        Token lv_name_5_0=null;
        Token otherlv_7=null;
        EObject lv_expressions_1_0 = null;

        EObject lv_array_3_0 = null;

        EObject lv_variable_6_0 = null;

        EObject lv_pointer_8_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:867:2: ( ( (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) ) ) | ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) ) | (otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) ) ) )? )
            // InternalPascal.g:868:2: ( (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) ) ) | ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) ) | (otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) ) ) )?
            {
            // InternalPascal.g:868:2: ( (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) ) ) | ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) ) | (otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) ) ) )?
            int alt12=4;
            switch ( input.LA(1) ) {
                case 32:
                    {
                    alt12=1;
                    }
                    break;
                case 22:
                    {
                    alt12=2;
                    }
                    break;
                case 34:
                    {
                    alt12=3;
                    }
                    break;
            }

            switch (alt12) {
                case 1 :
                    // InternalPascal.g:869:3: (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) ) )
                    {
                    // InternalPascal.g:869:3: (otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) ) )
                    // InternalPascal.g:870:4: otherlv_0= '[' ( (lv_expressions_1_0= ruleexpression_list ) ) otherlv_2= ']' ( (lv_array_3_0= rulevar_ ) )
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_15); 

                    				newLeafNode(otherlv_0, grammarAccess.getVar_Access().getLeftSquareBracketKeyword_0_0());
                    			
                    // InternalPascal.g:874:4: ( (lv_expressions_1_0= ruleexpression_list ) )
                    // InternalPascal.g:875:5: (lv_expressions_1_0= ruleexpression_list )
                    {
                    // InternalPascal.g:875:5: (lv_expressions_1_0= ruleexpression_list )
                    // InternalPascal.g:876:6: lv_expressions_1_0= ruleexpression_list
                    {

                    						newCompositeNode(grammarAccess.getVar_Access().getExpressionsExpression_listParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_expressions_1_0=ruleexpression_list();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVar_Rule());
                    						}
                    						set(
                    							current,
                    							"expressions",
                    							lv_expressions_1_0,
                    							"org.xtext.example.mydsl.Pascal.expression_list");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,33,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getVar_Access().getRightSquareBracketKeyword_0_2());
                    			
                    // InternalPascal.g:897:4: ( (lv_array_3_0= rulevar_ ) )
                    // InternalPascal.g:898:5: (lv_array_3_0= rulevar_ )
                    {
                    // InternalPascal.g:898:5: (lv_array_3_0= rulevar_ )
                    // InternalPascal.g:899:6: lv_array_3_0= rulevar_
                    {

                    						newCompositeNode(grammarAccess.getVar_Access().getArrayVar_ParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_array_3_0=rulevar_();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVar_Rule());
                    						}
                    						set(
                    							current,
                    							"array",
                    							lv_array_3_0,
                    							"org.xtext.example.mydsl.Pascal.var_");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:918:3: ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) )
                    {
                    // InternalPascal.g:918:3: ( ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) ) )
                    // InternalPascal.g:919:4: ( (lv_accessor_4_0= '.' ) ) ( (lv_name_5_0= RULE_ID ) ) ( (lv_variable_6_0= rulevar_ ) )
                    {
                    // InternalPascal.g:919:4: ( (lv_accessor_4_0= '.' ) )
                    // InternalPascal.g:920:5: (lv_accessor_4_0= '.' )
                    {
                    // InternalPascal.g:920:5: (lv_accessor_4_0= '.' )
                    // InternalPascal.g:921:6: lv_accessor_4_0= '.'
                    {
                    lv_accessor_4_0=(Token)match(input,22,FOLLOW_5); 

                    						newLeafNode(lv_accessor_4_0, grammarAccess.getVar_Access().getAccessorFullStopKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVar_Rule());
                    						}
                    						setWithLastConsumed(current, "accessor", true, ".");
                    					

                    }


                    }

                    // InternalPascal.g:933:4: ( (lv_name_5_0= RULE_ID ) )
                    // InternalPascal.g:934:5: (lv_name_5_0= RULE_ID )
                    {
                    // InternalPascal.g:934:5: (lv_name_5_0= RULE_ID )
                    // InternalPascal.g:935:6: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(lv_name_5_0, grammarAccess.getVar_Access().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVar_Rule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_5_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalPascal.g:951:4: ( (lv_variable_6_0= rulevar_ ) )
                    // InternalPascal.g:952:5: (lv_variable_6_0= rulevar_ )
                    {
                    // InternalPascal.g:952:5: (lv_variable_6_0= rulevar_ )
                    // InternalPascal.g:953:6: lv_variable_6_0= rulevar_
                    {

                    						newCompositeNode(grammarAccess.getVar_Access().getVariableVar_ParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_variable_6_0=rulevar_();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVar_Rule());
                    						}
                    						set(
                    							current,
                    							"variable",
                    							lv_variable_6_0,
                    							"org.xtext.example.mydsl.Pascal.var_");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:972:3: (otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) ) )
                    {
                    // InternalPascal.g:972:3: (otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) ) )
                    // InternalPascal.g:973:4: otherlv_7= '^' ( (lv_pointer_8_0= rulevar_ ) )
                    {
                    otherlv_7=(Token)match(input,34,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getVar_Access().getCircumflexAccentKeyword_2_0());
                    			
                    // InternalPascal.g:977:4: ( (lv_pointer_8_0= rulevar_ ) )
                    // InternalPascal.g:978:5: (lv_pointer_8_0= rulevar_ )
                    {
                    // InternalPascal.g:978:5: (lv_pointer_8_0= rulevar_ )
                    // InternalPascal.g:979:6: lv_pointer_8_0= rulevar_
                    {

                    						newCompositeNode(grammarAccess.getVar_Access().getPointerVar_ParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_pointer_8_0=rulevar_();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVar_Rule());
                    						}
                    						set(
                    							current,
                    							"pointer",
                    							lv_pointer_8_0,
                    							"org.xtext.example.mydsl.Pascal.var_");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevar_"


    // $ANTLR start "entryRuleexpression_list"
    // InternalPascal.g:1001:1: entryRuleexpression_list returns [EObject current=null] : iv_ruleexpression_list= ruleexpression_list EOF ;
    public final EObject entryRuleexpression_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression_list = null;


        try {
            // InternalPascal.g:1001:56: (iv_ruleexpression_list= ruleexpression_list EOF )
            // InternalPascal.g:1002:2: iv_ruleexpression_list= ruleexpression_list EOF
            {
             newCompositeNode(grammarAccess.getExpression_listRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleexpression_list=ruleexpression_list();

            state._fsp--;

             current =iv_ruleexpression_list; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexpression_list"


    // $ANTLR start "ruleexpression_list"
    // InternalPascal.g:1008:1: ruleexpression_list returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )* ) ;
    public final EObject ruleexpression_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1014:2: ( ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )* ) )
            // InternalPascal.g:1015:2: ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )* )
            {
            // InternalPascal.g:1015:2: ( ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )* )
            // InternalPascal.g:1016:3: ( (lv_expressions_0_0= ruleexpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )*
            {
            // InternalPascal.g:1016:3: ( (lv_expressions_0_0= ruleexpression ) )
            // InternalPascal.g:1017:4: (lv_expressions_0_0= ruleexpression )
            {
            // InternalPascal.g:1017:4: (lv_expressions_0_0= ruleexpression )
            // InternalPascal.g:1018:5: lv_expressions_0_0= ruleexpression
            {

            					newCompositeNode(grammarAccess.getExpression_listAccess().getExpressionsExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_expressions_0_0=ruleexpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpression_listRule());
            					}
            					add(
            						current,
            						"expressions",
            						lv_expressions_0_0,
            						"org.xtext.example.mydsl.Pascal.expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:1035:3: (otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPascal.g:1036:4: otherlv_1= ',' ( (lv_expressions_2_0= ruleexpression ) )
            	    {
            	    otherlv_1=(Token)match(input,27,FOLLOW_15); 

            	    				newLeafNode(otherlv_1, grammarAccess.getExpression_listAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPascal.g:1040:4: ( (lv_expressions_2_0= ruleexpression ) )
            	    // InternalPascal.g:1041:5: (lv_expressions_2_0= ruleexpression )
            	    {
            	    // InternalPascal.g:1041:5: (lv_expressions_2_0= ruleexpression )
            	    // InternalPascal.g:1042:6: lv_expressions_2_0= ruleexpression
            	    {

            	    						newCompositeNode(grammarAccess.getExpression_listAccess().getExpressionsExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_expressions_2_0=ruleexpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpression_listRule());
            	    						}
            	    						add(
            	    							current,
            	    							"expressions",
            	    							lv_expressions_2_0,
            	    							"org.xtext.example.mydsl.Pascal.expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexpression_list"


    // $ANTLR start "entryRuleexpression"
    // InternalPascal.g:1064:1: entryRuleexpression returns [EObject current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final EObject entryRuleexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression = null;


        try {
            // InternalPascal.g:1064:51: (iv_ruleexpression= ruleexpression EOF )
            // InternalPascal.g:1065:2: iv_ruleexpression= ruleexpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleexpression=ruleexpression();

            state._fsp--;

             current =iv_ruleexpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexpression"


    // $ANTLR start "ruleexpression"
    // InternalPascal.g:1071:1: ruleexpression returns [EObject current=null] : ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? ) ;
    public final EObject ruleexpression() throws RecognitionException {
        EObject current = null;

        Token lv_operators_1_0=null;
        Token lv_operators_2_0=null;
        Token lv_operators_3_0=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_4_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1077:2: ( ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? ) )
            // InternalPascal.g:1078:2: ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? )
            {
            // InternalPascal.g:1078:2: ( ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )? )
            // InternalPascal.g:1079:3: ( (lv_expressions_0_0= rulesimple_expression ) ) ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )?
            {
            // InternalPascal.g:1079:3: ( (lv_expressions_0_0= rulesimple_expression ) )
            // InternalPascal.g:1080:4: (lv_expressions_0_0= rulesimple_expression )
            {
            // InternalPascal.g:1080:4: (lv_expressions_0_0= rulesimple_expression )
            // InternalPascal.g:1081:5: lv_expressions_0_0= rulesimple_expression
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getExpressionsSimple_expressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_expressions_0_0=rulesimple_expression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionRule());
            					}
            					add(
            						current,
            						"expressions",
            						lv_expressions_0_0,
            						"org.xtext.example.mydsl.Pascal.simple_expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:1098:3: ( ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_RELATIONAL_OPERATOR||(LA15_0>=35 && LA15_0<=36)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalPascal.g:1099:4: ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) ) ( (lv_expressions_4_0= rulesimple_expression ) )
                    {
                    // InternalPascal.g:1099:4: ( ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) ) | ( (lv_operators_2_0= 'in' ) ) | ( (lv_operators_3_0= '=' ) ) )
                    int alt14=3;
                    switch ( input.LA(1) ) {
                    case RULE_RELATIONAL_OPERATOR:
                        {
                        alt14=1;
                        }
                        break;
                    case 35:
                        {
                        alt14=2;
                        }
                        break;
                    case 36:
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
                            // InternalPascal.g:1100:5: ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) )
                            {
                            // InternalPascal.g:1100:5: ( (lv_operators_1_0= RULE_RELATIONAL_OPERATOR ) )
                            // InternalPascal.g:1101:6: (lv_operators_1_0= RULE_RELATIONAL_OPERATOR )
                            {
                            // InternalPascal.g:1101:6: (lv_operators_1_0= RULE_RELATIONAL_OPERATOR )
                            // InternalPascal.g:1102:7: lv_operators_1_0= RULE_RELATIONAL_OPERATOR
                            {
                            lv_operators_1_0=(Token)match(input,RULE_RELATIONAL_OPERATOR,FOLLOW_15); 

                            							newLeafNode(lv_operators_1_0, grammarAccess.getExpressionAccess().getOperatorsRELATIONAL_OPERATORTerminalRuleCall_1_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getExpressionRule());
                            							}
                            							addWithLastConsumed(
                            								current,
                            								"operators",
                            								lv_operators_1_0,
                            								"org.xtext.example.mydsl.Pascal.RELATIONAL_OPERATOR");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalPascal.g:1119:5: ( (lv_operators_2_0= 'in' ) )
                            {
                            // InternalPascal.g:1119:5: ( (lv_operators_2_0= 'in' ) )
                            // InternalPascal.g:1120:6: (lv_operators_2_0= 'in' )
                            {
                            // InternalPascal.g:1120:6: (lv_operators_2_0= 'in' )
                            // InternalPascal.g:1121:7: lv_operators_2_0= 'in'
                            {
                            lv_operators_2_0=(Token)match(input,35,FOLLOW_15); 

                            							newLeafNode(lv_operators_2_0, grammarAccess.getExpressionAccess().getOperatorsInKeyword_1_0_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getExpressionRule());
                            							}
                            							addWithLastConsumed(current, "operators", lv_operators_2_0, "in");
                            						

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalPascal.g:1134:5: ( (lv_operators_3_0= '=' ) )
                            {
                            // InternalPascal.g:1134:5: ( (lv_operators_3_0= '=' ) )
                            // InternalPascal.g:1135:6: (lv_operators_3_0= '=' )
                            {
                            // InternalPascal.g:1135:6: (lv_operators_3_0= '=' )
                            // InternalPascal.g:1136:7: lv_operators_3_0= '='
                            {
                            lv_operators_3_0=(Token)match(input,36,FOLLOW_15); 

                            							newLeafNode(lv_operators_3_0, grammarAccess.getExpressionAccess().getOperatorsEqualsSignKeyword_1_0_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getExpressionRule());
                            							}
                            							addWithLastConsumed(current, "operators", lv_operators_3_0, "=");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalPascal.g:1149:4: ( (lv_expressions_4_0= rulesimple_expression ) )
                    // InternalPascal.g:1150:5: (lv_expressions_4_0= rulesimple_expression )
                    {
                    // InternalPascal.g:1150:5: (lv_expressions_4_0= rulesimple_expression )
                    // InternalPascal.g:1151:6: lv_expressions_4_0= rulesimple_expression
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getExpressionsSimple_expressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expressions_4_0=rulesimple_expression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						add(
                    							current,
                    							"expressions",
                    							lv_expressions_4_0,
                    							"org.xtext.example.mydsl.Pascal.simple_expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRulesimple_expression"
    // InternalPascal.g:1173:1: entryRulesimple_expression returns [EObject current=null] : iv_rulesimple_expression= rulesimple_expression EOF ;
    public final EObject entryRulesimple_expression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_expression = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalPascal.g:1175:2: (iv_rulesimple_expression= rulesimple_expression EOF )
            // InternalPascal.g:1176:2: iv_rulesimple_expression= rulesimple_expression EOF
            {
             newCompositeNode(grammarAccess.getSimple_expressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesimple_expression=rulesimple_expression();

            state._fsp--;

             current =iv_rulesimple_expression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulesimple_expression"


    // $ANTLR start "rulesimple_expression"
    // InternalPascal.g:1185:1: rulesimple_expression returns [EObject current=null] : ( ( (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )* ) ;
    public final EObject rulesimple_expression() throws RecognitionException {
        EObject current = null;

        Token lv_prefixOperator_0_0=null;
        Token lv_operators_2_0=null;
        Token lv_operators_3_0=null;
        EObject lv_terms_1_0 = null;

        EObject lv_terms_4_0 = null;

        EObject lv_terms_5_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalPascal.g:1192:2: ( ( ( (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )* ) )
            // InternalPascal.g:1193:2: ( ( (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )* )
            {
            // InternalPascal.g:1193:2: ( ( (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )* )
            // InternalPascal.g:1194:3: ( (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR ) )? ( (lv_terms_1_0= ruleterm ) ) ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )*
            {
            // InternalPascal.g:1194:3: ( (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ADDITION_OPERATOR) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPascal.g:1195:4: (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR )
                    {
                    // InternalPascal.g:1195:4: (lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR )
                    // InternalPascal.g:1196:5: lv_prefixOperator_0_0= RULE_ADDITION_OPERATOR
                    {
                    lv_prefixOperator_0_0=(Token)match(input,RULE_ADDITION_OPERATOR,FOLLOW_15); 

                    					newLeafNode(lv_prefixOperator_0_0, grammarAccess.getSimple_expressionAccess().getPrefixOperatorADDITION_OPERATORTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimple_expressionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"prefixOperator",
                    						lv_prefixOperator_0_0,
                    						"org.xtext.example.mydsl.Pascal.ADDITION_OPERATOR");
                    				

                    }


                    }
                    break;

            }

            // InternalPascal.g:1212:3: ( (lv_terms_1_0= ruleterm ) )
            // InternalPascal.g:1213:4: (lv_terms_1_0= ruleterm )
            {
            // InternalPascal.g:1213:4: (lv_terms_1_0= ruleterm )
            // InternalPascal.g:1214:5: lv_terms_1_0= ruleterm
            {

            					newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermsTermParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_terms_1_0=ruleterm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimple_expressionRule());
            					}
            					add(
            						current,
            						"terms",
            						lv_terms_1_0,
            						"org.xtext.example.mydsl.Pascal.term");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:1231:3: ( ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) ) | ( (lv_terms_5_0= ruleunsigned_number ) ) )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ADDITION_OPERATOR||LA18_0==37) ) {
                    alt18=1;
                }
                else if ( (LA18_0==RULE_INTEGER_NUMBER||LA18_0==RULE_REAL_NUMBER) ) {
                    alt18=2;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPascal.g:1232:4: ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) )
            	    {
            	    // InternalPascal.g:1232:4: ( ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) ) )
            	    // InternalPascal.g:1233:5: ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) ) ( (lv_terms_4_0= ruleterm ) )
            	    {
            	    // InternalPascal.g:1233:5: ( ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) ) | ( (lv_operators_3_0= 'or' ) ) )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==RULE_ADDITION_OPERATOR) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==37) ) {
            	        alt17=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalPascal.g:1234:6: ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) )
            	            {
            	            // InternalPascal.g:1234:6: ( (lv_operators_2_0= RULE_ADDITION_OPERATOR ) )
            	            // InternalPascal.g:1235:7: (lv_operators_2_0= RULE_ADDITION_OPERATOR )
            	            {
            	            // InternalPascal.g:1235:7: (lv_operators_2_0= RULE_ADDITION_OPERATOR )
            	            // InternalPascal.g:1236:8: lv_operators_2_0= RULE_ADDITION_OPERATOR
            	            {
            	            lv_operators_2_0=(Token)match(input,RULE_ADDITION_OPERATOR,FOLLOW_15); 

            	            								newLeafNode(lv_operators_2_0, grammarAccess.getSimple_expressionAccess().getOperatorsADDITION_OPERATORTerminalRuleCall_2_0_0_0_0());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getSimple_expressionRule());
            	            								}
            	            								addWithLastConsumed(
            	            									current,
            	            									"operators",
            	            									lv_operators_2_0,
            	            									"org.xtext.example.mydsl.Pascal.ADDITION_OPERATOR");
            	            							

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalPascal.g:1253:6: ( (lv_operators_3_0= 'or' ) )
            	            {
            	            // InternalPascal.g:1253:6: ( (lv_operators_3_0= 'or' ) )
            	            // InternalPascal.g:1254:7: (lv_operators_3_0= 'or' )
            	            {
            	            // InternalPascal.g:1254:7: (lv_operators_3_0= 'or' )
            	            // InternalPascal.g:1255:8: lv_operators_3_0= 'or'
            	            {
            	            lv_operators_3_0=(Token)match(input,37,FOLLOW_15); 

            	            								newLeafNode(lv_operators_3_0, grammarAccess.getSimple_expressionAccess().getOperatorsOrKeyword_2_0_0_1_0());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getSimple_expressionRule());
            	            								}
            	            								addWithLastConsumed(current, "operators", lv_operators_3_0, "or");
            	            							

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalPascal.g:1268:5: ( (lv_terms_4_0= ruleterm ) )
            	    // InternalPascal.g:1269:6: (lv_terms_4_0= ruleterm )
            	    {
            	    // InternalPascal.g:1269:6: (lv_terms_4_0= ruleterm )
            	    // InternalPascal.g:1270:7: lv_terms_4_0= ruleterm
            	    {

            	    							newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermsTermParserRuleCall_2_0_1_0());
            	    						
            	    pushFollow(FOLLOW_19);
            	    lv_terms_4_0=ruleterm();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getSimple_expressionRule());
            	    							}
            	    							add(
            	    								current,
            	    								"terms",
            	    								lv_terms_4_0,
            	    								"org.xtext.example.mydsl.Pascal.term");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPascal.g:1289:4: ( (lv_terms_5_0= ruleunsigned_number ) )
            	    {
            	    // InternalPascal.g:1289:4: ( (lv_terms_5_0= ruleunsigned_number ) )
            	    // InternalPascal.g:1290:5: (lv_terms_5_0= ruleunsigned_number )
            	    {
            	    // InternalPascal.g:1290:5: (lv_terms_5_0= ruleunsigned_number )
            	    // InternalPascal.g:1291:6: lv_terms_5_0= ruleunsigned_number
            	    {

            	    						newCompositeNode(grammarAccess.getSimple_expressionAccess().getTermsUnsigned_numberParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_terms_5_0=ruleunsigned_number();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSimple_expressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"terms",
            	    							lv_terms_5_0,
            	    							"org.xtext.example.mydsl.Pascal.unsigned_number");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulesimple_expression"


    // $ANTLR start "entryRuleterm"
    // InternalPascal.g:1316:1: entryRuleterm returns [EObject current=null] : iv_ruleterm= ruleterm EOF ;
    public final EObject entryRuleterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleterm = null;


        try {
            // InternalPascal.g:1316:45: (iv_ruleterm= ruleterm EOF )
            // InternalPascal.g:1317:2: iv_ruleterm= ruleterm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleterm=ruleterm();

            state._fsp--;

             current =iv_ruleterm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleterm"


    // $ANTLR start "ruleterm"
    // InternalPascal.g:1323:1: ruleterm returns [EObject current=null] : ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* ) ;
    public final EObject ruleterm() throws RecognitionException {
        EObject current = null;

        Token lv_operators_1_0=null;
        Token lv_operators_2_0=null;
        Token lv_operators_3_0=null;
        Token lv_operators_4_0=null;
        EObject lv_factors_0_0 = null;

        EObject lv_factors_5_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1329:2: ( ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* ) )
            // InternalPascal.g:1330:2: ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* )
            {
            // InternalPascal.g:1330:2: ( ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )* )
            // InternalPascal.g:1331:3: ( (lv_factors_0_0= rulefactor ) ) ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )*
            {
            // InternalPascal.g:1331:3: ( (lv_factors_0_0= rulefactor ) )
            // InternalPascal.g:1332:4: (lv_factors_0_0= rulefactor )
            {
            // InternalPascal.g:1332:4: (lv_factors_0_0= rulefactor )
            // InternalPascal.g:1333:5: lv_factors_0_0= rulefactor
            {

            					newCompositeNode(grammarAccess.getTermAccess().getFactorsFactorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_factors_0_0=rulefactor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTermRule());
            					}
            					add(
            						current,
            						"factors",
            						lv_factors_0_0,
            						"org.xtext.example.mydsl.Pascal.factor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:1350:3: ( ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_MULTIPLICATION_OPERATOR||(LA20_0>=38 && LA20_0<=40)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPascal.g:1351:4: ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) ) ( (lv_factors_5_0= rulefactor ) )
            	    {
            	    // InternalPascal.g:1351:4: ( ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) ) | ( (lv_operators_2_0= 'div' ) ) | ( (lv_operators_3_0= 'mod' ) ) | ( (lv_operators_4_0= 'and' ) ) )
            	    int alt19=4;
            	    switch ( input.LA(1) ) {
            	    case RULE_MULTIPLICATION_OPERATOR:
            	        {
            	        alt19=1;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt19=2;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt19=3;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt19=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt19) {
            	        case 1 :
            	            // InternalPascal.g:1352:5: ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) )
            	            {
            	            // InternalPascal.g:1352:5: ( (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR ) )
            	            // InternalPascal.g:1353:6: (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR )
            	            {
            	            // InternalPascal.g:1353:6: (lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR )
            	            // InternalPascal.g:1354:7: lv_operators_1_0= RULE_MULTIPLICATION_OPERATOR
            	            {
            	            lv_operators_1_0=(Token)match(input,RULE_MULTIPLICATION_OPERATOR,FOLLOW_15); 

            	            							newLeafNode(lv_operators_1_0, grammarAccess.getTermAccess().getOperatorsMULTIPLICATION_OPERATORTerminalRuleCall_1_0_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getTermRule());
            	            							}
            	            							addWithLastConsumed(
            	            								current,
            	            								"operators",
            	            								lv_operators_1_0,
            	            								"org.xtext.example.mydsl.Pascal.MULTIPLICATION_OPERATOR");
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalPascal.g:1371:5: ( (lv_operators_2_0= 'div' ) )
            	            {
            	            // InternalPascal.g:1371:5: ( (lv_operators_2_0= 'div' ) )
            	            // InternalPascal.g:1372:6: (lv_operators_2_0= 'div' )
            	            {
            	            // InternalPascal.g:1372:6: (lv_operators_2_0= 'div' )
            	            // InternalPascal.g:1373:7: lv_operators_2_0= 'div'
            	            {
            	            lv_operators_2_0=(Token)match(input,38,FOLLOW_15); 

            	            							newLeafNode(lv_operators_2_0, grammarAccess.getTermAccess().getOperatorsDivKeyword_1_0_1_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getTermRule());
            	            							}
            	            							addWithLastConsumed(current, "operators", lv_operators_2_0, "div");
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalPascal.g:1386:5: ( (lv_operators_3_0= 'mod' ) )
            	            {
            	            // InternalPascal.g:1386:5: ( (lv_operators_3_0= 'mod' ) )
            	            // InternalPascal.g:1387:6: (lv_operators_3_0= 'mod' )
            	            {
            	            // InternalPascal.g:1387:6: (lv_operators_3_0= 'mod' )
            	            // InternalPascal.g:1388:7: lv_operators_3_0= 'mod'
            	            {
            	            lv_operators_3_0=(Token)match(input,39,FOLLOW_15); 

            	            							newLeafNode(lv_operators_3_0, grammarAccess.getTermAccess().getOperatorsModKeyword_1_0_2_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getTermRule());
            	            							}
            	            							addWithLastConsumed(current, "operators", lv_operators_3_0, "mod");
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalPascal.g:1401:5: ( (lv_operators_4_0= 'and' ) )
            	            {
            	            // InternalPascal.g:1401:5: ( (lv_operators_4_0= 'and' ) )
            	            // InternalPascal.g:1402:6: (lv_operators_4_0= 'and' )
            	            {
            	            // InternalPascal.g:1402:6: (lv_operators_4_0= 'and' )
            	            // InternalPascal.g:1403:7: lv_operators_4_0= 'and'
            	            {
            	            lv_operators_4_0=(Token)match(input,40,FOLLOW_15); 

            	            							newLeafNode(lv_operators_4_0, grammarAccess.getTermAccess().getOperatorsAndKeyword_1_0_3_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getTermRule());
            	            							}
            	            							addWithLastConsumed(current, "operators", lv_operators_4_0, "and");
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalPascal.g:1416:4: ( (lv_factors_5_0= rulefactor ) )
            	    // InternalPascal.g:1417:5: (lv_factors_5_0= rulefactor )
            	    {
            	    // InternalPascal.g:1417:5: (lv_factors_5_0= rulefactor )
            	    // InternalPascal.g:1418:6: lv_factors_5_0= rulefactor
            	    {

            	    						newCompositeNode(grammarAccess.getTermAccess().getFactorsFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_factors_5_0=rulefactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTermRule());
            	    						}
            	    						add(
            	    							current,
            	    							"factors",
            	    							lv_factors_5_0,
            	    							"org.xtext.example.mydsl.Pascal.factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleterm"


    // $ANTLR start "entryRulefactor"
    // InternalPascal.g:1440:1: entryRulefactor returns [EObject current=null] : iv_rulefactor= rulefactor EOF ;
    public final EObject entryRulefactor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefactor = null;


        try {
            // InternalPascal.g:1440:47: (iv_rulefactor= rulefactor EOF )
            // InternalPascal.g:1441:2: iv_rulefactor= rulefactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefactor=rulefactor();

            state._fsp--;

             current =iv_rulefactor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefactor"


    // $ANTLR start "rulefactor"
    // InternalPascal.g:1447:1: rulefactor returns [EObject current=null] : ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= 'nil' ) ) | ( (lv_boolean_5_0= 'true' ) ) | ( (lv_boolean_6_0= 'false' ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) ) ) ;
    public final EObject rulefactor() throws RecognitionException {
        EObject current = null;

        Token lv_string_2_0=null;
        Token lv_nil_4_0=null;
        Token lv_boolean_5_0=null;
        Token lv_boolean_6_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_variable_0_0 = null;

        EObject lv_number_1_0 = null;

        EObject lv_set_3_0 = null;

        EObject lv_function_7_0 = null;

        EObject lv_expression_9_0 = null;

        EObject lv_not_12_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1453:2: ( ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= 'nil' ) ) | ( (lv_boolean_5_0= 'true' ) ) | ( (lv_boolean_6_0= 'false' ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) ) ) )
            // InternalPascal.g:1454:2: ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= 'nil' ) ) | ( (lv_boolean_5_0= 'true' ) ) | ( (lv_boolean_6_0= 'false' ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) ) )
            {
            // InternalPascal.g:1454:2: ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= 'nil' ) ) | ( (lv_boolean_5_0= 'true' ) ) | ( (lv_boolean_6_0= 'false' ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) ) )
            int alt21=10;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalPascal.g:1455:3: ( (lv_variable_0_0= rulevariable ) )
                    {
                    // InternalPascal.g:1455:3: ( (lv_variable_0_0= rulevariable ) )
                    // InternalPascal.g:1456:4: (lv_variable_0_0= rulevariable )
                    {
                    // InternalPascal.g:1456:4: (lv_variable_0_0= rulevariable )
                    // InternalPascal.g:1457:5: lv_variable_0_0= rulevariable
                    {

                    					newCompositeNode(grammarAccess.getFactorAccess().getVariableVariableParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_variable_0_0=rulevariable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFactorRule());
                    					}
                    					set(
                    						current,
                    						"variable",
                    						lv_variable_0_0,
                    						"org.xtext.example.mydsl.Pascal.variable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1475:3: ( (lv_number_1_0= rulenumber ) )
                    {
                    // InternalPascal.g:1475:3: ( (lv_number_1_0= rulenumber ) )
                    // InternalPascal.g:1476:4: (lv_number_1_0= rulenumber )
                    {
                    // InternalPascal.g:1476:4: (lv_number_1_0= rulenumber )
                    // InternalPascal.g:1477:5: lv_number_1_0= rulenumber
                    {

                    					newCompositeNode(grammarAccess.getFactorAccess().getNumberNumberParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_number_1_0=rulenumber();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFactorRule());
                    					}
                    					set(
                    						current,
                    						"number",
                    						lv_number_1_0,
                    						"org.xtext.example.mydsl.Pascal.number");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1495:3: ( (lv_string_2_0= RULE_STRING ) )
                    {
                    // InternalPascal.g:1495:3: ( (lv_string_2_0= RULE_STRING ) )
                    // InternalPascal.g:1496:4: (lv_string_2_0= RULE_STRING )
                    {
                    // InternalPascal.g:1496:4: (lv_string_2_0= RULE_STRING )
                    // InternalPascal.g:1497:5: lv_string_2_0= RULE_STRING
                    {
                    lv_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_string_2_0, grammarAccess.getFactorAccess().getStringSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFactorRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"string",
                    						lv_string_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:1514:3: ( (lv_set_3_0= ruleset ) )
                    {
                    // InternalPascal.g:1514:3: ( (lv_set_3_0= ruleset ) )
                    // InternalPascal.g:1515:4: (lv_set_3_0= ruleset )
                    {
                    // InternalPascal.g:1515:4: (lv_set_3_0= ruleset )
                    // InternalPascal.g:1516:5: lv_set_3_0= ruleset
                    {

                    					newCompositeNode(grammarAccess.getFactorAccess().getSetSetParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_set_3_0=ruleset();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFactorRule());
                    					}
                    					set(
                    						current,
                    						"set",
                    						lv_set_3_0,
                    						"org.xtext.example.mydsl.Pascal.set");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalPascal.g:1534:3: ( (lv_nil_4_0= 'nil' ) )
                    {
                    // InternalPascal.g:1534:3: ( (lv_nil_4_0= 'nil' ) )
                    // InternalPascal.g:1535:4: (lv_nil_4_0= 'nil' )
                    {
                    // InternalPascal.g:1535:4: (lv_nil_4_0= 'nil' )
                    // InternalPascal.g:1536:5: lv_nil_4_0= 'nil'
                    {
                    lv_nil_4_0=(Token)match(input,41,FOLLOW_2); 

                    					newLeafNode(lv_nil_4_0, grammarAccess.getFactorAccess().getNilNilKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFactorRule());
                    					}
                    					setWithLastConsumed(current, "nil", true, "nil");
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalPascal.g:1549:3: ( (lv_boolean_5_0= 'true' ) )
                    {
                    // InternalPascal.g:1549:3: ( (lv_boolean_5_0= 'true' ) )
                    // InternalPascal.g:1550:4: (lv_boolean_5_0= 'true' )
                    {
                    // InternalPascal.g:1550:4: (lv_boolean_5_0= 'true' )
                    // InternalPascal.g:1551:5: lv_boolean_5_0= 'true'
                    {
                    lv_boolean_5_0=(Token)match(input,42,FOLLOW_2); 

                    					newLeafNode(lv_boolean_5_0, grammarAccess.getFactorAccess().getBooleanTrueKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFactorRule());
                    					}
                    					setWithLastConsumed(current, "boolean", lv_boolean_5_0, "true");
                    				

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalPascal.g:1564:3: ( (lv_boolean_6_0= 'false' ) )
                    {
                    // InternalPascal.g:1564:3: ( (lv_boolean_6_0= 'false' ) )
                    // InternalPascal.g:1565:4: (lv_boolean_6_0= 'false' )
                    {
                    // InternalPascal.g:1565:4: (lv_boolean_6_0= 'false' )
                    // InternalPascal.g:1566:5: lv_boolean_6_0= 'false'
                    {
                    lv_boolean_6_0=(Token)match(input,43,FOLLOW_2); 

                    					newLeafNode(lv_boolean_6_0, grammarAccess.getFactorAccess().getBooleanFalseKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFactorRule());
                    					}
                    					setWithLastConsumed(current, "boolean", lv_boolean_6_0, "false");
                    				

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalPascal.g:1579:3: ( (lv_function_7_0= rulefunction_designator ) )
                    {
                    // InternalPascal.g:1579:3: ( (lv_function_7_0= rulefunction_designator ) )
                    // InternalPascal.g:1580:4: (lv_function_7_0= rulefunction_designator )
                    {
                    // InternalPascal.g:1580:4: (lv_function_7_0= rulefunction_designator )
                    // InternalPascal.g:1581:5: lv_function_7_0= rulefunction_designator
                    {

                    					newCompositeNode(grammarAccess.getFactorAccess().getFunctionFunction_designatorParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_function_7_0=rulefunction_designator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFactorRule());
                    					}
                    					set(
                    						current,
                    						"function",
                    						lv_function_7_0,
                    						"org.xtext.example.mydsl.Pascal.function_designator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalPascal.g:1599:3: (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' )
                    {
                    // InternalPascal.g:1599:3: (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' )
                    // InternalPascal.g:1600:4: otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')'
                    {
                    otherlv_8=(Token)match(input,24,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_8_0());
                    			
                    // InternalPascal.g:1604:4: ( (lv_expression_9_0= ruleexpression ) )
                    // InternalPascal.g:1605:5: (lv_expression_9_0= ruleexpression )
                    {
                    // InternalPascal.g:1605:5: (lv_expression_9_0= ruleexpression )
                    // InternalPascal.g:1606:6: lv_expression_9_0= ruleexpression
                    {

                    						newCompositeNode(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_expression_9_0=ruleexpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFactorRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_9_0,
                    							"org.xtext.example.mydsl.Pascal.expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getFactorAccess().getRightParenthesisKeyword_8_2());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalPascal.g:1629:3: (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) )
                    {
                    // InternalPascal.g:1629:3: (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) )
                    // InternalPascal.g:1630:4: otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) )
                    {
                    otherlv_11=(Token)match(input,44,FOLLOW_15); 

                    				newLeafNode(otherlv_11, grammarAccess.getFactorAccess().getNotKeyword_9_0());
                    			
                    // InternalPascal.g:1634:4: ( (lv_not_12_0= rulefactor ) )
                    // InternalPascal.g:1635:5: (lv_not_12_0= rulefactor )
                    {
                    // InternalPascal.g:1635:5: (lv_not_12_0= rulefactor )
                    // InternalPascal.g:1636:6: lv_not_12_0= rulefactor
                    {

                    						newCompositeNode(grammarAccess.getFactorAccess().getNotFactorParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_not_12_0=rulefactor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFactorRule());
                    						}
                    						set(
                    							current,
                    							"not",
                    							lv_not_12_0,
                    							"org.xtext.example.mydsl.Pascal.factor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefactor"


    // $ANTLR start "entryRulenumber"
    // InternalPascal.g:1658:1: entryRulenumber returns [EObject current=null] : iv_rulenumber= rulenumber EOF ;
    public final EObject entryRulenumber() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenumber = null;


        try {
            // InternalPascal.g:1658:47: (iv_rulenumber= rulenumber EOF )
            // InternalPascal.g:1659:2: iv_rulenumber= rulenumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_rulenumber=rulenumber();

            state._fsp--;

             current =iv_rulenumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenumber"


    // $ANTLR start "rulenumber"
    // InternalPascal.g:1665:1: rulenumber returns [EObject current=null] : ( (lv_number_0_0= ruleany_number ) ) ;
    public final EObject rulenumber() throws RecognitionException {
        EObject current = null;

        EObject lv_number_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1671:2: ( ( (lv_number_0_0= ruleany_number ) ) )
            // InternalPascal.g:1672:2: ( (lv_number_0_0= ruleany_number ) )
            {
            // InternalPascal.g:1672:2: ( (lv_number_0_0= ruleany_number ) )
            // InternalPascal.g:1673:3: (lv_number_0_0= ruleany_number )
            {
            // InternalPascal.g:1673:3: (lv_number_0_0= ruleany_number )
            // InternalPascal.g:1674:4: lv_number_0_0= ruleany_number
            {

            				newCompositeNode(grammarAccess.getNumberAccess().getNumberAny_numberParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_number_0_0=ruleany_number();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNumberRule());
            				}
            				set(
            					current,
            					"number",
            					lv_number_0_0,
            					"org.xtext.example.mydsl.Pascal.any_number");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenumber"


    // $ANTLR start "entryRuleany_number"
    // InternalPascal.g:1694:1: entryRuleany_number returns [EObject current=null] : iv_ruleany_number= ruleany_number EOF ;
    public final EObject entryRuleany_number() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleany_number = null;


        try {
            // InternalPascal.g:1694:51: (iv_ruleany_number= ruleany_number EOF )
            // InternalPascal.g:1695:2: iv_ruleany_number= ruleany_number EOF
            {
             newCompositeNode(grammarAccess.getAny_numberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleany_number=ruleany_number();

            state._fsp--;

             current =iv_ruleany_number; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleany_number"


    // $ANTLR start "ruleany_number"
    // InternalPascal.g:1701:1: ruleany_number returns [EObject current=null] : (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number ) ;
    public final EObject ruleany_number() throws RecognitionException {
        EObject current = null;

        EObject this_unsigned_number_0 = null;

        EObject this_signed_number_1 = null;



        	enterRule();

        try {
            // InternalPascal.g:1707:2: ( (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number ) )
            // InternalPascal.g:1708:2: (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number )
            {
            // InternalPascal.g:1708:2: (this_unsigned_number_0= ruleunsigned_number | this_signed_number_1= rulesigned_number )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INTEGER_NUMBER||LA22_0==RULE_REAL_NUMBER) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_SIGNED_INTEGER_NUMBER||LA22_0==RULE_SIGNED_REAL_NUMBER) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalPascal.g:1709:3: this_unsigned_number_0= ruleunsigned_number
                    {

                    			newCompositeNode(grammarAccess.getAny_numberAccess().getUnsigned_numberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_unsigned_number_0=ruleunsigned_number();

                    state._fsp--;


                    			current = this_unsigned_number_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPascal.g:1718:3: this_signed_number_1= rulesigned_number
                    {

                    			newCompositeNode(grammarAccess.getAny_numberAccess().getSigned_numberParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_signed_number_1=rulesigned_number();

                    state._fsp--;


                    			current = this_signed_number_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleany_number"


    // $ANTLR start "entryRuleunsigned_number"
    // InternalPascal.g:1730:1: entryRuleunsigned_number returns [EObject current=null] : iv_ruleunsigned_number= ruleunsigned_number EOF ;
    public final EObject entryRuleunsigned_number() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunsigned_number = null;


        try {
            // InternalPascal.g:1730:56: (iv_ruleunsigned_number= ruleunsigned_number EOF )
            // InternalPascal.g:1731:2: iv_ruleunsigned_number= ruleunsigned_number EOF
            {
             newCompositeNode(grammarAccess.getUnsigned_numberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleunsigned_number=ruleunsigned_number();

            state._fsp--;

             current =iv_ruleunsigned_number; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunsigned_number"


    // $ANTLR start "ruleunsigned_number"
    // InternalPascal.g:1737:1: ruleunsigned_number returns [EObject current=null] : ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) ) ;
    public final EObject ruleunsigned_number() throws RecognitionException {
        EObject current = null;

        Token lv_integer_0_0=null;
        Token lv_real_1_0=null;


        	enterRule();

        try {
            // InternalPascal.g:1743:2: ( ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) ) )
            // InternalPascal.g:1744:2: ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) )
            {
            // InternalPascal.g:1744:2: ( ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_REAL_NUMBER ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INTEGER_NUMBER) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_REAL_NUMBER) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalPascal.g:1745:3: ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) )
                    {
                    // InternalPascal.g:1745:3: ( (lv_integer_0_0= RULE_INTEGER_NUMBER ) )
                    // InternalPascal.g:1746:4: (lv_integer_0_0= RULE_INTEGER_NUMBER )
                    {
                    // InternalPascal.g:1746:4: (lv_integer_0_0= RULE_INTEGER_NUMBER )
                    // InternalPascal.g:1747:5: lv_integer_0_0= RULE_INTEGER_NUMBER
                    {
                    lv_integer_0_0=(Token)match(input,RULE_INTEGER_NUMBER,FOLLOW_2); 

                    					newLeafNode(lv_integer_0_0, grammarAccess.getUnsigned_numberAccess().getIntegerINTEGER_NUMBERTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnsigned_numberRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"integer",
                    						lv_integer_0_0,
                    						"org.xtext.example.mydsl.Pascal.INTEGER_NUMBER");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1764:3: ( (lv_real_1_0= RULE_REAL_NUMBER ) )
                    {
                    // InternalPascal.g:1764:3: ( (lv_real_1_0= RULE_REAL_NUMBER ) )
                    // InternalPascal.g:1765:4: (lv_real_1_0= RULE_REAL_NUMBER )
                    {
                    // InternalPascal.g:1765:4: (lv_real_1_0= RULE_REAL_NUMBER )
                    // InternalPascal.g:1766:5: lv_real_1_0= RULE_REAL_NUMBER
                    {
                    lv_real_1_0=(Token)match(input,RULE_REAL_NUMBER,FOLLOW_2); 

                    					newLeafNode(lv_real_1_0, grammarAccess.getUnsigned_numberAccess().getRealREAL_NUMBERTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUnsigned_numberRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"real",
                    						lv_real_1_0,
                    						"org.xtext.example.mydsl.Pascal.REAL_NUMBER");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunsigned_number"


    // $ANTLR start "entryRulesigned_number"
    // InternalPascal.g:1786:1: entryRulesigned_number returns [EObject current=null] : iv_rulesigned_number= rulesigned_number EOF ;
    public final EObject entryRulesigned_number() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesigned_number = null;


        try {
            // InternalPascal.g:1786:54: (iv_rulesigned_number= rulesigned_number EOF )
            // InternalPascal.g:1787:2: iv_rulesigned_number= rulesigned_number EOF
            {
             newCompositeNode(grammarAccess.getSigned_numberRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesigned_number=rulesigned_number();

            state._fsp--;

             current =iv_rulesigned_number; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesigned_number"


    // $ANTLR start "rulesigned_number"
    // InternalPascal.g:1793:1: rulesigned_number returns [EObject current=null] : ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) ) ;
    public final EObject rulesigned_number() throws RecognitionException {
        EObject current = null;

        Token lv_integer_0_0=null;
        Token lv_real_1_0=null;


        	enterRule();

        try {
            // InternalPascal.g:1799:2: ( ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) ) )
            // InternalPascal.g:1800:2: ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) )
            {
            // InternalPascal.g:1800:2: ( ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) ) | ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_SIGNED_REAL_NUMBER) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalPascal.g:1801:3: ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    {
                    // InternalPascal.g:1801:3: ( (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER ) )
                    // InternalPascal.g:1802:4: (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    {
                    // InternalPascal.g:1802:4: (lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER )
                    // InternalPascal.g:1803:5: lv_integer_0_0= RULE_SIGNED_INTEGER_NUMBER
                    {
                    lv_integer_0_0=(Token)match(input,RULE_SIGNED_INTEGER_NUMBER,FOLLOW_2); 

                    					newLeafNode(lv_integer_0_0, grammarAccess.getSigned_numberAccess().getIntegerSIGNED_INTEGER_NUMBERTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSigned_numberRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"integer",
                    						lv_integer_0_0,
                    						"org.xtext.example.mydsl.Pascal.SIGNED_INTEGER_NUMBER");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1820:3: ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) )
                    {
                    // InternalPascal.g:1820:3: ( (lv_real_1_0= RULE_SIGNED_REAL_NUMBER ) )
                    // InternalPascal.g:1821:4: (lv_real_1_0= RULE_SIGNED_REAL_NUMBER )
                    {
                    // InternalPascal.g:1821:4: (lv_real_1_0= RULE_SIGNED_REAL_NUMBER )
                    // InternalPascal.g:1822:5: lv_real_1_0= RULE_SIGNED_REAL_NUMBER
                    {
                    lv_real_1_0=(Token)match(input,RULE_SIGNED_REAL_NUMBER,FOLLOW_2); 

                    					newLeafNode(lv_real_1_0, grammarAccess.getSigned_numberAccess().getRealSIGNED_REAL_NUMBERTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSigned_numberRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"real",
                    						lv_real_1_0,
                    						"org.xtext.example.mydsl.Pascal.SIGNED_REAL_NUMBER");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesigned_number"


    // $ANTLR start "entryRuleset"
    // InternalPascal.g:1842:1: entryRuleset returns [EObject current=null] : iv_ruleset= ruleset EOF ;
    public final EObject entryRuleset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleset = null;


        try {
            // InternalPascal.g:1842:44: (iv_ruleset= ruleset EOF )
            // InternalPascal.g:1843:2: iv_ruleset= ruleset EOF
            {
             newCompositeNode(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleset=ruleset();

            state._fsp--;

             current =iv_ruleset; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleset"


    // $ANTLR start "ruleset"
    // InternalPascal.g:1849:1: ruleset returns [EObject current=null] : ( ( (lv_brackets_0_0= '[' ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= ']' ) ) ) ;
    public final EObject ruleset() throws RecognitionException {
        EObject current = null;

        Token lv_brackets_0_0=null;
        Token lv_brackets_2_0=null;
        EObject lv_expressions_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1855:2: ( ( ( (lv_brackets_0_0= '[' ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= ']' ) ) ) )
            // InternalPascal.g:1856:2: ( ( (lv_brackets_0_0= '[' ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= ']' ) ) )
            {
            // InternalPascal.g:1856:2: ( ( (lv_brackets_0_0= '[' ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= ']' ) ) )
            // InternalPascal.g:1857:3: ( (lv_brackets_0_0= '[' ) ) ( (lv_expressions_1_0= ruleexpression_list ) )? ( (lv_brackets_2_0= ']' ) )
            {
            // InternalPascal.g:1857:3: ( (lv_brackets_0_0= '[' ) )
            // InternalPascal.g:1858:4: (lv_brackets_0_0= '[' )
            {
            // InternalPascal.g:1858:4: (lv_brackets_0_0= '[' )
            // InternalPascal.g:1859:5: lv_brackets_0_0= '['
            {
            lv_brackets_0_0=(Token)match(input,32,FOLLOW_21); 

            					newLeafNode(lv_brackets_0_0, grammarAccess.getSetAccess().getBracketsLeftSquareBracketKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetRule());
            					}
            					addWithLastConsumed(current, "brackets", lv_brackets_0_0, "[");
            				

            }


            }

            // InternalPascal.g:1871:3: ( (lv_expressions_1_0= ruleexpression_list ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_INTEGER_NUMBER)||LA25_0==RULE_ADDITION_OPERATOR||(LA25_0>=RULE_STRING && LA25_0<=RULE_SIGNED_REAL_NUMBER)||LA25_0==24||LA25_0==32||(LA25_0>=41 && LA25_0<=44)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalPascal.g:1872:4: (lv_expressions_1_0= ruleexpression_list )
                    {
                    // InternalPascal.g:1872:4: (lv_expressions_1_0= ruleexpression_list )
                    // InternalPascal.g:1873:5: lv_expressions_1_0= ruleexpression_list
                    {

                    					newCompositeNode(grammarAccess.getSetAccess().getExpressionsExpression_listParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_expressions_1_0=ruleexpression_list();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSetRule());
                    					}
                    					set(
                    						current,
                    						"expressions",
                    						lv_expressions_1_0,
                    						"org.xtext.example.mydsl.Pascal.expression_list");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPascal.g:1890:3: ( (lv_brackets_2_0= ']' ) )
            // InternalPascal.g:1891:4: (lv_brackets_2_0= ']' )
            {
            // InternalPascal.g:1891:4: (lv_brackets_2_0= ']' )
            // InternalPascal.g:1892:5: lv_brackets_2_0= ']'
            {
            lv_brackets_2_0=(Token)match(input,33,FOLLOW_2); 

            					newLeafNode(lv_brackets_2_0, grammarAccess.getSetAccess().getBracketsRightSquareBracketKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetRule());
            					}
            					addWithLastConsumed(current, "brackets", lv_brackets_2_0, "]");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleset"


    // $ANTLR start "entryRulefunction_designator"
    // InternalPascal.g:1908:1: entryRulefunction_designator returns [EObject current=null] : iv_rulefunction_designator= rulefunction_designator EOF ;
    public final EObject entryRulefunction_designator() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_designator = null;


        try {
            // InternalPascal.g:1908:60: (iv_rulefunction_designator= rulefunction_designator EOF )
            // InternalPascal.g:1909:2: iv_rulefunction_designator= rulefunction_designator EOF
            {
             newCompositeNode(grammarAccess.getFunction_designatorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefunction_designator=rulefunction_designator();

            state._fsp--;

             current =iv_rulefunction_designator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefunction_designator"


    // $ANTLR start "rulefunction_designator"
    // InternalPascal.g:1915:1: rulefunction_designator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')' ) ;
    public final EObject rulefunction_designator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1921:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')' ) )
            // InternalPascal.g:1922:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')' )
            {
            // InternalPascal.g:1922:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')' )
            // InternalPascal.g:1923:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expressions_2_0= ruleexpression_list ) )? otherlv_3= ')'
            {
            // InternalPascal.g:1923:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascal.g:1924:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPascal.g:1924:4: (lv_name_0_0= RULE_ID )
            // InternalPascal.g:1925:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFunction_designatorAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunction_designatorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getFunction_designatorAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPascal.g:1945:3: ( (lv_expressions_2_0= ruleexpression_list ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_INTEGER_NUMBER)||LA26_0==RULE_ADDITION_OPERATOR||(LA26_0>=RULE_STRING && LA26_0<=RULE_SIGNED_REAL_NUMBER)||LA26_0==24||LA26_0==32||(LA26_0>=41 && LA26_0<=44)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPascal.g:1946:4: (lv_expressions_2_0= ruleexpression_list )
                    {
                    // InternalPascal.g:1946:4: (lv_expressions_2_0= ruleexpression_list )
                    // InternalPascal.g:1947:5: lv_expressions_2_0= ruleexpression_list
                    {

                    					newCompositeNode(grammarAccess.getFunction_designatorAccess().getExpressionsExpression_listParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_expressions_2_0=ruleexpression_list();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunction_designatorRule());
                    					}
                    					set(
                    						current,
                    						"expressions",
                    						lv_expressions_2_0,
                    						"org.xtext.example.mydsl.Pascal.expression_list");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFunction_designatorAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefunction_designator"


    // $ANTLR start "entryRulestructured_statement"
    // InternalPascal.g:1972:1: entryRulestructured_statement returns [EObject current=null] : iv_rulestructured_statement= rulestructured_statement EOF ;
    public final EObject entryRulestructured_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructured_statement = null;


        try {
            // InternalPascal.g:1972:61: (iv_rulestructured_statement= rulestructured_statement EOF )
            // InternalPascal.g:1973:2: iv_rulestructured_statement= rulestructured_statement EOF
            {
             newCompositeNode(grammarAccess.getStructured_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestructured_statement=rulestructured_statement();

            state._fsp--;

             current =iv_rulestructured_statement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestructured_statement"


    // $ANTLR start "rulestructured_statement"
    // InternalPascal.g:1979:1: rulestructured_statement returns [EObject current=null] : ( ( (lv_compound_0_0= rulecompound_statement ) ) | ( (lv_repetitive_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_2_0= ruleconditional_statement ) ) ) ;
    public final EObject rulestructured_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_compound_0_0 = null;

        EObject lv_repetitive_1_0 = null;

        EObject lv_conditional_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:1985:2: ( ( ( (lv_compound_0_0= rulecompound_statement ) ) | ( (lv_repetitive_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_2_0= ruleconditional_statement ) ) ) )
            // InternalPascal.g:1986:2: ( ( (lv_compound_0_0= rulecompound_statement ) ) | ( (lv_repetitive_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_2_0= ruleconditional_statement ) ) )
            {
            // InternalPascal.g:1986:2: ( ( (lv_compound_0_0= rulecompound_statement ) ) | ( (lv_repetitive_1_0= rulerepetitive_statement ) ) | ( (lv_conditional_2_0= ruleconditional_statement ) ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt27=1;
                }
                break;
            case 45:
                {
                alt27=2;
                }
                break;
            case 49:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalPascal.g:1987:3: ( (lv_compound_0_0= rulecompound_statement ) )
                    {
                    // InternalPascal.g:1987:3: ( (lv_compound_0_0= rulecompound_statement ) )
                    // InternalPascal.g:1988:4: (lv_compound_0_0= rulecompound_statement )
                    {
                    // InternalPascal.g:1988:4: (lv_compound_0_0= rulecompound_statement )
                    // InternalPascal.g:1989:5: lv_compound_0_0= rulecompound_statement
                    {

                    					newCompositeNode(grammarAccess.getStructured_statementAccess().getCompoundCompound_statementParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_compound_0_0=rulecompound_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStructured_statementRule());
                    					}
                    					set(
                    						current,
                    						"compound",
                    						lv_compound_0_0,
                    						"org.xtext.example.mydsl.Pascal.compound_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2007:3: ( (lv_repetitive_1_0= rulerepetitive_statement ) )
                    {
                    // InternalPascal.g:2007:3: ( (lv_repetitive_1_0= rulerepetitive_statement ) )
                    // InternalPascal.g:2008:4: (lv_repetitive_1_0= rulerepetitive_statement )
                    {
                    // InternalPascal.g:2008:4: (lv_repetitive_1_0= rulerepetitive_statement )
                    // InternalPascal.g:2009:5: lv_repetitive_1_0= rulerepetitive_statement
                    {

                    					newCompositeNode(grammarAccess.getStructured_statementAccess().getRepetitiveRepetitive_statementParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_repetitive_1_0=rulerepetitive_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStructured_statementRule());
                    					}
                    					set(
                    						current,
                    						"repetitive",
                    						lv_repetitive_1_0,
                    						"org.xtext.example.mydsl.Pascal.repetitive_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:2027:3: ( (lv_conditional_2_0= ruleconditional_statement ) )
                    {
                    // InternalPascal.g:2027:3: ( (lv_conditional_2_0= ruleconditional_statement ) )
                    // InternalPascal.g:2028:4: (lv_conditional_2_0= ruleconditional_statement )
                    {
                    // InternalPascal.g:2028:4: (lv_conditional_2_0= ruleconditional_statement )
                    // InternalPascal.g:2029:5: lv_conditional_2_0= ruleconditional_statement
                    {

                    					newCompositeNode(grammarAccess.getStructured_statementAccess().getConditionalConditional_statementParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_conditional_2_0=ruleconditional_statement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStructured_statementRule());
                    					}
                    					set(
                    						current,
                    						"conditional",
                    						lv_conditional_2_0,
                    						"org.xtext.example.mydsl.Pascal.conditional_statement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestructured_statement"


    // $ANTLR start "entryRulecompound_statement"
    // InternalPascal.g:2050:1: entryRulecompound_statement returns [EObject current=null] : iv_rulecompound_statement= rulecompound_statement EOF ;
    public final EObject entryRulecompound_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecompound_statement = null;


        try {
            // InternalPascal.g:2050:59: (iv_rulecompound_statement= rulecompound_statement EOF )
            // InternalPascal.g:2051:2: iv_rulecompound_statement= rulecompound_statement EOF
            {
             newCompositeNode(grammarAccess.getCompound_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecompound_statement=rulecompound_statement();

            state._fsp--;

             current =iv_rulecompound_statement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecompound_statement"


    // $ANTLR start "rulecompound_statement"
    // InternalPascal.g:2057:1: rulecompound_statement returns [EObject current=null] : (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) ;
    public final EObject rulecompound_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sequence_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2063:2: ( (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' ) )
            // InternalPascal.g:2064:2: (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            {
            // InternalPascal.g:2064:2: (otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end' )
            // InternalPascal.g:2065:3: otherlv_0= 'begin' ( (lv_sequence_1_0= rulestatement_sequence ) ) otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getCompound_statementAccess().getBeginKeyword_0());
            		
            // InternalPascal.g:2069:3: ( (lv_sequence_1_0= rulestatement_sequence ) )
            // InternalPascal.g:2070:4: (lv_sequence_1_0= rulestatement_sequence )
            {
            // InternalPascal.g:2070:4: (lv_sequence_1_0= rulestatement_sequence )
            // InternalPascal.g:2071:5: lv_sequence_1_0= rulestatement_sequence
            {

            					newCompositeNode(grammarAccess.getCompound_statementAccess().getSequenceStatement_sequenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_sequence_1_0=rulestatement_sequence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompound_statementRule());
            					}
            					set(
            						current,
            						"sequence",
            						lv_sequence_1_0,
            						"org.xtext.example.mydsl.Pascal.statement_sequence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getCompound_statementAccess().getEndKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecompound_statement"


    // $ANTLR start "entryRulerepetitive_statement"
    // InternalPascal.g:2096:1: entryRulerepetitive_statement returns [EObject current=null] : iv_rulerepetitive_statement= rulerepetitive_statement EOF ;
    public final EObject entryRulerepetitive_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerepetitive_statement = null;


        try {
            // InternalPascal.g:2096:61: (iv_rulerepetitive_statement= rulerepetitive_statement EOF )
            // InternalPascal.g:2097:2: iv_rulerepetitive_statement= rulerepetitive_statement EOF
            {
             newCompositeNode(grammarAccess.getRepetitive_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerepetitive_statement=rulerepetitive_statement();

            state._fsp--;

             current =iv_rulerepetitive_statement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerepetitive_statement"


    // $ANTLR start "rulerepetitive_statement"
    // InternalPascal.g:2103:1: rulerepetitive_statement returns [EObject current=null] : ( (lv_forStmt_0_0= rulefor_statement ) ) ;
    public final EObject rulerepetitive_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_forStmt_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2109:2: ( ( (lv_forStmt_0_0= rulefor_statement ) ) )
            // InternalPascal.g:2110:2: ( (lv_forStmt_0_0= rulefor_statement ) )
            {
            // InternalPascal.g:2110:2: ( (lv_forStmt_0_0= rulefor_statement ) )
            // InternalPascal.g:2111:3: (lv_forStmt_0_0= rulefor_statement )
            {
            // InternalPascal.g:2111:3: (lv_forStmt_0_0= rulefor_statement )
            // InternalPascal.g:2112:4: lv_forStmt_0_0= rulefor_statement
            {

            				newCompositeNode(grammarAccess.getRepetitive_statementAccess().getForStmtFor_statementParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_forStmt_0_0=rulefor_statement();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getRepetitive_statementRule());
            				}
            				set(
            					current,
            					"forStmt",
            					lv_forStmt_0_0,
            					"org.xtext.example.mydsl.Pascal.for_statement");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerepetitive_statement"


    // $ANTLR start "entryRulefor_statement"
    // InternalPascal.g:2132:1: entryRulefor_statement returns [EObject current=null] : iv_rulefor_statement= rulefor_statement EOF ;
    public final EObject entryRulefor_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefor_statement = null;


        try {
            // InternalPascal.g:2132:54: (iv_rulefor_statement= rulefor_statement EOF )
            // InternalPascal.g:2133:2: iv_rulefor_statement= rulefor_statement EOF
            {
             newCompositeNode(grammarAccess.getFor_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefor_statement=rulefor_statement();

            state._fsp--;

             current =iv_rulefor_statement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefor_statement"


    // $ANTLR start "rulefor_statement"
    // InternalPascal.g:2139:1: rulefor_statement returns [EObject current=null] : (otherlv_0= 'for' ( (lv_assignment_1_0= ruleassignment_statement ) ) (otherlv_2= 'to' | otherlv_3= 'downto' ) ( (lv_expression_4_0= ruleexpression ) ) otherlv_5= 'do' ( (lv_statement_6_0= rulestatement ) ) ) ;
    public final EObject rulefor_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_assignment_1_0 = null;

        EObject lv_expression_4_0 = null;

        EObject lv_statement_6_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2145:2: ( (otherlv_0= 'for' ( (lv_assignment_1_0= ruleassignment_statement ) ) (otherlv_2= 'to' | otherlv_3= 'downto' ) ( (lv_expression_4_0= ruleexpression ) ) otherlv_5= 'do' ( (lv_statement_6_0= rulestatement ) ) ) )
            // InternalPascal.g:2146:2: (otherlv_0= 'for' ( (lv_assignment_1_0= ruleassignment_statement ) ) (otherlv_2= 'to' | otherlv_3= 'downto' ) ( (lv_expression_4_0= ruleexpression ) ) otherlv_5= 'do' ( (lv_statement_6_0= rulestatement ) ) )
            {
            // InternalPascal.g:2146:2: (otherlv_0= 'for' ( (lv_assignment_1_0= ruleassignment_statement ) ) (otherlv_2= 'to' | otherlv_3= 'downto' ) ( (lv_expression_4_0= ruleexpression ) ) otherlv_5= 'do' ( (lv_statement_6_0= rulestatement ) ) )
            // InternalPascal.g:2147:3: otherlv_0= 'for' ( (lv_assignment_1_0= ruleassignment_statement ) ) (otherlv_2= 'to' | otherlv_3= 'downto' ) ( (lv_expression_4_0= ruleexpression ) ) otherlv_5= 'do' ( (lv_statement_6_0= rulestatement ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFor_statementAccess().getForKeyword_0());
            		
            // InternalPascal.g:2151:3: ( (lv_assignment_1_0= ruleassignment_statement ) )
            // InternalPascal.g:2152:4: (lv_assignment_1_0= ruleassignment_statement )
            {
            // InternalPascal.g:2152:4: (lv_assignment_1_0= ruleassignment_statement )
            // InternalPascal.g:2153:5: lv_assignment_1_0= ruleassignment_statement
            {

            					newCompositeNode(grammarAccess.getFor_statementAccess().getAssignmentAssignment_statementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_assignment_1_0=ruleassignment_statement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFor_statementRule());
            					}
            					set(
            						current,
            						"assignment",
            						lv_assignment_1_0,
            						"org.xtext.example.mydsl.Pascal.assignment_statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:2170:3: (otherlv_2= 'to' | otherlv_3= 'downto' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==46) ) {
                alt28=1;
            }
            else if ( (LA28_0==47) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalPascal.g:2171:4: otherlv_2= 'to'
                    {
                    otherlv_2=(Token)match(input,46,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getFor_statementAccess().getToKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalPascal.g:2176:4: otherlv_3= 'downto'
                    {
                    otherlv_3=(Token)match(input,47,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getFor_statementAccess().getDowntoKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalPascal.g:2181:3: ( (lv_expression_4_0= ruleexpression ) )
            // InternalPascal.g:2182:4: (lv_expression_4_0= ruleexpression )
            {
            // InternalPascal.g:2182:4: (lv_expression_4_0= ruleexpression )
            // InternalPascal.g:2183:5: lv_expression_4_0= ruleexpression
            {

            					newCompositeNode(grammarAccess.getFor_statementAccess().getExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
            lv_expression_4_0=ruleexpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFor_statementRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_4_0,
            						"org.xtext.example.mydsl.Pascal.expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,48,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getFor_statementAccess().getDoKeyword_4());
            		
            // InternalPascal.g:2204:3: ( (lv_statement_6_0= rulestatement ) )
            // InternalPascal.g:2205:4: (lv_statement_6_0= rulestatement )
            {
            // InternalPascal.g:2205:4: (lv_statement_6_0= rulestatement )
            // InternalPascal.g:2206:5: lv_statement_6_0= rulestatement
            {

            					newCompositeNode(grammarAccess.getFor_statementAccess().getStatementStatementParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_statement_6_0=rulestatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFor_statementRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_6_0,
            						"org.xtext.example.mydsl.Pascal.statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefor_statement"


    // $ANTLR start "entryRuleconditional_statement"
    // InternalPascal.g:2227:1: entryRuleconditional_statement returns [EObject current=null] : iv_ruleconditional_statement= ruleconditional_statement EOF ;
    public final EObject entryRuleconditional_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconditional_statement = null;


        try {
            // InternalPascal.g:2227:62: (iv_ruleconditional_statement= ruleconditional_statement EOF )
            // InternalPascal.g:2228:2: iv_ruleconditional_statement= ruleconditional_statement EOF
            {
             newCompositeNode(grammarAccess.getConditional_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconditional_statement=ruleconditional_statement();

            state._fsp--;

             current =iv_ruleconditional_statement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconditional_statement"


    // $ANTLR start "ruleconditional_statement"
    // InternalPascal.g:2234:1: ruleconditional_statement returns [EObject current=null] : ( (lv_ifStmt_0_0= ruleif_statement ) ) ;
    public final EObject ruleconditional_statement() throws RecognitionException {
        EObject current = null;

        EObject lv_ifStmt_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2240:2: ( ( (lv_ifStmt_0_0= ruleif_statement ) ) )
            // InternalPascal.g:2241:2: ( (lv_ifStmt_0_0= ruleif_statement ) )
            {
            // InternalPascal.g:2241:2: ( (lv_ifStmt_0_0= ruleif_statement ) )
            // InternalPascal.g:2242:3: (lv_ifStmt_0_0= ruleif_statement )
            {
            // InternalPascal.g:2242:3: (lv_ifStmt_0_0= ruleif_statement )
            // InternalPascal.g:2243:4: lv_ifStmt_0_0= ruleif_statement
            {

            				newCompositeNode(grammarAccess.getConditional_statementAccess().getIfStmtIf_statementParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ifStmt_0_0=ruleif_statement();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getConditional_statementRule());
            				}
            				set(
            					current,
            					"ifStmt",
            					lv_ifStmt_0_0,
            					"org.xtext.example.mydsl.Pascal.if_statement");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconditional_statement"


    // $ANTLR start "entryRuleif_statement"
    // InternalPascal.g:2263:1: entryRuleif_statement returns [EObject current=null] : iv_ruleif_statement= ruleif_statement EOF ;
    public final EObject entryRuleif_statement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleif_statement = null;


        try {
            // InternalPascal.g:2263:53: (iv_ruleif_statement= ruleif_statement EOF )
            // InternalPascal.g:2264:2: iv_ruleif_statement= ruleif_statement EOF
            {
             newCompositeNode(grammarAccess.getIf_statementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleif_statement=ruleif_statement();

            state._fsp--;

             current =iv_ruleif_statement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleif_statement"


    // $ANTLR start "ruleif_statement"
    // InternalPascal.g:2270:1: ruleif_statement returns [EObject current=null] : (otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_ifStatement_3_0= rulestatement ) ) (otherlv_4= 'else' ( (lv_elseStatement_5_0= rulestatement ) ) )? ) ;
    public final EObject ruleif_statement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_1_0 = null;

        EObject lv_ifStatement_3_0 = null;

        EObject lv_elseStatement_5_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2276:2: ( (otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_ifStatement_3_0= rulestatement ) ) (otherlv_4= 'else' ( (lv_elseStatement_5_0= rulestatement ) ) )? ) )
            // InternalPascal.g:2277:2: (otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_ifStatement_3_0= rulestatement ) ) (otherlv_4= 'else' ( (lv_elseStatement_5_0= rulestatement ) ) )? )
            {
            // InternalPascal.g:2277:2: (otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_ifStatement_3_0= rulestatement ) ) (otherlv_4= 'else' ( (lv_elseStatement_5_0= rulestatement ) ) )? )
            // InternalPascal.g:2278:3: otherlv_0= 'if' ( (lv_expression_1_0= ruleexpression ) ) otherlv_2= 'then' ( (lv_ifStatement_3_0= rulestatement ) ) (otherlv_4= 'else' ( (lv_elseStatement_5_0= rulestatement ) ) )?
            {
            otherlv_0=(Token)match(input,49,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getIf_statementAccess().getIfKeyword_0());
            		
            // InternalPascal.g:2282:3: ( (lv_expression_1_0= ruleexpression ) )
            // InternalPascal.g:2283:4: (lv_expression_1_0= ruleexpression )
            {
            // InternalPascal.g:2283:4: (lv_expression_1_0= ruleexpression )
            // InternalPascal.g:2284:5: lv_expression_1_0= ruleexpression
            {

            					newCompositeNode(grammarAccess.getIf_statementAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
            lv_expression_1_0=ruleexpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIf_statementRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.xtext.example.mydsl.Pascal.expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,50,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getIf_statementAccess().getThenKeyword_2());
            		
            // InternalPascal.g:2305:3: ( (lv_ifStatement_3_0= rulestatement ) )
            // InternalPascal.g:2306:4: (lv_ifStatement_3_0= rulestatement )
            {
            // InternalPascal.g:2306:4: (lv_ifStatement_3_0= rulestatement )
            // InternalPascal.g:2307:5: lv_ifStatement_3_0= rulestatement
            {

            					newCompositeNode(grammarAccess.getIf_statementAccess().getIfStatementStatementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_27);
            lv_ifStatement_3_0=rulestatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIf_statementRule());
            					}
            					set(
            						current,
            						"ifStatement",
            						lv_ifStatement_3_0,
            						"org.xtext.example.mydsl.Pascal.statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:2324:3: (otherlv_4= 'else' ( (lv_elseStatement_5_0= rulestatement ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==51) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalPascal.g:2325:4: otherlv_4= 'else' ( (lv_elseStatement_5_0= rulestatement ) )
                    {
                    otherlv_4=(Token)match(input,51,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getIf_statementAccess().getElseKeyword_4_0());
                    			
                    // InternalPascal.g:2329:4: ( (lv_elseStatement_5_0= rulestatement ) )
                    // InternalPascal.g:2330:5: (lv_elseStatement_5_0= rulestatement )
                    {
                    // InternalPascal.g:2330:5: (lv_elseStatement_5_0= rulestatement )
                    // InternalPascal.g:2331:6: lv_elseStatement_5_0= rulestatement
                    {

                    						newCompositeNode(grammarAccess.getIf_statementAccess().getElseStatementStatementParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_elseStatement_5_0=rulestatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIf_statementRule());
                    						}
                    						set(
                    							current,
                    							"elseStatement",
                    							lv_elseStatement_5_0,
                    							"org.xtext.example.mydsl.Pascal.statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleif_statement"


    // $ANTLR start "entryRuleconstant"
    // InternalPascal.g:2353:1: entryRuleconstant returns [EObject current=null] : iv_ruleconstant= ruleconstant EOF ;
    public final EObject entryRuleconstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant = null;


        try {
            // InternalPascal.g:2353:49: (iv_ruleconstant= ruleconstant EOF )
            // InternalPascal.g:2354:2: iv_ruleconstant= ruleconstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconstant=ruleconstant();

            state._fsp--;

             current =iv_ruleconstant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconstant"


    // $ANTLR start "ruleconstant"
    // InternalPascal.g:2360:1: ruleconstant returns [EObject current=null] : ( ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= 'true' ) ) | ( (lv_boolLiteral_5_0= 'false' ) ) | ( (lv_nil_6_0= 'nil' ) ) ) ;
    public final EObject ruleconstant() throws RecognitionException {
        EObject current = null;

        Token lv_opterator_0_0=null;
        Token lv_name_1_0=null;
        Token lv_string_3_0=null;
        Token lv_boolLiteral_4_0=null;
        Token lv_boolLiteral_5_0=null;
        Token lv_nil_6_0=null;
        EObject lv_number_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2366:2: ( ( ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= 'true' ) ) | ( (lv_boolLiteral_5_0= 'false' ) ) | ( (lv_nil_6_0= 'nil' ) ) ) )
            // InternalPascal.g:2367:2: ( ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= 'true' ) ) | ( (lv_boolLiteral_5_0= 'false' ) ) | ( (lv_nil_6_0= 'nil' ) ) )
            {
            // InternalPascal.g:2367:2: ( ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_boolLiteral_4_0= 'true' ) ) | ( (lv_boolLiteral_5_0= 'false' ) ) | ( (lv_nil_6_0= 'nil' ) ) )
            int alt32=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_INTEGER_NUMBER:
            case RULE_ADDITION_OPERATOR:
            case RULE_REAL_NUMBER:
            case RULE_SIGNED_REAL_NUMBER:
                {
                alt32=1;
                }
                break;
            case RULE_STRING:
                {
                alt32=2;
                }
                break;
            case 42:
                {
                alt32=3;
                }
                break;
            case 43:
                {
                alt32=4;
                }
                break;
            case 41:
                {
                alt32=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalPascal.g:2368:3: ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) )
                    {
                    // InternalPascal.g:2368:3: ( ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) ) )
                    // InternalPascal.g:2369:4: ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )? ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) )
                    {
                    // InternalPascal.g:2369:4: ( (lv_opterator_0_0= RULE_ADDITION_OPERATOR ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==RULE_ADDITION_OPERATOR) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalPascal.g:2370:5: (lv_opterator_0_0= RULE_ADDITION_OPERATOR )
                            {
                            // InternalPascal.g:2370:5: (lv_opterator_0_0= RULE_ADDITION_OPERATOR )
                            // InternalPascal.g:2371:6: lv_opterator_0_0= RULE_ADDITION_OPERATOR
                            {
                            lv_opterator_0_0=(Token)match(input,RULE_ADDITION_OPERATOR,FOLLOW_28); 

                            						newLeafNode(lv_opterator_0_0, grammarAccess.getConstantAccess().getOpteratorADDITION_OPERATORTerminalRuleCall_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getConstantRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"opterator",
                            							lv_opterator_0_0,
                            							"org.xtext.example.mydsl.Pascal.ADDITION_OPERATOR");
                            					

                            }


                            }
                            break;

                    }

                    // InternalPascal.g:2387:4: ( ( (lv_name_1_0= RULE_ID ) ) | ( (lv_number_2_0= rulenumber ) ) )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==RULE_ID) ) {
                        alt31=1;
                    }
                    else if ( ((LA31_0>=RULE_SIGNED_INTEGER_NUMBER && LA31_0<=RULE_INTEGER_NUMBER)||(LA31_0>=RULE_REAL_NUMBER && LA31_0<=RULE_SIGNED_REAL_NUMBER)) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalPascal.g:2388:5: ( (lv_name_1_0= RULE_ID ) )
                            {
                            // InternalPascal.g:2388:5: ( (lv_name_1_0= RULE_ID ) )
                            // InternalPascal.g:2389:6: (lv_name_1_0= RULE_ID )
                            {
                            // InternalPascal.g:2389:6: (lv_name_1_0= RULE_ID )
                            // InternalPascal.g:2390:7: lv_name_1_0= RULE_ID
                            {
                            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                            							newLeafNode(lv_name_1_0, grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConstantRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"name",
                            								lv_name_1_0,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalPascal.g:2407:5: ( (lv_number_2_0= rulenumber ) )
                            {
                            // InternalPascal.g:2407:5: ( (lv_number_2_0= rulenumber ) )
                            // InternalPascal.g:2408:6: (lv_number_2_0= rulenumber )
                            {
                            // InternalPascal.g:2408:6: (lv_number_2_0= rulenumber )
                            // InternalPascal.g:2409:7: lv_number_2_0= rulenumber
                            {

                            							newCompositeNode(grammarAccess.getConstantAccess().getNumberNumberParserRuleCall_0_1_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_number_2_0=rulenumber();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getConstantRule());
                            							}
                            							set(
                            								current,
                            								"number",
                            								lv_number_2_0,
                            								"org.xtext.example.mydsl.Pascal.number");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2429:3: ( (lv_string_3_0= RULE_STRING ) )
                    {
                    // InternalPascal.g:2429:3: ( (lv_string_3_0= RULE_STRING ) )
                    // InternalPascal.g:2430:4: (lv_string_3_0= RULE_STRING )
                    {
                    // InternalPascal.g:2430:4: (lv_string_3_0= RULE_STRING )
                    // InternalPascal.g:2431:5: lv_string_3_0= RULE_STRING
                    {
                    lv_string_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_string_3_0, grammarAccess.getConstantAccess().getStringSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstantRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"string",
                    						lv_string_3_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:2448:3: ( (lv_boolLiteral_4_0= 'true' ) )
                    {
                    // InternalPascal.g:2448:3: ( (lv_boolLiteral_4_0= 'true' ) )
                    // InternalPascal.g:2449:4: (lv_boolLiteral_4_0= 'true' )
                    {
                    // InternalPascal.g:2449:4: (lv_boolLiteral_4_0= 'true' )
                    // InternalPascal.g:2450:5: lv_boolLiteral_4_0= 'true'
                    {
                    lv_boolLiteral_4_0=(Token)match(input,42,FOLLOW_2); 

                    					newLeafNode(lv_boolLiteral_4_0, grammarAccess.getConstantAccess().getBoolLiteralTrueKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstantRule());
                    					}
                    					setWithLastConsumed(current, "boolLiteral", lv_boolLiteral_4_0, "true");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:2463:3: ( (lv_boolLiteral_5_0= 'false' ) )
                    {
                    // InternalPascal.g:2463:3: ( (lv_boolLiteral_5_0= 'false' ) )
                    // InternalPascal.g:2464:4: (lv_boolLiteral_5_0= 'false' )
                    {
                    // InternalPascal.g:2464:4: (lv_boolLiteral_5_0= 'false' )
                    // InternalPascal.g:2465:5: lv_boolLiteral_5_0= 'false'
                    {
                    lv_boolLiteral_5_0=(Token)match(input,43,FOLLOW_2); 

                    					newLeafNode(lv_boolLiteral_5_0, grammarAccess.getConstantAccess().getBoolLiteralFalseKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstantRule());
                    					}
                    					setWithLastConsumed(current, "boolLiteral", lv_boolLiteral_5_0, "false");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalPascal.g:2478:3: ( (lv_nil_6_0= 'nil' ) )
                    {
                    // InternalPascal.g:2478:3: ( (lv_nil_6_0= 'nil' ) )
                    // InternalPascal.g:2479:4: (lv_nil_6_0= 'nil' )
                    {
                    // InternalPascal.g:2479:4: (lv_nil_6_0= 'nil' )
                    // InternalPascal.g:2480:5: lv_nil_6_0= 'nil'
                    {
                    lv_nil_6_0=(Token)match(input,41,FOLLOW_2); 

                    					newLeafNode(lv_nil_6_0, grammarAccess.getConstantAccess().getNilNilKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstantRule());
                    					}
                    					setWithLastConsumed(current, "nil", lv_nil_6_0, "nil");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconstant"


    // $ANTLR start "entryRuleconstant_definition_part"
    // InternalPascal.g:2496:1: entryRuleconstant_definition_part returns [EObject current=null] : iv_ruleconstant_definition_part= ruleconstant_definition_part EOF ;
    public final EObject entryRuleconstant_definition_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_definition_part = null;


        try {
            // InternalPascal.g:2496:65: (iv_ruleconstant_definition_part= ruleconstant_definition_part EOF )
            // InternalPascal.g:2497:2: iv_ruleconstant_definition_part= ruleconstant_definition_part EOF
            {
             newCompositeNode(grammarAccess.getConstant_definition_partRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconstant_definition_part=ruleconstant_definition_part();

            state._fsp--;

             current =iv_ruleconstant_definition_part; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconstant_definition_part"


    // $ANTLR start "ruleconstant_definition_part"
    // InternalPascal.g:2503:1: ruleconstant_definition_part returns [EObject current=null] : (otherlv_0= 'const' ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+ ) ;
    public final EObject ruleconstant_definition_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_consts_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2509:2: ( (otherlv_0= 'const' ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+ ) )
            // InternalPascal.g:2510:2: (otherlv_0= 'const' ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+ )
            {
            // InternalPascal.g:2510:2: (otherlv_0= 'const' ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+ )
            // InternalPascal.g:2511:3: otherlv_0= 'const' ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+
            {
            otherlv_0=(Token)match(input,52,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConstant_definition_partAccess().getConstKeyword_0());
            		
            // InternalPascal.g:2515:3: ( ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';' )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalPascal.g:2516:4: ( (lv_consts_1_0= ruleconstant_definition ) ) otherlv_2= ';'
            	    {
            	    // InternalPascal.g:2516:4: ( (lv_consts_1_0= ruleconstant_definition ) )
            	    // InternalPascal.g:2517:5: (lv_consts_1_0= ruleconstant_definition )
            	    {
            	    // InternalPascal.g:2517:5: (lv_consts_1_0= ruleconstant_definition )
            	    // InternalPascal.g:2518:6: lv_consts_1_0= ruleconstant_definition
            	    {

            	    						newCompositeNode(grammarAccess.getConstant_definition_partAccess().getConstsConstant_definitionParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_consts_1_0=ruleconstant_definition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConstant_definition_partRule());
            	    						}
            	    						add(
            	    							current,
            	    							"consts",
            	    							lv_consts_1_0,
            	    							"org.xtext.example.mydsl.Pascal.constant_definition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_29); 

            	    				newLeafNode(otherlv_2, grammarAccess.getConstant_definition_partAccess().getSemicolonKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconstant_definition_part"


    // $ANTLR start "entryRuleconstant_definition"
    // InternalPascal.g:2544:1: entryRuleconstant_definition returns [EObject current=null] : iv_ruleconstant_definition= ruleconstant_definition EOF ;
    public final EObject entryRuleconstant_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant_definition = null;


        try {
            // InternalPascal.g:2544:60: (iv_ruleconstant_definition= ruleconstant_definition EOF )
            // InternalPascal.g:2545:2: iv_ruleconstant_definition= ruleconstant_definition EOF
            {
             newCompositeNode(grammarAccess.getConstant_definitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconstant_definition=ruleconstant_definition();

            state._fsp--;

             current =iv_ruleconstant_definition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconstant_definition"


    // $ANTLR start "ruleconstant_definition"
    // InternalPascal.g:2551:1: ruleconstant_definition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_const_2_0= ruleconstant ) ) ) ;
    public final EObject ruleconstant_definition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_const_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2557:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_const_2_0= ruleconstant ) ) ) )
            // InternalPascal.g:2558:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_const_2_0= ruleconstant ) ) )
            {
            // InternalPascal.g:2558:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_const_2_0= ruleconstant ) ) )
            // InternalPascal.g:2559:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_const_2_0= ruleconstant ) )
            {
            // InternalPascal.g:2559:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascal.g:2560:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPascal.g:2560:4: (lv_name_0_0= RULE_ID )
            // InternalPascal.g:2561:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(lv_name_0_0, grammarAccess.getConstant_definitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstant_definitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getConstant_definitionAccess().getEqualsSignKeyword_1());
            		
            // InternalPascal.g:2581:3: ( (lv_const_2_0= ruleconstant ) )
            // InternalPascal.g:2582:4: (lv_const_2_0= ruleconstant )
            {
            // InternalPascal.g:2582:4: (lv_const_2_0= ruleconstant )
            // InternalPascal.g:2583:5: lv_const_2_0= ruleconstant
            {

            					newCompositeNode(grammarAccess.getConstant_definitionAccess().getConstConstantParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_const_2_0=ruleconstant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstant_definitionRule());
            					}
            					set(
            						current,
            						"const",
            						lv_const_2_0,
            						"org.xtext.example.mydsl.Pascal.constant");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconstant_definition"


    // $ANTLR start "entryRuletype_definition_part"
    // InternalPascal.g:2604:1: entryRuletype_definition_part returns [EObject current=null] : iv_ruletype_definition_part= ruletype_definition_part EOF ;
    public final EObject entryRuletype_definition_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_definition_part = null;


        try {
            // InternalPascal.g:2604:61: (iv_ruletype_definition_part= ruletype_definition_part EOF )
            // InternalPascal.g:2605:2: iv_ruletype_definition_part= ruletype_definition_part EOF
            {
             newCompositeNode(grammarAccess.getType_definition_partRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletype_definition_part=ruletype_definition_part();

            state._fsp--;

             current =iv_ruletype_definition_part; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletype_definition_part"


    // $ANTLR start "ruletype_definition_part"
    // InternalPascal.g:2611:1: ruletype_definition_part returns [EObject current=null] : (otherlv_0= 'type' ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+ ) ;
    public final EObject ruletype_definition_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_types_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2617:2: ( (otherlv_0= 'type' ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+ ) )
            // InternalPascal.g:2618:2: (otherlv_0= 'type' ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+ )
            {
            // InternalPascal.g:2618:2: (otherlv_0= 'type' ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+ )
            // InternalPascal.g:2619:3: otherlv_0= 'type' ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+
            {
            otherlv_0=(Token)match(input,53,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getType_definition_partAccess().getTypeKeyword_0());
            		
            // InternalPascal.g:2623:3: ( ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';' )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalPascal.g:2624:4: ( (lv_types_1_0= ruletype_definition ) ) otherlv_2= ';'
            	    {
            	    // InternalPascal.g:2624:4: ( (lv_types_1_0= ruletype_definition ) )
            	    // InternalPascal.g:2625:5: (lv_types_1_0= ruletype_definition )
            	    {
            	    // InternalPascal.g:2625:5: (lv_types_1_0= ruletype_definition )
            	    // InternalPascal.g:2626:6: lv_types_1_0= ruletype_definition
            	    {

            	    						newCompositeNode(grammarAccess.getType_definition_partAccess().getTypesType_definitionParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_types_1_0=ruletype_definition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getType_definition_partRule());
            	    						}
            	    						add(
            	    							current,
            	    							"types",
            	    							lv_types_1_0,
            	    							"org.xtext.example.mydsl.Pascal.type_definition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_29); 

            	    				newLeafNode(otherlv_2, grammarAccess.getType_definition_partAccess().getSemicolonKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletype_definition_part"


    // $ANTLR start "entryRuletype_definition"
    // InternalPascal.g:2652:1: entryRuletype_definition returns [EObject current=null] : iv_ruletype_definition= ruletype_definition EOF ;
    public final EObject entryRuletype_definition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype_definition = null;


        try {
            // InternalPascal.g:2652:56: (iv_ruletype_definition= ruletype_definition EOF )
            // InternalPascal.g:2653:2: iv_ruletype_definition= ruletype_definition EOF
            {
             newCompositeNode(grammarAccess.getType_definitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletype_definition=ruletype_definition();

            state._fsp--;

             current =iv_ruletype_definition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletype_definition"


    // $ANTLR start "ruletype_definition"
    // InternalPascal.g:2659:1: ruletype_definition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject ruletype_definition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2665:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalPascal.g:2666:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalPascal.g:2666:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) ) )
            // InternalPascal.g:2667:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_type_2_0= ruletype ) )
            {
            // InternalPascal.g:2667:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalPascal.g:2668:4: (lv_name_0_0= RULE_ID )
            {
            // InternalPascal.g:2668:4: (lv_name_0_0= RULE_ID )
            // InternalPascal.g:2669:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(lv_name_0_0, grammarAccess.getType_definitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getType_definitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getType_definitionAccess().getEqualsSignKeyword_1());
            		
            // InternalPascal.g:2689:3: ( (lv_type_2_0= ruletype ) )
            // InternalPascal.g:2690:4: (lv_type_2_0= ruletype )
            {
            // InternalPascal.g:2690:4: (lv_type_2_0= ruletype )
            // InternalPascal.g:2691:5: lv_type_2_0= ruletype
            {

            					newCompositeNode(grammarAccess.getType_definitionAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruletype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getType_definitionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.example.mydsl.Pascal.type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletype_definition"


    // $ANTLR start "entryRuletype"
    // InternalPascal.g:2712:1: entryRuletype returns [EObject current=null] : iv_ruletype= ruletype EOF ;
    public final EObject entryRuletype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype = null;


        try {
            // InternalPascal.g:2712:45: (iv_ruletype= ruletype EOF )
            // InternalPascal.g:2713:2: iv_ruletype= ruletype EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletype=ruletype();

            state._fsp--;

             current =iv_ruletype; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletype"


    // $ANTLR start "ruletype"
    // InternalPascal.g:2719:1: ruletype returns [EObject current=null] : ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestructured_type ) ) | ( (lv_pointer_2_0= rulepointer_type ) ) ) ;
    public final EObject ruletype() throws RecognitionException {
        EObject current = null;

        EObject lv_simple_0_0 = null;

        EObject lv_structured_1_0 = null;

        EObject lv_pointer_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2725:2: ( ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestructured_type ) ) | ( (lv_pointer_2_0= rulepointer_type ) ) ) )
            // InternalPascal.g:2726:2: ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestructured_type ) ) | ( (lv_pointer_2_0= rulepointer_type ) ) )
            {
            // InternalPascal.g:2726:2: ( ( (lv_simple_0_0= rulesimple_type ) ) | ( (lv_structured_1_0= rulestructured_type ) ) | ( (lv_pointer_2_0= rulepointer_type ) ) )
            int alt35=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_INTEGER_NUMBER:
            case RULE_ADDITION_OPERATOR:
            case RULE_STRING:
            case RULE_REAL_NUMBER:
            case RULE_SIGNED_REAL_NUMBER:
            case RULE_NUMERIC_SUBRANGE:
            case 24:
            case 41:
            case 42:
            case 43:
                {
                alt35=1;
                }
                break;
            case 55:
            case 56:
            case 58:
                {
                alt35=2;
                }
                break;
            case 34:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalPascal.g:2727:3: ( (lv_simple_0_0= rulesimple_type ) )
                    {
                    // InternalPascal.g:2727:3: ( (lv_simple_0_0= rulesimple_type ) )
                    // InternalPascal.g:2728:4: (lv_simple_0_0= rulesimple_type )
                    {
                    // InternalPascal.g:2728:4: (lv_simple_0_0= rulesimple_type )
                    // InternalPascal.g:2729:5: lv_simple_0_0= rulesimple_type
                    {

                    					newCompositeNode(grammarAccess.getTypeAccess().getSimpleSimple_typeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_simple_0_0=rulesimple_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeRule());
                    					}
                    					set(
                    						current,
                    						"simple",
                    						lv_simple_0_0,
                    						"org.xtext.example.mydsl.Pascal.simple_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2747:3: ( (lv_structured_1_0= rulestructured_type ) )
                    {
                    // InternalPascal.g:2747:3: ( (lv_structured_1_0= rulestructured_type ) )
                    // InternalPascal.g:2748:4: (lv_structured_1_0= rulestructured_type )
                    {
                    // InternalPascal.g:2748:4: (lv_structured_1_0= rulestructured_type )
                    // InternalPascal.g:2749:5: lv_structured_1_0= rulestructured_type
                    {

                    					newCompositeNode(grammarAccess.getTypeAccess().getStructuredStructured_typeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_structured_1_0=rulestructured_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeRule());
                    					}
                    					set(
                    						current,
                    						"structured",
                    						lv_structured_1_0,
                    						"org.xtext.example.mydsl.Pascal.structured_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:2767:3: ( (lv_pointer_2_0= rulepointer_type ) )
                    {
                    // InternalPascal.g:2767:3: ( (lv_pointer_2_0= rulepointer_type ) )
                    // InternalPascal.g:2768:4: (lv_pointer_2_0= rulepointer_type )
                    {
                    // InternalPascal.g:2768:4: (lv_pointer_2_0= rulepointer_type )
                    // InternalPascal.g:2769:5: lv_pointer_2_0= rulepointer_type
                    {

                    					newCompositeNode(grammarAccess.getTypeAccess().getPointerPointer_typeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_pointer_2_0=rulepointer_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeRule());
                    					}
                    					set(
                    						current,
                    						"pointer",
                    						lv_pointer_2_0,
                    						"org.xtext.example.mydsl.Pascal.pointer_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletype"


    // $ANTLR start "entryRulesimple_type"
    // InternalPascal.g:2790:1: entryRulesimple_type returns [EObject current=null] : iv_rulesimple_type= rulesimple_type EOF ;
    public final EObject entryRulesimple_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimple_type = null;


        try {
            // InternalPascal.g:2790:52: (iv_rulesimple_type= rulesimple_type EOF )
            // InternalPascal.g:2791:2: iv_rulesimple_type= rulesimple_type EOF
            {
             newCompositeNode(grammarAccess.getSimple_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesimple_type=rulesimple_type();

            state._fsp--;

             current =iv_rulesimple_type; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesimple_type"


    // $ANTLR start "rulesimple_type"
    // InternalPascal.g:2797:1: rulesimple_type returns [EObject current=null] : ( ( (lv_subrange_0_0= rulesubrange_type ) ) | ( (lv_enumerated_1_0= ruleenumerated_type ) ) | ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject rulesimple_type() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_subrange_0_0 = null;

        EObject lv_enumerated_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2803:2: ( ( ( (lv_subrange_0_0= rulesubrange_type ) ) | ( (lv_enumerated_1_0= ruleenumerated_type ) ) | ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalPascal.g:2804:2: ( ( (lv_subrange_0_0= rulesubrange_type ) ) | ( (lv_enumerated_1_0= ruleenumerated_type ) ) | ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalPascal.g:2804:2: ( ( (lv_subrange_0_0= rulesubrange_type ) ) | ( (lv_enumerated_1_0= ruleenumerated_type ) ) | ( (lv_name_2_0= RULE_ID ) ) )
            int alt36=3;
            switch ( input.LA(1) ) {
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_INTEGER_NUMBER:
            case RULE_ADDITION_OPERATOR:
            case RULE_STRING:
            case RULE_REAL_NUMBER:
            case RULE_SIGNED_REAL_NUMBER:
            case RULE_NUMERIC_SUBRANGE:
            case 41:
            case 42:
            case 43:
                {
                alt36=1;
                }
                break;
            case RULE_ID:
                {
                int LA36_2 = input.LA(2);

                if ( (LA36_2==54) ) {
                    alt36=1;
                }
                else if ( (LA36_2==EOF||(LA36_2>=26 && LA36_2<=27)||LA36_2==33) ) {
                    alt36=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 2, input);

                    throw nvae;
                }
                }
                break;
            case 24:
                {
                alt36=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalPascal.g:2805:3: ( (lv_subrange_0_0= rulesubrange_type ) )
                    {
                    // InternalPascal.g:2805:3: ( (lv_subrange_0_0= rulesubrange_type ) )
                    // InternalPascal.g:2806:4: (lv_subrange_0_0= rulesubrange_type )
                    {
                    // InternalPascal.g:2806:4: (lv_subrange_0_0= rulesubrange_type )
                    // InternalPascal.g:2807:5: lv_subrange_0_0= rulesubrange_type
                    {

                    					newCompositeNode(grammarAccess.getSimple_typeAccess().getSubrangeSubrange_typeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_subrange_0_0=rulesubrange_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimple_typeRule());
                    					}
                    					set(
                    						current,
                    						"subrange",
                    						lv_subrange_0_0,
                    						"org.xtext.example.mydsl.Pascal.subrange_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2825:3: ( (lv_enumerated_1_0= ruleenumerated_type ) )
                    {
                    // InternalPascal.g:2825:3: ( (lv_enumerated_1_0= ruleenumerated_type ) )
                    // InternalPascal.g:2826:4: (lv_enumerated_1_0= ruleenumerated_type )
                    {
                    // InternalPascal.g:2826:4: (lv_enumerated_1_0= ruleenumerated_type )
                    // InternalPascal.g:2827:5: lv_enumerated_1_0= ruleenumerated_type
                    {

                    					newCompositeNode(grammarAccess.getSimple_typeAccess().getEnumeratedEnumerated_typeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_enumerated_1_0=ruleenumerated_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSimple_typeRule());
                    					}
                    					set(
                    						current,
                    						"enumerated",
                    						lv_enumerated_1_0,
                    						"org.xtext.example.mydsl.Pascal.enumerated_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:2845:3: ( (lv_name_2_0= RULE_ID ) )
                    {
                    // InternalPascal.g:2845:3: ( (lv_name_2_0= RULE_ID ) )
                    // InternalPascal.g:2846:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalPascal.g:2846:4: (lv_name_2_0= RULE_ID )
                    // InternalPascal.g:2847:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getSimple_typeAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSimple_typeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesimple_type"


    // $ANTLR start "entryRulesubrange_type"
    // InternalPascal.g:2867:1: entryRulesubrange_type returns [EObject current=null] : iv_rulesubrange_type= rulesubrange_type EOF ;
    public final EObject entryRulesubrange_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesubrange_type = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalPascal.g:2869:2: (iv_rulesubrange_type= rulesubrange_type EOF )
            // InternalPascal.g:2870:2: iv_rulesubrange_type= rulesubrange_type EOF
            {
             newCompositeNode(grammarAccess.getSubrange_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesubrange_type=rulesubrange_type();

            state._fsp--;

             current =iv_rulesubrange_type; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulesubrange_type"


    // $ANTLR start "rulesubrange_type"
    // InternalPascal.g:2879:1: rulesubrange_type returns [EObject current=null] : ( ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) ) ) | ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) ) ) ;
    public final EObject rulesubrange_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_subrange_3_0=null;
        EObject lv_initialConst_0_0 = null;

        EObject lv_finalConst_2_0 = null;

        EObject lv_const_4_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalPascal.g:2886:2: ( ( ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) ) ) | ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) ) ) )
            // InternalPascal.g:2887:2: ( ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) ) ) | ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) ) )
            {
            // InternalPascal.g:2887:2: ( ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) ) ) | ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_INTEGER_NUMBER)||LA37_0==RULE_ADDITION_OPERATOR||(LA37_0>=RULE_STRING && LA37_0<=RULE_SIGNED_REAL_NUMBER)||(LA37_0>=41 && LA37_0<=43)) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_NUMERIC_SUBRANGE) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalPascal.g:2888:3: ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) ) )
                    {
                    // InternalPascal.g:2888:3: ( ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) ) )
                    // InternalPascal.g:2889:4: ( (lv_initialConst_0_0= ruleconstant ) ) otherlv_1= '..' ( (lv_finalConst_2_0= ruleconstant ) )
                    {
                    // InternalPascal.g:2889:4: ( (lv_initialConst_0_0= ruleconstant ) )
                    // InternalPascal.g:2890:5: (lv_initialConst_0_0= ruleconstant )
                    {
                    // InternalPascal.g:2890:5: (lv_initialConst_0_0= ruleconstant )
                    // InternalPascal.g:2891:6: lv_initialConst_0_0= ruleconstant
                    {

                    						newCompositeNode(grammarAccess.getSubrange_typeAccess().getInitialConstConstantParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_initialConst_0_0=ruleconstant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubrange_typeRule());
                    						}
                    						set(
                    							current,
                    							"initialConst",
                    							lv_initialConst_0_0,
                    							"org.xtext.example.mydsl.Pascal.constant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,54,FOLLOW_31); 

                    				newLeafNode(otherlv_1, grammarAccess.getSubrange_typeAccess().getFullStopFullStopKeyword_0_1());
                    			
                    // InternalPascal.g:2912:4: ( (lv_finalConst_2_0= ruleconstant ) )
                    // InternalPascal.g:2913:5: (lv_finalConst_2_0= ruleconstant )
                    {
                    // InternalPascal.g:2913:5: (lv_finalConst_2_0= ruleconstant )
                    // InternalPascal.g:2914:6: lv_finalConst_2_0= ruleconstant
                    {

                    						newCompositeNode(grammarAccess.getSubrange_typeAccess().getFinalConstConstantParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_finalConst_2_0=ruleconstant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubrange_typeRule());
                    						}
                    						set(
                    							current,
                    							"finalConst",
                    							lv_finalConst_2_0,
                    							"org.xtext.example.mydsl.Pascal.constant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2933:3: ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) )
                    {
                    // InternalPascal.g:2933:3: ( ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) ) )
                    // InternalPascal.g:2934:4: ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) ) ( (lv_const_4_0= ruleconstant ) )
                    {
                    // InternalPascal.g:2934:4: ( (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE ) )
                    // InternalPascal.g:2935:5: (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE )
                    {
                    // InternalPascal.g:2935:5: (lv_subrange_3_0= RULE_NUMERIC_SUBRANGE )
                    // InternalPascal.g:2936:6: lv_subrange_3_0= RULE_NUMERIC_SUBRANGE
                    {
                    lv_subrange_3_0=(Token)match(input,RULE_NUMERIC_SUBRANGE,FOLLOW_31); 

                    						newLeafNode(lv_subrange_3_0, grammarAccess.getSubrange_typeAccess().getSubrangeNUMERIC_SUBRANGETerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSubrange_typeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"subrange",
                    							lv_subrange_3_0,
                    							"org.xtext.example.mydsl.Pascal.NUMERIC_SUBRANGE");
                    					

                    }


                    }

                    // InternalPascal.g:2952:4: ( (lv_const_4_0= ruleconstant ) )
                    // InternalPascal.g:2953:5: (lv_const_4_0= ruleconstant )
                    {
                    // InternalPascal.g:2953:5: (lv_const_4_0= ruleconstant )
                    // InternalPascal.g:2954:6: lv_const_4_0= ruleconstant
                    {

                    						newCompositeNode(grammarAccess.getSubrange_typeAccess().getConstConstantParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_const_4_0=ruleconstant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubrange_typeRule());
                    						}
                    						set(
                    							current,
                    							"const",
                    							lv_const_4_0,
                    							"org.xtext.example.mydsl.Pascal.constant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulesubrange_type"


    // $ANTLR start "entryRuleenumerated_type"
    // InternalPascal.g:2979:1: entryRuleenumerated_type returns [EObject current=null] : iv_ruleenumerated_type= ruleenumerated_type EOF ;
    public final EObject entryRuleenumerated_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleenumerated_type = null;


        try {
            // InternalPascal.g:2979:56: (iv_ruleenumerated_type= ruleenumerated_type EOF )
            // InternalPascal.g:2980:2: iv_ruleenumerated_type= ruleenumerated_type EOF
            {
             newCompositeNode(grammarAccess.getEnumerated_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleenumerated_type=ruleenumerated_type();

            state._fsp--;

             current =iv_ruleenumerated_type; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleenumerated_type"


    // $ANTLR start "ruleenumerated_type"
    // InternalPascal.g:2986:1: ruleenumerated_type returns [EObject current=null] : (otherlv_0= '(' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ')' ) ;
    public final EObject ruleenumerated_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_identifiers_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:2992:2: ( (otherlv_0= '(' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ')' ) )
            // InternalPascal.g:2993:2: (otherlv_0= '(' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ')' )
            {
            // InternalPascal.g:2993:2: (otherlv_0= '(' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ')' )
            // InternalPascal.g:2994:3: otherlv_0= '(' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerated_typeAccess().getLeftParenthesisKeyword_0());
            		
            // InternalPascal.g:2998:3: ( (lv_identifiers_1_0= ruleidentifier_list ) )
            // InternalPascal.g:2999:4: (lv_identifiers_1_0= ruleidentifier_list )
            {
            // InternalPascal.g:2999:4: (lv_identifiers_1_0= ruleidentifier_list )
            // InternalPascal.g:3000:5: lv_identifiers_1_0= ruleidentifier_list
            {

            					newCompositeNode(grammarAccess.getEnumerated_typeAccess().getIdentifiersIdentifier_listParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_identifiers_1_0=ruleidentifier_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerated_typeRule());
            					}
            					set(
            						current,
            						"identifiers",
            						lv_identifiers_1_0,
            						"org.xtext.example.mydsl.Pascal.identifier_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumerated_typeAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleenumerated_type"


    // $ANTLR start "entryRulestructured_type"
    // InternalPascal.g:3025:1: entryRulestructured_type returns [EObject current=null] : iv_rulestructured_type= rulestructured_type EOF ;
    public final EObject entryRulestructured_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestructured_type = null;


        try {
            // InternalPascal.g:3025:56: (iv_rulestructured_type= rulestructured_type EOF )
            // InternalPascal.g:3026:2: iv_rulestructured_type= rulestructured_type EOF
            {
             newCompositeNode(grammarAccess.getStructured_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestructured_type=rulestructured_type();

            state._fsp--;

             current =iv_rulestructured_type; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestructured_type"


    // $ANTLR start "rulestructured_type"
    // InternalPascal.g:3032:1: rulestructured_type returns [EObject current=null] : ( ( (lv_packed_0_0= 'packed' ) )? ( (lv_type_1_0= ruleunpacked_structured_type ) ) ) ;
    public final EObject rulestructured_type() throws RecognitionException {
        EObject current = null;

        Token lv_packed_0_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3038:2: ( ( ( (lv_packed_0_0= 'packed' ) )? ( (lv_type_1_0= ruleunpacked_structured_type ) ) ) )
            // InternalPascal.g:3039:2: ( ( (lv_packed_0_0= 'packed' ) )? ( (lv_type_1_0= ruleunpacked_structured_type ) ) )
            {
            // InternalPascal.g:3039:2: ( ( (lv_packed_0_0= 'packed' ) )? ( (lv_type_1_0= ruleunpacked_structured_type ) ) )
            // InternalPascal.g:3040:3: ( (lv_packed_0_0= 'packed' ) )? ( (lv_type_1_0= ruleunpacked_structured_type ) )
            {
            // InternalPascal.g:3040:3: ( (lv_packed_0_0= 'packed' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==55) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalPascal.g:3041:4: (lv_packed_0_0= 'packed' )
                    {
                    // InternalPascal.g:3041:4: (lv_packed_0_0= 'packed' )
                    // InternalPascal.g:3042:5: lv_packed_0_0= 'packed'
                    {
                    lv_packed_0_0=(Token)match(input,55,FOLLOW_34); 

                    					newLeafNode(lv_packed_0_0, grammarAccess.getStructured_typeAccess().getPackedPackedKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStructured_typeRule());
                    					}
                    					setWithLastConsumed(current, "packed", true, "packed");
                    				

                    }


                    }
                    break;

            }

            // InternalPascal.g:3054:3: ( (lv_type_1_0= ruleunpacked_structured_type ) )
            // InternalPascal.g:3055:4: (lv_type_1_0= ruleunpacked_structured_type )
            {
            // InternalPascal.g:3055:4: (lv_type_1_0= ruleunpacked_structured_type )
            // InternalPascal.g:3056:5: lv_type_1_0= ruleunpacked_structured_type
            {

            					newCompositeNode(grammarAccess.getStructured_typeAccess().getTypeUnpacked_structured_typeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleunpacked_structured_type();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStructured_typeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.example.mydsl.Pascal.unpacked_structured_type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestructured_type"


    // $ANTLR start "entryRuleunpacked_structured_type"
    // InternalPascal.g:3077:1: entryRuleunpacked_structured_type returns [EObject current=null] : iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF ;
    public final EObject entryRuleunpacked_structured_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunpacked_structured_type = null;


        try {
            // InternalPascal.g:3077:65: (iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF )
            // InternalPascal.g:3078:2: iv_ruleunpacked_structured_type= ruleunpacked_structured_type EOF
            {
             newCompositeNode(grammarAccess.getUnpacked_structured_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleunpacked_structured_type=ruleunpacked_structured_type();

            state._fsp--;

             current =iv_ruleunpacked_structured_type; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunpacked_structured_type"


    // $ANTLR start "ruleunpacked_structured_type"
    // InternalPascal.g:3084:1: ruleunpacked_structured_type returns [EObject current=null] : ( ( (lv_array_0_0= rulearray_type ) ) | ( (lv_dynamic_1_0= ruledynamic_array_type ) ) | ( (lv_set_2_0= ruleset_type ) ) ) ;
    public final EObject ruleunpacked_structured_type() throws RecognitionException {
        EObject current = null;

        EObject lv_array_0_0 = null;

        EObject lv_dynamic_1_0 = null;

        EObject lv_set_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3090:2: ( ( ( (lv_array_0_0= rulearray_type ) ) | ( (lv_dynamic_1_0= ruledynamic_array_type ) ) | ( (lv_set_2_0= ruleset_type ) ) ) )
            // InternalPascal.g:3091:2: ( ( (lv_array_0_0= rulearray_type ) ) | ( (lv_dynamic_1_0= ruledynamic_array_type ) ) | ( (lv_set_2_0= ruleset_type ) ) )
            {
            // InternalPascal.g:3091:2: ( ( (lv_array_0_0= rulearray_type ) ) | ( (lv_dynamic_1_0= ruledynamic_array_type ) ) | ( (lv_set_2_0= ruleset_type ) ) )
            int alt39=3;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==56) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==32) ) {
                    alt39=1;
                }
                else if ( (LA39_1==57) ) {
                    alt39=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA39_0==58) ) {
                alt39=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalPascal.g:3092:3: ( (lv_array_0_0= rulearray_type ) )
                    {
                    // InternalPascal.g:3092:3: ( (lv_array_0_0= rulearray_type ) )
                    // InternalPascal.g:3093:4: (lv_array_0_0= rulearray_type )
                    {
                    // InternalPascal.g:3093:4: (lv_array_0_0= rulearray_type )
                    // InternalPascal.g:3094:5: lv_array_0_0= rulearray_type
                    {

                    					newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getArrayArray_typeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_array_0_0=rulearray_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
                    					}
                    					set(
                    						current,
                    						"array",
                    						lv_array_0_0,
                    						"org.xtext.example.mydsl.Pascal.array_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:3112:3: ( (lv_dynamic_1_0= ruledynamic_array_type ) )
                    {
                    // InternalPascal.g:3112:3: ( (lv_dynamic_1_0= ruledynamic_array_type ) )
                    // InternalPascal.g:3113:4: (lv_dynamic_1_0= ruledynamic_array_type )
                    {
                    // InternalPascal.g:3113:4: (lv_dynamic_1_0= ruledynamic_array_type )
                    // InternalPascal.g:3114:5: lv_dynamic_1_0= ruledynamic_array_type
                    {

                    					newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getDynamicDynamic_array_typeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_dynamic_1_0=ruledynamic_array_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
                    					}
                    					set(
                    						current,
                    						"dynamic",
                    						lv_dynamic_1_0,
                    						"org.xtext.example.mydsl.Pascal.dynamic_array_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:3132:3: ( (lv_set_2_0= ruleset_type ) )
                    {
                    // InternalPascal.g:3132:3: ( (lv_set_2_0= ruleset_type ) )
                    // InternalPascal.g:3133:4: (lv_set_2_0= ruleset_type )
                    {
                    // InternalPascal.g:3133:4: (lv_set_2_0= ruleset_type )
                    // InternalPascal.g:3134:5: lv_set_2_0= ruleset_type
                    {

                    					newCompositeNode(grammarAccess.getUnpacked_structured_typeAccess().getSetSet_typeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_set_2_0=ruleset_type();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUnpacked_structured_typeRule());
                    					}
                    					set(
                    						current,
                    						"set",
                    						lv_set_2_0,
                    						"org.xtext.example.mydsl.Pascal.set_type");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunpacked_structured_type"


    // $ANTLR start "entryRulearray_type"
    // InternalPascal.g:3155:1: entryRulearray_type returns [EObject current=null] : iv_rulearray_type= rulearray_type EOF ;
    public final EObject entryRulearray_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulearray_type = null;


        try {
            // InternalPascal.g:3155:51: (iv_rulearray_type= rulearray_type EOF )
            // InternalPascal.g:3156:2: iv_rulearray_type= rulearray_type EOF
            {
             newCompositeNode(grammarAccess.getArray_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulearray_type=rulearray_type();

            state._fsp--;

             current =iv_rulearray_type; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulearray_type"


    // $ANTLR start "rulearray_type"
    // InternalPascal.g:3162:1: rulearray_type returns [EObject current=null] : (otherlv_0= 'array' otherlv_1= '[' ( (lv_indexes_2_0= ruleindex_type ) ) (otherlv_3= ',' ( (lv_indexes_4_0= ruleindex_type ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruletype ) ) ) ;
    public final EObject rulearray_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_indexes_2_0 = null;

        EObject lv_indexes_4_0 = null;

        EObject lv_type_7_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3168:2: ( (otherlv_0= 'array' otherlv_1= '[' ( (lv_indexes_2_0= ruleindex_type ) ) (otherlv_3= ',' ( (lv_indexes_4_0= ruleindex_type ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruletype ) ) ) )
            // InternalPascal.g:3169:2: (otherlv_0= 'array' otherlv_1= '[' ( (lv_indexes_2_0= ruleindex_type ) ) (otherlv_3= ',' ( (lv_indexes_4_0= ruleindex_type ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruletype ) ) )
            {
            // InternalPascal.g:3169:2: (otherlv_0= 'array' otherlv_1= '[' ( (lv_indexes_2_0= ruleindex_type ) ) (otherlv_3= ',' ( (lv_indexes_4_0= ruleindex_type ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruletype ) ) )
            // InternalPascal.g:3170:3: otherlv_0= 'array' otherlv_1= '[' ( (lv_indexes_2_0= ruleindex_type ) ) (otherlv_3= ',' ( (lv_indexes_4_0= ruleindex_type ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getArray_typeAccess().getArrayKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getArray_typeAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalPascal.g:3178:3: ( (lv_indexes_2_0= ruleindex_type ) )
            // InternalPascal.g:3179:4: (lv_indexes_2_0= ruleindex_type )
            {
            // InternalPascal.g:3179:4: (lv_indexes_2_0= ruleindex_type )
            // InternalPascal.g:3180:5: lv_indexes_2_0= ruleindex_type
            {

            					newCompositeNode(grammarAccess.getArray_typeAccess().getIndexesIndex_typeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_37);
            lv_indexes_2_0=ruleindex_type();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArray_typeRule());
            					}
            					add(
            						current,
            						"indexes",
            						lv_indexes_2_0,
            						"org.xtext.example.mydsl.Pascal.index_type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:3197:3: (otherlv_3= ',' ( (lv_indexes_4_0= ruleindex_type ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==27) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalPascal.g:3198:4: otherlv_3= ',' ( (lv_indexes_4_0= ruleindex_type ) )
            	    {
            	    otherlv_3=(Token)match(input,27,FOLLOW_36); 

            	    				newLeafNode(otherlv_3, grammarAccess.getArray_typeAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalPascal.g:3202:4: ( (lv_indexes_4_0= ruleindex_type ) )
            	    // InternalPascal.g:3203:5: (lv_indexes_4_0= ruleindex_type )
            	    {
            	    // InternalPascal.g:3203:5: (lv_indexes_4_0= ruleindex_type )
            	    // InternalPascal.g:3204:6: lv_indexes_4_0= ruleindex_type
            	    {

            	    						newCompositeNode(grammarAccess.getArray_typeAccess().getIndexesIndex_typeParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_37);
            	    lv_indexes_4_0=ruleindex_type();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getArray_typeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"indexes",
            	    							lv_indexes_4_0,
            	    							"org.xtext.example.mydsl.Pascal.index_type");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_5=(Token)match(input,33,FOLLOW_38); 

            			newLeafNode(otherlv_5, grammarAccess.getArray_typeAccess().getRightSquareBracketKeyword_4());
            		
            otherlv_6=(Token)match(input,57,FOLLOW_32); 

            			newLeafNode(otherlv_6, grammarAccess.getArray_typeAccess().getOfKeyword_5());
            		
            // InternalPascal.g:3230:3: ( (lv_type_7_0= ruletype ) )
            // InternalPascal.g:3231:4: (lv_type_7_0= ruletype )
            {
            // InternalPascal.g:3231:4: (lv_type_7_0= ruletype )
            // InternalPascal.g:3232:5: lv_type_7_0= ruletype
            {

            					newCompositeNode(grammarAccess.getArray_typeAccess().getTypeTypeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_7_0=ruletype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArray_typeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_7_0,
            						"org.xtext.example.mydsl.Pascal.type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulearray_type"


    // $ANTLR start "entryRuledynamic_array_type"
    // InternalPascal.g:3253:1: entryRuledynamic_array_type returns [EObject current=null] : iv_ruledynamic_array_type= ruledynamic_array_type EOF ;
    public final EObject entryRuledynamic_array_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledynamic_array_type = null;


        try {
            // InternalPascal.g:3253:59: (iv_ruledynamic_array_type= ruledynamic_array_type EOF )
            // InternalPascal.g:3254:2: iv_ruledynamic_array_type= ruledynamic_array_type EOF
            {
             newCompositeNode(grammarAccess.getDynamic_array_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruledynamic_array_type=ruledynamic_array_type();

            state._fsp--;

             current =iv_ruledynamic_array_type; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledynamic_array_type"


    // $ANTLR start "ruledynamic_array_type"
    // InternalPascal.g:3260:1: ruledynamic_array_type returns [EObject current=null] : (otherlv_0= 'array' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject ruledynamic_array_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3266:2: ( (otherlv_0= 'array' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalPascal.g:3267:2: (otherlv_0= 'array' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalPascal.g:3267:2: (otherlv_0= 'array' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) )
            // InternalPascal.g:3268:3: otherlv_0= 'array' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getDynamic_array_typeAccess().getArrayKeyword_0());
            		
            otherlv_1=(Token)match(input,57,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getDynamic_array_typeAccess().getOfKeyword_1());
            		
            // InternalPascal.g:3276:3: ( (lv_type_2_0= ruletype ) )
            // InternalPascal.g:3277:4: (lv_type_2_0= ruletype )
            {
            // InternalPascal.g:3277:4: (lv_type_2_0= ruletype )
            // InternalPascal.g:3278:5: lv_type_2_0= ruletype
            {

            					newCompositeNode(grammarAccess.getDynamic_array_typeAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruletype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDynamic_array_typeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.example.mydsl.Pascal.type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledynamic_array_type"


    // $ANTLR start "entryRuleindex_type"
    // InternalPascal.g:3299:1: entryRuleindex_type returns [EObject current=null] : iv_ruleindex_type= ruleindex_type EOF ;
    public final EObject entryRuleindex_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleindex_type = null;


        try {
            // InternalPascal.g:3299:51: (iv_ruleindex_type= ruleindex_type EOF )
            // InternalPascal.g:3300:2: iv_ruleindex_type= ruleindex_type EOF
            {
             newCompositeNode(grammarAccess.getIndex_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleindex_type=ruleindex_type();

            state._fsp--;

             current =iv_ruleindex_type; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleindex_type"


    // $ANTLR start "ruleindex_type"
    // InternalPascal.g:3306:1: ruleindex_type returns [EObject current=null] : ( (lv_type_0_0= rulesimple_type ) ) ;
    public final EObject ruleindex_type() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3312:2: ( ( (lv_type_0_0= rulesimple_type ) ) )
            // InternalPascal.g:3313:2: ( (lv_type_0_0= rulesimple_type ) )
            {
            // InternalPascal.g:3313:2: ( (lv_type_0_0= rulesimple_type ) )
            // InternalPascal.g:3314:3: (lv_type_0_0= rulesimple_type )
            {
            // InternalPascal.g:3314:3: (lv_type_0_0= rulesimple_type )
            // InternalPascal.g:3315:4: lv_type_0_0= rulesimple_type
            {

            				newCompositeNode(grammarAccess.getIndex_typeAccess().getTypeSimple_typeParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_type_0_0=rulesimple_type();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getIndex_typeRule());
            				}
            				set(
            					current,
            					"type",
            					lv_type_0_0,
            					"org.xtext.example.mydsl.Pascal.simple_type");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleindex_type"


    // $ANTLR start "entryRulevariable_identifier_list"
    // InternalPascal.g:3335:1: entryRulevariable_identifier_list returns [EObject current=null] : iv_rulevariable_identifier_list= rulevariable_identifier_list EOF ;
    public final EObject entryRulevariable_identifier_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_identifier_list = null;


        try {
            // InternalPascal.g:3335:65: (iv_rulevariable_identifier_list= rulevariable_identifier_list EOF )
            // InternalPascal.g:3336:2: iv_rulevariable_identifier_list= rulevariable_identifier_list EOF
            {
             newCompositeNode(grammarAccess.getVariable_identifier_listRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariable_identifier_list=rulevariable_identifier_list();

            state._fsp--;

             current =iv_rulevariable_identifier_list; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariable_identifier_list"


    // $ANTLR start "rulevariable_identifier_list"
    // InternalPascal.g:3342:1: rulevariable_identifier_list returns [EObject current=null] : ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* ) ;
    public final EObject rulevariable_identifier_list() throws RecognitionException {
        EObject current = null;

        Token lv_names_0_0=null;
        Token otherlv_1=null;
        Token lv_names_2_0=null;


        	enterRule();

        try {
            // InternalPascal.g:3348:2: ( ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* ) )
            // InternalPascal.g:3349:2: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* )
            {
            // InternalPascal.g:3349:2: ( ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )* )
            // InternalPascal.g:3350:3: ( (lv_names_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )*
            {
            // InternalPascal.g:3350:3: ( (lv_names_0_0= RULE_ID ) )
            // InternalPascal.g:3351:4: (lv_names_0_0= RULE_ID )
            {
            // InternalPascal.g:3351:4: (lv_names_0_0= RULE_ID )
            // InternalPascal.g:3352:5: lv_names_0_0= RULE_ID
            {
            lv_names_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_names_0_0, grammarAccess.getVariable_identifier_listAccess().getNamesIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariable_identifier_listRule());
            					}
            					addWithLastConsumed(
            						current,
            						"names",
            						lv_names_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPascal.g:3368:3: (otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==27) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalPascal.g:3369:4: otherlv_1= ',' ( (lv_names_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,27,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getVariable_identifier_listAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPascal.g:3373:4: ( (lv_names_2_0= RULE_ID ) )
            	    // InternalPascal.g:3374:5: (lv_names_2_0= RULE_ID )
            	    {
            	    // InternalPascal.g:3374:5: (lv_names_2_0= RULE_ID )
            	    // InternalPascal.g:3375:6: lv_names_2_0= RULE_ID
            	    {
            	    lv_names_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    						newLeafNode(lv_names_2_0, grammarAccess.getVariable_identifier_listAccess().getNamesIDTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getVariable_identifier_listRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"names",
            	    							lv_names_2_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariable_identifier_list"


    // $ANTLR start "entryRulevariable_section"
    // InternalPascal.g:3396:1: entryRulevariable_section returns [EObject current=null] : iv_rulevariable_section= rulevariable_section EOF ;
    public final EObject entryRulevariable_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_section = null;


        try {
            // InternalPascal.g:3396:57: (iv_rulevariable_section= rulevariable_section EOF )
            // InternalPascal.g:3397:2: iv_rulevariable_section= rulevariable_section EOF
            {
             newCompositeNode(grammarAccess.getVariable_sectionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariable_section=rulevariable_section();

            state._fsp--;

             current =iv_rulevariable_section; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariable_section"


    // $ANTLR start "rulevariable_section"
    // InternalPascal.g:3403:1: rulevariable_section returns [EObject current=null] : ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject rulevariable_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifiers_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3409:2: ( ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalPascal.g:3410:2: ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalPascal.g:3410:2: ( ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) ) )
            // InternalPascal.g:3411:3: ( (lv_identifiers_0_0= rulevariable_identifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruletype ) )
            {
            // InternalPascal.g:3411:3: ( (lv_identifiers_0_0= rulevariable_identifier_list ) )
            // InternalPascal.g:3412:4: (lv_identifiers_0_0= rulevariable_identifier_list )
            {
            // InternalPascal.g:3412:4: (lv_identifiers_0_0= rulevariable_identifier_list )
            // InternalPascal.g:3413:5: lv_identifiers_0_0= rulevariable_identifier_list
            {

            					newCompositeNode(grammarAccess.getVariable_sectionAccess().getIdentifiersVariable_identifier_listParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_identifiers_0_0=rulevariable_identifier_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariable_sectionRule());
            					}
            					set(
            						current,
            						"identifiers",
            						lv_identifiers_0_0,
            						"org.xtext.example.mydsl.Pascal.variable_identifier_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getVariable_sectionAccess().getColonKeyword_1());
            		
            // InternalPascal.g:3434:3: ( (lv_type_2_0= ruletype ) )
            // InternalPascal.g:3435:4: (lv_type_2_0= ruletype )
            {
            // InternalPascal.g:3435:4: (lv_type_2_0= ruletype )
            // InternalPascal.g:3436:5: lv_type_2_0= ruletype
            {

            					newCompositeNode(grammarAccess.getVariable_sectionAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruletype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariable_sectionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.example.mydsl.Pascal.type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariable_section"


    // $ANTLR start "entryRuleset_type"
    // InternalPascal.g:3457:1: entryRuleset_type returns [EObject current=null] : iv_ruleset_type= ruleset_type EOF ;
    public final EObject entryRuleset_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleset_type = null;


        try {
            // InternalPascal.g:3457:49: (iv_ruleset_type= ruleset_type EOF )
            // InternalPascal.g:3458:2: iv_ruleset_type= ruleset_type EOF
            {
             newCompositeNode(grammarAccess.getSet_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleset_type=ruleset_type();

            state._fsp--;

             current =iv_ruleset_type; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleset_type"


    // $ANTLR start "ruleset_type"
    // InternalPascal.g:3464:1: ruleset_type returns [EObject current=null] : (otherlv_0= 'set' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) ) ;
    public final EObject ruleset_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3470:2: ( (otherlv_0= 'set' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) ) )
            // InternalPascal.g:3471:2: (otherlv_0= 'set' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) )
            {
            // InternalPascal.g:3471:2: (otherlv_0= 'set' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) ) )
            // InternalPascal.g:3472:3: otherlv_0= 'set' otherlv_1= 'of' ( (lv_type_2_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getSet_typeAccess().getSetKeyword_0());
            		
            otherlv_1=(Token)match(input,57,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getSet_typeAccess().getOfKeyword_1());
            		
            // InternalPascal.g:3480:3: ( (lv_type_2_0= ruletype ) )
            // InternalPascal.g:3481:4: (lv_type_2_0= ruletype )
            {
            // InternalPascal.g:3481:4: (lv_type_2_0= ruletype )
            // InternalPascal.g:3482:5: lv_type_2_0= ruletype
            {

            					newCompositeNode(grammarAccess.getSet_typeAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruletype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSet_typeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.example.mydsl.Pascal.type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleset_type"


    // $ANTLR start "entryRulepointer_type"
    // InternalPascal.g:3503:1: entryRulepointer_type returns [EObject current=null] : iv_rulepointer_type= rulepointer_type EOF ;
    public final EObject entryRulepointer_type() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepointer_type = null;


        try {
            // InternalPascal.g:3503:53: (iv_rulepointer_type= rulepointer_type EOF )
            // InternalPascal.g:3504:2: iv_rulepointer_type= rulepointer_type EOF
            {
             newCompositeNode(grammarAccess.getPointer_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulepointer_type=rulepointer_type();

            state._fsp--;

             current =iv_rulepointer_type; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepointer_type"


    // $ANTLR start "rulepointer_type"
    // InternalPascal.g:3510:1: rulepointer_type returns [EObject current=null] : (otherlv_0= '^' ( (lv_type_1_0= ruletype ) ) ) ;
    public final EObject rulepointer_type() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3516:2: ( (otherlv_0= '^' ( (lv_type_1_0= ruletype ) ) ) )
            // InternalPascal.g:3517:2: (otherlv_0= '^' ( (lv_type_1_0= ruletype ) ) )
            {
            // InternalPascal.g:3517:2: (otherlv_0= '^' ( (lv_type_1_0= ruletype ) ) )
            // InternalPascal.g:3518:3: otherlv_0= '^' ( (lv_type_1_0= ruletype ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getPointer_typeAccess().getCircumflexAccentKeyword_0());
            		
            // InternalPascal.g:3522:3: ( (lv_type_1_0= ruletype ) )
            // InternalPascal.g:3523:4: (lv_type_1_0= ruletype )
            {
            // InternalPascal.g:3523:4: (lv_type_1_0= ruletype )
            // InternalPascal.g:3524:5: lv_type_1_0= ruletype
            {

            					newCompositeNode(grammarAccess.getPointer_typeAccess().getTypeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruletype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPointer_typeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.example.mydsl.Pascal.type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulepointer_type"


    // $ANTLR start "entryRulevariable_declaration_part"
    // InternalPascal.g:3545:1: entryRulevariable_declaration_part returns [EObject current=null] : iv_rulevariable_declaration_part= rulevariable_declaration_part EOF ;
    public final EObject entryRulevariable_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_declaration_part = null;


        try {
            // InternalPascal.g:3545:66: (iv_rulevariable_declaration_part= rulevariable_declaration_part EOF )
            // InternalPascal.g:3546:2: iv_rulevariable_declaration_part= rulevariable_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getVariable_declaration_partRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariable_declaration_part=rulevariable_declaration_part();

            state._fsp--;

             current =iv_rulevariable_declaration_part; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariable_declaration_part"


    // $ANTLR start "rulevariable_declaration_part"
    // InternalPascal.g:3552:1: rulevariable_declaration_part returns [EObject current=null] : (otherlv_0= 'var' ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= ';' ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )* ) ;
    public final EObject rulevariable_declaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_sections_1_0 = null;

        EObject lv_sections_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3558:2: ( (otherlv_0= 'var' ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= ';' ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )* ) )
            // InternalPascal.g:3559:2: (otherlv_0= 'var' ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= ';' ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )* )
            {
            // InternalPascal.g:3559:2: (otherlv_0= 'var' ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= ';' ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )* )
            // InternalPascal.g:3560:3: otherlv_0= 'var' ( (lv_sections_1_0= rulevariable_section ) ) otherlv_2= ';' ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )*
            {
            otherlv_0=(Token)match(input,59,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVariable_declaration_partAccess().getVarKeyword_0());
            		
            // InternalPascal.g:3564:3: ( (lv_sections_1_0= rulevariable_section ) )
            // InternalPascal.g:3565:4: (lv_sections_1_0= rulevariable_section )
            {
            // InternalPascal.g:3565:4: (lv_sections_1_0= rulevariable_section )
            // InternalPascal.g:3566:5: lv_sections_1_0= rulevariable_section
            {

            					newCompositeNode(grammarAccess.getVariable_declaration_partAccess().getSectionsVariable_sectionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_sections_1_0=rulevariable_section();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariable_declaration_partRule());
            					}
            					add(
            						current,
            						"sections",
            						lv_sections_1_0,
            						"org.xtext.example.mydsl.Pascal.variable_section");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_2());
            		
            // InternalPascal.g:3587:3: ( ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';' )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalPascal.g:3588:4: ( (lv_sections_3_0= rulevariable_section ) ) otherlv_4= ';'
            	    {
            	    // InternalPascal.g:3588:4: ( (lv_sections_3_0= rulevariable_section ) )
            	    // InternalPascal.g:3589:5: (lv_sections_3_0= rulevariable_section )
            	    {
            	    // InternalPascal.g:3589:5: (lv_sections_3_0= rulevariable_section )
            	    // InternalPascal.g:3590:6: lv_sections_3_0= rulevariable_section
            	    {

            	    						newCompositeNode(grammarAccess.getVariable_declaration_partAccess().getSectionsVariable_sectionParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_sections_3_0=rulevariable_section();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVariable_declaration_partRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sections",
            	    							lv_sections_3_0,
            	    							"org.xtext.example.mydsl.Pascal.variable_section");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_4=(Token)match(input,26,FOLLOW_29); 

            	    				newLeafNode(otherlv_4, grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariable_declaration_part"


    // $ANTLR start "entryRuleprocedure_and_function_declaration_part"
    // InternalPascal.g:3616:1: entryRuleprocedure_and_function_declaration_part returns [EObject current=null] : iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF ;
    public final EObject entryRuleprocedure_and_function_declaration_part() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_and_function_declaration_part = null;


        try {
            // InternalPascal.g:3616:80: (iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF )
            // InternalPascal.g:3617:2: iv_ruleprocedure_and_function_declaration_part= ruleprocedure_and_function_declaration_part EOF
            {
             newCompositeNode(grammarAccess.getProcedure_and_function_declaration_partRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprocedure_and_function_declaration_part=ruleprocedure_and_function_declaration_part();

            state._fsp--;

             current =iv_ruleprocedure_and_function_declaration_part; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprocedure_and_function_declaration_part"


    // $ANTLR start "ruleprocedure_and_function_declaration_part"
    // InternalPascal.g:3623:1: ruleprocedure_and_function_declaration_part returns [EObject current=null] : ( ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) ) otherlv_2= ';' )+ ;
    public final EObject ruleprocedure_and_function_declaration_part() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_procedures_0_0 = null;

        EObject lv_functions_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3629:2: ( ( ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) ) otherlv_2= ';' )+ )
            // InternalPascal.g:3630:2: ( ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) ) otherlv_2= ';' )+
            {
            // InternalPascal.g:3630:2: ( ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) ) otherlv_2= ';' )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=61 && LA44_0<=62)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalPascal.g:3631:3: ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) ) otherlv_2= ';'
            	    {
            	    // InternalPascal.g:3631:3: ( ( (lv_procedures_0_0= ruleprocedure_declaration ) ) | ( (lv_functions_1_0= rulefunction_declaration ) ) )
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==61) ) {
            	        alt43=1;
            	    }
            	    else if ( (LA43_0==62) ) {
            	        alt43=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 43, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // InternalPascal.g:3632:4: ( (lv_procedures_0_0= ruleprocedure_declaration ) )
            	            {
            	            // InternalPascal.g:3632:4: ( (lv_procedures_0_0= ruleprocedure_declaration ) )
            	            // InternalPascal.g:3633:5: (lv_procedures_0_0= ruleprocedure_declaration )
            	            {
            	            // InternalPascal.g:3633:5: (lv_procedures_0_0= ruleprocedure_declaration )
            	            // InternalPascal.g:3634:6: lv_procedures_0_0= ruleprocedure_declaration
            	            {

            	            						newCompositeNode(grammarAccess.getProcedure_and_function_declaration_partAccess().getProceduresProcedure_declarationParserRuleCall_0_0_0());
            	            					
            	            pushFollow(FOLLOW_8);
            	            lv_procedures_0_0=ruleprocedure_declaration();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getProcedure_and_function_declaration_partRule());
            	            						}
            	            						add(
            	            							current,
            	            							"procedures",
            	            							lv_procedures_0_0,
            	            							"org.xtext.example.mydsl.Pascal.procedure_declaration");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalPascal.g:3652:4: ( (lv_functions_1_0= rulefunction_declaration ) )
            	            {
            	            // InternalPascal.g:3652:4: ( (lv_functions_1_0= rulefunction_declaration ) )
            	            // InternalPascal.g:3653:5: (lv_functions_1_0= rulefunction_declaration )
            	            {
            	            // InternalPascal.g:3653:5: (lv_functions_1_0= rulefunction_declaration )
            	            // InternalPascal.g:3654:6: lv_functions_1_0= rulefunction_declaration
            	            {

            	            						newCompositeNode(grammarAccess.getProcedure_and_function_declaration_partAccess().getFunctionsFunction_declarationParserRuleCall_0_1_0());
            	            					
            	            pushFollow(FOLLOW_8);
            	            lv_functions_1_0=rulefunction_declaration();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getProcedure_and_function_declaration_partRule());
            	            						}
            	            						add(
            	            							current,
            	            							"functions",
            	            							lv_functions_1_0,
            	            							"org.xtext.example.mydsl.Pascal.function_declaration");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_39); 

            	    			newLeafNode(otherlv_2, grammarAccess.getProcedure_and_function_declaration_partAccess().getSemicolonKeyword_1());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt44 >= 1 ) break loop44;
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprocedure_and_function_declaration_part"


    // $ANTLR start "entryRuleprocedure_declaration"
    // InternalPascal.g:3680:1: entryRuleprocedure_declaration returns [EObject current=null] : iv_ruleprocedure_declaration= ruleprocedure_declaration EOF ;
    public final EObject entryRuleprocedure_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_declaration = null;


        try {
            // InternalPascal.g:3680:62: (iv_ruleprocedure_declaration= ruleprocedure_declaration EOF )
            // InternalPascal.g:3681:2: iv_ruleprocedure_declaration= ruleprocedure_declaration EOF
            {
             newCompositeNode(grammarAccess.getProcedure_declarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprocedure_declaration=ruleprocedure_declaration();

            state._fsp--;

             current =iv_ruleprocedure_declaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprocedure_declaration"


    // $ANTLR start "ruleprocedure_declaration"
    // InternalPascal.g:3687:1: ruleprocedure_declaration returns [EObject current=null] : ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) ) ) ;
    public final EObject ruleprocedure_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_forward_3_0=null;
        EObject lv_heading_0_0 = null;

        EObject lv_block_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3693:2: ( ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) ) ) )
            // InternalPascal.g:3694:2: ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) ) )
            {
            // InternalPascal.g:3694:2: ( ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) ) )
            // InternalPascal.g:3695:3: ( (lv_heading_0_0= ruleprocedure_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) )
            {
            // InternalPascal.g:3695:3: ( (lv_heading_0_0= ruleprocedure_heading ) )
            // InternalPascal.g:3696:4: (lv_heading_0_0= ruleprocedure_heading )
            {
            // InternalPascal.g:3696:4: (lv_heading_0_0= ruleprocedure_heading )
            // InternalPascal.g:3697:5: lv_heading_0_0= ruleprocedure_heading
            {

            					newCompositeNode(grammarAccess.getProcedure_declarationAccess().getHeadingProcedure_headingParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_heading_0_0=ruleprocedure_heading();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcedure_declarationRule());
            					}
            					set(
            						current,
            						"heading",
            						lv_heading_0_0,
            						"org.xtext.example.mydsl.Pascal.procedure_heading");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getProcedure_declarationAccess().getSemicolonKeyword_1());
            		
            // InternalPascal.g:3718:3: ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==28||(LA45_0>=52 && LA45_0<=53)||LA45_0==59||(LA45_0>=61 && LA45_0<=62)) ) {
                alt45=1;
            }
            else if ( (LA45_0==60) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalPascal.g:3719:4: ( (lv_block_2_0= ruleblock ) )
                    {
                    // InternalPascal.g:3719:4: ( (lv_block_2_0= ruleblock ) )
                    // InternalPascal.g:3720:5: (lv_block_2_0= ruleblock )
                    {
                    // InternalPascal.g:3720:5: (lv_block_2_0= ruleblock )
                    // InternalPascal.g:3721:6: lv_block_2_0= ruleblock
                    {

                    						newCompositeNode(grammarAccess.getProcedure_declarationAccess().getBlockBlockParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_block_2_0=ruleblock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcedure_declarationRule());
                    						}
                    						set(
                    							current,
                    							"block",
                    							lv_block_2_0,
                    							"org.xtext.example.mydsl.Pascal.block");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:3739:4: ( (lv_forward_3_0= 'forward' ) )
                    {
                    // InternalPascal.g:3739:4: ( (lv_forward_3_0= 'forward' ) )
                    // InternalPascal.g:3740:5: (lv_forward_3_0= 'forward' )
                    {
                    // InternalPascal.g:3740:5: (lv_forward_3_0= 'forward' )
                    // InternalPascal.g:3741:6: lv_forward_3_0= 'forward'
                    {
                    lv_forward_3_0=(Token)match(input,60,FOLLOW_2); 

                    						newLeafNode(lv_forward_3_0, grammarAccess.getProcedure_declarationAccess().getForwardForwardKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProcedure_declarationRule());
                    						}
                    						setWithLastConsumed(current, "forward", true, "forward");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprocedure_declaration"


    // $ANTLR start "entryRuleprocedure_heading"
    // InternalPascal.g:3758:1: entryRuleprocedure_heading returns [EObject current=null] : iv_ruleprocedure_heading= ruleprocedure_heading EOF ;
    public final EObject entryRuleprocedure_heading() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprocedure_heading = null;


        try {
            // InternalPascal.g:3758:58: (iv_ruleprocedure_heading= ruleprocedure_heading EOF )
            // InternalPascal.g:3759:2: iv_ruleprocedure_heading= ruleprocedure_heading EOF
            {
             newCompositeNode(grammarAccess.getProcedure_headingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprocedure_heading=ruleprocedure_heading();

            state._fsp--;

             current =iv_ruleprocedure_heading; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprocedure_heading"


    // $ANTLR start "ruleprocedure_heading"
    // InternalPascal.g:3765:1: ruleprocedure_heading returns [EObject current=null] : (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? ) ;
    public final EObject ruleprocedure_heading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3771:2: ( (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? ) )
            // InternalPascal.g:3772:2: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? )
            {
            // InternalPascal.g:3772:2: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? )
            // InternalPascal.g:3773:3: otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )?
            {
            otherlv_0=(Token)match(input,61,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getProcedure_headingAccess().getProcedureKeyword_0());
            		
            // InternalPascal.g:3777:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPascal.g:3778:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPascal.g:3778:4: (lv_name_1_0= RULE_ID )
            // InternalPascal.g:3779:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_41); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProcedure_headingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcedure_headingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPascal.g:3795:3: ( (lv_parameters_2_0= ruleformal_parameter_list ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==24) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalPascal.g:3796:4: (lv_parameters_2_0= ruleformal_parameter_list )
                    {
                    // InternalPascal.g:3796:4: (lv_parameters_2_0= ruleformal_parameter_list )
                    // InternalPascal.g:3797:5: lv_parameters_2_0= ruleformal_parameter_list
                    {

                    					newCompositeNode(grammarAccess.getProcedure_headingAccess().getParametersFormal_parameter_listParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_parameters_2_0=ruleformal_parameter_list();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProcedure_headingRule());
                    					}
                    					set(
                    						current,
                    						"parameters",
                    						lv_parameters_2_0,
                    						"org.xtext.example.mydsl.Pascal.formal_parameter_list");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprocedure_heading"


    // $ANTLR start "entryRuleformal_parameter_list"
    // InternalPascal.g:3818:1: entryRuleformal_parameter_list returns [EObject current=null] : iv_ruleformal_parameter_list= ruleformal_parameter_list EOF ;
    public final EObject entryRuleformal_parameter_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformal_parameter_list = null;


        try {
            // InternalPascal.g:3818:62: (iv_ruleformal_parameter_list= ruleformal_parameter_list EOF )
            // InternalPascal.g:3819:2: iv_ruleformal_parameter_list= ruleformal_parameter_list EOF
            {
             newCompositeNode(grammarAccess.getFormal_parameter_listRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleformal_parameter_list=ruleformal_parameter_list();

            state._fsp--;

             current =iv_ruleformal_parameter_list; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleformal_parameter_list"


    // $ANTLR start "ruleformal_parameter_list"
    // InternalPascal.g:3825:1: ruleformal_parameter_list returns [EObject current=null] : (otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleformal_parameter_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameters_1_0 = null;

        EObject lv_parameters_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3831:2: ( (otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' ) )
            // InternalPascal.g:3832:2: (otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' )
            {
            // InternalPascal.g:3832:2: (otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')' )
            // InternalPascal.g:3833:3: otherlv_0= '(' ( (lv_parameters_1_0= ruleformal_parameter_section ) ) (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_42); 

            			newLeafNode(otherlv_0, grammarAccess.getFormal_parameter_listAccess().getLeftParenthesisKeyword_0());
            		
            // InternalPascal.g:3837:3: ( (lv_parameters_1_0= ruleformal_parameter_section ) )
            // InternalPascal.g:3838:4: (lv_parameters_1_0= ruleformal_parameter_section )
            {
            // InternalPascal.g:3838:4: (lv_parameters_1_0= ruleformal_parameter_section )
            // InternalPascal.g:3839:5: lv_parameters_1_0= ruleformal_parameter_section
            {

            					newCompositeNode(grammarAccess.getFormal_parameter_listAccess().getParametersFormal_parameter_sectionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_43);
            lv_parameters_1_0=ruleformal_parameter_section();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFormal_parameter_listRule());
            					}
            					add(
            						current,
            						"parameters",
            						lv_parameters_1_0,
            						"org.xtext.example.mydsl.Pascal.formal_parameter_section");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:3856:3: (otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==26) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalPascal.g:3857:4: otherlv_2= ';' ( (lv_parameters_3_0= ruleformal_parameter_section ) )
            	    {
            	    otherlv_2=(Token)match(input,26,FOLLOW_42); 

            	    				newLeafNode(otherlv_2, grammarAccess.getFormal_parameter_listAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalPascal.g:3861:4: ( (lv_parameters_3_0= ruleformal_parameter_section ) )
            	    // InternalPascal.g:3862:5: (lv_parameters_3_0= ruleformal_parameter_section )
            	    {
            	    // InternalPascal.g:3862:5: (lv_parameters_3_0= ruleformal_parameter_section )
            	    // InternalPascal.g:3863:6: lv_parameters_3_0= ruleformal_parameter_section
            	    {

            	    						newCompositeNode(grammarAccess.getFormal_parameter_listAccess().getParametersFormal_parameter_sectionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_43);
            	    lv_parameters_3_0=ruleformal_parameter_section();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFormal_parameter_listRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_3_0,
            	    							"org.xtext.example.mydsl.Pascal.formal_parameter_section");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFormal_parameter_listAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleformal_parameter_list"


    // $ANTLR start "entryRuleformal_parameter_section"
    // InternalPascal.g:3889:1: entryRuleformal_parameter_section returns [EObject current=null] : iv_ruleformal_parameter_section= ruleformal_parameter_section EOF ;
    public final EObject entryRuleformal_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformal_parameter_section = null;


        try {
            // InternalPascal.g:3889:65: (iv_ruleformal_parameter_section= ruleformal_parameter_section EOF )
            // InternalPascal.g:3890:2: iv_ruleformal_parameter_section= ruleformal_parameter_section EOF
            {
             newCompositeNode(grammarAccess.getFormal_parameter_sectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleformal_parameter_section=ruleformal_parameter_section();

            state._fsp--;

             current =iv_ruleformal_parameter_section; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleformal_parameter_section"


    // $ANTLR start "ruleformal_parameter_section"
    // InternalPascal.g:3896:1: ruleformal_parameter_section returns [EObject current=null] : ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) ) ;
    public final EObject ruleformal_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;

        EObject lv_variable_1_0 = null;

        EObject lv_procedure_2_0 = null;

        EObject lv_function_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:3902:2: ( ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) ) )
            // InternalPascal.g:3903:2: ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) )
            {
            // InternalPascal.g:3903:2: ( ( (lv_value_0_0= rulevalue_parameter_section ) ) | ( (lv_variable_1_0= rulevariable_parameter_section ) ) | ( (lv_procedure_2_0= ruleprocedure_heading ) ) | ( (lv_function_3_0= rulefunction_heading ) ) )
            int alt48=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt48=1;
                }
                break;
            case 59:
                {
                alt48=2;
                }
                break;
            case 61:
                {
                alt48=3;
                }
                break;
            case 62:
                {
                alt48=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalPascal.g:3904:3: ( (lv_value_0_0= rulevalue_parameter_section ) )
                    {
                    // InternalPascal.g:3904:3: ( (lv_value_0_0= rulevalue_parameter_section ) )
                    // InternalPascal.g:3905:4: (lv_value_0_0= rulevalue_parameter_section )
                    {
                    // InternalPascal.g:3905:4: (lv_value_0_0= rulevalue_parameter_section )
                    // InternalPascal.g:3906:5: lv_value_0_0= rulevalue_parameter_section
                    {

                    					newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getValueValue_parameter_sectionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_0=rulevalue_parameter_section();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_0,
                    						"org.xtext.example.mydsl.Pascal.value_parameter_section");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:3924:3: ( (lv_variable_1_0= rulevariable_parameter_section ) )
                    {
                    // InternalPascal.g:3924:3: ( (lv_variable_1_0= rulevariable_parameter_section ) )
                    // InternalPascal.g:3925:4: (lv_variable_1_0= rulevariable_parameter_section )
                    {
                    // InternalPascal.g:3925:4: (lv_variable_1_0= rulevariable_parameter_section )
                    // InternalPascal.g:3926:5: lv_variable_1_0= rulevariable_parameter_section
                    {

                    					newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getVariableVariable_parameter_sectionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_variable_1_0=rulevariable_parameter_section();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                    					}
                    					set(
                    						current,
                    						"variable",
                    						lv_variable_1_0,
                    						"org.xtext.example.mydsl.Pascal.variable_parameter_section");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:3944:3: ( (lv_procedure_2_0= ruleprocedure_heading ) )
                    {
                    // InternalPascal.g:3944:3: ( (lv_procedure_2_0= ruleprocedure_heading ) )
                    // InternalPascal.g:3945:4: (lv_procedure_2_0= ruleprocedure_heading )
                    {
                    // InternalPascal.g:3945:4: (lv_procedure_2_0= ruleprocedure_heading )
                    // InternalPascal.g:3946:5: lv_procedure_2_0= ruleprocedure_heading
                    {

                    					newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getProcedureProcedure_headingParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_procedure_2_0=ruleprocedure_heading();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                    					}
                    					set(
                    						current,
                    						"procedure",
                    						lv_procedure_2_0,
                    						"org.xtext.example.mydsl.Pascal.procedure_heading");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:3964:3: ( (lv_function_3_0= rulefunction_heading ) )
                    {
                    // InternalPascal.g:3964:3: ( (lv_function_3_0= rulefunction_heading ) )
                    // InternalPascal.g:3965:4: (lv_function_3_0= rulefunction_heading )
                    {
                    // InternalPascal.g:3965:4: (lv_function_3_0= rulefunction_heading )
                    // InternalPascal.g:3966:5: lv_function_3_0= rulefunction_heading
                    {

                    					newCompositeNode(grammarAccess.getFormal_parameter_sectionAccess().getFunctionFunction_headingParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_function_3_0=rulefunction_heading();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFormal_parameter_sectionRule());
                    					}
                    					set(
                    						current,
                    						"function",
                    						lv_function_3_0,
                    						"org.xtext.example.mydsl.Pascal.function_heading");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleformal_parameter_section"


    // $ANTLR start "entryRulevalue_parameter_section"
    // InternalPascal.g:3987:1: entryRulevalue_parameter_section returns [EObject current=null] : iv_rulevalue_parameter_section= rulevalue_parameter_section EOF ;
    public final EObject entryRulevalue_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevalue_parameter_section = null;


        try {
            // InternalPascal.g:3987:64: (iv_rulevalue_parameter_section= rulevalue_parameter_section EOF )
            // InternalPascal.g:3988:2: iv_rulevalue_parameter_section= rulevalue_parameter_section EOF
            {
             newCompositeNode(grammarAccess.getValue_parameter_sectionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevalue_parameter_section=rulevalue_parameter_section();

            state._fsp--;

             current =iv_rulevalue_parameter_section; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevalue_parameter_section"


    // $ANTLR start "rulevalue_parameter_section"
    // InternalPascal.g:3994:1: rulevalue_parameter_section returns [EObject current=null] : ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) ) ) ;
    public final EObject rulevalue_parameter_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_identifiers_0_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4000:2: ( ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) ) ) )
            // InternalPascal.g:4001:2: ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) ) )
            {
            // InternalPascal.g:4001:2: ( ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) ) )
            // InternalPascal.g:4002:3: ( (lv_identifiers_0_0= ruleidentifier_list ) ) otherlv_1= ':' ( (lv_type_2_0= ruleparameter_type ) )
            {
            // InternalPascal.g:4002:3: ( (lv_identifiers_0_0= ruleidentifier_list ) )
            // InternalPascal.g:4003:4: (lv_identifiers_0_0= ruleidentifier_list )
            {
            // InternalPascal.g:4003:4: (lv_identifiers_0_0= ruleidentifier_list )
            // InternalPascal.g:4004:5: lv_identifiers_0_0= ruleidentifier_list
            {

            					newCompositeNode(grammarAccess.getValue_parameter_sectionAccess().getIdentifiersIdentifier_listParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_identifiers_0_0=ruleidentifier_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValue_parameter_sectionRule());
            					}
            					set(
            						current,
            						"identifiers",
            						lv_identifiers_0_0,
            						"org.xtext.example.mydsl.Pascal.identifier_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getValue_parameter_sectionAccess().getColonKeyword_1());
            		
            // InternalPascal.g:4025:3: ( (lv_type_2_0= ruleparameter_type ) )
            // InternalPascal.g:4026:4: (lv_type_2_0= ruleparameter_type )
            {
            // InternalPascal.g:4026:4: (lv_type_2_0= ruleparameter_type )
            // InternalPascal.g:4027:5: lv_type_2_0= ruleparameter_type
            {

            					newCompositeNode(grammarAccess.getValue_parameter_sectionAccess().getTypeParameter_typeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleparameter_type();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValue_parameter_sectionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.example.mydsl.Pascal.parameter_type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevalue_parameter_section"


    // $ANTLR start "entryRuleparameter_type"
    // InternalPascal.g:4048:1: entryRuleparameter_type returns [EObject current=null] : iv_ruleparameter_type= ruleparameter_type EOF ;
    public final EObject entryRuleparameter_type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparameter_type = null;


        try {
            // InternalPascal.g:4048:55: (iv_ruleparameter_type= ruleparameter_type EOF )
            // InternalPascal.g:4049:2: iv_ruleparameter_type= ruleparameter_type EOF
            {
             newCompositeNode(grammarAccess.getParameter_typeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleparameter_type=ruleparameter_type();

            state._fsp--;

             current =iv_ruleparameter_type; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleparameter_type"


    // $ANTLR start "ruleparameter_type"
    // InternalPascal.g:4055:1: ruleparameter_type returns [EObject current=null] : ( ( (lv_array_0_0= ruleconformant_array_schema ) ) | ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleparameter_type() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_array_0_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4061:2: ( ( ( (lv_array_0_0= ruleconformant_array_schema ) ) | ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalPascal.g:4062:2: ( ( (lv_array_0_0= ruleconformant_array_schema ) ) | ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalPascal.g:4062:2: ( ( (lv_array_0_0= ruleconformant_array_schema ) ) | ( (lv_name_1_0= RULE_ID ) ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=55 && LA49_0<=56)) ) {
                alt49=1;
            }
            else if ( (LA49_0==RULE_ID) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalPascal.g:4063:3: ( (lv_array_0_0= ruleconformant_array_schema ) )
                    {
                    // InternalPascal.g:4063:3: ( (lv_array_0_0= ruleconformant_array_schema ) )
                    // InternalPascal.g:4064:4: (lv_array_0_0= ruleconformant_array_schema )
                    {
                    // InternalPascal.g:4064:4: (lv_array_0_0= ruleconformant_array_schema )
                    // InternalPascal.g:4065:5: lv_array_0_0= ruleconformant_array_schema
                    {

                    					newCompositeNode(grammarAccess.getParameter_typeAccess().getArrayConformant_array_schemaParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_array_0_0=ruleconformant_array_schema();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParameter_typeRule());
                    					}
                    					set(
                    						current,
                    						"array",
                    						lv_array_0_0,
                    						"org.xtext.example.mydsl.Pascal.conformant_array_schema");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:4083:3: ( (lv_name_1_0= RULE_ID ) )
                    {
                    // InternalPascal.g:4083:3: ( (lv_name_1_0= RULE_ID ) )
                    // InternalPascal.g:4084:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalPascal.g:4084:4: (lv_name_1_0= RULE_ID )
                    // InternalPascal.g:4085:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getParameter_typeAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameter_typeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleparameter_type"


    // $ANTLR start "entryRuleconformant_array_schema"
    // InternalPascal.g:4105:1: entryRuleconformant_array_schema returns [EObject current=null] : iv_ruleconformant_array_schema= ruleconformant_array_schema EOF ;
    public final EObject entryRuleconformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconformant_array_schema = null;


        try {
            // InternalPascal.g:4105:64: (iv_ruleconformant_array_schema= ruleconformant_array_schema EOF )
            // InternalPascal.g:4106:2: iv_ruleconformant_array_schema= ruleconformant_array_schema EOF
            {
             newCompositeNode(grammarAccess.getConformant_array_schemaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleconformant_array_schema=ruleconformant_array_schema();

            state._fsp--;

             current =iv_ruleconformant_array_schema; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconformant_array_schema"


    // $ANTLR start "ruleconformant_array_schema"
    // InternalPascal.g:4112:1: ruleconformant_array_schema returns [EObject current=null] : ( ( (lv_packed_0_0= rulepacked_conformant_array_schema ) ) | ( (lv_unpacked_1_0= ruleunpacked_conformant_array_schema ) ) ) ;
    public final EObject ruleconformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject lv_packed_0_0 = null;

        EObject lv_unpacked_1_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4118:2: ( ( ( (lv_packed_0_0= rulepacked_conformant_array_schema ) ) | ( (lv_unpacked_1_0= ruleunpacked_conformant_array_schema ) ) ) )
            // InternalPascal.g:4119:2: ( ( (lv_packed_0_0= rulepacked_conformant_array_schema ) ) | ( (lv_unpacked_1_0= ruleunpacked_conformant_array_schema ) ) )
            {
            // InternalPascal.g:4119:2: ( ( (lv_packed_0_0= rulepacked_conformant_array_schema ) ) | ( (lv_unpacked_1_0= ruleunpacked_conformant_array_schema ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==55) ) {
                alt50=1;
            }
            else if ( (LA50_0==56) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalPascal.g:4120:3: ( (lv_packed_0_0= rulepacked_conformant_array_schema ) )
                    {
                    // InternalPascal.g:4120:3: ( (lv_packed_0_0= rulepacked_conformant_array_schema ) )
                    // InternalPascal.g:4121:4: (lv_packed_0_0= rulepacked_conformant_array_schema )
                    {
                    // InternalPascal.g:4121:4: (lv_packed_0_0= rulepacked_conformant_array_schema )
                    // InternalPascal.g:4122:5: lv_packed_0_0= rulepacked_conformant_array_schema
                    {

                    					newCompositeNode(grammarAccess.getConformant_array_schemaAccess().getPackedPacked_conformant_array_schemaParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_packed_0_0=rulepacked_conformant_array_schema();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConformant_array_schemaRule());
                    					}
                    					set(
                    						current,
                    						"packed",
                    						lv_packed_0_0,
                    						"org.xtext.example.mydsl.Pascal.packed_conformant_array_schema");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:4140:3: ( (lv_unpacked_1_0= ruleunpacked_conformant_array_schema ) )
                    {
                    // InternalPascal.g:4140:3: ( (lv_unpacked_1_0= ruleunpacked_conformant_array_schema ) )
                    // InternalPascal.g:4141:4: (lv_unpacked_1_0= ruleunpacked_conformant_array_schema )
                    {
                    // InternalPascal.g:4141:4: (lv_unpacked_1_0= ruleunpacked_conformant_array_schema )
                    // InternalPascal.g:4142:5: lv_unpacked_1_0= ruleunpacked_conformant_array_schema
                    {

                    					newCompositeNode(grammarAccess.getConformant_array_schemaAccess().getUnpackedUnpacked_conformant_array_schemaParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_unpacked_1_0=ruleunpacked_conformant_array_schema();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConformant_array_schemaRule());
                    					}
                    					set(
                    						current,
                    						"unpacked",
                    						lv_unpacked_1_0,
                    						"org.xtext.example.mydsl.Pascal.unpacked_conformant_array_schema");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconformant_array_schema"


    // $ANTLR start "entryRulepacked_conformant_array_schema"
    // InternalPascal.g:4163:1: entryRulepacked_conformant_array_schema returns [EObject current=null] : iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF ;
    public final EObject entryRulepacked_conformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepacked_conformant_array_schema = null;


        try {
            // InternalPascal.g:4163:71: (iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF )
            // InternalPascal.g:4164:2: iv_rulepacked_conformant_array_schema= rulepacked_conformant_array_schema EOF
            {
             newCompositeNode(grammarAccess.getPacked_conformant_array_schemaRule()); 
            pushFollow(FOLLOW_1);
            iv_rulepacked_conformant_array_schema=rulepacked_conformant_array_schema();

            state._fsp--;

             current =iv_rulepacked_conformant_array_schema; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepacked_conformant_array_schema"


    // $ANTLR start "rulepacked_conformant_array_schema"
    // InternalPascal.g:4170:1: rulepacked_conformant_array_schema returns [EObject current=null] : (otherlv_0= 'packed' otherlv_1= 'array' otherlv_2= '[' ( (lv_bound_3_0= rulebound_specification ) ) otherlv_4= ']' otherlv_5= 'of' ( (lv_name_6_0= RULE_ID ) ) ) ;
    public final EObject rulepacked_conformant_array_schema() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        EObject lv_bound_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4176:2: ( (otherlv_0= 'packed' otherlv_1= 'array' otherlv_2= '[' ( (lv_bound_3_0= rulebound_specification ) ) otherlv_4= ']' otherlv_5= 'of' ( (lv_name_6_0= RULE_ID ) ) ) )
            // InternalPascal.g:4177:2: (otherlv_0= 'packed' otherlv_1= 'array' otherlv_2= '[' ( (lv_bound_3_0= rulebound_specification ) ) otherlv_4= ']' otherlv_5= 'of' ( (lv_name_6_0= RULE_ID ) ) )
            {
            // InternalPascal.g:4177:2: (otherlv_0= 'packed' otherlv_1= 'array' otherlv_2= '[' ( (lv_bound_3_0= rulebound_specification ) ) otherlv_4= ']' otherlv_5= 'of' ( (lv_name_6_0= RULE_ID ) ) )
            // InternalPascal.g:4178:3: otherlv_0= 'packed' otherlv_1= 'array' otherlv_2= '[' ( (lv_bound_3_0= rulebound_specification ) ) otherlv_4= ']' otherlv_5= 'of' ( (lv_name_6_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_45); 

            			newLeafNode(otherlv_0, grammarAccess.getPacked_conformant_array_schemaAccess().getPackedKeyword_0());
            		
            otherlv_1=(Token)match(input,56,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getPacked_conformant_array_schemaAccess().getArrayKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPacked_conformant_array_schemaAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalPascal.g:4190:3: ( (lv_bound_3_0= rulebound_specification ) )
            // InternalPascal.g:4191:4: (lv_bound_3_0= rulebound_specification )
            {
            // InternalPascal.g:4191:4: (lv_bound_3_0= rulebound_specification )
            // InternalPascal.g:4192:5: lv_bound_3_0= rulebound_specification
            {

            					newCompositeNode(grammarAccess.getPacked_conformant_array_schemaAccess().getBoundBound_specificationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_bound_3_0=rulebound_specification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPacked_conformant_array_schemaRule());
            					}
            					set(
            						current,
            						"bound",
            						lv_bound_3_0,
            						"org.xtext.example.mydsl.Pascal.bound_specification");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_38); 

            			newLeafNode(otherlv_4, grammarAccess.getPacked_conformant_array_schemaAccess().getRightSquareBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,57,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getPacked_conformant_array_schemaAccess().getOfKeyword_5());
            		
            // InternalPascal.g:4217:3: ( (lv_name_6_0= RULE_ID ) )
            // InternalPascal.g:4218:4: (lv_name_6_0= RULE_ID )
            {
            // InternalPascal.g:4218:4: (lv_name_6_0= RULE_ID )
            // InternalPascal.g:4219:5: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_6_0, grammarAccess.getPacked_conformant_array_schemaAccess().getNameIDTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPacked_conformant_array_schemaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulepacked_conformant_array_schema"


    // $ANTLR start "entryRulebound_specification"
    // InternalPascal.g:4239:1: entryRulebound_specification returns [EObject current=null] : iv_rulebound_specification= rulebound_specification EOF ;
    public final EObject entryRulebound_specification() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebound_specification = null;


        try {
            // InternalPascal.g:4239:60: (iv_rulebound_specification= rulebound_specification EOF )
            // InternalPascal.g:4240:2: iv_rulebound_specification= rulebound_specification EOF
            {
             newCompositeNode(grammarAccess.getBound_specificationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulebound_specification=rulebound_specification();

            state._fsp--;

             current =iv_rulebound_specification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulebound_specification"


    // $ANTLR start "rulebound_specification"
    // InternalPascal.g:4246:1: rulebound_specification returns [EObject current=null] : ( ( (lv_initial_0_0= RULE_ID ) ) otherlv_1= '..' ( (lv_final_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) ) ;
    public final EObject rulebound_specification() throws RecognitionException {
        EObject current = null;

        Token lv_initial_0_0=null;
        Token otherlv_1=null;
        Token lv_final_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;


        	enterRule();

        try {
            // InternalPascal.g:4252:2: ( ( ( (lv_initial_0_0= RULE_ID ) ) otherlv_1= '..' ( (lv_final_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) ) )
            // InternalPascal.g:4253:2: ( ( (lv_initial_0_0= RULE_ID ) ) otherlv_1= '..' ( (lv_final_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) )
            {
            // InternalPascal.g:4253:2: ( ( (lv_initial_0_0= RULE_ID ) ) otherlv_1= '..' ( (lv_final_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) )
            // InternalPascal.g:4254:3: ( (lv_initial_0_0= RULE_ID ) ) otherlv_1= '..' ( (lv_final_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) )
            {
            // InternalPascal.g:4254:3: ( (lv_initial_0_0= RULE_ID ) )
            // InternalPascal.g:4255:4: (lv_initial_0_0= RULE_ID )
            {
            // InternalPascal.g:4255:4: (lv_initial_0_0= RULE_ID )
            // InternalPascal.g:4256:5: lv_initial_0_0= RULE_ID
            {
            lv_initial_0_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(lv_initial_0_0, grammarAccess.getBound_specificationAccess().getInitialIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBound_specificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"initial",
            						lv_initial_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,54,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getBound_specificationAccess().getFullStopFullStopKeyword_1());
            		
            // InternalPascal.g:4276:3: ( (lv_final_2_0= RULE_ID ) )
            // InternalPascal.g:4277:4: (lv_final_2_0= RULE_ID )
            {
            // InternalPascal.g:4277:4: (lv_final_2_0= RULE_ID )
            // InternalPascal.g:4278:5: lv_final_2_0= RULE_ID
            {
            lv_final_2_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_final_2_0, grammarAccess.getBound_specificationAccess().getFinalIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBound_specificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"final",
            						lv_final_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getBound_specificationAccess().getColonKeyword_3());
            		
            // InternalPascal.g:4298:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalPascal.g:4299:4: (lv_name_4_0= RULE_ID )
            {
            // InternalPascal.g:4299:4: (lv_name_4_0= RULE_ID )
            // InternalPascal.g:4300:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_4_0, grammarAccess.getBound_specificationAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBound_specificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulebound_specification"


    // $ANTLR start "entryRuleunpacked_conformant_array_schema"
    // InternalPascal.g:4320:1: entryRuleunpacked_conformant_array_schema returns [EObject current=null] : iv_ruleunpacked_conformant_array_schema= ruleunpacked_conformant_array_schema EOF ;
    public final EObject entryRuleunpacked_conformant_array_schema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunpacked_conformant_array_schema = null;


        try {
            // InternalPascal.g:4320:73: (iv_ruleunpacked_conformant_array_schema= ruleunpacked_conformant_array_schema EOF )
            // InternalPascal.g:4321:2: iv_ruleunpacked_conformant_array_schema= ruleunpacked_conformant_array_schema EOF
            {
             newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleunpacked_conformant_array_schema=ruleunpacked_conformant_array_schema();

            state._fsp--;

             current =iv_ruleunpacked_conformant_array_schema; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunpacked_conformant_array_schema"


    // $ANTLR start "ruleunpacked_conformant_array_schema"
    // InternalPascal.g:4327:1: ruleunpacked_conformant_array_schema returns [EObject current=null] : (otherlv_0= 'array' otherlv_1= '[' ( (lv_bounds_2_0= rulebound_specification ) ) (otherlv_3= ';' ( (lv_bounds_4_0= rulebound_specification ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruleparameter_type ) ) ) ;
    public final EObject ruleunpacked_conformant_array_schema() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_bounds_2_0 = null;

        EObject lv_bounds_4_0 = null;

        EObject lv_type_7_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4333:2: ( (otherlv_0= 'array' otherlv_1= '[' ( (lv_bounds_2_0= rulebound_specification ) ) (otherlv_3= ';' ( (lv_bounds_4_0= rulebound_specification ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruleparameter_type ) ) ) )
            // InternalPascal.g:4334:2: (otherlv_0= 'array' otherlv_1= '[' ( (lv_bounds_2_0= rulebound_specification ) ) (otherlv_3= ';' ( (lv_bounds_4_0= rulebound_specification ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruleparameter_type ) ) )
            {
            // InternalPascal.g:4334:2: (otherlv_0= 'array' otherlv_1= '[' ( (lv_bounds_2_0= rulebound_specification ) ) (otherlv_3= ';' ( (lv_bounds_4_0= rulebound_specification ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruleparameter_type ) ) )
            // InternalPascal.g:4335:3: otherlv_0= 'array' otherlv_1= '[' ( (lv_bounds_2_0= rulebound_specification ) ) (otherlv_3= ';' ( (lv_bounds_4_0= rulebound_specification ) ) )* otherlv_5= ']' otherlv_6= 'of' ( (lv_type_7_0= ruleparameter_type ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getUnpacked_conformant_array_schemaAccess().getArrayKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getUnpacked_conformant_array_schemaAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalPascal.g:4343:3: ( (lv_bounds_2_0= rulebound_specification ) )
            // InternalPascal.g:4344:4: (lv_bounds_2_0= rulebound_specification )
            {
            // InternalPascal.g:4344:4: (lv_bounds_2_0= rulebound_specification )
            // InternalPascal.g:4345:5: lv_bounds_2_0= rulebound_specification
            {

            					newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaAccess().getBoundsBound_specificationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_46);
            lv_bounds_2_0=rulebound_specification();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnpacked_conformant_array_schemaRule());
            					}
            					add(
            						current,
            						"bounds",
            						lv_bounds_2_0,
            						"org.xtext.example.mydsl.Pascal.bound_specification");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPascal.g:4362:3: (otherlv_3= ';' ( (lv_bounds_4_0= rulebound_specification ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==26) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalPascal.g:4363:4: otherlv_3= ';' ( (lv_bounds_4_0= rulebound_specification ) )
            	    {
            	    otherlv_3=(Token)match(input,26,FOLLOW_5); 

            	    				newLeafNode(otherlv_3, grammarAccess.getUnpacked_conformant_array_schemaAccess().getSemicolonKeyword_3_0());
            	    			
            	    // InternalPascal.g:4367:4: ( (lv_bounds_4_0= rulebound_specification ) )
            	    // InternalPascal.g:4368:5: (lv_bounds_4_0= rulebound_specification )
            	    {
            	    // InternalPascal.g:4368:5: (lv_bounds_4_0= rulebound_specification )
            	    // InternalPascal.g:4369:6: lv_bounds_4_0= rulebound_specification
            	    {

            	    						newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaAccess().getBoundsBound_specificationParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_46);
            	    lv_bounds_4_0=rulebound_specification();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUnpacked_conformant_array_schemaRule());
            	    						}
            	    						add(
            	    							current,
            	    							"bounds",
            	    							lv_bounds_4_0,
            	    							"org.xtext.example.mydsl.Pascal.bound_specification");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            otherlv_5=(Token)match(input,33,FOLLOW_38); 

            			newLeafNode(otherlv_5, grammarAccess.getUnpacked_conformant_array_schemaAccess().getRightSquareBracketKeyword_4());
            		
            otherlv_6=(Token)match(input,57,FOLLOW_44); 

            			newLeafNode(otherlv_6, grammarAccess.getUnpacked_conformant_array_schemaAccess().getOfKeyword_5());
            		
            // InternalPascal.g:4395:3: ( (lv_type_7_0= ruleparameter_type ) )
            // InternalPascal.g:4396:4: (lv_type_7_0= ruleparameter_type )
            {
            // InternalPascal.g:4396:4: (lv_type_7_0= ruleparameter_type )
            // InternalPascal.g:4397:5: lv_type_7_0= ruleparameter_type
            {

            					newCompositeNode(grammarAccess.getUnpacked_conformant_array_schemaAccess().getTypeParameter_typeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_7_0=ruleparameter_type();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnpacked_conformant_array_schemaRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_7_0,
            						"org.xtext.example.mydsl.Pascal.parameter_type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunpacked_conformant_array_schema"


    // $ANTLR start "entryRulevariable_parameter_section"
    // InternalPascal.g:4418:1: entryRulevariable_parameter_section returns [EObject current=null] : iv_rulevariable_parameter_section= rulevariable_parameter_section EOF ;
    public final EObject entryRulevariable_parameter_section() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevariable_parameter_section = null;


        try {
            // InternalPascal.g:4418:67: (iv_rulevariable_parameter_section= rulevariable_parameter_section EOF )
            // InternalPascal.g:4419:2: iv_rulevariable_parameter_section= rulevariable_parameter_section EOF
            {
             newCompositeNode(grammarAccess.getVariable_parameter_sectionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevariable_parameter_section=rulevariable_parameter_section();

            state._fsp--;

             current =iv_rulevariable_parameter_section; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevariable_parameter_section"


    // $ANTLR start "rulevariable_parameter_section"
    // InternalPascal.g:4425:1: rulevariable_parameter_section returns [EObject current=null] : (otherlv_0= 'var' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) ) ) ;
    public final EObject rulevariable_parameter_section() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_identifiers_1_0 = null;

        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4431:2: ( (otherlv_0= 'var' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) ) ) )
            // InternalPascal.g:4432:2: (otherlv_0= 'var' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) ) )
            {
            // InternalPascal.g:4432:2: (otherlv_0= 'var' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) ) )
            // InternalPascal.g:4433:3: otherlv_0= 'var' ( (lv_identifiers_1_0= ruleidentifier_list ) ) otherlv_2= ':' ( (lv_type_3_0= ruleparameter_type ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVariable_parameter_sectionAccess().getVarKeyword_0());
            		
            // InternalPascal.g:4437:3: ( (lv_identifiers_1_0= ruleidentifier_list ) )
            // InternalPascal.g:4438:4: (lv_identifiers_1_0= ruleidentifier_list )
            {
            // InternalPascal.g:4438:4: (lv_identifiers_1_0= ruleidentifier_list )
            // InternalPascal.g:4439:5: lv_identifiers_1_0= ruleidentifier_list
            {

            					newCompositeNode(grammarAccess.getVariable_parameter_sectionAccess().getIdentifiersIdentifier_listParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_identifiers_1_0=ruleidentifier_list();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariable_parameter_sectionRule());
            					}
            					set(
            						current,
            						"identifiers",
            						lv_identifiers_1_0,
            						"org.xtext.example.mydsl.Pascal.identifier_list");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_44); 

            			newLeafNode(otherlv_2, grammarAccess.getVariable_parameter_sectionAccess().getColonKeyword_2());
            		
            // InternalPascal.g:4460:3: ( (lv_type_3_0= ruleparameter_type ) )
            // InternalPascal.g:4461:4: (lv_type_3_0= ruleparameter_type )
            {
            // InternalPascal.g:4461:4: (lv_type_3_0= ruleparameter_type )
            // InternalPascal.g:4462:5: lv_type_3_0= ruleparameter_type
            {

            					newCompositeNode(grammarAccess.getVariable_parameter_sectionAccess().getTypeParameter_typeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleparameter_type();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariable_parameter_sectionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.example.mydsl.Pascal.parameter_type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevariable_parameter_section"


    // $ANTLR start "entryRulefunction_heading"
    // InternalPascal.g:4483:1: entryRulefunction_heading returns [EObject current=null] : iv_rulefunction_heading= rulefunction_heading EOF ;
    public final EObject entryRulefunction_heading() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_heading = null;


        try {
            // InternalPascal.g:4483:57: (iv_rulefunction_heading= rulefunction_heading EOF )
            // InternalPascal.g:4484:2: iv_rulefunction_heading= rulefunction_heading EOF
            {
             newCompositeNode(grammarAccess.getFunction_headingRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefunction_heading=rulefunction_heading();

            state._fsp--;

             current =iv_rulefunction_heading; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefunction_heading"


    // $ANTLR start "rulefunction_heading"
    // InternalPascal.g:4490:1: rulefunction_heading returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_returnType_4_0= RULE_ID ) ) ) ;
    public final EObject rulefunction_heading() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token lv_returnType_4_0=null;
        EObject lv_parameters_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4496:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_returnType_4_0= RULE_ID ) ) ) )
            // InternalPascal.g:4497:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_returnType_4_0= RULE_ID ) ) )
            {
            // InternalPascal.g:4497:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_returnType_4_0= RULE_ID ) ) )
            // InternalPascal.g:4498:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? otherlv_3= ':' ( (lv_returnType_4_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,62,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getFunction_headingAccess().getFunctionKeyword_0());
            		
            // InternalPascal.g:4502:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPascal.g:4503:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPascal.g:4503:4: (lv_name_1_0= RULE_ID )
            // InternalPascal.g:4504:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_47); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFunction_headingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunction_headingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPascal.g:4520:3: ( (lv_parameters_2_0= ruleformal_parameter_list ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==24) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalPascal.g:4521:4: (lv_parameters_2_0= ruleformal_parameter_list )
                    {
                    // InternalPascal.g:4521:4: (lv_parameters_2_0= ruleformal_parameter_list )
                    // InternalPascal.g:4522:5: lv_parameters_2_0= ruleformal_parameter_list
                    {

                    					newCompositeNode(grammarAccess.getFunction_headingAccess().getParametersFormal_parameter_listParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_parameters_2_0=ruleformal_parameter_list();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunction_headingRule());
                    					}
                    					set(
                    						current,
                    						"parameters",
                    						lv_parameters_2_0,
                    						"org.xtext.example.mydsl.Pascal.formal_parameter_list");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getFunction_headingAccess().getColonKeyword_3());
            		
            // InternalPascal.g:4543:3: ( (lv_returnType_4_0= RULE_ID ) )
            // InternalPascal.g:4544:4: (lv_returnType_4_0= RULE_ID )
            {
            // InternalPascal.g:4544:4: (lv_returnType_4_0= RULE_ID )
            // InternalPascal.g:4545:5: lv_returnType_4_0= RULE_ID
            {
            lv_returnType_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_returnType_4_0, grammarAccess.getFunction_headingAccess().getReturnTypeIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunction_headingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"returnType",
            						lv_returnType_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefunction_heading"


    // $ANTLR start "entryRulefunction_declaration"
    // InternalPascal.g:4565:1: entryRulefunction_declaration returns [EObject current=null] : iv_rulefunction_declaration= rulefunction_declaration EOF ;
    public final EObject entryRulefunction_declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction_declaration = null;


        try {
            // InternalPascal.g:4565:61: (iv_rulefunction_declaration= rulefunction_declaration EOF )
            // InternalPascal.g:4566:2: iv_rulefunction_declaration= rulefunction_declaration EOF
            {
             newCompositeNode(grammarAccess.getFunction_declarationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefunction_declaration=rulefunction_declaration();

            state._fsp--;

             current =iv_rulefunction_declaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefunction_declaration"


    // $ANTLR start "rulefunction_declaration"
    // InternalPascal.g:4572:1: rulefunction_declaration returns [EObject current=null] : ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) ) ) ;
    public final EObject rulefunction_declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_forward_3_0=null;
        EObject lv_heading_0_0 = null;

        EObject lv_block_2_0 = null;



        	enterRule();

        try {
            // InternalPascal.g:4578:2: ( ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) ) ) )
            // InternalPascal.g:4579:2: ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) ) )
            {
            // InternalPascal.g:4579:2: ( ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) ) )
            // InternalPascal.g:4580:3: ( (lv_heading_0_0= rulefunction_heading ) ) otherlv_1= ';' ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) )
            {
            // InternalPascal.g:4580:3: ( (lv_heading_0_0= rulefunction_heading ) )
            // InternalPascal.g:4581:4: (lv_heading_0_0= rulefunction_heading )
            {
            // InternalPascal.g:4581:4: (lv_heading_0_0= rulefunction_heading )
            // InternalPascal.g:4582:5: lv_heading_0_0= rulefunction_heading
            {

            					newCompositeNode(grammarAccess.getFunction_declarationAccess().getHeadingFunction_headingParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_heading_0_0=rulefunction_heading();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunction_declarationRule());
            					}
            					set(
            						current,
            						"heading",
            						lv_heading_0_0,
            						"org.xtext.example.mydsl.Pascal.function_heading");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getFunction_declarationAccess().getSemicolonKeyword_1());
            		
            // InternalPascal.g:4603:3: ( ( (lv_block_2_0= ruleblock ) ) | ( (lv_forward_3_0= 'forward' ) ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==28||(LA53_0>=52 && LA53_0<=53)||LA53_0==59||(LA53_0>=61 && LA53_0<=62)) ) {
                alt53=1;
            }
            else if ( (LA53_0==60) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalPascal.g:4604:4: ( (lv_block_2_0= ruleblock ) )
                    {
                    // InternalPascal.g:4604:4: ( (lv_block_2_0= ruleblock ) )
                    // InternalPascal.g:4605:5: (lv_block_2_0= ruleblock )
                    {
                    // InternalPascal.g:4605:5: (lv_block_2_0= ruleblock )
                    // InternalPascal.g:4606:6: lv_block_2_0= ruleblock
                    {

                    						newCompositeNode(grammarAccess.getFunction_declarationAccess().getBlockBlockParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_block_2_0=ruleblock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunction_declarationRule());
                    						}
                    						set(
                    							current,
                    							"block",
                    							lv_block_2_0,
                    							"org.xtext.example.mydsl.Pascal.block");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:4624:4: ( (lv_forward_3_0= 'forward' ) )
                    {
                    // InternalPascal.g:4624:4: ( (lv_forward_3_0= 'forward' ) )
                    // InternalPascal.g:4625:5: (lv_forward_3_0= 'forward' )
                    {
                    // InternalPascal.g:4625:5: (lv_forward_3_0= 'forward' )
                    // InternalPascal.g:4626:6: lv_forward_3_0= 'forward'
                    {
                    lv_forward_3_0=(Token)match(input,60,FOLLOW_2); 

                    						newLeafNode(lv_forward_3_0, grammarAccess.getFunction_declarationAccess().getForwardForwardKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFunction_declarationRule());
                    						}
                    						setWithLastConsumed(current, "forward", true, "forward");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefunction_declaration"

    // Delegated rules


    protected DFA21 dfa21 = new DFA21(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\uffff\1\13\12\uffff";
    static final String dfa_3s = "\1\4\1\6\12\uffff";
    static final String dfa_4s = "\1\54\1\63\12\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\11\1\12\1\10\1\1";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\2\3\uffff\1\3\2\2\13\uffff\1\10\7\uffff\1\4\10\uffff\1\5\1\6\1\7\1\11",
            "\4\13\1\uffff\1\13\12\uffff\1\13\1\uffff\1\12\3\13\1\uffff\1\13\2\uffff\11\13\5\uffff\3\13\1\uffff\2\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1454:2: ( ( (lv_variable_0_0= rulevariable ) ) | ( (lv_number_1_0= rulenumber ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_set_3_0= ruleset ) ) | ( (lv_nil_4_0= 'nil' ) ) | ( (lv_boolean_5_0= 'true' ) ) | ( (lv_boolean_6_0= 'false' ) ) | ( (lv_function_7_0= rulefunction_designator ) ) | (otherlv_8= '(' ( (lv_expression_9_0= ruleexpression ) ) otherlv_10= ')' ) | (otherlv_11= 'not' ( (lv_not_12_0= rulefactor ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x6830000010000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0002200010000070L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00001E0101001D70L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000500400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001800000082L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002000000942L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000001C000000202L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00001E0301001D70L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00001E0103001D70L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000001870L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000E0000001D70L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x05800E0401003D70L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0580000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000E0001003D70L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000208000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x7830000010000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x6800000000000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0180000000000010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000204000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000041000000L});

}