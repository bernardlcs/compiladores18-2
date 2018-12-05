package org.xtext.example.pascal.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.pascal.services.PascalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPascalParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SIGNED_INTEGER_NUMBER", "RULE_INTEGER_NUMBER", "RULE_RELATIONAL_OPERATOR", "RULE_ADDITION_OPERATOR", "RULE_MULTIPLICATION_OPERATOR", "RULE_STRING", "RULE_NUMERIC_SUBRANGE", "RULE_UNSIGNED_DIGIT_SEQUENCE", "RULE_DIGIT", "RULE_DIGIT_SEQUENCE", "RULE_ML_COMMENT", "RULE_INT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'to'", "'downto'", "'.'", "'program'", "';'", "'('", "')'", "','", "'begin'", "'end'", "':'", "':='", "'['", "']'", "'^'", "'not'", "'for'", "'do'", "'if'", "'then'", "'else'", "'const'", "'='", "'type'", "'..'", "'array'", "'of'", "'set'", "'var'", "'procedure'", "'packed'", "'function'", "'in'", "'or'", "'div'", "'mod'", "'and'", "'nil'", "'true'", "'false'", "'forward'"
    };
    public static final int T__50=50;
    public static final int RULE_UNSIGNED_DIGIT_SEQUENCE=12;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int RULE_NUMERIC_SUBRANGE=11;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int RULE_ID=4;
    public static final int RULE_DIGIT=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=16;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=15;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int RULE_INTEGER_NUMBER=6;
    public static final int T__21=21;
    public static final int RULE_RELATIONAL_OPERATOR=7;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=17;
    public static final int RULE_DIGIT_SEQUENCE=14;
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
    public static final int RULE_WS=18;
    public static final int RULE_MULTIPLICATION_OPERATOR=9;
    public static final int RULE_ANY_OTHER=19;
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

    	public void setGrammarAccess(PascalGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRulepascal"
    // InternalPascal.g:53:1: entryRulepascal : rulepascal EOF ;
    public final void entryRulepascal() throws RecognitionException {
        try {
            // InternalPascal.g:54:1: ( rulepascal EOF )
            // InternalPascal.g:55:1: rulepascal EOF
            {
             before(grammarAccess.getPascalRule()); 
            pushFollow(FOLLOW_1);
            rulepascal();

            state._fsp--;

             after(grammarAccess.getPascalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulepascal"


    // $ANTLR start "rulepascal"
    // InternalPascal.g:62:1: rulepascal : ( ( rule__Pascal__ProgramAssignment ) ) ;
    public final void rulepascal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:66:2: ( ( ( rule__Pascal__ProgramAssignment ) ) )
            // InternalPascal.g:67:2: ( ( rule__Pascal__ProgramAssignment ) )
            {
            // InternalPascal.g:67:2: ( ( rule__Pascal__ProgramAssignment ) )
            // InternalPascal.g:68:3: ( rule__Pascal__ProgramAssignment )
            {
             before(grammarAccess.getPascalAccess().getProgramAssignment()); 
            // InternalPascal.g:69:3: ( rule__Pascal__ProgramAssignment )
            // InternalPascal.g:69:4: rule__Pascal__ProgramAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Pascal__ProgramAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPascalAccess().getProgramAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulepascal"


    // $ANTLR start "entryRuleprogram"
    // InternalPascal.g:78:1: entryRuleprogram : ruleprogram EOF ;
    public final void entryRuleprogram() throws RecognitionException {
        try {
            // InternalPascal.g:79:1: ( ruleprogram EOF )
            // InternalPascal.g:80:1: ruleprogram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleprogram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleprogram"


    // $ANTLR start "ruleprogram"
    // InternalPascal.g:87:1: ruleprogram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleprogram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:91:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalPascal.g:92:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalPascal.g:92:2: ( ( rule__Program__Group__0 ) )
            // InternalPascal.g:93:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalPascal.g:94:3: ( rule__Program__Group__0 )
            // InternalPascal.g:94:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleprogram"


    // $ANTLR start "entryRuleprogram_heading_block"
    // InternalPascal.g:103:1: entryRuleprogram_heading_block : ruleprogram_heading_block EOF ;
    public final void entryRuleprogram_heading_block() throws RecognitionException {
        try {
            // InternalPascal.g:104:1: ( ruleprogram_heading_block EOF )
            // InternalPascal.g:105:1: ruleprogram_heading_block EOF
            {
             before(grammarAccess.getProgram_heading_blockRule()); 
            pushFollow(FOLLOW_1);
            ruleprogram_heading_block();

            state._fsp--;

             after(grammarAccess.getProgram_heading_blockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleprogram_heading_block"


    // $ANTLR start "ruleprogram_heading_block"
    // InternalPascal.g:112:1: ruleprogram_heading_block : ( ( rule__Program_heading_block__Group__0 ) ) ;
    public final void ruleprogram_heading_block() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:116:2: ( ( ( rule__Program_heading_block__Group__0 ) ) )
            // InternalPascal.g:117:2: ( ( rule__Program_heading_block__Group__0 ) )
            {
            // InternalPascal.g:117:2: ( ( rule__Program_heading_block__Group__0 ) )
            // InternalPascal.g:118:3: ( rule__Program_heading_block__Group__0 )
            {
             before(grammarAccess.getProgram_heading_blockAccess().getGroup()); 
            // InternalPascal.g:119:3: ( rule__Program_heading_block__Group__0 )
            // InternalPascal.g:119:4: rule__Program_heading_block__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program_heading_block__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgram_heading_blockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleprogram_heading_block"


    // $ANTLR start "entryRuleidentifier_list"
    // InternalPascal.g:128:1: entryRuleidentifier_list : ruleidentifier_list EOF ;
    public final void entryRuleidentifier_list() throws RecognitionException {
        try {
            // InternalPascal.g:129:1: ( ruleidentifier_list EOF )
            // InternalPascal.g:130:1: ruleidentifier_list EOF
            {
             before(grammarAccess.getIdentifier_listRule()); 
            pushFollow(FOLLOW_1);
            ruleidentifier_list();

            state._fsp--;

             after(grammarAccess.getIdentifier_listRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleidentifier_list"


    // $ANTLR start "ruleidentifier_list"
    // InternalPascal.g:137:1: ruleidentifier_list : ( ( rule__Identifier_list__Group__0 ) ) ;
    public final void ruleidentifier_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:141:2: ( ( ( rule__Identifier_list__Group__0 ) ) )
            // InternalPascal.g:142:2: ( ( rule__Identifier_list__Group__0 ) )
            {
            // InternalPascal.g:142:2: ( ( rule__Identifier_list__Group__0 ) )
            // InternalPascal.g:143:3: ( rule__Identifier_list__Group__0 )
            {
             before(grammarAccess.getIdentifier_listAccess().getGroup()); 
            // InternalPascal.g:144:3: ( rule__Identifier_list__Group__0 )
            // InternalPascal.g:144:4: rule__Identifier_list__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Identifier_list__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIdentifier_listAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleidentifier_list"


    // $ANTLR start "entryRuleblock"
    // InternalPascal.g:153:1: entryRuleblock : ruleblock EOF ;
    public final void entryRuleblock() throws RecognitionException {
        try {
            // InternalPascal.g:154:1: ( ruleblock EOF )
            // InternalPascal.g:155:1: ruleblock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleblock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleblock"


    // $ANTLR start "ruleblock"
    // InternalPascal.g:162:1: ruleblock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleblock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:166:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalPascal.g:167:2: ( ( rule__Block__Group__0 ) )
            {
            // InternalPascal.g:167:2: ( ( rule__Block__Group__0 ) )
            // InternalPascal.g:168:3: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // InternalPascal.g:169:3: ( rule__Block__Group__0 )
            // InternalPascal.g:169:4: rule__Block__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleblock"


    // $ANTLR start "entryRulestatement_part"
    // InternalPascal.g:178:1: entryRulestatement_part : rulestatement_part EOF ;
    public final void entryRulestatement_part() throws RecognitionException {
        try {
            // InternalPascal.g:179:1: ( rulestatement_part EOF )
            // InternalPascal.g:180:1: rulestatement_part EOF
            {
             before(grammarAccess.getStatement_partRule()); 
            pushFollow(FOLLOW_1);
            rulestatement_part();

            state._fsp--;

             after(grammarAccess.getStatement_partRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulestatement_part"


    // $ANTLR start "rulestatement_part"
    // InternalPascal.g:187:1: rulestatement_part : ( ( rule__Statement_part__Group__0 ) ) ;
    public final void rulestatement_part() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:191:2: ( ( ( rule__Statement_part__Group__0 ) ) )
            // InternalPascal.g:192:2: ( ( rule__Statement_part__Group__0 ) )
            {
            // InternalPascal.g:192:2: ( ( rule__Statement_part__Group__0 ) )
            // InternalPascal.g:193:3: ( rule__Statement_part__Group__0 )
            {
             before(grammarAccess.getStatement_partAccess().getGroup()); 
            // InternalPascal.g:194:3: ( rule__Statement_part__Group__0 )
            // InternalPascal.g:194:4: rule__Statement_part__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Statement_part__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatement_partAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulestatement_part"


    // $ANTLR start "entryRulestatement_sequence"
    // InternalPascal.g:203:1: entryRulestatement_sequence : rulestatement_sequence EOF ;
    public final void entryRulestatement_sequence() throws RecognitionException {
        try {
            // InternalPascal.g:204:1: ( rulestatement_sequence EOF )
            // InternalPascal.g:205:1: rulestatement_sequence EOF
            {
             before(grammarAccess.getStatement_sequenceRule()); 
            pushFollow(FOLLOW_1);
            rulestatement_sequence();

            state._fsp--;

             after(grammarAccess.getStatement_sequenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulestatement_sequence"


    // $ANTLR start "rulestatement_sequence"
    // InternalPascal.g:212:1: rulestatement_sequence : ( ( rule__Statement_sequence__Group__0 ) ) ;
    public final void rulestatement_sequence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:216:2: ( ( ( rule__Statement_sequence__Group__0 ) ) )
            // InternalPascal.g:217:2: ( ( rule__Statement_sequence__Group__0 ) )
            {
            // InternalPascal.g:217:2: ( ( rule__Statement_sequence__Group__0 ) )
            // InternalPascal.g:218:3: ( rule__Statement_sequence__Group__0 )
            {
             before(grammarAccess.getStatement_sequenceAccess().getGroup()); 
            // InternalPascal.g:219:3: ( rule__Statement_sequence__Group__0 )
            // InternalPascal.g:219:4: rule__Statement_sequence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Statement_sequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatement_sequenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulestatement_sequence"


    // $ANTLR start "entryRulestatement"
    // InternalPascal.g:228:1: entryRulestatement : rulestatement EOF ;
    public final void entryRulestatement() throws RecognitionException {
        try {
            // InternalPascal.g:229:1: ( rulestatement EOF )
            // InternalPascal.g:230:1: rulestatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            rulestatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulestatement"


    // $ANTLR start "rulestatement"
    // InternalPascal.g:237:1: rulestatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void rulestatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:241:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalPascal.g:242:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalPascal.g:242:2: ( ( rule__Statement__Group__0 ) )
            // InternalPascal.g:243:3: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // InternalPascal.g:244:3: ( rule__Statement__Group__0 )
            // InternalPascal.g:244:4: rule__Statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulestatement"


    // $ANTLR start "entryRulelabel"
    // InternalPascal.g:253:1: entryRulelabel : rulelabel EOF ;
    public final void entryRulelabel() throws RecognitionException {
        try {
            // InternalPascal.g:254:1: ( rulelabel EOF )
            // InternalPascal.g:255:1: rulelabel EOF
            {
             before(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            rulelabel();

            state._fsp--;

             after(grammarAccess.getLabelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulelabel"


    // $ANTLR start "rulelabel"
    // InternalPascal.g:262:1: rulelabel : ( ( rule__Label__Alternatives ) ) ;
    public final void rulelabel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:266:2: ( ( ( rule__Label__Alternatives ) ) )
            // InternalPascal.g:267:2: ( ( rule__Label__Alternatives ) )
            {
            // InternalPascal.g:267:2: ( ( rule__Label__Alternatives ) )
            // InternalPascal.g:268:3: ( rule__Label__Alternatives )
            {
             before(grammarAccess.getLabelAccess().getAlternatives()); 
            // InternalPascal.g:269:3: ( rule__Label__Alternatives )
            // InternalPascal.g:269:4: rule__Label__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Label__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulelabel"


    // $ANTLR start "entryRulesimple_statement"
    // InternalPascal.g:278:1: entryRulesimple_statement : rulesimple_statement EOF ;
    public final void entryRulesimple_statement() throws RecognitionException {
        try {
            // InternalPascal.g:279:1: ( rulesimple_statement EOF )
            // InternalPascal.g:280:1: rulesimple_statement EOF
            {
             before(grammarAccess.getSimple_statementRule()); 
            pushFollow(FOLLOW_1);
            rulesimple_statement();

            state._fsp--;

             after(grammarAccess.getSimple_statementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulesimple_statement"


    // $ANTLR start "rulesimple_statement"
    // InternalPascal.g:287:1: rulesimple_statement : ( ( rule__Simple_statement__Alternatives )? ) ;
    public final void rulesimple_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:291:2: ( ( ( rule__Simple_statement__Alternatives )? ) )
            // InternalPascal.g:292:2: ( ( rule__Simple_statement__Alternatives )? )
            {
            // InternalPascal.g:292:2: ( ( rule__Simple_statement__Alternatives )? )
            // InternalPascal.g:293:3: ( rule__Simple_statement__Alternatives )?
            {
             before(grammarAccess.getSimple_statementAccess().getAlternatives()); 
            // InternalPascal.g:294:3: ( rule__Simple_statement__Alternatives )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPascal.g:294:4: rule__Simple_statement__Alternatives
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_statement__Alternatives();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimple_statementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulesimple_statement"


    // $ANTLR start "entryRuleassignment_statement"
    // InternalPascal.g:303:1: entryRuleassignment_statement : ruleassignment_statement EOF ;
    public final void entryRuleassignment_statement() throws RecognitionException {
        try {
            // InternalPascal.g:304:1: ( ruleassignment_statement EOF )
            // InternalPascal.g:305:1: ruleassignment_statement EOF
            {
             before(grammarAccess.getAssignment_statementRule()); 
            pushFollow(FOLLOW_1);
            ruleassignment_statement();

            state._fsp--;

             after(grammarAccess.getAssignment_statementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleassignment_statement"


    // $ANTLR start "ruleassignment_statement"
    // InternalPascal.g:312:1: ruleassignment_statement : ( ( rule__Assignment_statement__Group__0 ) ) ;
    public final void ruleassignment_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:316:2: ( ( ( rule__Assignment_statement__Group__0 ) ) )
            // InternalPascal.g:317:2: ( ( rule__Assignment_statement__Group__0 ) )
            {
            // InternalPascal.g:317:2: ( ( rule__Assignment_statement__Group__0 ) )
            // InternalPascal.g:318:3: ( rule__Assignment_statement__Group__0 )
            {
             before(grammarAccess.getAssignment_statementAccess().getGroup()); 
            // InternalPascal.g:319:3: ( rule__Assignment_statement__Group__0 )
            // InternalPascal.g:319:4: rule__Assignment_statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment_statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignment_statementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleassignment_statement"


    // $ANTLR start "entryRulevariable"
    // InternalPascal.g:328:1: entryRulevariable : rulevariable EOF ;
    public final void entryRulevariable() throws RecognitionException {
        try {
            // InternalPascal.g:329:1: ( rulevariable EOF )
            // InternalPascal.g:330:1: rulevariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            rulevariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulevariable"


    // $ANTLR start "rulevariable"
    // InternalPascal.g:337:1: rulevariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void rulevariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:341:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalPascal.g:342:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalPascal.g:342:2: ( ( rule__Variable__Group__0 ) )
            // InternalPascal.g:343:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalPascal.g:344:3: ( rule__Variable__Group__0 )
            // InternalPascal.g:344:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulevariable"


    // $ANTLR start "entryRulevar_"
    // InternalPascal.g:353:1: entryRulevar_ : rulevar_ EOF ;
    public final void entryRulevar_() throws RecognitionException {
        try {
            // InternalPascal.g:354:1: ( rulevar_ EOF )
            // InternalPascal.g:355:1: rulevar_ EOF
            {
             before(grammarAccess.getVar_Rule()); 
            pushFollow(FOLLOW_1);
            rulevar_();

            state._fsp--;

             after(grammarAccess.getVar_Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulevar_"


    // $ANTLR start "rulevar_"
    // InternalPascal.g:362:1: rulevar_ : ( ( rule__Var___Alternatives )? ) ;
    public final void rulevar_() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:366:2: ( ( ( rule__Var___Alternatives )? ) )
            // InternalPascal.g:367:2: ( ( rule__Var___Alternatives )? )
            {
            // InternalPascal.g:367:2: ( ( rule__Var___Alternatives )? )
            // InternalPascal.g:368:3: ( rule__Var___Alternatives )?
            {
             before(grammarAccess.getVar_Access().getAlternatives()); 
            // InternalPascal.g:369:3: ( rule__Var___Alternatives )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22||LA2_0==32||LA2_0==34) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPascal.g:369:4: rule__Var___Alternatives
                    {
                    pushFollow(FOLLOW_2);
                    rule__Var___Alternatives();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVar_Access().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulevar_"


    // $ANTLR start "entryRuleexpression_list"
    // InternalPascal.g:378:1: entryRuleexpression_list : ruleexpression_list EOF ;
    public final void entryRuleexpression_list() throws RecognitionException {
        try {
            // InternalPascal.g:379:1: ( ruleexpression_list EOF )
            // InternalPascal.g:380:1: ruleexpression_list EOF
            {
             before(grammarAccess.getExpression_listRule()); 
            pushFollow(FOLLOW_1);
            ruleexpression_list();

            state._fsp--;

             after(grammarAccess.getExpression_listRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleexpression_list"


    // $ANTLR start "ruleexpression_list"
    // InternalPascal.g:387:1: ruleexpression_list : ( ( rule__Expression_list__Group__0 ) ) ;
    public final void ruleexpression_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:391:2: ( ( ( rule__Expression_list__Group__0 ) ) )
            // InternalPascal.g:392:2: ( ( rule__Expression_list__Group__0 ) )
            {
            // InternalPascal.g:392:2: ( ( rule__Expression_list__Group__0 ) )
            // InternalPascal.g:393:3: ( rule__Expression_list__Group__0 )
            {
             before(grammarAccess.getExpression_listAccess().getGroup()); 
            // InternalPascal.g:394:3: ( rule__Expression_list__Group__0 )
            // InternalPascal.g:394:4: rule__Expression_list__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression_list__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression_listAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleexpression_list"


    // $ANTLR start "entryRuleexpression"
    // InternalPascal.g:403:1: entryRuleexpression : ruleexpression EOF ;
    public final void entryRuleexpression() throws RecognitionException {
        try {
            // InternalPascal.g:404:1: ( ruleexpression EOF )
            // InternalPascal.g:405:1: ruleexpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleexpression"


    // $ANTLR start "ruleexpression"
    // InternalPascal.g:412:1: ruleexpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleexpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:416:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalPascal.g:417:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalPascal.g:417:2: ( ( rule__Expression__Group__0 ) )
            // InternalPascal.g:418:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalPascal.g:419:3: ( rule__Expression__Group__0 )
            // InternalPascal.g:419:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRulesimple_expression"
    // InternalPascal.g:428:1: entryRulesimple_expression : rulesimple_expression EOF ;
    public final void entryRulesimple_expression() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalPascal.g:432:1: ( rulesimple_expression EOF )
            // InternalPascal.g:433:1: rulesimple_expression EOF
            {
             before(grammarAccess.getSimple_expressionRule()); 
            pushFollow(FOLLOW_1);
            rulesimple_expression();

            state._fsp--;

             after(grammarAccess.getSimple_expressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRulesimple_expression"


    // $ANTLR start "rulesimple_expression"
    // InternalPascal.g:443:1: rulesimple_expression : ( ( rule__Simple_expression__Group__0 ) ) ;
    public final void rulesimple_expression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:448:2: ( ( ( rule__Simple_expression__Group__0 ) ) )
            // InternalPascal.g:449:2: ( ( rule__Simple_expression__Group__0 ) )
            {
            // InternalPascal.g:449:2: ( ( rule__Simple_expression__Group__0 ) )
            // InternalPascal.g:450:3: ( rule__Simple_expression__Group__0 )
            {
             before(grammarAccess.getSimple_expressionAccess().getGroup()); 
            // InternalPascal.g:451:3: ( rule__Simple_expression__Group__0 )
            // InternalPascal.g:451:4: rule__Simple_expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Simple_expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimple_expressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "rulesimple_expression"


    // $ANTLR start "entryRuleterm"
    // InternalPascal.g:461:1: entryRuleterm : ruleterm EOF ;
    public final void entryRuleterm() throws RecognitionException {
        try {
            // InternalPascal.g:462:1: ( ruleterm EOF )
            // InternalPascal.g:463:1: ruleterm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            ruleterm();

            state._fsp--;

             after(grammarAccess.getTermRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleterm"


    // $ANTLR start "ruleterm"
    // InternalPascal.g:470:1: ruleterm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleterm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:474:2: ( ( ( rule__Term__Group__0 ) ) )
            // InternalPascal.g:475:2: ( ( rule__Term__Group__0 ) )
            {
            // InternalPascal.g:475:2: ( ( rule__Term__Group__0 ) )
            // InternalPascal.g:476:3: ( rule__Term__Group__0 )
            {
             before(grammarAccess.getTermAccess().getGroup()); 
            // InternalPascal.g:477:3: ( rule__Term__Group__0 )
            // InternalPascal.g:477:4: rule__Term__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleterm"


    // $ANTLR start "entryRulefactor"
    // InternalPascal.g:486:1: entryRulefactor : rulefactor EOF ;
    public final void entryRulefactor() throws RecognitionException {
        try {
            // InternalPascal.g:487:1: ( rulefactor EOF )
            // InternalPascal.g:488:1: rulefactor EOF
            {
             before(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            rulefactor();

            state._fsp--;

             after(grammarAccess.getFactorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulefactor"


    // $ANTLR start "rulefactor"
    // InternalPascal.g:495:1: rulefactor : ( ( rule__Factor__Alternatives ) ) ;
    public final void rulefactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:499:2: ( ( ( rule__Factor__Alternatives ) ) )
            // InternalPascal.g:500:2: ( ( rule__Factor__Alternatives ) )
            {
            // InternalPascal.g:500:2: ( ( rule__Factor__Alternatives ) )
            // InternalPascal.g:501:3: ( rule__Factor__Alternatives )
            {
             before(grammarAccess.getFactorAccess().getAlternatives()); 
            // InternalPascal.g:502:3: ( rule__Factor__Alternatives )
            // InternalPascal.g:502:4: rule__Factor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulefactor"


    // $ANTLR start "entryRulenumber"
    // InternalPascal.g:511:1: entryRulenumber : rulenumber EOF ;
    public final void entryRulenumber() throws RecognitionException {
        try {
            // InternalPascal.g:512:1: ( rulenumber EOF )
            // InternalPascal.g:513:1: rulenumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            rulenumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulenumber"


    // $ANTLR start "rulenumber"
    // InternalPascal.g:520:1: rulenumber : ( ( rule__Number__NumberAssignment ) ) ;
    public final void rulenumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:524:2: ( ( ( rule__Number__NumberAssignment ) ) )
            // InternalPascal.g:525:2: ( ( rule__Number__NumberAssignment ) )
            {
            // InternalPascal.g:525:2: ( ( rule__Number__NumberAssignment ) )
            // InternalPascal.g:526:3: ( rule__Number__NumberAssignment )
            {
             before(grammarAccess.getNumberAccess().getNumberAssignment()); 
            // InternalPascal.g:527:3: ( rule__Number__NumberAssignment )
            // InternalPascal.g:527:4: rule__Number__NumberAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Number__NumberAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getNumberAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulenumber"


    // $ANTLR start "entryRuleany_number"
    // InternalPascal.g:536:1: entryRuleany_number : ruleany_number EOF ;
    public final void entryRuleany_number() throws RecognitionException {
        try {
            // InternalPascal.g:537:1: ( ruleany_number EOF )
            // InternalPascal.g:538:1: ruleany_number EOF
            {
             before(grammarAccess.getAny_numberRule()); 
            pushFollow(FOLLOW_1);
            ruleany_number();

            state._fsp--;

             after(grammarAccess.getAny_numberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleany_number"


    // $ANTLR start "ruleany_number"
    // InternalPascal.g:545:1: ruleany_number : ( ( rule__Any_number__Alternatives ) ) ;
    public final void ruleany_number() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:549:2: ( ( ( rule__Any_number__Alternatives ) ) )
            // InternalPascal.g:550:2: ( ( rule__Any_number__Alternatives ) )
            {
            // InternalPascal.g:550:2: ( ( rule__Any_number__Alternatives ) )
            // InternalPascal.g:551:3: ( rule__Any_number__Alternatives )
            {
             before(grammarAccess.getAny_numberAccess().getAlternatives()); 
            // InternalPascal.g:552:3: ( rule__Any_number__Alternatives )
            // InternalPascal.g:552:4: rule__Any_number__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Any_number__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAny_numberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleany_number"


    // $ANTLR start "entryRuleunsigned_number"
    // InternalPascal.g:561:1: entryRuleunsigned_number : ruleunsigned_number EOF ;
    public final void entryRuleunsigned_number() throws RecognitionException {
        try {
            // InternalPascal.g:562:1: ( ruleunsigned_number EOF )
            // InternalPascal.g:563:1: ruleunsigned_number EOF
            {
             before(grammarAccess.getUnsigned_numberRule()); 
            pushFollow(FOLLOW_1);
            ruleunsigned_number();

            state._fsp--;

             after(grammarAccess.getUnsigned_numberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleunsigned_number"


    // $ANTLR start "ruleunsigned_number"
    // InternalPascal.g:570:1: ruleunsigned_number : ( ( rule__Unsigned_number__IntegerAssignment ) ) ;
    public final void ruleunsigned_number() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:574:2: ( ( ( rule__Unsigned_number__IntegerAssignment ) ) )
            // InternalPascal.g:575:2: ( ( rule__Unsigned_number__IntegerAssignment ) )
            {
            // InternalPascal.g:575:2: ( ( rule__Unsigned_number__IntegerAssignment ) )
            // InternalPascal.g:576:3: ( rule__Unsigned_number__IntegerAssignment )
            {
             before(grammarAccess.getUnsigned_numberAccess().getIntegerAssignment()); 
            // InternalPascal.g:577:3: ( rule__Unsigned_number__IntegerAssignment )
            // InternalPascal.g:577:4: rule__Unsigned_number__IntegerAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Unsigned_number__IntegerAssignment();

            state._fsp--;


            }

             after(grammarAccess.getUnsigned_numberAccess().getIntegerAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleunsigned_number"


    // $ANTLR start "entryRulesigned_number"
    // InternalPascal.g:586:1: entryRulesigned_number : rulesigned_number EOF ;
    public final void entryRulesigned_number() throws RecognitionException {
        try {
            // InternalPascal.g:587:1: ( rulesigned_number EOF )
            // InternalPascal.g:588:1: rulesigned_number EOF
            {
             before(grammarAccess.getSigned_numberRule()); 
            pushFollow(FOLLOW_1);
            rulesigned_number();

            state._fsp--;

             after(grammarAccess.getSigned_numberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulesigned_number"


    // $ANTLR start "rulesigned_number"
    // InternalPascal.g:595:1: rulesigned_number : ( ( rule__Signed_number__IntegerAssignment ) ) ;
    public final void rulesigned_number() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:599:2: ( ( ( rule__Signed_number__IntegerAssignment ) ) )
            // InternalPascal.g:600:2: ( ( rule__Signed_number__IntegerAssignment ) )
            {
            // InternalPascal.g:600:2: ( ( rule__Signed_number__IntegerAssignment ) )
            // InternalPascal.g:601:3: ( rule__Signed_number__IntegerAssignment )
            {
             before(grammarAccess.getSigned_numberAccess().getIntegerAssignment()); 
            // InternalPascal.g:602:3: ( rule__Signed_number__IntegerAssignment )
            // InternalPascal.g:602:4: rule__Signed_number__IntegerAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Signed_number__IntegerAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSigned_numberAccess().getIntegerAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulesigned_number"


    // $ANTLR start "entryRuleset"
    // InternalPascal.g:611:1: entryRuleset : ruleset EOF ;
    public final void entryRuleset() throws RecognitionException {
        try {
            // InternalPascal.g:612:1: ( ruleset EOF )
            // InternalPascal.g:613:1: ruleset EOF
            {
             before(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_1);
            ruleset();

            state._fsp--;

             after(grammarAccess.getSetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleset"


    // $ANTLR start "ruleset"
    // InternalPascal.g:620:1: ruleset : ( ( rule__Set__Group__0 ) ) ;
    public final void ruleset() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:624:2: ( ( ( rule__Set__Group__0 ) ) )
            // InternalPascal.g:625:2: ( ( rule__Set__Group__0 ) )
            {
            // InternalPascal.g:625:2: ( ( rule__Set__Group__0 ) )
            // InternalPascal.g:626:3: ( rule__Set__Group__0 )
            {
             before(grammarAccess.getSetAccess().getGroup()); 
            // InternalPascal.g:627:3: ( rule__Set__Group__0 )
            // InternalPascal.g:627:4: rule__Set__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Set__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleset"


    // $ANTLR start "entryRulefunction_designator"
    // InternalPascal.g:636:1: entryRulefunction_designator : rulefunction_designator EOF ;
    public final void entryRulefunction_designator() throws RecognitionException {
        try {
            // InternalPascal.g:637:1: ( rulefunction_designator EOF )
            // InternalPascal.g:638:1: rulefunction_designator EOF
            {
             before(grammarAccess.getFunction_designatorRule()); 
            pushFollow(FOLLOW_1);
            rulefunction_designator();

            state._fsp--;

             after(grammarAccess.getFunction_designatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulefunction_designator"


    // $ANTLR start "rulefunction_designator"
    // InternalPascal.g:645:1: rulefunction_designator : ( ( rule__Function_designator__Group__0 ) ) ;
    public final void rulefunction_designator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:649:2: ( ( ( rule__Function_designator__Group__0 ) ) )
            // InternalPascal.g:650:2: ( ( rule__Function_designator__Group__0 ) )
            {
            // InternalPascal.g:650:2: ( ( rule__Function_designator__Group__0 ) )
            // InternalPascal.g:651:3: ( rule__Function_designator__Group__0 )
            {
             before(grammarAccess.getFunction_designatorAccess().getGroup()); 
            // InternalPascal.g:652:3: ( rule__Function_designator__Group__0 )
            // InternalPascal.g:652:4: rule__Function_designator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function_designator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunction_designatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulefunction_designator"


    // $ANTLR start "entryRulestructured_statement"
    // InternalPascal.g:661:1: entryRulestructured_statement : rulestructured_statement EOF ;
    public final void entryRulestructured_statement() throws RecognitionException {
        try {
            // InternalPascal.g:662:1: ( rulestructured_statement EOF )
            // InternalPascal.g:663:1: rulestructured_statement EOF
            {
             before(grammarAccess.getStructured_statementRule()); 
            pushFollow(FOLLOW_1);
            rulestructured_statement();

            state._fsp--;

             after(grammarAccess.getStructured_statementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulestructured_statement"


    // $ANTLR start "rulestructured_statement"
    // InternalPascal.g:670:1: rulestructured_statement : ( ( rule__Structured_statement__Alternatives ) ) ;
    public final void rulestructured_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:674:2: ( ( ( rule__Structured_statement__Alternatives ) ) )
            // InternalPascal.g:675:2: ( ( rule__Structured_statement__Alternatives ) )
            {
            // InternalPascal.g:675:2: ( ( rule__Structured_statement__Alternatives ) )
            // InternalPascal.g:676:3: ( rule__Structured_statement__Alternatives )
            {
             before(grammarAccess.getStructured_statementAccess().getAlternatives()); 
            // InternalPascal.g:677:3: ( rule__Structured_statement__Alternatives )
            // InternalPascal.g:677:4: rule__Structured_statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Structured_statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStructured_statementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulestructured_statement"


    // $ANTLR start "entryRulecompound_statement"
    // InternalPascal.g:686:1: entryRulecompound_statement : rulecompound_statement EOF ;
    public final void entryRulecompound_statement() throws RecognitionException {
        try {
            // InternalPascal.g:687:1: ( rulecompound_statement EOF )
            // InternalPascal.g:688:1: rulecompound_statement EOF
            {
             before(grammarAccess.getCompound_statementRule()); 
            pushFollow(FOLLOW_1);
            rulecompound_statement();

            state._fsp--;

             after(grammarAccess.getCompound_statementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulecompound_statement"


    // $ANTLR start "rulecompound_statement"
    // InternalPascal.g:695:1: rulecompound_statement : ( ( rule__Compound_statement__Group__0 ) ) ;
    public final void rulecompound_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:699:2: ( ( ( rule__Compound_statement__Group__0 ) ) )
            // InternalPascal.g:700:2: ( ( rule__Compound_statement__Group__0 ) )
            {
            // InternalPascal.g:700:2: ( ( rule__Compound_statement__Group__0 ) )
            // InternalPascal.g:701:3: ( rule__Compound_statement__Group__0 )
            {
             before(grammarAccess.getCompound_statementAccess().getGroup()); 
            // InternalPascal.g:702:3: ( rule__Compound_statement__Group__0 )
            // InternalPascal.g:702:4: rule__Compound_statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Compound_statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompound_statementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecompound_statement"


    // $ANTLR start "entryRulerepetitive_statement"
    // InternalPascal.g:711:1: entryRulerepetitive_statement : rulerepetitive_statement EOF ;
    public final void entryRulerepetitive_statement() throws RecognitionException {
        try {
            // InternalPascal.g:712:1: ( rulerepetitive_statement EOF )
            // InternalPascal.g:713:1: rulerepetitive_statement EOF
            {
             before(grammarAccess.getRepetitive_statementRule()); 
            pushFollow(FOLLOW_1);
            rulerepetitive_statement();

            state._fsp--;

             after(grammarAccess.getRepetitive_statementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulerepetitive_statement"


    // $ANTLR start "rulerepetitive_statement"
    // InternalPascal.g:720:1: rulerepetitive_statement : ( ( rule__Repetitive_statement__ForStmtAssignment ) ) ;
    public final void rulerepetitive_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:724:2: ( ( ( rule__Repetitive_statement__ForStmtAssignment ) ) )
            // InternalPascal.g:725:2: ( ( rule__Repetitive_statement__ForStmtAssignment ) )
            {
            // InternalPascal.g:725:2: ( ( rule__Repetitive_statement__ForStmtAssignment ) )
            // InternalPascal.g:726:3: ( rule__Repetitive_statement__ForStmtAssignment )
            {
             before(grammarAccess.getRepetitive_statementAccess().getForStmtAssignment()); 
            // InternalPascal.g:727:3: ( rule__Repetitive_statement__ForStmtAssignment )
            // InternalPascal.g:727:4: rule__Repetitive_statement__ForStmtAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Repetitive_statement__ForStmtAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRepetitive_statementAccess().getForStmtAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulerepetitive_statement"


    // $ANTLR start "entryRulefor_statement"
    // InternalPascal.g:736:1: entryRulefor_statement : rulefor_statement EOF ;
    public final void entryRulefor_statement() throws RecognitionException {
        try {
            // InternalPascal.g:737:1: ( rulefor_statement EOF )
            // InternalPascal.g:738:1: rulefor_statement EOF
            {
             before(grammarAccess.getFor_statementRule()); 
            pushFollow(FOLLOW_1);
            rulefor_statement();

            state._fsp--;

             after(grammarAccess.getFor_statementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulefor_statement"


    // $ANTLR start "rulefor_statement"
    // InternalPascal.g:745:1: rulefor_statement : ( ( rule__For_statement__Group__0 ) ) ;
    public final void rulefor_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:749:2: ( ( ( rule__For_statement__Group__0 ) ) )
            // InternalPascal.g:750:2: ( ( rule__For_statement__Group__0 ) )
            {
            // InternalPascal.g:750:2: ( ( rule__For_statement__Group__0 ) )
            // InternalPascal.g:751:3: ( rule__For_statement__Group__0 )
            {
             before(grammarAccess.getFor_statementAccess().getGroup()); 
            // InternalPascal.g:752:3: ( rule__For_statement__Group__0 )
            // InternalPascal.g:752:4: rule__For_statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__For_statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFor_statementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulefor_statement"


    // $ANTLR start "entryRuleconditional_statement"
    // InternalPascal.g:761:1: entryRuleconditional_statement : ruleconditional_statement EOF ;
    public final void entryRuleconditional_statement() throws RecognitionException {
        try {
            // InternalPascal.g:762:1: ( ruleconditional_statement EOF )
            // InternalPascal.g:763:1: ruleconditional_statement EOF
            {
             before(grammarAccess.getConditional_statementRule()); 
            pushFollow(FOLLOW_1);
            ruleconditional_statement();

            state._fsp--;

             after(grammarAccess.getConditional_statementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleconditional_statement"


    // $ANTLR start "ruleconditional_statement"
    // InternalPascal.g:770:1: ruleconditional_statement : ( ( rule__Conditional_statement__IfStmtAssignment ) ) ;
    public final void ruleconditional_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:774:2: ( ( ( rule__Conditional_statement__IfStmtAssignment ) ) )
            // InternalPascal.g:775:2: ( ( rule__Conditional_statement__IfStmtAssignment ) )
            {
            // InternalPascal.g:775:2: ( ( rule__Conditional_statement__IfStmtAssignment ) )
            // InternalPascal.g:776:3: ( rule__Conditional_statement__IfStmtAssignment )
            {
             before(grammarAccess.getConditional_statementAccess().getIfStmtAssignment()); 
            // InternalPascal.g:777:3: ( rule__Conditional_statement__IfStmtAssignment )
            // InternalPascal.g:777:4: rule__Conditional_statement__IfStmtAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Conditional_statement__IfStmtAssignment();

            state._fsp--;


            }

             after(grammarAccess.getConditional_statementAccess().getIfStmtAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleconditional_statement"


    // $ANTLR start "entryRuleif_statement"
    // InternalPascal.g:786:1: entryRuleif_statement : ruleif_statement EOF ;
    public final void entryRuleif_statement() throws RecognitionException {
        try {
            // InternalPascal.g:787:1: ( ruleif_statement EOF )
            // InternalPascal.g:788:1: ruleif_statement EOF
            {
             before(grammarAccess.getIf_statementRule()); 
            pushFollow(FOLLOW_1);
            ruleif_statement();

            state._fsp--;

             after(grammarAccess.getIf_statementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleif_statement"


    // $ANTLR start "ruleif_statement"
    // InternalPascal.g:795:1: ruleif_statement : ( ( rule__If_statement__Group__0 ) ) ;
    public final void ruleif_statement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:799:2: ( ( ( rule__If_statement__Group__0 ) ) )
            // InternalPascal.g:800:2: ( ( rule__If_statement__Group__0 ) )
            {
            // InternalPascal.g:800:2: ( ( rule__If_statement__Group__0 ) )
            // InternalPascal.g:801:3: ( rule__If_statement__Group__0 )
            {
             before(grammarAccess.getIf_statementAccess().getGroup()); 
            // InternalPascal.g:802:3: ( rule__If_statement__Group__0 )
            // InternalPascal.g:802:4: rule__If_statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__If_statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIf_statementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleif_statement"


    // $ANTLR start "entryRuleconstant"
    // InternalPascal.g:811:1: entryRuleconstant : ruleconstant EOF ;
    public final void entryRuleconstant() throws RecognitionException {
        try {
            // InternalPascal.g:812:1: ( ruleconstant EOF )
            // InternalPascal.g:813:1: ruleconstant EOF
            {
             before(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            ruleconstant();

            state._fsp--;

             after(grammarAccess.getConstantRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleconstant"


    // $ANTLR start "ruleconstant"
    // InternalPascal.g:820:1: ruleconstant : ( ( rule__Constant__Alternatives ) ) ;
    public final void ruleconstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:824:2: ( ( ( rule__Constant__Alternatives ) ) )
            // InternalPascal.g:825:2: ( ( rule__Constant__Alternatives ) )
            {
            // InternalPascal.g:825:2: ( ( rule__Constant__Alternatives ) )
            // InternalPascal.g:826:3: ( rule__Constant__Alternatives )
            {
             before(grammarAccess.getConstantAccess().getAlternatives()); 
            // InternalPascal.g:827:3: ( rule__Constant__Alternatives )
            // InternalPascal.g:827:4: rule__Constant__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleconstant"


    // $ANTLR start "entryRuleconstant_definition_part"
    // InternalPascal.g:836:1: entryRuleconstant_definition_part : ruleconstant_definition_part EOF ;
    public final void entryRuleconstant_definition_part() throws RecognitionException {
        try {
            // InternalPascal.g:837:1: ( ruleconstant_definition_part EOF )
            // InternalPascal.g:838:1: ruleconstant_definition_part EOF
            {
             before(grammarAccess.getConstant_definition_partRule()); 
            pushFollow(FOLLOW_1);
            ruleconstant_definition_part();

            state._fsp--;

             after(grammarAccess.getConstant_definition_partRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleconstant_definition_part"


    // $ANTLR start "ruleconstant_definition_part"
    // InternalPascal.g:845:1: ruleconstant_definition_part : ( ( rule__Constant_definition_part__Group__0 ) ) ;
    public final void ruleconstant_definition_part() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:849:2: ( ( ( rule__Constant_definition_part__Group__0 ) ) )
            // InternalPascal.g:850:2: ( ( rule__Constant_definition_part__Group__0 ) )
            {
            // InternalPascal.g:850:2: ( ( rule__Constant_definition_part__Group__0 ) )
            // InternalPascal.g:851:3: ( rule__Constant_definition_part__Group__0 )
            {
             before(grammarAccess.getConstant_definition_partAccess().getGroup()); 
            // InternalPascal.g:852:3: ( rule__Constant_definition_part__Group__0 )
            // InternalPascal.g:852:4: rule__Constant_definition_part__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constant_definition_part__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstant_definition_partAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleconstant_definition_part"


    // $ANTLR start "entryRuleconstant_definition"
    // InternalPascal.g:861:1: entryRuleconstant_definition : ruleconstant_definition EOF ;
    public final void entryRuleconstant_definition() throws RecognitionException {
        try {
            // InternalPascal.g:862:1: ( ruleconstant_definition EOF )
            // InternalPascal.g:863:1: ruleconstant_definition EOF
            {
             before(grammarAccess.getConstant_definitionRule()); 
            pushFollow(FOLLOW_1);
            ruleconstant_definition();

            state._fsp--;

             after(grammarAccess.getConstant_definitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleconstant_definition"


    // $ANTLR start "ruleconstant_definition"
    // InternalPascal.g:870:1: ruleconstant_definition : ( ( rule__Constant_definition__Group__0 ) ) ;
    public final void ruleconstant_definition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:874:2: ( ( ( rule__Constant_definition__Group__0 ) ) )
            // InternalPascal.g:875:2: ( ( rule__Constant_definition__Group__0 ) )
            {
            // InternalPascal.g:875:2: ( ( rule__Constant_definition__Group__0 ) )
            // InternalPascal.g:876:3: ( rule__Constant_definition__Group__0 )
            {
             before(grammarAccess.getConstant_definitionAccess().getGroup()); 
            // InternalPascal.g:877:3: ( rule__Constant_definition__Group__0 )
            // InternalPascal.g:877:4: rule__Constant_definition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constant_definition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstant_definitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleconstant_definition"


    // $ANTLR start "entryRuletype_definition_part"
    // InternalPascal.g:886:1: entryRuletype_definition_part : ruletype_definition_part EOF ;
    public final void entryRuletype_definition_part() throws RecognitionException {
        try {
            // InternalPascal.g:887:1: ( ruletype_definition_part EOF )
            // InternalPascal.g:888:1: ruletype_definition_part EOF
            {
             before(grammarAccess.getType_definition_partRule()); 
            pushFollow(FOLLOW_1);
            ruletype_definition_part();

            state._fsp--;

             after(grammarAccess.getType_definition_partRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletype_definition_part"


    // $ANTLR start "ruletype_definition_part"
    // InternalPascal.g:895:1: ruletype_definition_part : ( ( rule__Type_definition_part__Group__0 ) ) ;
    public final void ruletype_definition_part() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:899:2: ( ( ( rule__Type_definition_part__Group__0 ) ) )
            // InternalPascal.g:900:2: ( ( rule__Type_definition_part__Group__0 ) )
            {
            // InternalPascal.g:900:2: ( ( rule__Type_definition_part__Group__0 ) )
            // InternalPascal.g:901:3: ( rule__Type_definition_part__Group__0 )
            {
             before(grammarAccess.getType_definition_partAccess().getGroup()); 
            // InternalPascal.g:902:3: ( rule__Type_definition_part__Group__0 )
            // InternalPascal.g:902:4: rule__Type_definition_part__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type_definition_part__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getType_definition_partAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletype_definition_part"


    // $ANTLR start "entryRuletype_definition"
    // InternalPascal.g:911:1: entryRuletype_definition : ruletype_definition EOF ;
    public final void entryRuletype_definition() throws RecognitionException {
        try {
            // InternalPascal.g:912:1: ( ruletype_definition EOF )
            // InternalPascal.g:913:1: ruletype_definition EOF
            {
             before(grammarAccess.getType_definitionRule()); 
            pushFollow(FOLLOW_1);
            ruletype_definition();

            state._fsp--;

             after(grammarAccess.getType_definitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletype_definition"


    // $ANTLR start "ruletype_definition"
    // InternalPascal.g:920:1: ruletype_definition : ( ( rule__Type_definition__Group__0 ) ) ;
    public final void ruletype_definition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:924:2: ( ( ( rule__Type_definition__Group__0 ) ) )
            // InternalPascal.g:925:2: ( ( rule__Type_definition__Group__0 ) )
            {
            // InternalPascal.g:925:2: ( ( rule__Type_definition__Group__0 ) )
            // InternalPascal.g:926:3: ( rule__Type_definition__Group__0 )
            {
             before(grammarAccess.getType_definitionAccess().getGroup()); 
            // InternalPascal.g:927:3: ( rule__Type_definition__Group__0 )
            // InternalPascal.g:927:4: rule__Type_definition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type_definition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getType_definitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletype_definition"


    // $ANTLR start "entryRuletype"
    // InternalPascal.g:936:1: entryRuletype : ruletype EOF ;
    public final void entryRuletype() throws RecognitionException {
        try {
            // InternalPascal.g:937:1: ( ruletype EOF )
            // InternalPascal.g:938:1: ruletype EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruletype();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletype"


    // $ANTLR start "ruletype"
    // InternalPascal.g:945:1: ruletype : ( ( rule__Type__Alternatives ) ) ;
    public final void ruletype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:949:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalPascal.g:950:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalPascal.g:950:2: ( ( rule__Type__Alternatives ) )
            // InternalPascal.g:951:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalPascal.g:952:3: ( rule__Type__Alternatives )
            // InternalPascal.g:952:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletype"


    // $ANTLR start "entryRulesimple_type"
    // InternalPascal.g:961:1: entryRulesimple_type : rulesimple_type EOF ;
    public final void entryRulesimple_type() throws RecognitionException {
        try {
            // InternalPascal.g:962:1: ( rulesimple_type EOF )
            // InternalPascal.g:963:1: rulesimple_type EOF
            {
             before(grammarAccess.getSimple_typeRule()); 
            pushFollow(FOLLOW_1);
            rulesimple_type();

            state._fsp--;

             after(grammarAccess.getSimple_typeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulesimple_type"


    // $ANTLR start "rulesimple_type"
    // InternalPascal.g:970:1: rulesimple_type : ( ( rule__Simple_type__Alternatives ) ) ;
    public final void rulesimple_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:974:2: ( ( ( rule__Simple_type__Alternatives ) ) )
            // InternalPascal.g:975:2: ( ( rule__Simple_type__Alternatives ) )
            {
            // InternalPascal.g:975:2: ( ( rule__Simple_type__Alternatives ) )
            // InternalPascal.g:976:3: ( rule__Simple_type__Alternatives )
            {
             before(grammarAccess.getSimple_typeAccess().getAlternatives()); 
            // InternalPascal.g:977:3: ( rule__Simple_type__Alternatives )
            // InternalPascal.g:977:4: rule__Simple_type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Simple_type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSimple_typeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulesimple_type"


    // $ANTLR start "entryRulesubrange_type"
    // InternalPascal.g:986:1: entryRulesubrange_type : rulesubrange_type EOF ;
    public final void entryRulesubrange_type() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalPascal.g:990:1: ( rulesubrange_type EOF )
            // InternalPascal.g:991:1: rulesubrange_type EOF
            {
             before(grammarAccess.getSubrange_typeRule()); 
            pushFollow(FOLLOW_1);
            rulesubrange_type();

            state._fsp--;

             after(grammarAccess.getSubrange_typeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRulesubrange_type"


    // $ANTLR start "rulesubrange_type"
    // InternalPascal.g:1001:1: rulesubrange_type : ( ( rule__Subrange_type__Alternatives ) ) ;
    public final void rulesubrange_type() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1006:2: ( ( ( rule__Subrange_type__Alternatives ) ) )
            // InternalPascal.g:1007:2: ( ( rule__Subrange_type__Alternatives ) )
            {
            // InternalPascal.g:1007:2: ( ( rule__Subrange_type__Alternatives ) )
            // InternalPascal.g:1008:3: ( rule__Subrange_type__Alternatives )
            {
             before(grammarAccess.getSubrange_typeAccess().getAlternatives()); 
            // InternalPascal.g:1009:3: ( rule__Subrange_type__Alternatives )
            // InternalPascal.g:1009:4: rule__Subrange_type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Subrange_type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSubrange_typeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "rulesubrange_type"


    // $ANTLR start "entryRuleenumerated_type"
    // InternalPascal.g:1019:1: entryRuleenumerated_type : ruleenumerated_type EOF ;
    public final void entryRuleenumerated_type() throws RecognitionException {
        try {
            // InternalPascal.g:1020:1: ( ruleenumerated_type EOF )
            // InternalPascal.g:1021:1: ruleenumerated_type EOF
            {
             before(grammarAccess.getEnumerated_typeRule()); 
            pushFollow(FOLLOW_1);
            ruleenumerated_type();

            state._fsp--;

             after(grammarAccess.getEnumerated_typeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleenumerated_type"


    // $ANTLR start "ruleenumerated_type"
    // InternalPascal.g:1028:1: ruleenumerated_type : ( ( rule__Enumerated_type__Group__0 ) ) ;
    public final void ruleenumerated_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1032:2: ( ( ( rule__Enumerated_type__Group__0 ) ) )
            // InternalPascal.g:1033:2: ( ( rule__Enumerated_type__Group__0 ) )
            {
            // InternalPascal.g:1033:2: ( ( rule__Enumerated_type__Group__0 ) )
            // InternalPascal.g:1034:3: ( rule__Enumerated_type__Group__0 )
            {
             before(grammarAccess.getEnumerated_typeAccess().getGroup()); 
            // InternalPascal.g:1035:3: ( rule__Enumerated_type__Group__0 )
            // InternalPascal.g:1035:4: rule__Enumerated_type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Enumerated_type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerated_typeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleenumerated_type"


    // $ANTLR start "entryRulestructured_type"
    // InternalPascal.g:1044:1: entryRulestructured_type : rulestructured_type EOF ;
    public final void entryRulestructured_type() throws RecognitionException {
        try {
            // InternalPascal.g:1045:1: ( rulestructured_type EOF )
            // InternalPascal.g:1046:1: rulestructured_type EOF
            {
             before(grammarAccess.getStructured_typeRule()); 
            pushFollow(FOLLOW_1);
            rulestructured_type();

            state._fsp--;

             after(grammarAccess.getStructured_typeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulestructured_type"


    // $ANTLR start "rulestructured_type"
    // InternalPascal.g:1053:1: rulestructured_type : ( ( rule__Structured_type__Group__0 ) ) ;
    public final void rulestructured_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1057:2: ( ( ( rule__Structured_type__Group__0 ) ) )
            // InternalPascal.g:1058:2: ( ( rule__Structured_type__Group__0 ) )
            {
            // InternalPascal.g:1058:2: ( ( rule__Structured_type__Group__0 ) )
            // InternalPascal.g:1059:3: ( rule__Structured_type__Group__0 )
            {
             before(grammarAccess.getStructured_typeAccess().getGroup()); 
            // InternalPascal.g:1060:3: ( rule__Structured_type__Group__0 )
            // InternalPascal.g:1060:4: rule__Structured_type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Structured_type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStructured_typeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulestructured_type"


    // $ANTLR start "entryRuleunpacked_structured_type"
    // InternalPascal.g:1069:1: entryRuleunpacked_structured_type : ruleunpacked_structured_type EOF ;
    public final void entryRuleunpacked_structured_type() throws RecognitionException {
        try {
            // InternalPascal.g:1070:1: ( ruleunpacked_structured_type EOF )
            // InternalPascal.g:1071:1: ruleunpacked_structured_type EOF
            {
             before(grammarAccess.getUnpacked_structured_typeRule()); 
            pushFollow(FOLLOW_1);
            ruleunpacked_structured_type();

            state._fsp--;

             after(grammarAccess.getUnpacked_structured_typeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleunpacked_structured_type"


    // $ANTLR start "ruleunpacked_structured_type"
    // InternalPascal.g:1078:1: ruleunpacked_structured_type : ( ( rule__Unpacked_structured_type__Alternatives ) ) ;
    public final void ruleunpacked_structured_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1082:2: ( ( ( rule__Unpacked_structured_type__Alternatives ) ) )
            // InternalPascal.g:1083:2: ( ( rule__Unpacked_structured_type__Alternatives ) )
            {
            // InternalPascal.g:1083:2: ( ( rule__Unpacked_structured_type__Alternatives ) )
            // InternalPascal.g:1084:3: ( rule__Unpacked_structured_type__Alternatives )
            {
             before(grammarAccess.getUnpacked_structured_typeAccess().getAlternatives()); 
            // InternalPascal.g:1085:3: ( rule__Unpacked_structured_type__Alternatives )
            // InternalPascal.g:1085:4: rule__Unpacked_structured_type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Unpacked_structured_type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnpacked_structured_typeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleunpacked_structured_type"


    // $ANTLR start "entryRulearray_type"
    // InternalPascal.g:1094:1: entryRulearray_type : rulearray_type EOF ;
    public final void entryRulearray_type() throws RecognitionException {
        try {
            // InternalPascal.g:1095:1: ( rulearray_type EOF )
            // InternalPascal.g:1096:1: rulearray_type EOF
            {
             before(grammarAccess.getArray_typeRule()); 
            pushFollow(FOLLOW_1);
            rulearray_type();

            state._fsp--;

             after(grammarAccess.getArray_typeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulearray_type"


    // $ANTLR start "rulearray_type"
    // InternalPascal.g:1103:1: rulearray_type : ( ( rule__Array_type__Group__0 ) ) ;
    public final void rulearray_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1107:2: ( ( ( rule__Array_type__Group__0 ) ) )
            // InternalPascal.g:1108:2: ( ( rule__Array_type__Group__0 ) )
            {
            // InternalPascal.g:1108:2: ( ( rule__Array_type__Group__0 ) )
            // InternalPascal.g:1109:3: ( rule__Array_type__Group__0 )
            {
             before(grammarAccess.getArray_typeAccess().getGroup()); 
            // InternalPascal.g:1110:3: ( rule__Array_type__Group__0 )
            // InternalPascal.g:1110:4: rule__Array_type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Array_type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArray_typeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulearray_type"


    // $ANTLR start "entryRuledynamic_array_type"
    // InternalPascal.g:1119:1: entryRuledynamic_array_type : ruledynamic_array_type EOF ;
    public final void entryRuledynamic_array_type() throws RecognitionException {
        try {
            // InternalPascal.g:1120:1: ( ruledynamic_array_type EOF )
            // InternalPascal.g:1121:1: ruledynamic_array_type EOF
            {
             before(grammarAccess.getDynamic_array_typeRule()); 
            pushFollow(FOLLOW_1);
            ruledynamic_array_type();

            state._fsp--;

             after(grammarAccess.getDynamic_array_typeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuledynamic_array_type"


    // $ANTLR start "ruledynamic_array_type"
    // InternalPascal.g:1128:1: ruledynamic_array_type : ( ( rule__Dynamic_array_type__Group__0 ) ) ;
    public final void ruledynamic_array_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1132:2: ( ( ( rule__Dynamic_array_type__Group__0 ) ) )
            // InternalPascal.g:1133:2: ( ( rule__Dynamic_array_type__Group__0 ) )
            {
            // InternalPascal.g:1133:2: ( ( rule__Dynamic_array_type__Group__0 ) )
            // InternalPascal.g:1134:3: ( rule__Dynamic_array_type__Group__0 )
            {
             before(grammarAccess.getDynamic_array_typeAccess().getGroup()); 
            // InternalPascal.g:1135:3: ( rule__Dynamic_array_type__Group__0 )
            // InternalPascal.g:1135:4: rule__Dynamic_array_type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Dynamic_array_type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDynamic_array_typeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruledynamic_array_type"


    // $ANTLR start "entryRuleindex_type"
    // InternalPascal.g:1144:1: entryRuleindex_type : ruleindex_type EOF ;
    public final void entryRuleindex_type() throws RecognitionException {
        try {
            // InternalPascal.g:1145:1: ( ruleindex_type EOF )
            // InternalPascal.g:1146:1: ruleindex_type EOF
            {
             before(grammarAccess.getIndex_typeRule()); 
            pushFollow(FOLLOW_1);
            ruleindex_type();

            state._fsp--;

             after(grammarAccess.getIndex_typeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleindex_type"


    // $ANTLR start "ruleindex_type"
    // InternalPascal.g:1153:1: ruleindex_type : ( ( rule__Index_type__TypeAssignment ) ) ;
    public final void ruleindex_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1157:2: ( ( ( rule__Index_type__TypeAssignment ) ) )
            // InternalPascal.g:1158:2: ( ( rule__Index_type__TypeAssignment ) )
            {
            // InternalPascal.g:1158:2: ( ( rule__Index_type__TypeAssignment ) )
            // InternalPascal.g:1159:3: ( rule__Index_type__TypeAssignment )
            {
             before(grammarAccess.getIndex_typeAccess().getTypeAssignment()); 
            // InternalPascal.g:1160:3: ( rule__Index_type__TypeAssignment )
            // InternalPascal.g:1160:4: rule__Index_type__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Index_type__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIndex_typeAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleindex_type"


    // $ANTLR start "entryRulevariable_identifier_list"
    // InternalPascal.g:1169:1: entryRulevariable_identifier_list : rulevariable_identifier_list EOF ;
    public final void entryRulevariable_identifier_list() throws RecognitionException {
        try {
            // InternalPascal.g:1170:1: ( rulevariable_identifier_list EOF )
            // InternalPascal.g:1171:1: rulevariable_identifier_list EOF
            {
             before(grammarAccess.getVariable_identifier_listRule()); 
            pushFollow(FOLLOW_1);
            rulevariable_identifier_list();

            state._fsp--;

             after(grammarAccess.getVariable_identifier_listRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulevariable_identifier_list"


    // $ANTLR start "rulevariable_identifier_list"
    // InternalPascal.g:1178:1: rulevariable_identifier_list : ( ( rule__Variable_identifier_list__Group__0 ) ) ;
    public final void rulevariable_identifier_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1182:2: ( ( ( rule__Variable_identifier_list__Group__0 ) ) )
            // InternalPascal.g:1183:2: ( ( rule__Variable_identifier_list__Group__0 ) )
            {
            // InternalPascal.g:1183:2: ( ( rule__Variable_identifier_list__Group__0 ) )
            // InternalPascal.g:1184:3: ( rule__Variable_identifier_list__Group__0 )
            {
             before(grammarAccess.getVariable_identifier_listAccess().getGroup()); 
            // InternalPascal.g:1185:3: ( rule__Variable_identifier_list__Group__0 )
            // InternalPascal.g:1185:4: rule__Variable_identifier_list__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable_identifier_list__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariable_identifier_listAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulevariable_identifier_list"


    // $ANTLR start "entryRulevariable_section"
    // InternalPascal.g:1194:1: entryRulevariable_section : rulevariable_section EOF ;
    public final void entryRulevariable_section() throws RecognitionException {
        try {
            // InternalPascal.g:1195:1: ( rulevariable_section EOF )
            // InternalPascal.g:1196:1: rulevariable_section EOF
            {
             before(grammarAccess.getVariable_sectionRule()); 
            pushFollow(FOLLOW_1);
            rulevariable_section();

            state._fsp--;

             after(grammarAccess.getVariable_sectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulevariable_section"


    // $ANTLR start "rulevariable_section"
    // InternalPascal.g:1203:1: rulevariable_section : ( ( rule__Variable_section__Group__0 ) ) ;
    public final void rulevariable_section() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1207:2: ( ( ( rule__Variable_section__Group__0 ) ) )
            // InternalPascal.g:1208:2: ( ( rule__Variable_section__Group__0 ) )
            {
            // InternalPascal.g:1208:2: ( ( rule__Variable_section__Group__0 ) )
            // InternalPascal.g:1209:3: ( rule__Variable_section__Group__0 )
            {
             before(grammarAccess.getVariable_sectionAccess().getGroup()); 
            // InternalPascal.g:1210:3: ( rule__Variable_section__Group__0 )
            // InternalPascal.g:1210:4: rule__Variable_section__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable_section__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariable_sectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulevariable_section"


    // $ANTLR start "entryRuleset_type"
    // InternalPascal.g:1219:1: entryRuleset_type : ruleset_type EOF ;
    public final void entryRuleset_type() throws RecognitionException {
        try {
            // InternalPascal.g:1220:1: ( ruleset_type EOF )
            // InternalPascal.g:1221:1: ruleset_type EOF
            {
             before(grammarAccess.getSet_typeRule()); 
            pushFollow(FOLLOW_1);
            ruleset_type();

            state._fsp--;

             after(grammarAccess.getSet_typeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleset_type"


    // $ANTLR start "ruleset_type"
    // InternalPascal.g:1228:1: ruleset_type : ( ( rule__Set_type__Group__0 ) ) ;
    public final void ruleset_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1232:2: ( ( ( rule__Set_type__Group__0 ) ) )
            // InternalPascal.g:1233:2: ( ( rule__Set_type__Group__0 ) )
            {
            // InternalPascal.g:1233:2: ( ( rule__Set_type__Group__0 ) )
            // InternalPascal.g:1234:3: ( rule__Set_type__Group__0 )
            {
             before(grammarAccess.getSet_typeAccess().getGroup()); 
            // InternalPascal.g:1235:3: ( rule__Set_type__Group__0 )
            // InternalPascal.g:1235:4: rule__Set_type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Set_type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSet_typeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleset_type"


    // $ANTLR start "entryRulepointer_type"
    // InternalPascal.g:1244:1: entryRulepointer_type : rulepointer_type EOF ;
    public final void entryRulepointer_type() throws RecognitionException {
        try {
            // InternalPascal.g:1245:1: ( rulepointer_type EOF )
            // InternalPascal.g:1246:1: rulepointer_type EOF
            {
             before(grammarAccess.getPointer_typeRule()); 
            pushFollow(FOLLOW_1);
            rulepointer_type();

            state._fsp--;

             after(grammarAccess.getPointer_typeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulepointer_type"


    // $ANTLR start "rulepointer_type"
    // InternalPascal.g:1253:1: rulepointer_type : ( ( rule__Pointer_type__Group__0 ) ) ;
    public final void rulepointer_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1257:2: ( ( ( rule__Pointer_type__Group__0 ) ) )
            // InternalPascal.g:1258:2: ( ( rule__Pointer_type__Group__0 ) )
            {
            // InternalPascal.g:1258:2: ( ( rule__Pointer_type__Group__0 ) )
            // InternalPascal.g:1259:3: ( rule__Pointer_type__Group__0 )
            {
             before(grammarAccess.getPointer_typeAccess().getGroup()); 
            // InternalPascal.g:1260:3: ( rule__Pointer_type__Group__0 )
            // InternalPascal.g:1260:4: rule__Pointer_type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pointer_type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPointer_typeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulepointer_type"


    // $ANTLR start "entryRulevariable_declaration_part"
    // InternalPascal.g:1269:1: entryRulevariable_declaration_part : rulevariable_declaration_part EOF ;
    public final void entryRulevariable_declaration_part() throws RecognitionException {
        try {
            // InternalPascal.g:1270:1: ( rulevariable_declaration_part EOF )
            // InternalPascal.g:1271:1: rulevariable_declaration_part EOF
            {
             before(grammarAccess.getVariable_declaration_partRule()); 
            pushFollow(FOLLOW_1);
            rulevariable_declaration_part();

            state._fsp--;

             after(grammarAccess.getVariable_declaration_partRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulevariable_declaration_part"


    // $ANTLR start "rulevariable_declaration_part"
    // InternalPascal.g:1278:1: rulevariable_declaration_part : ( ( rule__Variable_declaration_part__Group__0 ) ) ;
    public final void rulevariable_declaration_part() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1282:2: ( ( ( rule__Variable_declaration_part__Group__0 ) ) )
            // InternalPascal.g:1283:2: ( ( rule__Variable_declaration_part__Group__0 ) )
            {
            // InternalPascal.g:1283:2: ( ( rule__Variable_declaration_part__Group__0 ) )
            // InternalPascal.g:1284:3: ( rule__Variable_declaration_part__Group__0 )
            {
             before(grammarAccess.getVariable_declaration_partAccess().getGroup()); 
            // InternalPascal.g:1285:3: ( rule__Variable_declaration_part__Group__0 )
            // InternalPascal.g:1285:4: rule__Variable_declaration_part__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable_declaration_part__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariable_declaration_partAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulevariable_declaration_part"


    // $ANTLR start "entryRuleprocedure_and_function_declaration_part"
    // InternalPascal.g:1294:1: entryRuleprocedure_and_function_declaration_part : ruleprocedure_and_function_declaration_part EOF ;
    public final void entryRuleprocedure_and_function_declaration_part() throws RecognitionException {
        try {
            // InternalPascal.g:1295:1: ( ruleprocedure_and_function_declaration_part EOF )
            // InternalPascal.g:1296:1: ruleprocedure_and_function_declaration_part EOF
            {
             before(grammarAccess.getProcedure_and_function_declaration_partRule()); 
            pushFollow(FOLLOW_1);
            ruleprocedure_and_function_declaration_part();

            state._fsp--;

             after(grammarAccess.getProcedure_and_function_declaration_partRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleprocedure_and_function_declaration_part"


    // $ANTLR start "ruleprocedure_and_function_declaration_part"
    // InternalPascal.g:1303:1: ruleprocedure_and_function_declaration_part : ( ( ( rule__Procedure_and_function_declaration_part__Group__0 ) ) ( ( rule__Procedure_and_function_declaration_part__Group__0 )* ) ) ;
    public final void ruleprocedure_and_function_declaration_part() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1307:2: ( ( ( ( rule__Procedure_and_function_declaration_part__Group__0 ) ) ( ( rule__Procedure_and_function_declaration_part__Group__0 )* ) ) )
            // InternalPascal.g:1308:2: ( ( ( rule__Procedure_and_function_declaration_part__Group__0 ) ) ( ( rule__Procedure_and_function_declaration_part__Group__0 )* ) )
            {
            // InternalPascal.g:1308:2: ( ( ( rule__Procedure_and_function_declaration_part__Group__0 ) ) ( ( rule__Procedure_and_function_declaration_part__Group__0 )* ) )
            // InternalPascal.g:1309:3: ( ( rule__Procedure_and_function_declaration_part__Group__0 ) ) ( ( rule__Procedure_and_function_declaration_part__Group__0 )* )
            {
            // InternalPascal.g:1309:3: ( ( rule__Procedure_and_function_declaration_part__Group__0 ) )
            // InternalPascal.g:1310:4: ( rule__Procedure_and_function_declaration_part__Group__0 )
            {
             before(grammarAccess.getProcedure_and_function_declaration_partAccess().getGroup()); 
            // InternalPascal.g:1311:4: ( rule__Procedure_and_function_declaration_part__Group__0 )
            // InternalPascal.g:1311:5: rule__Procedure_and_function_declaration_part__Group__0
            {
            pushFollow(FOLLOW_3);
            rule__Procedure_and_function_declaration_part__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcedure_and_function_declaration_partAccess().getGroup()); 

            }

            // InternalPascal.g:1314:3: ( ( rule__Procedure_and_function_declaration_part__Group__0 )* )
            // InternalPascal.g:1315:4: ( rule__Procedure_and_function_declaration_part__Group__0 )*
            {
             before(grammarAccess.getProcedure_and_function_declaration_partAccess().getGroup()); 
            // InternalPascal.g:1316:4: ( rule__Procedure_and_function_declaration_part__Group__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==49||LA3_0==51) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPascal.g:1316:5: rule__Procedure_and_function_declaration_part__Group__0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Procedure_and_function_declaration_part__Group__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getProcedure_and_function_declaration_partAccess().getGroup()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleprocedure_and_function_declaration_part"


    // $ANTLR start "entryRuleprocedure_declaration"
    // InternalPascal.g:1326:1: entryRuleprocedure_declaration : ruleprocedure_declaration EOF ;
    public final void entryRuleprocedure_declaration() throws RecognitionException {
        try {
            // InternalPascal.g:1327:1: ( ruleprocedure_declaration EOF )
            // InternalPascal.g:1328:1: ruleprocedure_declaration EOF
            {
             before(grammarAccess.getProcedure_declarationRule()); 
            pushFollow(FOLLOW_1);
            ruleprocedure_declaration();

            state._fsp--;

             after(grammarAccess.getProcedure_declarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleprocedure_declaration"


    // $ANTLR start "ruleprocedure_declaration"
    // InternalPascal.g:1335:1: ruleprocedure_declaration : ( ( rule__Procedure_declaration__Group__0 ) ) ;
    public final void ruleprocedure_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1339:2: ( ( ( rule__Procedure_declaration__Group__0 ) ) )
            // InternalPascal.g:1340:2: ( ( rule__Procedure_declaration__Group__0 ) )
            {
            // InternalPascal.g:1340:2: ( ( rule__Procedure_declaration__Group__0 ) )
            // InternalPascal.g:1341:3: ( rule__Procedure_declaration__Group__0 )
            {
             before(grammarAccess.getProcedure_declarationAccess().getGroup()); 
            // InternalPascal.g:1342:3: ( rule__Procedure_declaration__Group__0 )
            // InternalPascal.g:1342:4: rule__Procedure_declaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcedure_declarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleprocedure_declaration"


    // $ANTLR start "entryRuleprocedure_heading"
    // InternalPascal.g:1351:1: entryRuleprocedure_heading : ruleprocedure_heading EOF ;
    public final void entryRuleprocedure_heading() throws RecognitionException {
        try {
            // InternalPascal.g:1352:1: ( ruleprocedure_heading EOF )
            // InternalPascal.g:1353:1: ruleprocedure_heading EOF
            {
             before(grammarAccess.getProcedure_headingRule()); 
            pushFollow(FOLLOW_1);
            ruleprocedure_heading();

            state._fsp--;

             after(grammarAccess.getProcedure_headingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleprocedure_heading"


    // $ANTLR start "ruleprocedure_heading"
    // InternalPascal.g:1360:1: ruleprocedure_heading : ( ( rule__Procedure_heading__Group__0 ) ) ;
    public final void ruleprocedure_heading() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1364:2: ( ( ( rule__Procedure_heading__Group__0 ) ) )
            // InternalPascal.g:1365:2: ( ( rule__Procedure_heading__Group__0 ) )
            {
            // InternalPascal.g:1365:2: ( ( rule__Procedure_heading__Group__0 ) )
            // InternalPascal.g:1366:3: ( rule__Procedure_heading__Group__0 )
            {
             before(grammarAccess.getProcedure_headingAccess().getGroup()); 
            // InternalPascal.g:1367:3: ( rule__Procedure_heading__Group__0 )
            // InternalPascal.g:1367:4: rule__Procedure_heading__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_heading__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcedure_headingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleprocedure_heading"


    // $ANTLR start "entryRuleformal_parameter_list"
    // InternalPascal.g:1376:1: entryRuleformal_parameter_list : ruleformal_parameter_list EOF ;
    public final void entryRuleformal_parameter_list() throws RecognitionException {
        try {
            // InternalPascal.g:1377:1: ( ruleformal_parameter_list EOF )
            // InternalPascal.g:1378:1: ruleformal_parameter_list EOF
            {
             before(grammarAccess.getFormal_parameter_listRule()); 
            pushFollow(FOLLOW_1);
            ruleformal_parameter_list();

            state._fsp--;

             after(grammarAccess.getFormal_parameter_listRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleformal_parameter_list"


    // $ANTLR start "ruleformal_parameter_list"
    // InternalPascal.g:1385:1: ruleformal_parameter_list : ( ( rule__Formal_parameter_list__Group__0 ) ) ;
    public final void ruleformal_parameter_list() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1389:2: ( ( ( rule__Formal_parameter_list__Group__0 ) ) )
            // InternalPascal.g:1390:2: ( ( rule__Formal_parameter_list__Group__0 ) )
            {
            // InternalPascal.g:1390:2: ( ( rule__Formal_parameter_list__Group__0 ) )
            // InternalPascal.g:1391:3: ( rule__Formal_parameter_list__Group__0 )
            {
             before(grammarAccess.getFormal_parameter_listAccess().getGroup()); 
            // InternalPascal.g:1392:3: ( rule__Formal_parameter_list__Group__0 )
            // InternalPascal.g:1392:4: rule__Formal_parameter_list__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Formal_parameter_list__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormal_parameter_listAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleformal_parameter_list"


    // $ANTLR start "entryRuleformal_parameter_section"
    // InternalPascal.g:1401:1: entryRuleformal_parameter_section : ruleformal_parameter_section EOF ;
    public final void entryRuleformal_parameter_section() throws RecognitionException {
        try {
            // InternalPascal.g:1402:1: ( ruleformal_parameter_section EOF )
            // InternalPascal.g:1403:1: ruleformal_parameter_section EOF
            {
             before(grammarAccess.getFormal_parameter_sectionRule()); 
            pushFollow(FOLLOW_1);
            ruleformal_parameter_section();

            state._fsp--;

             after(grammarAccess.getFormal_parameter_sectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleformal_parameter_section"


    // $ANTLR start "ruleformal_parameter_section"
    // InternalPascal.g:1410:1: ruleformal_parameter_section : ( ( rule__Formal_parameter_section__Alternatives ) ) ;
    public final void ruleformal_parameter_section() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1414:2: ( ( ( rule__Formal_parameter_section__Alternatives ) ) )
            // InternalPascal.g:1415:2: ( ( rule__Formal_parameter_section__Alternatives ) )
            {
            // InternalPascal.g:1415:2: ( ( rule__Formal_parameter_section__Alternatives ) )
            // InternalPascal.g:1416:3: ( rule__Formal_parameter_section__Alternatives )
            {
             before(grammarAccess.getFormal_parameter_sectionAccess().getAlternatives()); 
            // InternalPascal.g:1417:3: ( rule__Formal_parameter_section__Alternatives )
            // InternalPascal.g:1417:4: rule__Formal_parameter_section__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Formal_parameter_section__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFormal_parameter_sectionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleformal_parameter_section"


    // $ANTLR start "entryRulevalue_parameter_section"
    // InternalPascal.g:1426:1: entryRulevalue_parameter_section : rulevalue_parameter_section EOF ;
    public final void entryRulevalue_parameter_section() throws RecognitionException {
        try {
            // InternalPascal.g:1427:1: ( rulevalue_parameter_section EOF )
            // InternalPascal.g:1428:1: rulevalue_parameter_section EOF
            {
             before(grammarAccess.getValue_parameter_sectionRule()); 
            pushFollow(FOLLOW_1);
            rulevalue_parameter_section();

            state._fsp--;

             after(grammarAccess.getValue_parameter_sectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulevalue_parameter_section"


    // $ANTLR start "rulevalue_parameter_section"
    // InternalPascal.g:1435:1: rulevalue_parameter_section : ( ( rule__Value_parameter_section__Group__0 ) ) ;
    public final void rulevalue_parameter_section() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1439:2: ( ( ( rule__Value_parameter_section__Group__0 ) ) )
            // InternalPascal.g:1440:2: ( ( rule__Value_parameter_section__Group__0 ) )
            {
            // InternalPascal.g:1440:2: ( ( rule__Value_parameter_section__Group__0 ) )
            // InternalPascal.g:1441:3: ( rule__Value_parameter_section__Group__0 )
            {
             before(grammarAccess.getValue_parameter_sectionAccess().getGroup()); 
            // InternalPascal.g:1442:3: ( rule__Value_parameter_section__Group__0 )
            // InternalPascal.g:1442:4: rule__Value_parameter_section__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Value_parameter_section__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValue_parameter_sectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulevalue_parameter_section"


    // $ANTLR start "entryRuleparameter_type"
    // InternalPascal.g:1451:1: entryRuleparameter_type : ruleparameter_type EOF ;
    public final void entryRuleparameter_type() throws RecognitionException {
        try {
            // InternalPascal.g:1452:1: ( ruleparameter_type EOF )
            // InternalPascal.g:1453:1: ruleparameter_type EOF
            {
             before(grammarAccess.getParameter_typeRule()); 
            pushFollow(FOLLOW_1);
            ruleparameter_type();

            state._fsp--;

             after(grammarAccess.getParameter_typeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleparameter_type"


    // $ANTLR start "ruleparameter_type"
    // InternalPascal.g:1460:1: ruleparameter_type : ( ( rule__Parameter_type__Alternatives ) ) ;
    public final void ruleparameter_type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1464:2: ( ( ( rule__Parameter_type__Alternatives ) ) )
            // InternalPascal.g:1465:2: ( ( rule__Parameter_type__Alternatives ) )
            {
            // InternalPascal.g:1465:2: ( ( rule__Parameter_type__Alternatives ) )
            // InternalPascal.g:1466:3: ( rule__Parameter_type__Alternatives )
            {
             before(grammarAccess.getParameter_typeAccess().getAlternatives()); 
            // InternalPascal.g:1467:3: ( rule__Parameter_type__Alternatives )
            // InternalPascal.g:1467:4: rule__Parameter_type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Parameter_type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParameter_typeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleparameter_type"


    // $ANTLR start "entryRuleconformant_array_schema"
    // InternalPascal.g:1476:1: entryRuleconformant_array_schema : ruleconformant_array_schema EOF ;
    public final void entryRuleconformant_array_schema() throws RecognitionException {
        try {
            // InternalPascal.g:1477:1: ( ruleconformant_array_schema EOF )
            // InternalPascal.g:1478:1: ruleconformant_array_schema EOF
            {
             before(grammarAccess.getConformant_array_schemaRule()); 
            pushFollow(FOLLOW_1);
            ruleconformant_array_schema();

            state._fsp--;

             after(grammarAccess.getConformant_array_schemaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleconformant_array_schema"


    // $ANTLR start "ruleconformant_array_schema"
    // InternalPascal.g:1485:1: ruleconformant_array_schema : ( ( rule__Conformant_array_schema__Alternatives ) ) ;
    public final void ruleconformant_array_schema() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1489:2: ( ( ( rule__Conformant_array_schema__Alternatives ) ) )
            // InternalPascal.g:1490:2: ( ( rule__Conformant_array_schema__Alternatives ) )
            {
            // InternalPascal.g:1490:2: ( ( rule__Conformant_array_schema__Alternatives ) )
            // InternalPascal.g:1491:3: ( rule__Conformant_array_schema__Alternatives )
            {
             before(grammarAccess.getConformant_array_schemaAccess().getAlternatives()); 
            // InternalPascal.g:1492:3: ( rule__Conformant_array_schema__Alternatives )
            // InternalPascal.g:1492:4: rule__Conformant_array_schema__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Conformant_array_schema__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConformant_array_schemaAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleconformant_array_schema"


    // $ANTLR start "entryRulepacked_conformant_array_schema"
    // InternalPascal.g:1501:1: entryRulepacked_conformant_array_schema : rulepacked_conformant_array_schema EOF ;
    public final void entryRulepacked_conformant_array_schema() throws RecognitionException {
        try {
            // InternalPascal.g:1502:1: ( rulepacked_conformant_array_schema EOF )
            // InternalPascal.g:1503:1: rulepacked_conformant_array_schema EOF
            {
             before(grammarAccess.getPacked_conformant_array_schemaRule()); 
            pushFollow(FOLLOW_1);
            rulepacked_conformant_array_schema();

            state._fsp--;

             after(grammarAccess.getPacked_conformant_array_schemaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulepacked_conformant_array_schema"


    // $ANTLR start "rulepacked_conformant_array_schema"
    // InternalPascal.g:1510:1: rulepacked_conformant_array_schema : ( ( rule__Packed_conformant_array_schema__Group__0 ) ) ;
    public final void rulepacked_conformant_array_schema() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1514:2: ( ( ( rule__Packed_conformant_array_schema__Group__0 ) ) )
            // InternalPascal.g:1515:2: ( ( rule__Packed_conformant_array_schema__Group__0 ) )
            {
            // InternalPascal.g:1515:2: ( ( rule__Packed_conformant_array_schema__Group__0 ) )
            // InternalPascal.g:1516:3: ( rule__Packed_conformant_array_schema__Group__0 )
            {
             before(grammarAccess.getPacked_conformant_array_schemaAccess().getGroup()); 
            // InternalPascal.g:1517:3: ( rule__Packed_conformant_array_schema__Group__0 )
            // InternalPascal.g:1517:4: rule__Packed_conformant_array_schema__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Packed_conformant_array_schema__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPacked_conformant_array_schemaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulepacked_conformant_array_schema"


    // $ANTLR start "entryRulebound_specification"
    // InternalPascal.g:1526:1: entryRulebound_specification : rulebound_specification EOF ;
    public final void entryRulebound_specification() throws RecognitionException {
        try {
            // InternalPascal.g:1527:1: ( rulebound_specification EOF )
            // InternalPascal.g:1528:1: rulebound_specification EOF
            {
             before(grammarAccess.getBound_specificationRule()); 
            pushFollow(FOLLOW_1);
            rulebound_specification();

            state._fsp--;

             after(grammarAccess.getBound_specificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulebound_specification"


    // $ANTLR start "rulebound_specification"
    // InternalPascal.g:1535:1: rulebound_specification : ( ( rule__Bound_specification__Group__0 ) ) ;
    public final void rulebound_specification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1539:2: ( ( ( rule__Bound_specification__Group__0 ) ) )
            // InternalPascal.g:1540:2: ( ( rule__Bound_specification__Group__0 ) )
            {
            // InternalPascal.g:1540:2: ( ( rule__Bound_specification__Group__0 ) )
            // InternalPascal.g:1541:3: ( rule__Bound_specification__Group__0 )
            {
             before(grammarAccess.getBound_specificationAccess().getGroup()); 
            // InternalPascal.g:1542:3: ( rule__Bound_specification__Group__0 )
            // InternalPascal.g:1542:4: rule__Bound_specification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Bound_specification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBound_specificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulebound_specification"


    // $ANTLR start "entryRuleunpacked_conformant_array_schema"
    // InternalPascal.g:1551:1: entryRuleunpacked_conformant_array_schema : ruleunpacked_conformant_array_schema EOF ;
    public final void entryRuleunpacked_conformant_array_schema() throws RecognitionException {
        try {
            // InternalPascal.g:1552:1: ( ruleunpacked_conformant_array_schema EOF )
            // InternalPascal.g:1553:1: ruleunpacked_conformant_array_schema EOF
            {
             before(grammarAccess.getUnpacked_conformant_array_schemaRule()); 
            pushFollow(FOLLOW_1);
            ruleunpacked_conformant_array_schema();

            state._fsp--;

             after(grammarAccess.getUnpacked_conformant_array_schemaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleunpacked_conformant_array_schema"


    // $ANTLR start "ruleunpacked_conformant_array_schema"
    // InternalPascal.g:1560:1: ruleunpacked_conformant_array_schema : ( ( rule__Unpacked_conformant_array_schema__Group__0 ) ) ;
    public final void ruleunpacked_conformant_array_schema() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1564:2: ( ( ( rule__Unpacked_conformant_array_schema__Group__0 ) ) )
            // InternalPascal.g:1565:2: ( ( rule__Unpacked_conformant_array_schema__Group__0 ) )
            {
            // InternalPascal.g:1565:2: ( ( rule__Unpacked_conformant_array_schema__Group__0 ) )
            // InternalPascal.g:1566:3: ( rule__Unpacked_conformant_array_schema__Group__0 )
            {
             before(grammarAccess.getUnpacked_conformant_array_schemaAccess().getGroup()); 
            // InternalPascal.g:1567:3: ( rule__Unpacked_conformant_array_schema__Group__0 )
            // InternalPascal.g:1567:4: rule__Unpacked_conformant_array_schema__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Unpacked_conformant_array_schema__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnpacked_conformant_array_schemaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleunpacked_conformant_array_schema"


    // $ANTLR start "entryRulevariable_parameter_section"
    // InternalPascal.g:1576:1: entryRulevariable_parameter_section : rulevariable_parameter_section EOF ;
    public final void entryRulevariable_parameter_section() throws RecognitionException {
        try {
            // InternalPascal.g:1577:1: ( rulevariable_parameter_section EOF )
            // InternalPascal.g:1578:1: rulevariable_parameter_section EOF
            {
             before(grammarAccess.getVariable_parameter_sectionRule()); 
            pushFollow(FOLLOW_1);
            rulevariable_parameter_section();

            state._fsp--;

             after(grammarAccess.getVariable_parameter_sectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulevariable_parameter_section"


    // $ANTLR start "rulevariable_parameter_section"
    // InternalPascal.g:1585:1: rulevariable_parameter_section : ( ( rule__Variable_parameter_section__Group__0 ) ) ;
    public final void rulevariable_parameter_section() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1589:2: ( ( ( rule__Variable_parameter_section__Group__0 ) ) )
            // InternalPascal.g:1590:2: ( ( rule__Variable_parameter_section__Group__0 ) )
            {
            // InternalPascal.g:1590:2: ( ( rule__Variable_parameter_section__Group__0 ) )
            // InternalPascal.g:1591:3: ( rule__Variable_parameter_section__Group__0 )
            {
             before(grammarAccess.getVariable_parameter_sectionAccess().getGroup()); 
            // InternalPascal.g:1592:3: ( rule__Variable_parameter_section__Group__0 )
            // InternalPascal.g:1592:4: rule__Variable_parameter_section__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable_parameter_section__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariable_parameter_sectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulevariable_parameter_section"


    // $ANTLR start "entryRulefunction_heading"
    // InternalPascal.g:1601:1: entryRulefunction_heading : rulefunction_heading EOF ;
    public final void entryRulefunction_heading() throws RecognitionException {
        try {
            // InternalPascal.g:1602:1: ( rulefunction_heading EOF )
            // InternalPascal.g:1603:1: rulefunction_heading EOF
            {
             before(grammarAccess.getFunction_headingRule()); 
            pushFollow(FOLLOW_1);
            rulefunction_heading();

            state._fsp--;

             after(grammarAccess.getFunction_headingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulefunction_heading"


    // $ANTLR start "rulefunction_heading"
    // InternalPascal.g:1610:1: rulefunction_heading : ( ( rule__Function_heading__Group__0 ) ) ;
    public final void rulefunction_heading() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1614:2: ( ( ( rule__Function_heading__Group__0 ) ) )
            // InternalPascal.g:1615:2: ( ( rule__Function_heading__Group__0 ) )
            {
            // InternalPascal.g:1615:2: ( ( rule__Function_heading__Group__0 ) )
            // InternalPascal.g:1616:3: ( rule__Function_heading__Group__0 )
            {
             before(grammarAccess.getFunction_headingAccess().getGroup()); 
            // InternalPascal.g:1617:3: ( rule__Function_heading__Group__0 )
            // InternalPascal.g:1617:4: rule__Function_heading__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function_heading__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunction_headingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulefunction_heading"


    // $ANTLR start "entryRulefunction_declaration"
    // InternalPascal.g:1626:1: entryRulefunction_declaration : rulefunction_declaration EOF ;
    public final void entryRulefunction_declaration() throws RecognitionException {
        try {
            // InternalPascal.g:1627:1: ( rulefunction_declaration EOF )
            // InternalPascal.g:1628:1: rulefunction_declaration EOF
            {
             before(grammarAccess.getFunction_declarationRule()); 
            pushFollow(FOLLOW_1);
            rulefunction_declaration();

            state._fsp--;

             after(grammarAccess.getFunction_declarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulefunction_declaration"


    // $ANTLR start "rulefunction_declaration"
    // InternalPascal.g:1635:1: rulefunction_declaration : ( ( rule__Function_declaration__Group__0 ) ) ;
    public final void rulefunction_declaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1639:2: ( ( ( rule__Function_declaration__Group__0 ) ) )
            // InternalPascal.g:1640:2: ( ( rule__Function_declaration__Group__0 ) )
            {
            // InternalPascal.g:1640:2: ( ( rule__Function_declaration__Group__0 ) )
            // InternalPascal.g:1641:3: ( rule__Function_declaration__Group__0 )
            {
             before(grammarAccess.getFunction_declarationAccess().getGroup()); 
            // InternalPascal.g:1642:3: ( rule__Function_declaration__Group__0 )
            // InternalPascal.g:1642:4: rule__Function_declaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function_declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunction_declarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulefunction_declaration"


    // $ANTLR start "rule__Statement__Alternatives_1"
    // InternalPascal.g:1650:1: rule__Statement__Alternatives_1 : ( ( ( rule__Statement__SimpleAssignment_1_0 ) ) | ( ( rule__Statement__StructuredAssignment_1_1 ) ) );
    public final void rule__Statement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1654:1: ( ( ( rule__Statement__SimpleAssignment_1_0 ) ) | ( ( rule__Statement__StructuredAssignment_1_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EOF||LA4_0==RULE_ID||LA4_0==24||LA4_0==29||LA4_0==40) ) {
                alt4=1;
            }
            else if ( (LA4_0==28||LA4_0==36||LA4_0==38) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPascal.g:1655:2: ( ( rule__Statement__SimpleAssignment_1_0 ) )
                    {
                    // InternalPascal.g:1655:2: ( ( rule__Statement__SimpleAssignment_1_0 ) )
                    // InternalPascal.g:1656:3: ( rule__Statement__SimpleAssignment_1_0 )
                    {
                     before(grammarAccess.getStatementAccess().getSimpleAssignment_1_0()); 
                    // InternalPascal.g:1657:3: ( rule__Statement__SimpleAssignment_1_0 )
                    // InternalPascal.g:1657:4: rule__Statement__SimpleAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__SimpleAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getSimpleAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1661:2: ( ( rule__Statement__StructuredAssignment_1_1 ) )
                    {
                    // InternalPascal.g:1661:2: ( ( rule__Statement__StructuredAssignment_1_1 ) )
                    // InternalPascal.g:1662:3: ( rule__Statement__StructuredAssignment_1_1 )
                    {
                     before(grammarAccess.getStatementAccess().getStructuredAssignment_1_1()); 
                    // InternalPascal.g:1663:3: ( rule__Statement__StructuredAssignment_1_1 )
                    // InternalPascal.g:1663:4: rule__Statement__StructuredAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__StructuredAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getStructuredAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives_1"


    // $ANTLR start "rule__Label__Alternatives"
    // InternalPascal.g:1671:1: rule__Label__Alternatives : ( ( ( rule__Label__NumberAssignment_0 ) ) | ( ( rule__Label__NumberAssignment_1 ) ) );
    public final void rule__Label__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1675:1: ( ( ( rule__Label__NumberAssignment_0 ) ) | ( ( rule__Label__NumberAssignment_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_INTEGER_NUMBER) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPascal.g:1676:2: ( ( rule__Label__NumberAssignment_0 ) )
                    {
                    // InternalPascal.g:1676:2: ( ( rule__Label__NumberAssignment_0 ) )
                    // InternalPascal.g:1677:3: ( rule__Label__NumberAssignment_0 )
                    {
                     before(grammarAccess.getLabelAccess().getNumberAssignment_0()); 
                    // InternalPascal.g:1678:3: ( rule__Label__NumberAssignment_0 )
                    // InternalPascal.g:1678:4: rule__Label__NumberAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Label__NumberAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLabelAccess().getNumberAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1682:2: ( ( rule__Label__NumberAssignment_1 ) )
                    {
                    // InternalPascal.g:1682:2: ( ( rule__Label__NumberAssignment_1 ) )
                    // InternalPascal.g:1683:3: ( rule__Label__NumberAssignment_1 )
                    {
                     before(grammarAccess.getLabelAccess().getNumberAssignment_1()); 
                    // InternalPascal.g:1684:3: ( rule__Label__NumberAssignment_1 )
                    // InternalPascal.g:1684:4: rule__Label__NumberAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Label__NumberAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLabelAccess().getNumberAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Alternatives"


    // $ANTLR start "rule__Simple_statement__Alternatives"
    // InternalPascal.g:1692:1: rule__Simple_statement__Alternatives : ( ( ( rule__Simple_statement__AssignmentAssignment_0 ) ) | ( ( rule__Simple_statement__FunctionAssignment_1 ) ) | ( ( rule__Simple_statement__Function_noargsAssignment_2 ) ) );
    public final void rule__Simple_statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1696:1: ( ( ( rule__Simple_statement__AssignmentAssignment_0 ) ) | ( ( rule__Simple_statement__FunctionAssignment_1 ) ) | ( ( rule__Simple_statement__Function_noargsAssignment_2 ) ) )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 25:
                    {
                    alt6=2;
                    }
                    break;
                case EOF:
                case 24:
                case 29:
                case 40:
                    {
                    alt6=3;
                    }
                    break;
                case 22:
                case 31:
                case 32:
                case 34:
                    {
                    alt6=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPascal.g:1697:2: ( ( rule__Simple_statement__AssignmentAssignment_0 ) )
                    {
                    // InternalPascal.g:1697:2: ( ( rule__Simple_statement__AssignmentAssignment_0 ) )
                    // InternalPascal.g:1698:3: ( rule__Simple_statement__AssignmentAssignment_0 )
                    {
                     before(grammarAccess.getSimple_statementAccess().getAssignmentAssignment_0()); 
                    // InternalPascal.g:1699:3: ( rule__Simple_statement__AssignmentAssignment_0 )
                    // InternalPascal.g:1699:4: rule__Simple_statement__AssignmentAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_statement__AssignmentAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_statementAccess().getAssignmentAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1703:2: ( ( rule__Simple_statement__FunctionAssignment_1 ) )
                    {
                    // InternalPascal.g:1703:2: ( ( rule__Simple_statement__FunctionAssignment_1 ) )
                    // InternalPascal.g:1704:3: ( rule__Simple_statement__FunctionAssignment_1 )
                    {
                     before(grammarAccess.getSimple_statementAccess().getFunctionAssignment_1()); 
                    // InternalPascal.g:1705:3: ( rule__Simple_statement__FunctionAssignment_1 )
                    // InternalPascal.g:1705:4: rule__Simple_statement__FunctionAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_statement__FunctionAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_statementAccess().getFunctionAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1709:2: ( ( rule__Simple_statement__Function_noargsAssignment_2 ) )
                    {
                    // InternalPascal.g:1709:2: ( ( rule__Simple_statement__Function_noargsAssignment_2 ) )
                    // InternalPascal.g:1710:3: ( rule__Simple_statement__Function_noargsAssignment_2 )
                    {
                     before(grammarAccess.getSimple_statementAccess().getFunction_noargsAssignment_2()); 
                    // InternalPascal.g:1711:3: ( rule__Simple_statement__Function_noargsAssignment_2 )
                    // InternalPascal.g:1711:4: rule__Simple_statement__Function_noargsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_statement__Function_noargsAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_statementAccess().getFunction_noargsAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_statement__Alternatives"


    // $ANTLR start "rule__Var___Alternatives"
    // InternalPascal.g:1719:1: rule__Var___Alternatives : ( ( ( rule__Var___Group_0__0 ) ) | ( ( rule__Var___Group_1__0 ) ) | ( ( rule__Var___Group_2__0 ) ) );
    public final void rule__Var___Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1723:1: ( ( ( rule__Var___Group_0__0 ) ) | ( ( rule__Var___Group_1__0 ) ) | ( ( rule__Var___Group_2__0 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt7=1;
                }
                break;
            case 22:
                {
                alt7=2;
                }
                break;
            case 34:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalPascal.g:1724:2: ( ( rule__Var___Group_0__0 ) )
                    {
                    // InternalPascal.g:1724:2: ( ( rule__Var___Group_0__0 ) )
                    // InternalPascal.g:1725:3: ( rule__Var___Group_0__0 )
                    {
                     before(grammarAccess.getVar_Access().getGroup_0()); 
                    // InternalPascal.g:1726:3: ( rule__Var___Group_0__0 )
                    // InternalPascal.g:1726:4: rule__Var___Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Var___Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVar_Access().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1730:2: ( ( rule__Var___Group_1__0 ) )
                    {
                    // InternalPascal.g:1730:2: ( ( rule__Var___Group_1__0 ) )
                    // InternalPascal.g:1731:3: ( rule__Var___Group_1__0 )
                    {
                     before(grammarAccess.getVar_Access().getGroup_1()); 
                    // InternalPascal.g:1732:3: ( rule__Var___Group_1__0 )
                    // InternalPascal.g:1732:4: rule__Var___Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Var___Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVar_Access().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1736:2: ( ( rule__Var___Group_2__0 ) )
                    {
                    // InternalPascal.g:1736:2: ( ( rule__Var___Group_2__0 ) )
                    // InternalPascal.g:1737:3: ( rule__Var___Group_2__0 )
                    {
                     before(grammarAccess.getVar_Access().getGroup_2()); 
                    // InternalPascal.g:1738:3: ( rule__Var___Group_2__0 )
                    // InternalPascal.g:1738:4: rule__Var___Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Var___Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVar_Access().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var___Alternatives"


    // $ANTLR start "rule__Expression__Alternatives_1_0"
    // InternalPascal.g:1746:1: rule__Expression__Alternatives_1_0 : ( ( ( rule__Expression__OperatorsAssignment_1_0_0 ) ) | ( ( rule__Expression__OperatorsAssignment_1_0_1 ) ) | ( ( rule__Expression__OperatorsAssignment_1_0_2 ) ) );
    public final void rule__Expression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1750:1: ( ( ( rule__Expression__OperatorsAssignment_1_0_0 ) ) | ( ( rule__Expression__OperatorsAssignment_1_0_1 ) ) | ( ( rule__Expression__OperatorsAssignment_1_0_2 ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_RELATIONAL_OPERATOR:
                {
                alt8=1;
                }
                break;
            case 52:
                {
                alt8=2;
                }
                break;
            case 42:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalPascal.g:1751:2: ( ( rule__Expression__OperatorsAssignment_1_0_0 ) )
                    {
                    // InternalPascal.g:1751:2: ( ( rule__Expression__OperatorsAssignment_1_0_0 ) )
                    // InternalPascal.g:1752:3: ( rule__Expression__OperatorsAssignment_1_0_0 )
                    {
                     before(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_0()); 
                    // InternalPascal.g:1753:3: ( rule__Expression__OperatorsAssignment_1_0_0 )
                    // InternalPascal.g:1753:4: rule__Expression__OperatorsAssignment_1_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__OperatorsAssignment_1_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1757:2: ( ( rule__Expression__OperatorsAssignment_1_0_1 ) )
                    {
                    // InternalPascal.g:1757:2: ( ( rule__Expression__OperatorsAssignment_1_0_1 ) )
                    // InternalPascal.g:1758:3: ( rule__Expression__OperatorsAssignment_1_0_1 )
                    {
                     before(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_1()); 
                    // InternalPascal.g:1759:3: ( rule__Expression__OperatorsAssignment_1_0_1 )
                    // InternalPascal.g:1759:4: rule__Expression__OperatorsAssignment_1_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__OperatorsAssignment_1_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1763:2: ( ( rule__Expression__OperatorsAssignment_1_0_2 ) )
                    {
                    // InternalPascal.g:1763:2: ( ( rule__Expression__OperatorsAssignment_1_0_2 ) )
                    // InternalPascal.g:1764:3: ( rule__Expression__OperatorsAssignment_1_0_2 )
                    {
                     before(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_2()); 
                    // InternalPascal.g:1765:3: ( rule__Expression__OperatorsAssignment_1_0_2 )
                    // InternalPascal.g:1765:4: rule__Expression__OperatorsAssignment_1_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__OperatorsAssignment_1_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getOperatorsAssignment_1_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Alternatives_1_0"


    // $ANTLR start "rule__Simple_expression__Alternatives_2"
    // InternalPascal.g:1773:1: rule__Simple_expression__Alternatives_2 : ( ( ( rule__Simple_expression__Group_2_0__0 ) ) | ( ( rule__Simple_expression__TermsAssignment_2_1 ) ) );
    public final void rule__Simple_expression__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1777:1: ( ( ( rule__Simple_expression__Group_2_0__0 ) ) | ( ( rule__Simple_expression__TermsAssignment_2_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ADDITION_OPERATOR||LA9_0==53) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_INTEGER_NUMBER) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalPascal.g:1778:2: ( ( rule__Simple_expression__Group_2_0__0 ) )
                    {
                    // InternalPascal.g:1778:2: ( ( rule__Simple_expression__Group_2_0__0 ) )
                    // InternalPascal.g:1779:3: ( rule__Simple_expression__Group_2_0__0 )
                    {
                     before(grammarAccess.getSimple_expressionAccess().getGroup_2_0()); 
                    // InternalPascal.g:1780:3: ( rule__Simple_expression__Group_2_0__0 )
                    // InternalPascal.g:1780:4: rule__Simple_expression__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_expression__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_expressionAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1784:2: ( ( rule__Simple_expression__TermsAssignment_2_1 ) )
                    {
                    // InternalPascal.g:1784:2: ( ( rule__Simple_expression__TermsAssignment_2_1 ) )
                    // InternalPascal.g:1785:3: ( rule__Simple_expression__TermsAssignment_2_1 )
                    {
                     before(grammarAccess.getSimple_expressionAccess().getTermsAssignment_2_1()); 
                    // InternalPascal.g:1786:3: ( rule__Simple_expression__TermsAssignment_2_1 )
                    // InternalPascal.g:1786:4: rule__Simple_expression__TermsAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_expression__TermsAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_expressionAccess().getTermsAssignment_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__Alternatives_2"


    // $ANTLR start "rule__Simple_expression__Alternatives_2_0_0"
    // InternalPascal.g:1794:1: rule__Simple_expression__Alternatives_2_0_0 : ( ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 ) ) | ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 ) ) );
    public final void rule__Simple_expression__Alternatives_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1798:1: ( ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 ) ) | ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ADDITION_OPERATOR) ) {
                alt10=1;
            }
            else if ( (LA10_0==53) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalPascal.g:1799:2: ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 ) )
                    {
                    // InternalPascal.g:1799:2: ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 ) )
                    // InternalPascal.g:1800:3: ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 )
                    {
                     before(grammarAccess.getSimple_expressionAccess().getOperatorsAssignment_2_0_0_0()); 
                    // InternalPascal.g:1801:3: ( rule__Simple_expression__OperatorsAssignment_2_0_0_0 )
                    // InternalPascal.g:1801:4: rule__Simple_expression__OperatorsAssignment_2_0_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_expression__OperatorsAssignment_2_0_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_expressionAccess().getOperatorsAssignment_2_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1805:2: ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 ) )
                    {
                    // InternalPascal.g:1805:2: ( ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 ) )
                    // InternalPascal.g:1806:3: ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 )
                    {
                     before(grammarAccess.getSimple_expressionAccess().getOperatorsAssignment_2_0_0_1()); 
                    // InternalPascal.g:1807:3: ( rule__Simple_expression__OperatorsAssignment_2_0_0_1 )
                    // InternalPascal.g:1807:4: rule__Simple_expression__OperatorsAssignment_2_0_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_expression__OperatorsAssignment_2_0_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_expressionAccess().getOperatorsAssignment_2_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__Alternatives_2_0_0"


    // $ANTLR start "rule__Term__Alternatives_1_0"
    // InternalPascal.g:1815:1: rule__Term__Alternatives_1_0 : ( ( ( rule__Term__OperatorsAssignment_1_0_0 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_1 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_2 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_3 ) ) );
    public final void rule__Term__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1819:1: ( ( ( rule__Term__OperatorsAssignment_1_0_0 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_1 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_2 ) ) | ( ( rule__Term__OperatorsAssignment_1_0_3 ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case RULE_MULTIPLICATION_OPERATOR:
                {
                alt11=1;
                }
                break;
            case 54:
                {
                alt11=2;
                }
                break;
            case 55:
                {
                alt11=3;
                }
                break;
            case 56:
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
                    // InternalPascal.g:1820:2: ( ( rule__Term__OperatorsAssignment_1_0_0 ) )
                    {
                    // InternalPascal.g:1820:2: ( ( rule__Term__OperatorsAssignment_1_0_0 ) )
                    // InternalPascal.g:1821:3: ( rule__Term__OperatorsAssignment_1_0_0 )
                    {
                     before(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_0()); 
                    // InternalPascal.g:1822:3: ( rule__Term__OperatorsAssignment_1_0_0 )
                    // InternalPascal.g:1822:4: rule__Term__OperatorsAssignment_1_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__OperatorsAssignment_1_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1826:2: ( ( rule__Term__OperatorsAssignment_1_0_1 ) )
                    {
                    // InternalPascal.g:1826:2: ( ( rule__Term__OperatorsAssignment_1_0_1 ) )
                    // InternalPascal.g:1827:3: ( rule__Term__OperatorsAssignment_1_0_1 )
                    {
                     before(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_1()); 
                    // InternalPascal.g:1828:3: ( rule__Term__OperatorsAssignment_1_0_1 )
                    // InternalPascal.g:1828:4: rule__Term__OperatorsAssignment_1_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__OperatorsAssignment_1_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1832:2: ( ( rule__Term__OperatorsAssignment_1_0_2 ) )
                    {
                    // InternalPascal.g:1832:2: ( ( rule__Term__OperatorsAssignment_1_0_2 ) )
                    // InternalPascal.g:1833:3: ( rule__Term__OperatorsAssignment_1_0_2 )
                    {
                     before(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_2()); 
                    // InternalPascal.g:1834:3: ( rule__Term__OperatorsAssignment_1_0_2 )
                    // InternalPascal.g:1834:4: rule__Term__OperatorsAssignment_1_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__OperatorsAssignment_1_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:1838:2: ( ( rule__Term__OperatorsAssignment_1_0_3 ) )
                    {
                    // InternalPascal.g:1838:2: ( ( rule__Term__OperatorsAssignment_1_0_3 ) )
                    // InternalPascal.g:1839:3: ( rule__Term__OperatorsAssignment_1_0_3 )
                    {
                     before(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_3()); 
                    // InternalPascal.g:1840:3: ( rule__Term__OperatorsAssignment_1_0_3 )
                    // InternalPascal.g:1840:4: rule__Term__OperatorsAssignment_1_0_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__OperatorsAssignment_1_0_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getOperatorsAssignment_1_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Alternatives_1_0"


    // $ANTLR start "rule__Factor__Alternatives"
    // InternalPascal.g:1848:1: rule__Factor__Alternatives : ( ( ( rule__Factor__VariableAssignment_0 ) ) | ( ( rule__Factor__NumberAssignment_1 ) ) | ( ( rule__Factor__StringAssignment_2 ) ) | ( ( rule__Factor__SetAssignment_3 ) ) | ( ( rule__Factor__NilAssignment_4 ) ) | ( ( rule__Factor__BooleanAssignment_5 ) ) | ( ( rule__Factor__BooleanAssignment_6 ) ) | ( ( rule__Factor__FunctionAssignment_7 ) ) | ( ( rule__Factor__Group_8__0 ) ) | ( ( rule__Factor__Group_9__0 ) ) );
    public final void rule__Factor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1852:1: ( ( ( rule__Factor__VariableAssignment_0 ) ) | ( ( rule__Factor__NumberAssignment_1 ) ) | ( ( rule__Factor__StringAssignment_2 ) ) | ( ( rule__Factor__SetAssignment_3 ) ) | ( ( rule__Factor__NilAssignment_4 ) ) | ( ( rule__Factor__BooleanAssignment_5 ) ) | ( ( rule__Factor__BooleanAssignment_6 ) ) | ( ( rule__Factor__FunctionAssignment_7 ) ) | ( ( rule__Factor__Group_8__0 ) ) | ( ( rule__Factor__Group_9__0 ) ) )
            int alt12=10;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalPascal.g:1853:2: ( ( rule__Factor__VariableAssignment_0 ) )
                    {
                    // InternalPascal.g:1853:2: ( ( rule__Factor__VariableAssignment_0 ) )
                    // InternalPascal.g:1854:3: ( rule__Factor__VariableAssignment_0 )
                    {
                     before(grammarAccess.getFactorAccess().getVariableAssignment_0()); 
                    // InternalPascal.g:1855:3: ( rule__Factor__VariableAssignment_0 )
                    // InternalPascal.g:1855:4: rule__Factor__VariableAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__VariableAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getVariableAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1859:2: ( ( rule__Factor__NumberAssignment_1 ) )
                    {
                    // InternalPascal.g:1859:2: ( ( rule__Factor__NumberAssignment_1 ) )
                    // InternalPascal.g:1860:3: ( rule__Factor__NumberAssignment_1 )
                    {
                     before(grammarAccess.getFactorAccess().getNumberAssignment_1()); 
                    // InternalPascal.g:1861:3: ( rule__Factor__NumberAssignment_1 )
                    // InternalPascal.g:1861:4: rule__Factor__NumberAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__NumberAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getNumberAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1865:2: ( ( rule__Factor__StringAssignment_2 ) )
                    {
                    // InternalPascal.g:1865:2: ( ( rule__Factor__StringAssignment_2 ) )
                    // InternalPascal.g:1866:3: ( rule__Factor__StringAssignment_2 )
                    {
                     before(grammarAccess.getFactorAccess().getStringAssignment_2()); 
                    // InternalPascal.g:1867:3: ( rule__Factor__StringAssignment_2 )
                    // InternalPascal.g:1867:4: rule__Factor__StringAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__StringAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getStringAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:1871:2: ( ( rule__Factor__SetAssignment_3 ) )
                    {
                    // InternalPascal.g:1871:2: ( ( rule__Factor__SetAssignment_3 ) )
                    // InternalPascal.g:1872:3: ( rule__Factor__SetAssignment_3 )
                    {
                     before(grammarAccess.getFactorAccess().getSetAssignment_3()); 
                    // InternalPascal.g:1873:3: ( rule__Factor__SetAssignment_3 )
                    // InternalPascal.g:1873:4: rule__Factor__SetAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__SetAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getSetAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPascal.g:1877:2: ( ( rule__Factor__NilAssignment_4 ) )
                    {
                    // InternalPascal.g:1877:2: ( ( rule__Factor__NilAssignment_4 ) )
                    // InternalPascal.g:1878:3: ( rule__Factor__NilAssignment_4 )
                    {
                     before(grammarAccess.getFactorAccess().getNilAssignment_4()); 
                    // InternalPascal.g:1879:3: ( rule__Factor__NilAssignment_4 )
                    // InternalPascal.g:1879:4: rule__Factor__NilAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__NilAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getNilAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPascal.g:1883:2: ( ( rule__Factor__BooleanAssignment_5 ) )
                    {
                    // InternalPascal.g:1883:2: ( ( rule__Factor__BooleanAssignment_5 ) )
                    // InternalPascal.g:1884:3: ( rule__Factor__BooleanAssignment_5 )
                    {
                     before(grammarAccess.getFactorAccess().getBooleanAssignment_5()); 
                    // InternalPascal.g:1885:3: ( rule__Factor__BooleanAssignment_5 )
                    // InternalPascal.g:1885:4: rule__Factor__BooleanAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__BooleanAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getBooleanAssignment_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalPascal.g:1889:2: ( ( rule__Factor__BooleanAssignment_6 ) )
                    {
                    // InternalPascal.g:1889:2: ( ( rule__Factor__BooleanAssignment_6 ) )
                    // InternalPascal.g:1890:3: ( rule__Factor__BooleanAssignment_6 )
                    {
                     before(grammarAccess.getFactorAccess().getBooleanAssignment_6()); 
                    // InternalPascal.g:1891:3: ( rule__Factor__BooleanAssignment_6 )
                    // InternalPascal.g:1891:4: rule__Factor__BooleanAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__BooleanAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getBooleanAssignment_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalPascal.g:1895:2: ( ( rule__Factor__FunctionAssignment_7 ) )
                    {
                    // InternalPascal.g:1895:2: ( ( rule__Factor__FunctionAssignment_7 ) )
                    // InternalPascal.g:1896:3: ( rule__Factor__FunctionAssignment_7 )
                    {
                     before(grammarAccess.getFactorAccess().getFunctionAssignment_7()); 
                    // InternalPascal.g:1897:3: ( rule__Factor__FunctionAssignment_7 )
                    // InternalPascal.g:1897:4: rule__Factor__FunctionAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__FunctionAssignment_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getFunctionAssignment_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalPascal.g:1901:2: ( ( rule__Factor__Group_8__0 ) )
                    {
                    // InternalPascal.g:1901:2: ( ( rule__Factor__Group_8__0 ) )
                    // InternalPascal.g:1902:3: ( rule__Factor__Group_8__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_8()); 
                    // InternalPascal.g:1903:3: ( rule__Factor__Group_8__0 )
                    // InternalPascal.g:1903:4: rule__Factor__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__Group_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getGroup_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalPascal.g:1907:2: ( ( rule__Factor__Group_9__0 ) )
                    {
                    // InternalPascal.g:1907:2: ( ( rule__Factor__Group_9__0 ) )
                    // InternalPascal.g:1908:3: ( rule__Factor__Group_9__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_9()); 
                    // InternalPascal.g:1909:3: ( rule__Factor__Group_9__0 )
                    // InternalPascal.g:1909:4: rule__Factor__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__Group_9__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getGroup_9()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Alternatives"


    // $ANTLR start "rule__Any_number__Alternatives"
    // InternalPascal.g:1917:1: rule__Any_number__Alternatives : ( ( ruleunsigned_number ) | ( rulesigned_number ) );
    public final void rule__Any_number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1921:1: ( ( ruleunsigned_number ) | ( rulesigned_number ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INTEGER_NUMBER) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_SIGNED_INTEGER_NUMBER) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalPascal.g:1922:2: ( ruleunsigned_number )
                    {
                    // InternalPascal.g:1922:2: ( ruleunsigned_number )
                    // InternalPascal.g:1923:3: ruleunsigned_number
                    {
                     before(grammarAccess.getAny_numberAccess().getUnsigned_numberParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleunsigned_number();

                    state._fsp--;

                     after(grammarAccess.getAny_numberAccess().getUnsigned_numberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1928:2: ( rulesigned_number )
                    {
                    // InternalPascal.g:1928:2: ( rulesigned_number )
                    // InternalPascal.g:1929:3: rulesigned_number
                    {
                     before(grammarAccess.getAny_numberAccess().getSigned_numberParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulesigned_number();

                    state._fsp--;

                     after(grammarAccess.getAny_numberAccess().getSigned_numberParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any_number__Alternatives"


    // $ANTLR start "rule__Structured_statement__Alternatives"
    // InternalPascal.g:1938:1: rule__Structured_statement__Alternatives : ( ( ( rule__Structured_statement__CompoundAssignment_0 ) ) | ( ( rule__Structured_statement__RepetitiveAssignment_1 ) ) | ( ( rule__Structured_statement__ConditionalAssignment_2 ) ) );
    public final void rule__Structured_statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1942:1: ( ( ( rule__Structured_statement__CompoundAssignment_0 ) ) | ( ( rule__Structured_statement__RepetitiveAssignment_1 ) ) | ( ( rule__Structured_statement__ConditionalAssignment_2 ) ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt14=1;
                }
                break;
            case 36:
                {
                alt14=2;
                }
                break;
            case 38:
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
                    // InternalPascal.g:1943:2: ( ( rule__Structured_statement__CompoundAssignment_0 ) )
                    {
                    // InternalPascal.g:1943:2: ( ( rule__Structured_statement__CompoundAssignment_0 ) )
                    // InternalPascal.g:1944:3: ( rule__Structured_statement__CompoundAssignment_0 )
                    {
                     before(grammarAccess.getStructured_statementAccess().getCompoundAssignment_0()); 
                    // InternalPascal.g:1945:3: ( rule__Structured_statement__CompoundAssignment_0 )
                    // InternalPascal.g:1945:4: rule__Structured_statement__CompoundAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Structured_statement__CompoundAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStructured_statementAccess().getCompoundAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1949:2: ( ( rule__Structured_statement__RepetitiveAssignment_1 ) )
                    {
                    // InternalPascal.g:1949:2: ( ( rule__Structured_statement__RepetitiveAssignment_1 ) )
                    // InternalPascal.g:1950:3: ( rule__Structured_statement__RepetitiveAssignment_1 )
                    {
                     before(grammarAccess.getStructured_statementAccess().getRepetitiveAssignment_1()); 
                    // InternalPascal.g:1951:3: ( rule__Structured_statement__RepetitiveAssignment_1 )
                    // InternalPascal.g:1951:4: rule__Structured_statement__RepetitiveAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Structured_statement__RepetitiveAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStructured_statementAccess().getRepetitiveAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:1955:2: ( ( rule__Structured_statement__ConditionalAssignment_2 ) )
                    {
                    // InternalPascal.g:1955:2: ( ( rule__Structured_statement__ConditionalAssignment_2 ) )
                    // InternalPascal.g:1956:3: ( rule__Structured_statement__ConditionalAssignment_2 )
                    {
                     before(grammarAccess.getStructured_statementAccess().getConditionalAssignment_2()); 
                    // InternalPascal.g:1957:3: ( rule__Structured_statement__ConditionalAssignment_2 )
                    // InternalPascal.g:1957:4: rule__Structured_statement__ConditionalAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Structured_statement__ConditionalAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getStructured_statementAccess().getConditionalAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structured_statement__Alternatives"


    // $ANTLR start "rule__For_statement__Alternatives_2"
    // InternalPascal.g:1965:1: rule__For_statement__Alternatives_2 : ( ( 'to' ) | ( 'downto' ) );
    public final void rule__For_statement__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1969:1: ( ( 'to' ) | ( 'downto' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            else if ( (LA15_0==21) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalPascal.g:1970:2: ( 'to' )
                    {
                    // InternalPascal.g:1970:2: ( 'to' )
                    // InternalPascal.g:1971:3: 'to'
                    {
                     before(grammarAccess.getFor_statementAccess().getToKeyword_2_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getFor_statementAccess().getToKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1976:2: ( 'downto' )
                    {
                    // InternalPascal.g:1976:2: ( 'downto' )
                    // InternalPascal.g:1977:3: 'downto'
                    {
                     before(grammarAccess.getFor_statementAccess().getDowntoKeyword_2_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getFor_statementAccess().getDowntoKeyword_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For_statement__Alternatives_2"


    // $ANTLR start "rule__Constant__Alternatives"
    // InternalPascal.g:1986:1: rule__Constant__Alternatives : ( ( ( rule__Constant__Group_0__0 ) ) | ( ( rule__Constant__StringAssignment_1 ) ) | ( ( rule__Constant__BoolLiteralAssignment_2 ) ) | ( ( rule__Constant__BoolLiteralAssignment_3 ) ) | ( ( rule__Constant__NilAssignment_4 ) ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:1990:1: ( ( ( rule__Constant__Group_0__0 ) ) | ( ( rule__Constant__StringAssignment_1 ) ) | ( ( rule__Constant__BoolLiteralAssignment_2 ) ) | ( ( rule__Constant__BoolLiteralAssignment_3 ) ) | ( ( rule__Constant__NilAssignment_4 ) ) )
            int alt16=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_INTEGER_NUMBER:
            case RULE_ADDITION_OPERATOR:
                {
                alt16=1;
                }
                break;
            case RULE_STRING:
                {
                alt16=2;
                }
                break;
            case 58:
                {
                alt16=3;
                }
                break;
            case 59:
                {
                alt16=4;
                }
                break;
            case 57:
                {
                alt16=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalPascal.g:1991:2: ( ( rule__Constant__Group_0__0 ) )
                    {
                    // InternalPascal.g:1991:2: ( ( rule__Constant__Group_0__0 ) )
                    // InternalPascal.g:1992:3: ( rule__Constant__Group_0__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_0()); 
                    // InternalPascal.g:1993:3: ( rule__Constant__Group_0__0 )
                    // InternalPascal.g:1993:4: rule__Constant__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:1997:2: ( ( rule__Constant__StringAssignment_1 ) )
                    {
                    // InternalPascal.g:1997:2: ( ( rule__Constant__StringAssignment_1 ) )
                    // InternalPascal.g:1998:3: ( rule__Constant__StringAssignment_1 )
                    {
                     before(grammarAccess.getConstantAccess().getStringAssignment_1()); 
                    // InternalPascal.g:1999:3: ( rule__Constant__StringAssignment_1 )
                    // InternalPascal.g:1999:4: rule__Constant__StringAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__StringAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getStringAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:2003:2: ( ( rule__Constant__BoolLiteralAssignment_2 ) )
                    {
                    // InternalPascal.g:2003:2: ( ( rule__Constant__BoolLiteralAssignment_2 ) )
                    // InternalPascal.g:2004:3: ( rule__Constant__BoolLiteralAssignment_2 )
                    {
                     before(grammarAccess.getConstantAccess().getBoolLiteralAssignment_2()); 
                    // InternalPascal.g:2005:3: ( rule__Constant__BoolLiteralAssignment_2 )
                    // InternalPascal.g:2005:4: rule__Constant__BoolLiteralAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__BoolLiteralAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getBoolLiteralAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:2009:2: ( ( rule__Constant__BoolLiteralAssignment_3 ) )
                    {
                    // InternalPascal.g:2009:2: ( ( rule__Constant__BoolLiteralAssignment_3 ) )
                    // InternalPascal.g:2010:3: ( rule__Constant__BoolLiteralAssignment_3 )
                    {
                     before(grammarAccess.getConstantAccess().getBoolLiteralAssignment_3()); 
                    // InternalPascal.g:2011:3: ( rule__Constant__BoolLiteralAssignment_3 )
                    // InternalPascal.g:2011:4: rule__Constant__BoolLiteralAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__BoolLiteralAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getBoolLiteralAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPascal.g:2015:2: ( ( rule__Constant__NilAssignment_4 ) )
                    {
                    // InternalPascal.g:2015:2: ( ( rule__Constant__NilAssignment_4 ) )
                    // InternalPascal.g:2016:3: ( rule__Constant__NilAssignment_4 )
                    {
                     before(grammarAccess.getConstantAccess().getNilAssignment_4()); 
                    // InternalPascal.g:2017:3: ( rule__Constant__NilAssignment_4 )
                    // InternalPascal.g:2017:4: rule__Constant__NilAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__NilAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getNilAssignment_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Alternatives"


    // $ANTLR start "rule__Constant__Alternatives_0_1"
    // InternalPascal.g:2025:1: rule__Constant__Alternatives_0_1 : ( ( ( rule__Constant__NameAssignment_0_1_0 ) ) | ( ( rule__Constant__NumberAssignment_0_1_1 ) ) );
    public final void rule__Constant__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2029:1: ( ( ( rule__Constant__NameAssignment_0_1_0 ) ) | ( ( rule__Constant__NumberAssignment_0_1_1 ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=RULE_SIGNED_INTEGER_NUMBER && LA17_0<=RULE_INTEGER_NUMBER)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalPascal.g:2030:2: ( ( rule__Constant__NameAssignment_0_1_0 ) )
                    {
                    // InternalPascal.g:2030:2: ( ( rule__Constant__NameAssignment_0_1_0 ) )
                    // InternalPascal.g:2031:3: ( rule__Constant__NameAssignment_0_1_0 )
                    {
                     before(grammarAccess.getConstantAccess().getNameAssignment_0_1_0()); 
                    // InternalPascal.g:2032:3: ( rule__Constant__NameAssignment_0_1_0 )
                    // InternalPascal.g:2032:4: rule__Constant__NameAssignment_0_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__NameAssignment_0_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getNameAssignment_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2036:2: ( ( rule__Constant__NumberAssignment_0_1_1 ) )
                    {
                    // InternalPascal.g:2036:2: ( ( rule__Constant__NumberAssignment_0_1_1 ) )
                    // InternalPascal.g:2037:3: ( rule__Constant__NumberAssignment_0_1_1 )
                    {
                     before(grammarAccess.getConstantAccess().getNumberAssignment_0_1_1()); 
                    // InternalPascal.g:2038:3: ( rule__Constant__NumberAssignment_0_1_1 )
                    // InternalPascal.g:2038:4: rule__Constant__NumberAssignment_0_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__NumberAssignment_0_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getNumberAssignment_0_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Alternatives_0_1"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalPascal.g:2046:1: rule__Type__Alternatives : ( ( ( rule__Type__SimpleAssignment_0 ) ) | ( ( rule__Type__StructuredAssignment_1 ) ) | ( ( rule__Type__PointerAssignment_2 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2050:1: ( ( ( rule__Type__SimpleAssignment_0 ) ) | ( ( rule__Type__StructuredAssignment_1 ) ) | ( ( rule__Type__PointerAssignment_2 ) ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_INTEGER_NUMBER:
            case RULE_ADDITION_OPERATOR:
            case RULE_STRING:
            case RULE_NUMERIC_SUBRANGE:
            case 25:
            case 57:
            case 58:
            case 59:
                {
                alt18=1;
                }
                break;
            case 45:
            case 47:
            case 50:
                {
                alt18=2;
                }
                break;
            case 34:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalPascal.g:2051:2: ( ( rule__Type__SimpleAssignment_0 ) )
                    {
                    // InternalPascal.g:2051:2: ( ( rule__Type__SimpleAssignment_0 ) )
                    // InternalPascal.g:2052:3: ( rule__Type__SimpleAssignment_0 )
                    {
                     before(grammarAccess.getTypeAccess().getSimpleAssignment_0()); 
                    // InternalPascal.g:2053:3: ( rule__Type__SimpleAssignment_0 )
                    // InternalPascal.g:2053:4: rule__Type__SimpleAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__SimpleAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getSimpleAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2057:2: ( ( rule__Type__StructuredAssignment_1 ) )
                    {
                    // InternalPascal.g:2057:2: ( ( rule__Type__StructuredAssignment_1 ) )
                    // InternalPascal.g:2058:3: ( rule__Type__StructuredAssignment_1 )
                    {
                     before(grammarAccess.getTypeAccess().getStructuredAssignment_1()); 
                    // InternalPascal.g:2059:3: ( rule__Type__StructuredAssignment_1 )
                    // InternalPascal.g:2059:4: rule__Type__StructuredAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__StructuredAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getStructuredAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:2063:2: ( ( rule__Type__PointerAssignment_2 ) )
                    {
                    // InternalPascal.g:2063:2: ( ( rule__Type__PointerAssignment_2 ) )
                    // InternalPascal.g:2064:3: ( rule__Type__PointerAssignment_2 )
                    {
                     before(grammarAccess.getTypeAccess().getPointerAssignment_2()); 
                    // InternalPascal.g:2065:3: ( rule__Type__PointerAssignment_2 )
                    // InternalPascal.g:2065:4: rule__Type__PointerAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__PointerAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getPointerAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Simple_type__Alternatives"
    // InternalPascal.g:2073:1: rule__Simple_type__Alternatives : ( ( ( rule__Simple_type__SubrangeAssignment_0 ) ) | ( ( rule__Simple_type__EnumeratedAssignment_1 ) ) | ( ( rule__Simple_type__NameAssignment_2 ) ) );
    public final void rule__Simple_type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2077:1: ( ( ( rule__Simple_type__SubrangeAssignment_0 ) ) | ( ( rule__Simple_type__EnumeratedAssignment_1 ) ) | ( ( rule__Simple_type__NameAssignment_2 ) ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case RULE_SIGNED_INTEGER_NUMBER:
            case RULE_INTEGER_NUMBER:
            case RULE_ADDITION_OPERATOR:
            case RULE_STRING:
            case RULE_NUMERIC_SUBRANGE:
            case 57:
            case 58:
            case 59:
                {
                alt19=1;
                }
                break;
            case RULE_ID:
                {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==44) ) {
                    alt19=1;
                }
                else if ( (LA19_2==EOF||LA19_2==24||LA19_2==27||LA19_2==33) ) {
                    alt19=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

                    throw nvae;
                }
                }
                break;
            case 25:
                {
                alt19=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalPascal.g:2078:2: ( ( rule__Simple_type__SubrangeAssignment_0 ) )
                    {
                    // InternalPascal.g:2078:2: ( ( rule__Simple_type__SubrangeAssignment_0 ) )
                    // InternalPascal.g:2079:3: ( rule__Simple_type__SubrangeAssignment_0 )
                    {
                     before(grammarAccess.getSimple_typeAccess().getSubrangeAssignment_0()); 
                    // InternalPascal.g:2080:3: ( rule__Simple_type__SubrangeAssignment_0 )
                    // InternalPascal.g:2080:4: rule__Simple_type__SubrangeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_type__SubrangeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_typeAccess().getSubrangeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2084:2: ( ( rule__Simple_type__EnumeratedAssignment_1 ) )
                    {
                    // InternalPascal.g:2084:2: ( ( rule__Simple_type__EnumeratedAssignment_1 ) )
                    // InternalPascal.g:2085:3: ( rule__Simple_type__EnumeratedAssignment_1 )
                    {
                     before(grammarAccess.getSimple_typeAccess().getEnumeratedAssignment_1()); 
                    // InternalPascal.g:2086:3: ( rule__Simple_type__EnumeratedAssignment_1 )
                    // InternalPascal.g:2086:4: rule__Simple_type__EnumeratedAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_type__EnumeratedAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_typeAccess().getEnumeratedAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:2090:2: ( ( rule__Simple_type__NameAssignment_2 ) )
                    {
                    // InternalPascal.g:2090:2: ( ( rule__Simple_type__NameAssignment_2 ) )
                    // InternalPascal.g:2091:3: ( rule__Simple_type__NameAssignment_2 )
                    {
                     before(grammarAccess.getSimple_typeAccess().getNameAssignment_2()); 
                    // InternalPascal.g:2092:3: ( rule__Simple_type__NameAssignment_2 )
                    // InternalPascal.g:2092:4: rule__Simple_type__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_type__NameAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSimple_typeAccess().getNameAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_type__Alternatives"


    // $ANTLR start "rule__Subrange_type__Alternatives"
    // InternalPascal.g:2100:1: rule__Subrange_type__Alternatives : ( ( ( rule__Subrange_type__Group_0__0 ) ) | ( ( rule__Subrange_type__Group_1__0 ) ) );
    public final void rule__Subrange_type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2104:1: ( ( ( rule__Subrange_type__Group_0__0 ) ) | ( ( rule__Subrange_type__Group_1__0 ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_INTEGER_NUMBER)||LA20_0==RULE_ADDITION_OPERATOR||LA20_0==RULE_STRING||(LA20_0>=57 && LA20_0<=59)) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_NUMERIC_SUBRANGE) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalPascal.g:2105:2: ( ( rule__Subrange_type__Group_0__0 ) )
                    {
                    // InternalPascal.g:2105:2: ( ( rule__Subrange_type__Group_0__0 ) )
                    // InternalPascal.g:2106:3: ( rule__Subrange_type__Group_0__0 )
                    {
                     before(grammarAccess.getSubrange_typeAccess().getGroup_0()); 
                    // InternalPascal.g:2107:3: ( rule__Subrange_type__Group_0__0 )
                    // InternalPascal.g:2107:4: rule__Subrange_type__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subrange_type__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubrange_typeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2111:2: ( ( rule__Subrange_type__Group_1__0 ) )
                    {
                    // InternalPascal.g:2111:2: ( ( rule__Subrange_type__Group_1__0 ) )
                    // InternalPascal.g:2112:3: ( rule__Subrange_type__Group_1__0 )
                    {
                     before(grammarAccess.getSubrange_typeAccess().getGroup_1()); 
                    // InternalPascal.g:2113:3: ( rule__Subrange_type__Group_1__0 )
                    // InternalPascal.g:2113:4: rule__Subrange_type__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subrange_type__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubrange_typeAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subrange_type__Alternatives"


    // $ANTLR start "rule__Unpacked_structured_type__Alternatives"
    // InternalPascal.g:2121:1: rule__Unpacked_structured_type__Alternatives : ( ( ( rule__Unpacked_structured_type__ArrayAssignment_0 ) ) | ( ( rule__Unpacked_structured_type__DynamicAssignment_1 ) ) | ( ( rule__Unpacked_structured_type__SetAssignment_2 ) ) );
    public final void rule__Unpacked_structured_type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2125:1: ( ( ( rule__Unpacked_structured_type__ArrayAssignment_0 ) ) | ( ( rule__Unpacked_structured_type__DynamicAssignment_1 ) ) | ( ( rule__Unpacked_structured_type__SetAssignment_2 ) ) )
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==45) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==32) ) {
                    alt21=1;
                }
                else if ( (LA21_1==46) ) {
                    alt21=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA21_0==47) ) {
                alt21=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalPascal.g:2126:2: ( ( rule__Unpacked_structured_type__ArrayAssignment_0 ) )
                    {
                    // InternalPascal.g:2126:2: ( ( rule__Unpacked_structured_type__ArrayAssignment_0 ) )
                    // InternalPascal.g:2127:3: ( rule__Unpacked_structured_type__ArrayAssignment_0 )
                    {
                     before(grammarAccess.getUnpacked_structured_typeAccess().getArrayAssignment_0()); 
                    // InternalPascal.g:2128:3: ( rule__Unpacked_structured_type__ArrayAssignment_0 )
                    // InternalPascal.g:2128:4: rule__Unpacked_structured_type__ArrayAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Unpacked_structured_type__ArrayAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnpacked_structured_typeAccess().getArrayAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2132:2: ( ( rule__Unpacked_structured_type__DynamicAssignment_1 ) )
                    {
                    // InternalPascal.g:2132:2: ( ( rule__Unpacked_structured_type__DynamicAssignment_1 ) )
                    // InternalPascal.g:2133:3: ( rule__Unpacked_structured_type__DynamicAssignment_1 )
                    {
                     before(grammarAccess.getUnpacked_structured_typeAccess().getDynamicAssignment_1()); 
                    // InternalPascal.g:2134:3: ( rule__Unpacked_structured_type__DynamicAssignment_1 )
                    // InternalPascal.g:2134:4: rule__Unpacked_structured_type__DynamicAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Unpacked_structured_type__DynamicAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnpacked_structured_typeAccess().getDynamicAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:2138:2: ( ( rule__Unpacked_structured_type__SetAssignment_2 ) )
                    {
                    // InternalPascal.g:2138:2: ( ( rule__Unpacked_structured_type__SetAssignment_2 ) )
                    // InternalPascal.g:2139:3: ( rule__Unpacked_structured_type__SetAssignment_2 )
                    {
                     before(grammarAccess.getUnpacked_structured_typeAccess().getSetAssignment_2()); 
                    // InternalPascal.g:2140:3: ( rule__Unpacked_structured_type__SetAssignment_2 )
                    // InternalPascal.g:2140:4: rule__Unpacked_structured_type__SetAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Unpacked_structured_type__SetAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnpacked_structured_typeAccess().getSetAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unpacked_structured_type__Alternatives"


    // $ANTLR start "rule__Procedure_and_function_declaration_part__Alternatives_0"
    // InternalPascal.g:2148:1: rule__Procedure_and_function_declaration_part__Alternatives_0 : ( ( ( rule__Procedure_and_function_declaration_part__ProceduresAssignment_0_0 ) ) | ( ( rule__Procedure_and_function_declaration_part__FunctionsAssignment_0_1 ) ) );
    public final void rule__Procedure_and_function_declaration_part__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2152:1: ( ( ( rule__Procedure_and_function_declaration_part__ProceduresAssignment_0_0 ) ) | ( ( rule__Procedure_and_function_declaration_part__FunctionsAssignment_0_1 ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==49) ) {
                alt22=1;
            }
            else if ( (LA22_0==51) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalPascal.g:2153:2: ( ( rule__Procedure_and_function_declaration_part__ProceduresAssignment_0_0 ) )
                    {
                    // InternalPascal.g:2153:2: ( ( rule__Procedure_and_function_declaration_part__ProceduresAssignment_0_0 ) )
                    // InternalPascal.g:2154:3: ( rule__Procedure_and_function_declaration_part__ProceduresAssignment_0_0 )
                    {
                     before(grammarAccess.getProcedure_and_function_declaration_partAccess().getProceduresAssignment_0_0()); 
                    // InternalPascal.g:2155:3: ( rule__Procedure_and_function_declaration_part__ProceduresAssignment_0_0 )
                    // InternalPascal.g:2155:4: rule__Procedure_and_function_declaration_part__ProceduresAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Procedure_and_function_declaration_part__ProceduresAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProcedure_and_function_declaration_partAccess().getProceduresAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2159:2: ( ( rule__Procedure_and_function_declaration_part__FunctionsAssignment_0_1 ) )
                    {
                    // InternalPascal.g:2159:2: ( ( rule__Procedure_and_function_declaration_part__FunctionsAssignment_0_1 ) )
                    // InternalPascal.g:2160:3: ( rule__Procedure_and_function_declaration_part__FunctionsAssignment_0_1 )
                    {
                     before(grammarAccess.getProcedure_and_function_declaration_partAccess().getFunctionsAssignment_0_1()); 
                    // InternalPascal.g:2161:3: ( rule__Procedure_and_function_declaration_part__FunctionsAssignment_0_1 )
                    // InternalPascal.g:2161:4: rule__Procedure_and_function_declaration_part__FunctionsAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Procedure_and_function_declaration_part__FunctionsAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getProcedure_and_function_declaration_partAccess().getFunctionsAssignment_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_and_function_declaration_part__Alternatives_0"


    // $ANTLR start "rule__Procedure_declaration__Alternatives_2"
    // InternalPascal.g:2169:1: rule__Procedure_declaration__Alternatives_2 : ( ( ( rule__Procedure_declaration__BlockAssignment_2_0 ) ) | ( ( rule__Procedure_declaration__ForwardAssignment_2_1 ) ) );
    public final void rule__Procedure_declaration__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2173:1: ( ( ( rule__Procedure_declaration__BlockAssignment_2_0 ) ) | ( ( rule__Procedure_declaration__ForwardAssignment_2_1 ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28||LA23_0==41||LA23_0==43||(LA23_0>=48 && LA23_0<=49)||LA23_0==51) ) {
                alt23=1;
            }
            else if ( (LA23_0==60) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalPascal.g:2174:2: ( ( rule__Procedure_declaration__BlockAssignment_2_0 ) )
                    {
                    // InternalPascal.g:2174:2: ( ( rule__Procedure_declaration__BlockAssignment_2_0 ) )
                    // InternalPascal.g:2175:3: ( rule__Procedure_declaration__BlockAssignment_2_0 )
                    {
                     before(grammarAccess.getProcedure_declarationAccess().getBlockAssignment_2_0()); 
                    // InternalPascal.g:2176:3: ( rule__Procedure_declaration__BlockAssignment_2_0 )
                    // InternalPascal.g:2176:4: rule__Procedure_declaration__BlockAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Procedure_declaration__BlockAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProcedure_declarationAccess().getBlockAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2180:2: ( ( rule__Procedure_declaration__ForwardAssignment_2_1 ) )
                    {
                    // InternalPascal.g:2180:2: ( ( rule__Procedure_declaration__ForwardAssignment_2_1 ) )
                    // InternalPascal.g:2181:3: ( rule__Procedure_declaration__ForwardAssignment_2_1 )
                    {
                     before(grammarAccess.getProcedure_declarationAccess().getForwardAssignment_2_1()); 
                    // InternalPascal.g:2182:3: ( rule__Procedure_declaration__ForwardAssignment_2_1 )
                    // InternalPascal.g:2182:4: rule__Procedure_declaration__ForwardAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Procedure_declaration__ForwardAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getProcedure_declarationAccess().getForwardAssignment_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_declaration__Alternatives_2"


    // $ANTLR start "rule__Formal_parameter_section__Alternatives"
    // InternalPascal.g:2190:1: rule__Formal_parameter_section__Alternatives : ( ( ( rule__Formal_parameter_section__ValueAssignment_0 ) ) | ( ( rule__Formal_parameter_section__VariableAssignment_1 ) ) | ( ( rule__Formal_parameter_section__ProcedureAssignment_2 ) ) | ( ( rule__Formal_parameter_section__FunctionAssignment_3 ) ) );
    public final void rule__Formal_parameter_section__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2194:1: ( ( ( rule__Formal_parameter_section__ValueAssignment_0 ) ) | ( ( rule__Formal_parameter_section__VariableAssignment_1 ) ) | ( ( rule__Formal_parameter_section__ProcedureAssignment_2 ) ) | ( ( rule__Formal_parameter_section__FunctionAssignment_3 ) ) )
            int alt24=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt24=1;
                }
                break;
            case 48:
                {
                alt24=2;
                }
                break;
            case 49:
                {
                alt24=3;
                }
                break;
            case 51:
                {
                alt24=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalPascal.g:2195:2: ( ( rule__Formal_parameter_section__ValueAssignment_0 ) )
                    {
                    // InternalPascal.g:2195:2: ( ( rule__Formal_parameter_section__ValueAssignment_0 ) )
                    // InternalPascal.g:2196:3: ( rule__Formal_parameter_section__ValueAssignment_0 )
                    {
                     before(grammarAccess.getFormal_parameter_sectionAccess().getValueAssignment_0()); 
                    // InternalPascal.g:2197:3: ( rule__Formal_parameter_section__ValueAssignment_0 )
                    // InternalPascal.g:2197:4: rule__Formal_parameter_section__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Formal_parameter_section__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormal_parameter_sectionAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2201:2: ( ( rule__Formal_parameter_section__VariableAssignment_1 ) )
                    {
                    // InternalPascal.g:2201:2: ( ( rule__Formal_parameter_section__VariableAssignment_1 ) )
                    // InternalPascal.g:2202:3: ( rule__Formal_parameter_section__VariableAssignment_1 )
                    {
                     before(grammarAccess.getFormal_parameter_sectionAccess().getVariableAssignment_1()); 
                    // InternalPascal.g:2203:3: ( rule__Formal_parameter_section__VariableAssignment_1 )
                    // InternalPascal.g:2203:4: rule__Formal_parameter_section__VariableAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Formal_parameter_section__VariableAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormal_parameter_sectionAccess().getVariableAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPascal.g:2207:2: ( ( rule__Formal_parameter_section__ProcedureAssignment_2 ) )
                    {
                    // InternalPascal.g:2207:2: ( ( rule__Formal_parameter_section__ProcedureAssignment_2 ) )
                    // InternalPascal.g:2208:3: ( rule__Formal_parameter_section__ProcedureAssignment_2 )
                    {
                     before(grammarAccess.getFormal_parameter_sectionAccess().getProcedureAssignment_2()); 
                    // InternalPascal.g:2209:3: ( rule__Formal_parameter_section__ProcedureAssignment_2 )
                    // InternalPascal.g:2209:4: rule__Formal_parameter_section__ProcedureAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Formal_parameter_section__ProcedureAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormal_parameter_sectionAccess().getProcedureAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPascal.g:2213:2: ( ( rule__Formal_parameter_section__FunctionAssignment_3 ) )
                    {
                    // InternalPascal.g:2213:2: ( ( rule__Formal_parameter_section__FunctionAssignment_3 ) )
                    // InternalPascal.g:2214:3: ( rule__Formal_parameter_section__FunctionAssignment_3 )
                    {
                     before(grammarAccess.getFormal_parameter_sectionAccess().getFunctionAssignment_3()); 
                    // InternalPascal.g:2215:3: ( rule__Formal_parameter_section__FunctionAssignment_3 )
                    // InternalPascal.g:2215:4: rule__Formal_parameter_section__FunctionAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Formal_parameter_section__FunctionAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormal_parameter_sectionAccess().getFunctionAssignment_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_section__Alternatives"


    // $ANTLR start "rule__Parameter_type__Alternatives"
    // InternalPascal.g:2223:1: rule__Parameter_type__Alternatives : ( ( ( rule__Parameter_type__ArrayAssignment_0 ) ) | ( ( rule__Parameter_type__NameAssignment_1 ) ) );
    public final void rule__Parameter_type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2227:1: ( ( ( rule__Parameter_type__ArrayAssignment_0 ) ) | ( ( rule__Parameter_type__NameAssignment_1 ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==45||LA25_0==50) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_ID) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalPascal.g:2228:2: ( ( rule__Parameter_type__ArrayAssignment_0 ) )
                    {
                    // InternalPascal.g:2228:2: ( ( rule__Parameter_type__ArrayAssignment_0 ) )
                    // InternalPascal.g:2229:3: ( rule__Parameter_type__ArrayAssignment_0 )
                    {
                     before(grammarAccess.getParameter_typeAccess().getArrayAssignment_0()); 
                    // InternalPascal.g:2230:3: ( rule__Parameter_type__ArrayAssignment_0 )
                    // InternalPascal.g:2230:4: rule__Parameter_type__ArrayAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter_type__ArrayAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameter_typeAccess().getArrayAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2234:2: ( ( rule__Parameter_type__NameAssignment_1 ) )
                    {
                    // InternalPascal.g:2234:2: ( ( rule__Parameter_type__NameAssignment_1 ) )
                    // InternalPascal.g:2235:3: ( rule__Parameter_type__NameAssignment_1 )
                    {
                     before(grammarAccess.getParameter_typeAccess().getNameAssignment_1()); 
                    // InternalPascal.g:2236:3: ( rule__Parameter_type__NameAssignment_1 )
                    // InternalPascal.g:2236:4: rule__Parameter_type__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter_type__NameAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameter_typeAccess().getNameAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_type__Alternatives"


    // $ANTLR start "rule__Conformant_array_schema__Alternatives"
    // InternalPascal.g:2244:1: rule__Conformant_array_schema__Alternatives : ( ( ( rule__Conformant_array_schema__PackedAssignment_0 ) ) | ( ( rule__Conformant_array_schema__UnpackedAssignment_1 ) ) );
    public final void rule__Conformant_array_schema__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2248:1: ( ( ( rule__Conformant_array_schema__PackedAssignment_0 ) ) | ( ( rule__Conformant_array_schema__UnpackedAssignment_1 ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==50) ) {
                alt26=1;
            }
            else if ( (LA26_0==45) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalPascal.g:2249:2: ( ( rule__Conformant_array_schema__PackedAssignment_0 ) )
                    {
                    // InternalPascal.g:2249:2: ( ( rule__Conformant_array_schema__PackedAssignment_0 ) )
                    // InternalPascal.g:2250:3: ( rule__Conformant_array_schema__PackedAssignment_0 )
                    {
                     before(grammarAccess.getConformant_array_schemaAccess().getPackedAssignment_0()); 
                    // InternalPascal.g:2251:3: ( rule__Conformant_array_schema__PackedAssignment_0 )
                    // InternalPascal.g:2251:4: rule__Conformant_array_schema__PackedAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conformant_array_schema__PackedAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConformant_array_schemaAccess().getPackedAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2255:2: ( ( rule__Conformant_array_schema__UnpackedAssignment_1 ) )
                    {
                    // InternalPascal.g:2255:2: ( ( rule__Conformant_array_schema__UnpackedAssignment_1 ) )
                    // InternalPascal.g:2256:3: ( rule__Conformant_array_schema__UnpackedAssignment_1 )
                    {
                     before(grammarAccess.getConformant_array_schemaAccess().getUnpackedAssignment_1()); 
                    // InternalPascal.g:2257:3: ( rule__Conformant_array_schema__UnpackedAssignment_1 )
                    // InternalPascal.g:2257:4: rule__Conformant_array_schema__UnpackedAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conformant_array_schema__UnpackedAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getConformant_array_schemaAccess().getUnpackedAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conformant_array_schema__Alternatives"


    // $ANTLR start "rule__Function_declaration__Alternatives_2"
    // InternalPascal.g:2265:1: rule__Function_declaration__Alternatives_2 : ( ( ( rule__Function_declaration__BlockAssignment_2_0 ) ) | ( ( rule__Function_declaration__ForwardAssignment_2_1 ) ) );
    public final void rule__Function_declaration__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2269:1: ( ( ( rule__Function_declaration__BlockAssignment_2_0 ) ) | ( ( rule__Function_declaration__ForwardAssignment_2_1 ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==28||LA27_0==41||LA27_0==43||(LA27_0>=48 && LA27_0<=49)||LA27_0==51) ) {
                alt27=1;
            }
            else if ( (LA27_0==60) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalPascal.g:2270:2: ( ( rule__Function_declaration__BlockAssignment_2_0 ) )
                    {
                    // InternalPascal.g:2270:2: ( ( rule__Function_declaration__BlockAssignment_2_0 ) )
                    // InternalPascal.g:2271:3: ( rule__Function_declaration__BlockAssignment_2_0 )
                    {
                     before(grammarAccess.getFunction_declarationAccess().getBlockAssignment_2_0()); 
                    // InternalPascal.g:2272:3: ( rule__Function_declaration__BlockAssignment_2_0 )
                    // InternalPascal.g:2272:4: rule__Function_declaration__BlockAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function_declaration__BlockAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunction_declarationAccess().getBlockAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPascal.g:2276:2: ( ( rule__Function_declaration__ForwardAssignment_2_1 ) )
                    {
                    // InternalPascal.g:2276:2: ( ( rule__Function_declaration__ForwardAssignment_2_1 ) )
                    // InternalPascal.g:2277:3: ( rule__Function_declaration__ForwardAssignment_2_1 )
                    {
                     before(grammarAccess.getFunction_declarationAccess().getForwardAssignment_2_1()); 
                    // InternalPascal.g:2278:3: ( rule__Function_declaration__ForwardAssignment_2_1 )
                    // InternalPascal.g:2278:4: rule__Function_declaration__ForwardAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function_declaration__ForwardAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunction_declarationAccess().getForwardAssignment_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_declaration__Alternatives_2"


    // $ANTLR start "rule__Program__Group__0"
    // InternalPascal.g:2286:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2290:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalPascal.g:2291:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalPascal.g:2298:1: rule__Program__Group__0__Impl : ( ( rule__Program__HeadingAssignment_0 ) ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2302:1: ( ( ( rule__Program__HeadingAssignment_0 ) ) )
            // InternalPascal.g:2303:1: ( ( rule__Program__HeadingAssignment_0 ) )
            {
            // InternalPascal.g:2303:1: ( ( rule__Program__HeadingAssignment_0 ) )
            // InternalPascal.g:2304:2: ( rule__Program__HeadingAssignment_0 )
            {
             before(grammarAccess.getProgramAccess().getHeadingAssignment_0()); 
            // InternalPascal.g:2305:2: ( rule__Program__HeadingAssignment_0 )
            // InternalPascal.g:2305:3: rule__Program__HeadingAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Program__HeadingAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getHeadingAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalPascal.g:2313:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2317:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalPascal.g:2318:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalPascal.g:2325:1: rule__Program__Group__1__Impl : ( ( rule__Program__BlockAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2329:1: ( ( ( rule__Program__BlockAssignment_1 ) ) )
            // InternalPascal.g:2330:1: ( ( rule__Program__BlockAssignment_1 ) )
            {
            // InternalPascal.g:2330:1: ( ( rule__Program__BlockAssignment_1 ) )
            // InternalPascal.g:2331:2: ( rule__Program__BlockAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getBlockAssignment_1()); 
            // InternalPascal.g:2332:2: ( rule__Program__BlockAssignment_1 )
            // InternalPascal.g:2332:3: rule__Program__BlockAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__BlockAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getBlockAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // InternalPascal.g:2340:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2344:1: ( rule__Program__Group__2__Impl )
            // InternalPascal.g:2345:2: rule__Program__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // InternalPascal.g:2351:1: rule__Program__Group__2__Impl : ( '.' ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2355:1: ( ( '.' ) )
            // InternalPascal.g:2356:1: ( '.' )
            {
            // InternalPascal.g:2356:1: ( '.' )
            // InternalPascal.g:2357:2: '.'
            {
             before(grammarAccess.getProgramAccess().getFullStopKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Program_heading_block__Group__0"
    // InternalPascal.g:2367:1: rule__Program_heading_block__Group__0 : rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1 ;
    public final void rule__Program_heading_block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2371:1: ( rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1 )
            // InternalPascal.g:2372:2: rule__Program_heading_block__Group__0__Impl rule__Program_heading_block__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Program_heading_block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program_heading_block__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading_block__Group__0"


    // $ANTLR start "rule__Program_heading_block__Group__0__Impl"
    // InternalPascal.g:2379:1: rule__Program_heading_block__Group__0__Impl : ( 'program' ) ;
    public final void rule__Program_heading_block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2383:1: ( ( 'program' ) )
            // InternalPascal.g:2384:1: ( 'program' )
            {
            // InternalPascal.g:2384:1: ( 'program' )
            // InternalPascal.g:2385:2: 'program'
            {
             before(grammarAccess.getProgram_heading_blockAccess().getProgramKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getProgram_heading_blockAccess().getProgramKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading_block__Group__0__Impl"


    // $ANTLR start "rule__Program_heading_block__Group__1"
    // InternalPascal.g:2394:1: rule__Program_heading_block__Group__1 : rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2 ;
    public final void rule__Program_heading_block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2398:1: ( rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2 )
            // InternalPascal.g:2399:2: rule__Program_heading_block__Group__1__Impl rule__Program_heading_block__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Program_heading_block__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program_heading_block__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading_block__Group__1"


    // $ANTLR start "rule__Program_heading_block__Group__1__Impl"
    // InternalPascal.g:2406:1: rule__Program_heading_block__Group__1__Impl : ( ( rule__Program_heading_block__NameAssignment_1 ) ) ;
    public final void rule__Program_heading_block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2410:1: ( ( ( rule__Program_heading_block__NameAssignment_1 ) ) )
            // InternalPascal.g:2411:1: ( ( rule__Program_heading_block__NameAssignment_1 ) )
            {
            // InternalPascal.g:2411:1: ( ( rule__Program_heading_block__NameAssignment_1 ) )
            // InternalPascal.g:2412:2: ( rule__Program_heading_block__NameAssignment_1 )
            {
             before(grammarAccess.getProgram_heading_blockAccess().getNameAssignment_1()); 
            // InternalPascal.g:2413:2: ( rule__Program_heading_block__NameAssignment_1 )
            // InternalPascal.g:2413:3: rule__Program_heading_block__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Program_heading_block__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProgram_heading_blockAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading_block__Group__1__Impl"


    // $ANTLR start "rule__Program_heading_block__Group__2"
    // InternalPascal.g:2421:1: rule__Program_heading_block__Group__2 : rule__Program_heading_block__Group__2__Impl rule__Program_heading_block__Group__3 ;
    public final void rule__Program_heading_block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2425:1: ( rule__Program_heading_block__Group__2__Impl rule__Program_heading_block__Group__3 )
            // InternalPascal.g:2426:2: rule__Program_heading_block__Group__2__Impl rule__Program_heading_block__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Program_heading_block__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program_heading_block__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading_block__Group__2"


    // $ANTLR start "rule__Program_heading_block__Group__2__Impl"
    // InternalPascal.g:2433:1: rule__Program_heading_block__Group__2__Impl : ( ( rule__Program_heading_block__Group_2__0 )? ) ;
    public final void rule__Program_heading_block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2437:1: ( ( ( rule__Program_heading_block__Group_2__0 )? ) )
            // InternalPascal.g:2438:1: ( ( rule__Program_heading_block__Group_2__0 )? )
            {
            // InternalPascal.g:2438:1: ( ( rule__Program_heading_block__Group_2__0 )? )
            // InternalPascal.g:2439:2: ( rule__Program_heading_block__Group_2__0 )?
            {
             before(grammarAccess.getProgram_heading_blockAccess().getGroup_2()); 
            // InternalPascal.g:2440:2: ( rule__Program_heading_block__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==25) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalPascal.g:2440:3: rule__Program_heading_block__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Program_heading_block__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProgram_heading_blockAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading_block__Group__2__Impl"


    // $ANTLR start "rule__Program_heading_block__Group__3"
    // InternalPascal.g:2448:1: rule__Program_heading_block__Group__3 : rule__Program_heading_block__Group__3__Impl ;
    public final void rule__Program_heading_block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2452:1: ( rule__Program_heading_block__Group__3__Impl )
            // InternalPascal.g:2453:2: rule__Program_heading_block__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program_heading_block__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading_block__Group__3"


    // $ANTLR start "rule__Program_heading_block__Group__3__Impl"
    // InternalPascal.g:2459:1: rule__Program_heading_block__Group__3__Impl : ( ';' ) ;
    public final void rule__Program_heading_block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2463:1: ( ( ';' ) )
            // InternalPascal.g:2464:1: ( ';' )
            {
            // InternalPascal.g:2464:1: ( ';' )
            // InternalPascal.g:2465:2: ';'
            {
             before(grammarAccess.getProgram_heading_blockAccess().getSemicolonKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getProgram_heading_blockAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading_block__Group__3__Impl"


    // $ANTLR start "rule__Program_heading_block__Group_2__0"
    // InternalPascal.g:2475:1: rule__Program_heading_block__Group_2__0 : rule__Program_heading_block__Group_2__0__Impl rule__Program_heading_block__Group_2__1 ;
    public final void rule__Program_heading_block__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2479:1: ( rule__Program_heading_block__Group_2__0__Impl rule__Program_heading_block__Group_2__1 )
            // InternalPascal.g:2480:2: rule__Program_heading_block__Group_2__0__Impl rule__Program_heading_block__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Program_heading_block__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program_heading_block__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading_block__Group_2__0"


    // $ANTLR start "rule__Program_heading_block__Group_2__0__Impl"
    // InternalPascal.g:2487:1: rule__Program_heading_block__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Program_heading_block__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2491:1: ( ( '(' ) )
            // InternalPascal.g:2492:1: ( '(' )
            {
            // InternalPascal.g:2492:1: ( '(' )
            // InternalPascal.g:2493:2: '('
            {
             before(grammarAccess.getProgram_heading_blockAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getProgram_heading_blockAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading_block__Group_2__0__Impl"


    // $ANTLR start "rule__Program_heading_block__Group_2__1"
    // InternalPascal.g:2502:1: rule__Program_heading_block__Group_2__1 : rule__Program_heading_block__Group_2__1__Impl rule__Program_heading_block__Group_2__2 ;
    public final void rule__Program_heading_block__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2506:1: ( rule__Program_heading_block__Group_2__1__Impl rule__Program_heading_block__Group_2__2 )
            // InternalPascal.g:2507:2: rule__Program_heading_block__Group_2__1__Impl rule__Program_heading_block__Group_2__2
            {
            pushFollow(FOLLOW_8);
            rule__Program_heading_block__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program_heading_block__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading_block__Group_2__1"


    // $ANTLR start "rule__Program_heading_block__Group_2__1__Impl"
    // InternalPascal.g:2514:1: rule__Program_heading_block__Group_2__1__Impl : ( ( rule__Program_heading_block__IdentifiersAssignment_2_1 ) ) ;
    public final void rule__Program_heading_block__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2518:1: ( ( ( rule__Program_heading_block__IdentifiersAssignment_2_1 ) ) )
            // InternalPascal.g:2519:1: ( ( rule__Program_heading_block__IdentifiersAssignment_2_1 ) )
            {
            // InternalPascal.g:2519:1: ( ( rule__Program_heading_block__IdentifiersAssignment_2_1 ) )
            // InternalPascal.g:2520:2: ( rule__Program_heading_block__IdentifiersAssignment_2_1 )
            {
             before(grammarAccess.getProgram_heading_blockAccess().getIdentifiersAssignment_2_1()); 
            // InternalPascal.g:2521:2: ( rule__Program_heading_block__IdentifiersAssignment_2_1 )
            // InternalPascal.g:2521:3: rule__Program_heading_block__IdentifiersAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Program_heading_block__IdentifiersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getProgram_heading_blockAccess().getIdentifiersAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading_block__Group_2__1__Impl"


    // $ANTLR start "rule__Program_heading_block__Group_2__2"
    // InternalPascal.g:2529:1: rule__Program_heading_block__Group_2__2 : rule__Program_heading_block__Group_2__2__Impl ;
    public final void rule__Program_heading_block__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2533:1: ( rule__Program_heading_block__Group_2__2__Impl )
            // InternalPascal.g:2534:2: rule__Program_heading_block__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program_heading_block__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading_block__Group_2__2"


    // $ANTLR start "rule__Program_heading_block__Group_2__2__Impl"
    // InternalPascal.g:2540:1: rule__Program_heading_block__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Program_heading_block__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2544:1: ( ( ')' ) )
            // InternalPascal.g:2545:1: ( ')' )
            {
            // InternalPascal.g:2545:1: ( ')' )
            // InternalPascal.g:2546:2: ')'
            {
             before(grammarAccess.getProgram_heading_blockAccess().getRightParenthesisKeyword_2_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getProgram_heading_blockAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading_block__Group_2__2__Impl"


    // $ANTLR start "rule__Identifier_list__Group__0"
    // InternalPascal.g:2556:1: rule__Identifier_list__Group__0 : rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 ;
    public final void rule__Identifier_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2560:1: ( rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1 )
            // InternalPascal.g:2561:2: rule__Identifier_list__Group__0__Impl rule__Identifier_list__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Identifier_list__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Identifier_list__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier_list__Group__0"


    // $ANTLR start "rule__Identifier_list__Group__0__Impl"
    // InternalPascal.g:2568:1: rule__Identifier_list__Group__0__Impl : ( ( rule__Identifier_list__NamesAssignment_0 ) ) ;
    public final void rule__Identifier_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2572:1: ( ( ( rule__Identifier_list__NamesAssignment_0 ) ) )
            // InternalPascal.g:2573:1: ( ( rule__Identifier_list__NamesAssignment_0 ) )
            {
            // InternalPascal.g:2573:1: ( ( rule__Identifier_list__NamesAssignment_0 ) )
            // InternalPascal.g:2574:2: ( rule__Identifier_list__NamesAssignment_0 )
            {
             before(grammarAccess.getIdentifier_listAccess().getNamesAssignment_0()); 
            // InternalPascal.g:2575:2: ( rule__Identifier_list__NamesAssignment_0 )
            // InternalPascal.g:2575:3: rule__Identifier_list__NamesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Identifier_list__NamesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIdentifier_listAccess().getNamesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier_list__Group__0__Impl"


    // $ANTLR start "rule__Identifier_list__Group__1"
    // InternalPascal.g:2583:1: rule__Identifier_list__Group__1 : rule__Identifier_list__Group__1__Impl ;
    public final void rule__Identifier_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2587:1: ( rule__Identifier_list__Group__1__Impl )
            // InternalPascal.g:2588:2: rule__Identifier_list__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Identifier_list__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier_list__Group__1"


    // $ANTLR start "rule__Identifier_list__Group__1__Impl"
    // InternalPascal.g:2594:1: rule__Identifier_list__Group__1__Impl : ( ( rule__Identifier_list__Group_1__0 )* ) ;
    public final void rule__Identifier_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2598:1: ( ( ( rule__Identifier_list__Group_1__0 )* ) )
            // InternalPascal.g:2599:1: ( ( rule__Identifier_list__Group_1__0 )* )
            {
            // InternalPascal.g:2599:1: ( ( rule__Identifier_list__Group_1__0 )* )
            // InternalPascal.g:2600:2: ( rule__Identifier_list__Group_1__0 )*
            {
             before(grammarAccess.getIdentifier_listAccess().getGroup_1()); 
            // InternalPascal.g:2601:2: ( rule__Identifier_list__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==27) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalPascal.g:2601:3: rule__Identifier_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Identifier_list__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getIdentifier_listAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier_list__Group__1__Impl"


    // $ANTLR start "rule__Identifier_list__Group_1__0"
    // InternalPascal.g:2610:1: rule__Identifier_list__Group_1__0 : rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 ;
    public final void rule__Identifier_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2614:1: ( rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1 )
            // InternalPascal.g:2615:2: rule__Identifier_list__Group_1__0__Impl rule__Identifier_list__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Identifier_list__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Identifier_list__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier_list__Group_1__0"


    // $ANTLR start "rule__Identifier_list__Group_1__0__Impl"
    // InternalPascal.g:2622:1: rule__Identifier_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Identifier_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2626:1: ( ( ',' ) )
            // InternalPascal.g:2627:1: ( ',' )
            {
            // InternalPascal.g:2627:1: ( ',' )
            // InternalPascal.g:2628:2: ','
            {
             before(grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getIdentifier_listAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier_list__Group_1__0__Impl"


    // $ANTLR start "rule__Identifier_list__Group_1__1"
    // InternalPascal.g:2637:1: rule__Identifier_list__Group_1__1 : rule__Identifier_list__Group_1__1__Impl ;
    public final void rule__Identifier_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2641:1: ( rule__Identifier_list__Group_1__1__Impl )
            // InternalPascal.g:2642:2: rule__Identifier_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Identifier_list__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier_list__Group_1__1"


    // $ANTLR start "rule__Identifier_list__Group_1__1__Impl"
    // InternalPascal.g:2648:1: rule__Identifier_list__Group_1__1__Impl : ( ( rule__Identifier_list__NamesAssignment_1_1 ) ) ;
    public final void rule__Identifier_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2652:1: ( ( ( rule__Identifier_list__NamesAssignment_1_1 ) ) )
            // InternalPascal.g:2653:1: ( ( rule__Identifier_list__NamesAssignment_1_1 ) )
            {
            // InternalPascal.g:2653:1: ( ( rule__Identifier_list__NamesAssignment_1_1 ) )
            // InternalPascal.g:2654:2: ( rule__Identifier_list__NamesAssignment_1_1 )
            {
             before(grammarAccess.getIdentifier_listAccess().getNamesAssignment_1_1()); 
            // InternalPascal.g:2655:2: ( rule__Identifier_list__NamesAssignment_1_1 )
            // InternalPascal.g:2655:3: rule__Identifier_list__NamesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Identifier_list__NamesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getIdentifier_listAccess().getNamesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier_list__Group_1__1__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // InternalPascal.g:2664:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2668:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalPascal.g:2669:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // InternalPascal.g:2676:1: rule__Block__Group__0__Impl : ( ( rule__Block__ConstantAssignment_0 )? ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2680:1: ( ( ( rule__Block__ConstantAssignment_0 )? ) )
            // InternalPascal.g:2681:1: ( ( rule__Block__ConstantAssignment_0 )? )
            {
            // InternalPascal.g:2681:1: ( ( rule__Block__ConstantAssignment_0 )? )
            // InternalPascal.g:2682:2: ( rule__Block__ConstantAssignment_0 )?
            {
             before(grammarAccess.getBlockAccess().getConstantAssignment_0()); 
            // InternalPascal.g:2683:2: ( rule__Block__ConstantAssignment_0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==41) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalPascal.g:2683:3: rule__Block__ConstantAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Block__ConstantAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBlockAccess().getConstantAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // InternalPascal.g:2691:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2695:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalPascal.g:2696:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Block__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // InternalPascal.g:2703:1: rule__Block__Group__1__Impl : ( ( rule__Block__TypeAssignment_1 )? ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2707:1: ( ( ( rule__Block__TypeAssignment_1 )? ) )
            // InternalPascal.g:2708:1: ( ( rule__Block__TypeAssignment_1 )? )
            {
            // InternalPascal.g:2708:1: ( ( rule__Block__TypeAssignment_1 )? )
            // InternalPascal.g:2709:2: ( rule__Block__TypeAssignment_1 )?
            {
             before(grammarAccess.getBlockAccess().getTypeAssignment_1()); 
            // InternalPascal.g:2710:2: ( rule__Block__TypeAssignment_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==43) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalPascal.g:2710:3: rule__Block__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Block__TypeAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBlockAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__2"
    // InternalPascal.g:2718:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2722:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalPascal.g:2723:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Block__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2"


    // $ANTLR start "rule__Block__Group__2__Impl"
    // InternalPascal.g:2730:1: rule__Block__Group__2__Impl : ( ( rule__Block__VariableAssignment_2 )? ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2734:1: ( ( ( rule__Block__VariableAssignment_2 )? ) )
            // InternalPascal.g:2735:1: ( ( rule__Block__VariableAssignment_2 )? )
            {
            // InternalPascal.g:2735:1: ( ( rule__Block__VariableAssignment_2 )? )
            // InternalPascal.g:2736:2: ( rule__Block__VariableAssignment_2 )?
            {
             before(grammarAccess.getBlockAccess().getVariableAssignment_2()); 
            // InternalPascal.g:2737:2: ( rule__Block__VariableAssignment_2 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==48) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalPascal.g:2737:3: rule__Block__VariableAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Block__VariableAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBlockAccess().getVariableAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2__Impl"


    // $ANTLR start "rule__Block__Group__3"
    // InternalPascal.g:2745:1: rule__Block__Group__3 : rule__Block__Group__3__Impl rule__Block__Group__4 ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2749:1: ( rule__Block__Group__3__Impl rule__Block__Group__4 )
            // InternalPascal.g:2750:2: rule__Block__Group__3__Impl rule__Block__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Block__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3"


    // $ANTLR start "rule__Block__Group__3__Impl"
    // InternalPascal.g:2757:1: rule__Block__Group__3__Impl : ( ( rule__Block__AbstractionAssignment_3 )? ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2761:1: ( ( ( rule__Block__AbstractionAssignment_3 )? ) )
            // InternalPascal.g:2762:1: ( ( rule__Block__AbstractionAssignment_3 )? )
            {
            // InternalPascal.g:2762:1: ( ( rule__Block__AbstractionAssignment_3 )? )
            // InternalPascal.g:2763:2: ( rule__Block__AbstractionAssignment_3 )?
            {
             before(grammarAccess.getBlockAccess().getAbstractionAssignment_3()); 
            // InternalPascal.g:2764:2: ( rule__Block__AbstractionAssignment_3 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==49||LA33_0==51) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalPascal.g:2764:3: rule__Block__AbstractionAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Block__AbstractionAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBlockAccess().getAbstractionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3__Impl"


    // $ANTLR start "rule__Block__Group__4"
    // InternalPascal.g:2772:1: rule__Block__Group__4 : rule__Block__Group__4__Impl ;
    public final void rule__Block__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2776:1: ( rule__Block__Group__4__Impl )
            // InternalPascal.g:2777:2: rule__Block__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__4"


    // $ANTLR start "rule__Block__Group__4__Impl"
    // InternalPascal.g:2783:1: rule__Block__Group__4__Impl : ( ( rule__Block__StatementAssignment_4 ) ) ;
    public final void rule__Block__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2787:1: ( ( ( rule__Block__StatementAssignment_4 ) ) )
            // InternalPascal.g:2788:1: ( ( rule__Block__StatementAssignment_4 ) )
            {
            // InternalPascal.g:2788:1: ( ( rule__Block__StatementAssignment_4 ) )
            // InternalPascal.g:2789:2: ( rule__Block__StatementAssignment_4 )
            {
             before(grammarAccess.getBlockAccess().getStatementAssignment_4()); 
            // InternalPascal.g:2790:2: ( rule__Block__StatementAssignment_4 )
            // InternalPascal.g:2790:3: rule__Block__StatementAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Block__StatementAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getStatementAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__4__Impl"


    // $ANTLR start "rule__Statement_part__Group__0"
    // InternalPascal.g:2799:1: rule__Statement_part__Group__0 : rule__Statement_part__Group__0__Impl rule__Statement_part__Group__1 ;
    public final void rule__Statement_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2803:1: ( rule__Statement_part__Group__0__Impl rule__Statement_part__Group__1 )
            // InternalPascal.g:2804:2: rule__Statement_part__Group__0__Impl rule__Statement_part__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Statement_part__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement_part__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_part__Group__0"


    // $ANTLR start "rule__Statement_part__Group__0__Impl"
    // InternalPascal.g:2811:1: rule__Statement_part__Group__0__Impl : ( 'begin' ) ;
    public final void rule__Statement_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2815:1: ( ( 'begin' ) )
            // InternalPascal.g:2816:1: ( 'begin' )
            {
            // InternalPascal.g:2816:1: ( 'begin' )
            // InternalPascal.g:2817:2: 'begin'
            {
             before(grammarAccess.getStatement_partAccess().getBeginKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getStatement_partAccess().getBeginKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_part__Group__0__Impl"


    // $ANTLR start "rule__Statement_part__Group__1"
    // InternalPascal.g:2826:1: rule__Statement_part__Group__1 : rule__Statement_part__Group__1__Impl rule__Statement_part__Group__2 ;
    public final void rule__Statement_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2830:1: ( rule__Statement_part__Group__1__Impl rule__Statement_part__Group__2 )
            // InternalPascal.g:2831:2: rule__Statement_part__Group__1__Impl rule__Statement_part__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Statement_part__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement_part__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_part__Group__1"


    // $ANTLR start "rule__Statement_part__Group__1__Impl"
    // InternalPascal.g:2838:1: rule__Statement_part__Group__1__Impl : ( ( rule__Statement_part__SequenceAssignment_1 ) ) ;
    public final void rule__Statement_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2842:1: ( ( ( rule__Statement_part__SequenceAssignment_1 ) ) )
            // InternalPascal.g:2843:1: ( ( rule__Statement_part__SequenceAssignment_1 ) )
            {
            // InternalPascal.g:2843:1: ( ( rule__Statement_part__SequenceAssignment_1 ) )
            // InternalPascal.g:2844:2: ( rule__Statement_part__SequenceAssignment_1 )
            {
             before(grammarAccess.getStatement_partAccess().getSequenceAssignment_1()); 
            // InternalPascal.g:2845:2: ( rule__Statement_part__SequenceAssignment_1 )
            // InternalPascal.g:2845:3: rule__Statement_part__SequenceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Statement_part__SequenceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStatement_partAccess().getSequenceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_part__Group__1__Impl"


    // $ANTLR start "rule__Statement_part__Group__2"
    // InternalPascal.g:2853:1: rule__Statement_part__Group__2 : rule__Statement_part__Group__2__Impl ;
    public final void rule__Statement_part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2857:1: ( rule__Statement_part__Group__2__Impl )
            // InternalPascal.g:2858:2: rule__Statement_part__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement_part__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_part__Group__2"


    // $ANTLR start "rule__Statement_part__Group__2__Impl"
    // InternalPascal.g:2864:1: rule__Statement_part__Group__2__Impl : ( 'end' ) ;
    public final void rule__Statement_part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2868:1: ( ( 'end' ) )
            // InternalPascal.g:2869:1: ( 'end' )
            {
            // InternalPascal.g:2869:1: ( 'end' )
            // InternalPascal.g:2870:2: 'end'
            {
             before(grammarAccess.getStatement_partAccess().getEndKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStatement_partAccess().getEndKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_part__Group__2__Impl"


    // $ANTLR start "rule__Statement_sequence__Group__0"
    // InternalPascal.g:2880:1: rule__Statement_sequence__Group__0 : rule__Statement_sequence__Group__0__Impl rule__Statement_sequence__Group__1 ;
    public final void rule__Statement_sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2884:1: ( rule__Statement_sequence__Group__0__Impl rule__Statement_sequence__Group__1 )
            // InternalPascal.g:2885:2: rule__Statement_sequence__Group__0__Impl rule__Statement_sequence__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Statement_sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement_sequence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_sequence__Group__0"


    // $ANTLR start "rule__Statement_sequence__Group__0__Impl"
    // InternalPascal.g:2892:1: rule__Statement_sequence__Group__0__Impl : ( ( rule__Statement_sequence__StatementsAssignment_0 ) ) ;
    public final void rule__Statement_sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2896:1: ( ( ( rule__Statement_sequence__StatementsAssignment_0 ) ) )
            // InternalPascal.g:2897:1: ( ( rule__Statement_sequence__StatementsAssignment_0 ) )
            {
            // InternalPascal.g:2897:1: ( ( rule__Statement_sequence__StatementsAssignment_0 ) )
            // InternalPascal.g:2898:2: ( rule__Statement_sequence__StatementsAssignment_0 )
            {
             before(grammarAccess.getStatement_sequenceAccess().getStatementsAssignment_0()); 
            // InternalPascal.g:2899:2: ( rule__Statement_sequence__StatementsAssignment_0 )
            // InternalPascal.g:2899:3: rule__Statement_sequence__StatementsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Statement_sequence__StatementsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStatement_sequenceAccess().getStatementsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_sequence__Group__0__Impl"


    // $ANTLR start "rule__Statement_sequence__Group__1"
    // InternalPascal.g:2907:1: rule__Statement_sequence__Group__1 : rule__Statement_sequence__Group__1__Impl ;
    public final void rule__Statement_sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2911:1: ( rule__Statement_sequence__Group__1__Impl )
            // InternalPascal.g:2912:2: rule__Statement_sequence__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement_sequence__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_sequence__Group__1"


    // $ANTLR start "rule__Statement_sequence__Group__1__Impl"
    // InternalPascal.g:2918:1: rule__Statement_sequence__Group__1__Impl : ( ( rule__Statement_sequence__Group_1__0 )* ) ;
    public final void rule__Statement_sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2922:1: ( ( ( rule__Statement_sequence__Group_1__0 )* ) )
            // InternalPascal.g:2923:1: ( ( rule__Statement_sequence__Group_1__0 )* )
            {
            // InternalPascal.g:2923:1: ( ( rule__Statement_sequence__Group_1__0 )* )
            // InternalPascal.g:2924:2: ( rule__Statement_sequence__Group_1__0 )*
            {
             before(grammarAccess.getStatement_sequenceAccess().getGroup_1()); 
            // InternalPascal.g:2925:2: ( rule__Statement_sequence__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==24) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalPascal.g:2925:3: rule__Statement_sequence__Group_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Statement_sequence__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getStatement_sequenceAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_sequence__Group__1__Impl"


    // $ANTLR start "rule__Statement_sequence__Group_1__0"
    // InternalPascal.g:2934:1: rule__Statement_sequence__Group_1__0 : rule__Statement_sequence__Group_1__0__Impl rule__Statement_sequence__Group_1__1 ;
    public final void rule__Statement_sequence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2938:1: ( rule__Statement_sequence__Group_1__0__Impl rule__Statement_sequence__Group_1__1 )
            // InternalPascal.g:2939:2: rule__Statement_sequence__Group_1__0__Impl rule__Statement_sequence__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Statement_sequence__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement_sequence__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_sequence__Group_1__0"


    // $ANTLR start "rule__Statement_sequence__Group_1__0__Impl"
    // InternalPascal.g:2946:1: rule__Statement_sequence__Group_1__0__Impl : ( ';' ) ;
    public final void rule__Statement_sequence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2950:1: ( ( ';' ) )
            // InternalPascal.g:2951:1: ( ';' )
            {
            // InternalPascal.g:2951:1: ( ';' )
            // InternalPascal.g:2952:2: ';'
            {
             before(grammarAccess.getStatement_sequenceAccess().getSemicolonKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getStatement_sequenceAccess().getSemicolonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_sequence__Group_1__0__Impl"


    // $ANTLR start "rule__Statement_sequence__Group_1__1"
    // InternalPascal.g:2961:1: rule__Statement_sequence__Group_1__1 : rule__Statement_sequence__Group_1__1__Impl ;
    public final void rule__Statement_sequence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2965:1: ( rule__Statement_sequence__Group_1__1__Impl )
            // InternalPascal.g:2966:2: rule__Statement_sequence__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement_sequence__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_sequence__Group_1__1"


    // $ANTLR start "rule__Statement_sequence__Group_1__1__Impl"
    // InternalPascal.g:2972:1: rule__Statement_sequence__Group_1__1__Impl : ( ( rule__Statement_sequence__StatementsAssignment_1_1 ) ) ;
    public final void rule__Statement_sequence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2976:1: ( ( ( rule__Statement_sequence__StatementsAssignment_1_1 ) ) )
            // InternalPascal.g:2977:1: ( ( rule__Statement_sequence__StatementsAssignment_1_1 ) )
            {
            // InternalPascal.g:2977:1: ( ( rule__Statement_sequence__StatementsAssignment_1_1 ) )
            // InternalPascal.g:2978:2: ( rule__Statement_sequence__StatementsAssignment_1_1 )
            {
             before(grammarAccess.getStatement_sequenceAccess().getStatementsAssignment_1_1()); 
            // InternalPascal.g:2979:2: ( rule__Statement_sequence__StatementsAssignment_1_1 )
            // InternalPascal.g:2979:3: rule__Statement_sequence__StatementsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Statement_sequence__StatementsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStatement_sequenceAccess().getStatementsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_sequence__Group_1__1__Impl"


    // $ANTLR start "rule__Statement__Group__0"
    // InternalPascal.g:2988:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:2992:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalPascal.g:2993:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0"


    // $ANTLR start "rule__Statement__Group__0__Impl"
    // InternalPascal.g:3000:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__Group_0__0 )? ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3004:1: ( ( ( rule__Statement__Group_0__0 )? ) )
            // InternalPascal.g:3005:1: ( ( rule__Statement__Group_0__0 )? )
            {
            // InternalPascal.g:3005:1: ( ( rule__Statement__Group_0__0 )? )
            // InternalPascal.g:3006:2: ( rule__Statement__Group_0__0 )?
            {
             before(grammarAccess.getStatementAccess().getGroup_0()); 
            // InternalPascal.g:3007:2: ( rule__Statement__Group_0__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=RULE_SIGNED_INTEGER_NUMBER && LA35_0<=RULE_INTEGER_NUMBER)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalPascal.g:3007:3: rule__Statement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatementAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0__Impl"


    // $ANTLR start "rule__Statement__Group__1"
    // InternalPascal.g:3015:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3019:1: ( rule__Statement__Group__1__Impl )
            // InternalPascal.g:3020:2: rule__Statement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1"


    // $ANTLR start "rule__Statement__Group__1__Impl"
    // InternalPascal.g:3026:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__Alternatives_1 ) ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3030:1: ( ( ( rule__Statement__Alternatives_1 ) ) )
            // InternalPascal.g:3031:1: ( ( rule__Statement__Alternatives_1 ) )
            {
            // InternalPascal.g:3031:1: ( ( rule__Statement__Alternatives_1 ) )
            // InternalPascal.g:3032:2: ( rule__Statement__Alternatives_1 )
            {
             before(grammarAccess.getStatementAccess().getAlternatives_1()); 
            // InternalPascal.g:3033:2: ( rule__Statement__Alternatives_1 )
            // InternalPascal.g:3033:3: rule__Statement__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1__Impl"


    // $ANTLR start "rule__Statement__Group_0__0"
    // InternalPascal.g:3042:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3046:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // InternalPascal.g:3047:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
            {
            pushFollow(FOLLOW_15);
            rule__Statement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__0"


    // $ANTLR start "rule__Statement__Group_0__0__Impl"
    // InternalPascal.g:3054:1: rule__Statement__Group_0__0__Impl : ( ( rule__Statement__LabelAssignment_0_0 ) ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3058:1: ( ( ( rule__Statement__LabelAssignment_0_0 ) ) )
            // InternalPascal.g:3059:1: ( ( rule__Statement__LabelAssignment_0_0 ) )
            {
            // InternalPascal.g:3059:1: ( ( rule__Statement__LabelAssignment_0_0 ) )
            // InternalPascal.g:3060:2: ( rule__Statement__LabelAssignment_0_0 )
            {
             before(grammarAccess.getStatementAccess().getLabelAssignment_0_0()); 
            // InternalPascal.g:3061:2: ( rule__Statement__LabelAssignment_0_0 )
            // InternalPascal.g:3061:3: rule__Statement__LabelAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__LabelAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getLabelAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__0__Impl"


    // $ANTLR start "rule__Statement__Group_0__1"
    // InternalPascal.g:3069:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3073:1: ( rule__Statement__Group_0__1__Impl )
            // InternalPascal.g:3074:2: rule__Statement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__1"


    // $ANTLR start "rule__Statement__Group_0__1__Impl"
    // InternalPascal.g:3080:1: rule__Statement__Group_0__1__Impl : ( ':' ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3084:1: ( ( ':' ) )
            // InternalPascal.g:3085:1: ( ':' )
            {
            // InternalPascal.g:3085:1: ( ':' )
            // InternalPascal.g:3086:2: ':'
            {
             before(grammarAccess.getStatementAccess().getColonKeyword_0_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getColonKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__1__Impl"


    // $ANTLR start "rule__Assignment_statement__Group__0"
    // InternalPascal.g:3096:1: rule__Assignment_statement__Group__0 : rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1 ;
    public final void rule__Assignment_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3100:1: ( rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1 )
            // InternalPascal.g:3101:2: rule__Assignment_statement__Group__0__Impl rule__Assignment_statement__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Assignment_statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment_statement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment_statement__Group__0"


    // $ANTLR start "rule__Assignment_statement__Group__0__Impl"
    // InternalPascal.g:3108:1: rule__Assignment_statement__Group__0__Impl : ( ( rule__Assignment_statement__VariableAssignment_0 ) ) ;
    public final void rule__Assignment_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3112:1: ( ( ( rule__Assignment_statement__VariableAssignment_0 ) ) )
            // InternalPascal.g:3113:1: ( ( rule__Assignment_statement__VariableAssignment_0 ) )
            {
            // InternalPascal.g:3113:1: ( ( rule__Assignment_statement__VariableAssignment_0 ) )
            // InternalPascal.g:3114:2: ( rule__Assignment_statement__VariableAssignment_0 )
            {
             before(grammarAccess.getAssignment_statementAccess().getVariableAssignment_0()); 
            // InternalPascal.g:3115:2: ( rule__Assignment_statement__VariableAssignment_0 )
            // InternalPascal.g:3115:3: rule__Assignment_statement__VariableAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment_statement__VariableAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignment_statementAccess().getVariableAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment_statement__Group__0__Impl"


    // $ANTLR start "rule__Assignment_statement__Group__1"
    // InternalPascal.g:3123:1: rule__Assignment_statement__Group__1 : rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2 ;
    public final void rule__Assignment_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3127:1: ( rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2 )
            // InternalPascal.g:3128:2: rule__Assignment_statement__Group__1__Impl rule__Assignment_statement__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Assignment_statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment_statement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment_statement__Group__1"


    // $ANTLR start "rule__Assignment_statement__Group__1__Impl"
    // InternalPascal.g:3135:1: rule__Assignment_statement__Group__1__Impl : ( ':=' ) ;
    public final void rule__Assignment_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3139:1: ( ( ':=' ) )
            // InternalPascal.g:3140:1: ( ':=' )
            {
            // InternalPascal.g:3140:1: ( ':=' )
            // InternalPascal.g:3141:2: ':='
            {
             before(grammarAccess.getAssignment_statementAccess().getColonEqualsSignKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAssignment_statementAccess().getColonEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment_statement__Group__1__Impl"


    // $ANTLR start "rule__Assignment_statement__Group__2"
    // InternalPascal.g:3150:1: rule__Assignment_statement__Group__2 : rule__Assignment_statement__Group__2__Impl ;
    public final void rule__Assignment_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3154:1: ( rule__Assignment_statement__Group__2__Impl )
            // InternalPascal.g:3155:2: rule__Assignment_statement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment_statement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment_statement__Group__2"


    // $ANTLR start "rule__Assignment_statement__Group__2__Impl"
    // InternalPascal.g:3161:1: rule__Assignment_statement__Group__2__Impl : ( ( rule__Assignment_statement__ExpressionAssignment_2 ) ) ;
    public final void rule__Assignment_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3165:1: ( ( ( rule__Assignment_statement__ExpressionAssignment_2 ) ) )
            // InternalPascal.g:3166:1: ( ( rule__Assignment_statement__ExpressionAssignment_2 ) )
            {
            // InternalPascal.g:3166:1: ( ( rule__Assignment_statement__ExpressionAssignment_2 ) )
            // InternalPascal.g:3167:2: ( rule__Assignment_statement__ExpressionAssignment_2 )
            {
             before(grammarAccess.getAssignment_statementAccess().getExpressionAssignment_2()); 
            // InternalPascal.g:3168:2: ( rule__Assignment_statement__ExpressionAssignment_2 )
            // InternalPascal.g:3168:3: rule__Assignment_statement__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Assignment_statement__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignment_statementAccess().getExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment_statement__Group__2__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalPascal.g:3177:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3181:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalPascal.g:3182:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalPascal.g:3189:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NameAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3193:1: ( ( ( rule__Variable__NameAssignment_0 ) ) )
            // InternalPascal.g:3194:1: ( ( rule__Variable__NameAssignment_0 ) )
            {
            // InternalPascal.g:3194:1: ( ( rule__Variable__NameAssignment_0 ) )
            // InternalPascal.g:3195:2: ( rule__Variable__NameAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_0()); 
            // InternalPascal.g:3196:2: ( rule__Variable__NameAssignment_0 )
            // InternalPascal.g:3196:3: rule__Variable__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalPascal.g:3204:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3208:1: ( rule__Variable__Group__1__Impl )
            // InternalPascal.g:3209:2: rule__Variable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalPascal.g:3215:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__VariableAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3219:1: ( ( ( rule__Variable__VariableAssignment_1 ) ) )
            // InternalPascal.g:3220:1: ( ( rule__Variable__VariableAssignment_1 ) )
            {
            // InternalPascal.g:3220:1: ( ( rule__Variable__VariableAssignment_1 ) )
            // InternalPascal.g:3221:2: ( rule__Variable__VariableAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getVariableAssignment_1()); 
            // InternalPascal.g:3222:2: ( rule__Variable__VariableAssignment_1 )
            // InternalPascal.g:3222:3: rule__Variable__VariableAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__VariableAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getVariableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Var___Group_0__0"
    // InternalPascal.g:3231:1: rule__Var___Group_0__0 : rule__Var___Group_0__0__Impl rule__Var___Group_0__1 ;
    public final void rule__Var___Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3235:1: ( rule__Var___Group_0__0__Impl rule__Var___Group_0__1 )
            // InternalPascal.g:3236:2: rule__Var___Group_0__0__Impl rule__Var___Group_0__1
            {
            pushFollow(FOLLOW_17);
            rule__Var___Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var___Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var___Group_0__0"


    // $ANTLR start "rule__Var___Group_0__0__Impl"
    // InternalPascal.g:3243:1: rule__Var___Group_0__0__Impl : ( '[' ) ;
    public final void rule__Var___Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3247:1: ( ( '[' ) )
            // InternalPascal.g:3248:1: ( '[' )
            {
            // InternalPascal.g:3248:1: ( '[' )
            // InternalPascal.g:3249:2: '['
            {
             before(grammarAccess.getVar_Access().getLeftSquareBracketKeyword_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getVar_Access().getLeftSquareBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var___Group_0__0__Impl"


    // $ANTLR start "rule__Var___Group_0__1"
    // InternalPascal.g:3258:1: rule__Var___Group_0__1 : rule__Var___Group_0__1__Impl rule__Var___Group_0__2 ;
    public final void rule__Var___Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3262:1: ( rule__Var___Group_0__1__Impl rule__Var___Group_0__2 )
            // InternalPascal.g:3263:2: rule__Var___Group_0__1__Impl rule__Var___Group_0__2
            {
            pushFollow(FOLLOW_19);
            rule__Var___Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var___Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var___Group_0__1"


    // $ANTLR start "rule__Var___Group_0__1__Impl"
    // InternalPascal.g:3270:1: rule__Var___Group_0__1__Impl : ( ( rule__Var___ExpressionsAssignment_0_1 ) ) ;
    public final void rule__Var___Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3274:1: ( ( ( rule__Var___ExpressionsAssignment_0_1 ) ) )
            // InternalPascal.g:3275:1: ( ( rule__Var___ExpressionsAssignment_0_1 ) )
            {
            // InternalPascal.g:3275:1: ( ( rule__Var___ExpressionsAssignment_0_1 ) )
            // InternalPascal.g:3276:2: ( rule__Var___ExpressionsAssignment_0_1 )
            {
             before(grammarAccess.getVar_Access().getExpressionsAssignment_0_1()); 
            // InternalPascal.g:3277:2: ( rule__Var___ExpressionsAssignment_0_1 )
            // InternalPascal.g:3277:3: rule__Var___ExpressionsAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Var___ExpressionsAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getVar_Access().getExpressionsAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var___Group_0__1__Impl"


    // $ANTLR start "rule__Var___Group_0__2"
    // InternalPascal.g:3285:1: rule__Var___Group_0__2 : rule__Var___Group_0__2__Impl rule__Var___Group_0__3 ;
    public final void rule__Var___Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3289:1: ( rule__Var___Group_0__2__Impl rule__Var___Group_0__3 )
            // InternalPascal.g:3290:2: rule__Var___Group_0__2__Impl rule__Var___Group_0__3
            {
            pushFollow(FOLLOW_18);
            rule__Var___Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var___Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var___Group_0__2"


    // $ANTLR start "rule__Var___Group_0__2__Impl"
    // InternalPascal.g:3297:1: rule__Var___Group_0__2__Impl : ( ']' ) ;
    public final void rule__Var___Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3301:1: ( ( ']' ) )
            // InternalPascal.g:3302:1: ( ']' )
            {
            // InternalPascal.g:3302:1: ( ']' )
            // InternalPascal.g:3303:2: ']'
            {
             before(grammarAccess.getVar_Access().getRightSquareBracketKeyword_0_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getVar_Access().getRightSquareBracketKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var___Group_0__2__Impl"


    // $ANTLR start "rule__Var___Group_0__3"
    // InternalPascal.g:3312:1: rule__Var___Group_0__3 : rule__Var___Group_0__3__Impl ;
    public final void rule__Var___Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3316:1: ( rule__Var___Group_0__3__Impl )
            // InternalPascal.g:3317:2: rule__Var___Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var___Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var___Group_0__3"


    // $ANTLR start "rule__Var___Group_0__3__Impl"
    // InternalPascal.g:3323:1: rule__Var___Group_0__3__Impl : ( ( rule__Var___ArrayAssignment_0_3 ) ) ;
    public final void rule__Var___Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3327:1: ( ( ( rule__Var___ArrayAssignment_0_3 ) ) )
            // InternalPascal.g:3328:1: ( ( rule__Var___ArrayAssignment_0_3 ) )
            {
            // InternalPascal.g:3328:1: ( ( rule__Var___ArrayAssignment_0_3 ) )
            // InternalPascal.g:3329:2: ( rule__Var___ArrayAssignment_0_3 )
            {
             before(grammarAccess.getVar_Access().getArrayAssignment_0_3()); 
            // InternalPascal.g:3330:2: ( rule__Var___ArrayAssignment_0_3 )
            // InternalPascal.g:3330:3: rule__Var___ArrayAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Var___ArrayAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getVar_Access().getArrayAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var___Group_0__3__Impl"


    // $ANTLR start "rule__Var___Group_1__0"
    // InternalPascal.g:3339:1: rule__Var___Group_1__0 : rule__Var___Group_1__0__Impl rule__Var___Group_1__1 ;
    public final void rule__Var___Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3343:1: ( rule__Var___Group_1__0__Impl rule__Var___Group_1__1 )
            // InternalPascal.g:3344:2: rule__Var___Group_1__0__Impl rule__Var___Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Var___Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var___Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var___Group_1__0"


    // $ANTLR start "rule__Var___Group_1__0__Impl"
    // InternalPascal.g:3351:1: rule__Var___Group_1__0__Impl : ( ( rule__Var___AccessorAssignment_1_0 ) ) ;
    public final void rule__Var___Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3355:1: ( ( ( rule__Var___AccessorAssignment_1_0 ) ) )
            // InternalPascal.g:3356:1: ( ( rule__Var___AccessorAssignment_1_0 ) )
            {
            // InternalPascal.g:3356:1: ( ( rule__Var___AccessorAssignment_1_0 ) )
            // InternalPascal.g:3357:2: ( rule__Var___AccessorAssignment_1_0 )
            {
             before(grammarAccess.getVar_Access().getAccessorAssignment_1_0()); 
            // InternalPascal.g:3358:2: ( rule__Var___AccessorAssignment_1_0 )
            // InternalPascal.g:3358:3: rule__Var___AccessorAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Var___AccessorAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getVar_Access().getAccessorAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var___Group_1__0__Impl"


    // $ANTLR start "rule__Var___Group_1__1"
    // InternalPascal.g:3366:1: rule__Var___Group_1__1 : rule__Var___Group_1__1__Impl rule__Var___Group_1__2 ;
    public final void rule__Var___Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3370:1: ( rule__Var___Group_1__1__Impl rule__Var___Group_1__2 )
            // InternalPascal.g:3371:2: rule__Var___Group_1__1__Impl rule__Var___Group_1__2
            {
            pushFollow(FOLLOW_18);
            rule__Var___Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var___Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var___Group_1__1"


    // $ANTLR start "rule__Var___Group_1__1__Impl"
    // InternalPascal.g:3378:1: rule__Var___Group_1__1__Impl : ( ( rule__Var___NameAssignment_1_1 ) ) ;
    public final void rule__Var___Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3382:1: ( ( ( rule__Var___NameAssignment_1_1 ) ) )
            // InternalPascal.g:3383:1: ( ( rule__Var___NameAssignment_1_1 ) )
            {
            // InternalPascal.g:3383:1: ( ( rule__Var___NameAssignment_1_1 ) )
            // InternalPascal.g:3384:2: ( rule__Var___NameAssignment_1_1 )
            {
             before(grammarAccess.getVar_Access().getNameAssignment_1_1()); 
            // InternalPascal.g:3385:2: ( rule__Var___NameAssignment_1_1 )
            // InternalPascal.g:3385:3: rule__Var___NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Var___NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVar_Access().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var___Group_1__1__Impl"


    // $ANTLR start "rule__Var___Group_1__2"
    // InternalPascal.g:3393:1: rule__Var___Group_1__2 : rule__Var___Group_1__2__Impl ;
    public final void rule__Var___Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3397:1: ( rule__Var___Group_1__2__Impl )
            // InternalPascal.g:3398:2: rule__Var___Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var___Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var___Group_1__2"


    // $ANTLR start "rule__Var___Group_1__2__Impl"
    // InternalPascal.g:3404:1: rule__Var___Group_1__2__Impl : ( ( rule__Var___VariableAssignment_1_2 ) ) ;
    public final void rule__Var___Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3408:1: ( ( ( rule__Var___VariableAssignment_1_2 ) ) )
            // InternalPascal.g:3409:1: ( ( rule__Var___VariableAssignment_1_2 ) )
            {
            // InternalPascal.g:3409:1: ( ( rule__Var___VariableAssignment_1_2 ) )
            // InternalPascal.g:3410:2: ( rule__Var___VariableAssignment_1_2 )
            {
             before(grammarAccess.getVar_Access().getVariableAssignment_1_2()); 
            // InternalPascal.g:3411:2: ( rule__Var___VariableAssignment_1_2 )
            // InternalPascal.g:3411:3: rule__Var___VariableAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Var___VariableAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getVar_Access().getVariableAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var___Group_1__2__Impl"


    // $ANTLR start "rule__Var___Group_2__0"
    // InternalPascal.g:3420:1: rule__Var___Group_2__0 : rule__Var___Group_2__0__Impl rule__Var___Group_2__1 ;
    public final void rule__Var___Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3424:1: ( rule__Var___Group_2__0__Impl rule__Var___Group_2__1 )
            // InternalPascal.g:3425:2: rule__Var___Group_2__0__Impl rule__Var___Group_2__1
            {
            pushFollow(FOLLOW_18);
            rule__Var___Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var___Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var___Group_2__0"


    // $ANTLR start "rule__Var___Group_2__0__Impl"
    // InternalPascal.g:3432:1: rule__Var___Group_2__0__Impl : ( '^' ) ;
    public final void rule__Var___Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3436:1: ( ( '^' ) )
            // InternalPascal.g:3437:1: ( '^' )
            {
            // InternalPascal.g:3437:1: ( '^' )
            // InternalPascal.g:3438:2: '^'
            {
             before(grammarAccess.getVar_Access().getCircumflexAccentKeyword_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getVar_Access().getCircumflexAccentKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var___Group_2__0__Impl"


    // $ANTLR start "rule__Var___Group_2__1"
    // InternalPascal.g:3447:1: rule__Var___Group_2__1 : rule__Var___Group_2__1__Impl ;
    public final void rule__Var___Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3451:1: ( rule__Var___Group_2__1__Impl )
            // InternalPascal.g:3452:2: rule__Var___Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var___Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var___Group_2__1"


    // $ANTLR start "rule__Var___Group_2__1__Impl"
    // InternalPascal.g:3458:1: rule__Var___Group_2__1__Impl : ( ( rule__Var___PointerAssignment_2_1 ) ) ;
    public final void rule__Var___Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3462:1: ( ( ( rule__Var___PointerAssignment_2_1 ) ) )
            // InternalPascal.g:3463:1: ( ( rule__Var___PointerAssignment_2_1 ) )
            {
            // InternalPascal.g:3463:1: ( ( rule__Var___PointerAssignment_2_1 ) )
            // InternalPascal.g:3464:2: ( rule__Var___PointerAssignment_2_1 )
            {
             before(grammarAccess.getVar_Access().getPointerAssignment_2_1()); 
            // InternalPascal.g:3465:2: ( rule__Var___PointerAssignment_2_1 )
            // InternalPascal.g:3465:3: rule__Var___PointerAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Var___PointerAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVar_Access().getPointerAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var___Group_2__1__Impl"


    // $ANTLR start "rule__Expression_list__Group__0"
    // InternalPascal.g:3474:1: rule__Expression_list__Group__0 : rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1 ;
    public final void rule__Expression_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3478:1: ( rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1 )
            // InternalPascal.g:3479:2: rule__Expression_list__Group__0__Impl rule__Expression_list__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Expression_list__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_list__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_list__Group__0"


    // $ANTLR start "rule__Expression_list__Group__0__Impl"
    // InternalPascal.g:3486:1: rule__Expression_list__Group__0__Impl : ( ( rule__Expression_list__ExpressionsAssignment_0 ) ) ;
    public final void rule__Expression_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3490:1: ( ( ( rule__Expression_list__ExpressionsAssignment_0 ) ) )
            // InternalPascal.g:3491:1: ( ( rule__Expression_list__ExpressionsAssignment_0 ) )
            {
            // InternalPascal.g:3491:1: ( ( rule__Expression_list__ExpressionsAssignment_0 ) )
            // InternalPascal.g:3492:2: ( rule__Expression_list__ExpressionsAssignment_0 )
            {
             before(grammarAccess.getExpression_listAccess().getExpressionsAssignment_0()); 
            // InternalPascal.g:3493:2: ( rule__Expression_list__ExpressionsAssignment_0 )
            // InternalPascal.g:3493:3: rule__Expression_list__ExpressionsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression_list__ExpressionsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpression_listAccess().getExpressionsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_list__Group__0__Impl"


    // $ANTLR start "rule__Expression_list__Group__1"
    // InternalPascal.g:3501:1: rule__Expression_list__Group__1 : rule__Expression_list__Group__1__Impl ;
    public final void rule__Expression_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3505:1: ( rule__Expression_list__Group__1__Impl )
            // InternalPascal.g:3506:2: rule__Expression_list__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_list__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_list__Group__1"


    // $ANTLR start "rule__Expression_list__Group__1__Impl"
    // InternalPascal.g:3512:1: rule__Expression_list__Group__1__Impl : ( ( rule__Expression_list__Group_1__0 )* ) ;
    public final void rule__Expression_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3516:1: ( ( ( rule__Expression_list__Group_1__0 )* ) )
            // InternalPascal.g:3517:1: ( ( rule__Expression_list__Group_1__0 )* )
            {
            // InternalPascal.g:3517:1: ( ( rule__Expression_list__Group_1__0 )* )
            // InternalPascal.g:3518:2: ( rule__Expression_list__Group_1__0 )*
            {
             before(grammarAccess.getExpression_listAccess().getGroup_1()); 
            // InternalPascal.g:3519:2: ( rule__Expression_list__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==27) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalPascal.g:3519:3: rule__Expression_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Expression_list__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getExpression_listAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_list__Group__1__Impl"


    // $ANTLR start "rule__Expression_list__Group_1__0"
    // InternalPascal.g:3528:1: rule__Expression_list__Group_1__0 : rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1 ;
    public final void rule__Expression_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3532:1: ( rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1 )
            // InternalPascal.g:3533:2: rule__Expression_list__Group_1__0__Impl rule__Expression_list__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Expression_list__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_list__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_list__Group_1__0"


    // $ANTLR start "rule__Expression_list__Group_1__0__Impl"
    // InternalPascal.g:3540:1: rule__Expression_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Expression_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3544:1: ( ( ',' ) )
            // InternalPascal.g:3545:1: ( ',' )
            {
            // InternalPascal.g:3545:1: ( ',' )
            // InternalPascal.g:3546:2: ','
            {
             before(grammarAccess.getExpression_listAccess().getCommaKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getExpression_listAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_list__Group_1__0__Impl"


    // $ANTLR start "rule__Expression_list__Group_1__1"
    // InternalPascal.g:3555:1: rule__Expression_list__Group_1__1 : rule__Expression_list__Group_1__1__Impl ;
    public final void rule__Expression_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3559:1: ( rule__Expression_list__Group_1__1__Impl )
            // InternalPascal.g:3560:2: rule__Expression_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_list__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_list__Group_1__1"


    // $ANTLR start "rule__Expression_list__Group_1__1__Impl"
    // InternalPascal.g:3566:1: rule__Expression_list__Group_1__1__Impl : ( ( rule__Expression_list__ExpressionsAssignment_1_1 ) ) ;
    public final void rule__Expression_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3570:1: ( ( ( rule__Expression_list__ExpressionsAssignment_1_1 ) ) )
            // InternalPascal.g:3571:1: ( ( rule__Expression_list__ExpressionsAssignment_1_1 ) )
            {
            // InternalPascal.g:3571:1: ( ( rule__Expression_list__ExpressionsAssignment_1_1 ) )
            // InternalPascal.g:3572:2: ( rule__Expression_list__ExpressionsAssignment_1_1 )
            {
             before(grammarAccess.getExpression_listAccess().getExpressionsAssignment_1_1()); 
            // InternalPascal.g:3573:2: ( rule__Expression_list__ExpressionsAssignment_1_1 )
            // InternalPascal.g:3573:3: rule__Expression_list__ExpressionsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression_list__ExpressionsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpression_listAccess().getExpressionsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_list__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // InternalPascal.g:3582:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3586:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalPascal.g:3587:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalPascal.g:3594:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__ExpressionsAssignment_0 ) ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3598:1: ( ( ( rule__Expression__ExpressionsAssignment_0 ) ) )
            // InternalPascal.g:3599:1: ( ( rule__Expression__ExpressionsAssignment_0 ) )
            {
            // InternalPascal.g:3599:1: ( ( rule__Expression__ExpressionsAssignment_0 ) )
            // InternalPascal.g:3600:2: ( rule__Expression__ExpressionsAssignment_0 )
            {
             before(grammarAccess.getExpressionAccess().getExpressionsAssignment_0()); 
            // InternalPascal.g:3601:2: ( rule__Expression__ExpressionsAssignment_0 )
            // InternalPascal.g:3601:3: rule__Expression__ExpressionsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__ExpressionsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getExpressionsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalPascal.g:3609:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3613:1: ( rule__Expression__Group__1__Impl )
            // InternalPascal.g:3614:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalPascal.g:3620:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__Group_1__0 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3624:1: ( ( ( rule__Expression__Group_1__0 )? ) )
            // InternalPascal.g:3625:1: ( ( rule__Expression__Group_1__0 )? )
            {
            // InternalPascal.g:3625:1: ( ( rule__Expression__Group_1__0 )? )
            // InternalPascal.g:3626:2: ( rule__Expression__Group_1__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_1()); 
            // InternalPascal.g:3627:2: ( rule__Expression__Group_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_RELATIONAL_OPERATOR||LA37_0==42||LA37_0==52) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalPascal.g:3627:3: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalPascal.g:3636:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3640:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalPascal.g:3641:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // InternalPascal.g:3648:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__Alternatives_1_0 ) ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3652:1: ( ( ( rule__Expression__Alternatives_1_0 ) ) )
            // InternalPascal.g:3653:1: ( ( rule__Expression__Alternatives_1_0 ) )
            {
            // InternalPascal.g:3653:1: ( ( rule__Expression__Alternatives_1_0 ) )
            // InternalPascal.g:3654:2: ( rule__Expression__Alternatives_1_0 )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives_1_0()); 
            // InternalPascal.g:3655:2: ( rule__Expression__Alternatives_1_0 )
            // InternalPascal.g:3655:3: rule__Expression__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalPascal.g:3663:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3667:1: ( rule__Expression__Group_1__1__Impl )
            // InternalPascal.g:3668:2: rule__Expression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // InternalPascal.g:3674:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__ExpressionsAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3678:1: ( ( ( rule__Expression__ExpressionsAssignment_1_1 ) ) )
            // InternalPascal.g:3679:1: ( ( rule__Expression__ExpressionsAssignment_1_1 ) )
            {
            // InternalPascal.g:3679:1: ( ( rule__Expression__ExpressionsAssignment_1_1 ) )
            // InternalPascal.g:3680:2: ( rule__Expression__ExpressionsAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getExpressionsAssignment_1_1()); 
            // InternalPascal.g:3681:2: ( rule__Expression__ExpressionsAssignment_1_1 )
            // InternalPascal.g:3681:3: rule__Expression__ExpressionsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__ExpressionsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getExpressionsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__Simple_expression__Group__0"
    // InternalPascal.g:3690:1: rule__Simple_expression__Group__0 : rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1 ;
    public final void rule__Simple_expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3694:1: ( rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1 )
            // InternalPascal.g:3695:2: rule__Simple_expression__Group__0__Impl rule__Simple_expression__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Simple_expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simple_expression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__Group__0"


    // $ANTLR start "rule__Simple_expression__Group__0__Impl"
    // InternalPascal.g:3702:1: rule__Simple_expression__Group__0__Impl : ( ( rule__Simple_expression__PrefixOperatorAssignment_0 )? ) ;
    public final void rule__Simple_expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3706:1: ( ( ( rule__Simple_expression__PrefixOperatorAssignment_0 )? ) )
            // InternalPascal.g:3707:1: ( ( rule__Simple_expression__PrefixOperatorAssignment_0 )? )
            {
            // InternalPascal.g:3707:1: ( ( rule__Simple_expression__PrefixOperatorAssignment_0 )? )
            // InternalPascal.g:3708:2: ( rule__Simple_expression__PrefixOperatorAssignment_0 )?
            {
             before(grammarAccess.getSimple_expressionAccess().getPrefixOperatorAssignment_0()); 
            // InternalPascal.g:3709:2: ( rule__Simple_expression__PrefixOperatorAssignment_0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ADDITION_OPERATOR) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalPascal.g:3709:3: rule__Simple_expression__PrefixOperatorAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simple_expression__PrefixOperatorAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimple_expressionAccess().getPrefixOperatorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__Group__0__Impl"


    // $ANTLR start "rule__Simple_expression__Group__1"
    // InternalPascal.g:3717:1: rule__Simple_expression__Group__1 : rule__Simple_expression__Group__1__Impl rule__Simple_expression__Group__2 ;
    public final void rule__Simple_expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3721:1: ( rule__Simple_expression__Group__1__Impl rule__Simple_expression__Group__2 )
            // InternalPascal.g:3722:2: rule__Simple_expression__Group__1__Impl rule__Simple_expression__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Simple_expression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simple_expression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__Group__1"


    // $ANTLR start "rule__Simple_expression__Group__1__Impl"
    // InternalPascal.g:3729:1: rule__Simple_expression__Group__1__Impl : ( ( rule__Simple_expression__TermsAssignment_1 ) ) ;
    public final void rule__Simple_expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3733:1: ( ( ( rule__Simple_expression__TermsAssignment_1 ) ) )
            // InternalPascal.g:3734:1: ( ( rule__Simple_expression__TermsAssignment_1 ) )
            {
            // InternalPascal.g:3734:1: ( ( rule__Simple_expression__TermsAssignment_1 ) )
            // InternalPascal.g:3735:2: ( rule__Simple_expression__TermsAssignment_1 )
            {
             before(grammarAccess.getSimple_expressionAccess().getTermsAssignment_1()); 
            // InternalPascal.g:3736:2: ( rule__Simple_expression__TermsAssignment_1 )
            // InternalPascal.g:3736:3: rule__Simple_expression__TermsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Simple_expression__TermsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSimple_expressionAccess().getTermsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__Group__1__Impl"


    // $ANTLR start "rule__Simple_expression__Group__2"
    // InternalPascal.g:3744:1: rule__Simple_expression__Group__2 : rule__Simple_expression__Group__2__Impl ;
    public final void rule__Simple_expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3748:1: ( rule__Simple_expression__Group__2__Impl )
            // InternalPascal.g:3749:2: rule__Simple_expression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Simple_expression__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__Group__2"


    // $ANTLR start "rule__Simple_expression__Group__2__Impl"
    // InternalPascal.g:3755:1: rule__Simple_expression__Group__2__Impl : ( ( rule__Simple_expression__Alternatives_2 )* ) ;
    public final void rule__Simple_expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3759:1: ( ( ( rule__Simple_expression__Alternatives_2 )* ) )
            // InternalPascal.g:3760:1: ( ( rule__Simple_expression__Alternatives_2 )* )
            {
            // InternalPascal.g:3760:1: ( ( rule__Simple_expression__Alternatives_2 )* )
            // InternalPascal.g:3761:2: ( rule__Simple_expression__Alternatives_2 )*
            {
             before(grammarAccess.getSimple_expressionAccess().getAlternatives_2()); 
            // InternalPascal.g:3762:2: ( rule__Simple_expression__Alternatives_2 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_INTEGER_NUMBER||LA39_0==RULE_ADDITION_OPERATOR||LA39_0==53) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalPascal.g:3762:3: rule__Simple_expression__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Simple_expression__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getSimple_expressionAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__Group__2__Impl"


    // $ANTLR start "rule__Simple_expression__Group_2_0__0"
    // InternalPascal.g:3771:1: rule__Simple_expression__Group_2_0__0 : rule__Simple_expression__Group_2_0__0__Impl rule__Simple_expression__Group_2_0__1 ;
    public final void rule__Simple_expression__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3775:1: ( rule__Simple_expression__Group_2_0__0__Impl rule__Simple_expression__Group_2_0__1 )
            // InternalPascal.g:3776:2: rule__Simple_expression__Group_2_0__0__Impl rule__Simple_expression__Group_2_0__1
            {
            pushFollow(FOLLOW_17);
            rule__Simple_expression__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simple_expression__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__Group_2_0__0"


    // $ANTLR start "rule__Simple_expression__Group_2_0__0__Impl"
    // InternalPascal.g:3783:1: rule__Simple_expression__Group_2_0__0__Impl : ( ( rule__Simple_expression__Alternatives_2_0_0 ) ) ;
    public final void rule__Simple_expression__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3787:1: ( ( ( rule__Simple_expression__Alternatives_2_0_0 ) ) )
            // InternalPascal.g:3788:1: ( ( rule__Simple_expression__Alternatives_2_0_0 ) )
            {
            // InternalPascal.g:3788:1: ( ( rule__Simple_expression__Alternatives_2_0_0 ) )
            // InternalPascal.g:3789:2: ( rule__Simple_expression__Alternatives_2_0_0 )
            {
             before(grammarAccess.getSimple_expressionAccess().getAlternatives_2_0_0()); 
            // InternalPascal.g:3790:2: ( rule__Simple_expression__Alternatives_2_0_0 )
            // InternalPascal.g:3790:3: rule__Simple_expression__Alternatives_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Simple_expression__Alternatives_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSimple_expressionAccess().getAlternatives_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__Group_2_0__0__Impl"


    // $ANTLR start "rule__Simple_expression__Group_2_0__1"
    // InternalPascal.g:3798:1: rule__Simple_expression__Group_2_0__1 : rule__Simple_expression__Group_2_0__1__Impl ;
    public final void rule__Simple_expression__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3802:1: ( rule__Simple_expression__Group_2_0__1__Impl )
            // InternalPascal.g:3803:2: rule__Simple_expression__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Simple_expression__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__Group_2_0__1"


    // $ANTLR start "rule__Simple_expression__Group_2_0__1__Impl"
    // InternalPascal.g:3809:1: rule__Simple_expression__Group_2_0__1__Impl : ( ( rule__Simple_expression__TermsAssignment_2_0_1 ) ) ;
    public final void rule__Simple_expression__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3813:1: ( ( ( rule__Simple_expression__TermsAssignment_2_0_1 ) ) )
            // InternalPascal.g:3814:1: ( ( rule__Simple_expression__TermsAssignment_2_0_1 ) )
            {
            // InternalPascal.g:3814:1: ( ( rule__Simple_expression__TermsAssignment_2_0_1 ) )
            // InternalPascal.g:3815:2: ( rule__Simple_expression__TermsAssignment_2_0_1 )
            {
             before(grammarAccess.getSimple_expressionAccess().getTermsAssignment_2_0_1()); 
            // InternalPascal.g:3816:2: ( rule__Simple_expression__TermsAssignment_2_0_1 )
            // InternalPascal.g:3816:3: rule__Simple_expression__TermsAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Simple_expression__TermsAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSimple_expressionAccess().getTermsAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__Group_2_0__1__Impl"


    // $ANTLR start "rule__Term__Group__0"
    // InternalPascal.g:3825:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3829:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // InternalPascal.g:3830:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Term__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__0"


    // $ANTLR start "rule__Term__Group__0__Impl"
    // InternalPascal.g:3837:1: rule__Term__Group__0__Impl : ( ( rule__Term__FactorsAssignment_0 ) ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3841:1: ( ( ( rule__Term__FactorsAssignment_0 ) ) )
            // InternalPascal.g:3842:1: ( ( rule__Term__FactorsAssignment_0 ) )
            {
            // InternalPascal.g:3842:1: ( ( rule__Term__FactorsAssignment_0 ) )
            // InternalPascal.g:3843:2: ( rule__Term__FactorsAssignment_0 )
            {
             before(grammarAccess.getTermAccess().getFactorsAssignment_0()); 
            // InternalPascal.g:3844:2: ( rule__Term__FactorsAssignment_0 )
            // InternalPascal.g:3844:3: rule__Term__FactorsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Term__FactorsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getFactorsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__0__Impl"


    // $ANTLR start "rule__Term__Group__1"
    // InternalPascal.g:3852:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3856:1: ( rule__Term__Group__1__Impl )
            // InternalPascal.g:3857:2: rule__Term__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__1"


    // $ANTLR start "rule__Term__Group__1__Impl"
    // InternalPascal.g:3863:1: rule__Term__Group__1__Impl : ( ( rule__Term__Group_1__0 )* ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3867:1: ( ( ( rule__Term__Group_1__0 )* ) )
            // InternalPascal.g:3868:1: ( ( rule__Term__Group_1__0 )* )
            {
            // InternalPascal.g:3868:1: ( ( rule__Term__Group_1__0 )* )
            // InternalPascal.g:3869:2: ( rule__Term__Group_1__0 )*
            {
             before(grammarAccess.getTermAccess().getGroup_1()); 
            // InternalPascal.g:3870:2: ( rule__Term__Group_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_MULTIPLICATION_OPERATOR||(LA40_0>=54 && LA40_0<=56)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalPascal.g:3870:3: rule__Term__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Term__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getTermAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__1__Impl"


    // $ANTLR start "rule__Term__Group_1__0"
    // InternalPascal.g:3879:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3883:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // InternalPascal.g:3884:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Term__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__0"


    // $ANTLR start "rule__Term__Group_1__0__Impl"
    // InternalPascal.g:3891:1: rule__Term__Group_1__0__Impl : ( ( rule__Term__Alternatives_1_0 ) ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3895:1: ( ( ( rule__Term__Alternatives_1_0 ) ) )
            // InternalPascal.g:3896:1: ( ( rule__Term__Alternatives_1_0 ) )
            {
            // InternalPascal.g:3896:1: ( ( rule__Term__Alternatives_1_0 ) )
            // InternalPascal.g:3897:2: ( rule__Term__Alternatives_1_0 )
            {
             before(grammarAccess.getTermAccess().getAlternatives_1_0()); 
            // InternalPascal.g:3898:2: ( rule__Term__Alternatives_1_0 )
            // InternalPascal.g:3898:3: rule__Term__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Term__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__0__Impl"


    // $ANTLR start "rule__Term__Group_1__1"
    // InternalPascal.g:3906:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3910:1: ( rule__Term__Group_1__1__Impl )
            // InternalPascal.g:3911:2: rule__Term__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__1"


    // $ANTLR start "rule__Term__Group_1__1__Impl"
    // InternalPascal.g:3917:1: rule__Term__Group_1__1__Impl : ( ( rule__Term__FactorsAssignment_1_1 ) ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3921:1: ( ( ( rule__Term__FactorsAssignment_1_1 ) ) )
            // InternalPascal.g:3922:1: ( ( rule__Term__FactorsAssignment_1_1 ) )
            {
            // InternalPascal.g:3922:1: ( ( rule__Term__FactorsAssignment_1_1 ) )
            // InternalPascal.g:3923:2: ( rule__Term__FactorsAssignment_1_1 )
            {
             before(grammarAccess.getTermAccess().getFactorsAssignment_1_1()); 
            // InternalPascal.g:3924:2: ( rule__Term__FactorsAssignment_1_1 )
            // InternalPascal.g:3924:3: rule__Term__FactorsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Term__FactorsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getFactorsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__1__Impl"


    // $ANTLR start "rule__Factor__Group_8__0"
    // InternalPascal.g:3933:1: rule__Factor__Group_8__0 : rule__Factor__Group_8__0__Impl rule__Factor__Group_8__1 ;
    public final void rule__Factor__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3937:1: ( rule__Factor__Group_8__0__Impl rule__Factor__Group_8__1 )
            // InternalPascal.g:3938:2: rule__Factor__Group_8__0__Impl rule__Factor__Group_8__1
            {
            pushFollow(FOLLOW_17);
            rule__Factor__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_8__0"


    // $ANTLR start "rule__Factor__Group_8__0__Impl"
    // InternalPascal.g:3945:1: rule__Factor__Group_8__0__Impl : ( '(' ) ;
    public final void rule__Factor__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3949:1: ( ( '(' ) )
            // InternalPascal.g:3950:1: ( '(' )
            {
            // InternalPascal.g:3950:1: ( '(' )
            // InternalPascal.g:3951:2: '('
            {
             before(grammarAccess.getFactorAccess().getLeftParenthesisKeyword_8_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getLeftParenthesisKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_8__0__Impl"


    // $ANTLR start "rule__Factor__Group_8__1"
    // InternalPascal.g:3960:1: rule__Factor__Group_8__1 : rule__Factor__Group_8__1__Impl rule__Factor__Group_8__2 ;
    public final void rule__Factor__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3964:1: ( rule__Factor__Group_8__1__Impl rule__Factor__Group_8__2 )
            // InternalPascal.g:3965:2: rule__Factor__Group_8__1__Impl rule__Factor__Group_8__2
            {
            pushFollow(FOLLOW_8);
            rule__Factor__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_8__1"


    // $ANTLR start "rule__Factor__Group_8__1__Impl"
    // InternalPascal.g:3972:1: rule__Factor__Group_8__1__Impl : ( ( rule__Factor__ExpressionAssignment_8_1 ) ) ;
    public final void rule__Factor__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3976:1: ( ( ( rule__Factor__ExpressionAssignment_8_1 ) ) )
            // InternalPascal.g:3977:1: ( ( rule__Factor__ExpressionAssignment_8_1 ) )
            {
            // InternalPascal.g:3977:1: ( ( rule__Factor__ExpressionAssignment_8_1 ) )
            // InternalPascal.g:3978:2: ( rule__Factor__ExpressionAssignment_8_1 )
            {
             before(grammarAccess.getFactorAccess().getExpressionAssignment_8_1()); 
            // InternalPascal.g:3979:2: ( rule__Factor__ExpressionAssignment_8_1 )
            // InternalPascal.g:3979:3: rule__Factor__ExpressionAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Factor__ExpressionAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getExpressionAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_8__1__Impl"


    // $ANTLR start "rule__Factor__Group_8__2"
    // InternalPascal.g:3987:1: rule__Factor__Group_8__2 : rule__Factor__Group_8__2__Impl ;
    public final void rule__Factor__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:3991:1: ( rule__Factor__Group_8__2__Impl )
            // InternalPascal.g:3992:2: rule__Factor__Group_8__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_8__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_8__2"


    // $ANTLR start "rule__Factor__Group_8__2__Impl"
    // InternalPascal.g:3998:1: rule__Factor__Group_8__2__Impl : ( ')' ) ;
    public final void rule__Factor__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4002:1: ( ( ')' ) )
            // InternalPascal.g:4003:1: ( ')' )
            {
            // InternalPascal.g:4003:1: ( ')' )
            // InternalPascal.g:4004:2: ')'
            {
             before(grammarAccess.getFactorAccess().getRightParenthesisKeyword_8_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getRightParenthesisKeyword_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_8__2__Impl"


    // $ANTLR start "rule__Factor__Group_9__0"
    // InternalPascal.g:4014:1: rule__Factor__Group_9__0 : rule__Factor__Group_9__0__Impl rule__Factor__Group_9__1 ;
    public final void rule__Factor__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4018:1: ( rule__Factor__Group_9__0__Impl rule__Factor__Group_9__1 )
            // InternalPascal.g:4019:2: rule__Factor__Group_9__0__Impl rule__Factor__Group_9__1
            {
            pushFollow(FOLLOW_17);
            rule__Factor__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_9__0"


    // $ANTLR start "rule__Factor__Group_9__0__Impl"
    // InternalPascal.g:4026:1: rule__Factor__Group_9__0__Impl : ( 'not' ) ;
    public final void rule__Factor__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4030:1: ( ( 'not' ) )
            // InternalPascal.g:4031:1: ( 'not' )
            {
            // InternalPascal.g:4031:1: ( 'not' )
            // InternalPascal.g:4032:2: 'not'
            {
             before(grammarAccess.getFactorAccess().getNotKeyword_9_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getNotKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_9__0__Impl"


    // $ANTLR start "rule__Factor__Group_9__1"
    // InternalPascal.g:4041:1: rule__Factor__Group_9__1 : rule__Factor__Group_9__1__Impl ;
    public final void rule__Factor__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4045:1: ( rule__Factor__Group_9__1__Impl )
            // InternalPascal.g:4046:2: rule__Factor__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_9__1"


    // $ANTLR start "rule__Factor__Group_9__1__Impl"
    // InternalPascal.g:4052:1: rule__Factor__Group_9__1__Impl : ( ( rule__Factor__NotAssignment_9_1 ) ) ;
    public final void rule__Factor__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4056:1: ( ( ( rule__Factor__NotAssignment_9_1 ) ) )
            // InternalPascal.g:4057:1: ( ( rule__Factor__NotAssignment_9_1 ) )
            {
            // InternalPascal.g:4057:1: ( ( rule__Factor__NotAssignment_9_1 ) )
            // InternalPascal.g:4058:2: ( rule__Factor__NotAssignment_9_1 )
            {
             before(grammarAccess.getFactorAccess().getNotAssignment_9_1()); 
            // InternalPascal.g:4059:2: ( rule__Factor__NotAssignment_9_1 )
            // InternalPascal.g:4059:3: rule__Factor__NotAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Factor__NotAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getNotAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_9__1__Impl"


    // $ANTLR start "rule__Set__Group__0"
    // InternalPascal.g:4068:1: rule__Set__Group__0 : rule__Set__Group__0__Impl rule__Set__Group__1 ;
    public final void rule__Set__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4072:1: ( rule__Set__Group__0__Impl rule__Set__Group__1 )
            // InternalPascal.g:4073:2: rule__Set__Group__0__Impl rule__Set__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Set__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__0"


    // $ANTLR start "rule__Set__Group__0__Impl"
    // InternalPascal.g:4080:1: rule__Set__Group__0__Impl : ( ( rule__Set__BracketsAssignment_0 ) ) ;
    public final void rule__Set__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4084:1: ( ( ( rule__Set__BracketsAssignment_0 ) ) )
            // InternalPascal.g:4085:1: ( ( rule__Set__BracketsAssignment_0 ) )
            {
            // InternalPascal.g:4085:1: ( ( rule__Set__BracketsAssignment_0 ) )
            // InternalPascal.g:4086:2: ( rule__Set__BracketsAssignment_0 )
            {
             before(grammarAccess.getSetAccess().getBracketsAssignment_0()); 
            // InternalPascal.g:4087:2: ( rule__Set__BracketsAssignment_0 )
            // InternalPascal.g:4087:3: rule__Set__BracketsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Set__BracketsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSetAccess().getBracketsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__0__Impl"


    // $ANTLR start "rule__Set__Group__1"
    // InternalPascal.g:4095:1: rule__Set__Group__1 : rule__Set__Group__1__Impl rule__Set__Group__2 ;
    public final void rule__Set__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4099:1: ( rule__Set__Group__1__Impl rule__Set__Group__2 )
            // InternalPascal.g:4100:2: rule__Set__Group__1__Impl rule__Set__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Set__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__1"


    // $ANTLR start "rule__Set__Group__1__Impl"
    // InternalPascal.g:4107:1: rule__Set__Group__1__Impl : ( ( rule__Set__ExpressionsAssignment_1 )? ) ;
    public final void rule__Set__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4111:1: ( ( ( rule__Set__ExpressionsAssignment_1 )? ) )
            // InternalPascal.g:4112:1: ( ( rule__Set__ExpressionsAssignment_1 )? )
            {
            // InternalPascal.g:4112:1: ( ( rule__Set__ExpressionsAssignment_1 )? )
            // InternalPascal.g:4113:2: ( rule__Set__ExpressionsAssignment_1 )?
            {
             before(grammarAccess.getSetAccess().getExpressionsAssignment_1()); 
            // InternalPascal.g:4114:2: ( rule__Set__ExpressionsAssignment_1 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_ID && LA41_0<=RULE_INTEGER_NUMBER)||LA41_0==RULE_ADDITION_OPERATOR||LA41_0==RULE_STRING||LA41_0==25||LA41_0==32||LA41_0==35||(LA41_0>=57 && LA41_0<=59)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalPascal.g:4114:3: rule__Set__ExpressionsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Set__ExpressionsAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSetAccess().getExpressionsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__1__Impl"


    // $ANTLR start "rule__Set__Group__2"
    // InternalPascal.g:4122:1: rule__Set__Group__2 : rule__Set__Group__2__Impl ;
    public final void rule__Set__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4126:1: ( rule__Set__Group__2__Impl )
            // InternalPascal.g:4127:2: rule__Set__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Set__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__2"


    // $ANTLR start "rule__Set__Group__2__Impl"
    // InternalPascal.g:4133:1: rule__Set__Group__2__Impl : ( ( rule__Set__BracketsAssignment_2 ) ) ;
    public final void rule__Set__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4137:1: ( ( ( rule__Set__BracketsAssignment_2 ) ) )
            // InternalPascal.g:4138:1: ( ( rule__Set__BracketsAssignment_2 ) )
            {
            // InternalPascal.g:4138:1: ( ( rule__Set__BracketsAssignment_2 ) )
            // InternalPascal.g:4139:2: ( rule__Set__BracketsAssignment_2 )
            {
             before(grammarAccess.getSetAccess().getBracketsAssignment_2()); 
            // InternalPascal.g:4140:2: ( rule__Set__BracketsAssignment_2 )
            // InternalPascal.g:4140:3: rule__Set__BracketsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Set__BracketsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSetAccess().getBracketsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__2__Impl"


    // $ANTLR start "rule__Function_designator__Group__0"
    // InternalPascal.g:4149:1: rule__Function_designator__Group__0 : rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1 ;
    public final void rule__Function_designator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4153:1: ( rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1 )
            // InternalPascal.g:4154:2: rule__Function_designator__Group__0__Impl rule__Function_designator__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Function_designator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function_designator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_designator__Group__0"


    // $ANTLR start "rule__Function_designator__Group__0__Impl"
    // InternalPascal.g:4161:1: rule__Function_designator__Group__0__Impl : ( ( rule__Function_designator__NameAssignment_0 ) ) ;
    public final void rule__Function_designator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4165:1: ( ( ( rule__Function_designator__NameAssignment_0 ) ) )
            // InternalPascal.g:4166:1: ( ( rule__Function_designator__NameAssignment_0 ) )
            {
            // InternalPascal.g:4166:1: ( ( rule__Function_designator__NameAssignment_0 ) )
            // InternalPascal.g:4167:2: ( rule__Function_designator__NameAssignment_0 )
            {
             before(grammarAccess.getFunction_designatorAccess().getNameAssignment_0()); 
            // InternalPascal.g:4168:2: ( rule__Function_designator__NameAssignment_0 )
            // InternalPascal.g:4168:3: rule__Function_designator__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Function_designator__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunction_designatorAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_designator__Group__0__Impl"


    // $ANTLR start "rule__Function_designator__Group__1"
    // InternalPascal.g:4176:1: rule__Function_designator__Group__1 : rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2 ;
    public final void rule__Function_designator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4180:1: ( rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2 )
            // InternalPascal.g:4181:2: rule__Function_designator__Group__1__Impl rule__Function_designator__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Function_designator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function_designator__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_designator__Group__1"


    // $ANTLR start "rule__Function_designator__Group__1__Impl"
    // InternalPascal.g:4188:1: rule__Function_designator__Group__1__Impl : ( '(' ) ;
    public final void rule__Function_designator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4192:1: ( ( '(' ) )
            // InternalPascal.g:4193:1: ( '(' )
            {
            // InternalPascal.g:4193:1: ( '(' )
            // InternalPascal.g:4194:2: '('
            {
             before(grammarAccess.getFunction_designatorAccess().getLeftParenthesisKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFunction_designatorAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_designator__Group__1__Impl"


    // $ANTLR start "rule__Function_designator__Group__2"
    // InternalPascal.g:4203:1: rule__Function_designator__Group__2 : rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3 ;
    public final void rule__Function_designator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4207:1: ( rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3 )
            // InternalPascal.g:4208:2: rule__Function_designator__Group__2__Impl rule__Function_designator__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Function_designator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function_designator__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_designator__Group__2"


    // $ANTLR start "rule__Function_designator__Group__2__Impl"
    // InternalPascal.g:4215:1: rule__Function_designator__Group__2__Impl : ( ( rule__Function_designator__ExpressionsAssignment_2 )? ) ;
    public final void rule__Function_designator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4219:1: ( ( ( rule__Function_designator__ExpressionsAssignment_2 )? ) )
            // InternalPascal.g:4220:1: ( ( rule__Function_designator__ExpressionsAssignment_2 )? )
            {
            // InternalPascal.g:4220:1: ( ( rule__Function_designator__ExpressionsAssignment_2 )? )
            // InternalPascal.g:4221:2: ( rule__Function_designator__ExpressionsAssignment_2 )?
            {
             before(grammarAccess.getFunction_designatorAccess().getExpressionsAssignment_2()); 
            // InternalPascal.g:4222:2: ( rule__Function_designator__ExpressionsAssignment_2 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_INTEGER_NUMBER)||LA42_0==RULE_ADDITION_OPERATOR||LA42_0==RULE_STRING||LA42_0==25||LA42_0==32||LA42_0==35||(LA42_0>=57 && LA42_0<=59)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalPascal.g:4222:3: rule__Function_designator__ExpressionsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function_designator__ExpressionsAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunction_designatorAccess().getExpressionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_designator__Group__2__Impl"


    // $ANTLR start "rule__Function_designator__Group__3"
    // InternalPascal.g:4230:1: rule__Function_designator__Group__3 : rule__Function_designator__Group__3__Impl ;
    public final void rule__Function_designator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4234:1: ( rule__Function_designator__Group__3__Impl )
            // InternalPascal.g:4235:2: rule__Function_designator__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function_designator__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_designator__Group__3"


    // $ANTLR start "rule__Function_designator__Group__3__Impl"
    // InternalPascal.g:4241:1: rule__Function_designator__Group__3__Impl : ( ')' ) ;
    public final void rule__Function_designator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4245:1: ( ( ')' ) )
            // InternalPascal.g:4246:1: ( ')' )
            {
            // InternalPascal.g:4246:1: ( ')' )
            // InternalPascal.g:4247:2: ')'
            {
             before(grammarAccess.getFunction_designatorAccess().getRightParenthesisKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFunction_designatorAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_designator__Group__3__Impl"


    // $ANTLR start "rule__Compound_statement__Group__0"
    // InternalPascal.g:4257:1: rule__Compound_statement__Group__0 : rule__Compound_statement__Group__0__Impl rule__Compound_statement__Group__1 ;
    public final void rule__Compound_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4261:1: ( rule__Compound_statement__Group__0__Impl rule__Compound_statement__Group__1 )
            // InternalPascal.g:4262:2: rule__Compound_statement__Group__0__Impl rule__Compound_statement__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Compound_statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compound_statement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compound_statement__Group__0"


    // $ANTLR start "rule__Compound_statement__Group__0__Impl"
    // InternalPascal.g:4269:1: rule__Compound_statement__Group__0__Impl : ( 'begin' ) ;
    public final void rule__Compound_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4273:1: ( ( 'begin' ) )
            // InternalPascal.g:4274:1: ( 'begin' )
            {
            // InternalPascal.g:4274:1: ( 'begin' )
            // InternalPascal.g:4275:2: 'begin'
            {
             before(grammarAccess.getCompound_statementAccess().getBeginKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCompound_statementAccess().getBeginKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compound_statement__Group__0__Impl"


    // $ANTLR start "rule__Compound_statement__Group__1"
    // InternalPascal.g:4284:1: rule__Compound_statement__Group__1 : rule__Compound_statement__Group__1__Impl rule__Compound_statement__Group__2 ;
    public final void rule__Compound_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4288:1: ( rule__Compound_statement__Group__1__Impl rule__Compound_statement__Group__2 )
            // InternalPascal.g:4289:2: rule__Compound_statement__Group__1__Impl rule__Compound_statement__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Compound_statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compound_statement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compound_statement__Group__1"


    // $ANTLR start "rule__Compound_statement__Group__1__Impl"
    // InternalPascal.g:4296:1: rule__Compound_statement__Group__1__Impl : ( ( rule__Compound_statement__SequenceAssignment_1 ) ) ;
    public final void rule__Compound_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4300:1: ( ( ( rule__Compound_statement__SequenceAssignment_1 ) ) )
            // InternalPascal.g:4301:1: ( ( rule__Compound_statement__SequenceAssignment_1 ) )
            {
            // InternalPascal.g:4301:1: ( ( rule__Compound_statement__SequenceAssignment_1 ) )
            // InternalPascal.g:4302:2: ( rule__Compound_statement__SequenceAssignment_1 )
            {
             before(grammarAccess.getCompound_statementAccess().getSequenceAssignment_1()); 
            // InternalPascal.g:4303:2: ( rule__Compound_statement__SequenceAssignment_1 )
            // InternalPascal.g:4303:3: rule__Compound_statement__SequenceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Compound_statement__SequenceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompound_statementAccess().getSequenceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compound_statement__Group__1__Impl"


    // $ANTLR start "rule__Compound_statement__Group__2"
    // InternalPascal.g:4311:1: rule__Compound_statement__Group__2 : rule__Compound_statement__Group__2__Impl ;
    public final void rule__Compound_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4315:1: ( rule__Compound_statement__Group__2__Impl )
            // InternalPascal.g:4316:2: rule__Compound_statement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compound_statement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compound_statement__Group__2"


    // $ANTLR start "rule__Compound_statement__Group__2__Impl"
    // InternalPascal.g:4322:1: rule__Compound_statement__Group__2__Impl : ( 'end' ) ;
    public final void rule__Compound_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4326:1: ( ( 'end' ) )
            // InternalPascal.g:4327:1: ( 'end' )
            {
            // InternalPascal.g:4327:1: ( 'end' )
            // InternalPascal.g:4328:2: 'end'
            {
             before(grammarAccess.getCompound_statementAccess().getEndKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCompound_statementAccess().getEndKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compound_statement__Group__2__Impl"


    // $ANTLR start "rule__For_statement__Group__0"
    // InternalPascal.g:4338:1: rule__For_statement__Group__0 : rule__For_statement__Group__0__Impl rule__For_statement__Group__1 ;
    public final void rule__For_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4342:1: ( rule__For_statement__Group__0__Impl rule__For_statement__Group__1 )
            // InternalPascal.g:4343:2: rule__For_statement__Group__0__Impl rule__For_statement__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__For_statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__For_statement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For_statement__Group__0"


    // $ANTLR start "rule__For_statement__Group__0__Impl"
    // InternalPascal.g:4350:1: rule__For_statement__Group__0__Impl : ( 'for' ) ;
    public final void rule__For_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4354:1: ( ( 'for' ) )
            // InternalPascal.g:4355:1: ( 'for' )
            {
            // InternalPascal.g:4355:1: ( 'for' )
            // InternalPascal.g:4356:2: 'for'
            {
             before(grammarAccess.getFor_statementAccess().getForKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getFor_statementAccess().getForKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For_statement__Group__0__Impl"


    // $ANTLR start "rule__For_statement__Group__1"
    // InternalPascal.g:4365:1: rule__For_statement__Group__1 : rule__For_statement__Group__1__Impl rule__For_statement__Group__2 ;
    public final void rule__For_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4369:1: ( rule__For_statement__Group__1__Impl rule__For_statement__Group__2 )
            // InternalPascal.g:4370:2: rule__For_statement__Group__1__Impl rule__For_statement__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__For_statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__For_statement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For_statement__Group__1"


    // $ANTLR start "rule__For_statement__Group__1__Impl"
    // InternalPascal.g:4377:1: rule__For_statement__Group__1__Impl : ( ( rule__For_statement__AssignmentAssignment_1 ) ) ;
    public final void rule__For_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4381:1: ( ( ( rule__For_statement__AssignmentAssignment_1 ) ) )
            // InternalPascal.g:4382:1: ( ( rule__For_statement__AssignmentAssignment_1 ) )
            {
            // InternalPascal.g:4382:1: ( ( rule__For_statement__AssignmentAssignment_1 ) )
            // InternalPascal.g:4383:2: ( rule__For_statement__AssignmentAssignment_1 )
            {
             before(grammarAccess.getFor_statementAccess().getAssignmentAssignment_1()); 
            // InternalPascal.g:4384:2: ( rule__For_statement__AssignmentAssignment_1 )
            // InternalPascal.g:4384:3: rule__For_statement__AssignmentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__For_statement__AssignmentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFor_statementAccess().getAssignmentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For_statement__Group__1__Impl"


    // $ANTLR start "rule__For_statement__Group__2"
    // InternalPascal.g:4392:1: rule__For_statement__Group__2 : rule__For_statement__Group__2__Impl rule__For_statement__Group__3 ;
    public final void rule__For_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4396:1: ( rule__For_statement__Group__2__Impl rule__For_statement__Group__3 )
            // InternalPascal.g:4397:2: rule__For_statement__Group__2__Impl rule__For_statement__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__For_statement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__For_statement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For_statement__Group__2"


    // $ANTLR start "rule__For_statement__Group__2__Impl"
    // InternalPascal.g:4404:1: rule__For_statement__Group__2__Impl : ( ( rule__For_statement__Alternatives_2 ) ) ;
    public final void rule__For_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4408:1: ( ( ( rule__For_statement__Alternatives_2 ) ) )
            // InternalPascal.g:4409:1: ( ( rule__For_statement__Alternatives_2 ) )
            {
            // InternalPascal.g:4409:1: ( ( rule__For_statement__Alternatives_2 ) )
            // InternalPascal.g:4410:2: ( rule__For_statement__Alternatives_2 )
            {
             before(grammarAccess.getFor_statementAccess().getAlternatives_2()); 
            // InternalPascal.g:4411:2: ( rule__For_statement__Alternatives_2 )
            // InternalPascal.g:4411:3: rule__For_statement__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__For_statement__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getFor_statementAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For_statement__Group__2__Impl"


    // $ANTLR start "rule__For_statement__Group__3"
    // InternalPascal.g:4419:1: rule__For_statement__Group__3 : rule__For_statement__Group__3__Impl rule__For_statement__Group__4 ;
    public final void rule__For_statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4423:1: ( rule__For_statement__Group__3__Impl rule__For_statement__Group__4 )
            // InternalPascal.g:4424:2: rule__For_statement__Group__3__Impl rule__For_statement__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__For_statement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__For_statement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For_statement__Group__3"


    // $ANTLR start "rule__For_statement__Group__3__Impl"
    // InternalPascal.g:4431:1: rule__For_statement__Group__3__Impl : ( ( rule__For_statement__ExpressionAssignment_3 ) ) ;
    public final void rule__For_statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4435:1: ( ( ( rule__For_statement__ExpressionAssignment_3 ) ) )
            // InternalPascal.g:4436:1: ( ( rule__For_statement__ExpressionAssignment_3 ) )
            {
            // InternalPascal.g:4436:1: ( ( rule__For_statement__ExpressionAssignment_3 ) )
            // InternalPascal.g:4437:2: ( rule__For_statement__ExpressionAssignment_3 )
            {
             before(grammarAccess.getFor_statementAccess().getExpressionAssignment_3()); 
            // InternalPascal.g:4438:2: ( rule__For_statement__ExpressionAssignment_3 )
            // InternalPascal.g:4438:3: rule__For_statement__ExpressionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__For_statement__ExpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFor_statementAccess().getExpressionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For_statement__Group__3__Impl"


    // $ANTLR start "rule__For_statement__Group__4"
    // InternalPascal.g:4446:1: rule__For_statement__Group__4 : rule__For_statement__Group__4__Impl rule__For_statement__Group__5 ;
    public final void rule__For_statement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4450:1: ( rule__For_statement__Group__4__Impl rule__For_statement__Group__5 )
            // InternalPascal.g:4451:2: rule__For_statement__Group__4__Impl rule__For_statement__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__For_statement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__For_statement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For_statement__Group__4"


    // $ANTLR start "rule__For_statement__Group__4__Impl"
    // InternalPascal.g:4458:1: rule__For_statement__Group__4__Impl : ( 'do' ) ;
    public final void rule__For_statement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4462:1: ( ( 'do' ) )
            // InternalPascal.g:4463:1: ( 'do' )
            {
            // InternalPascal.g:4463:1: ( 'do' )
            // InternalPascal.g:4464:2: 'do'
            {
             before(grammarAccess.getFor_statementAccess().getDoKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFor_statementAccess().getDoKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For_statement__Group__4__Impl"


    // $ANTLR start "rule__For_statement__Group__5"
    // InternalPascal.g:4473:1: rule__For_statement__Group__5 : rule__For_statement__Group__5__Impl ;
    public final void rule__For_statement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4477:1: ( rule__For_statement__Group__5__Impl )
            // InternalPascal.g:4478:2: rule__For_statement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__For_statement__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For_statement__Group__5"


    // $ANTLR start "rule__For_statement__Group__5__Impl"
    // InternalPascal.g:4484:1: rule__For_statement__Group__5__Impl : ( ( rule__For_statement__StatementAssignment_5 ) ) ;
    public final void rule__For_statement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4488:1: ( ( ( rule__For_statement__StatementAssignment_5 ) ) )
            // InternalPascal.g:4489:1: ( ( rule__For_statement__StatementAssignment_5 ) )
            {
            // InternalPascal.g:4489:1: ( ( rule__For_statement__StatementAssignment_5 ) )
            // InternalPascal.g:4490:2: ( rule__For_statement__StatementAssignment_5 )
            {
             before(grammarAccess.getFor_statementAccess().getStatementAssignment_5()); 
            // InternalPascal.g:4491:2: ( rule__For_statement__StatementAssignment_5 )
            // InternalPascal.g:4491:3: rule__For_statement__StatementAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__For_statement__StatementAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFor_statementAccess().getStatementAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For_statement__Group__5__Impl"


    // $ANTLR start "rule__If_statement__Group__0"
    // InternalPascal.g:4500:1: rule__If_statement__Group__0 : rule__If_statement__Group__0__Impl rule__If_statement__Group__1 ;
    public final void rule__If_statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4504:1: ( rule__If_statement__Group__0__Impl rule__If_statement__Group__1 )
            // InternalPascal.g:4505:2: rule__If_statement__Group__0__Impl rule__If_statement__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__If_statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If_statement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_statement__Group__0"


    // $ANTLR start "rule__If_statement__Group__0__Impl"
    // InternalPascal.g:4512:1: rule__If_statement__Group__0__Impl : ( 'if' ) ;
    public final void rule__If_statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4516:1: ( ( 'if' ) )
            // InternalPascal.g:4517:1: ( 'if' )
            {
            // InternalPascal.g:4517:1: ( 'if' )
            // InternalPascal.g:4518:2: 'if'
            {
             before(grammarAccess.getIf_statementAccess().getIfKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getIf_statementAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_statement__Group__0__Impl"


    // $ANTLR start "rule__If_statement__Group__1"
    // InternalPascal.g:4527:1: rule__If_statement__Group__1 : rule__If_statement__Group__1__Impl rule__If_statement__Group__2 ;
    public final void rule__If_statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4531:1: ( rule__If_statement__Group__1__Impl rule__If_statement__Group__2 )
            // InternalPascal.g:4532:2: rule__If_statement__Group__1__Impl rule__If_statement__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__If_statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If_statement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_statement__Group__1"


    // $ANTLR start "rule__If_statement__Group__1__Impl"
    // InternalPascal.g:4539:1: rule__If_statement__Group__1__Impl : ( ( rule__If_statement__ExpressionAssignment_1 ) ) ;
    public final void rule__If_statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4543:1: ( ( ( rule__If_statement__ExpressionAssignment_1 ) ) )
            // InternalPascal.g:4544:1: ( ( rule__If_statement__ExpressionAssignment_1 ) )
            {
            // InternalPascal.g:4544:1: ( ( rule__If_statement__ExpressionAssignment_1 ) )
            // InternalPascal.g:4545:2: ( rule__If_statement__ExpressionAssignment_1 )
            {
             before(grammarAccess.getIf_statementAccess().getExpressionAssignment_1()); 
            // InternalPascal.g:4546:2: ( rule__If_statement__ExpressionAssignment_1 )
            // InternalPascal.g:4546:3: rule__If_statement__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__If_statement__ExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIf_statementAccess().getExpressionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_statement__Group__1__Impl"


    // $ANTLR start "rule__If_statement__Group__2"
    // InternalPascal.g:4554:1: rule__If_statement__Group__2 : rule__If_statement__Group__2__Impl rule__If_statement__Group__3 ;
    public final void rule__If_statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4558:1: ( rule__If_statement__Group__2__Impl rule__If_statement__Group__3 )
            // InternalPascal.g:4559:2: rule__If_statement__Group__2__Impl rule__If_statement__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__If_statement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If_statement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_statement__Group__2"


    // $ANTLR start "rule__If_statement__Group__2__Impl"
    // InternalPascal.g:4566:1: rule__If_statement__Group__2__Impl : ( 'then' ) ;
    public final void rule__If_statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4570:1: ( ( 'then' ) )
            // InternalPascal.g:4571:1: ( 'then' )
            {
            // InternalPascal.g:4571:1: ( 'then' )
            // InternalPascal.g:4572:2: 'then'
            {
             before(grammarAccess.getIf_statementAccess().getThenKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getIf_statementAccess().getThenKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_statement__Group__2__Impl"


    // $ANTLR start "rule__If_statement__Group__3"
    // InternalPascal.g:4581:1: rule__If_statement__Group__3 : rule__If_statement__Group__3__Impl rule__If_statement__Group__4 ;
    public final void rule__If_statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4585:1: ( rule__If_statement__Group__3__Impl rule__If_statement__Group__4 )
            // InternalPascal.g:4586:2: rule__If_statement__Group__3__Impl rule__If_statement__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__If_statement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If_statement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_statement__Group__3"


    // $ANTLR start "rule__If_statement__Group__3__Impl"
    // InternalPascal.g:4593:1: rule__If_statement__Group__3__Impl : ( ( rule__If_statement__IfStatementAssignment_3 ) ) ;
    public final void rule__If_statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4597:1: ( ( ( rule__If_statement__IfStatementAssignment_3 ) ) )
            // InternalPascal.g:4598:1: ( ( rule__If_statement__IfStatementAssignment_3 ) )
            {
            // InternalPascal.g:4598:1: ( ( rule__If_statement__IfStatementAssignment_3 ) )
            // InternalPascal.g:4599:2: ( rule__If_statement__IfStatementAssignment_3 )
            {
             before(grammarAccess.getIf_statementAccess().getIfStatementAssignment_3()); 
            // InternalPascal.g:4600:2: ( rule__If_statement__IfStatementAssignment_3 )
            // InternalPascal.g:4600:3: rule__If_statement__IfStatementAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__If_statement__IfStatementAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIf_statementAccess().getIfStatementAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_statement__Group__3__Impl"


    // $ANTLR start "rule__If_statement__Group__4"
    // InternalPascal.g:4608:1: rule__If_statement__Group__4 : rule__If_statement__Group__4__Impl ;
    public final void rule__If_statement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4612:1: ( rule__If_statement__Group__4__Impl )
            // InternalPascal.g:4613:2: rule__If_statement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If_statement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_statement__Group__4"


    // $ANTLR start "rule__If_statement__Group__4__Impl"
    // InternalPascal.g:4619:1: rule__If_statement__Group__4__Impl : ( ( rule__If_statement__Group_4__0 )? ) ;
    public final void rule__If_statement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4623:1: ( ( ( rule__If_statement__Group_4__0 )? ) )
            // InternalPascal.g:4624:1: ( ( rule__If_statement__Group_4__0 )? )
            {
            // InternalPascal.g:4624:1: ( ( rule__If_statement__Group_4__0 )? )
            // InternalPascal.g:4625:2: ( rule__If_statement__Group_4__0 )?
            {
             before(grammarAccess.getIf_statementAccess().getGroup_4()); 
            // InternalPascal.g:4626:2: ( rule__If_statement__Group_4__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==40) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalPascal.g:4626:3: rule__If_statement__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__If_statement__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIf_statementAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_statement__Group__4__Impl"


    // $ANTLR start "rule__If_statement__Group_4__0"
    // InternalPascal.g:4635:1: rule__If_statement__Group_4__0 : rule__If_statement__Group_4__0__Impl rule__If_statement__Group_4__1 ;
    public final void rule__If_statement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4639:1: ( rule__If_statement__Group_4__0__Impl rule__If_statement__Group_4__1 )
            // InternalPascal.g:4640:2: rule__If_statement__Group_4__0__Impl rule__If_statement__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__If_statement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If_statement__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_statement__Group_4__0"


    // $ANTLR start "rule__If_statement__Group_4__0__Impl"
    // InternalPascal.g:4647:1: rule__If_statement__Group_4__0__Impl : ( 'else' ) ;
    public final void rule__If_statement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4651:1: ( ( 'else' ) )
            // InternalPascal.g:4652:1: ( 'else' )
            {
            // InternalPascal.g:4652:1: ( 'else' )
            // InternalPascal.g:4653:2: 'else'
            {
             before(grammarAccess.getIf_statementAccess().getElseKeyword_4_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getIf_statementAccess().getElseKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_statement__Group_4__0__Impl"


    // $ANTLR start "rule__If_statement__Group_4__1"
    // InternalPascal.g:4662:1: rule__If_statement__Group_4__1 : rule__If_statement__Group_4__1__Impl ;
    public final void rule__If_statement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4666:1: ( rule__If_statement__Group_4__1__Impl )
            // InternalPascal.g:4667:2: rule__If_statement__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If_statement__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_statement__Group_4__1"


    // $ANTLR start "rule__If_statement__Group_4__1__Impl"
    // InternalPascal.g:4673:1: rule__If_statement__Group_4__1__Impl : ( ( rule__If_statement__ElseStatementAssignment_4_1 ) ) ;
    public final void rule__If_statement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4677:1: ( ( ( rule__If_statement__ElseStatementAssignment_4_1 ) ) )
            // InternalPascal.g:4678:1: ( ( rule__If_statement__ElseStatementAssignment_4_1 ) )
            {
            // InternalPascal.g:4678:1: ( ( rule__If_statement__ElseStatementAssignment_4_1 ) )
            // InternalPascal.g:4679:2: ( rule__If_statement__ElseStatementAssignment_4_1 )
            {
             before(grammarAccess.getIf_statementAccess().getElseStatementAssignment_4_1()); 
            // InternalPascal.g:4680:2: ( rule__If_statement__ElseStatementAssignment_4_1 )
            // InternalPascal.g:4680:3: rule__If_statement__ElseStatementAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__If_statement__ElseStatementAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getIf_statementAccess().getElseStatementAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_statement__Group_4__1__Impl"


    // $ANTLR start "rule__Constant__Group_0__0"
    // InternalPascal.g:4689:1: rule__Constant__Group_0__0 : rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1 ;
    public final void rule__Constant__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4693:1: ( rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1 )
            // InternalPascal.g:4694:2: rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1
            {
            pushFollow(FOLLOW_32);
            rule__Constant__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_0__0"


    // $ANTLR start "rule__Constant__Group_0__0__Impl"
    // InternalPascal.g:4701:1: rule__Constant__Group_0__0__Impl : ( ( rule__Constant__OpteratorAssignment_0_0 )? ) ;
    public final void rule__Constant__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4705:1: ( ( ( rule__Constant__OpteratorAssignment_0_0 )? ) )
            // InternalPascal.g:4706:1: ( ( rule__Constant__OpteratorAssignment_0_0 )? )
            {
            // InternalPascal.g:4706:1: ( ( rule__Constant__OpteratorAssignment_0_0 )? )
            // InternalPascal.g:4707:2: ( rule__Constant__OpteratorAssignment_0_0 )?
            {
             before(grammarAccess.getConstantAccess().getOpteratorAssignment_0_0()); 
            // InternalPascal.g:4708:2: ( rule__Constant__OpteratorAssignment_0_0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ADDITION_OPERATOR) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalPascal.g:4708:3: rule__Constant__OpteratorAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__OpteratorAssignment_0_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstantAccess().getOpteratorAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_0__0__Impl"


    // $ANTLR start "rule__Constant__Group_0__1"
    // InternalPascal.g:4716:1: rule__Constant__Group_0__1 : rule__Constant__Group_0__1__Impl ;
    public final void rule__Constant__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4720:1: ( rule__Constant__Group_0__1__Impl )
            // InternalPascal.g:4721:2: rule__Constant__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_0__1"


    // $ANTLR start "rule__Constant__Group_0__1__Impl"
    // InternalPascal.g:4727:1: rule__Constant__Group_0__1__Impl : ( ( rule__Constant__Alternatives_0_1 ) ) ;
    public final void rule__Constant__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4731:1: ( ( ( rule__Constant__Alternatives_0_1 ) ) )
            // InternalPascal.g:4732:1: ( ( rule__Constant__Alternatives_0_1 ) )
            {
            // InternalPascal.g:4732:1: ( ( rule__Constant__Alternatives_0_1 ) )
            // InternalPascal.g:4733:2: ( rule__Constant__Alternatives_0_1 )
            {
             before(grammarAccess.getConstantAccess().getAlternatives_0_1()); 
            // InternalPascal.g:4734:2: ( rule__Constant__Alternatives_0_1 )
            // InternalPascal.g:4734:3: rule__Constant__Alternatives_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Alternatives_0_1();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getAlternatives_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_0__1__Impl"


    // $ANTLR start "rule__Constant_definition_part__Group__0"
    // InternalPascal.g:4743:1: rule__Constant_definition_part__Group__0 : rule__Constant_definition_part__Group__0__Impl rule__Constant_definition_part__Group__1 ;
    public final void rule__Constant_definition_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4747:1: ( rule__Constant_definition_part__Group__0__Impl rule__Constant_definition_part__Group__1 )
            // InternalPascal.g:4748:2: rule__Constant_definition_part__Group__0__Impl rule__Constant_definition_part__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Constant_definition_part__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant_definition_part__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition_part__Group__0"


    // $ANTLR start "rule__Constant_definition_part__Group__0__Impl"
    // InternalPascal.g:4755:1: rule__Constant_definition_part__Group__0__Impl : ( 'const' ) ;
    public final void rule__Constant_definition_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4759:1: ( ( 'const' ) )
            // InternalPascal.g:4760:1: ( 'const' )
            {
            // InternalPascal.g:4760:1: ( 'const' )
            // InternalPascal.g:4761:2: 'const'
            {
             before(grammarAccess.getConstant_definition_partAccess().getConstKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getConstant_definition_partAccess().getConstKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition_part__Group__0__Impl"


    // $ANTLR start "rule__Constant_definition_part__Group__1"
    // InternalPascal.g:4770:1: rule__Constant_definition_part__Group__1 : rule__Constant_definition_part__Group__1__Impl ;
    public final void rule__Constant_definition_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4774:1: ( rule__Constant_definition_part__Group__1__Impl )
            // InternalPascal.g:4775:2: rule__Constant_definition_part__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant_definition_part__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition_part__Group__1"


    // $ANTLR start "rule__Constant_definition_part__Group__1__Impl"
    // InternalPascal.g:4781:1: rule__Constant_definition_part__Group__1__Impl : ( ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* ) ) ;
    public final void rule__Constant_definition_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4785:1: ( ( ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* ) ) )
            // InternalPascal.g:4786:1: ( ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* ) )
            {
            // InternalPascal.g:4786:1: ( ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* ) )
            // InternalPascal.g:4787:2: ( ( rule__Constant_definition_part__Group_1__0 ) ) ( ( rule__Constant_definition_part__Group_1__0 )* )
            {
            // InternalPascal.g:4787:2: ( ( rule__Constant_definition_part__Group_1__0 ) )
            // InternalPascal.g:4788:3: ( rule__Constant_definition_part__Group_1__0 )
            {
             before(grammarAccess.getConstant_definition_partAccess().getGroup_1()); 
            // InternalPascal.g:4789:3: ( rule__Constant_definition_part__Group_1__0 )
            // InternalPascal.g:4789:4: rule__Constant_definition_part__Group_1__0
            {
            pushFollow(FOLLOW_33);
            rule__Constant_definition_part__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getConstant_definition_partAccess().getGroup_1()); 

            }

            // InternalPascal.g:4792:2: ( ( rule__Constant_definition_part__Group_1__0 )* )
            // InternalPascal.g:4793:3: ( rule__Constant_definition_part__Group_1__0 )*
            {
             before(grammarAccess.getConstant_definition_partAccess().getGroup_1()); 
            // InternalPascal.g:4794:3: ( rule__Constant_definition_part__Group_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_ID) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalPascal.g:4794:4: rule__Constant_definition_part__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Constant_definition_part__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getConstant_definition_partAccess().getGroup_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition_part__Group__1__Impl"


    // $ANTLR start "rule__Constant_definition_part__Group_1__0"
    // InternalPascal.g:4804:1: rule__Constant_definition_part__Group_1__0 : rule__Constant_definition_part__Group_1__0__Impl rule__Constant_definition_part__Group_1__1 ;
    public final void rule__Constant_definition_part__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4808:1: ( rule__Constant_definition_part__Group_1__0__Impl rule__Constant_definition_part__Group_1__1 )
            // InternalPascal.g:4809:2: rule__Constant_definition_part__Group_1__0__Impl rule__Constant_definition_part__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Constant_definition_part__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant_definition_part__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition_part__Group_1__0"


    // $ANTLR start "rule__Constant_definition_part__Group_1__0__Impl"
    // InternalPascal.g:4816:1: rule__Constant_definition_part__Group_1__0__Impl : ( ( rule__Constant_definition_part__ConstsAssignment_1_0 ) ) ;
    public final void rule__Constant_definition_part__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4820:1: ( ( ( rule__Constant_definition_part__ConstsAssignment_1_0 ) ) )
            // InternalPascal.g:4821:1: ( ( rule__Constant_definition_part__ConstsAssignment_1_0 ) )
            {
            // InternalPascal.g:4821:1: ( ( rule__Constant_definition_part__ConstsAssignment_1_0 ) )
            // InternalPascal.g:4822:2: ( rule__Constant_definition_part__ConstsAssignment_1_0 )
            {
             before(grammarAccess.getConstant_definition_partAccess().getConstsAssignment_1_0()); 
            // InternalPascal.g:4823:2: ( rule__Constant_definition_part__ConstsAssignment_1_0 )
            // InternalPascal.g:4823:3: rule__Constant_definition_part__ConstsAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Constant_definition_part__ConstsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getConstant_definition_partAccess().getConstsAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition_part__Group_1__0__Impl"


    // $ANTLR start "rule__Constant_definition_part__Group_1__1"
    // InternalPascal.g:4831:1: rule__Constant_definition_part__Group_1__1 : rule__Constant_definition_part__Group_1__1__Impl ;
    public final void rule__Constant_definition_part__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4835:1: ( rule__Constant_definition_part__Group_1__1__Impl )
            // InternalPascal.g:4836:2: rule__Constant_definition_part__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant_definition_part__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition_part__Group_1__1"


    // $ANTLR start "rule__Constant_definition_part__Group_1__1__Impl"
    // InternalPascal.g:4842:1: rule__Constant_definition_part__Group_1__1__Impl : ( ';' ) ;
    public final void rule__Constant_definition_part__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4846:1: ( ( ';' ) )
            // InternalPascal.g:4847:1: ( ';' )
            {
            // InternalPascal.g:4847:1: ( ';' )
            // InternalPascal.g:4848:2: ';'
            {
             before(grammarAccess.getConstant_definition_partAccess().getSemicolonKeyword_1_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getConstant_definition_partAccess().getSemicolonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition_part__Group_1__1__Impl"


    // $ANTLR start "rule__Constant_definition__Group__0"
    // InternalPascal.g:4858:1: rule__Constant_definition__Group__0 : rule__Constant_definition__Group__0__Impl rule__Constant_definition__Group__1 ;
    public final void rule__Constant_definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4862:1: ( rule__Constant_definition__Group__0__Impl rule__Constant_definition__Group__1 )
            // InternalPascal.g:4863:2: rule__Constant_definition__Group__0__Impl rule__Constant_definition__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Constant_definition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant_definition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition__Group__0"


    // $ANTLR start "rule__Constant_definition__Group__0__Impl"
    // InternalPascal.g:4870:1: rule__Constant_definition__Group__0__Impl : ( ( rule__Constant_definition__NameAssignment_0 ) ) ;
    public final void rule__Constant_definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4874:1: ( ( ( rule__Constant_definition__NameAssignment_0 ) ) )
            // InternalPascal.g:4875:1: ( ( rule__Constant_definition__NameAssignment_0 ) )
            {
            // InternalPascal.g:4875:1: ( ( rule__Constant_definition__NameAssignment_0 ) )
            // InternalPascal.g:4876:2: ( rule__Constant_definition__NameAssignment_0 )
            {
             before(grammarAccess.getConstant_definitionAccess().getNameAssignment_0()); 
            // InternalPascal.g:4877:2: ( rule__Constant_definition__NameAssignment_0 )
            // InternalPascal.g:4877:3: rule__Constant_definition__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Constant_definition__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConstant_definitionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition__Group__0__Impl"


    // $ANTLR start "rule__Constant_definition__Group__1"
    // InternalPascal.g:4885:1: rule__Constant_definition__Group__1 : rule__Constant_definition__Group__1__Impl rule__Constant_definition__Group__2 ;
    public final void rule__Constant_definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4889:1: ( rule__Constant_definition__Group__1__Impl rule__Constant_definition__Group__2 )
            // InternalPascal.g:4890:2: rule__Constant_definition__Group__1__Impl rule__Constant_definition__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__Constant_definition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant_definition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition__Group__1"


    // $ANTLR start "rule__Constant_definition__Group__1__Impl"
    // InternalPascal.g:4897:1: rule__Constant_definition__Group__1__Impl : ( '=' ) ;
    public final void rule__Constant_definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4901:1: ( ( '=' ) )
            // InternalPascal.g:4902:1: ( '=' )
            {
            // InternalPascal.g:4902:1: ( '=' )
            // InternalPascal.g:4903:2: '='
            {
             before(grammarAccess.getConstant_definitionAccess().getEqualsSignKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getConstant_definitionAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition__Group__1__Impl"


    // $ANTLR start "rule__Constant_definition__Group__2"
    // InternalPascal.g:4912:1: rule__Constant_definition__Group__2 : rule__Constant_definition__Group__2__Impl ;
    public final void rule__Constant_definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4916:1: ( rule__Constant_definition__Group__2__Impl )
            // InternalPascal.g:4917:2: rule__Constant_definition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant_definition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition__Group__2"


    // $ANTLR start "rule__Constant_definition__Group__2__Impl"
    // InternalPascal.g:4923:1: rule__Constant_definition__Group__2__Impl : ( ( rule__Constant_definition__ConstAssignment_2 ) ) ;
    public final void rule__Constant_definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4927:1: ( ( ( rule__Constant_definition__ConstAssignment_2 ) ) )
            // InternalPascal.g:4928:1: ( ( rule__Constant_definition__ConstAssignment_2 ) )
            {
            // InternalPascal.g:4928:1: ( ( rule__Constant_definition__ConstAssignment_2 ) )
            // InternalPascal.g:4929:2: ( rule__Constant_definition__ConstAssignment_2 )
            {
             before(grammarAccess.getConstant_definitionAccess().getConstAssignment_2()); 
            // InternalPascal.g:4930:2: ( rule__Constant_definition__ConstAssignment_2 )
            // InternalPascal.g:4930:3: rule__Constant_definition__ConstAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Constant_definition__ConstAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConstant_definitionAccess().getConstAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition__Group__2__Impl"


    // $ANTLR start "rule__Type_definition_part__Group__0"
    // InternalPascal.g:4939:1: rule__Type_definition_part__Group__0 : rule__Type_definition_part__Group__0__Impl rule__Type_definition_part__Group__1 ;
    public final void rule__Type_definition_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4943:1: ( rule__Type_definition_part__Group__0__Impl rule__Type_definition_part__Group__1 )
            // InternalPascal.g:4944:2: rule__Type_definition_part__Group__0__Impl rule__Type_definition_part__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Type_definition_part__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type_definition_part__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition_part__Group__0"


    // $ANTLR start "rule__Type_definition_part__Group__0__Impl"
    // InternalPascal.g:4951:1: rule__Type_definition_part__Group__0__Impl : ( 'type' ) ;
    public final void rule__Type_definition_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4955:1: ( ( 'type' ) )
            // InternalPascal.g:4956:1: ( 'type' )
            {
            // InternalPascal.g:4956:1: ( 'type' )
            // InternalPascal.g:4957:2: 'type'
            {
             before(grammarAccess.getType_definition_partAccess().getTypeKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getType_definition_partAccess().getTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition_part__Group__0__Impl"


    // $ANTLR start "rule__Type_definition_part__Group__1"
    // InternalPascal.g:4966:1: rule__Type_definition_part__Group__1 : rule__Type_definition_part__Group__1__Impl ;
    public final void rule__Type_definition_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4970:1: ( rule__Type_definition_part__Group__1__Impl )
            // InternalPascal.g:4971:2: rule__Type_definition_part__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type_definition_part__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition_part__Group__1"


    // $ANTLR start "rule__Type_definition_part__Group__1__Impl"
    // InternalPascal.g:4977:1: rule__Type_definition_part__Group__1__Impl : ( ( ( rule__Type_definition_part__Group_1__0 ) ) ( ( rule__Type_definition_part__Group_1__0 )* ) ) ;
    public final void rule__Type_definition_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:4981:1: ( ( ( ( rule__Type_definition_part__Group_1__0 ) ) ( ( rule__Type_definition_part__Group_1__0 )* ) ) )
            // InternalPascal.g:4982:1: ( ( ( rule__Type_definition_part__Group_1__0 ) ) ( ( rule__Type_definition_part__Group_1__0 )* ) )
            {
            // InternalPascal.g:4982:1: ( ( ( rule__Type_definition_part__Group_1__0 ) ) ( ( rule__Type_definition_part__Group_1__0 )* ) )
            // InternalPascal.g:4983:2: ( ( rule__Type_definition_part__Group_1__0 ) ) ( ( rule__Type_definition_part__Group_1__0 )* )
            {
            // InternalPascal.g:4983:2: ( ( rule__Type_definition_part__Group_1__0 ) )
            // InternalPascal.g:4984:3: ( rule__Type_definition_part__Group_1__0 )
            {
             before(grammarAccess.getType_definition_partAccess().getGroup_1()); 
            // InternalPascal.g:4985:3: ( rule__Type_definition_part__Group_1__0 )
            // InternalPascal.g:4985:4: rule__Type_definition_part__Group_1__0
            {
            pushFollow(FOLLOW_33);
            rule__Type_definition_part__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getType_definition_partAccess().getGroup_1()); 

            }

            // InternalPascal.g:4988:2: ( ( rule__Type_definition_part__Group_1__0 )* )
            // InternalPascal.g:4989:3: ( rule__Type_definition_part__Group_1__0 )*
            {
             before(grammarAccess.getType_definition_partAccess().getGroup_1()); 
            // InternalPascal.g:4990:3: ( rule__Type_definition_part__Group_1__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ID) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalPascal.g:4990:4: rule__Type_definition_part__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Type_definition_part__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getType_definition_partAccess().getGroup_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition_part__Group__1__Impl"


    // $ANTLR start "rule__Type_definition_part__Group_1__0"
    // InternalPascal.g:5000:1: rule__Type_definition_part__Group_1__0 : rule__Type_definition_part__Group_1__0__Impl rule__Type_definition_part__Group_1__1 ;
    public final void rule__Type_definition_part__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5004:1: ( rule__Type_definition_part__Group_1__0__Impl rule__Type_definition_part__Group_1__1 )
            // InternalPascal.g:5005:2: rule__Type_definition_part__Group_1__0__Impl rule__Type_definition_part__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Type_definition_part__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type_definition_part__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition_part__Group_1__0"


    // $ANTLR start "rule__Type_definition_part__Group_1__0__Impl"
    // InternalPascal.g:5012:1: rule__Type_definition_part__Group_1__0__Impl : ( ( rule__Type_definition_part__TypesAssignment_1_0 ) ) ;
    public final void rule__Type_definition_part__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5016:1: ( ( ( rule__Type_definition_part__TypesAssignment_1_0 ) ) )
            // InternalPascal.g:5017:1: ( ( rule__Type_definition_part__TypesAssignment_1_0 ) )
            {
            // InternalPascal.g:5017:1: ( ( rule__Type_definition_part__TypesAssignment_1_0 ) )
            // InternalPascal.g:5018:2: ( rule__Type_definition_part__TypesAssignment_1_0 )
            {
             before(grammarAccess.getType_definition_partAccess().getTypesAssignment_1_0()); 
            // InternalPascal.g:5019:2: ( rule__Type_definition_part__TypesAssignment_1_0 )
            // InternalPascal.g:5019:3: rule__Type_definition_part__TypesAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Type_definition_part__TypesAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getType_definition_partAccess().getTypesAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition_part__Group_1__0__Impl"


    // $ANTLR start "rule__Type_definition_part__Group_1__1"
    // InternalPascal.g:5027:1: rule__Type_definition_part__Group_1__1 : rule__Type_definition_part__Group_1__1__Impl ;
    public final void rule__Type_definition_part__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5031:1: ( rule__Type_definition_part__Group_1__1__Impl )
            // InternalPascal.g:5032:2: rule__Type_definition_part__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type_definition_part__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition_part__Group_1__1"


    // $ANTLR start "rule__Type_definition_part__Group_1__1__Impl"
    // InternalPascal.g:5038:1: rule__Type_definition_part__Group_1__1__Impl : ( ';' ) ;
    public final void rule__Type_definition_part__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5042:1: ( ( ';' ) )
            // InternalPascal.g:5043:1: ( ';' )
            {
            // InternalPascal.g:5043:1: ( ';' )
            // InternalPascal.g:5044:2: ';'
            {
             before(grammarAccess.getType_definition_partAccess().getSemicolonKeyword_1_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getType_definition_partAccess().getSemicolonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition_part__Group_1__1__Impl"


    // $ANTLR start "rule__Type_definition__Group__0"
    // InternalPascal.g:5054:1: rule__Type_definition__Group__0 : rule__Type_definition__Group__0__Impl rule__Type_definition__Group__1 ;
    public final void rule__Type_definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5058:1: ( rule__Type_definition__Group__0__Impl rule__Type_definition__Group__1 )
            // InternalPascal.g:5059:2: rule__Type_definition__Group__0__Impl rule__Type_definition__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Type_definition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type_definition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition__Group__0"


    // $ANTLR start "rule__Type_definition__Group__0__Impl"
    // InternalPascal.g:5066:1: rule__Type_definition__Group__0__Impl : ( ( rule__Type_definition__NameAssignment_0 ) ) ;
    public final void rule__Type_definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5070:1: ( ( ( rule__Type_definition__NameAssignment_0 ) ) )
            // InternalPascal.g:5071:1: ( ( rule__Type_definition__NameAssignment_0 ) )
            {
            // InternalPascal.g:5071:1: ( ( rule__Type_definition__NameAssignment_0 ) )
            // InternalPascal.g:5072:2: ( rule__Type_definition__NameAssignment_0 )
            {
             before(grammarAccess.getType_definitionAccess().getNameAssignment_0()); 
            // InternalPascal.g:5073:2: ( rule__Type_definition__NameAssignment_0 )
            // InternalPascal.g:5073:3: rule__Type_definition__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Type_definition__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getType_definitionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition__Group__0__Impl"


    // $ANTLR start "rule__Type_definition__Group__1"
    // InternalPascal.g:5081:1: rule__Type_definition__Group__1 : rule__Type_definition__Group__1__Impl rule__Type_definition__Group__2 ;
    public final void rule__Type_definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5085:1: ( rule__Type_definition__Group__1__Impl rule__Type_definition__Group__2 )
            // InternalPascal.g:5086:2: rule__Type_definition__Group__1__Impl rule__Type_definition__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__Type_definition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type_definition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition__Group__1"


    // $ANTLR start "rule__Type_definition__Group__1__Impl"
    // InternalPascal.g:5093:1: rule__Type_definition__Group__1__Impl : ( '=' ) ;
    public final void rule__Type_definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5097:1: ( ( '=' ) )
            // InternalPascal.g:5098:1: ( '=' )
            {
            // InternalPascal.g:5098:1: ( '=' )
            // InternalPascal.g:5099:2: '='
            {
             before(grammarAccess.getType_definitionAccess().getEqualsSignKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getType_definitionAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition__Group__1__Impl"


    // $ANTLR start "rule__Type_definition__Group__2"
    // InternalPascal.g:5108:1: rule__Type_definition__Group__2 : rule__Type_definition__Group__2__Impl ;
    public final void rule__Type_definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5112:1: ( rule__Type_definition__Group__2__Impl )
            // InternalPascal.g:5113:2: rule__Type_definition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type_definition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition__Group__2"


    // $ANTLR start "rule__Type_definition__Group__2__Impl"
    // InternalPascal.g:5119:1: rule__Type_definition__Group__2__Impl : ( ( rule__Type_definition__TypeAssignment_2 ) ) ;
    public final void rule__Type_definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5123:1: ( ( ( rule__Type_definition__TypeAssignment_2 ) ) )
            // InternalPascal.g:5124:1: ( ( rule__Type_definition__TypeAssignment_2 ) )
            {
            // InternalPascal.g:5124:1: ( ( rule__Type_definition__TypeAssignment_2 ) )
            // InternalPascal.g:5125:2: ( rule__Type_definition__TypeAssignment_2 )
            {
             before(grammarAccess.getType_definitionAccess().getTypeAssignment_2()); 
            // InternalPascal.g:5126:2: ( rule__Type_definition__TypeAssignment_2 )
            // InternalPascal.g:5126:3: rule__Type_definition__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Type_definition__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getType_definitionAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition__Group__2__Impl"


    // $ANTLR start "rule__Subrange_type__Group_0__0"
    // InternalPascal.g:5135:1: rule__Subrange_type__Group_0__0 : rule__Subrange_type__Group_0__0__Impl rule__Subrange_type__Group_0__1 ;
    public final void rule__Subrange_type__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5139:1: ( rule__Subrange_type__Group_0__0__Impl rule__Subrange_type__Group_0__1 )
            // InternalPascal.g:5140:2: rule__Subrange_type__Group_0__0__Impl rule__Subrange_type__Group_0__1
            {
            pushFollow(FOLLOW_37);
            rule__Subrange_type__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subrange_type__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subrange_type__Group_0__0"


    // $ANTLR start "rule__Subrange_type__Group_0__0__Impl"
    // InternalPascal.g:5147:1: rule__Subrange_type__Group_0__0__Impl : ( ( rule__Subrange_type__InitialConstAssignment_0_0 ) ) ;
    public final void rule__Subrange_type__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5151:1: ( ( ( rule__Subrange_type__InitialConstAssignment_0_0 ) ) )
            // InternalPascal.g:5152:1: ( ( rule__Subrange_type__InitialConstAssignment_0_0 ) )
            {
            // InternalPascal.g:5152:1: ( ( rule__Subrange_type__InitialConstAssignment_0_0 ) )
            // InternalPascal.g:5153:2: ( rule__Subrange_type__InitialConstAssignment_0_0 )
            {
             before(grammarAccess.getSubrange_typeAccess().getInitialConstAssignment_0_0()); 
            // InternalPascal.g:5154:2: ( rule__Subrange_type__InitialConstAssignment_0_0 )
            // InternalPascal.g:5154:3: rule__Subrange_type__InitialConstAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Subrange_type__InitialConstAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSubrange_typeAccess().getInitialConstAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subrange_type__Group_0__0__Impl"


    // $ANTLR start "rule__Subrange_type__Group_0__1"
    // InternalPascal.g:5162:1: rule__Subrange_type__Group_0__1 : rule__Subrange_type__Group_0__1__Impl rule__Subrange_type__Group_0__2 ;
    public final void rule__Subrange_type__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5166:1: ( rule__Subrange_type__Group_0__1__Impl rule__Subrange_type__Group_0__2 )
            // InternalPascal.g:5167:2: rule__Subrange_type__Group_0__1__Impl rule__Subrange_type__Group_0__2
            {
            pushFollow(FOLLOW_35);
            rule__Subrange_type__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subrange_type__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subrange_type__Group_0__1"


    // $ANTLR start "rule__Subrange_type__Group_0__1__Impl"
    // InternalPascal.g:5174:1: rule__Subrange_type__Group_0__1__Impl : ( '..' ) ;
    public final void rule__Subrange_type__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5178:1: ( ( '..' ) )
            // InternalPascal.g:5179:1: ( '..' )
            {
            // InternalPascal.g:5179:1: ( '..' )
            // InternalPascal.g:5180:2: '..'
            {
             before(grammarAccess.getSubrange_typeAccess().getFullStopFullStopKeyword_0_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSubrange_typeAccess().getFullStopFullStopKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subrange_type__Group_0__1__Impl"


    // $ANTLR start "rule__Subrange_type__Group_0__2"
    // InternalPascal.g:5189:1: rule__Subrange_type__Group_0__2 : rule__Subrange_type__Group_0__2__Impl ;
    public final void rule__Subrange_type__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5193:1: ( rule__Subrange_type__Group_0__2__Impl )
            // InternalPascal.g:5194:2: rule__Subrange_type__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subrange_type__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subrange_type__Group_0__2"


    // $ANTLR start "rule__Subrange_type__Group_0__2__Impl"
    // InternalPascal.g:5200:1: rule__Subrange_type__Group_0__2__Impl : ( ( rule__Subrange_type__FinalConstAssignment_0_2 ) ) ;
    public final void rule__Subrange_type__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5204:1: ( ( ( rule__Subrange_type__FinalConstAssignment_0_2 ) ) )
            // InternalPascal.g:5205:1: ( ( rule__Subrange_type__FinalConstAssignment_0_2 ) )
            {
            // InternalPascal.g:5205:1: ( ( rule__Subrange_type__FinalConstAssignment_0_2 ) )
            // InternalPascal.g:5206:2: ( rule__Subrange_type__FinalConstAssignment_0_2 )
            {
             before(grammarAccess.getSubrange_typeAccess().getFinalConstAssignment_0_2()); 
            // InternalPascal.g:5207:2: ( rule__Subrange_type__FinalConstAssignment_0_2 )
            // InternalPascal.g:5207:3: rule__Subrange_type__FinalConstAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Subrange_type__FinalConstAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getSubrange_typeAccess().getFinalConstAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subrange_type__Group_0__2__Impl"


    // $ANTLR start "rule__Subrange_type__Group_1__0"
    // InternalPascal.g:5216:1: rule__Subrange_type__Group_1__0 : rule__Subrange_type__Group_1__0__Impl rule__Subrange_type__Group_1__1 ;
    public final void rule__Subrange_type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5220:1: ( rule__Subrange_type__Group_1__0__Impl rule__Subrange_type__Group_1__1 )
            // InternalPascal.g:5221:2: rule__Subrange_type__Group_1__0__Impl rule__Subrange_type__Group_1__1
            {
            pushFollow(FOLLOW_35);
            rule__Subrange_type__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subrange_type__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subrange_type__Group_1__0"


    // $ANTLR start "rule__Subrange_type__Group_1__0__Impl"
    // InternalPascal.g:5228:1: rule__Subrange_type__Group_1__0__Impl : ( ( rule__Subrange_type__SubrangeAssignment_1_0 ) ) ;
    public final void rule__Subrange_type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5232:1: ( ( ( rule__Subrange_type__SubrangeAssignment_1_0 ) ) )
            // InternalPascal.g:5233:1: ( ( rule__Subrange_type__SubrangeAssignment_1_0 ) )
            {
            // InternalPascal.g:5233:1: ( ( rule__Subrange_type__SubrangeAssignment_1_0 ) )
            // InternalPascal.g:5234:2: ( rule__Subrange_type__SubrangeAssignment_1_0 )
            {
             before(grammarAccess.getSubrange_typeAccess().getSubrangeAssignment_1_0()); 
            // InternalPascal.g:5235:2: ( rule__Subrange_type__SubrangeAssignment_1_0 )
            // InternalPascal.g:5235:3: rule__Subrange_type__SubrangeAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Subrange_type__SubrangeAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSubrange_typeAccess().getSubrangeAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subrange_type__Group_1__0__Impl"


    // $ANTLR start "rule__Subrange_type__Group_1__1"
    // InternalPascal.g:5243:1: rule__Subrange_type__Group_1__1 : rule__Subrange_type__Group_1__1__Impl ;
    public final void rule__Subrange_type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5247:1: ( rule__Subrange_type__Group_1__1__Impl )
            // InternalPascal.g:5248:2: rule__Subrange_type__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subrange_type__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subrange_type__Group_1__1"


    // $ANTLR start "rule__Subrange_type__Group_1__1__Impl"
    // InternalPascal.g:5254:1: rule__Subrange_type__Group_1__1__Impl : ( ( rule__Subrange_type__ConstAssignment_1_1 ) ) ;
    public final void rule__Subrange_type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5258:1: ( ( ( rule__Subrange_type__ConstAssignment_1_1 ) ) )
            // InternalPascal.g:5259:1: ( ( rule__Subrange_type__ConstAssignment_1_1 ) )
            {
            // InternalPascal.g:5259:1: ( ( rule__Subrange_type__ConstAssignment_1_1 ) )
            // InternalPascal.g:5260:2: ( rule__Subrange_type__ConstAssignment_1_1 )
            {
             before(grammarAccess.getSubrange_typeAccess().getConstAssignment_1_1()); 
            // InternalPascal.g:5261:2: ( rule__Subrange_type__ConstAssignment_1_1 )
            // InternalPascal.g:5261:3: rule__Subrange_type__ConstAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Subrange_type__ConstAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSubrange_typeAccess().getConstAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subrange_type__Group_1__1__Impl"


    // $ANTLR start "rule__Enumerated_type__Group__0"
    // InternalPascal.g:5270:1: rule__Enumerated_type__Group__0 : rule__Enumerated_type__Group__0__Impl rule__Enumerated_type__Group__1 ;
    public final void rule__Enumerated_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5274:1: ( rule__Enumerated_type__Group__0__Impl rule__Enumerated_type__Group__1 )
            // InternalPascal.g:5275:2: rule__Enumerated_type__Group__0__Impl rule__Enumerated_type__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Enumerated_type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumerated_type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerated_type__Group__0"


    // $ANTLR start "rule__Enumerated_type__Group__0__Impl"
    // InternalPascal.g:5282:1: rule__Enumerated_type__Group__0__Impl : ( '(' ) ;
    public final void rule__Enumerated_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5286:1: ( ( '(' ) )
            // InternalPascal.g:5287:1: ( '(' )
            {
            // InternalPascal.g:5287:1: ( '(' )
            // InternalPascal.g:5288:2: '('
            {
             before(grammarAccess.getEnumerated_typeAccess().getLeftParenthesisKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEnumerated_typeAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerated_type__Group__0__Impl"


    // $ANTLR start "rule__Enumerated_type__Group__1"
    // InternalPascal.g:5297:1: rule__Enumerated_type__Group__1 : rule__Enumerated_type__Group__1__Impl rule__Enumerated_type__Group__2 ;
    public final void rule__Enumerated_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5301:1: ( rule__Enumerated_type__Group__1__Impl rule__Enumerated_type__Group__2 )
            // InternalPascal.g:5302:2: rule__Enumerated_type__Group__1__Impl rule__Enumerated_type__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Enumerated_type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumerated_type__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerated_type__Group__1"


    // $ANTLR start "rule__Enumerated_type__Group__1__Impl"
    // InternalPascal.g:5309:1: rule__Enumerated_type__Group__1__Impl : ( ( rule__Enumerated_type__IdentifiersAssignment_1 ) ) ;
    public final void rule__Enumerated_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5313:1: ( ( ( rule__Enumerated_type__IdentifiersAssignment_1 ) ) )
            // InternalPascal.g:5314:1: ( ( rule__Enumerated_type__IdentifiersAssignment_1 ) )
            {
            // InternalPascal.g:5314:1: ( ( rule__Enumerated_type__IdentifiersAssignment_1 ) )
            // InternalPascal.g:5315:2: ( rule__Enumerated_type__IdentifiersAssignment_1 )
            {
             before(grammarAccess.getEnumerated_typeAccess().getIdentifiersAssignment_1()); 
            // InternalPascal.g:5316:2: ( rule__Enumerated_type__IdentifiersAssignment_1 )
            // InternalPascal.g:5316:3: rule__Enumerated_type__IdentifiersAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Enumerated_type__IdentifiersAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerated_typeAccess().getIdentifiersAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerated_type__Group__1__Impl"


    // $ANTLR start "rule__Enumerated_type__Group__2"
    // InternalPascal.g:5324:1: rule__Enumerated_type__Group__2 : rule__Enumerated_type__Group__2__Impl ;
    public final void rule__Enumerated_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5328:1: ( rule__Enumerated_type__Group__2__Impl )
            // InternalPascal.g:5329:2: rule__Enumerated_type__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enumerated_type__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerated_type__Group__2"


    // $ANTLR start "rule__Enumerated_type__Group__2__Impl"
    // InternalPascal.g:5335:1: rule__Enumerated_type__Group__2__Impl : ( ')' ) ;
    public final void rule__Enumerated_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5339:1: ( ( ')' ) )
            // InternalPascal.g:5340:1: ( ')' )
            {
            // InternalPascal.g:5340:1: ( ')' )
            // InternalPascal.g:5341:2: ')'
            {
             before(grammarAccess.getEnumerated_typeAccess().getRightParenthesisKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEnumerated_typeAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerated_type__Group__2__Impl"


    // $ANTLR start "rule__Structured_type__Group__0"
    // InternalPascal.g:5351:1: rule__Structured_type__Group__0 : rule__Structured_type__Group__0__Impl rule__Structured_type__Group__1 ;
    public final void rule__Structured_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5355:1: ( rule__Structured_type__Group__0__Impl rule__Structured_type__Group__1 )
            // InternalPascal.g:5356:2: rule__Structured_type__Group__0__Impl rule__Structured_type__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__Structured_type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Structured_type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structured_type__Group__0"


    // $ANTLR start "rule__Structured_type__Group__0__Impl"
    // InternalPascal.g:5363:1: rule__Structured_type__Group__0__Impl : ( ( rule__Structured_type__PackedAssignment_0 )? ) ;
    public final void rule__Structured_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5367:1: ( ( ( rule__Structured_type__PackedAssignment_0 )? ) )
            // InternalPascal.g:5368:1: ( ( rule__Structured_type__PackedAssignment_0 )? )
            {
            // InternalPascal.g:5368:1: ( ( rule__Structured_type__PackedAssignment_0 )? )
            // InternalPascal.g:5369:2: ( rule__Structured_type__PackedAssignment_0 )?
            {
             before(grammarAccess.getStructured_typeAccess().getPackedAssignment_0()); 
            // InternalPascal.g:5370:2: ( rule__Structured_type__PackedAssignment_0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==50) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalPascal.g:5370:3: rule__Structured_type__PackedAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Structured_type__PackedAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStructured_typeAccess().getPackedAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structured_type__Group__0__Impl"


    // $ANTLR start "rule__Structured_type__Group__1"
    // InternalPascal.g:5378:1: rule__Structured_type__Group__1 : rule__Structured_type__Group__1__Impl ;
    public final void rule__Structured_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5382:1: ( rule__Structured_type__Group__1__Impl )
            // InternalPascal.g:5383:2: rule__Structured_type__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Structured_type__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structured_type__Group__1"


    // $ANTLR start "rule__Structured_type__Group__1__Impl"
    // InternalPascal.g:5389:1: rule__Structured_type__Group__1__Impl : ( ( rule__Structured_type__TypeAssignment_1 ) ) ;
    public final void rule__Structured_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5393:1: ( ( ( rule__Structured_type__TypeAssignment_1 ) ) )
            // InternalPascal.g:5394:1: ( ( rule__Structured_type__TypeAssignment_1 ) )
            {
            // InternalPascal.g:5394:1: ( ( rule__Structured_type__TypeAssignment_1 ) )
            // InternalPascal.g:5395:2: ( rule__Structured_type__TypeAssignment_1 )
            {
             before(grammarAccess.getStructured_typeAccess().getTypeAssignment_1()); 
            // InternalPascal.g:5396:2: ( rule__Structured_type__TypeAssignment_1 )
            // InternalPascal.g:5396:3: rule__Structured_type__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Structured_type__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStructured_typeAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structured_type__Group__1__Impl"


    // $ANTLR start "rule__Array_type__Group__0"
    // InternalPascal.g:5405:1: rule__Array_type__Group__0 : rule__Array_type__Group__0__Impl rule__Array_type__Group__1 ;
    public final void rule__Array_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5409:1: ( rule__Array_type__Group__0__Impl rule__Array_type__Group__1 )
            // InternalPascal.g:5410:2: rule__Array_type__Group__0__Impl rule__Array_type__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__Array_type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Array_type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__0"


    // $ANTLR start "rule__Array_type__Group__0__Impl"
    // InternalPascal.g:5417:1: rule__Array_type__Group__0__Impl : ( 'array' ) ;
    public final void rule__Array_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5421:1: ( ( 'array' ) )
            // InternalPascal.g:5422:1: ( 'array' )
            {
            // InternalPascal.g:5422:1: ( 'array' )
            // InternalPascal.g:5423:2: 'array'
            {
             before(grammarAccess.getArray_typeAccess().getArrayKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getArray_typeAccess().getArrayKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__0__Impl"


    // $ANTLR start "rule__Array_type__Group__1"
    // InternalPascal.g:5432:1: rule__Array_type__Group__1 : rule__Array_type__Group__1__Impl rule__Array_type__Group__2 ;
    public final void rule__Array_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5436:1: ( rule__Array_type__Group__1__Impl rule__Array_type__Group__2 )
            // InternalPascal.g:5437:2: rule__Array_type__Group__1__Impl rule__Array_type__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__Array_type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Array_type__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__1"


    // $ANTLR start "rule__Array_type__Group__1__Impl"
    // InternalPascal.g:5444:1: rule__Array_type__Group__1__Impl : ( '[' ) ;
    public final void rule__Array_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5448:1: ( ( '[' ) )
            // InternalPascal.g:5449:1: ( '[' )
            {
            // InternalPascal.g:5449:1: ( '[' )
            // InternalPascal.g:5450:2: '['
            {
             before(grammarAccess.getArray_typeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getArray_typeAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__1__Impl"


    // $ANTLR start "rule__Array_type__Group__2"
    // InternalPascal.g:5459:1: rule__Array_type__Group__2 : rule__Array_type__Group__2__Impl rule__Array_type__Group__3 ;
    public final void rule__Array_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5463:1: ( rule__Array_type__Group__2__Impl rule__Array_type__Group__3 )
            // InternalPascal.g:5464:2: rule__Array_type__Group__2__Impl rule__Array_type__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__Array_type__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Array_type__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__2"


    // $ANTLR start "rule__Array_type__Group__2__Impl"
    // InternalPascal.g:5471:1: rule__Array_type__Group__2__Impl : ( ( rule__Array_type__IndexesAssignment_2 ) ) ;
    public final void rule__Array_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5475:1: ( ( ( rule__Array_type__IndexesAssignment_2 ) ) )
            // InternalPascal.g:5476:1: ( ( rule__Array_type__IndexesAssignment_2 ) )
            {
            // InternalPascal.g:5476:1: ( ( rule__Array_type__IndexesAssignment_2 ) )
            // InternalPascal.g:5477:2: ( rule__Array_type__IndexesAssignment_2 )
            {
             before(grammarAccess.getArray_typeAccess().getIndexesAssignment_2()); 
            // InternalPascal.g:5478:2: ( rule__Array_type__IndexesAssignment_2 )
            // InternalPascal.g:5478:3: rule__Array_type__IndexesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Array_type__IndexesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getArray_typeAccess().getIndexesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__2__Impl"


    // $ANTLR start "rule__Array_type__Group__3"
    // InternalPascal.g:5486:1: rule__Array_type__Group__3 : rule__Array_type__Group__3__Impl rule__Array_type__Group__4 ;
    public final void rule__Array_type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5490:1: ( rule__Array_type__Group__3__Impl rule__Array_type__Group__4 )
            // InternalPascal.g:5491:2: rule__Array_type__Group__3__Impl rule__Array_type__Group__4
            {
            pushFollow(FOLLOW_41);
            rule__Array_type__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Array_type__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__3"


    // $ANTLR start "rule__Array_type__Group__3__Impl"
    // InternalPascal.g:5498:1: rule__Array_type__Group__3__Impl : ( ( rule__Array_type__Group_3__0 )* ) ;
    public final void rule__Array_type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5502:1: ( ( ( rule__Array_type__Group_3__0 )* ) )
            // InternalPascal.g:5503:1: ( ( rule__Array_type__Group_3__0 )* )
            {
            // InternalPascal.g:5503:1: ( ( rule__Array_type__Group_3__0 )* )
            // InternalPascal.g:5504:2: ( rule__Array_type__Group_3__0 )*
            {
             before(grammarAccess.getArray_typeAccess().getGroup_3()); 
            // InternalPascal.g:5505:2: ( rule__Array_type__Group_3__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==27) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalPascal.g:5505:3: rule__Array_type__Group_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Array_type__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getArray_typeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__3__Impl"


    // $ANTLR start "rule__Array_type__Group__4"
    // InternalPascal.g:5513:1: rule__Array_type__Group__4 : rule__Array_type__Group__4__Impl rule__Array_type__Group__5 ;
    public final void rule__Array_type__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5517:1: ( rule__Array_type__Group__4__Impl rule__Array_type__Group__5 )
            // InternalPascal.g:5518:2: rule__Array_type__Group__4__Impl rule__Array_type__Group__5
            {
            pushFollow(FOLLOW_42);
            rule__Array_type__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Array_type__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__4"


    // $ANTLR start "rule__Array_type__Group__4__Impl"
    // InternalPascal.g:5525:1: rule__Array_type__Group__4__Impl : ( ']' ) ;
    public final void rule__Array_type__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5529:1: ( ( ']' ) )
            // InternalPascal.g:5530:1: ( ']' )
            {
            // InternalPascal.g:5530:1: ( ']' )
            // InternalPascal.g:5531:2: ']'
            {
             before(grammarAccess.getArray_typeAccess().getRightSquareBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getArray_typeAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__4__Impl"


    // $ANTLR start "rule__Array_type__Group__5"
    // InternalPascal.g:5540:1: rule__Array_type__Group__5 : rule__Array_type__Group__5__Impl rule__Array_type__Group__6 ;
    public final void rule__Array_type__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5544:1: ( rule__Array_type__Group__5__Impl rule__Array_type__Group__6 )
            // InternalPascal.g:5545:2: rule__Array_type__Group__5__Impl rule__Array_type__Group__6
            {
            pushFollow(FOLLOW_36);
            rule__Array_type__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Array_type__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__5"


    // $ANTLR start "rule__Array_type__Group__5__Impl"
    // InternalPascal.g:5552:1: rule__Array_type__Group__5__Impl : ( 'of' ) ;
    public final void rule__Array_type__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5556:1: ( ( 'of' ) )
            // InternalPascal.g:5557:1: ( 'of' )
            {
            // InternalPascal.g:5557:1: ( 'of' )
            // InternalPascal.g:5558:2: 'of'
            {
             before(grammarAccess.getArray_typeAccess().getOfKeyword_5()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getArray_typeAccess().getOfKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__5__Impl"


    // $ANTLR start "rule__Array_type__Group__6"
    // InternalPascal.g:5567:1: rule__Array_type__Group__6 : rule__Array_type__Group__6__Impl ;
    public final void rule__Array_type__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5571:1: ( rule__Array_type__Group__6__Impl )
            // InternalPascal.g:5572:2: rule__Array_type__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Array_type__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__6"


    // $ANTLR start "rule__Array_type__Group__6__Impl"
    // InternalPascal.g:5578:1: rule__Array_type__Group__6__Impl : ( ( rule__Array_type__TypeAssignment_6 ) ) ;
    public final void rule__Array_type__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5582:1: ( ( ( rule__Array_type__TypeAssignment_6 ) ) )
            // InternalPascal.g:5583:1: ( ( rule__Array_type__TypeAssignment_6 ) )
            {
            // InternalPascal.g:5583:1: ( ( rule__Array_type__TypeAssignment_6 ) )
            // InternalPascal.g:5584:2: ( rule__Array_type__TypeAssignment_6 )
            {
             before(grammarAccess.getArray_typeAccess().getTypeAssignment_6()); 
            // InternalPascal.g:5585:2: ( rule__Array_type__TypeAssignment_6 )
            // InternalPascal.g:5585:3: rule__Array_type__TypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Array_type__TypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getArray_typeAccess().getTypeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group__6__Impl"


    // $ANTLR start "rule__Array_type__Group_3__0"
    // InternalPascal.g:5594:1: rule__Array_type__Group_3__0 : rule__Array_type__Group_3__0__Impl rule__Array_type__Group_3__1 ;
    public final void rule__Array_type__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5598:1: ( rule__Array_type__Group_3__0__Impl rule__Array_type__Group_3__1 )
            // InternalPascal.g:5599:2: rule__Array_type__Group_3__0__Impl rule__Array_type__Group_3__1
            {
            pushFollow(FOLLOW_40);
            rule__Array_type__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Array_type__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group_3__0"


    // $ANTLR start "rule__Array_type__Group_3__0__Impl"
    // InternalPascal.g:5606:1: rule__Array_type__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Array_type__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5610:1: ( ( ',' ) )
            // InternalPascal.g:5611:1: ( ',' )
            {
            // InternalPascal.g:5611:1: ( ',' )
            // InternalPascal.g:5612:2: ','
            {
             before(grammarAccess.getArray_typeAccess().getCommaKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getArray_typeAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group_3__0__Impl"


    // $ANTLR start "rule__Array_type__Group_3__1"
    // InternalPascal.g:5621:1: rule__Array_type__Group_3__1 : rule__Array_type__Group_3__1__Impl ;
    public final void rule__Array_type__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5625:1: ( rule__Array_type__Group_3__1__Impl )
            // InternalPascal.g:5626:2: rule__Array_type__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Array_type__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group_3__1"


    // $ANTLR start "rule__Array_type__Group_3__1__Impl"
    // InternalPascal.g:5632:1: rule__Array_type__Group_3__1__Impl : ( ( rule__Array_type__IndexesAssignment_3_1 ) ) ;
    public final void rule__Array_type__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5636:1: ( ( ( rule__Array_type__IndexesAssignment_3_1 ) ) )
            // InternalPascal.g:5637:1: ( ( rule__Array_type__IndexesAssignment_3_1 ) )
            {
            // InternalPascal.g:5637:1: ( ( rule__Array_type__IndexesAssignment_3_1 ) )
            // InternalPascal.g:5638:2: ( rule__Array_type__IndexesAssignment_3_1 )
            {
             before(grammarAccess.getArray_typeAccess().getIndexesAssignment_3_1()); 
            // InternalPascal.g:5639:2: ( rule__Array_type__IndexesAssignment_3_1 )
            // InternalPascal.g:5639:3: rule__Array_type__IndexesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Array_type__IndexesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getArray_typeAccess().getIndexesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__Group_3__1__Impl"


    // $ANTLR start "rule__Dynamic_array_type__Group__0"
    // InternalPascal.g:5648:1: rule__Dynamic_array_type__Group__0 : rule__Dynamic_array_type__Group__0__Impl rule__Dynamic_array_type__Group__1 ;
    public final void rule__Dynamic_array_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5652:1: ( rule__Dynamic_array_type__Group__0__Impl rule__Dynamic_array_type__Group__1 )
            // InternalPascal.g:5653:2: rule__Dynamic_array_type__Group__0__Impl rule__Dynamic_array_type__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__Dynamic_array_type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dynamic_array_type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamic_array_type__Group__0"


    // $ANTLR start "rule__Dynamic_array_type__Group__0__Impl"
    // InternalPascal.g:5660:1: rule__Dynamic_array_type__Group__0__Impl : ( 'array' ) ;
    public final void rule__Dynamic_array_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5664:1: ( ( 'array' ) )
            // InternalPascal.g:5665:1: ( 'array' )
            {
            // InternalPascal.g:5665:1: ( 'array' )
            // InternalPascal.g:5666:2: 'array'
            {
             before(grammarAccess.getDynamic_array_typeAccess().getArrayKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getDynamic_array_typeAccess().getArrayKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamic_array_type__Group__0__Impl"


    // $ANTLR start "rule__Dynamic_array_type__Group__1"
    // InternalPascal.g:5675:1: rule__Dynamic_array_type__Group__1 : rule__Dynamic_array_type__Group__1__Impl rule__Dynamic_array_type__Group__2 ;
    public final void rule__Dynamic_array_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5679:1: ( rule__Dynamic_array_type__Group__1__Impl rule__Dynamic_array_type__Group__2 )
            // InternalPascal.g:5680:2: rule__Dynamic_array_type__Group__1__Impl rule__Dynamic_array_type__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__Dynamic_array_type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dynamic_array_type__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamic_array_type__Group__1"


    // $ANTLR start "rule__Dynamic_array_type__Group__1__Impl"
    // InternalPascal.g:5687:1: rule__Dynamic_array_type__Group__1__Impl : ( 'of' ) ;
    public final void rule__Dynamic_array_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5691:1: ( ( 'of' ) )
            // InternalPascal.g:5692:1: ( 'of' )
            {
            // InternalPascal.g:5692:1: ( 'of' )
            // InternalPascal.g:5693:2: 'of'
            {
             before(grammarAccess.getDynamic_array_typeAccess().getOfKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getDynamic_array_typeAccess().getOfKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamic_array_type__Group__1__Impl"


    // $ANTLR start "rule__Dynamic_array_type__Group__2"
    // InternalPascal.g:5702:1: rule__Dynamic_array_type__Group__2 : rule__Dynamic_array_type__Group__2__Impl ;
    public final void rule__Dynamic_array_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5706:1: ( rule__Dynamic_array_type__Group__2__Impl )
            // InternalPascal.g:5707:2: rule__Dynamic_array_type__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dynamic_array_type__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamic_array_type__Group__2"


    // $ANTLR start "rule__Dynamic_array_type__Group__2__Impl"
    // InternalPascal.g:5713:1: rule__Dynamic_array_type__Group__2__Impl : ( ( rule__Dynamic_array_type__TypeAssignment_2 ) ) ;
    public final void rule__Dynamic_array_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5717:1: ( ( ( rule__Dynamic_array_type__TypeAssignment_2 ) ) )
            // InternalPascal.g:5718:1: ( ( rule__Dynamic_array_type__TypeAssignment_2 ) )
            {
            // InternalPascal.g:5718:1: ( ( rule__Dynamic_array_type__TypeAssignment_2 ) )
            // InternalPascal.g:5719:2: ( rule__Dynamic_array_type__TypeAssignment_2 )
            {
             before(grammarAccess.getDynamic_array_typeAccess().getTypeAssignment_2()); 
            // InternalPascal.g:5720:2: ( rule__Dynamic_array_type__TypeAssignment_2 )
            // InternalPascal.g:5720:3: rule__Dynamic_array_type__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Dynamic_array_type__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDynamic_array_typeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamic_array_type__Group__2__Impl"


    // $ANTLR start "rule__Variable_identifier_list__Group__0"
    // InternalPascal.g:5729:1: rule__Variable_identifier_list__Group__0 : rule__Variable_identifier_list__Group__0__Impl rule__Variable_identifier_list__Group__1 ;
    public final void rule__Variable_identifier_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5733:1: ( rule__Variable_identifier_list__Group__0__Impl rule__Variable_identifier_list__Group__1 )
            // InternalPascal.g:5734:2: rule__Variable_identifier_list__Group__0__Impl rule__Variable_identifier_list__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Variable_identifier_list__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable_identifier_list__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_identifier_list__Group__0"


    // $ANTLR start "rule__Variable_identifier_list__Group__0__Impl"
    // InternalPascal.g:5741:1: rule__Variable_identifier_list__Group__0__Impl : ( ( rule__Variable_identifier_list__NamesAssignment_0 ) ) ;
    public final void rule__Variable_identifier_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5745:1: ( ( ( rule__Variable_identifier_list__NamesAssignment_0 ) ) )
            // InternalPascal.g:5746:1: ( ( rule__Variable_identifier_list__NamesAssignment_0 ) )
            {
            // InternalPascal.g:5746:1: ( ( rule__Variable_identifier_list__NamesAssignment_0 ) )
            // InternalPascal.g:5747:2: ( rule__Variable_identifier_list__NamesAssignment_0 )
            {
             before(grammarAccess.getVariable_identifier_listAccess().getNamesAssignment_0()); 
            // InternalPascal.g:5748:2: ( rule__Variable_identifier_list__NamesAssignment_0 )
            // InternalPascal.g:5748:3: rule__Variable_identifier_list__NamesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Variable_identifier_list__NamesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariable_identifier_listAccess().getNamesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_identifier_list__Group__0__Impl"


    // $ANTLR start "rule__Variable_identifier_list__Group__1"
    // InternalPascal.g:5756:1: rule__Variable_identifier_list__Group__1 : rule__Variable_identifier_list__Group__1__Impl ;
    public final void rule__Variable_identifier_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5760:1: ( rule__Variable_identifier_list__Group__1__Impl )
            // InternalPascal.g:5761:2: rule__Variable_identifier_list__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable_identifier_list__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_identifier_list__Group__1"


    // $ANTLR start "rule__Variable_identifier_list__Group__1__Impl"
    // InternalPascal.g:5767:1: rule__Variable_identifier_list__Group__1__Impl : ( ( rule__Variable_identifier_list__Group_1__0 )* ) ;
    public final void rule__Variable_identifier_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5771:1: ( ( ( rule__Variable_identifier_list__Group_1__0 )* ) )
            // InternalPascal.g:5772:1: ( ( rule__Variable_identifier_list__Group_1__0 )* )
            {
            // InternalPascal.g:5772:1: ( ( rule__Variable_identifier_list__Group_1__0 )* )
            // InternalPascal.g:5773:2: ( rule__Variable_identifier_list__Group_1__0 )*
            {
             before(grammarAccess.getVariable_identifier_listAccess().getGroup_1()); 
            // InternalPascal.g:5774:2: ( rule__Variable_identifier_list__Group_1__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==27) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalPascal.g:5774:3: rule__Variable_identifier_list__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Variable_identifier_list__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getVariable_identifier_listAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_identifier_list__Group__1__Impl"


    // $ANTLR start "rule__Variable_identifier_list__Group_1__0"
    // InternalPascal.g:5783:1: rule__Variable_identifier_list__Group_1__0 : rule__Variable_identifier_list__Group_1__0__Impl rule__Variable_identifier_list__Group_1__1 ;
    public final void rule__Variable_identifier_list__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5787:1: ( rule__Variable_identifier_list__Group_1__0__Impl rule__Variable_identifier_list__Group_1__1 )
            // InternalPascal.g:5788:2: rule__Variable_identifier_list__Group_1__0__Impl rule__Variable_identifier_list__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Variable_identifier_list__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable_identifier_list__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_identifier_list__Group_1__0"


    // $ANTLR start "rule__Variable_identifier_list__Group_1__0__Impl"
    // InternalPascal.g:5795:1: rule__Variable_identifier_list__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Variable_identifier_list__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5799:1: ( ( ',' ) )
            // InternalPascal.g:5800:1: ( ',' )
            {
            // InternalPascal.g:5800:1: ( ',' )
            // InternalPascal.g:5801:2: ','
            {
             before(grammarAccess.getVariable_identifier_listAccess().getCommaKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getVariable_identifier_listAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_identifier_list__Group_1__0__Impl"


    // $ANTLR start "rule__Variable_identifier_list__Group_1__1"
    // InternalPascal.g:5810:1: rule__Variable_identifier_list__Group_1__1 : rule__Variable_identifier_list__Group_1__1__Impl ;
    public final void rule__Variable_identifier_list__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5814:1: ( rule__Variable_identifier_list__Group_1__1__Impl )
            // InternalPascal.g:5815:2: rule__Variable_identifier_list__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable_identifier_list__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_identifier_list__Group_1__1"


    // $ANTLR start "rule__Variable_identifier_list__Group_1__1__Impl"
    // InternalPascal.g:5821:1: rule__Variable_identifier_list__Group_1__1__Impl : ( ( rule__Variable_identifier_list__NamesAssignment_1_1 ) ) ;
    public final void rule__Variable_identifier_list__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5825:1: ( ( ( rule__Variable_identifier_list__NamesAssignment_1_1 ) ) )
            // InternalPascal.g:5826:1: ( ( rule__Variable_identifier_list__NamesAssignment_1_1 ) )
            {
            // InternalPascal.g:5826:1: ( ( rule__Variable_identifier_list__NamesAssignment_1_1 ) )
            // InternalPascal.g:5827:2: ( rule__Variable_identifier_list__NamesAssignment_1_1 )
            {
             before(grammarAccess.getVariable_identifier_listAccess().getNamesAssignment_1_1()); 
            // InternalPascal.g:5828:2: ( rule__Variable_identifier_list__NamesAssignment_1_1 )
            // InternalPascal.g:5828:3: rule__Variable_identifier_list__NamesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable_identifier_list__NamesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVariable_identifier_listAccess().getNamesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_identifier_list__Group_1__1__Impl"


    // $ANTLR start "rule__Variable_section__Group__0"
    // InternalPascal.g:5837:1: rule__Variable_section__Group__0 : rule__Variable_section__Group__0__Impl rule__Variable_section__Group__1 ;
    public final void rule__Variable_section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5841:1: ( rule__Variable_section__Group__0__Impl rule__Variable_section__Group__1 )
            // InternalPascal.g:5842:2: rule__Variable_section__Group__0__Impl rule__Variable_section__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Variable_section__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable_section__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_section__Group__0"


    // $ANTLR start "rule__Variable_section__Group__0__Impl"
    // InternalPascal.g:5849:1: rule__Variable_section__Group__0__Impl : ( ( rule__Variable_section__IdentifiersAssignment_0 ) ) ;
    public final void rule__Variable_section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5853:1: ( ( ( rule__Variable_section__IdentifiersAssignment_0 ) ) )
            // InternalPascal.g:5854:1: ( ( rule__Variable_section__IdentifiersAssignment_0 ) )
            {
            // InternalPascal.g:5854:1: ( ( rule__Variable_section__IdentifiersAssignment_0 ) )
            // InternalPascal.g:5855:2: ( rule__Variable_section__IdentifiersAssignment_0 )
            {
             before(grammarAccess.getVariable_sectionAccess().getIdentifiersAssignment_0()); 
            // InternalPascal.g:5856:2: ( rule__Variable_section__IdentifiersAssignment_0 )
            // InternalPascal.g:5856:3: rule__Variable_section__IdentifiersAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Variable_section__IdentifiersAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariable_sectionAccess().getIdentifiersAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_section__Group__0__Impl"


    // $ANTLR start "rule__Variable_section__Group__1"
    // InternalPascal.g:5864:1: rule__Variable_section__Group__1 : rule__Variable_section__Group__1__Impl rule__Variable_section__Group__2 ;
    public final void rule__Variable_section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5868:1: ( rule__Variable_section__Group__1__Impl rule__Variable_section__Group__2 )
            // InternalPascal.g:5869:2: rule__Variable_section__Group__1__Impl rule__Variable_section__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__Variable_section__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable_section__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_section__Group__1"


    // $ANTLR start "rule__Variable_section__Group__1__Impl"
    // InternalPascal.g:5876:1: rule__Variable_section__Group__1__Impl : ( ':' ) ;
    public final void rule__Variable_section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5880:1: ( ( ':' ) )
            // InternalPascal.g:5881:1: ( ':' )
            {
            // InternalPascal.g:5881:1: ( ':' )
            // InternalPascal.g:5882:2: ':'
            {
             before(grammarAccess.getVariable_sectionAccess().getColonKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getVariable_sectionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_section__Group__1__Impl"


    // $ANTLR start "rule__Variable_section__Group__2"
    // InternalPascal.g:5891:1: rule__Variable_section__Group__2 : rule__Variable_section__Group__2__Impl ;
    public final void rule__Variable_section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5895:1: ( rule__Variable_section__Group__2__Impl )
            // InternalPascal.g:5896:2: rule__Variable_section__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable_section__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_section__Group__2"


    // $ANTLR start "rule__Variable_section__Group__2__Impl"
    // InternalPascal.g:5902:1: rule__Variable_section__Group__2__Impl : ( ( rule__Variable_section__TypeAssignment_2 ) ) ;
    public final void rule__Variable_section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5906:1: ( ( ( rule__Variable_section__TypeAssignment_2 ) ) )
            // InternalPascal.g:5907:1: ( ( rule__Variable_section__TypeAssignment_2 ) )
            {
            // InternalPascal.g:5907:1: ( ( rule__Variable_section__TypeAssignment_2 ) )
            // InternalPascal.g:5908:2: ( rule__Variable_section__TypeAssignment_2 )
            {
             before(grammarAccess.getVariable_sectionAccess().getTypeAssignment_2()); 
            // InternalPascal.g:5909:2: ( rule__Variable_section__TypeAssignment_2 )
            // InternalPascal.g:5909:3: rule__Variable_section__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Variable_section__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariable_sectionAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_section__Group__2__Impl"


    // $ANTLR start "rule__Set_type__Group__0"
    // InternalPascal.g:5918:1: rule__Set_type__Group__0 : rule__Set_type__Group__0__Impl rule__Set_type__Group__1 ;
    public final void rule__Set_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5922:1: ( rule__Set_type__Group__0__Impl rule__Set_type__Group__1 )
            // InternalPascal.g:5923:2: rule__Set_type__Group__0__Impl rule__Set_type__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__Set_type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set_type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set_type__Group__0"


    // $ANTLR start "rule__Set_type__Group__0__Impl"
    // InternalPascal.g:5930:1: rule__Set_type__Group__0__Impl : ( 'set' ) ;
    public final void rule__Set_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5934:1: ( ( 'set' ) )
            // InternalPascal.g:5935:1: ( 'set' )
            {
            // InternalPascal.g:5935:1: ( 'set' )
            // InternalPascal.g:5936:2: 'set'
            {
             before(grammarAccess.getSet_typeAccess().getSetKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSet_typeAccess().getSetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set_type__Group__0__Impl"


    // $ANTLR start "rule__Set_type__Group__1"
    // InternalPascal.g:5945:1: rule__Set_type__Group__1 : rule__Set_type__Group__1__Impl rule__Set_type__Group__2 ;
    public final void rule__Set_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5949:1: ( rule__Set_type__Group__1__Impl rule__Set_type__Group__2 )
            // InternalPascal.g:5950:2: rule__Set_type__Group__1__Impl rule__Set_type__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__Set_type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set_type__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set_type__Group__1"


    // $ANTLR start "rule__Set_type__Group__1__Impl"
    // InternalPascal.g:5957:1: rule__Set_type__Group__1__Impl : ( 'of' ) ;
    public final void rule__Set_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5961:1: ( ( 'of' ) )
            // InternalPascal.g:5962:1: ( 'of' )
            {
            // InternalPascal.g:5962:1: ( 'of' )
            // InternalPascal.g:5963:2: 'of'
            {
             before(grammarAccess.getSet_typeAccess().getOfKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSet_typeAccess().getOfKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set_type__Group__1__Impl"


    // $ANTLR start "rule__Set_type__Group__2"
    // InternalPascal.g:5972:1: rule__Set_type__Group__2 : rule__Set_type__Group__2__Impl ;
    public final void rule__Set_type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5976:1: ( rule__Set_type__Group__2__Impl )
            // InternalPascal.g:5977:2: rule__Set_type__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Set_type__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set_type__Group__2"


    // $ANTLR start "rule__Set_type__Group__2__Impl"
    // InternalPascal.g:5983:1: rule__Set_type__Group__2__Impl : ( ( rule__Set_type__TypeAssignment_2 ) ) ;
    public final void rule__Set_type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:5987:1: ( ( ( rule__Set_type__TypeAssignment_2 ) ) )
            // InternalPascal.g:5988:1: ( ( rule__Set_type__TypeAssignment_2 ) )
            {
            // InternalPascal.g:5988:1: ( ( rule__Set_type__TypeAssignment_2 ) )
            // InternalPascal.g:5989:2: ( rule__Set_type__TypeAssignment_2 )
            {
             before(grammarAccess.getSet_typeAccess().getTypeAssignment_2()); 
            // InternalPascal.g:5990:2: ( rule__Set_type__TypeAssignment_2 )
            // InternalPascal.g:5990:3: rule__Set_type__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Set_type__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSet_typeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set_type__Group__2__Impl"


    // $ANTLR start "rule__Pointer_type__Group__0"
    // InternalPascal.g:5999:1: rule__Pointer_type__Group__0 : rule__Pointer_type__Group__0__Impl rule__Pointer_type__Group__1 ;
    public final void rule__Pointer_type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6003:1: ( rule__Pointer_type__Group__0__Impl rule__Pointer_type__Group__1 )
            // InternalPascal.g:6004:2: rule__Pointer_type__Group__0__Impl rule__Pointer_type__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__Pointer_type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pointer_type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointer_type__Group__0"


    // $ANTLR start "rule__Pointer_type__Group__0__Impl"
    // InternalPascal.g:6011:1: rule__Pointer_type__Group__0__Impl : ( '^' ) ;
    public final void rule__Pointer_type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6015:1: ( ( '^' ) )
            // InternalPascal.g:6016:1: ( '^' )
            {
            // InternalPascal.g:6016:1: ( '^' )
            // InternalPascal.g:6017:2: '^'
            {
             before(grammarAccess.getPointer_typeAccess().getCircumflexAccentKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPointer_typeAccess().getCircumflexAccentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointer_type__Group__0__Impl"


    // $ANTLR start "rule__Pointer_type__Group__1"
    // InternalPascal.g:6026:1: rule__Pointer_type__Group__1 : rule__Pointer_type__Group__1__Impl ;
    public final void rule__Pointer_type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6030:1: ( rule__Pointer_type__Group__1__Impl )
            // InternalPascal.g:6031:2: rule__Pointer_type__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pointer_type__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointer_type__Group__1"


    // $ANTLR start "rule__Pointer_type__Group__1__Impl"
    // InternalPascal.g:6037:1: rule__Pointer_type__Group__1__Impl : ( ( rule__Pointer_type__TypeAssignment_1 ) ) ;
    public final void rule__Pointer_type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6041:1: ( ( ( rule__Pointer_type__TypeAssignment_1 ) ) )
            // InternalPascal.g:6042:1: ( ( rule__Pointer_type__TypeAssignment_1 ) )
            {
            // InternalPascal.g:6042:1: ( ( rule__Pointer_type__TypeAssignment_1 ) )
            // InternalPascal.g:6043:2: ( rule__Pointer_type__TypeAssignment_1 )
            {
             before(grammarAccess.getPointer_typeAccess().getTypeAssignment_1()); 
            // InternalPascal.g:6044:2: ( rule__Pointer_type__TypeAssignment_1 )
            // InternalPascal.g:6044:3: rule__Pointer_type__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Pointer_type__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPointer_typeAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointer_type__Group__1__Impl"


    // $ANTLR start "rule__Variable_declaration_part__Group__0"
    // InternalPascal.g:6053:1: rule__Variable_declaration_part__Group__0 : rule__Variable_declaration_part__Group__0__Impl rule__Variable_declaration_part__Group__1 ;
    public final void rule__Variable_declaration_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6057:1: ( rule__Variable_declaration_part__Group__0__Impl rule__Variable_declaration_part__Group__1 )
            // InternalPascal.g:6058:2: rule__Variable_declaration_part__Group__0__Impl rule__Variable_declaration_part__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Variable_declaration_part__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable_declaration_part__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__Group__0"


    // $ANTLR start "rule__Variable_declaration_part__Group__0__Impl"
    // InternalPascal.g:6065:1: rule__Variable_declaration_part__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variable_declaration_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6069:1: ( ( 'var' ) )
            // InternalPascal.g:6070:1: ( 'var' )
            {
            // InternalPascal.g:6070:1: ( 'var' )
            // InternalPascal.g:6071:2: 'var'
            {
             before(grammarAccess.getVariable_declaration_partAccess().getVarKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getVariable_declaration_partAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__Group__0__Impl"


    // $ANTLR start "rule__Variable_declaration_part__Group__1"
    // InternalPascal.g:6080:1: rule__Variable_declaration_part__Group__1 : rule__Variable_declaration_part__Group__1__Impl rule__Variable_declaration_part__Group__2 ;
    public final void rule__Variable_declaration_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6084:1: ( rule__Variable_declaration_part__Group__1__Impl rule__Variable_declaration_part__Group__2 )
            // InternalPascal.g:6085:2: rule__Variable_declaration_part__Group__1__Impl rule__Variable_declaration_part__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Variable_declaration_part__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable_declaration_part__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__Group__1"


    // $ANTLR start "rule__Variable_declaration_part__Group__1__Impl"
    // InternalPascal.g:6092:1: rule__Variable_declaration_part__Group__1__Impl : ( ( rule__Variable_declaration_part__SectionsAssignment_1 ) ) ;
    public final void rule__Variable_declaration_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6096:1: ( ( ( rule__Variable_declaration_part__SectionsAssignment_1 ) ) )
            // InternalPascal.g:6097:1: ( ( rule__Variable_declaration_part__SectionsAssignment_1 ) )
            {
            // InternalPascal.g:6097:1: ( ( rule__Variable_declaration_part__SectionsAssignment_1 ) )
            // InternalPascal.g:6098:2: ( rule__Variable_declaration_part__SectionsAssignment_1 )
            {
             before(grammarAccess.getVariable_declaration_partAccess().getSectionsAssignment_1()); 
            // InternalPascal.g:6099:2: ( rule__Variable_declaration_part__SectionsAssignment_1 )
            // InternalPascal.g:6099:3: rule__Variable_declaration_part__SectionsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable_declaration_part__SectionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariable_declaration_partAccess().getSectionsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__Group__1__Impl"


    // $ANTLR start "rule__Variable_declaration_part__Group__2"
    // InternalPascal.g:6107:1: rule__Variable_declaration_part__Group__2 : rule__Variable_declaration_part__Group__2__Impl rule__Variable_declaration_part__Group__3 ;
    public final void rule__Variable_declaration_part__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6111:1: ( rule__Variable_declaration_part__Group__2__Impl rule__Variable_declaration_part__Group__3 )
            // InternalPascal.g:6112:2: rule__Variable_declaration_part__Group__2__Impl rule__Variable_declaration_part__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Variable_declaration_part__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable_declaration_part__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__Group__2"


    // $ANTLR start "rule__Variable_declaration_part__Group__2__Impl"
    // InternalPascal.g:6119:1: rule__Variable_declaration_part__Group__2__Impl : ( ';' ) ;
    public final void rule__Variable_declaration_part__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6123:1: ( ( ';' ) )
            // InternalPascal.g:6124:1: ( ';' )
            {
            // InternalPascal.g:6124:1: ( ';' )
            // InternalPascal.g:6125:2: ';'
            {
             before(grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__Group__2__Impl"


    // $ANTLR start "rule__Variable_declaration_part__Group__3"
    // InternalPascal.g:6134:1: rule__Variable_declaration_part__Group__3 : rule__Variable_declaration_part__Group__3__Impl ;
    public final void rule__Variable_declaration_part__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6138:1: ( rule__Variable_declaration_part__Group__3__Impl )
            // InternalPascal.g:6139:2: rule__Variable_declaration_part__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable_declaration_part__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__Group__3"


    // $ANTLR start "rule__Variable_declaration_part__Group__3__Impl"
    // InternalPascal.g:6145:1: rule__Variable_declaration_part__Group__3__Impl : ( ( rule__Variable_declaration_part__Group_3__0 )* ) ;
    public final void rule__Variable_declaration_part__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6149:1: ( ( ( rule__Variable_declaration_part__Group_3__0 )* ) )
            // InternalPascal.g:6150:1: ( ( rule__Variable_declaration_part__Group_3__0 )* )
            {
            // InternalPascal.g:6150:1: ( ( rule__Variable_declaration_part__Group_3__0 )* )
            // InternalPascal.g:6151:2: ( rule__Variable_declaration_part__Group_3__0 )*
            {
             before(grammarAccess.getVariable_declaration_partAccess().getGroup_3()); 
            // InternalPascal.g:6152:2: ( rule__Variable_declaration_part__Group_3__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_ID) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalPascal.g:6152:3: rule__Variable_declaration_part__Group_3__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Variable_declaration_part__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getVariable_declaration_partAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__Group__3__Impl"


    // $ANTLR start "rule__Variable_declaration_part__Group_3__0"
    // InternalPascal.g:6161:1: rule__Variable_declaration_part__Group_3__0 : rule__Variable_declaration_part__Group_3__0__Impl rule__Variable_declaration_part__Group_3__1 ;
    public final void rule__Variable_declaration_part__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6165:1: ( rule__Variable_declaration_part__Group_3__0__Impl rule__Variable_declaration_part__Group_3__1 )
            // InternalPascal.g:6166:2: rule__Variable_declaration_part__Group_3__0__Impl rule__Variable_declaration_part__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Variable_declaration_part__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable_declaration_part__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__Group_3__0"


    // $ANTLR start "rule__Variable_declaration_part__Group_3__0__Impl"
    // InternalPascal.g:6173:1: rule__Variable_declaration_part__Group_3__0__Impl : ( ( rule__Variable_declaration_part__SectionsAssignment_3_0 ) ) ;
    public final void rule__Variable_declaration_part__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6177:1: ( ( ( rule__Variable_declaration_part__SectionsAssignment_3_0 ) ) )
            // InternalPascal.g:6178:1: ( ( rule__Variable_declaration_part__SectionsAssignment_3_0 ) )
            {
            // InternalPascal.g:6178:1: ( ( rule__Variable_declaration_part__SectionsAssignment_3_0 ) )
            // InternalPascal.g:6179:2: ( rule__Variable_declaration_part__SectionsAssignment_3_0 )
            {
             before(grammarAccess.getVariable_declaration_partAccess().getSectionsAssignment_3_0()); 
            // InternalPascal.g:6180:2: ( rule__Variable_declaration_part__SectionsAssignment_3_0 )
            // InternalPascal.g:6180:3: rule__Variable_declaration_part__SectionsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Variable_declaration_part__SectionsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getVariable_declaration_partAccess().getSectionsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__Group_3__0__Impl"


    // $ANTLR start "rule__Variable_declaration_part__Group_3__1"
    // InternalPascal.g:6188:1: rule__Variable_declaration_part__Group_3__1 : rule__Variable_declaration_part__Group_3__1__Impl ;
    public final void rule__Variable_declaration_part__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6192:1: ( rule__Variable_declaration_part__Group_3__1__Impl )
            // InternalPascal.g:6193:2: rule__Variable_declaration_part__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable_declaration_part__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__Group_3__1"


    // $ANTLR start "rule__Variable_declaration_part__Group_3__1__Impl"
    // InternalPascal.g:6199:1: rule__Variable_declaration_part__Group_3__1__Impl : ( ';' ) ;
    public final void rule__Variable_declaration_part__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6203:1: ( ( ';' ) )
            // InternalPascal.g:6204:1: ( ';' )
            {
            // InternalPascal.g:6204:1: ( ';' )
            // InternalPascal.g:6205:2: ';'
            {
             before(grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_3_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getVariable_declaration_partAccess().getSemicolonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__Group_3__1__Impl"


    // $ANTLR start "rule__Procedure_and_function_declaration_part__Group__0"
    // InternalPascal.g:6215:1: rule__Procedure_and_function_declaration_part__Group__0 : rule__Procedure_and_function_declaration_part__Group__0__Impl rule__Procedure_and_function_declaration_part__Group__1 ;
    public final void rule__Procedure_and_function_declaration_part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6219:1: ( rule__Procedure_and_function_declaration_part__Group__0__Impl rule__Procedure_and_function_declaration_part__Group__1 )
            // InternalPascal.g:6220:2: rule__Procedure_and_function_declaration_part__Group__0__Impl rule__Procedure_and_function_declaration_part__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Procedure_and_function_declaration_part__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure_and_function_declaration_part__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_and_function_declaration_part__Group__0"


    // $ANTLR start "rule__Procedure_and_function_declaration_part__Group__0__Impl"
    // InternalPascal.g:6227:1: rule__Procedure_and_function_declaration_part__Group__0__Impl : ( ( rule__Procedure_and_function_declaration_part__Alternatives_0 ) ) ;
    public final void rule__Procedure_and_function_declaration_part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6231:1: ( ( ( rule__Procedure_and_function_declaration_part__Alternatives_0 ) ) )
            // InternalPascal.g:6232:1: ( ( rule__Procedure_and_function_declaration_part__Alternatives_0 ) )
            {
            // InternalPascal.g:6232:1: ( ( rule__Procedure_and_function_declaration_part__Alternatives_0 ) )
            // InternalPascal.g:6233:2: ( rule__Procedure_and_function_declaration_part__Alternatives_0 )
            {
             before(grammarAccess.getProcedure_and_function_declaration_partAccess().getAlternatives_0()); 
            // InternalPascal.g:6234:2: ( rule__Procedure_and_function_declaration_part__Alternatives_0 )
            // InternalPascal.g:6234:3: rule__Procedure_and_function_declaration_part__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_and_function_declaration_part__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getProcedure_and_function_declaration_partAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_and_function_declaration_part__Group__0__Impl"


    // $ANTLR start "rule__Procedure_and_function_declaration_part__Group__1"
    // InternalPascal.g:6242:1: rule__Procedure_and_function_declaration_part__Group__1 : rule__Procedure_and_function_declaration_part__Group__1__Impl ;
    public final void rule__Procedure_and_function_declaration_part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6246:1: ( rule__Procedure_and_function_declaration_part__Group__1__Impl )
            // InternalPascal.g:6247:2: rule__Procedure_and_function_declaration_part__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_and_function_declaration_part__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_and_function_declaration_part__Group__1"


    // $ANTLR start "rule__Procedure_and_function_declaration_part__Group__1__Impl"
    // InternalPascal.g:6253:1: rule__Procedure_and_function_declaration_part__Group__1__Impl : ( ';' ) ;
    public final void rule__Procedure_and_function_declaration_part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6257:1: ( ( ';' ) )
            // InternalPascal.g:6258:1: ( ';' )
            {
            // InternalPascal.g:6258:1: ( ';' )
            // InternalPascal.g:6259:2: ';'
            {
             before(grammarAccess.getProcedure_and_function_declaration_partAccess().getSemicolonKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getProcedure_and_function_declaration_partAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_and_function_declaration_part__Group__1__Impl"


    // $ANTLR start "rule__Procedure_declaration__Group__0"
    // InternalPascal.g:6269:1: rule__Procedure_declaration__Group__0 : rule__Procedure_declaration__Group__0__Impl rule__Procedure_declaration__Group__1 ;
    public final void rule__Procedure_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6273:1: ( rule__Procedure_declaration__Group__0__Impl rule__Procedure_declaration__Group__1 )
            // InternalPascal.g:6274:2: rule__Procedure_declaration__Group__0__Impl rule__Procedure_declaration__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Procedure_declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure_declaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_declaration__Group__0"


    // $ANTLR start "rule__Procedure_declaration__Group__0__Impl"
    // InternalPascal.g:6281:1: rule__Procedure_declaration__Group__0__Impl : ( ( rule__Procedure_declaration__HeadingAssignment_0 ) ) ;
    public final void rule__Procedure_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6285:1: ( ( ( rule__Procedure_declaration__HeadingAssignment_0 ) ) )
            // InternalPascal.g:6286:1: ( ( rule__Procedure_declaration__HeadingAssignment_0 ) )
            {
            // InternalPascal.g:6286:1: ( ( rule__Procedure_declaration__HeadingAssignment_0 ) )
            // InternalPascal.g:6287:2: ( rule__Procedure_declaration__HeadingAssignment_0 )
            {
             before(grammarAccess.getProcedure_declarationAccess().getHeadingAssignment_0()); 
            // InternalPascal.g:6288:2: ( rule__Procedure_declaration__HeadingAssignment_0 )
            // InternalPascal.g:6288:3: rule__Procedure_declaration__HeadingAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_declaration__HeadingAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProcedure_declarationAccess().getHeadingAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_declaration__Group__0__Impl"


    // $ANTLR start "rule__Procedure_declaration__Group__1"
    // InternalPascal.g:6296:1: rule__Procedure_declaration__Group__1 : rule__Procedure_declaration__Group__1__Impl rule__Procedure_declaration__Group__2 ;
    public final void rule__Procedure_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6300:1: ( rule__Procedure_declaration__Group__1__Impl rule__Procedure_declaration__Group__2 )
            // InternalPascal.g:6301:2: rule__Procedure_declaration__Group__1__Impl rule__Procedure_declaration__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__Procedure_declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure_declaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_declaration__Group__1"


    // $ANTLR start "rule__Procedure_declaration__Group__1__Impl"
    // InternalPascal.g:6308:1: rule__Procedure_declaration__Group__1__Impl : ( ';' ) ;
    public final void rule__Procedure_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6312:1: ( ( ';' ) )
            // InternalPascal.g:6313:1: ( ';' )
            {
            // InternalPascal.g:6313:1: ( ';' )
            // InternalPascal.g:6314:2: ';'
            {
             before(grammarAccess.getProcedure_declarationAccess().getSemicolonKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getProcedure_declarationAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_declaration__Group__1__Impl"


    // $ANTLR start "rule__Procedure_declaration__Group__2"
    // InternalPascal.g:6323:1: rule__Procedure_declaration__Group__2 : rule__Procedure_declaration__Group__2__Impl ;
    public final void rule__Procedure_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6327:1: ( rule__Procedure_declaration__Group__2__Impl )
            // InternalPascal.g:6328:2: rule__Procedure_declaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_declaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_declaration__Group__2"


    // $ANTLR start "rule__Procedure_declaration__Group__2__Impl"
    // InternalPascal.g:6334:1: rule__Procedure_declaration__Group__2__Impl : ( ( rule__Procedure_declaration__Alternatives_2 ) ) ;
    public final void rule__Procedure_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6338:1: ( ( ( rule__Procedure_declaration__Alternatives_2 ) ) )
            // InternalPascal.g:6339:1: ( ( rule__Procedure_declaration__Alternatives_2 ) )
            {
            // InternalPascal.g:6339:1: ( ( rule__Procedure_declaration__Alternatives_2 ) )
            // InternalPascal.g:6340:2: ( rule__Procedure_declaration__Alternatives_2 )
            {
             before(grammarAccess.getProcedure_declarationAccess().getAlternatives_2()); 
            // InternalPascal.g:6341:2: ( rule__Procedure_declaration__Alternatives_2 )
            // InternalPascal.g:6341:3: rule__Procedure_declaration__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_declaration__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getProcedure_declarationAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_declaration__Group__2__Impl"


    // $ANTLR start "rule__Procedure_heading__Group__0"
    // InternalPascal.g:6350:1: rule__Procedure_heading__Group__0 : rule__Procedure_heading__Group__0__Impl rule__Procedure_heading__Group__1 ;
    public final void rule__Procedure_heading__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6354:1: ( rule__Procedure_heading__Group__0__Impl rule__Procedure_heading__Group__1 )
            // InternalPascal.g:6355:2: rule__Procedure_heading__Group__0__Impl rule__Procedure_heading__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Procedure_heading__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure_heading__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_heading__Group__0"


    // $ANTLR start "rule__Procedure_heading__Group__0__Impl"
    // InternalPascal.g:6362:1: rule__Procedure_heading__Group__0__Impl : ( 'procedure' ) ;
    public final void rule__Procedure_heading__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6366:1: ( ( 'procedure' ) )
            // InternalPascal.g:6367:1: ( 'procedure' )
            {
            // InternalPascal.g:6367:1: ( 'procedure' )
            // InternalPascal.g:6368:2: 'procedure'
            {
             before(grammarAccess.getProcedure_headingAccess().getProcedureKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getProcedure_headingAccess().getProcedureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_heading__Group__0__Impl"


    // $ANTLR start "rule__Procedure_heading__Group__1"
    // InternalPascal.g:6377:1: rule__Procedure_heading__Group__1 : rule__Procedure_heading__Group__1__Impl rule__Procedure_heading__Group__2 ;
    public final void rule__Procedure_heading__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6381:1: ( rule__Procedure_heading__Group__1__Impl rule__Procedure_heading__Group__2 )
            // InternalPascal.g:6382:2: rule__Procedure_heading__Group__1__Impl rule__Procedure_heading__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Procedure_heading__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure_heading__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_heading__Group__1"


    // $ANTLR start "rule__Procedure_heading__Group__1__Impl"
    // InternalPascal.g:6389:1: rule__Procedure_heading__Group__1__Impl : ( ( rule__Procedure_heading__NameAssignment_1 ) ) ;
    public final void rule__Procedure_heading__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6393:1: ( ( ( rule__Procedure_heading__NameAssignment_1 ) ) )
            // InternalPascal.g:6394:1: ( ( rule__Procedure_heading__NameAssignment_1 ) )
            {
            // InternalPascal.g:6394:1: ( ( rule__Procedure_heading__NameAssignment_1 ) )
            // InternalPascal.g:6395:2: ( rule__Procedure_heading__NameAssignment_1 )
            {
             before(grammarAccess.getProcedure_headingAccess().getNameAssignment_1()); 
            // InternalPascal.g:6396:2: ( rule__Procedure_heading__NameAssignment_1 )
            // InternalPascal.g:6396:3: rule__Procedure_heading__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_heading__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProcedure_headingAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_heading__Group__1__Impl"


    // $ANTLR start "rule__Procedure_heading__Group__2"
    // InternalPascal.g:6404:1: rule__Procedure_heading__Group__2 : rule__Procedure_heading__Group__2__Impl ;
    public final void rule__Procedure_heading__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6408:1: ( rule__Procedure_heading__Group__2__Impl )
            // InternalPascal.g:6409:2: rule__Procedure_heading__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Procedure_heading__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_heading__Group__2"


    // $ANTLR start "rule__Procedure_heading__Group__2__Impl"
    // InternalPascal.g:6415:1: rule__Procedure_heading__Group__2__Impl : ( ( rule__Procedure_heading__ParametersAssignment_2 )? ) ;
    public final void rule__Procedure_heading__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6419:1: ( ( ( rule__Procedure_heading__ParametersAssignment_2 )? ) )
            // InternalPascal.g:6420:1: ( ( rule__Procedure_heading__ParametersAssignment_2 )? )
            {
            // InternalPascal.g:6420:1: ( ( rule__Procedure_heading__ParametersAssignment_2 )? )
            // InternalPascal.g:6421:2: ( rule__Procedure_heading__ParametersAssignment_2 )?
            {
             before(grammarAccess.getProcedure_headingAccess().getParametersAssignment_2()); 
            // InternalPascal.g:6422:2: ( rule__Procedure_heading__ParametersAssignment_2 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==25) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalPascal.g:6422:3: rule__Procedure_heading__ParametersAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Procedure_heading__ParametersAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcedure_headingAccess().getParametersAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_heading__Group__2__Impl"


    // $ANTLR start "rule__Formal_parameter_list__Group__0"
    // InternalPascal.g:6431:1: rule__Formal_parameter_list__Group__0 : rule__Formal_parameter_list__Group__0__Impl rule__Formal_parameter_list__Group__1 ;
    public final void rule__Formal_parameter_list__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6435:1: ( rule__Formal_parameter_list__Group__0__Impl rule__Formal_parameter_list__Group__1 )
            // InternalPascal.g:6436:2: rule__Formal_parameter_list__Group__0__Impl rule__Formal_parameter_list__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__Formal_parameter_list__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formal_parameter_list__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_list__Group__0"


    // $ANTLR start "rule__Formal_parameter_list__Group__0__Impl"
    // InternalPascal.g:6443:1: rule__Formal_parameter_list__Group__0__Impl : ( '(' ) ;
    public final void rule__Formal_parameter_list__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6447:1: ( ( '(' ) )
            // InternalPascal.g:6448:1: ( '(' )
            {
            // InternalPascal.g:6448:1: ( '(' )
            // InternalPascal.g:6449:2: '('
            {
             before(grammarAccess.getFormal_parameter_listAccess().getLeftParenthesisKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFormal_parameter_listAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_list__Group__0__Impl"


    // $ANTLR start "rule__Formal_parameter_list__Group__1"
    // InternalPascal.g:6458:1: rule__Formal_parameter_list__Group__1 : rule__Formal_parameter_list__Group__1__Impl rule__Formal_parameter_list__Group__2 ;
    public final void rule__Formal_parameter_list__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6462:1: ( rule__Formal_parameter_list__Group__1__Impl rule__Formal_parameter_list__Group__2 )
            // InternalPascal.g:6463:2: rule__Formal_parameter_list__Group__1__Impl rule__Formal_parameter_list__Group__2
            {
            pushFollow(FOLLOW_45);
            rule__Formal_parameter_list__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formal_parameter_list__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_list__Group__1"


    // $ANTLR start "rule__Formal_parameter_list__Group__1__Impl"
    // InternalPascal.g:6470:1: rule__Formal_parameter_list__Group__1__Impl : ( ( rule__Formal_parameter_list__ParametersAssignment_1 ) ) ;
    public final void rule__Formal_parameter_list__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6474:1: ( ( ( rule__Formal_parameter_list__ParametersAssignment_1 ) ) )
            // InternalPascal.g:6475:1: ( ( rule__Formal_parameter_list__ParametersAssignment_1 ) )
            {
            // InternalPascal.g:6475:1: ( ( rule__Formal_parameter_list__ParametersAssignment_1 ) )
            // InternalPascal.g:6476:2: ( rule__Formal_parameter_list__ParametersAssignment_1 )
            {
             before(grammarAccess.getFormal_parameter_listAccess().getParametersAssignment_1()); 
            // InternalPascal.g:6477:2: ( rule__Formal_parameter_list__ParametersAssignment_1 )
            // InternalPascal.g:6477:3: rule__Formal_parameter_list__ParametersAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Formal_parameter_list__ParametersAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFormal_parameter_listAccess().getParametersAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_list__Group__1__Impl"


    // $ANTLR start "rule__Formal_parameter_list__Group__2"
    // InternalPascal.g:6485:1: rule__Formal_parameter_list__Group__2 : rule__Formal_parameter_list__Group__2__Impl rule__Formal_parameter_list__Group__3 ;
    public final void rule__Formal_parameter_list__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6489:1: ( rule__Formal_parameter_list__Group__2__Impl rule__Formal_parameter_list__Group__3 )
            // InternalPascal.g:6490:2: rule__Formal_parameter_list__Group__2__Impl rule__Formal_parameter_list__Group__3
            {
            pushFollow(FOLLOW_45);
            rule__Formal_parameter_list__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formal_parameter_list__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_list__Group__2"


    // $ANTLR start "rule__Formal_parameter_list__Group__2__Impl"
    // InternalPascal.g:6497:1: rule__Formal_parameter_list__Group__2__Impl : ( ( rule__Formal_parameter_list__Group_2__0 )* ) ;
    public final void rule__Formal_parameter_list__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6501:1: ( ( ( rule__Formal_parameter_list__Group_2__0 )* ) )
            // InternalPascal.g:6502:1: ( ( rule__Formal_parameter_list__Group_2__0 )* )
            {
            // InternalPascal.g:6502:1: ( ( rule__Formal_parameter_list__Group_2__0 )* )
            // InternalPascal.g:6503:2: ( rule__Formal_parameter_list__Group_2__0 )*
            {
             before(grammarAccess.getFormal_parameter_listAccess().getGroup_2()); 
            // InternalPascal.g:6504:2: ( rule__Formal_parameter_list__Group_2__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==24) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalPascal.g:6504:3: rule__Formal_parameter_list__Group_2__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Formal_parameter_list__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             after(grammarAccess.getFormal_parameter_listAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_list__Group__2__Impl"


    // $ANTLR start "rule__Formal_parameter_list__Group__3"
    // InternalPascal.g:6512:1: rule__Formal_parameter_list__Group__3 : rule__Formal_parameter_list__Group__3__Impl ;
    public final void rule__Formal_parameter_list__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6516:1: ( rule__Formal_parameter_list__Group__3__Impl )
            // InternalPascal.g:6517:2: rule__Formal_parameter_list__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formal_parameter_list__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_list__Group__3"


    // $ANTLR start "rule__Formal_parameter_list__Group__3__Impl"
    // InternalPascal.g:6523:1: rule__Formal_parameter_list__Group__3__Impl : ( ')' ) ;
    public final void rule__Formal_parameter_list__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6527:1: ( ( ')' ) )
            // InternalPascal.g:6528:1: ( ')' )
            {
            // InternalPascal.g:6528:1: ( ')' )
            // InternalPascal.g:6529:2: ')'
            {
             before(grammarAccess.getFormal_parameter_listAccess().getRightParenthesisKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFormal_parameter_listAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_list__Group__3__Impl"


    // $ANTLR start "rule__Formal_parameter_list__Group_2__0"
    // InternalPascal.g:6539:1: rule__Formal_parameter_list__Group_2__0 : rule__Formal_parameter_list__Group_2__0__Impl rule__Formal_parameter_list__Group_2__1 ;
    public final void rule__Formal_parameter_list__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6543:1: ( rule__Formal_parameter_list__Group_2__0__Impl rule__Formal_parameter_list__Group_2__1 )
            // InternalPascal.g:6544:2: rule__Formal_parameter_list__Group_2__0__Impl rule__Formal_parameter_list__Group_2__1
            {
            pushFollow(FOLLOW_44);
            rule__Formal_parameter_list__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formal_parameter_list__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_list__Group_2__0"


    // $ANTLR start "rule__Formal_parameter_list__Group_2__0__Impl"
    // InternalPascal.g:6551:1: rule__Formal_parameter_list__Group_2__0__Impl : ( ';' ) ;
    public final void rule__Formal_parameter_list__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6555:1: ( ( ';' ) )
            // InternalPascal.g:6556:1: ( ';' )
            {
            // InternalPascal.g:6556:1: ( ';' )
            // InternalPascal.g:6557:2: ';'
            {
             before(grammarAccess.getFormal_parameter_listAccess().getSemicolonKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFormal_parameter_listAccess().getSemicolonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_list__Group_2__0__Impl"


    // $ANTLR start "rule__Formal_parameter_list__Group_2__1"
    // InternalPascal.g:6566:1: rule__Formal_parameter_list__Group_2__1 : rule__Formal_parameter_list__Group_2__1__Impl ;
    public final void rule__Formal_parameter_list__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6570:1: ( rule__Formal_parameter_list__Group_2__1__Impl )
            // InternalPascal.g:6571:2: rule__Formal_parameter_list__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formal_parameter_list__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_list__Group_2__1"


    // $ANTLR start "rule__Formal_parameter_list__Group_2__1__Impl"
    // InternalPascal.g:6577:1: rule__Formal_parameter_list__Group_2__1__Impl : ( ( rule__Formal_parameter_list__ParametersAssignment_2_1 ) ) ;
    public final void rule__Formal_parameter_list__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6581:1: ( ( ( rule__Formal_parameter_list__ParametersAssignment_2_1 ) ) )
            // InternalPascal.g:6582:1: ( ( rule__Formal_parameter_list__ParametersAssignment_2_1 ) )
            {
            // InternalPascal.g:6582:1: ( ( rule__Formal_parameter_list__ParametersAssignment_2_1 ) )
            // InternalPascal.g:6583:2: ( rule__Formal_parameter_list__ParametersAssignment_2_1 )
            {
             before(grammarAccess.getFormal_parameter_listAccess().getParametersAssignment_2_1()); 
            // InternalPascal.g:6584:2: ( rule__Formal_parameter_list__ParametersAssignment_2_1 )
            // InternalPascal.g:6584:3: rule__Formal_parameter_list__ParametersAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Formal_parameter_list__ParametersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFormal_parameter_listAccess().getParametersAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_list__Group_2__1__Impl"


    // $ANTLR start "rule__Value_parameter_section__Group__0"
    // InternalPascal.g:6593:1: rule__Value_parameter_section__Group__0 : rule__Value_parameter_section__Group__0__Impl rule__Value_parameter_section__Group__1 ;
    public final void rule__Value_parameter_section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6597:1: ( rule__Value_parameter_section__Group__0__Impl rule__Value_parameter_section__Group__1 )
            // InternalPascal.g:6598:2: rule__Value_parameter_section__Group__0__Impl rule__Value_parameter_section__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Value_parameter_section__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value_parameter_section__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value_parameter_section__Group__0"


    // $ANTLR start "rule__Value_parameter_section__Group__0__Impl"
    // InternalPascal.g:6605:1: rule__Value_parameter_section__Group__0__Impl : ( ( rule__Value_parameter_section__IdentifiersAssignment_0 ) ) ;
    public final void rule__Value_parameter_section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6609:1: ( ( ( rule__Value_parameter_section__IdentifiersAssignment_0 ) ) )
            // InternalPascal.g:6610:1: ( ( rule__Value_parameter_section__IdentifiersAssignment_0 ) )
            {
            // InternalPascal.g:6610:1: ( ( rule__Value_parameter_section__IdentifiersAssignment_0 ) )
            // InternalPascal.g:6611:2: ( rule__Value_parameter_section__IdentifiersAssignment_0 )
            {
             before(grammarAccess.getValue_parameter_sectionAccess().getIdentifiersAssignment_0()); 
            // InternalPascal.g:6612:2: ( rule__Value_parameter_section__IdentifiersAssignment_0 )
            // InternalPascal.g:6612:3: rule__Value_parameter_section__IdentifiersAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Value_parameter_section__IdentifiersAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getValue_parameter_sectionAccess().getIdentifiersAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value_parameter_section__Group__0__Impl"


    // $ANTLR start "rule__Value_parameter_section__Group__1"
    // InternalPascal.g:6620:1: rule__Value_parameter_section__Group__1 : rule__Value_parameter_section__Group__1__Impl rule__Value_parameter_section__Group__2 ;
    public final void rule__Value_parameter_section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6624:1: ( rule__Value_parameter_section__Group__1__Impl rule__Value_parameter_section__Group__2 )
            // InternalPascal.g:6625:2: rule__Value_parameter_section__Group__1__Impl rule__Value_parameter_section__Group__2
            {
            pushFollow(FOLLOW_46);
            rule__Value_parameter_section__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value_parameter_section__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value_parameter_section__Group__1"


    // $ANTLR start "rule__Value_parameter_section__Group__1__Impl"
    // InternalPascal.g:6632:1: rule__Value_parameter_section__Group__1__Impl : ( ':' ) ;
    public final void rule__Value_parameter_section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6636:1: ( ( ':' ) )
            // InternalPascal.g:6637:1: ( ':' )
            {
            // InternalPascal.g:6637:1: ( ':' )
            // InternalPascal.g:6638:2: ':'
            {
             before(grammarAccess.getValue_parameter_sectionAccess().getColonKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getValue_parameter_sectionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value_parameter_section__Group__1__Impl"


    // $ANTLR start "rule__Value_parameter_section__Group__2"
    // InternalPascal.g:6647:1: rule__Value_parameter_section__Group__2 : rule__Value_parameter_section__Group__2__Impl ;
    public final void rule__Value_parameter_section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6651:1: ( rule__Value_parameter_section__Group__2__Impl )
            // InternalPascal.g:6652:2: rule__Value_parameter_section__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value_parameter_section__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value_parameter_section__Group__2"


    // $ANTLR start "rule__Value_parameter_section__Group__2__Impl"
    // InternalPascal.g:6658:1: rule__Value_parameter_section__Group__2__Impl : ( ( rule__Value_parameter_section__TypeAssignment_2 ) ) ;
    public final void rule__Value_parameter_section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6662:1: ( ( ( rule__Value_parameter_section__TypeAssignment_2 ) ) )
            // InternalPascal.g:6663:1: ( ( rule__Value_parameter_section__TypeAssignment_2 ) )
            {
            // InternalPascal.g:6663:1: ( ( rule__Value_parameter_section__TypeAssignment_2 ) )
            // InternalPascal.g:6664:2: ( rule__Value_parameter_section__TypeAssignment_2 )
            {
             before(grammarAccess.getValue_parameter_sectionAccess().getTypeAssignment_2()); 
            // InternalPascal.g:6665:2: ( rule__Value_parameter_section__TypeAssignment_2 )
            // InternalPascal.g:6665:3: rule__Value_parameter_section__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Value_parameter_section__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getValue_parameter_sectionAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value_parameter_section__Group__2__Impl"


    // $ANTLR start "rule__Packed_conformant_array_schema__Group__0"
    // InternalPascal.g:6674:1: rule__Packed_conformant_array_schema__Group__0 : rule__Packed_conformant_array_schema__Group__0__Impl rule__Packed_conformant_array_schema__Group__1 ;
    public final void rule__Packed_conformant_array_schema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6678:1: ( rule__Packed_conformant_array_schema__Group__0__Impl rule__Packed_conformant_array_schema__Group__1 )
            // InternalPascal.g:6679:2: rule__Packed_conformant_array_schema__Group__0__Impl rule__Packed_conformant_array_schema__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__Packed_conformant_array_schema__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Packed_conformant_array_schema__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Packed_conformant_array_schema__Group__0"


    // $ANTLR start "rule__Packed_conformant_array_schema__Group__0__Impl"
    // InternalPascal.g:6686:1: rule__Packed_conformant_array_schema__Group__0__Impl : ( 'packed' ) ;
    public final void rule__Packed_conformant_array_schema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6690:1: ( ( 'packed' ) )
            // InternalPascal.g:6691:1: ( 'packed' )
            {
            // InternalPascal.g:6691:1: ( 'packed' )
            // InternalPascal.g:6692:2: 'packed'
            {
             before(grammarAccess.getPacked_conformant_array_schemaAccess().getPackedKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getPacked_conformant_array_schemaAccess().getPackedKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Packed_conformant_array_schema__Group__0__Impl"


    // $ANTLR start "rule__Packed_conformant_array_schema__Group__1"
    // InternalPascal.g:6701:1: rule__Packed_conformant_array_schema__Group__1 : rule__Packed_conformant_array_schema__Group__1__Impl rule__Packed_conformant_array_schema__Group__2 ;
    public final void rule__Packed_conformant_array_schema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6705:1: ( rule__Packed_conformant_array_schema__Group__1__Impl rule__Packed_conformant_array_schema__Group__2 )
            // InternalPascal.g:6706:2: rule__Packed_conformant_array_schema__Group__1__Impl rule__Packed_conformant_array_schema__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__Packed_conformant_array_schema__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Packed_conformant_array_schema__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Packed_conformant_array_schema__Group__1"


    // $ANTLR start "rule__Packed_conformant_array_schema__Group__1__Impl"
    // InternalPascal.g:6713:1: rule__Packed_conformant_array_schema__Group__1__Impl : ( 'array' ) ;
    public final void rule__Packed_conformant_array_schema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6717:1: ( ( 'array' ) )
            // InternalPascal.g:6718:1: ( 'array' )
            {
            // InternalPascal.g:6718:1: ( 'array' )
            // InternalPascal.g:6719:2: 'array'
            {
             before(grammarAccess.getPacked_conformant_array_schemaAccess().getArrayKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getPacked_conformant_array_schemaAccess().getArrayKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Packed_conformant_array_schema__Group__1__Impl"


    // $ANTLR start "rule__Packed_conformant_array_schema__Group__2"
    // InternalPascal.g:6728:1: rule__Packed_conformant_array_schema__Group__2 : rule__Packed_conformant_array_schema__Group__2__Impl rule__Packed_conformant_array_schema__Group__3 ;
    public final void rule__Packed_conformant_array_schema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6732:1: ( rule__Packed_conformant_array_schema__Group__2__Impl rule__Packed_conformant_array_schema__Group__3 )
            // InternalPascal.g:6733:2: rule__Packed_conformant_array_schema__Group__2__Impl rule__Packed_conformant_array_schema__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Packed_conformant_array_schema__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Packed_conformant_array_schema__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Packed_conformant_array_schema__Group__2"


    // $ANTLR start "rule__Packed_conformant_array_schema__Group__2__Impl"
    // InternalPascal.g:6740:1: rule__Packed_conformant_array_schema__Group__2__Impl : ( '[' ) ;
    public final void rule__Packed_conformant_array_schema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6744:1: ( ( '[' ) )
            // InternalPascal.g:6745:1: ( '[' )
            {
            // InternalPascal.g:6745:1: ( '[' )
            // InternalPascal.g:6746:2: '['
            {
             before(grammarAccess.getPacked_conformant_array_schemaAccess().getLeftSquareBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPacked_conformant_array_schemaAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Packed_conformant_array_schema__Group__2__Impl"


    // $ANTLR start "rule__Packed_conformant_array_schema__Group__3"
    // InternalPascal.g:6755:1: rule__Packed_conformant_array_schema__Group__3 : rule__Packed_conformant_array_schema__Group__3__Impl rule__Packed_conformant_array_schema__Group__4 ;
    public final void rule__Packed_conformant_array_schema__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6759:1: ( rule__Packed_conformant_array_schema__Group__3__Impl rule__Packed_conformant_array_schema__Group__4 )
            // InternalPascal.g:6760:2: rule__Packed_conformant_array_schema__Group__3__Impl rule__Packed_conformant_array_schema__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Packed_conformant_array_schema__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Packed_conformant_array_schema__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Packed_conformant_array_schema__Group__3"


    // $ANTLR start "rule__Packed_conformant_array_schema__Group__3__Impl"
    // InternalPascal.g:6767:1: rule__Packed_conformant_array_schema__Group__3__Impl : ( ( rule__Packed_conformant_array_schema__BoundAssignment_3 ) ) ;
    public final void rule__Packed_conformant_array_schema__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6771:1: ( ( ( rule__Packed_conformant_array_schema__BoundAssignment_3 ) ) )
            // InternalPascal.g:6772:1: ( ( rule__Packed_conformant_array_schema__BoundAssignment_3 ) )
            {
            // InternalPascal.g:6772:1: ( ( rule__Packed_conformant_array_schema__BoundAssignment_3 ) )
            // InternalPascal.g:6773:2: ( rule__Packed_conformant_array_schema__BoundAssignment_3 )
            {
             before(grammarAccess.getPacked_conformant_array_schemaAccess().getBoundAssignment_3()); 
            // InternalPascal.g:6774:2: ( rule__Packed_conformant_array_schema__BoundAssignment_3 )
            // InternalPascal.g:6774:3: rule__Packed_conformant_array_schema__BoundAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Packed_conformant_array_schema__BoundAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPacked_conformant_array_schemaAccess().getBoundAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Packed_conformant_array_schema__Group__3__Impl"


    // $ANTLR start "rule__Packed_conformant_array_schema__Group__4"
    // InternalPascal.g:6782:1: rule__Packed_conformant_array_schema__Group__4 : rule__Packed_conformant_array_schema__Group__4__Impl rule__Packed_conformant_array_schema__Group__5 ;
    public final void rule__Packed_conformant_array_schema__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6786:1: ( rule__Packed_conformant_array_schema__Group__4__Impl rule__Packed_conformant_array_schema__Group__5 )
            // InternalPascal.g:6787:2: rule__Packed_conformant_array_schema__Group__4__Impl rule__Packed_conformant_array_schema__Group__5
            {
            pushFollow(FOLLOW_42);
            rule__Packed_conformant_array_schema__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Packed_conformant_array_schema__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Packed_conformant_array_schema__Group__4"


    // $ANTLR start "rule__Packed_conformant_array_schema__Group__4__Impl"
    // InternalPascal.g:6794:1: rule__Packed_conformant_array_schema__Group__4__Impl : ( ']' ) ;
    public final void rule__Packed_conformant_array_schema__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6798:1: ( ( ']' ) )
            // InternalPascal.g:6799:1: ( ']' )
            {
            // InternalPascal.g:6799:1: ( ']' )
            // InternalPascal.g:6800:2: ']'
            {
             before(grammarAccess.getPacked_conformant_array_schemaAccess().getRightSquareBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPacked_conformant_array_schemaAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Packed_conformant_array_schema__Group__4__Impl"


    // $ANTLR start "rule__Packed_conformant_array_schema__Group__5"
    // InternalPascal.g:6809:1: rule__Packed_conformant_array_schema__Group__5 : rule__Packed_conformant_array_schema__Group__5__Impl rule__Packed_conformant_array_schema__Group__6 ;
    public final void rule__Packed_conformant_array_schema__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6813:1: ( rule__Packed_conformant_array_schema__Group__5__Impl rule__Packed_conformant_array_schema__Group__6 )
            // InternalPascal.g:6814:2: rule__Packed_conformant_array_schema__Group__5__Impl rule__Packed_conformant_array_schema__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Packed_conformant_array_schema__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Packed_conformant_array_schema__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Packed_conformant_array_schema__Group__5"


    // $ANTLR start "rule__Packed_conformant_array_schema__Group__5__Impl"
    // InternalPascal.g:6821:1: rule__Packed_conformant_array_schema__Group__5__Impl : ( 'of' ) ;
    public final void rule__Packed_conformant_array_schema__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6825:1: ( ( 'of' ) )
            // InternalPascal.g:6826:1: ( 'of' )
            {
            // InternalPascal.g:6826:1: ( 'of' )
            // InternalPascal.g:6827:2: 'of'
            {
             before(grammarAccess.getPacked_conformant_array_schemaAccess().getOfKeyword_5()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getPacked_conformant_array_schemaAccess().getOfKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Packed_conformant_array_schema__Group__5__Impl"


    // $ANTLR start "rule__Packed_conformant_array_schema__Group__6"
    // InternalPascal.g:6836:1: rule__Packed_conformant_array_schema__Group__6 : rule__Packed_conformant_array_schema__Group__6__Impl ;
    public final void rule__Packed_conformant_array_schema__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6840:1: ( rule__Packed_conformant_array_schema__Group__6__Impl )
            // InternalPascal.g:6841:2: rule__Packed_conformant_array_schema__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Packed_conformant_array_schema__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Packed_conformant_array_schema__Group__6"


    // $ANTLR start "rule__Packed_conformant_array_schema__Group__6__Impl"
    // InternalPascal.g:6847:1: rule__Packed_conformant_array_schema__Group__6__Impl : ( ( rule__Packed_conformant_array_schema__NameAssignment_6 ) ) ;
    public final void rule__Packed_conformant_array_schema__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6851:1: ( ( ( rule__Packed_conformant_array_schema__NameAssignment_6 ) ) )
            // InternalPascal.g:6852:1: ( ( rule__Packed_conformant_array_schema__NameAssignment_6 ) )
            {
            // InternalPascal.g:6852:1: ( ( rule__Packed_conformant_array_schema__NameAssignment_6 ) )
            // InternalPascal.g:6853:2: ( rule__Packed_conformant_array_schema__NameAssignment_6 )
            {
             before(grammarAccess.getPacked_conformant_array_schemaAccess().getNameAssignment_6()); 
            // InternalPascal.g:6854:2: ( rule__Packed_conformant_array_schema__NameAssignment_6 )
            // InternalPascal.g:6854:3: rule__Packed_conformant_array_schema__NameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Packed_conformant_array_schema__NameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPacked_conformant_array_schemaAccess().getNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Packed_conformant_array_schema__Group__6__Impl"


    // $ANTLR start "rule__Bound_specification__Group__0"
    // InternalPascal.g:6863:1: rule__Bound_specification__Group__0 : rule__Bound_specification__Group__0__Impl rule__Bound_specification__Group__1 ;
    public final void rule__Bound_specification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6867:1: ( rule__Bound_specification__Group__0__Impl rule__Bound_specification__Group__1 )
            // InternalPascal.g:6868:2: rule__Bound_specification__Group__0__Impl rule__Bound_specification__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__Bound_specification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bound_specification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_specification__Group__0"


    // $ANTLR start "rule__Bound_specification__Group__0__Impl"
    // InternalPascal.g:6875:1: rule__Bound_specification__Group__0__Impl : ( ( rule__Bound_specification__InitialAssignment_0 ) ) ;
    public final void rule__Bound_specification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6879:1: ( ( ( rule__Bound_specification__InitialAssignment_0 ) ) )
            // InternalPascal.g:6880:1: ( ( rule__Bound_specification__InitialAssignment_0 ) )
            {
            // InternalPascal.g:6880:1: ( ( rule__Bound_specification__InitialAssignment_0 ) )
            // InternalPascal.g:6881:2: ( rule__Bound_specification__InitialAssignment_0 )
            {
             before(grammarAccess.getBound_specificationAccess().getInitialAssignment_0()); 
            // InternalPascal.g:6882:2: ( rule__Bound_specification__InitialAssignment_0 )
            // InternalPascal.g:6882:3: rule__Bound_specification__InitialAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Bound_specification__InitialAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBound_specificationAccess().getInitialAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_specification__Group__0__Impl"


    // $ANTLR start "rule__Bound_specification__Group__1"
    // InternalPascal.g:6890:1: rule__Bound_specification__Group__1 : rule__Bound_specification__Group__1__Impl rule__Bound_specification__Group__2 ;
    public final void rule__Bound_specification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6894:1: ( rule__Bound_specification__Group__1__Impl rule__Bound_specification__Group__2 )
            // InternalPascal.g:6895:2: rule__Bound_specification__Group__1__Impl rule__Bound_specification__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Bound_specification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bound_specification__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_specification__Group__1"


    // $ANTLR start "rule__Bound_specification__Group__1__Impl"
    // InternalPascal.g:6902:1: rule__Bound_specification__Group__1__Impl : ( '..' ) ;
    public final void rule__Bound_specification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6906:1: ( ( '..' ) )
            // InternalPascal.g:6907:1: ( '..' )
            {
            // InternalPascal.g:6907:1: ( '..' )
            // InternalPascal.g:6908:2: '..'
            {
             before(grammarAccess.getBound_specificationAccess().getFullStopFullStopKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getBound_specificationAccess().getFullStopFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_specification__Group__1__Impl"


    // $ANTLR start "rule__Bound_specification__Group__2"
    // InternalPascal.g:6917:1: rule__Bound_specification__Group__2 : rule__Bound_specification__Group__2__Impl rule__Bound_specification__Group__3 ;
    public final void rule__Bound_specification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6921:1: ( rule__Bound_specification__Group__2__Impl rule__Bound_specification__Group__3 )
            // InternalPascal.g:6922:2: rule__Bound_specification__Group__2__Impl rule__Bound_specification__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Bound_specification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bound_specification__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_specification__Group__2"


    // $ANTLR start "rule__Bound_specification__Group__2__Impl"
    // InternalPascal.g:6929:1: rule__Bound_specification__Group__2__Impl : ( ( rule__Bound_specification__FinalAssignment_2 ) ) ;
    public final void rule__Bound_specification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6933:1: ( ( ( rule__Bound_specification__FinalAssignment_2 ) ) )
            // InternalPascal.g:6934:1: ( ( rule__Bound_specification__FinalAssignment_2 ) )
            {
            // InternalPascal.g:6934:1: ( ( rule__Bound_specification__FinalAssignment_2 ) )
            // InternalPascal.g:6935:2: ( rule__Bound_specification__FinalAssignment_2 )
            {
             before(grammarAccess.getBound_specificationAccess().getFinalAssignment_2()); 
            // InternalPascal.g:6936:2: ( rule__Bound_specification__FinalAssignment_2 )
            // InternalPascal.g:6936:3: rule__Bound_specification__FinalAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Bound_specification__FinalAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBound_specificationAccess().getFinalAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_specification__Group__2__Impl"


    // $ANTLR start "rule__Bound_specification__Group__3"
    // InternalPascal.g:6944:1: rule__Bound_specification__Group__3 : rule__Bound_specification__Group__3__Impl rule__Bound_specification__Group__4 ;
    public final void rule__Bound_specification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6948:1: ( rule__Bound_specification__Group__3__Impl rule__Bound_specification__Group__4 )
            // InternalPascal.g:6949:2: rule__Bound_specification__Group__3__Impl rule__Bound_specification__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Bound_specification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bound_specification__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_specification__Group__3"


    // $ANTLR start "rule__Bound_specification__Group__3__Impl"
    // InternalPascal.g:6956:1: rule__Bound_specification__Group__3__Impl : ( ':' ) ;
    public final void rule__Bound_specification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6960:1: ( ( ':' ) )
            // InternalPascal.g:6961:1: ( ':' )
            {
            // InternalPascal.g:6961:1: ( ':' )
            // InternalPascal.g:6962:2: ':'
            {
             before(grammarAccess.getBound_specificationAccess().getColonKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getBound_specificationAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_specification__Group__3__Impl"


    // $ANTLR start "rule__Bound_specification__Group__4"
    // InternalPascal.g:6971:1: rule__Bound_specification__Group__4 : rule__Bound_specification__Group__4__Impl ;
    public final void rule__Bound_specification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6975:1: ( rule__Bound_specification__Group__4__Impl )
            // InternalPascal.g:6976:2: rule__Bound_specification__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bound_specification__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_specification__Group__4"


    // $ANTLR start "rule__Bound_specification__Group__4__Impl"
    // InternalPascal.g:6982:1: rule__Bound_specification__Group__4__Impl : ( ( rule__Bound_specification__NameAssignment_4 ) ) ;
    public final void rule__Bound_specification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:6986:1: ( ( ( rule__Bound_specification__NameAssignment_4 ) ) )
            // InternalPascal.g:6987:1: ( ( rule__Bound_specification__NameAssignment_4 ) )
            {
            // InternalPascal.g:6987:1: ( ( rule__Bound_specification__NameAssignment_4 ) )
            // InternalPascal.g:6988:2: ( rule__Bound_specification__NameAssignment_4 )
            {
             before(grammarAccess.getBound_specificationAccess().getNameAssignment_4()); 
            // InternalPascal.g:6989:2: ( rule__Bound_specification__NameAssignment_4 )
            // InternalPascal.g:6989:3: rule__Bound_specification__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Bound_specification__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBound_specificationAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_specification__Group__4__Impl"


    // $ANTLR start "rule__Unpacked_conformant_array_schema__Group__0"
    // InternalPascal.g:6998:1: rule__Unpacked_conformant_array_schema__Group__0 : rule__Unpacked_conformant_array_schema__Group__0__Impl rule__Unpacked_conformant_array_schema__Group__1 ;
    public final void rule__Unpacked_conformant_array_schema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7002:1: ( rule__Unpacked_conformant_array_schema__Group__0__Impl rule__Unpacked_conformant_array_schema__Group__1 )
            // InternalPascal.g:7003:2: rule__Unpacked_conformant_array_schema__Group__0__Impl rule__Unpacked_conformant_array_schema__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__Unpacked_conformant_array_schema__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Unpacked_conformant_array_schema__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unpacked_conformant_array_schema__Group__0"


    // $ANTLR start "rule__Unpacked_conformant_array_schema__Group__0__Impl"
    // InternalPascal.g:7010:1: rule__Unpacked_conformant_array_schema__Group__0__Impl : ( 'array' ) ;
    public final void rule__Unpacked_conformant_array_schema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7014:1: ( ( 'array' ) )
            // InternalPascal.g:7015:1: ( 'array' )
            {
            // InternalPascal.g:7015:1: ( 'array' )
            // InternalPascal.g:7016:2: 'array'
            {
             before(grammarAccess.getUnpacked_conformant_array_schemaAccess().getArrayKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getUnpacked_conformant_array_schemaAccess().getArrayKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unpacked_conformant_array_schema__Group__0__Impl"


    // $ANTLR start "rule__Unpacked_conformant_array_schema__Group__1"
    // InternalPascal.g:7025:1: rule__Unpacked_conformant_array_schema__Group__1 : rule__Unpacked_conformant_array_schema__Group__1__Impl rule__Unpacked_conformant_array_schema__Group__2 ;
    public final void rule__Unpacked_conformant_array_schema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7029:1: ( rule__Unpacked_conformant_array_schema__Group__1__Impl rule__Unpacked_conformant_array_schema__Group__2 )
            // InternalPascal.g:7030:2: rule__Unpacked_conformant_array_schema__Group__1__Impl rule__Unpacked_conformant_array_schema__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Unpacked_conformant_array_schema__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Unpacked_conformant_array_schema__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unpacked_conformant_array_schema__Group__1"


    // $ANTLR start "rule__Unpacked_conformant_array_schema__Group__1__Impl"
    // InternalPascal.g:7037:1: rule__Unpacked_conformant_array_schema__Group__1__Impl : ( '[' ) ;
    public final void rule__Unpacked_conformant_array_schema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7041:1: ( ( '[' ) )
            // InternalPascal.g:7042:1: ( '[' )
            {
            // InternalPascal.g:7042:1: ( '[' )
            // InternalPascal.g:7043:2: '['
            {
             before(grammarAccess.getUnpacked_conformant_array_schemaAccess().getLeftSquareBracketKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getUnpacked_conformant_array_schemaAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unpacked_conformant_array_schema__Group__1__Impl"


    // $ANTLR start "rule__Unpacked_conformant_array_schema__Group__2"
    // InternalPascal.g:7052:1: rule__Unpacked_conformant_array_schema__Group__2 : rule__Unpacked_conformant_array_schema__Group__2__Impl rule__Unpacked_conformant_array_schema__Group__3 ;
    public final void rule__Unpacked_conformant_array_schema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7056:1: ( rule__Unpacked_conformant_array_schema__Group__2__Impl rule__Unpacked_conformant_array_schema__Group__3 )
            // InternalPascal.g:7057:2: rule__Unpacked_conformant_array_schema__Group__2__Impl rule__Unpacked_conformant_array_schema__Group__3
            {
            pushFollow(FOLLOW_48);
            rule__Unpacked_conformant_array_schema__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Unpacked_conformant_array_schema__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unpacked_conformant_array_schema__Group__2"


    // $ANTLR start "rule__Unpacked_conformant_array_schema__Group__2__Impl"
    // InternalPascal.g:7064:1: rule__Unpacked_conformant_array_schema__Group__2__Impl : ( ( rule__Unpacked_conformant_array_schema__BoundsAssignment_2 ) ) ;
    public final void rule__Unpacked_conformant_array_schema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7068:1: ( ( ( rule__Unpacked_conformant_array_schema__BoundsAssignment_2 ) ) )
            // InternalPascal.g:7069:1: ( ( rule__Unpacked_conformant_array_schema__BoundsAssignment_2 ) )
            {
            // InternalPascal.g:7069:1: ( ( rule__Unpacked_conformant_array_schema__BoundsAssignment_2 ) )
            // InternalPascal.g:7070:2: ( rule__Unpacked_conformant_array_schema__BoundsAssignment_2 )
            {
             before(grammarAccess.getUnpacked_conformant_array_schemaAccess().getBoundsAssignment_2()); 
            // InternalPascal.g:7071:2: ( rule__Unpacked_conformant_array_schema__BoundsAssignment_2 )
            // InternalPascal.g:7071:3: rule__Unpacked_conformant_array_schema__BoundsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Unpacked_conformant_array_schema__BoundsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUnpacked_conformant_array_schemaAccess().getBoundsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unpacked_conformant_array_schema__Group__2__Impl"


    // $ANTLR start "rule__Unpacked_conformant_array_schema__Group__3"
    // InternalPascal.g:7079:1: rule__Unpacked_conformant_array_schema__Group__3 : rule__Unpacked_conformant_array_schema__Group__3__Impl rule__Unpacked_conformant_array_schema__Group__4 ;
    public final void rule__Unpacked_conformant_array_schema__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7083:1: ( rule__Unpacked_conformant_array_schema__Group__3__Impl rule__Unpacked_conformant_array_schema__Group__4 )
            // InternalPascal.g:7084:2: rule__Unpacked_conformant_array_schema__Group__3__Impl rule__Unpacked_conformant_array_schema__Group__4
            {
            pushFollow(FOLLOW_48);
            rule__Unpacked_conformant_array_schema__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Unpacked_conformant_array_schema__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unpacked_conformant_array_schema__Group__3"


    // $ANTLR start "rule__Unpacked_conformant_array_schema__Group__3__Impl"
    // InternalPascal.g:7091:1: rule__Unpacked_conformant_array_schema__Group__3__Impl : ( ( rule__Unpacked_conformant_array_schema__Group_3__0 )* ) ;
    public final void rule__Unpacked_conformant_array_schema__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7095:1: ( ( ( rule__Unpacked_conformant_array_schema__Group_3__0 )* ) )
            // InternalPascal.g:7096:1: ( ( rule__Unpacked_conformant_array_schema__Group_3__0 )* )
            {
            // InternalPascal.g:7096:1: ( ( rule__Unpacked_conformant_array_schema__Group_3__0 )* )
            // InternalPascal.g:7097:2: ( rule__Unpacked_conformant_array_schema__Group_3__0 )*
            {
             before(grammarAccess.getUnpacked_conformant_array_schemaAccess().getGroup_3()); 
            // InternalPascal.g:7098:2: ( rule__Unpacked_conformant_array_schema__Group_3__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==24) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalPascal.g:7098:3: rule__Unpacked_conformant_array_schema__Group_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Unpacked_conformant_array_schema__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

             after(grammarAccess.getUnpacked_conformant_array_schemaAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unpacked_conformant_array_schema__Group__3__Impl"


    // $ANTLR start "rule__Unpacked_conformant_array_schema__Group__4"
    // InternalPascal.g:7106:1: rule__Unpacked_conformant_array_schema__Group__4 : rule__Unpacked_conformant_array_schema__Group__4__Impl rule__Unpacked_conformant_array_schema__Group__5 ;
    public final void rule__Unpacked_conformant_array_schema__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7110:1: ( rule__Unpacked_conformant_array_schema__Group__4__Impl rule__Unpacked_conformant_array_schema__Group__5 )
            // InternalPascal.g:7111:2: rule__Unpacked_conformant_array_schema__Group__4__Impl rule__Unpacked_conformant_array_schema__Group__5
            {
            pushFollow(FOLLOW_42);
            rule__Unpacked_conformant_array_schema__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Unpacked_conformant_array_schema__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unpacked_conformant_array_schema__Group__4"


    // $ANTLR start "rule__Unpacked_conformant_array_schema__Group__4__Impl"
    // InternalPascal.g:7118:1: rule__Unpacked_conformant_array_schema__Group__4__Impl : ( ']' ) ;
    public final void rule__Unpacked_conformant_array_schema__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7122:1: ( ( ']' ) )
            // InternalPascal.g:7123:1: ( ']' )
            {
            // InternalPascal.g:7123:1: ( ']' )
            // InternalPascal.g:7124:2: ']'
            {
             before(grammarAccess.getUnpacked_conformant_array_schemaAccess().getRightSquareBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getUnpacked_conformant_array_schemaAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unpacked_conformant_array_schema__Group__4__Impl"


    // $ANTLR start "rule__Unpacked_conformant_array_schema__Group__5"
    // InternalPascal.g:7133:1: rule__Unpacked_conformant_array_schema__Group__5 : rule__Unpacked_conformant_array_schema__Group__5__Impl rule__Unpacked_conformant_array_schema__Group__6 ;
    public final void rule__Unpacked_conformant_array_schema__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7137:1: ( rule__Unpacked_conformant_array_schema__Group__5__Impl rule__Unpacked_conformant_array_schema__Group__6 )
            // InternalPascal.g:7138:2: rule__Unpacked_conformant_array_schema__Group__5__Impl rule__Unpacked_conformant_array_schema__Group__6
            {
            pushFollow(FOLLOW_46);
            rule__Unpacked_conformant_array_schema__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Unpacked_conformant_array_schema__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unpacked_conformant_array_schema__Group__5"


    // $ANTLR start "rule__Unpacked_conformant_array_schema__Group__5__Impl"
    // InternalPascal.g:7145:1: rule__Unpacked_conformant_array_schema__Group__5__Impl : ( 'of' ) ;
    public final void rule__Unpacked_conformant_array_schema__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7149:1: ( ( 'of' ) )
            // InternalPascal.g:7150:1: ( 'of' )
            {
            // InternalPascal.g:7150:1: ( 'of' )
            // InternalPascal.g:7151:2: 'of'
            {
             before(grammarAccess.getUnpacked_conformant_array_schemaAccess().getOfKeyword_5()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getUnpacked_conformant_array_schemaAccess().getOfKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unpacked_conformant_array_schema__Group__5__Impl"


    // $ANTLR start "rule__Unpacked_conformant_array_schema__Group__6"
    // InternalPascal.g:7160:1: rule__Unpacked_conformant_array_schema__Group__6 : rule__Unpacked_conformant_array_schema__Group__6__Impl ;
    public final void rule__Unpacked_conformant_array_schema__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7164:1: ( rule__Unpacked_conformant_array_schema__Group__6__Impl )
            // InternalPascal.g:7165:2: rule__Unpacked_conformant_array_schema__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Unpacked_conformant_array_schema__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unpacked_conformant_array_schema__Group__6"


    // $ANTLR start "rule__Unpacked_conformant_array_schema__Group__6__Impl"
    // InternalPascal.g:7171:1: rule__Unpacked_conformant_array_schema__Group__6__Impl : ( ( rule__Unpacked_conformant_array_schema__TypeAssignment_6 ) ) ;
    public final void rule__Unpacked_conformant_array_schema__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7175:1: ( ( ( rule__Unpacked_conformant_array_schema__TypeAssignment_6 ) ) )
            // InternalPascal.g:7176:1: ( ( rule__Unpacked_conformant_array_schema__TypeAssignment_6 ) )
            {
            // InternalPascal.g:7176:1: ( ( rule__Unpacked_conformant_array_schema__TypeAssignment_6 ) )
            // InternalPascal.g:7177:2: ( rule__Unpacked_conformant_array_schema__TypeAssignment_6 )
            {
             before(grammarAccess.getUnpacked_conformant_array_schemaAccess().getTypeAssignment_6()); 
            // InternalPascal.g:7178:2: ( rule__Unpacked_conformant_array_schema__TypeAssignment_6 )
            // InternalPascal.g:7178:3: rule__Unpacked_conformant_array_schema__TypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Unpacked_conformant_array_schema__TypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getUnpacked_conformant_array_schemaAccess().getTypeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unpacked_conformant_array_schema__Group__6__Impl"


    // $ANTLR start "rule__Unpacked_conformant_array_schema__Group_3__0"
    // InternalPascal.g:7187:1: rule__Unpacked_conformant_array_schema__Group_3__0 : rule__Unpacked_conformant_array_schema__Group_3__0__Impl rule__Unpacked_conformant_array_schema__Group_3__1 ;
    public final void rule__Unpacked_conformant_array_schema__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7191:1: ( rule__Unpacked_conformant_array_schema__Group_3__0__Impl rule__Unpacked_conformant_array_schema__Group_3__1 )
            // InternalPascal.g:7192:2: rule__Unpacked_conformant_array_schema__Group_3__0__Impl rule__Unpacked_conformant_array_schema__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Unpacked_conformant_array_schema__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Unpacked_conformant_array_schema__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unpacked_conformant_array_schema__Group_3__0"


    // $ANTLR start "rule__Unpacked_conformant_array_schema__Group_3__0__Impl"
    // InternalPascal.g:7199:1: rule__Unpacked_conformant_array_schema__Group_3__0__Impl : ( ';' ) ;
    public final void rule__Unpacked_conformant_array_schema__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7203:1: ( ( ';' ) )
            // InternalPascal.g:7204:1: ( ';' )
            {
            // InternalPascal.g:7204:1: ( ';' )
            // InternalPascal.g:7205:2: ';'
            {
             before(grammarAccess.getUnpacked_conformant_array_schemaAccess().getSemicolonKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getUnpacked_conformant_array_schemaAccess().getSemicolonKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unpacked_conformant_array_schema__Group_3__0__Impl"


    // $ANTLR start "rule__Unpacked_conformant_array_schema__Group_3__1"
    // InternalPascal.g:7214:1: rule__Unpacked_conformant_array_schema__Group_3__1 : rule__Unpacked_conformant_array_schema__Group_3__1__Impl ;
    public final void rule__Unpacked_conformant_array_schema__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7218:1: ( rule__Unpacked_conformant_array_schema__Group_3__1__Impl )
            // InternalPascal.g:7219:2: rule__Unpacked_conformant_array_schema__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Unpacked_conformant_array_schema__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unpacked_conformant_array_schema__Group_3__1"


    // $ANTLR start "rule__Unpacked_conformant_array_schema__Group_3__1__Impl"
    // InternalPascal.g:7225:1: rule__Unpacked_conformant_array_schema__Group_3__1__Impl : ( ( rule__Unpacked_conformant_array_schema__BoundsAssignment_3_1 ) ) ;
    public final void rule__Unpacked_conformant_array_schema__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7229:1: ( ( ( rule__Unpacked_conformant_array_schema__BoundsAssignment_3_1 ) ) )
            // InternalPascal.g:7230:1: ( ( rule__Unpacked_conformant_array_schema__BoundsAssignment_3_1 ) )
            {
            // InternalPascal.g:7230:1: ( ( rule__Unpacked_conformant_array_schema__BoundsAssignment_3_1 ) )
            // InternalPascal.g:7231:2: ( rule__Unpacked_conformant_array_schema__BoundsAssignment_3_1 )
            {
             before(grammarAccess.getUnpacked_conformant_array_schemaAccess().getBoundsAssignment_3_1()); 
            // InternalPascal.g:7232:2: ( rule__Unpacked_conformant_array_schema__BoundsAssignment_3_1 )
            // InternalPascal.g:7232:3: rule__Unpacked_conformant_array_schema__BoundsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Unpacked_conformant_array_schema__BoundsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getUnpacked_conformant_array_schemaAccess().getBoundsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unpacked_conformant_array_schema__Group_3__1__Impl"


    // $ANTLR start "rule__Variable_parameter_section__Group__0"
    // InternalPascal.g:7241:1: rule__Variable_parameter_section__Group__0 : rule__Variable_parameter_section__Group__0__Impl rule__Variable_parameter_section__Group__1 ;
    public final void rule__Variable_parameter_section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7245:1: ( rule__Variable_parameter_section__Group__0__Impl rule__Variable_parameter_section__Group__1 )
            // InternalPascal.g:7246:2: rule__Variable_parameter_section__Group__0__Impl rule__Variable_parameter_section__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Variable_parameter_section__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable_parameter_section__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_parameter_section__Group__0"


    // $ANTLR start "rule__Variable_parameter_section__Group__0__Impl"
    // InternalPascal.g:7253:1: rule__Variable_parameter_section__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variable_parameter_section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7257:1: ( ( 'var' ) )
            // InternalPascal.g:7258:1: ( 'var' )
            {
            // InternalPascal.g:7258:1: ( 'var' )
            // InternalPascal.g:7259:2: 'var'
            {
             before(grammarAccess.getVariable_parameter_sectionAccess().getVarKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getVariable_parameter_sectionAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_parameter_section__Group__0__Impl"


    // $ANTLR start "rule__Variable_parameter_section__Group__1"
    // InternalPascal.g:7268:1: rule__Variable_parameter_section__Group__1 : rule__Variable_parameter_section__Group__1__Impl rule__Variable_parameter_section__Group__2 ;
    public final void rule__Variable_parameter_section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7272:1: ( rule__Variable_parameter_section__Group__1__Impl rule__Variable_parameter_section__Group__2 )
            // InternalPascal.g:7273:2: rule__Variable_parameter_section__Group__1__Impl rule__Variable_parameter_section__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Variable_parameter_section__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable_parameter_section__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_parameter_section__Group__1"


    // $ANTLR start "rule__Variable_parameter_section__Group__1__Impl"
    // InternalPascal.g:7280:1: rule__Variable_parameter_section__Group__1__Impl : ( ( rule__Variable_parameter_section__IdentifiersAssignment_1 ) ) ;
    public final void rule__Variable_parameter_section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7284:1: ( ( ( rule__Variable_parameter_section__IdentifiersAssignment_1 ) ) )
            // InternalPascal.g:7285:1: ( ( rule__Variable_parameter_section__IdentifiersAssignment_1 ) )
            {
            // InternalPascal.g:7285:1: ( ( rule__Variable_parameter_section__IdentifiersAssignment_1 ) )
            // InternalPascal.g:7286:2: ( rule__Variable_parameter_section__IdentifiersAssignment_1 )
            {
             before(grammarAccess.getVariable_parameter_sectionAccess().getIdentifiersAssignment_1()); 
            // InternalPascal.g:7287:2: ( rule__Variable_parameter_section__IdentifiersAssignment_1 )
            // InternalPascal.g:7287:3: rule__Variable_parameter_section__IdentifiersAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable_parameter_section__IdentifiersAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariable_parameter_sectionAccess().getIdentifiersAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_parameter_section__Group__1__Impl"


    // $ANTLR start "rule__Variable_parameter_section__Group__2"
    // InternalPascal.g:7295:1: rule__Variable_parameter_section__Group__2 : rule__Variable_parameter_section__Group__2__Impl rule__Variable_parameter_section__Group__3 ;
    public final void rule__Variable_parameter_section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7299:1: ( rule__Variable_parameter_section__Group__2__Impl rule__Variable_parameter_section__Group__3 )
            // InternalPascal.g:7300:2: rule__Variable_parameter_section__Group__2__Impl rule__Variable_parameter_section__Group__3
            {
            pushFollow(FOLLOW_46);
            rule__Variable_parameter_section__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable_parameter_section__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_parameter_section__Group__2"


    // $ANTLR start "rule__Variable_parameter_section__Group__2__Impl"
    // InternalPascal.g:7307:1: rule__Variable_parameter_section__Group__2__Impl : ( ':' ) ;
    public final void rule__Variable_parameter_section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7311:1: ( ( ':' ) )
            // InternalPascal.g:7312:1: ( ':' )
            {
            // InternalPascal.g:7312:1: ( ':' )
            // InternalPascal.g:7313:2: ':'
            {
             before(grammarAccess.getVariable_parameter_sectionAccess().getColonKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getVariable_parameter_sectionAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_parameter_section__Group__2__Impl"


    // $ANTLR start "rule__Variable_parameter_section__Group__3"
    // InternalPascal.g:7322:1: rule__Variable_parameter_section__Group__3 : rule__Variable_parameter_section__Group__3__Impl ;
    public final void rule__Variable_parameter_section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7326:1: ( rule__Variable_parameter_section__Group__3__Impl )
            // InternalPascal.g:7327:2: rule__Variable_parameter_section__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable_parameter_section__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_parameter_section__Group__3"


    // $ANTLR start "rule__Variable_parameter_section__Group__3__Impl"
    // InternalPascal.g:7333:1: rule__Variable_parameter_section__Group__3__Impl : ( ( rule__Variable_parameter_section__TypeAssignment_3 ) ) ;
    public final void rule__Variable_parameter_section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7337:1: ( ( ( rule__Variable_parameter_section__TypeAssignment_3 ) ) )
            // InternalPascal.g:7338:1: ( ( rule__Variable_parameter_section__TypeAssignment_3 ) )
            {
            // InternalPascal.g:7338:1: ( ( rule__Variable_parameter_section__TypeAssignment_3 ) )
            // InternalPascal.g:7339:2: ( rule__Variable_parameter_section__TypeAssignment_3 )
            {
             before(grammarAccess.getVariable_parameter_sectionAccess().getTypeAssignment_3()); 
            // InternalPascal.g:7340:2: ( rule__Variable_parameter_section__TypeAssignment_3 )
            // InternalPascal.g:7340:3: rule__Variable_parameter_section__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Variable_parameter_section__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariable_parameter_sectionAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_parameter_section__Group__3__Impl"


    // $ANTLR start "rule__Function_heading__Group__0"
    // InternalPascal.g:7349:1: rule__Function_heading__Group__0 : rule__Function_heading__Group__0__Impl rule__Function_heading__Group__1 ;
    public final void rule__Function_heading__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7353:1: ( rule__Function_heading__Group__0__Impl rule__Function_heading__Group__1 )
            // InternalPascal.g:7354:2: rule__Function_heading__Group__0__Impl rule__Function_heading__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Function_heading__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function_heading__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_heading__Group__0"


    // $ANTLR start "rule__Function_heading__Group__0__Impl"
    // InternalPascal.g:7361:1: rule__Function_heading__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function_heading__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7365:1: ( ( 'function' ) )
            // InternalPascal.g:7366:1: ( 'function' )
            {
            // InternalPascal.g:7366:1: ( 'function' )
            // InternalPascal.g:7367:2: 'function'
            {
             before(grammarAccess.getFunction_headingAccess().getFunctionKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getFunction_headingAccess().getFunctionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_heading__Group__0__Impl"


    // $ANTLR start "rule__Function_heading__Group__1"
    // InternalPascal.g:7376:1: rule__Function_heading__Group__1 : rule__Function_heading__Group__1__Impl rule__Function_heading__Group__2 ;
    public final void rule__Function_heading__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7380:1: ( rule__Function_heading__Group__1__Impl rule__Function_heading__Group__2 )
            // InternalPascal.g:7381:2: rule__Function_heading__Group__1__Impl rule__Function_heading__Group__2
            {
            pushFollow(FOLLOW_49);
            rule__Function_heading__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function_heading__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_heading__Group__1"


    // $ANTLR start "rule__Function_heading__Group__1__Impl"
    // InternalPascal.g:7388:1: rule__Function_heading__Group__1__Impl : ( ( rule__Function_heading__NameAssignment_1 ) ) ;
    public final void rule__Function_heading__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7392:1: ( ( ( rule__Function_heading__NameAssignment_1 ) ) )
            // InternalPascal.g:7393:1: ( ( rule__Function_heading__NameAssignment_1 ) )
            {
            // InternalPascal.g:7393:1: ( ( rule__Function_heading__NameAssignment_1 ) )
            // InternalPascal.g:7394:2: ( rule__Function_heading__NameAssignment_1 )
            {
             before(grammarAccess.getFunction_headingAccess().getNameAssignment_1()); 
            // InternalPascal.g:7395:2: ( rule__Function_heading__NameAssignment_1 )
            // InternalPascal.g:7395:3: rule__Function_heading__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Function_heading__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunction_headingAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_heading__Group__1__Impl"


    // $ANTLR start "rule__Function_heading__Group__2"
    // InternalPascal.g:7403:1: rule__Function_heading__Group__2 : rule__Function_heading__Group__2__Impl rule__Function_heading__Group__3 ;
    public final void rule__Function_heading__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7407:1: ( rule__Function_heading__Group__2__Impl rule__Function_heading__Group__3 )
            // InternalPascal.g:7408:2: rule__Function_heading__Group__2__Impl rule__Function_heading__Group__3
            {
            pushFollow(FOLLOW_49);
            rule__Function_heading__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function_heading__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_heading__Group__2"


    // $ANTLR start "rule__Function_heading__Group__2__Impl"
    // InternalPascal.g:7415:1: rule__Function_heading__Group__2__Impl : ( ( rule__Function_heading__ParametersAssignment_2 )? ) ;
    public final void rule__Function_heading__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7419:1: ( ( ( rule__Function_heading__ParametersAssignment_2 )? ) )
            // InternalPascal.g:7420:1: ( ( rule__Function_heading__ParametersAssignment_2 )? )
            {
            // InternalPascal.g:7420:1: ( ( rule__Function_heading__ParametersAssignment_2 )? )
            // InternalPascal.g:7421:2: ( rule__Function_heading__ParametersAssignment_2 )?
            {
             before(grammarAccess.getFunction_headingAccess().getParametersAssignment_2()); 
            // InternalPascal.g:7422:2: ( rule__Function_heading__ParametersAssignment_2 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==25) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalPascal.g:7422:3: rule__Function_heading__ParametersAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function_heading__ParametersAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunction_headingAccess().getParametersAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_heading__Group__2__Impl"


    // $ANTLR start "rule__Function_heading__Group__3"
    // InternalPascal.g:7430:1: rule__Function_heading__Group__3 : rule__Function_heading__Group__3__Impl rule__Function_heading__Group__4 ;
    public final void rule__Function_heading__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7434:1: ( rule__Function_heading__Group__3__Impl rule__Function_heading__Group__4 )
            // InternalPascal.g:7435:2: rule__Function_heading__Group__3__Impl rule__Function_heading__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Function_heading__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function_heading__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_heading__Group__3"


    // $ANTLR start "rule__Function_heading__Group__3__Impl"
    // InternalPascal.g:7442:1: rule__Function_heading__Group__3__Impl : ( ':' ) ;
    public final void rule__Function_heading__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7446:1: ( ( ':' ) )
            // InternalPascal.g:7447:1: ( ':' )
            {
            // InternalPascal.g:7447:1: ( ':' )
            // InternalPascal.g:7448:2: ':'
            {
             before(grammarAccess.getFunction_headingAccess().getColonKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFunction_headingAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_heading__Group__3__Impl"


    // $ANTLR start "rule__Function_heading__Group__4"
    // InternalPascal.g:7457:1: rule__Function_heading__Group__4 : rule__Function_heading__Group__4__Impl ;
    public final void rule__Function_heading__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7461:1: ( rule__Function_heading__Group__4__Impl )
            // InternalPascal.g:7462:2: rule__Function_heading__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function_heading__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_heading__Group__4"


    // $ANTLR start "rule__Function_heading__Group__4__Impl"
    // InternalPascal.g:7468:1: rule__Function_heading__Group__4__Impl : ( ( rule__Function_heading__ReturnTypeAssignment_4 ) ) ;
    public final void rule__Function_heading__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7472:1: ( ( ( rule__Function_heading__ReturnTypeAssignment_4 ) ) )
            // InternalPascal.g:7473:1: ( ( rule__Function_heading__ReturnTypeAssignment_4 ) )
            {
            // InternalPascal.g:7473:1: ( ( rule__Function_heading__ReturnTypeAssignment_4 ) )
            // InternalPascal.g:7474:2: ( rule__Function_heading__ReturnTypeAssignment_4 )
            {
             before(grammarAccess.getFunction_headingAccess().getReturnTypeAssignment_4()); 
            // InternalPascal.g:7475:2: ( rule__Function_heading__ReturnTypeAssignment_4 )
            // InternalPascal.g:7475:3: rule__Function_heading__ReturnTypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Function_heading__ReturnTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFunction_headingAccess().getReturnTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_heading__Group__4__Impl"


    // $ANTLR start "rule__Function_declaration__Group__0"
    // InternalPascal.g:7484:1: rule__Function_declaration__Group__0 : rule__Function_declaration__Group__0__Impl rule__Function_declaration__Group__1 ;
    public final void rule__Function_declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7488:1: ( rule__Function_declaration__Group__0__Impl rule__Function_declaration__Group__1 )
            // InternalPascal.g:7489:2: rule__Function_declaration__Group__0__Impl rule__Function_declaration__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Function_declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function_declaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_declaration__Group__0"


    // $ANTLR start "rule__Function_declaration__Group__0__Impl"
    // InternalPascal.g:7496:1: rule__Function_declaration__Group__0__Impl : ( ( rule__Function_declaration__HeadingAssignment_0 ) ) ;
    public final void rule__Function_declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7500:1: ( ( ( rule__Function_declaration__HeadingAssignment_0 ) ) )
            // InternalPascal.g:7501:1: ( ( rule__Function_declaration__HeadingAssignment_0 ) )
            {
            // InternalPascal.g:7501:1: ( ( rule__Function_declaration__HeadingAssignment_0 ) )
            // InternalPascal.g:7502:2: ( rule__Function_declaration__HeadingAssignment_0 )
            {
             before(grammarAccess.getFunction_declarationAccess().getHeadingAssignment_0()); 
            // InternalPascal.g:7503:2: ( rule__Function_declaration__HeadingAssignment_0 )
            // InternalPascal.g:7503:3: rule__Function_declaration__HeadingAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Function_declaration__HeadingAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunction_declarationAccess().getHeadingAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_declaration__Group__0__Impl"


    // $ANTLR start "rule__Function_declaration__Group__1"
    // InternalPascal.g:7511:1: rule__Function_declaration__Group__1 : rule__Function_declaration__Group__1__Impl rule__Function_declaration__Group__2 ;
    public final void rule__Function_declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7515:1: ( rule__Function_declaration__Group__1__Impl rule__Function_declaration__Group__2 )
            // InternalPascal.g:7516:2: rule__Function_declaration__Group__1__Impl rule__Function_declaration__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__Function_declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function_declaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_declaration__Group__1"


    // $ANTLR start "rule__Function_declaration__Group__1__Impl"
    // InternalPascal.g:7523:1: rule__Function_declaration__Group__1__Impl : ( ';' ) ;
    public final void rule__Function_declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7527:1: ( ( ';' ) )
            // InternalPascal.g:7528:1: ( ';' )
            {
            // InternalPascal.g:7528:1: ( ';' )
            // InternalPascal.g:7529:2: ';'
            {
             before(grammarAccess.getFunction_declarationAccess().getSemicolonKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFunction_declarationAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_declaration__Group__1__Impl"


    // $ANTLR start "rule__Function_declaration__Group__2"
    // InternalPascal.g:7538:1: rule__Function_declaration__Group__2 : rule__Function_declaration__Group__2__Impl ;
    public final void rule__Function_declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7542:1: ( rule__Function_declaration__Group__2__Impl )
            // InternalPascal.g:7543:2: rule__Function_declaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function_declaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_declaration__Group__2"


    // $ANTLR start "rule__Function_declaration__Group__2__Impl"
    // InternalPascal.g:7549:1: rule__Function_declaration__Group__2__Impl : ( ( rule__Function_declaration__Alternatives_2 ) ) ;
    public final void rule__Function_declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7553:1: ( ( ( rule__Function_declaration__Alternatives_2 ) ) )
            // InternalPascal.g:7554:1: ( ( rule__Function_declaration__Alternatives_2 ) )
            {
            // InternalPascal.g:7554:1: ( ( rule__Function_declaration__Alternatives_2 ) )
            // InternalPascal.g:7555:2: ( rule__Function_declaration__Alternatives_2 )
            {
             before(grammarAccess.getFunction_declarationAccess().getAlternatives_2()); 
            // InternalPascal.g:7556:2: ( rule__Function_declaration__Alternatives_2 )
            // InternalPascal.g:7556:3: rule__Function_declaration__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Function_declaration__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getFunction_declarationAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_declaration__Group__2__Impl"


    // $ANTLR start "rule__Pascal__ProgramAssignment"
    // InternalPascal.g:7565:1: rule__Pascal__ProgramAssignment : ( ruleprogram ) ;
    public final void rule__Pascal__ProgramAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7569:1: ( ( ruleprogram ) )
            // InternalPascal.g:7570:2: ( ruleprogram )
            {
            // InternalPascal.g:7570:2: ( ruleprogram )
            // InternalPascal.g:7571:3: ruleprogram
            {
             before(grammarAccess.getPascalAccess().getProgramProgramParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleprogram();

            state._fsp--;

             after(grammarAccess.getPascalAccess().getProgramProgramParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pascal__ProgramAssignment"


    // $ANTLR start "rule__Program__HeadingAssignment_0"
    // InternalPascal.g:7580:1: rule__Program__HeadingAssignment_0 : ( ruleprogram_heading_block ) ;
    public final void rule__Program__HeadingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7584:1: ( ( ruleprogram_heading_block ) )
            // InternalPascal.g:7585:2: ( ruleprogram_heading_block )
            {
            // InternalPascal.g:7585:2: ( ruleprogram_heading_block )
            // InternalPascal.g:7586:3: ruleprogram_heading_block
            {
             before(grammarAccess.getProgramAccess().getHeadingProgram_heading_blockParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleprogram_heading_block();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getHeadingProgram_heading_blockParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__HeadingAssignment_0"


    // $ANTLR start "rule__Program__BlockAssignment_1"
    // InternalPascal.g:7595:1: rule__Program__BlockAssignment_1 : ( ruleblock ) ;
    public final void rule__Program__BlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7599:1: ( ( ruleblock ) )
            // InternalPascal.g:7600:2: ( ruleblock )
            {
            // InternalPascal.g:7600:2: ( ruleblock )
            // InternalPascal.g:7601:3: ruleblock
            {
             before(grammarAccess.getProgramAccess().getBlockBlockParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleblock();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getBlockBlockParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__BlockAssignment_1"


    // $ANTLR start "rule__Program_heading_block__NameAssignment_1"
    // InternalPascal.g:7610:1: rule__Program_heading_block__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Program_heading_block__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7614:1: ( ( RULE_ID ) )
            // InternalPascal.g:7615:2: ( RULE_ID )
            {
            // InternalPascal.g:7615:2: ( RULE_ID )
            // InternalPascal.g:7616:3: RULE_ID
            {
             before(grammarAccess.getProgram_heading_blockAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProgram_heading_blockAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading_block__NameAssignment_1"


    // $ANTLR start "rule__Program_heading_block__IdentifiersAssignment_2_1"
    // InternalPascal.g:7625:1: rule__Program_heading_block__IdentifiersAssignment_2_1 : ( ruleidentifier_list ) ;
    public final void rule__Program_heading_block__IdentifiersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7629:1: ( ( ruleidentifier_list ) )
            // InternalPascal.g:7630:2: ( ruleidentifier_list )
            {
            // InternalPascal.g:7630:2: ( ruleidentifier_list )
            // InternalPascal.g:7631:3: ruleidentifier_list
            {
             before(grammarAccess.getProgram_heading_blockAccess().getIdentifiersIdentifier_listParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleidentifier_list();

            state._fsp--;

             after(grammarAccess.getProgram_heading_blockAccess().getIdentifiersIdentifier_listParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program_heading_block__IdentifiersAssignment_2_1"


    // $ANTLR start "rule__Identifier_list__NamesAssignment_0"
    // InternalPascal.g:7640:1: rule__Identifier_list__NamesAssignment_0 : ( RULE_ID ) ;
    public final void rule__Identifier_list__NamesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7644:1: ( ( RULE_ID ) )
            // InternalPascal.g:7645:2: ( RULE_ID )
            {
            // InternalPascal.g:7645:2: ( RULE_ID )
            // InternalPascal.g:7646:3: RULE_ID
            {
             before(grammarAccess.getIdentifier_listAccess().getNamesIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIdentifier_listAccess().getNamesIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier_list__NamesAssignment_0"


    // $ANTLR start "rule__Identifier_list__NamesAssignment_1_1"
    // InternalPascal.g:7655:1: rule__Identifier_list__NamesAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Identifier_list__NamesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7659:1: ( ( RULE_ID ) )
            // InternalPascal.g:7660:2: ( RULE_ID )
            {
            // InternalPascal.g:7660:2: ( RULE_ID )
            // InternalPascal.g:7661:3: RULE_ID
            {
             before(grammarAccess.getIdentifier_listAccess().getNamesIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIdentifier_listAccess().getNamesIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier_list__NamesAssignment_1_1"


    // $ANTLR start "rule__Block__ConstantAssignment_0"
    // InternalPascal.g:7670:1: rule__Block__ConstantAssignment_0 : ( ruleconstant_definition_part ) ;
    public final void rule__Block__ConstantAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7674:1: ( ( ruleconstant_definition_part ) )
            // InternalPascal.g:7675:2: ( ruleconstant_definition_part )
            {
            // InternalPascal.g:7675:2: ( ruleconstant_definition_part )
            // InternalPascal.g:7676:3: ruleconstant_definition_part
            {
             before(grammarAccess.getBlockAccess().getConstantConstant_definition_partParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleconstant_definition_part();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getConstantConstant_definition_partParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__ConstantAssignment_0"


    // $ANTLR start "rule__Block__TypeAssignment_1"
    // InternalPascal.g:7685:1: rule__Block__TypeAssignment_1 : ( ruletype_definition_part ) ;
    public final void rule__Block__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7689:1: ( ( ruletype_definition_part ) )
            // InternalPascal.g:7690:2: ( ruletype_definition_part )
            {
            // InternalPascal.g:7690:2: ( ruletype_definition_part )
            // InternalPascal.g:7691:3: ruletype_definition_part
            {
             before(grammarAccess.getBlockAccess().getTypeType_definition_partParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruletype_definition_part();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getTypeType_definition_partParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__TypeAssignment_1"


    // $ANTLR start "rule__Block__VariableAssignment_2"
    // InternalPascal.g:7700:1: rule__Block__VariableAssignment_2 : ( rulevariable_declaration_part ) ;
    public final void rule__Block__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7704:1: ( ( rulevariable_declaration_part ) )
            // InternalPascal.g:7705:2: ( rulevariable_declaration_part )
            {
            // InternalPascal.g:7705:2: ( rulevariable_declaration_part )
            // InternalPascal.g:7706:3: rulevariable_declaration_part
            {
             before(grammarAccess.getBlockAccess().getVariableVariable_declaration_partParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulevariable_declaration_part();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getVariableVariable_declaration_partParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__VariableAssignment_2"


    // $ANTLR start "rule__Block__AbstractionAssignment_3"
    // InternalPascal.g:7715:1: rule__Block__AbstractionAssignment_3 : ( ruleprocedure_and_function_declaration_part ) ;
    public final void rule__Block__AbstractionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7719:1: ( ( ruleprocedure_and_function_declaration_part ) )
            // InternalPascal.g:7720:2: ( ruleprocedure_and_function_declaration_part )
            {
            // InternalPascal.g:7720:2: ( ruleprocedure_and_function_declaration_part )
            // InternalPascal.g:7721:3: ruleprocedure_and_function_declaration_part
            {
             before(grammarAccess.getBlockAccess().getAbstractionProcedure_and_function_declaration_partParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleprocedure_and_function_declaration_part();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getAbstractionProcedure_and_function_declaration_partParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__AbstractionAssignment_3"


    // $ANTLR start "rule__Block__StatementAssignment_4"
    // InternalPascal.g:7730:1: rule__Block__StatementAssignment_4 : ( rulestatement_part ) ;
    public final void rule__Block__StatementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7734:1: ( ( rulestatement_part ) )
            // InternalPascal.g:7735:2: ( rulestatement_part )
            {
            // InternalPascal.g:7735:2: ( rulestatement_part )
            // InternalPascal.g:7736:3: rulestatement_part
            {
             before(grammarAccess.getBlockAccess().getStatementStatement_partParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulestatement_part();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getStatementStatement_partParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__StatementAssignment_4"


    // $ANTLR start "rule__Statement_part__SequenceAssignment_1"
    // InternalPascal.g:7745:1: rule__Statement_part__SequenceAssignment_1 : ( rulestatement_sequence ) ;
    public final void rule__Statement_part__SequenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7749:1: ( ( rulestatement_sequence ) )
            // InternalPascal.g:7750:2: ( rulestatement_sequence )
            {
            // InternalPascal.g:7750:2: ( rulestatement_sequence )
            // InternalPascal.g:7751:3: rulestatement_sequence
            {
             before(grammarAccess.getStatement_partAccess().getSequenceStatement_sequenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulestatement_sequence();

            state._fsp--;

             after(grammarAccess.getStatement_partAccess().getSequenceStatement_sequenceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_part__SequenceAssignment_1"


    // $ANTLR start "rule__Statement_sequence__StatementsAssignment_0"
    // InternalPascal.g:7760:1: rule__Statement_sequence__StatementsAssignment_0 : ( rulestatement ) ;
    public final void rule__Statement_sequence__StatementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7764:1: ( ( rulestatement ) )
            // InternalPascal.g:7765:2: ( rulestatement )
            {
            // InternalPascal.g:7765:2: ( rulestatement )
            // InternalPascal.g:7766:3: rulestatement
            {
             before(grammarAccess.getStatement_sequenceAccess().getStatementsStatementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulestatement();

            state._fsp--;

             after(grammarAccess.getStatement_sequenceAccess().getStatementsStatementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_sequence__StatementsAssignment_0"


    // $ANTLR start "rule__Statement_sequence__StatementsAssignment_1_1"
    // InternalPascal.g:7775:1: rule__Statement_sequence__StatementsAssignment_1_1 : ( rulestatement ) ;
    public final void rule__Statement_sequence__StatementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7779:1: ( ( rulestatement ) )
            // InternalPascal.g:7780:2: ( rulestatement )
            {
            // InternalPascal.g:7780:2: ( rulestatement )
            // InternalPascal.g:7781:3: rulestatement
            {
             before(grammarAccess.getStatement_sequenceAccess().getStatementsStatementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulestatement();

            state._fsp--;

             after(grammarAccess.getStatement_sequenceAccess().getStatementsStatementParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement_sequence__StatementsAssignment_1_1"


    // $ANTLR start "rule__Statement__LabelAssignment_0_0"
    // InternalPascal.g:7790:1: rule__Statement__LabelAssignment_0_0 : ( rulelabel ) ;
    public final void rule__Statement__LabelAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7794:1: ( ( rulelabel ) )
            // InternalPascal.g:7795:2: ( rulelabel )
            {
            // InternalPascal.g:7795:2: ( rulelabel )
            // InternalPascal.g:7796:3: rulelabel
            {
             before(grammarAccess.getStatementAccess().getLabelLabelParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            rulelabel();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getLabelLabelParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__LabelAssignment_0_0"


    // $ANTLR start "rule__Statement__SimpleAssignment_1_0"
    // InternalPascal.g:7805:1: rule__Statement__SimpleAssignment_1_0 : ( rulesimple_statement ) ;
    public final void rule__Statement__SimpleAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7809:1: ( ( rulesimple_statement ) )
            // InternalPascal.g:7810:2: ( rulesimple_statement )
            {
            // InternalPascal.g:7810:2: ( rulesimple_statement )
            // InternalPascal.g:7811:3: rulesimple_statement
            {
             before(grammarAccess.getStatementAccess().getSimpleSimple_statementParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            rulesimple_statement();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getSimpleSimple_statementParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__SimpleAssignment_1_0"


    // $ANTLR start "rule__Statement__StructuredAssignment_1_1"
    // InternalPascal.g:7820:1: rule__Statement__StructuredAssignment_1_1 : ( rulestructured_statement ) ;
    public final void rule__Statement__StructuredAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7824:1: ( ( rulestructured_statement ) )
            // InternalPascal.g:7825:2: ( rulestructured_statement )
            {
            // InternalPascal.g:7825:2: ( rulestructured_statement )
            // InternalPascal.g:7826:3: rulestructured_statement
            {
             before(grammarAccess.getStatementAccess().getStructuredStructured_statementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulestructured_statement();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getStructuredStructured_statementParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__StructuredAssignment_1_1"


    // $ANTLR start "rule__Label__NumberAssignment_0"
    // InternalPascal.g:7835:1: rule__Label__NumberAssignment_0 : ( RULE_SIGNED_INTEGER_NUMBER ) ;
    public final void rule__Label__NumberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7839:1: ( ( RULE_SIGNED_INTEGER_NUMBER ) )
            // InternalPascal.g:7840:2: ( RULE_SIGNED_INTEGER_NUMBER )
            {
            // InternalPascal.g:7840:2: ( RULE_SIGNED_INTEGER_NUMBER )
            // InternalPascal.g:7841:3: RULE_SIGNED_INTEGER_NUMBER
            {
             before(grammarAccess.getLabelAccess().getNumberSIGNED_INTEGER_NUMBERTerminalRuleCall_0_0()); 
            match(input,RULE_SIGNED_INTEGER_NUMBER,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getNumberSIGNED_INTEGER_NUMBERTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__NumberAssignment_0"


    // $ANTLR start "rule__Label__NumberAssignment_1"
    // InternalPascal.g:7850:1: rule__Label__NumberAssignment_1 : ( RULE_INTEGER_NUMBER ) ;
    public final void rule__Label__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7854:1: ( ( RULE_INTEGER_NUMBER ) )
            // InternalPascal.g:7855:2: ( RULE_INTEGER_NUMBER )
            {
            // InternalPascal.g:7855:2: ( RULE_INTEGER_NUMBER )
            // InternalPascal.g:7856:3: RULE_INTEGER_NUMBER
            {
             before(grammarAccess.getLabelAccess().getNumberINTEGER_NUMBERTerminalRuleCall_1_0()); 
            match(input,RULE_INTEGER_NUMBER,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getNumberINTEGER_NUMBERTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__NumberAssignment_1"


    // $ANTLR start "rule__Simple_statement__AssignmentAssignment_0"
    // InternalPascal.g:7865:1: rule__Simple_statement__AssignmentAssignment_0 : ( ruleassignment_statement ) ;
    public final void rule__Simple_statement__AssignmentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7869:1: ( ( ruleassignment_statement ) )
            // InternalPascal.g:7870:2: ( ruleassignment_statement )
            {
            // InternalPascal.g:7870:2: ( ruleassignment_statement )
            // InternalPascal.g:7871:3: ruleassignment_statement
            {
             before(grammarAccess.getSimple_statementAccess().getAssignmentAssignment_statementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleassignment_statement();

            state._fsp--;

             after(grammarAccess.getSimple_statementAccess().getAssignmentAssignment_statementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_statement__AssignmentAssignment_0"


    // $ANTLR start "rule__Simple_statement__FunctionAssignment_1"
    // InternalPascal.g:7880:1: rule__Simple_statement__FunctionAssignment_1 : ( rulefunction_designator ) ;
    public final void rule__Simple_statement__FunctionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7884:1: ( ( rulefunction_designator ) )
            // InternalPascal.g:7885:2: ( rulefunction_designator )
            {
            // InternalPascal.g:7885:2: ( rulefunction_designator )
            // InternalPascal.g:7886:3: rulefunction_designator
            {
             before(grammarAccess.getSimple_statementAccess().getFunctionFunction_designatorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulefunction_designator();

            state._fsp--;

             after(grammarAccess.getSimple_statementAccess().getFunctionFunction_designatorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_statement__FunctionAssignment_1"


    // $ANTLR start "rule__Simple_statement__Function_noargsAssignment_2"
    // InternalPascal.g:7895:1: rule__Simple_statement__Function_noargsAssignment_2 : ( RULE_ID ) ;
    public final void rule__Simple_statement__Function_noargsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7899:1: ( ( RULE_ID ) )
            // InternalPascal.g:7900:2: ( RULE_ID )
            {
            // InternalPascal.g:7900:2: ( RULE_ID )
            // InternalPascal.g:7901:3: RULE_ID
            {
             before(grammarAccess.getSimple_statementAccess().getFunction_noargsIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSimple_statementAccess().getFunction_noargsIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_statement__Function_noargsAssignment_2"


    // $ANTLR start "rule__Assignment_statement__VariableAssignment_0"
    // InternalPascal.g:7910:1: rule__Assignment_statement__VariableAssignment_0 : ( rulevariable ) ;
    public final void rule__Assignment_statement__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7914:1: ( ( rulevariable ) )
            // InternalPascal.g:7915:2: ( rulevariable )
            {
            // InternalPascal.g:7915:2: ( rulevariable )
            // InternalPascal.g:7916:3: rulevariable
            {
             before(grammarAccess.getAssignment_statementAccess().getVariableVariableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulevariable();

            state._fsp--;

             after(grammarAccess.getAssignment_statementAccess().getVariableVariableParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment_statement__VariableAssignment_0"


    // $ANTLR start "rule__Assignment_statement__ExpressionAssignment_2"
    // InternalPascal.g:7925:1: rule__Assignment_statement__ExpressionAssignment_2 : ( ruleexpression ) ;
    public final void rule__Assignment_statement__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7929:1: ( ( ruleexpression ) )
            // InternalPascal.g:7930:2: ( ruleexpression )
            {
            // InternalPascal.g:7930:2: ( ruleexpression )
            // InternalPascal.g:7931:3: ruleexpression
            {
             before(grammarAccess.getAssignment_statementAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getAssignment_statementAccess().getExpressionExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment_statement__ExpressionAssignment_2"


    // $ANTLR start "rule__Variable__NameAssignment_0"
    // InternalPascal.g:7940:1: rule__Variable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7944:1: ( ( RULE_ID ) )
            // InternalPascal.g:7945:2: ( RULE_ID )
            {
            // InternalPascal.g:7945:2: ( RULE_ID )
            // InternalPascal.g:7946:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment_0"


    // $ANTLR start "rule__Variable__VariableAssignment_1"
    // InternalPascal.g:7955:1: rule__Variable__VariableAssignment_1 : ( rulevar_ ) ;
    public final void rule__Variable__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7959:1: ( ( rulevar_ ) )
            // InternalPascal.g:7960:2: ( rulevar_ )
            {
            // InternalPascal.g:7960:2: ( rulevar_ )
            // InternalPascal.g:7961:3: rulevar_
            {
             before(grammarAccess.getVariableAccess().getVariableVar_ParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulevar_();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getVariableVar_ParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__VariableAssignment_1"


    // $ANTLR start "rule__Var___ExpressionsAssignment_0_1"
    // InternalPascal.g:7970:1: rule__Var___ExpressionsAssignment_0_1 : ( ruleexpression_list ) ;
    public final void rule__Var___ExpressionsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7974:1: ( ( ruleexpression_list ) )
            // InternalPascal.g:7975:2: ( ruleexpression_list )
            {
            // InternalPascal.g:7975:2: ( ruleexpression_list )
            // InternalPascal.g:7976:3: ruleexpression_list
            {
             before(grammarAccess.getVar_Access().getExpressionsExpression_listParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleexpression_list();

            state._fsp--;

             after(grammarAccess.getVar_Access().getExpressionsExpression_listParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var___ExpressionsAssignment_0_1"


    // $ANTLR start "rule__Var___ArrayAssignment_0_3"
    // InternalPascal.g:7985:1: rule__Var___ArrayAssignment_0_3 : ( rulevar_ ) ;
    public final void rule__Var___ArrayAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:7989:1: ( ( rulevar_ ) )
            // InternalPascal.g:7990:2: ( rulevar_ )
            {
            // InternalPascal.g:7990:2: ( rulevar_ )
            // InternalPascal.g:7991:3: rulevar_
            {
             before(grammarAccess.getVar_Access().getArrayVar_ParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            rulevar_();

            state._fsp--;

             after(grammarAccess.getVar_Access().getArrayVar_ParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var___ArrayAssignment_0_3"


    // $ANTLR start "rule__Var___AccessorAssignment_1_0"
    // InternalPascal.g:8000:1: rule__Var___AccessorAssignment_1_0 : ( ( '.' ) ) ;
    public final void rule__Var___AccessorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8004:1: ( ( ( '.' ) ) )
            // InternalPascal.g:8005:2: ( ( '.' ) )
            {
            // InternalPascal.g:8005:2: ( ( '.' ) )
            // InternalPascal.g:8006:3: ( '.' )
            {
             before(grammarAccess.getVar_Access().getAccessorFullStopKeyword_1_0_0()); 
            // InternalPascal.g:8007:3: ( '.' )
            // InternalPascal.g:8008:4: '.'
            {
             before(grammarAccess.getVar_Access().getAccessorFullStopKeyword_1_0_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getVar_Access().getAccessorFullStopKeyword_1_0_0()); 

            }

             after(grammarAccess.getVar_Access().getAccessorFullStopKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var___AccessorAssignment_1_0"


    // $ANTLR start "rule__Var___NameAssignment_1_1"
    // InternalPascal.g:8019:1: rule__Var___NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Var___NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8023:1: ( ( RULE_ID ) )
            // InternalPascal.g:8024:2: ( RULE_ID )
            {
            // InternalPascal.g:8024:2: ( RULE_ID )
            // InternalPascal.g:8025:3: RULE_ID
            {
             before(grammarAccess.getVar_Access().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVar_Access().getNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var___NameAssignment_1_1"


    // $ANTLR start "rule__Var___VariableAssignment_1_2"
    // InternalPascal.g:8034:1: rule__Var___VariableAssignment_1_2 : ( rulevar_ ) ;
    public final void rule__Var___VariableAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8038:1: ( ( rulevar_ ) )
            // InternalPascal.g:8039:2: ( rulevar_ )
            {
            // InternalPascal.g:8039:2: ( rulevar_ )
            // InternalPascal.g:8040:3: rulevar_
            {
             before(grammarAccess.getVar_Access().getVariableVar_ParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulevar_();

            state._fsp--;

             after(grammarAccess.getVar_Access().getVariableVar_ParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var___VariableAssignment_1_2"


    // $ANTLR start "rule__Var___PointerAssignment_2_1"
    // InternalPascal.g:8049:1: rule__Var___PointerAssignment_2_1 : ( rulevar_ ) ;
    public final void rule__Var___PointerAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8053:1: ( ( rulevar_ ) )
            // InternalPascal.g:8054:2: ( rulevar_ )
            {
            // InternalPascal.g:8054:2: ( rulevar_ )
            // InternalPascal.g:8055:3: rulevar_
            {
             before(grammarAccess.getVar_Access().getPointerVar_ParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulevar_();

            state._fsp--;

             after(grammarAccess.getVar_Access().getPointerVar_ParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var___PointerAssignment_2_1"


    // $ANTLR start "rule__Expression_list__ExpressionsAssignment_0"
    // InternalPascal.g:8064:1: rule__Expression_list__ExpressionsAssignment_0 : ( ruleexpression ) ;
    public final void rule__Expression_list__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8068:1: ( ( ruleexpression ) )
            // InternalPascal.g:8069:2: ( ruleexpression )
            {
            // InternalPascal.g:8069:2: ( ruleexpression )
            // InternalPascal.g:8070:3: ruleexpression
            {
             before(grammarAccess.getExpression_listAccess().getExpressionsExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getExpression_listAccess().getExpressionsExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_list__ExpressionsAssignment_0"


    // $ANTLR start "rule__Expression_list__ExpressionsAssignment_1_1"
    // InternalPascal.g:8079:1: rule__Expression_list__ExpressionsAssignment_1_1 : ( ruleexpression ) ;
    public final void rule__Expression_list__ExpressionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8083:1: ( ( ruleexpression ) )
            // InternalPascal.g:8084:2: ( ruleexpression )
            {
            // InternalPascal.g:8084:2: ( ruleexpression )
            // InternalPascal.g:8085:3: ruleexpression
            {
             before(grammarAccess.getExpression_listAccess().getExpressionsExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getExpression_listAccess().getExpressionsExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_list__ExpressionsAssignment_1_1"


    // $ANTLR start "rule__Expression__ExpressionsAssignment_0"
    // InternalPascal.g:8094:1: rule__Expression__ExpressionsAssignment_0 : ( rulesimple_expression ) ;
    public final void rule__Expression__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8098:1: ( ( rulesimple_expression ) )
            // InternalPascal.g:8099:2: ( rulesimple_expression )
            {
            // InternalPascal.g:8099:2: ( rulesimple_expression )
            // InternalPascal.g:8100:3: rulesimple_expression
            {
             before(grammarAccess.getExpressionAccess().getExpressionsSimple_expressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulesimple_expression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getExpressionsSimple_expressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__ExpressionsAssignment_0"


    // $ANTLR start "rule__Expression__OperatorsAssignment_1_0_0"
    // InternalPascal.g:8109:1: rule__Expression__OperatorsAssignment_1_0_0 : ( RULE_RELATIONAL_OPERATOR ) ;
    public final void rule__Expression__OperatorsAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8113:1: ( ( RULE_RELATIONAL_OPERATOR ) )
            // InternalPascal.g:8114:2: ( RULE_RELATIONAL_OPERATOR )
            {
            // InternalPascal.g:8114:2: ( RULE_RELATIONAL_OPERATOR )
            // InternalPascal.g:8115:3: RULE_RELATIONAL_OPERATOR
            {
             before(grammarAccess.getExpressionAccess().getOperatorsRELATIONAL_OPERATORTerminalRuleCall_1_0_0_0()); 
            match(input,RULE_RELATIONAL_OPERATOR,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getOperatorsRELATIONAL_OPERATORTerminalRuleCall_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__OperatorsAssignment_1_0_0"


    // $ANTLR start "rule__Expression__OperatorsAssignment_1_0_1"
    // InternalPascal.g:8124:1: rule__Expression__OperatorsAssignment_1_0_1 : ( ( 'in' ) ) ;
    public final void rule__Expression__OperatorsAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8128:1: ( ( ( 'in' ) ) )
            // InternalPascal.g:8129:2: ( ( 'in' ) )
            {
            // InternalPascal.g:8129:2: ( ( 'in' ) )
            // InternalPascal.g:8130:3: ( 'in' )
            {
             before(grammarAccess.getExpressionAccess().getOperatorsInKeyword_1_0_1_0()); 
            // InternalPascal.g:8131:3: ( 'in' )
            // InternalPascal.g:8132:4: 'in'
            {
             before(grammarAccess.getExpressionAccess().getOperatorsInKeyword_1_0_1_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getOperatorsInKeyword_1_0_1_0()); 

            }

             after(grammarAccess.getExpressionAccess().getOperatorsInKeyword_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__OperatorsAssignment_1_0_1"


    // $ANTLR start "rule__Expression__OperatorsAssignment_1_0_2"
    // InternalPascal.g:8143:1: rule__Expression__OperatorsAssignment_1_0_2 : ( ( '=' ) ) ;
    public final void rule__Expression__OperatorsAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8147:1: ( ( ( '=' ) ) )
            // InternalPascal.g:8148:2: ( ( '=' ) )
            {
            // InternalPascal.g:8148:2: ( ( '=' ) )
            // InternalPascal.g:8149:3: ( '=' )
            {
             before(grammarAccess.getExpressionAccess().getOperatorsEqualsSignKeyword_1_0_2_0()); 
            // InternalPascal.g:8150:3: ( '=' )
            // InternalPascal.g:8151:4: '='
            {
             before(grammarAccess.getExpressionAccess().getOperatorsEqualsSignKeyword_1_0_2_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getOperatorsEqualsSignKeyword_1_0_2_0()); 

            }

             after(grammarAccess.getExpressionAccess().getOperatorsEqualsSignKeyword_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__OperatorsAssignment_1_0_2"


    // $ANTLR start "rule__Expression__ExpressionsAssignment_1_1"
    // InternalPascal.g:8162:1: rule__Expression__ExpressionsAssignment_1_1 : ( rulesimple_expression ) ;
    public final void rule__Expression__ExpressionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8166:1: ( ( rulesimple_expression ) )
            // InternalPascal.g:8167:2: ( rulesimple_expression )
            {
            // InternalPascal.g:8167:2: ( rulesimple_expression )
            // InternalPascal.g:8168:3: rulesimple_expression
            {
             before(grammarAccess.getExpressionAccess().getExpressionsSimple_expressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulesimple_expression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getExpressionsSimple_expressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__ExpressionsAssignment_1_1"


    // $ANTLR start "rule__Simple_expression__PrefixOperatorAssignment_0"
    // InternalPascal.g:8177:1: rule__Simple_expression__PrefixOperatorAssignment_0 : ( RULE_ADDITION_OPERATOR ) ;
    public final void rule__Simple_expression__PrefixOperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8181:1: ( ( RULE_ADDITION_OPERATOR ) )
            // InternalPascal.g:8182:2: ( RULE_ADDITION_OPERATOR )
            {
            // InternalPascal.g:8182:2: ( RULE_ADDITION_OPERATOR )
            // InternalPascal.g:8183:3: RULE_ADDITION_OPERATOR
            {
             before(grammarAccess.getSimple_expressionAccess().getPrefixOperatorADDITION_OPERATORTerminalRuleCall_0_0()); 
            match(input,RULE_ADDITION_OPERATOR,FOLLOW_2); 
             after(grammarAccess.getSimple_expressionAccess().getPrefixOperatorADDITION_OPERATORTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__PrefixOperatorAssignment_0"


    // $ANTLR start "rule__Simple_expression__TermsAssignment_1"
    // InternalPascal.g:8192:1: rule__Simple_expression__TermsAssignment_1 : ( ruleterm ) ;
    public final void rule__Simple_expression__TermsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8196:1: ( ( ruleterm ) )
            // InternalPascal.g:8197:2: ( ruleterm )
            {
            // InternalPascal.g:8197:2: ( ruleterm )
            // InternalPascal.g:8198:3: ruleterm
            {
             before(grammarAccess.getSimple_expressionAccess().getTermsTermParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleterm();

            state._fsp--;

             after(grammarAccess.getSimple_expressionAccess().getTermsTermParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__TermsAssignment_1"


    // $ANTLR start "rule__Simple_expression__OperatorsAssignment_2_0_0_0"
    // InternalPascal.g:8207:1: rule__Simple_expression__OperatorsAssignment_2_0_0_0 : ( RULE_ADDITION_OPERATOR ) ;
    public final void rule__Simple_expression__OperatorsAssignment_2_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8211:1: ( ( RULE_ADDITION_OPERATOR ) )
            // InternalPascal.g:8212:2: ( RULE_ADDITION_OPERATOR )
            {
            // InternalPascal.g:8212:2: ( RULE_ADDITION_OPERATOR )
            // InternalPascal.g:8213:3: RULE_ADDITION_OPERATOR
            {
             before(grammarAccess.getSimple_expressionAccess().getOperatorsADDITION_OPERATORTerminalRuleCall_2_0_0_0_0()); 
            match(input,RULE_ADDITION_OPERATOR,FOLLOW_2); 
             after(grammarAccess.getSimple_expressionAccess().getOperatorsADDITION_OPERATORTerminalRuleCall_2_0_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__OperatorsAssignment_2_0_0_0"


    // $ANTLR start "rule__Simple_expression__OperatorsAssignment_2_0_0_1"
    // InternalPascal.g:8222:1: rule__Simple_expression__OperatorsAssignment_2_0_0_1 : ( ( 'or' ) ) ;
    public final void rule__Simple_expression__OperatorsAssignment_2_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8226:1: ( ( ( 'or' ) ) )
            // InternalPascal.g:8227:2: ( ( 'or' ) )
            {
            // InternalPascal.g:8227:2: ( ( 'or' ) )
            // InternalPascal.g:8228:3: ( 'or' )
            {
             before(grammarAccess.getSimple_expressionAccess().getOperatorsOrKeyword_2_0_0_1_0()); 
            // InternalPascal.g:8229:3: ( 'or' )
            // InternalPascal.g:8230:4: 'or'
            {
             before(grammarAccess.getSimple_expressionAccess().getOperatorsOrKeyword_2_0_0_1_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getSimple_expressionAccess().getOperatorsOrKeyword_2_0_0_1_0()); 

            }

             after(grammarAccess.getSimple_expressionAccess().getOperatorsOrKeyword_2_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__OperatorsAssignment_2_0_0_1"


    // $ANTLR start "rule__Simple_expression__TermsAssignment_2_0_1"
    // InternalPascal.g:8241:1: rule__Simple_expression__TermsAssignment_2_0_1 : ( ruleterm ) ;
    public final void rule__Simple_expression__TermsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8245:1: ( ( ruleterm ) )
            // InternalPascal.g:8246:2: ( ruleterm )
            {
            // InternalPascal.g:8246:2: ( ruleterm )
            // InternalPascal.g:8247:3: ruleterm
            {
             before(grammarAccess.getSimple_expressionAccess().getTermsTermParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleterm();

            state._fsp--;

             after(grammarAccess.getSimple_expressionAccess().getTermsTermParserRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__TermsAssignment_2_0_1"


    // $ANTLR start "rule__Simple_expression__TermsAssignment_2_1"
    // InternalPascal.g:8256:1: rule__Simple_expression__TermsAssignment_2_1 : ( ruleunsigned_number ) ;
    public final void rule__Simple_expression__TermsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8260:1: ( ( ruleunsigned_number ) )
            // InternalPascal.g:8261:2: ( ruleunsigned_number )
            {
            // InternalPascal.g:8261:2: ( ruleunsigned_number )
            // InternalPascal.g:8262:3: ruleunsigned_number
            {
             before(grammarAccess.getSimple_expressionAccess().getTermsUnsigned_numberParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleunsigned_number();

            state._fsp--;

             after(grammarAccess.getSimple_expressionAccess().getTermsUnsigned_numberParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_expression__TermsAssignment_2_1"


    // $ANTLR start "rule__Term__FactorsAssignment_0"
    // InternalPascal.g:8271:1: rule__Term__FactorsAssignment_0 : ( rulefactor ) ;
    public final void rule__Term__FactorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8275:1: ( ( rulefactor ) )
            // InternalPascal.g:8276:2: ( rulefactor )
            {
            // InternalPascal.g:8276:2: ( rulefactor )
            // InternalPascal.g:8277:3: rulefactor
            {
             before(grammarAccess.getTermAccess().getFactorsFactorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulefactor();

            state._fsp--;

             after(grammarAccess.getTermAccess().getFactorsFactorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__FactorsAssignment_0"


    // $ANTLR start "rule__Term__OperatorsAssignment_1_0_0"
    // InternalPascal.g:8286:1: rule__Term__OperatorsAssignment_1_0_0 : ( RULE_MULTIPLICATION_OPERATOR ) ;
    public final void rule__Term__OperatorsAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8290:1: ( ( RULE_MULTIPLICATION_OPERATOR ) )
            // InternalPascal.g:8291:2: ( RULE_MULTIPLICATION_OPERATOR )
            {
            // InternalPascal.g:8291:2: ( RULE_MULTIPLICATION_OPERATOR )
            // InternalPascal.g:8292:3: RULE_MULTIPLICATION_OPERATOR
            {
             before(grammarAccess.getTermAccess().getOperatorsMULTIPLICATION_OPERATORTerminalRuleCall_1_0_0_0()); 
            match(input,RULE_MULTIPLICATION_OPERATOR,FOLLOW_2); 
             after(grammarAccess.getTermAccess().getOperatorsMULTIPLICATION_OPERATORTerminalRuleCall_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__OperatorsAssignment_1_0_0"


    // $ANTLR start "rule__Term__OperatorsAssignment_1_0_1"
    // InternalPascal.g:8301:1: rule__Term__OperatorsAssignment_1_0_1 : ( ( 'div' ) ) ;
    public final void rule__Term__OperatorsAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8305:1: ( ( ( 'div' ) ) )
            // InternalPascal.g:8306:2: ( ( 'div' ) )
            {
            // InternalPascal.g:8306:2: ( ( 'div' ) )
            // InternalPascal.g:8307:3: ( 'div' )
            {
             before(grammarAccess.getTermAccess().getOperatorsDivKeyword_1_0_1_0()); 
            // InternalPascal.g:8308:3: ( 'div' )
            // InternalPascal.g:8309:4: 'div'
            {
             before(grammarAccess.getTermAccess().getOperatorsDivKeyword_1_0_1_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getTermAccess().getOperatorsDivKeyword_1_0_1_0()); 

            }

             after(grammarAccess.getTermAccess().getOperatorsDivKeyword_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__OperatorsAssignment_1_0_1"


    // $ANTLR start "rule__Term__OperatorsAssignment_1_0_2"
    // InternalPascal.g:8320:1: rule__Term__OperatorsAssignment_1_0_2 : ( ( 'mod' ) ) ;
    public final void rule__Term__OperatorsAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8324:1: ( ( ( 'mod' ) ) )
            // InternalPascal.g:8325:2: ( ( 'mod' ) )
            {
            // InternalPascal.g:8325:2: ( ( 'mod' ) )
            // InternalPascal.g:8326:3: ( 'mod' )
            {
             before(grammarAccess.getTermAccess().getOperatorsModKeyword_1_0_2_0()); 
            // InternalPascal.g:8327:3: ( 'mod' )
            // InternalPascal.g:8328:4: 'mod'
            {
             before(grammarAccess.getTermAccess().getOperatorsModKeyword_1_0_2_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getTermAccess().getOperatorsModKeyword_1_0_2_0()); 

            }

             after(grammarAccess.getTermAccess().getOperatorsModKeyword_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__OperatorsAssignment_1_0_2"


    // $ANTLR start "rule__Term__OperatorsAssignment_1_0_3"
    // InternalPascal.g:8339:1: rule__Term__OperatorsAssignment_1_0_3 : ( ( 'and' ) ) ;
    public final void rule__Term__OperatorsAssignment_1_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8343:1: ( ( ( 'and' ) ) )
            // InternalPascal.g:8344:2: ( ( 'and' ) )
            {
            // InternalPascal.g:8344:2: ( ( 'and' ) )
            // InternalPascal.g:8345:3: ( 'and' )
            {
             before(grammarAccess.getTermAccess().getOperatorsAndKeyword_1_0_3_0()); 
            // InternalPascal.g:8346:3: ( 'and' )
            // InternalPascal.g:8347:4: 'and'
            {
             before(grammarAccess.getTermAccess().getOperatorsAndKeyword_1_0_3_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getTermAccess().getOperatorsAndKeyword_1_0_3_0()); 

            }

             after(grammarAccess.getTermAccess().getOperatorsAndKeyword_1_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__OperatorsAssignment_1_0_3"


    // $ANTLR start "rule__Term__FactorsAssignment_1_1"
    // InternalPascal.g:8358:1: rule__Term__FactorsAssignment_1_1 : ( rulefactor ) ;
    public final void rule__Term__FactorsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8362:1: ( ( rulefactor ) )
            // InternalPascal.g:8363:2: ( rulefactor )
            {
            // InternalPascal.g:8363:2: ( rulefactor )
            // InternalPascal.g:8364:3: rulefactor
            {
             before(grammarAccess.getTermAccess().getFactorsFactorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulefactor();

            state._fsp--;

             after(grammarAccess.getTermAccess().getFactorsFactorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__FactorsAssignment_1_1"


    // $ANTLR start "rule__Factor__VariableAssignment_0"
    // InternalPascal.g:8373:1: rule__Factor__VariableAssignment_0 : ( rulevariable ) ;
    public final void rule__Factor__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8377:1: ( ( rulevariable ) )
            // InternalPascal.g:8378:2: ( rulevariable )
            {
            // InternalPascal.g:8378:2: ( rulevariable )
            // InternalPascal.g:8379:3: rulevariable
            {
             before(grammarAccess.getFactorAccess().getVariableVariableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulevariable();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getVariableVariableParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__VariableAssignment_0"


    // $ANTLR start "rule__Factor__NumberAssignment_1"
    // InternalPascal.g:8388:1: rule__Factor__NumberAssignment_1 : ( rulenumber ) ;
    public final void rule__Factor__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8392:1: ( ( rulenumber ) )
            // InternalPascal.g:8393:2: ( rulenumber )
            {
            // InternalPascal.g:8393:2: ( rulenumber )
            // InternalPascal.g:8394:3: rulenumber
            {
             before(grammarAccess.getFactorAccess().getNumberNumberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulenumber();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getNumberNumberParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__NumberAssignment_1"


    // $ANTLR start "rule__Factor__StringAssignment_2"
    // InternalPascal.g:8403:1: rule__Factor__StringAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Factor__StringAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8407:1: ( ( RULE_STRING ) )
            // InternalPascal.g:8408:2: ( RULE_STRING )
            {
            // InternalPascal.g:8408:2: ( RULE_STRING )
            // InternalPascal.g:8409:3: RULE_STRING
            {
             before(grammarAccess.getFactorAccess().getStringSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getStringSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__StringAssignment_2"


    // $ANTLR start "rule__Factor__SetAssignment_3"
    // InternalPascal.g:8418:1: rule__Factor__SetAssignment_3 : ( ruleset ) ;
    public final void rule__Factor__SetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8422:1: ( ( ruleset ) )
            // InternalPascal.g:8423:2: ( ruleset )
            {
            // InternalPascal.g:8423:2: ( ruleset )
            // InternalPascal.g:8424:3: ruleset
            {
             before(grammarAccess.getFactorAccess().getSetSetParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleset();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getSetSetParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__SetAssignment_3"


    // $ANTLR start "rule__Factor__NilAssignment_4"
    // InternalPascal.g:8433:1: rule__Factor__NilAssignment_4 : ( ( 'nil' ) ) ;
    public final void rule__Factor__NilAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8437:1: ( ( ( 'nil' ) ) )
            // InternalPascal.g:8438:2: ( ( 'nil' ) )
            {
            // InternalPascal.g:8438:2: ( ( 'nil' ) )
            // InternalPascal.g:8439:3: ( 'nil' )
            {
             before(grammarAccess.getFactorAccess().getNilNilKeyword_4_0()); 
            // InternalPascal.g:8440:3: ( 'nil' )
            // InternalPascal.g:8441:4: 'nil'
            {
             before(grammarAccess.getFactorAccess().getNilNilKeyword_4_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getNilNilKeyword_4_0()); 

            }

             after(grammarAccess.getFactorAccess().getNilNilKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__NilAssignment_4"


    // $ANTLR start "rule__Factor__BooleanAssignment_5"
    // InternalPascal.g:8452:1: rule__Factor__BooleanAssignment_5 : ( ( 'true' ) ) ;
    public final void rule__Factor__BooleanAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8456:1: ( ( ( 'true' ) ) )
            // InternalPascal.g:8457:2: ( ( 'true' ) )
            {
            // InternalPascal.g:8457:2: ( ( 'true' ) )
            // InternalPascal.g:8458:3: ( 'true' )
            {
             before(grammarAccess.getFactorAccess().getBooleanTrueKeyword_5_0()); 
            // InternalPascal.g:8459:3: ( 'true' )
            // InternalPascal.g:8460:4: 'true'
            {
             before(grammarAccess.getFactorAccess().getBooleanTrueKeyword_5_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getBooleanTrueKeyword_5_0()); 

            }

             after(grammarAccess.getFactorAccess().getBooleanTrueKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__BooleanAssignment_5"


    // $ANTLR start "rule__Factor__BooleanAssignment_6"
    // InternalPascal.g:8471:1: rule__Factor__BooleanAssignment_6 : ( ( 'false' ) ) ;
    public final void rule__Factor__BooleanAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8475:1: ( ( ( 'false' ) ) )
            // InternalPascal.g:8476:2: ( ( 'false' ) )
            {
            // InternalPascal.g:8476:2: ( ( 'false' ) )
            // InternalPascal.g:8477:3: ( 'false' )
            {
             before(grammarAccess.getFactorAccess().getBooleanFalseKeyword_6_0()); 
            // InternalPascal.g:8478:3: ( 'false' )
            // InternalPascal.g:8479:4: 'false'
            {
             before(grammarAccess.getFactorAccess().getBooleanFalseKeyword_6_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getBooleanFalseKeyword_6_0()); 

            }

             after(grammarAccess.getFactorAccess().getBooleanFalseKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__BooleanAssignment_6"


    // $ANTLR start "rule__Factor__FunctionAssignment_7"
    // InternalPascal.g:8490:1: rule__Factor__FunctionAssignment_7 : ( rulefunction_designator ) ;
    public final void rule__Factor__FunctionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8494:1: ( ( rulefunction_designator ) )
            // InternalPascal.g:8495:2: ( rulefunction_designator )
            {
            // InternalPascal.g:8495:2: ( rulefunction_designator )
            // InternalPascal.g:8496:3: rulefunction_designator
            {
             before(grammarAccess.getFactorAccess().getFunctionFunction_designatorParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            rulefunction_designator();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getFunctionFunction_designatorParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__FunctionAssignment_7"


    // $ANTLR start "rule__Factor__ExpressionAssignment_8_1"
    // InternalPascal.g:8505:1: rule__Factor__ExpressionAssignment_8_1 : ( ruleexpression ) ;
    public final void rule__Factor__ExpressionAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8509:1: ( ( ruleexpression ) )
            // InternalPascal.g:8510:2: ( ruleexpression )
            {
            // InternalPascal.g:8510:2: ( ruleexpression )
            // InternalPascal.g:8511:3: ruleexpression
            {
             before(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getExpressionExpressionParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__ExpressionAssignment_8_1"


    // $ANTLR start "rule__Factor__NotAssignment_9_1"
    // InternalPascal.g:8520:1: rule__Factor__NotAssignment_9_1 : ( rulefactor ) ;
    public final void rule__Factor__NotAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8524:1: ( ( rulefactor ) )
            // InternalPascal.g:8525:2: ( rulefactor )
            {
            // InternalPascal.g:8525:2: ( rulefactor )
            // InternalPascal.g:8526:3: rulefactor
            {
             before(grammarAccess.getFactorAccess().getNotFactorParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            rulefactor();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getNotFactorParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__NotAssignment_9_1"


    // $ANTLR start "rule__Number__NumberAssignment"
    // InternalPascal.g:8535:1: rule__Number__NumberAssignment : ( ruleany_number ) ;
    public final void rule__Number__NumberAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8539:1: ( ( ruleany_number ) )
            // InternalPascal.g:8540:2: ( ruleany_number )
            {
            // InternalPascal.g:8540:2: ( ruleany_number )
            // InternalPascal.g:8541:3: ruleany_number
            {
             before(grammarAccess.getNumberAccess().getNumberAny_numberParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleany_number();

            state._fsp--;

             after(grammarAccess.getNumberAccess().getNumberAny_numberParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__NumberAssignment"


    // $ANTLR start "rule__Unsigned_number__IntegerAssignment"
    // InternalPascal.g:8550:1: rule__Unsigned_number__IntegerAssignment : ( RULE_INTEGER_NUMBER ) ;
    public final void rule__Unsigned_number__IntegerAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8554:1: ( ( RULE_INTEGER_NUMBER ) )
            // InternalPascal.g:8555:2: ( RULE_INTEGER_NUMBER )
            {
            // InternalPascal.g:8555:2: ( RULE_INTEGER_NUMBER )
            // InternalPascal.g:8556:3: RULE_INTEGER_NUMBER
            {
             before(grammarAccess.getUnsigned_numberAccess().getIntegerINTEGER_NUMBERTerminalRuleCall_0()); 
            match(input,RULE_INTEGER_NUMBER,FOLLOW_2); 
             after(grammarAccess.getUnsigned_numberAccess().getIntegerINTEGER_NUMBERTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unsigned_number__IntegerAssignment"


    // $ANTLR start "rule__Signed_number__IntegerAssignment"
    // InternalPascal.g:8565:1: rule__Signed_number__IntegerAssignment : ( RULE_SIGNED_INTEGER_NUMBER ) ;
    public final void rule__Signed_number__IntegerAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8569:1: ( ( RULE_SIGNED_INTEGER_NUMBER ) )
            // InternalPascal.g:8570:2: ( RULE_SIGNED_INTEGER_NUMBER )
            {
            // InternalPascal.g:8570:2: ( RULE_SIGNED_INTEGER_NUMBER )
            // InternalPascal.g:8571:3: RULE_SIGNED_INTEGER_NUMBER
            {
             before(grammarAccess.getSigned_numberAccess().getIntegerSIGNED_INTEGER_NUMBERTerminalRuleCall_0()); 
            match(input,RULE_SIGNED_INTEGER_NUMBER,FOLLOW_2); 
             after(grammarAccess.getSigned_numberAccess().getIntegerSIGNED_INTEGER_NUMBERTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signed_number__IntegerAssignment"


    // $ANTLR start "rule__Set__BracketsAssignment_0"
    // InternalPascal.g:8580:1: rule__Set__BracketsAssignment_0 : ( ( '[' ) ) ;
    public final void rule__Set__BracketsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8584:1: ( ( ( '[' ) ) )
            // InternalPascal.g:8585:2: ( ( '[' ) )
            {
            // InternalPascal.g:8585:2: ( ( '[' ) )
            // InternalPascal.g:8586:3: ( '[' )
            {
             before(grammarAccess.getSetAccess().getBracketsLeftSquareBracketKeyword_0_0()); 
            // InternalPascal.g:8587:3: ( '[' )
            // InternalPascal.g:8588:4: '['
            {
             before(grammarAccess.getSetAccess().getBracketsLeftSquareBracketKeyword_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSetAccess().getBracketsLeftSquareBracketKeyword_0_0()); 

            }

             after(grammarAccess.getSetAccess().getBracketsLeftSquareBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__BracketsAssignment_0"


    // $ANTLR start "rule__Set__ExpressionsAssignment_1"
    // InternalPascal.g:8599:1: rule__Set__ExpressionsAssignment_1 : ( ruleexpression_list ) ;
    public final void rule__Set__ExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8603:1: ( ( ruleexpression_list ) )
            // InternalPascal.g:8604:2: ( ruleexpression_list )
            {
            // InternalPascal.g:8604:2: ( ruleexpression_list )
            // InternalPascal.g:8605:3: ruleexpression_list
            {
             before(grammarAccess.getSetAccess().getExpressionsExpression_listParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleexpression_list();

            state._fsp--;

             after(grammarAccess.getSetAccess().getExpressionsExpression_listParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__ExpressionsAssignment_1"


    // $ANTLR start "rule__Set__BracketsAssignment_2"
    // InternalPascal.g:8614:1: rule__Set__BracketsAssignment_2 : ( ( ']' ) ) ;
    public final void rule__Set__BracketsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8618:1: ( ( ( ']' ) ) )
            // InternalPascal.g:8619:2: ( ( ']' ) )
            {
            // InternalPascal.g:8619:2: ( ( ']' ) )
            // InternalPascal.g:8620:3: ( ']' )
            {
             before(grammarAccess.getSetAccess().getBracketsRightSquareBracketKeyword_2_0()); 
            // InternalPascal.g:8621:3: ( ']' )
            // InternalPascal.g:8622:4: ']'
            {
             before(grammarAccess.getSetAccess().getBracketsRightSquareBracketKeyword_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSetAccess().getBracketsRightSquareBracketKeyword_2_0()); 

            }

             after(grammarAccess.getSetAccess().getBracketsRightSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__BracketsAssignment_2"


    // $ANTLR start "rule__Function_designator__NameAssignment_0"
    // InternalPascal.g:8633:1: rule__Function_designator__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Function_designator__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8637:1: ( ( RULE_ID ) )
            // InternalPascal.g:8638:2: ( RULE_ID )
            {
            // InternalPascal.g:8638:2: ( RULE_ID )
            // InternalPascal.g:8639:3: RULE_ID
            {
             before(grammarAccess.getFunction_designatorAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunction_designatorAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_designator__NameAssignment_0"


    // $ANTLR start "rule__Function_designator__ExpressionsAssignment_2"
    // InternalPascal.g:8648:1: rule__Function_designator__ExpressionsAssignment_2 : ( ruleexpression_list ) ;
    public final void rule__Function_designator__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8652:1: ( ( ruleexpression_list ) )
            // InternalPascal.g:8653:2: ( ruleexpression_list )
            {
            // InternalPascal.g:8653:2: ( ruleexpression_list )
            // InternalPascal.g:8654:3: ruleexpression_list
            {
             before(grammarAccess.getFunction_designatorAccess().getExpressionsExpression_listParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleexpression_list();

            state._fsp--;

             after(grammarAccess.getFunction_designatorAccess().getExpressionsExpression_listParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_designator__ExpressionsAssignment_2"


    // $ANTLR start "rule__Structured_statement__CompoundAssignment_0"
    // InternalPascal.g:8663:1: rule__Structured_statement__CompoundAssignment_0 : ( rulecompound_statement ) ;
    public final void rule__Structured_statement__CompoundAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8667:1: ( ( rulecompound_statement ) )
            // InternalPascal.g:8668:2: ( rulecompound_statement )
            {
            // InternalPascal.g:8668:2: ( rulecompound_statement )
            // InternalPascal.g:8669:3: rulecompound_statement
            {
             before(grammarAccess.getStructured_statementAccess().getCompoundCompound_statementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulecompound_statement();

            state._fsp--;

             after(grammarAccess.getStructured_statementAccess().getCompoundCompound_statementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structured_statement__CompoundAssignment_0"


    // $ANTLR start "rule__Structured_statement__RepetitiveAssignment_1"
    // InternalPascal.g:8678:1: rule__Structured_statement__RepetitiveAssignment_1 : ( rulerepetitive_statement ) ;
    public final void rule__Structured_statement__RepetitiveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8682:1: ( ( rulerepetitive_statement ) )
            // InternalPascal.g:8683:2: ( rulerepetitive_statement )
            {
            // InternalPascal.g:8683:2: ( rulerepetitive_statement )
            // InternalPascal.g:8684:3: rulerepetitive_statement
            {
             before(grammarAccess.getStructured_statementAccess().getRepetitiveRepetitive_statementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulerepetitive_statement();

            state._fsp--;

             after(grammarAccess.getStructured_statementAccess().getRepetitiveRepetitive_statementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structured_statement__RepetitiveAssignment_1"


    // $ANTLR start "rule__Structured_statement__ConditionalAssignment_2"
    // InternalPascal.g:8693:1: rule__Structured_statement__ConditionalAssignment_2 : ( ruleconditional_statement ) ;
    public final void rule__Structured_statement__ConditionalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8697:1: ( ( ruleconditional_statement ) )
            // InternalPascal.g:8698:2: ( ruleconditional_statement )
            {
            // InternalPascal.g:8698:2: ( ruleconditional_statement )
            // InternalPascal.g:8699:3: ruleconditional_statement
            {
             before(grammarAccess.getStructured_statementAccess().getConditionalConditional_statementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleconditional_statement();

            state._fsp--;

             after(grammarAccess.getStructured_statementAccess().getConditionalConditional_statementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structured_statement__ConditionalAssignment_2"


    // $ANTLR start "rule__Compound_statement__SequenceAssignment_1"
    // InternalPascal.g:8708:1: rule__Compound_statement__SequenceAssignment_1 : ( rulestatement_sequence ) ;
    public final void rule__Compound_statement__SequenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8712:1: ( ( rulestatement_sequence ) )
            // InternalPascal.g:8713:2: ( rulestatement_sequence )
            {
            // InternalPascal.g:8713:2: ( rulestatement_sequence )
            // InternalPascal.g:8714:3: rulestatement_sequence
            {
             before(grammarAccess.getCompound_statementAccess().getSequenceStatement_sequenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulestatement_sequence();

            state._fsp--;

             after(grammarAccess.getCompound_statementAccess().getSequenceStatement_sequenceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compound_statement__SequenceAssignment_1"


    // $ANTLR start "rule__Repetitive_statement__ForStmtAssignment"
    // InternalPascal.g:8723:1: rule__Repetitive_statement__ForStmtAssignment : ( rulefor_statement ) ;
    public final void rule__Repetitive_statement__ForStmtAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8727:1: ( ( rulefor_statement ) )
            // InternalPascal.g:8728:2: ( rulefor_statement )
            {
            // InternalPascal.g:8728:2: ( rulefor_statement )
            // InternalPascal.g:8729:3: rulefor_statement
            {
             before(grammarAccess.getRepetitive_statementAccess().getForStmtFor_statementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulefor_statement();

            state._fsp--;

             after(grammarAccess.getRepetitive_statementAccess().getForStmtFor_statementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repetitive_statement__ForStmtAssignment"


    // $ANTLR start "rule__For_statement__AssignmentAssignment_1"
    // InternalPascal.g:8738:1: rule__For_statement__AssignmentAssignment_1 : ( ruleassignment_statement ) ;
    public final void rule__For_statement__AssignmentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8742:1: ( ( ruleassignment_statement ) )
            // InternalPascal.g:8743:2: ( ruleassignment_statement )
            {
            // InternalPascal.g:8743:2: ( ruleassignment_statement )
            // InternalPascal.g:8744:3: ruleassignment_statement
            {
             before(grammarAccess.getFor_statementAccess().getAssignmentAssignment_statementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleassignment_statement();

            state._fsp--;

             after(grammarAccess.getFor_statementAccess().getAssignmentAssignment_statementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For_statement__AssignmentAssignment_1"


    // $ANTLR start "rule__For_statement__ExpressionAssignment_3"
    // InternalPascal.g:8753:1: rule__For_statement__ExpressionAssignment_3 : ( ruleexpression ) ;
    public final void rule__For_statement__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8757:1: ( ( ruleexpression ) )
            // InternalPascal.g:8758:2: ( ruleexpression )
            {
            // InternalPascal.g:8758:2: ( ruleexpression )
            // InternalPascal.g:8759:3: ruleexpression
            {
             before(grammarAccess.getFor_statementAccess().getExpressionExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getFor_statementAccess().getExpressionExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For_statement__ExpressionAssignment_3"


    // $ANTLR start "rule__For_statement__StatementAssignment_5"
    // InternalPascal.g:8768:1: rule__For_statement__StatementAssignment_5 : ( rulestatement ) ;
    public final void rule__For_statement__StatementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8772:1: ( ( rulestatement ) )
            // InternalPascal.g:8773:2: ( rulestatement )
            {
            // InternalPascal.g:8773:2: ( rulestatement )
            // InternalPascal.g:8774:3: rulestatement
            {
             before(grammarAccess.getFor_statementAccess().getStatementStatementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulestatement();

            state._fsp--;

             after(grammarAccess.getFor_statementAccess().getStatementStatementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For_statement__StatementAssignment_5"


    // $ANTLR start "rule__Conditional_statement__IfStmtAssignment"
    // InternalPascal.g:8783:1: rule__Conditional_statement__IfStmtAssignment : ( ruleif_statement ) ;
    public final void rule__Conditional_statement__IfStmtAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8787:1: ( ( ruleif_statement ) )
            // InternalPascal.g:8788:2: ( ruleif_statement )
            {
            // InternalPascal.g:8788:2: ( ruleif_statement )
            // InternalPascal.g:8789:3: ruleif_statement
            {
             before(grammarAccess.getConditional_statementAccess().getIfStmtIf_statementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleif_statement();

            state._fsp--;

             after(grammarAccess.getConditional_statementAccess().getIfStmtIf_statementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional_statement__IfStmtAssignment"


    // $ANTLR start "rule__If_statement__ExpressionAssignment_1"
    // InternalPascal.g:8798:1: rule__If_statement__ExpressionAssignment_1 : ( ruleexpression ) ;
    public final void rule__If_statement__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8802:1: ( ( ruleexpression ) )
            // InternalPascal.g:8803:2: ( ruleexpression )
            {
            // InternalPascal.g:8803:2: ( ruleexpression )
            // InternalPascal.g:8804:3: ruleexpression
            {
             before(grammarAccess.getIf_statementAccess().getExpressionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleexpression();

            state._fsp--;

             after(grammarAccess.getIf_statementAccess().getExpressionExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_statement__ExpressionAssignment_1"


    // $ANTLR start "rule__If_statement__IfStatementAssignment_3"
    // InternalPascal.g:8813:1: rule__If_statement__IfStatementAssignment_3 : ( rulestatement ) ;
    public final void rule__If_statement__IfStatementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8817:1: ( ( rulestatement ) )
            // InternalPascal.g:8818:2: ( rulestatement )
            {
            // InternalPascal.g:8818:2: ( rulestatement )
            // InternalPascal.g:8819:3: rulestatement
            {
             before(grammarAccess.getIf_statementAccess().getIfStatementStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulestatement();

            state._fsp--;

             after(grammarAccess.getIf_statementAccess().getIfStatementStatementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_statement__IfStatementAssignment_3"


    // $ANTLR start "rule__If_statement__ElseStatementAssignment_4_1"
    // InternalPascal.g:8828:1: rule__If_statement__ElseStatementAssignment_4_1 : ( rulestatement ) ;
    public final void rule__If_statement__ElseStatementAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8832:1: ( ( rulestatement ) )
            // InternalPascal.g:8833:2: ( rulestatement )
            {
            // InternalPascal.g:8833:2: ( rulestatement )
            // InternalPascal.g:8834:3: rulestatement
            {
             before(grammarAccess.getIf_statementAccess().getElseStatementStatementParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            rulestatement();

            state._fsp--;

             after(grammarAccess.getIf_statementAccess().getElseStatementStatementParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If_statement__ElseStatementAssignment_4_1"


    // $ANTLR start "rule__Constant__OpteratorAssignment_0_0"
    // InternalPascal.g:8843:1: rule__Constant__OpteratorAssignment_0_0 : ( RULE_ADDITION_OPERATOR ) ;
    public final void rule__Constant__OpteratorAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8847:1: ( ( RULE_ADDITION_OPERATOR ) )
            // InternalPascal.g:8848:2: ( RULE_ADDITION_OPERATOR )
            {
            // InternalPascal.g:8848:2: ( RULE_ADDITION_OPERATOR )
            // InternalPascal.g:8849:3: RULE_ADDITION_OPERATOR
            {
             before(grammarAccess.getConstantAccess().getOpteratorADDITION_OPERATORTerminalRuleCall_0_0_0()); 
            match(input,RULE_ADDITION_OPERATOR,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getOpteratorADDITION_OPERATORTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__OpteratorAssignment_0_0"


    // $ANTLR start "rule__Constant__NameAssignment_0_1_0"
    // InternalPascal.g:8858:1: rule__Constant__NameAssignment_0_1_0 : ( RULE_ID ) ;
    public final void rule__Constant__NameAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8862:1: ( ( RULE_ID ) )
            // InternalPascal.g:8863:2: ( RULE_ID )
            {
            // InternalPascal.g:8863:2: ( RULE_ID )
            // InternalPascal.g:8864:3: RULE_ID
            {
             before(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_0_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__NameAssignment_0_1_0"


    // $ANTLR start "rule__Constant__NumberAssignment_0_1_1"
    // InternalPascal.g:8873:1: rule__Constant__NumberAssignment_0_1_1 : ( rulenumber ) ;
    public final void rule__Constant__NumberAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8877:1: ( ( rulenumber ) )
            // InternalPascal.g:8878:2: ( rulenumber )
            {
            // InternalPascal.g:8878:2: ( rulenumber )
            // InternalPascal.g:8879:3: rulenumber
            {
             before(grammarAccess.getConstantAccess().getNumberNumberParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulenumber();

            state._fsp--;

             after(grammarAccess.getConstantAccess().getNumberNumberParserRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__NumberAssignment_0_1_1"


    // $ANTLR start "rule__Constant__StringAssignment_1"
    // InternalPascal.g:8888:1: rule__Constant__StringAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Constant__StringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8892:1: ( ( RULE_STRING ) )
            // InternalPascal.g:8893:2: ( RULE_STRING )
            {
            // InternalPascal.g:8893:2: ( RULE_STRING )
            // InternalPascal.g:8894:3: RULE_STRING
            {
             before(grammarAccess.getConstantAccess().getStringSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getStringSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__StringAssignment_1"


    // $ANTLR start "rule__Constant__BoolLiteralAssignment_2"
    // InternalPascal.g:8903:1: rule__Constant__BoolLiteralAssignment_2 : ( ( 'true' ) ) ;
    public final void rule__Constant__BoolLiteralAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8907:1: ( ( ( 'true' ) ) )
            // InternalPascal.g:8908:2: ( ( 'true' ) )
            {
            // InternalPascal.g:8908:2: ( ( 'true' ) )
            // InternalPascal.g:8909:3: ( 'true' )
            {
             before(grammarAccess.getConstantAccess().getBoolLiteralTrueKeyword_2_0()); 
            // InternalPascal.g:8910:3: ( 'true' )
            // InternalPascal.g:8911:4: 'true'
            {
             before(grammarAccess.getConstantAccess().getBoolLiteralTrueKeyword_2_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getBoolLiteralTrueKeyword_2_0()); 

            }

             after(grammarAccess.getConstantAccess().getBoolLiteralTrueKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__BoolLiteralAssignment_2"


    // $ANTLR start "rule__Constant__BoolLiteralAssignment_3"
    // InternalPascal.g:8922:1: rule__Constant__BoolLiteralAssignment_3 : ( ( 'false' ) ) ;
    public final void rule__Constant__BoolLiteralAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8926:1: ( ( ( 'false' ) ) )
            // InternalPascal.g:8927:2: ( ( 'false' ) )
            {
            // InternalPascal.g:8927:2: ( ( 'false' ) )
            // InternalPascal.g:8928:3: ( 'false' )
            {
             before(grammarAccess.getConstantAccess().getBoolLiteralFalseKeyword_3_0()); 
            // InternalPascal.g:8929:3: ( 'false' )
            // InternalPascal.g:8930:4: 'false'
            {
             before(grammarAccess.getConstantAccess().getBoolLiteralFalseKeyword_3_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getBoolLiteralFalseKeyword_3_0()); 

            }

             after(grammarAccess.getConstantAccess().getBoolLiteralFalseKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__BoolLiteralAssignment_3"


    // $ANTLR start "rule__Constant__NilAssignment_4"
    // InternalPascal.g:8941:1: rule__Constant__NilAssignment_4 : ( ( 'nil' ) ) ;
    public final void rule__Constant__NilAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8945:1: ( ( ( 'nil' ) ) )
            // InternalPascal.g:8946:2: ( ( 'nil' ) )
            {
            // InternalPascal.g:8946:2: ( ( 'nil' ) )
            // InternalPascal.g:8947:3: ( 'nil' )
            {
             before(grammarAccess.getConstantAccess().getNilNilKeyword_4_0()); 
            // InternalPascal.g:8948:3: ( 'nil' )
            // InternalPascal.g:8949:4: 'nil'
            {
             before(grammarAccess.getConstantAccess().getNilNilKeyword_4_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getNilNilKeyword_4_0()); 

            }

             after(grammarAccess.getConstantAccess().getNilNilKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__NilAssignment_4"


    // $ANTLR start "rule__Constant_definition_part__ConstsAssignment_1_0"
    // InternalPascal.g:8960:1: rule__Constant_definition_part__ConstsAssignment_1_0 : ( ruleconstant_definition ) ;
    public final void rule__Constant_definition_part__ConstsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8964:1: ( ( ruleconstant_definition ) )
            // InternalPascal.g:8965:2: ( ruleconstant_definition )
            {
            // InternalPascal.g:8965:2: ( ruleconstant_definition )
            // InternalPascal.g:8966:3: ruleconstant_definition
            {
             before(grammarAccess.getConstant_definition_partAccess().getConstsConstant_definitionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleconstant_definition();

            state._fsp--;

             after(grammarAccess.getConstant_definition_partAccess().getConstsConstant_definitionParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition_part__ConstsAssignment_1_0"


    // $ANTLR start "rule__Constant_definition__NameAssignment_0"
    // InternalPascal.g:8975:1: rule__Constant_definition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Constant_definition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8979:1: ( ( RULE_ID ) )
            // InternalPascal.g:8980:2: ( RULE_ID )
            {
            // InternalPascal.g:8980:2: ( RULE_ID )
            // InternalPascal.g:8981:3: RULE_ID
            {
             before(grammarAccess.getConstant_definitionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstant_definitionAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition__NameAssignment_0"


    // $ANTLR start "rule__Constant_definition__ConstAssignment_2"
    // InternalPascal.g:8990:1: rule__Constant_definition__ConstAssignment_2 : ( ruleconstant ) ;
    public final void rule__Constant_definition__ConstAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:8994:1: ( ( ruleconstant ) )
            // InternalPascal.g:8995:2: ( ruleconstant )
            {
            // InternalPascal.g:8995:2: ( ruleconstant )
            // InternalPascal.g:8996:3: ruleconstant
            {
             before(grammarAccess.getConstant_definitionAccess().getConstConstantParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleconstant();

            state._fsp--;

             after(grammarAccess.getConstant_definitionAccess().getConstConstantParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant_definition__ConstAssignment_2"


    // $ANTLR start "rule__Type_definition_part__TypesAssignment_1_0"
    // InternalPascal.g:9005:1: rule__Type_definition_part__TypesAssignment_1_0 : ( ruletype_definition ) ;
    public final void rule__Type_definition_part__TypesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9009:1: ( ( ruletype_definition ) )
            // InternalPascal.g:9010:2: ( ruletype_definition )
            {
            // InternalPascal.g:9010:2: ( ruletype_definition )
            // InternalPascal.g:9011:3: ruletype_definition
            {
             before(grammarAccess.getType_definition_partAccess().getTypesType_definitionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruletype_definition();

            state._fsp--;

             after(grammarAccess.getType_definition_partAccess().getTypesType_definitionParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition_part__TypesAssignment_1_0"


    // $ANTLR start "rule__Type_definition__NameAssignment_0"
    // InternalPascal.g:9020:1: rule__Type_definition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Type_definition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9024:1: ( ( RULE_ID ) )
            // InternalPascal.g:9025:2: ( RULE_ID )
            {
            // InternalPascal.g:9025:2: ( RULE_ID )
            // InternalPascal.g:9026:3: RULE_ID
            {
             before(grammarAccess.getType_definitionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getType_definitionAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition__NameAssignment_0"


    // $ANTLR start "rule__Type_definition__TypeAssignment_2"
    // InternalPascal.g:9035:1: rule__Type_definition__TypeAssignment_2 : ( ruletype ) ;
    public final void rule__Type_definition__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9039:1: ( ( ruletype ) )
            // InternalPascal.g:9040:2: ( ruletype )
            {
            // InternalPascal.g:9040:2: ( ruletype )
            // InternalPascal.g:9041:3: ruletype
            {
             before(grammarAccess.getType_definitionAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruletype();

            state._fsp--;

             after(grammarAccess.getType_definitionAccess().getTypeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_definition__TypeAssignment_2"


    // $ANTLR start "rule__Type__SimpleAssignment_0"
    // InternalPascal.g:9050:1: rule__Type__SimpleAssignment_0 : ( rulesimple_type ) ;
    public final void rule__Type__SimpleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9054:1: ( ( rulesimple_type ) )
            // InternalPascal.g:9055:2: ( rulesimple_type )
            {
            // InternalPascal.g:9055:2: ( rulesimple_type )
            // InternalPascal.g:9056:3: rulesimple_type
            {
             before(grammarAccess.getTypeAccess().getSimpleSimple_typeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulesimple_type();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getSimpleSimple_typeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__SimpleAssignment_0"


    // $ANTLR start "rule__Type__StructuredAssignment_1"
    // InternalPascal.g:9065:1: rule__Type__StructuredAssignment_1 : ( rulestructured_type ) ;
    public final void rule__Type__StructuredAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9069:1: ( ( rulestructured_type ) )
            // InternalPascal.g:9070:2: ( rulestructured_type )
            {
            // InternalPascal.g:9070:2: ( rulestructured_type )
            // InternalPascal.g:9071:3: rulestructured_type
            {
             before(grammarAccess.getTypeAccess().getStructuredStructured_typeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulestructured_type();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getStructuredStructured_typeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__StructuredAssignment_1"


    // $ANTLR start "rule__Type__PointerAssignment_2"
    // InternalPascal.g:9080:1: rule__Type__PointerAssignment_2 : ( rulepointer_type ) ;
    public final void rule__Type__PointerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9084:1: ( ( rulepointer_type ) )
            // InternalPascal.g:9085:2: ( rulepointer_type )
            {
            // InternalPascal.g:9085:2: ( rulepointer_type )
            // InternalPascal.g:9086:3: rulepointer_type
            {
             before(grammarAccess.getTypeAccess().getPointerPointer_typeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulepointer_type();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getPointerPointer_typeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__PointerAssignment_2"


    // $ANTLR start "rule__Simple_type__SubrangeAssignment_0"
    // InternalPascal.g:9095:1: rule__Simple_type__SubrangeAssignment_0 : ( rulesubrange_type ) ;
    public final void rule__Simple_type__SubrangeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9099:1: ( ( rulesubrange_type ) )
            // InternalPascal.g:9100:2: ( rulesubrange_type )
            {
            // InternalPascal.g:9100:2: ( rulesubrange_type )
            // InternalPascal.g:9101:3: rulesubrange_type
            {
             before(grammarAccess.getSimple_typeAccess().getSubrangeSubrange_typeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulesubrange_type();

            state._fsp--;

             after(grammarAccess.getSimple_typeAccess().getSubrangeSubrange_typeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_type__SubrangeAssignment_0"


    // $ANTLR start "rule__Simple_type__EnumeratedAssignment_1"
    // InternalPascal.g:9110:1: rule__Simple_type__EnumeratedAssignment_1 : ( ruleenumerated_type ) ;
    public final void rule__Simple_type__EnumeratedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9114:1: ( ( ruleenumerated_type ) )
            // InternalPascal.g:9115:2: ( ruleenumerated_type )
            {
            // InternalPascal.g:9115:2: ( ruleenumerated_type )
            // InternalPascal.g:9116:3: ruleenumerated_type
            {
             before(grammarAccess.getSimple_typeAccess().getEnumeratedEnumerated_typeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleenumerated_type();

            state._fsp--;

             after(grammarAccess.getSimple_typeAccess().getEnumeratedEnumerated_typeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_type__EnumeratedAssignment_1"


    // $ANTLR start "rule__Simple_type__NameAssignment_2"
    // InternalPascal.g:9125:1: rule__Simple_type__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Simple_type__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9129:1: ( ( RULE_ID ) )
            // InternalPascal.g:9130:2: ( RULE_ID )
            {
            // InternalPascal.g:9130:2: ( RULE_ID )
            // InternalPascal.g:9131:3: RULE_ID
            {
             before(grammarAccess.getSimple_typeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSimple_typeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simple_type__NameAssignment_2"


    // $ANTLR start "rule__Subrange_type__InitialConstAssignment_0_0"
    // InternalPascal.g:9140:1: rule__Subrange_type__InitialConstAssignment_0_0 : ( ruleconstant ) ;
    public final void rule__Subrange_type__InitialConstAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9144:1: ( ( ruleconstant ) )
            // InternalPascal.g:9145:2: ( ruleconstant )
            {
            // InternalPascal.g:9145:2: ( ruleconstant )
            // InternalPascal.g:9146:3: ruleconstant
            {
             before(grammarAccess.getSubrange_typeAccess().getInitialConstConstantParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleconstant();

            state._fsp--;

             after(grammarAccess.getSubrange_typeAccess().getInitialConstConstantParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subrange_type__InitialConstAssignment_0_0"


    // $ANTLR start "rule__Subrange_type__FinalConstAssignment_0_2"
    // InternalPascal.g:9155:1: rule__Subrange_type__FinalConstAssignment_0_2 : ( ruleconstant ) ;
    public final void rule__Subrange_type__FinalConstAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9159:1: ( ( ruleconstant ) )
            // InternalPascal.g:9160:2: ( ruleconstant )
            {
            // InternalPascal.g:9160:2: ( ruleconstant )
            // InternalPascal.g:9161:3: ruleconstant
            {
             before(grammarAccess.getSubrange_typeAccess().getFinalConstConstantParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleconstant();

            state._fsp--;

             after(grammarAccess.getSubrange_typeAccess().getFinalConstConstantParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subrange_type__FinalConstAssignment_0_2"


    // $ANTLR start "rule__Subrange_type__SubrangeAssignment_1_0"
    // InternalPascal.g:9170:1: rule__Subrange_type__SubrangeAssignment_1_0 : ( RULE_NUMERIC_SUBRANGE ) ;
    public final void rule__Subrange_type__SubrangeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9174:1: ( ( RULE_NUMERIC_SUBRANGE ) )
            // InternalPascal.g:9175:2: ( RULE_NUMERIC_SUBRANGE )
            {
            // InternalPascal.g:9175:2: ( RULE_NUMERIC_SUBRANGE )
            // InternalPascal.g:9176:3: RULE_NUMERIC_SUBRANGE
            {
             before(grammarAccess.getSubrange_typeAccess().getSubrangeNUMERIC_SUBRANGETerminalRuleCall_1_0_0()); 
            match(input,RULE_NUMERIC_SUBRANGE,FOLLOW_2); 
             after(grammarAccess.getSubrange_typeAccess().getSubrangeNUMERIC_SUBRANGETerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subrange_type__SubrangeAssignment_1_0"


    // $ANTLR start "rule__Subrange_type__ConstAssignment_1_1"
    // InternalPascal.g:9185:1: rule__Subrange_type__ConstAssignment_1_1 : ( ruleconstant ) ;
    public final void rule__Subrange_type__ConstAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9189:1: ( ( ruleconstant ) )
            // InternalPascal.g:9190:2: ( ruleconstant )
            {
            // InternalPascal.g:9190:2: ( ruleconstant )
            // InternalPascal.g:9191:3: ruleconstant
            {
             before(grammarAccess.getSubrange_typeAccess().getConstConstantParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleconstant();

            state._fsp--;

             after(grammarAccess.getSubrange_typeAccess().getConstConstantParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subrange_type__ConstAssignment_1_1"


    // $ANTLR start "rule__Enumerated_type__IdentifiersAssignment_1"
    // InternalPascal.g:9200:1: rule__Enumerated_type__IdentifiersAssignment_1 : ( ruleidentifier_list ) ;
    public final void rule__Enumerated_type__IdentifiersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9204:1: ( ( ruleidentifier_list ) )
            // InternalPascal.g:9205:2: ( ruleidentifier_list )
            {
            // InternalPascal.g:9205:2: ( ruleidentifier_list )
            // InternalPascal.g:9206:3: ruleidentifier_list
            {
             before(grammarAccess.getEnumerated_typeAccess().getIdentifiersIdentifier_listParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleidentifier_list();

            state._fsp--;

             after(grammarAccess.getEnumerated_typeAccess().getIdentifiersIdentifier_listParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumerated_type__IdentifiersAssignment_1"


    // $ANTLR start "rule__Structured_type__PackedAssignment_0"
    // InternalPascal.g:9215:1: rule__Structured_type__PackedAssignment_0 : ( ( 'packed' ) ) ;
    public final void rule__Structured_type__PackedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9219:1: ( ( ( 'packed' ) ) )
            // InternalPascal.g:9220:2: ( ( 'packed' ) )
            {
            // InternalPascal.g:9220:2: ( ( 'packed' ) )
            // InternalPascal.g:9221:3: ( 'packed' )
            {
             before(grammarAccess.getStructured_typeAccess().getPackedPackedKeyword_0_0()); 
            // InternalPascal.g:9222:3: ( 'packed' )
            // InternalPascal.g:9223:4: 'packed'
            {
             before(grammarAccess.getStructured_typeAccess().getPackedPackedKeyword_0_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getStructured_typeAccess().getPackedPackedKeyword_0_0()); 

            }

             after(grammarAccess.getStructured_typeAccess().getPackedPackedKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structured_type__PackedAssignment_0"


    // $ANTLR start "rule__Structured_type__TypeAssignment_1"
    // InternalPascal.g:9234:1: rule__Structured_type__TypeAssignment_1 : ( ruleunpacked_structured_type ) ;
    public final void rule__Structured_type__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9238:1: ( ( ruleunpacked_structured_type ) )
            // InternalPascal.g:9239:2: ( ruleunpacked_structured_type )
            {
            // InternalPascal.g:9239:2: ( ruleunpacked_structured_type )
            // InternalPascal.g:9240:3: ruleunpacked_structured_type
            {
             before(grammarAccess.getStructured_typeAccess().getTypeUnpacked_structured_typeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleunpacked_structured_type();

            state._fsp--;

             after(grammarAccess.getStructured_typeAccess().getTypeUnpacked_structured_typeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structured_type__TypeAssignment_1"


    // $ANTLR start "rule__Unpacked_structured_type__ArrayAssignment_0"
    // InternalPascal.g:9249:1: rule__Unpacked_structured_type__ArrayAssignment_0 : ( rulearray_type ) ;
    public final void rule__Unpacked_structured_type__ArrayAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9253:1: ( ( rulearray_type ) )
            // InternalPascal.g:9254:2: ( rulearray_type )
            {
            // InternalPascal.g:9254:2: ( rulearray_type )
            // InternalPascal.g:9255:3: rulearray_type
            {
             before(grammarAccess.getUnpacked_structured_typeAccess().getArrayArray_typeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulearray_type();

            state._fsp--;

             after(grammarAccess.getUnpacked_structured_typeAccess().getArrayArray_typeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unpacked_structured_type__ArrayAssignment_0"


    // $ANTLR start "rule__Unpacked_structured_type__DynamicAssignment_1"
    // InternalPascal.g:9264:1: rule__Unpacked_structured_type__DynamicAssignment_1 : ( ruledynamic_array_type ) ;
    public final void rule__Unpacked_structured_type__DynamicAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9268:1: ( ( ruledynamic_array_type ) )
            // InternalPascal.g:9269:2: ( ruledynamic_array_type )
            {
            // InternalPascal.g:9269:2: ( ruledynamic_array_type )
            // InternalPascal.g:9270:3: ruledynamic_array_type
            {
             before(grammarAccess.getUnpacked_structured_typeAccess().getDynamicDynamic_array_typeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruledynamic_array_type();

            state._fsp--;

             after(grammarAccess.getUnpacked_structured_typeAccess().getDynamicDynamic_array_typeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unpacked_structured_type__DynamicAssignment_1"


    // $ANTLR start "rule__Unpacked_structured_type__SetAssignment_2"
    // InternalPascal.g:9279:1: rule__Unpacked_structured_type__SetAssignment_2 : ( ruleset_type ) ;
    public final void rule__Unpacked_structured_type__SetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9283:1: ( ( ruleset_type ) )
            // InternalPascal.g:9284:2: ( ruleset_type )
            {
            // InternalPascal.g:9284:2: ( ruleset_type )
            // InternalPascal.g:9285:3: ruleset_type
            {
             before(grammarAccess.getUnpacked_structured_typeAccess().getSetSet_typeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleset_type();

            state._fsp--;

             after(grammarAccess.getUnpacked_structured_typeAccess().getSetSet_typeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unpacked_structured_type__SetAssignment_2"


    // $ANTLR start "rule__Array_type__IndexesAssignment_2"
    // InternalPascal.g:9294:1: rule__Array_type__IndexesAssignment_2 : ( ruleindex_type ) ;
    public final void rule__Array_type__IndexesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9298:1: ( ( ruleindex_type ) )
            // InternalPascal.g:9299:2: ( ruleindex_type )
            {
            // InternalPascal.g:9299:2: ( ruleindex_type )
            // InternalPascal.g:9300:3: ruleindex_type
            {
             before(grammarAccess.getArray_typeAccess().getIndexesIndex_typeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleindex_type();

            state._fsp--;

             after(grammarAccess.getArray_typeAccess().getIndexesIndex_typeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__IndexesAssignment_2"


    // $ANTLR start "rule__Array_type__IndexesAssignment_3_1"
    // InternalPascal.g:9309:1: rule__Array_type__IndexesAssignment_3_1 : ( ruleindex_type ) ;
    public final void rule__Array_type__IndexesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9313:1: ( ( ruleindex_type ) )
            // InternalPascal.g:9314:2: ( ruleindex_type )
            {
            // InternalPascal.g:9314:2: ( ruleindex_type )
            // InternalPascal.g:9315:3: ruleindex_type
            {
             before(grammarAccess.getArray_typeAccess().getIndexesIndex_typeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleindex_type();

            state._fsp--;

             after(grammarAccess.getArray_typeAccess().getIndexesIndex_typeParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__IndexesAssignment_3_1"


    // $ANTLR start "rule__Array_type__TypeAssignment_6"
    // InternalPascal.g:9324:1: rule__Array_type__TypeAssignment_6 : ( ruletype ) ;
    public final void rule__Array_type__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9328:1: ( ( ruletype ) )
            // InternalPascal.g:9329:2: ( ruletype )
            {
            // InternalPascal.g:9329:2: ( ruletype )
            // InternalPascal.g:9330:3: ruletype
            {
             before(grammarAccess.getArray_typeAccess().getTypeTypeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruletype();

            state._fsp--;

             after(grammarAccess.getArray_typeAccess().getTypeTypeParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array_type__TypeAssignment_6"


    // $ANTLR start "rule__Dynamic_array_type__TypeAssignment_2"
    // InternalPascal.g:9339:1: rule__Dynamic_array_type__TypeAssignment_2 : ( ruletype ) ;
    public final void rule__Dynamic_array_type__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9343:1: ( ( ruletype ) )
            // InternalPascal.g:9344:2: ( ruletype )
            {
            // InternalPascal.g:9344:2: ( ruletype )
            // InternalPascal.g:9345:3: ruletype
            {
             before(grammarAccess.getDynamic_array_typeAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruletype();

            state._fsp--;

             after(grammarAccess.getDynamic_array_typeAccess().getTypeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamic_array_type__TypeAssignment_2"


    // $ANTLR start "rule__Index_type__TypeAssignment"
    // InternalPascal.g:9354:1: rule__Index_type__TypeAssignment : ( rulesimple_type ) ;
    public final void rule__Index_type__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9358:1: ( ( rulesimple_type ) )
            // InternalPascal.g:9359:2: ( rulesimple_type )
            {
            // InternalPascal.g:9359:2: ( rulesimple_type )
            // InternalPascal.g:9360:3: rulesimple_type
            {
             before(grammarAccess.getIndex_typeAccess().getTypeSimple_typeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulesimple_type();

            state._fsp--;

             after(grammarAccess.getIndex_typeAccess().getTypeSimple_typeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Index_type__TypeAssignment"


    // $ANTLR start "rule__Variable_identifier_list__NamesAssignment_0"
    // InternalPascal.g:9369:1: rule__Variable_identifier_list__NamesAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable_identifier_list__NamesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9373:1: ( ( RULE_ID ) )
            // InternalPascal.g:9374:2: ( RULE_ID )
            {
            // InternalPascal.g:9374:2: ( RULE_ID )
            // InternalPascal.g:9375:3: RULE_ID
            {
             before(grammarAccess.getVariable_identifier_listAccess().getNamesIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariable_identifier_listAccess().getNamesIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_identifier_list__NamesAssignment_0"


    // $ANTLR start "rule__Variable_identifier_list__NamesAssignment_1_1"
    // InternalPascal.g:9384:1: rule__Variable_identifier_list__NamesAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Variable_identifier_list__NamesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9388:1: ( ( RULE_ID ) )
            // InternalPascal.g:9389:2: ( RULE_ID )
            {
            // InternalPascal.g:9389:2: ( RULE_ID )
            // InternalPascal.g:9390:3: RULE_ID
            {
             before(grammarAccess.getVariable_identifier_listAccess().getNamesIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariable_identifier_listAccess().getNamesIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_identifier_list__NamesAssignment_1_1"


    // $ANTLR start "rule__Variable_section__IdentifiersAssignment_0"
    // InternalPascal.g:9399:1: rule__Variable_section__IdentifiersAssignment_0 : ( rulevariable_identifier_list ) ;
    public final void rule__Variable_section__IdentifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9403:1: ( ( rulevariable_identifier_list ) )
            // InternalPascal.g:9404:2: ( rulevariable_identifier_list )
            {
            // InternalPascal.g:9404:2: ( rulevariable_identifier_list )
            // InternalPascal.g:9405:3: rulevariable_identifier_list
            {
             before(grammarAccess.getVariable_sectionAccess().getIdentifiersVariable_identifier_listParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulevariable_identifier_list();

            state._fsp--;

             after(grammarAccess.getVariable_sectionAccess().getIdentifiersVariable_identifier_listParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_section__IdentifiersAssignment_0"


    // $ANTLR start "rule__Variable_section__TypeAssignment_2"
    // InternalPascal.g:9414:1: rule__Variable_section__TypeAssignment_2 : ( ruletype ) ;
    public final void rule__Variable_section__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9418:1: ( ( ruletype ) )
            // InternalPascal.g:9419:2: ( ruletype )
            {
            // InternalPascal.g:9419:2: ( ruletype )
            // InternalPascal.g:9420:3: ruletype
            {
             before(grammarAccess.getVariable_sectionAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruletype();

            state._fsp--;

             after(grammarAccess.getVariable_sectionAccess().getTypeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_section__TypeAssignment_2"


    // $ANTLR start "rule__Set_type__TypeAssignment_2"
    // InternalPascal.g:9429:1: rule__Set_type__TypeAssignment_2 : ( ruletype ) ;
    public final void rule__Set_type__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9433:1: ( ( ruletype ) )
            // InternalPascal.g:9434:2: ( ruletype )
            {
            // InternalPascal.g:9434:2: ( ruletype )
            // InternalPascal.g:9435:3: ruletype
            {
             before(grammarAccess.getSet_typeAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruletype();

            state._fsp--;

             after(grammarAccess.getSet_typeAccess().getTypeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set_type__TypeAssignment_2"


    // $ANTLR start "rule__Pointer_type__TypeAssignment_1"
    // InternalPascal.g:9444:1: rule__Pointer_type__TypeAssignment_1 : ( ruletype ) ;
    public final void rule__Pointer_type__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9448:1: ( ( ruletype ) )
            // InternalPascal.g:9449:2: ( ruletype )
            {
            // InternalPascal.g:9449:2: ( ruletype )
            // InternalPascal.g:9450:3: ruletype
            {
             before(grammarAccess.getPointer_typeAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruletype();

            state._fsp--;

             after(grammarAccess.getPointer_typeAccess().getTypeTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointer_type__TypeAssignment_1"


    // $ANTLR start "rule__Variable_declaration_part__SectionsAssignment_1"
    // InternalPascal.g:9459:1: rule__Variable_declaration_part__SectionsAssignment_1 : ( rulevariable_section ) ;
    public final void rule__Variable_declaration_part__SectionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9463:1: ( ( rulevariable_section ) )
            // InternalPascal.g:9464:2: ( rulevariable_section )
            {
            // InternalPascal.g:9464:2: ( rulevariable_section )
            // InternalPascal.g:9465:3: rulevariable_section
            {
             before(grammarAccess.getVariable_declaration_partAccess().getSectionsVariable_sectionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulevariable_section();

            state._fsp--;

             after(grammarAccess.getVariable_declaration_partAccess().getSectionsVariable_sectionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__SectionsAssignment_1"


    // $ANTLR start "rule__Variable_declaration_part__SectionsAssignment_3_0"
    // InternalPascal.g:9474:1: rule__Variable_declaration_part__SectionsAssignment_3_0 : ( rulevariable_section ) ;
    public final void rule__Variable_declaration_part__SectionsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9478:1: ( ( rulevariable_section ) )
            // InternalPascal.g:9479:2: ( rulevariable_section )
            {
            // InternalPascal.g:9479:2: ( rulevariable_section )
            // InternalPascal.g:9480:3: rulevariable_section
            {
             before(grammarAccess.getVariable_declaration_partAccess().getSectionsVariable_sectionParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            rulevariable_section();

            state._fsp--;

             after(grammarAccess.getVariable_declaration_partAccess().getSectionsVariable_sectionParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_declaration_part__SectionsAssignment_3_0"


    // $ANTLR start "rule__Procedure_and_function_declaration_part__ProceduresAssignment_0_0"
    // InternalPascal.g:9489:1: rule__Procedure_and_function_declaration_part__ProceduresAssignment_0_0 : ( ruleprocedure_declaration ) ;
    public final void rule__Procedure_and_function_declaration_part__ProceduresAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9493:1: ( ( ruleprocedure_declaration ) )
            // InternalPascal.g:9494:2: ( ruleprocedure_declaration )
            {
            // InternalPascal.g:9494:2: ( ruleprocedure_declaration )
            // InternalPascal.g:9495:3: ruleprocedure_declaration
            {
             before(grammarAccess.getProcedure_and_function_declaration_partAccess().getProceduresProcedure_declarationParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleprocedure_declaration();

            state._fsp--;

             after(grammarAccess.getProcedure_and_function_declaration_partAccess().getProceduresProcedure_declarationParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_and_function_declaration_part__ProceduresAssignment_0_0"


    // $ANTLR start "rule__Procedure_and_function_declaration_part__FunctionsAssignment_0_1"
    // InternalPascal.g:9504:1: rule__Procedure_and_function_declaration_part__FunctionsAssignment_0_1 : ( rulefunction_declaration ) ;
    public final void rule__Procedure_and_function_declaration_part__FunctionsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9508:1: ( ( rulefunction_declaration ) )
            // InternalPascal.g:9509:2: ( rulefunction_declaration )
            {
            // InternalPascal.g:9509:2: ( rulefunction_declaration )
            // InternalPascal.g:9510:3: rulefunction_declaration
            {
             before(grammarAccess.getProcedure_and_function_declaration_partAccess().getFunctionsFunction_declarationParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            rulefunction_declaration();

            state._fsp--;

             after(grammarAccess.getProcedure_and_function_declaration_partAccess().getFunctionsFunction_declarationParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_and_function_declaration_part__FunctionsAssignment_0_1"


    // $ANTLR start "rule__Procedure_declaration__HeadingAssignment_0"
    // InternalPascal.g:9519:1: rule__Procedure_declaration__HeadingAssignment_0 : ( ruleprocedure_heading ) ;
    public final void rule__Procedure_declaration__HeadingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9523:1: ( ( ruleprocedure_heading ) )
            // InternalPascal.g:9524:2: ( ruleprocedure_heading )
            {
            // InternalPascal.g:9524:2: ( ruleprocedure_heading )
            // InternalPascal.g:9525:3: ruleprocedure_heading
            {
             before(grammarAccess.getProcedure_declarationAccess().getHeadingProcedure_headingParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleprocedure_heading();

            state._fsp--;

             after(grammarAccess.getProcedure_declarationAccess().getHeadingProcedure_headingParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_declaration__HeadingAssignment_0"


    // $ANTLR start "rule__Procedure_declaration__BlockAssignment_2_0"
    // InternalPascal.g:9534:1: rule__Procedure_declaration__BlockAssignment_2_0 : ( ruleblock ) ;
    public final void rule__Procedure_declaration__BlockAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9538:1: ( ( ruleblock ) )
            // InternalPascal.g:9539:2: ( ruleblock )
            {
            // InternalPascal.g:9539:2: ( ruleblock )
            // InternalPascal.g:9540:3: ruleblock
            {
             before(grammarAccess.getProcedure_declarationAccess().getBlockBlockParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleblock();

            state._fsp--;

             after(grammarAccess.getProcedure_declarationAccess().getBlockBlockParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_declaration__BlockAssignment_2_0"


    // $ANTLR start "rule__Procedure_declaration__ForwardAssignment_2_1"
    // InternalPascal.g:9549:1: rule__Procedure_declaration__ForwardAssignment_2_1 : ( ( 'forward' ) ) ;
    public final void rule__Procedure_declaration__ForwardAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9553:1: ( ( ( 'forward' ) ) )
            // InternalPascal.g:9554:2: ( ( 'forward' ) )
            {
            // InternalPascal.g:9554:2: ( ( 'forward' ) )
            // InternalPascal.g:9555:3: ( 'forward' )
            {
             before(grammarAccess.getProcedure_declarationAccess().getForwardForwardKeyword_2_1_0()); 
            // InternalPascal.g:9556:3: ( 'forward' )
            // InternalPascal.g:9557:4: 'forward'
            {
             before(grammarAccess.getProcedure_declarationAccess().getForwardForwardKeyword_2_1_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getProcedure_declarationAccess().getForwardForwardKeyword_2_1_0()); 

            }

             after(grammarAccess.getProcedure_declarationAccess().getForwardForwardKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_declaration__ForwardAssignment_2_1"


    // $ANTLR start "rule__Procedure_heading__NameAssignment_1"
    // InternalPascal.g:9568:1: rule__Procedure_heading__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Procedure_heading__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9572:1: ( ( RULE_ID ) )
            // InternalPascal.g:9573:2: ( RULE_ID )
            {
            // InternalPascal.g:9573:2: ( RULE_ID )
            // InternalPascal.g:9574:3: RULE_ID
            {
             before(grammarAccess.getProcedure_headingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProcedure_headingAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_heading__NameAssignment_1"


    // $ANTLR start "rule__Procedure_heading__ParametersAssignment_2"
    // InternalPascal.g:9583:1: rule__Procedure_heading__ParametersAssignment_2 : ( ruleformal_parameter_list ) ;
    public final void rule__Procedure_heading__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9587:1: ( ( ruleformal_parameter_list ) )
            // InternalPascal.g:9588:2: ( ruleformal_parameter_list )
            {
            // InternalPascal.g:9588:2: ( ruleformal_parameter_list )
            // InternalPascal.g:9589:3: ruleformal_parameter_list
            {
             before(grammarAccess.getProcedure_headingAccess().getParametersFormal_parameter_listParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleformal_parameter_list();

            state._fsp--;

             after(grammarAccess.getProcedure_headingAccess().getParametersFormal_parameter_listParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Procedure_heading__ParametersAssignment_2"


    // $ANTLR start "rule__Formal_parameter_list__ParametersAssignment_1"
    // InternalPascal.g:9598:1: rule__Formal_parameter_list__ParametersAssignment_1 : ( ruleformal_parameter_section ) ;
    public final void rule__Formal_parameter_list__ParametersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9602:1: ( ( ruleformal_parameter_section ) )
            // InternalPascal.g:9603:2: ( ruleformal_parameter_section )
            {
            // InternalPascal.g:9603:2: ( ruleformal_parameter_section )
            // InternalPascal.g:9604:3: ruleformal_parameter_section
            {
             before(grammarAccess.getFormal_parameter_listAccess().getParametersFormal_parameter_sectionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleformal_parameter_section();

            state._fsp--;

             after(grammarAccess.getFormal_parameter_listAccess().getParametersFormal_parameter_sectionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_list__ParametersAssignment_1"


    // $ANTLR start "rule__Formal_parameter_list__ParametersAssignment_2_1"
    // InternalPascal.g:9613:1: rule__Formal_parameter_list__ParametersAssignment_2_1 : ( ruleformal_parameter_section ) ;
    public final void rule__Formal_parameter_list__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9617:1: ( ( ruleformal_parameter_section ) )
            // InternalPascal.g:9618:2: ( ruleformal_parameter_section )
            {
            // InternalPascal.g:9618:2: ( ruleformal_parameter_section )
            // InternalPascal.g:9619:3: ruleformal_parameter_section
            {
             before(grammarAccess.getFormal_parameter_listAccess().getParametersFormal_parameter_sectionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleformal_parameter_section();

            state._fsp--;

             after(grammarAccess.getFormal_parameter_listAccess().getParametersFormal_parameter_sectionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_list__ParametersAssignment_2_1"


    // $ANTLR start "rule__Formal_parameter_section__ValueAssignment_0"
    // InternalPascal.g:9628:1: rule__Formal_parameter_section__ValueAssignment_0 : ( rulevalue_parameter_section ) ;
    public final void rule__Formal_parameter_section__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9632:1: ( ( rulevalue_parameter_section ) )
            // InternalPascal.g:9633:2: ( rulevalue_parameter_section )
            {
            // InternalPascal.g:9633:2: ( rulevalue_parameter_section )
            // InternalPascal.g:9634:3: rulevalue_parameter_section
            {
             before(grammarAccess.getFormal_parameter_sectionAccess().getValueValue_parameter_sectionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulevalue_parameter_section();

            state._fsp--;

             after(grammarAccess.getFormal_parameter_sectionAccess().getValueValue_parameter_sectionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_section__ValueAssignment_0"


    // $ANTLR start "rule__Formal_parameter_section__VariableAssignment_1"
    // InternalPascal.g:9643:1: rule__Formal_parameter_section__VariableAssignment_1 : ( rulevariable_parameter_section ) ;
    public final void rule__Formal_parameter_section__VariableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9647:1: ( ( rulevariable_parameter_section ) )
            // InternalPascal.g:9648:2: ( rulevariable_parameter_section )
            {
            // InternalPascal.g:9648:2: ( rulevariable_parameter_section )
            // InternalPascal.g:9649:3: rulevariable_parameter_section
            {
             before(grammarAccess.getFormal_parameter_sectionAccess().getVariableVariable_parameter_sectionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulevariable_parameter_section();

            state._fsp--;

             after(grammarAccess.getFormal_parameter_sectionAccess().getVariableVariable_parameter_sectionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_section__VariableAssignment_1"


    // $ANTLR start "rule__Formal_parameter_section__ProcedureAssignment_2"
    // InternalPascal.g:9658:1: rule__Formal_parameter_section__ProcedureAssignment_2 : ( ruleprocedure_heading ) ;
    public final void rule__Formal_parameter_section__ProcedureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9662:1: ( ( ruleprocedure_heading ) )
            // InternalPascal.g:9663:2: ( ruleprocedure_heading )
            {
            // InternalPascal.g:9663:2: ( ruleprocedure_heading )
            // InternalPascal.g:9664:3: ruleprocedure_heading
            {
             before(grammarAccess.getFormal_parameter_sectionAccess().getProcedureProcedure_headingParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleprocedure_heading();

            state._fsp--;

             after(grammarAccess.getFormal_parameter_sectionAccess().getProcedureProcedure_headingParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_section__ProcedureAssignment_2"


    // $ANTLR start "rule__Formal_parameter_section__FunctionAssignment_3"
    // InternalPascal.g:9673:1: rule__Formal_parameter_section__FunctionAssignment_3 : ( rulefunction_heading ) ;
    public final void rule__Formal_parameter_section__FunctionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9677:1: ( ( rulefunction_heading ) )
            // InternalPascal.g:9678:2: ( rulefunction_heading )
            {
            // InternalPascal.g:9678:2: ( rulefunction_heading )
            // InternalPascal.g:9679:3: rulefunction_heading
            {
             before(grammarAccess.getFormal_parameter_sectionAccess().getFunctionFunction_headingParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulefunction_heading();

            state._fsp--;

             after(grammarAccess.getFormal_parameter_sectionAccess().getFunctionFunction_headingParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formal_parameter_section__FunctionAssignment_3"


    // $ANTLR start "rule__Value_parameter_section__IdentifiersAssignment_0"
    // InternalPascal.g:9688:1: rule__Value_parameter_section__IdentifiersAssignment_0 : ( ruleidentifier_list ) ;
    public final void rule__Value_parameter_section__IdentifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9692:1: ( ( ruleidentifier_list ) )
            // InternalPascal.g:9693:2: ( ruleidentifier_list )
            {
            // InternalPascal.g:9693:2: ( ruleidentifier_list )
            // InternalPascal.g:9694:3: ruleidentifier_list
            {
             before(grammarAccess.getValue_parameter_sectionAccess().getIdentifiersIdentifier_listParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleidentifier_list();

            state._fsp--;

             after(grammarAccess.getValue_parameter_sectionAccess().getIdentifiersIdentifier_listParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value_parameter_section__IdentifiersAssignment_0"


    // $ANTLR start "rule__Value_parameter_section__TypeAssignment_2"
    // InternalPascal.g:9703:1: rule__Value_parameter_section__TypeAssignment_2 : ( ruleparameter_type ) ;
    public final void rule__Value_parameter_section__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9707:1: ( ( ruleparameter_type ) )
            // InternalPascal.g:9708:2: ( ruleparameter_type )
            {
            // InternalPascal.g:9708:2: ( ruleparameter_type )
            // InternalPascal.g:9709:3: ruleparameter_type
            {
             before(grammarAccess.getValue_parameter_sectionAccess().getTypeParameter_typeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleparameter_type();

            state._fsp--;

             after(grammarAccess.getValue_parameter_sectionAccess().getTypeParameter_typeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value_parameter_section__TypeAssignment_2"


    // $ANTLR start "rule__Parameter_type__ArrayAssignment_0"
    // InternalPascal.g:9718:1: rule__Parameter_type__ArrayAssignment_0 : ( ruleconformant_array_schema ) ;
    public final void rule__Parameter_type__ArrayAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9722:1: ( ( ruleconformant_array_schema ) )
            // InternalPascal.g:9723:2: ( ruleconformant_array_schema )
            {
            // InternalPascal.g:9723:2: ( ruleconformant_array_schema )
            // InternalPascal.g:9724:3: ruleconformant_array_schema
            {
             before(grammarAccess.getParameter_typeAccess().getArrayConformant_array_schemaParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleconformant_array_schema();

            state._fsp--;

             after(grammarAccess.getParameter_typeAccess().getArrayConformant_array_schemaParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_type__ArrayAssignment_0"


    // $ANTLR start "rule__Parameter_type__NameAssignment_1"
    // InternalPascal.g:9733:1: rule__Parameter_type__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter_type__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9737:1: ( ( RULE_ID ) )
            // InternalPascal.g:9738:2: ( RULE_ID )
            {
            // InternalPascal.g:9738:2: ( RULE_ID )
            // InternalPascal.g:9739:3: RULE_ID
            {
             before(grammarAccess.getParameter_typeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameter_typeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter_type__NameAssignment_1"


    // $ANTLR start "rule__Conformant_array_schema__PackedAssignment_0"
    // InternalPascal.g:9748:1: rule__Conformant_array_schema__PackedAssignment_0 : ( rulepacked_conformant_array_schema ) ;
    public final void rule__Conformant_array_schema__PackedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9752:1: ( ( rulepacked_conformant_array_schema ) )
            // InternalPascal.g:9753:2: ( rulepacked_conformant_array_schema )
            {
            // InternalPascal.g:9753:2: ( rulepacked_conformant_array_schema )
            // InternalPascal.g:9754:3: rulepacked_conformant_array_schema
            {
             before(grammarAccess.getConformant_array_schemaAccess().getPackedPacked_conformant_array_schemaParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulepacked_conformant_array_schema();

            state._fsp--;

             after(grammarAccess.getConformant_array_schemaAccess().getPackedPacked_conformant_array_schemaParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conformant_array_schema__PackedAssignment_0"


    // $ANTLR start "rule__Conformant_array_schema__UnpackedAssignment_1"
    // InternalPascal.g:9763:1: rule__Conformant_array_schema__UnpackedAssignment_1 : ( ruleunpacked_conformant_array_schema ) ;
    public final void rule__Conformant_array_schema__UnpackedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9767:1: ( ( ruleunpacked_conformant_array_schema ) )
            // InternalPascal.g:9768:2: ( ruleunpacked_conformant_array_schema )
            {
            // InternalPascal.g:9768:2: ( ruleunpacked_conformant_array_schema )
            // InternalPascal.g:9769:3: ruleunpacked_conformant_array_schema
            {
             before(grammarAccess.getConformant_array_schemaAccess().getUnpackedUnpacked_conformant_array_schemaParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleunpacked_conformant_array_schema();

            state._fsp--;

             after(grammarAccess.getConformant_array_schemaAccess().getUnpackedUnpacked_conformant_array_schemaParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conformant_array_schema__UnpackedAssignment_1"


    // $ANTLR start "rule__Packed_conformant_array_schema__BoundAssignment_3"
    // InternalPascal.g:9778:1: rule__Packed_conformant_array_schema__BoundAssignment_3 : ( rulebound_specification ) ;
    public final void rule__Packed_conformant_array_schema__BoundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9782:1: ( ( rulebound_specification ) )
            // InternalPascal.g:9783:2: ( rulebound_specification )
            {
            // InternalPascal.g:9783:2: ( rulebound_specification )
            // InternalPascal.g:9784:3: rulebound_specification
            {
             before(grammarAccess.getPacked_conformant_array_schemaAccess().getBoundBound_specificationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulebound_specification();

            state._fsp--;

             after(grammarAccess.getPacked_conformant_array_schemaAccess().getBoundBound_specificationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Packed_conformant_array_schema__BoundAssignment_3"


    // $ANTLR start "rule__Packed_conformant_array_schema__NameAssignment_6"
    // InternalPascal.g:9793:1: rule__Packed_conformant_array_schema__NameAssignment_6 : ( RULE_ID ) ;
    public final void rule__Packed_conformant_array_schema__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9797:1: ( ( RULE_ID ) )
            // InternalPascal.g:9798:2: ( RULE_ID )
            {
            // InternalPascal.g:9798:2: ( RULE_ID )
            // InternalPascal.g:9799:3: RULE_ID
            {
             before(grammarAccess.getPacked_conformant_array_schemaAccess().getNameIDTerminalRuleCall_6_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPacked_conformant_array_schemaAccess().getNameIDTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Packed_conformant_array_schema__NameAssignment_6"


    // $ANTLR start "rule__Bound_specification__InitialAssignment_0"
    // InternalPascal.g:9808:1: rule__Bound_specification__InitialAssignment_0 : ( RULE_ID ) ;
    public final void rule__Bound_specification__InitialAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9812:1: ( ( RULE_ID ) )
            // InternalPascal.g:9813:2: ( RULE_ID )
            {
            // InternalPascal.g:9813:2: ( RULE_ID )
            // InternalPascal.g:9814:3: RULE_ID
            {
             before(grammarAccess.getBound_specificationAccess().getInitialIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBound_specificationAccess().getInitialIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_specification__InitialAssignment_0"


    // $ANTLR start "rule__Bound_specification__FinalAssignment_2"
    // InternalPascal.g:9823:1: rule__Bound_specification__FinalAssignment_2 : ( RULE_ID ) ;
    public final void rule__Bound_specification__FinalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9827:1: ( ( RULE_ID ) )
            // InternalPascal.g:9828:2: ( RULE_ID )
            {
            // InternalPascal.g:9828:2: ( RULE_ID )
            // InternalPascal.g:9829:3: RULE_ID
            {
             before(grammarAccess.getBound_specificationAccess().getFinalIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBound_specificationAccess().getFinalIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_specification__FinalAssignment_2"


    // $ANTLR start "rule__Bound_specification__NameAssignment_4"
    // InternalPascal.g:9838:1: rule__Bound_specification__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Bound_specification__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9842:1: ( ( RULE_ID ) )
            // InternalPascal.g:9843:2: ( RULE_ID )
            {
            // InternalPascal.g:9843:2: ( RULE_ID )
            // InternalPascal.g:9844:3: RULE_ID
            {
             before(grammarAccess.getBound_specificationAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBound_specificationAccess().getNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bound_specification__NameAssignment_4"


    // $ANTLR start "rule__Unpacked_conformant_array_schema__BoundsAssignment_2"
    // InternalPascal.g:9853:1: rule__Unpacked_conformant_array_schema__BoundsAssignment_2 : ( rulebound_specification ) ;
    public final void rule__Unpacked_conformant_array_schema__BoundsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9857:1: ( ( rulebound_specification ) )
            // InternalPascal.g:9858:2: ( rulebound_specification )
            {
            // InternalPascal.g:9858:2: ( rulebound_specification )
            // InternalPascal.g:9859:3: rulebound_specification
            {
             before(grammarAccess.getUnpacked_conformant_array_schemaAccess().getBoundsBound_specificationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulebound_specification();

            state._fsp--;

             after(grammarAccess.getUnpacked_conformant_array_schemaAccess().getBoundsBound_specificationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unpacked_conformant_array_schema__BoundsAssignment_2"


    // $ANTLR start "rule__Unpacked_conformant_array_schema__BoundsAssignment_3_1"
    // InternalPascal.g:9868:1: rule__Unpacked_conformant_array_schema__BoundsAssignment_3_1 : ( rulebound_specification ) ;
    public final void rule__Unpacked_conformant_array_schema__BoundsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9872:1: ( ( rulebound_specification ) )
            // InternalPascal.g:9873:2: ( rulebound_specification )
            {
            // InternalPascal.g:9873:2: ( rulebound_specification )
            // InternalPascal.g:9874:3: rulebound_specification
            {
             before(grammarAccess.getUnpacked_conformant_array_schemaAccess().getBoundsBound_specificationParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulebound_specification();

            state._fsp--;

             after(grammarAccess.getUnpacked_conformant_array_schemaAccess().getBoundsBound_specificationParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unpacked_conformant_array_schema__BoundsAssignment_3_1"


    // $ANTLR start "rule__Unpacked_conformant_array_schema__TypeAssignment_6"
    // InternalPascal.g:9883:1: rule__Unpacked_conformant_array_schema__TypeAssignment_6 : ( ruleparameter_type ) ;
    public final void rule__Unpacked_conformant_array_schema__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9887:1: ( ( ruleparameter_type ) )
            // InternalPascal.g:9888:2: ( ruleparameter_type )
            {
            // InternalPascal.g:9888:2: ( ruleparameter_type )
            // InternalPascal.g:9889:3: ruleparameter_type
            {
             before(grammarAccess.getUnpacked_conformant_array_schemaAccess().getTypeParameter_typeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleparameter_type();

            state._fsp--;

             after(grammarAccess.getUnpacked_conformant_array_schemaAccess().getTypeParameter_typeParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unpacked_conformant_array_schema__TypeAssignment_6"


    // $ANTLR start "rule__Variable_parameter_section__IdentifiersAssignment_1"
    // InternalPascal.g:9898:1: rule__Variable_parameter_section__IdentifiersAssignment_1 : ( ruleidentifier_list ) ;
    public final void rule__Variable_parameter_section__IdentifiersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9902:1: ( ( ruleidentifier_list ) )
            // InternalPascal.g:9903:2: ( ruleidentifier_list )
            {
            // InternalPascal.g:9903:2: ( ruleidentifier_list )
            // InternalPascal.g:9904:3: ruleidentifier_list
            {
             before(grammarAccess.getVariable_parameter_sectionAccess().getIdentifiersIdentifier_listParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleidentifier_list();

            state._fsp--;

             after(grammarAccess.getVariable_parameter_sectionAccess().getIdentifiersIdentifier_listParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_parameter_section__IdentifiersAssignment_1"


    // $ANTLR start "rule__Variable_parameter_section__TypeAssignment_3"
    // InternalPascal.g:9913:1: rule__Variable_parameter_section__TypeAssignment_3 : ( ruleparameter_type ) ;
    public final void rule__Variable_parameter_section__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9917:1: ( ( ruleparameter_type ) )
            // InternalPascal.g:9918:2: ( ruleparameter_type )
            {
            // InternalPascal.g:9918:2: ( ruleparameter_type )
            // InternalPascal.g:9919:3: ruleparameter_type
            {
             before(grammarAccess.getVariable_parameter_sectionAccess().getTypeParameter_typeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleparameter_type();

            state._fsp--;

             after(grammarAccess.getVariable_parameter_sectionAccess().getTypeParameter_typeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable_parameter_section__TypeAssignment_3"


    // $ANTLR start "rule__Function_heading__NameAssignment_1"
    // InternalPascal.g:9928:1: rule__Function_heading__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function_heading__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9932:1: ( ( RULE_ID ) )
            // InternalPascal.g:9933:2: ( RULE_ID )
            {
            // InternalPascal.g:9933:2: ( RULE_ID )
            // InternalPascal.g:9934:3: RULE_ID
            {
             before(grammarAccess.getFunction_headingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunction_headingAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_heading__NameAssignment_1"


    // $ANTLR start "rule__Function_heading__ParametersAssignment_2"
    // InternalPascal.g:9943:1: rule__Function_heading__ParametersAssignment_2 : ( ruleformal_parameter_list ) ;
    public final void rule__Function_heading__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9947:1: ( ( ruleformal_parameter_list ) )
            // InternalPascal.g:9948:2: ( ruleformal_parameter_list )
            {
            // InternalPascal.g:9948:2: ( ruleformal_parameter_list )
            // InternalPascal.g:9949:3: ruleformal_parameter_list
            {
             before(grammarAccess.getFunction_headingAccess().getParametersFormal_parameter_listParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleformal_parameter_list();

            state._fsp--;

             after(grammarAccess.getFunction_headingAccess().getParametersFormal_parameter_listParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_heading__ParametersAssignment_2"


    // $ANTLR start "rule__Function_heading__ReturnTypeAssignment_4"
    // InternalPascal.g:9958:1: rule__Function_heading__ReturnTypeAssignment_4 : ( RULE_ID ) ;
    public final void rule__Function_heading__ReturnTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9962:1: ( ( RULE_ID ) )
            // InternalPascal.g:9963:2: ( RULE_ID )
            {
            // InternalPascal.g:9963:2: ( RULE_ID )
            // InternalPascal.g:9964:3: RULE_ID
            {
             before(grammarAccess.getFunction_headingAccess().getReturnTypeIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunction_headingAccess().getReturnTypeIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_heading__ReturnTypeAssignment_4"


    // $ANTLR start "rule__Function_declaration__HeadingAssignment_0"
    // InternalPascal.g:9973:1: rule__Function_declaration__HeadingAssignment_0 : ( rulefunction_heading ) ;
    public final void rule__Function_declaration__HeadingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9977:1: ( ( rulefunction_heading ) )
            // InternalPascal.g:9978:2: ( rulefunction_heading )
            {
            // InternalPascal.g:9978:2: ( rulefunction_heading )
            // InternalPascal.g:9979:3: rulefunction_heading
            {
             before(grammarAccess.getFunction_declarationAccess().getHeadingFunction_headingParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulefunction_heading();

            state._fsp--;

             after(grammarAccess.getFunction_declarationAccess().getHeadingFunction_headingParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_declaration__HeadingAssignment_0"


    // $ANTLR start "rule__Function_declaration__BlockAssignment_2_0"
    // InternalPascal.g:9988:1: rule__Function_declaration__BlockAssignment_2_0 : ( ruleblock ) ;
    public final void rule__Function_declaration__BlockAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:9992:1: ( ( ruleblock ) )
            // InternalPascal.g:9993:2: ( ruleblock )
            {
            // InternalPascal.g:9993:2: ( ruleblock )
            // InternalPascal.g:9994:3: ruleblock
            {
             before(grammarAccess.getFunction_declarationAccess().getBlockBlockParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleblock();

            state._fsp--;

             after(grammarAccess.getFunction_declarationAccess().getBlockBlockParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_declaration__BlockAssignment_2_0"


    // $ANTLR start "rule__Function_declaration__ForwardAssignment_2_1"
    // InternalPascal.g:10003:1: rule__Function_declaration__ForwardAssignment_2_1 : ( ( 'forward' ) ) ;
    public final void rule__Function_declaration__ForwardAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPascal.g:10007:1: ( ( ( 'forward' ) ) )
            // InternalPascal.g:10008:2: ( ( 'forward' ) )
            {
            // InternalPascal.g:10008:2: ( ( 'forward' ) )
            // InternalPascal.g:10009:3: ( 'forward' )
            {
             before(grammarAccess.getFunction_declarationAccess().getForwardForwardKeyword_2_1_0()); 
            // InternalPascal.g:10010:3: ( 'forward' )
            // InternalPascal.g:10011:4: 'forward'
            {
             before(grammarAccess.getFunction_declarationAccess().getForwardForwardKeyword_2_1_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getFunction_declarationAccess().getForwardForwardKeyword_2_1_0()); 

            }

             after(grammarAccess.getFunction_declarationAccess().getForwardForwardKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function_declaration__ForwardAssignment_2_1"

    // Delegated rules


    protected DFA12 dfa12 = new DFA12(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\uffff\1\12\12\uffff";
    static final String dfa_3s = "\1\4\1\6\12\uffff";
    static final String dfa_4s = "\1\73\1\70\12\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\11\1\12\1\1\1\10";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\2\3\uffff\1\3\16\uffff\1\10\6\uffff\1\4\2\uffff\1\11\25\uffff\1\5\1\6\1\7",
            "\4\12\12\uffff\3\12\1\uffff\1\12\1\13\2\12\1\uffff\1\12\2\uffff\3\12\2\uffff\1\12\1\uffff\2\12\1\uffff\1\12\11\uffff\5\12",
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

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1848:1: rule__Factor__Alternatives : ( ( ( rule__Factor__VariableAssignment_0 ) ) | ( ( rule__Factor__NumberAssignment_1 ) ) | ( ( rule__Factor__StringAssignment_2 ) ) | ( ( rule__Factor__SetAssignment_3 ) ) | ( ( rule__Factor__NilAssignment_4 ) ) | ( ( rule__Factor__BooleanAssignment_5 ) ) | ( ( rule__Factor__BooleanAssignment_6 ) ) | ( ( rule__Factor__FunctionAssignment_7 ) ) | ( ( rule__Factor__Group_8__0 ) ) | ( ( rule__Factor__Group_9__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000A000000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000B0A0010000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000005010000070L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0E00000902000570L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000500400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0010040000000080L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0020000000000140L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0020000000000142L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x01C0000000000200L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x01C0000000000202L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0E00000B02000570L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0E00000906000570L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0E00000000000570L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0E04A00402000D70L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0004A00000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0E00000002000D70L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000208000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x100B0A0010000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x000B000000000010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0004200000000010L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000201000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000042000000L});

}