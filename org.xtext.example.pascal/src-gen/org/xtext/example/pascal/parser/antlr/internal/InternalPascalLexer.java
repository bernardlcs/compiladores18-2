package org.xtext.example.pascal.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPascalLexer extends Lexer {
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

    public InternalPascalLexer() {;} 
    public InternalPascalLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPascalLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPascal.g"; }

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:11:7: ( '.' )
            // InternalPascal.g:11:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:12:7: ( 'program' )
            // InternalPascal.g:12:9: 'program'
            {
            match("program"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:13:7: ( '(' )
            // InternalPascal.g:13:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:14:7: ( ')' )
            // InternalPascal.g:14:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:15:7: ( ';' )
            // InternalPascal.g:15:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:16:7: ( ',' )
            // InternalPascal.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:17:7: ( 'begin' )
            // InternalPascal.g:17:9: 'begin'
            {
            match("begin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:18:7: ( 'end' )
            // InternalPascal.g:18:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:19:7: ( ':' )
            // InternalPascal.g:19:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:20:7: ( ':=' )
            // InternalPascal.g:20:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:21:7: ( '[' )
            // InternalPascal.g:21:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:22:7: ( ']' )
            // InternalPascal.g:22:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:23:7: ( '^' )
            // InternalPascal.g:23:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:24:7: ( 'in' )
            // InternalPascal.g:24:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:25:7: ( '=' )
            // InternalPascal.g:25:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:26:7: ( 'or' )
            // InternalPascal.g:26:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:27:7: ( 'div' )
            // InternalPascal.g:27:9: 'div'
            {
            match("div"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:28:7: ( 'mod' )
            // InternalPascal.g:28:9: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:29:7: ( 'and' )
            // InternalPascal.g:29:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:30:7: ( 'nil' )
            // InternalPascal.g:30:9: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:31:7: ( 'true' )
            // InternalPascal.g:31:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:32:7: ( 'false' )
            // InternalPascal.g:32:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:33:7: ( 'not' )
            // InternalPascal.g:33:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:34:7: ( 'for' )
            // InternalPascal.g:34:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:35:7: ( 'to' )
            // InternalPascal.g:35:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:36:7: ( 'downto' )
            // InternalPascal.g:36:9: 'downto'
            {
            match("downto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:37:7: ( 'do' )
            // InternalPascal.g:37:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:38:7: ( 'if' )
            // InternalPascal.g:38:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:39:7: ( 'then' )
            // InternalPascal.g:39:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:40:7: ( 'else' )
            // InternalPascal.g:40:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:41:7: ( 'const' )
            // InternalPascal.g:41:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:42:7: ( 'type' )
            // InternalPascal.g:42:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:43:7: ( '..' )
            // InternalPascal.g:43:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:44:7: ( 'packed' )
            // InternalPascal.g:44:9: 'packed'
            {
            match("packed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:45:7: ( 'array' )
            // InternalPascal.g:45:9: 'array'
            {
            match("array"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:46:7: ( 'of' )
            // InternalPascal.g:46:9: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:47:7: ( 'set' )
            // InternalPascal.g:47:9: 'set'
            {
            match("set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:48:7: ( 'var' )
            // InternalPascal.g:48:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:49:7: ( 'forward' )
            // InternalPascal.g:49:9: 'forward'
            {
            match("forward"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:50:7: ( 'procedure' )
            // InternalPascal.g:50:9: 'procedure'
            {
            match("procedure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:51:7: ( 'function' )
            // InternalPascal.g:51:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "RULE_NUMERIC_SUBRANGE"
    public final void mRULE_NUMERIC_SUBRANGE() throws RecognitionException {
        try {
            int _type = RULE_NUMERIC_SUBRANGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:4600:23: ( ( RULE_INTEGER_NUMBER | RULE_SIGNED_INTEGER_NUMBER ) '..' )
            // InternalPascal.g:4600:25: ( RULE_INTEGER_NUMBER | RULE_SIGNED_INTEGER_NUMBER ) '..'
            {
            // InternalPascal.g:4600:25: ( RULE_INTEGER_NUMBER | RULE_SIGNED_INTEGER_NUMBER )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                alt1=1;
            }
            else if ( (LA1_0=='+'||LA1_0=='-') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalPascal.g:4600:26: RULE_INTEGER_NUMBER
                    {
                    mRULE_INTEGER_NUMBER(); 

                    }
                    break;
                case 2 :
                    // InternalPascal.g:4600:46: RULE_SIGNED_INTEGER_NUMBER
                    {
                    mRULE_SIGNED_INTEGER_NUMBER(); 

                    }
                    break;

            }

            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMERIC_SUBRANGE"

    // $ANTLR start "RULE_ADDITION_OPERATOR"
    public final void mRULE_ADDITION_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_ADDITION_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:4602:24: ( ( '+' | '-' ) )
            // InternalPascal.g:4602:26: ( '+' | '-' )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ADDITION_OPERATOR"

    // $ANTLR start "RULE_MULTIPLICATION_OPERATOR"
    public final void mRULE_MULTIPLICATION_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_MULTIPLICATION_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:4604:30: ( ( '*' | '/' ) )
            // InternalPascal.g:4604:32: ( '*' | '/' )
            {
            if ( input.LA(1)=='*'||input.LA(1)=='/' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MULTIPLICATION_OPERATOR"

    // $ANTLR start "RULE_RELATIONAL_OPERATOR"
    public final void mRULE_RELATIONAL_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_RELATIONAL_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:4606:26: ( ( '=' | '<>' | '<' | '<=' | '>' | '>=' ) )
            // InternalPascal.g:4606:28: ( '=' | '<>' | '<' | '<=' | '>' | '>=' )
            {
            // InternalPascal.g:4606:28: ( '=' | '<>' | '<' | '<=' | '>' | '>=' )
            int alt2=6;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt2=1;
                }
                break;
            case '<':
                {
                switch ( input.LA(2) ) {
                case '>':
                    {
                    alt2=2;
                    }
                    break;
                case '=':
                    {
                    alt2=4;
                    }
                    break;
                default:
                    alt2=3;}

                }
                break;
            case '>':
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3=='=') ) {
                    alt2=6;
                }
                else {
                    alt2=5;}
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPascal.g:4606:29: '='
                    {
                    match('='); 

                    }
                    break;
                case 2 :
                    // InternalPascal.g:4606:33: '<>'
                    {
                    match("<>"); 


                    }
                    break;
                case 3 :
                    // InternalPascal.g:4606:38: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // InternalPascal.g:4606:42: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // InternalPascal.g:4606:47: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 6 :
                    // InternalPascal.g:4606:51: '>='
                    {
                    match(">="); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RELATIONAL_OPERATOR"

    // $ANTLR start "RULE_SIGNED_INTEGER_NUMBER"
    public final void mRULE_SIGNED_INTEGER_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_SIGNED_INTEGER_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:4608:28: ( RULE_ADDITION_OPERATOR RULE_INTEGER_NUMBER )
            // InternalPascal.g:4608:30: RULE_ADDITION_OPERATOR RULE_INTEGER_NUMBER
            {
            mRULE_ADDITION_OPERATOR(); 
            mRULE_INTEGER_NUMBER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIGNED_INTEGER_NUMBER"

    // $ANTLR start "RULE_INTEGER_NUMBER"
    public final void mRULE_INTEGER_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_INTEGER_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:4610:21: ( RULE_UNSIGNED_DIGIT_SEQUENCE )
            // InternalPascal.g:4610:23: RULE_UNSIGNED_DIGIT_SEQUENCE
            {
            mRULE_UNSIGNED_DIGIT_SEQUENCE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER_NUMBER"

    // $ANTLR start "RULE_UNSIGNED_DIGIT_SEQUENCE"
    public final void mRULE_UNSIGNED_DIGIT_SEQUENCE() throws RecognitionException {
        try {
            // InternalPascal.g:4612:39: ( ( RULE_DIGIT )+ )
            // InternalPascal.g:4612:41: ( RULE_DIGIT )+
            {
            // InternalPascal.g:4612:41: ( RULE_DIGIT )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPascal.g:4612:41: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNSIGNED_DIGIT_SEQUENCE"

    // $ANTLR start "RULE_DIGIT_SEQUENCE"
    public final void mRULE_DIGIT_SEQUENCE() throws RecognitionException {
        try {
            int _type = RULE_DIGIT_SEQUENCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:4614:21: ( ( RULE_ADDITION_OPERATOR )? RULE_UNSIGNED_DIGIT_SEQUENCE )
            // InternalPascal.g:4614:23: ( RULE_ADDITION_OPERATOR )? RULE_UNSIGNED_DIGIT_SEQUENCE
            {
            // InternalPascal.g:4614:23: ( RULE_ADDITION_OPERATOR )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='+'||LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPascal.g:4614:23: RULE_ADDITION_OPERATOR
                    {
                    mRULE_ADDITION_OPERATOR(); 

                    }
                    break;

            }

            mRULE_UNSIGNED_DIGIT_SEQUENCE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT_SEQUENCE"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalPascal.g:4616:21: ( '0' .. '9' )
            // InternalPascal.g:4616:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:4618:17: ( ( '(*' ( options {greedy=false; } : . )* '*)' | '{' ( options {greedy=false; } : . )* '}' ) )
            // InternalPascal.g:4618:19: ( '(*' ( options {greedy=false; } : . )* '*)' | '{' ( options {greedy=false; } : . )* '}' )
            {
            // InternalPascal.g:4618:19: ( '(*' ( options {greedy=false; } : . )* '*)' | '{' ( options {greedy=false; } : . )* '}' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='(') ) {
                alt7=1;
            }
            else if ( (LA7_0=='{') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalPascal.g:4618:20: '(*' ( options {greedy=false; } : . )* '*)'
                    {
                    match("(*"); 

                    // InternalPascal.g:4618:25: ( options {greedy=false; } : . )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='*') ) {
                            int LA5_1 = input.LA(2);

                            if ( (LA5_1==')') ) {
                                alt5=2;
                            }
                            else if ( ((LA5_1>='\u0000' && LA5_1<='(')||(LA5_1>='*' && LA5_1<='\uFFFF')) ) {
                                alt5=1;
                            }


                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<=')')||(LA5_0>='+' && LA5_0<='\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalPascal.g:4618:53: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match("*)"); 


                    }
                    break;
                case 2 :
                    // InternalPascal.g:4618:62: '{' ( options {greedy=false; } : . )* '}'
                    {
                    match('{'); 
                    // InternalPascal.g:4618:66: ( options {greedy=false; } : . )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='}') ) {
                            alt6=2;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='|')||(LA6_0>='~' && LA6_0<='\uFFFF')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalPascal.g:4618:94: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('}'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:4620:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalPascal.g:4620:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalPascal.g:4620:11: ( '^' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='^') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPascal.g:4620:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalPascal.g:4620:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPascal.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:4622:10: ( ( '0' .. '9' )+ )
            // InternalPascal.g:4622:12: ( '0' .. '9' )+
            {
            // InternalPascal.g:4622:12: ( '0' .. '9' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPascal.g:4622:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:4624:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalPascal.g:4624:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalPascal.g:4624:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\"') ) {
                alt13=1;
            }
            else if ( (LA13_0=='\'') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalPascal.g:4624:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalPascal.g:4624:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalPascal.g:4624:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPascal.g:4624:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalPascal.g:4624:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalPascal.g:4624:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalPascal.g:4624:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalPascal.g:4624:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:4626:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPascal.g:4626:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalPascal.g:4626:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPascal.g:4626:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalPascal.g:4626:40: ( ( '\\r' )? '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\n'||LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPascal.g:4626:41: ( '\\r' )? '\\n'
                    {
                    // InternalPascal.g:4626:41: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalPascal.g:4626:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:4628:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPascal.g:4628:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPascal.g:4628:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPascal.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPascal.g:4630:16: ( . )
            // InternalPascal.g:4630:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalPascal.g:1:8: ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | RULE_NUMERIC_SUBRANGE | RULE_ADDITION_OPERATOR | RULE_MULTIPLICATION_OPERATOR | RULE_RELATIONAL_OPERATOR | RULE_SIGNED_INTEGER_NUMBER | RULE_INTEGER_NUMBER | RULE_DIGIT_SEQUENCE | RULE_ML_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=55;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // InternalPascal.g:1:10: T__20
                {
                mT__20(); 

                }
                break;
            case 2 :
                // InternalPascal.g:1:16: T__21
                {
                mT__21(); 

                }
                break;
            case 3 :
                // InternalPascal.g:1:22: T__22
                {
                mT__22(); 

                }
                break;
            case 4 :
                // InternalPascal.g:1:28: T__23
                {
                mT__23(); 

                }
                break;
            case 5 :
                // InternalPascal.g:1:34: T__24
                {
                mT__24(); 

                }
                break;
            case 6 :
                // InternalPascal.g:1:40: T__25
                {
                mT__25(); 

                }
                break;
            case 7 :
                // InternalPascal.g:1:46: T__26
                {
                mT__26(); 

                }
                break;
            case 8 :
                // InternalPascal.g:1:52: T__27
                {
                mT__27(); 

                }
                break;
            case 9 :
                // InternalPascal.g:1:58: T__28
                {
                mT__28(); 

                }
                break;
            case 10 :
                // InternalPascal.g:1:64: T__29
                {
                mT__29(); 

                }
                break;
            case 11 :
                // InternalPascal.g:1:70: T__30
                {
                mT__30(); 

                }
                break;
            case 12 :
                // InternalPascal.g:1:76: T__31
                {
                mT__31(); 

                }
                break;
            case 13 :
                // InternalPascal.g:1:82: T__32
                {
                mT__32(); 

                }
                break;
            case 14 :
                // InternalPascal.g:1:88: T__33
                {
                mT__33(); 

                }
                break;
            case 15 :
                // InternalPascal.g:1:94: T__34
                {
                mT__34(); 

                }
                break;
            case 16 :
                // InternalPascal.g:1:100: T__35
                {
                mT__35(); 

                }
                break;
            case 17 :
                // InternalPascal.g:1:106: T__36
                {
                mT__36(); 

                }
                break;
            case 18 :
                // InternalPascal.g:1:112: T__37
                {
                mT__37(); 

                }
                break;
            case 19 :
                // InternalPascal.g:1:118: T__38
                {
                mT__38(); 

                }
                break;
            case 20 :
                // InternalPascal.g:1:124: T__39
                {
                mT__39(); 

                }
                break;
            case 21 :
                // InternalPascal.g:1:130: T__40
                {
                mT__40(); 

                }
                break;
            case 22 :
                // InternalPascal.g:1:136: T__41
                {
                mT__41(); 

                }
                break;
            case 23 :
                // InternalPascal.g:1:142: T__42
                {
                mT__42(); 

                }
                break;
            case 24 :
                // InternalPascal.g:1:148: T__43
                {
                mT__43(); 

                }
                break;
            case 25 :
                // InternalPascal.g:1:154: T__44
                {
                mT__44(); 

                }
                break;
            case 26 :
                // InternalPascal.g:1:160: T__45
                {
                mT__45(); 

                }
                break;
            case 27 :
                // InternalPascal.g:1:166: T__46
                {
                mT__46(); 

                }
                break;
            case 28 :
                // InternalPascal.g:1:172: T__47
                {
                mT__47(); 

                }
                break;
            case 29 :
                // InternalPascal.g:1:178: T__48
                {
                mT__48(); 

                }
                break;
            case 30 :
                // InternalPascal.g:1:184: T__49
                {
                mT__49(); 

                }
                break;
            case 31 :
                // InternalPascal.g:1:190: T__50
                {
                mT__50(); 

                }
                break;
            case 32 :
                // InternalPascal.g:1:196: T__51
                {
                mT__51(); 

                }
                break;
            case 33 :
                // InternalPascal.g:1:202: T__52
                {
                mT__52(); 

                }
                break;
            case 34 :
                // InternalPascal.g:1:208: T__53
                {
                mT__53(); 

                }
                break;
            case 35 :
                // InternalPascal.g:1:214: T__54
                {
                mT__54(); 

                }
                break;
            case 36 :
                // InternalPascal.g:1:220: T__55
                {
                mT__55(); 

                }
                break;
            case 37 :
                // InternalPascal.g:1:226: T__56
                {
                mT__56(); 

                }
                break;
            case 38 :
                // InternalPascal.g:1:232: T__57
                {
                mT__57(); 

                }
                break;
            case 39 :
                // InternalPascal.g:1:238: T__58
                {
                mT__58(); 

                }
                break;
            case 40 :
                // InternalPascal.g:1:244: T__59
                {
                mT__59(); 

                }
                break;
            case 41 :
                // InternalPascal.g:1:250: T__60
                {
                mT__60(); 

                }
                break;
            case 42 :
                // InternalPascal.g:1:256: RULE_NUMERIC_SUBRANGE
                {
                mRULE_NUMERIC_SUBRANGE(); 

                }
                break;
            case 43 :
                // InternalPascal.g:1:278: RULE_ADDITION_OPERATOR
                {
                mRULE_ADDITION_OPERATOR(); 

                }
                break;
            case 44 :
                // InternalPascal.g:1:301: RULE_MULTIPLICATION_OPERATOR
                {
                mRULE_MULTIPLICATION_OPERATOR(); 

                }
                break;
            case 45 :
                // InternalPascal.g:1:330: RULE_RELATIONAL_OPERATOR
                {
                mRULE_RELATIONAL_OPERATOR(); 

                }
                break;
            case 46 :
                // InternalPascal.g:1:355: RULE_SIGNED_INTEGER_NUMBER
                {
                mRULE_SIGNED_INTEGER_NUMBER(); 

                }
                break;
            case 47 :
                // InternalPascal.g:1:382: RULE_INTEGER_NUMBER
                {
                mRULE_INTEGER_NUMBER(); 

                }
                break;
            case 48 :
                // InternalPascal.g:1:402: RULE_DIGIT_SEQUENCE
                {
                mRULE_DIGIT_SEQUENCE(); 

                }
                break;
            case 49 :
                // InternalPascal.g:1:422: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 50 :
                // InternalPascal.g:1:438: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 51 :
                // InternalPascal.g:1:446: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 52 :
                // InternalPascal.g:1:455: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 53 :
                // InternalPascal.g:1:467: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 54 :
                // InternalPascal.g:1:483: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 55 :
                // InternalPascal.g:1:491: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\1\uffff\1\46\1\51\1\53\3\uffff\2\51\1\63\2\uffff\1\66\1\51\1\uffff\12\51\1\115\1\120\1\123\2\uffff\1\44\1\uffff\2\44\5\uffff\2\51\6\uffff\3\51\5\uffff\1\134\1\135\1\uffff\1\136\1\137\1\51\1\142\6\51\1\151\10\51\1\uffff\1\115\2\uffff\1\162\5\uffff\3\51\1\167\1\51\4\uffff\1\171\1\51\1\uffff\1\173\1\174\1\51\1\176\1\177\1\51\1\uffff\3\51\1\u0085\2\51\1\u0088\1\u0089\1\uffff\4\51\1\uffff\1\u008e\1\uffff\1\51\2\uffff\1\51\2\uffff\1\u0091\1\u0092\1\u0093\2\51\1\uffff\2\51\2\uffff\3\51\1\u009b\1\uffff\1\51\1\u009d\3\uffff\1\u009e\2\51\1\u00a1\2\51\1\u00a4\1\uffff\1\u00a5\2\uffff\2\51\1\uffff\1\u00a8\1\51\2\uffff\1\u00aa\1\51\1\uffff\1\51\1\uffff\1\u00ad\1\u00ae\2\uffff";
    static final String DFA18_eofS =
        "\u00af\uffff";
    static final String DFA18_minS =
        "\1\0\1\56\1\141\1\52\3\uffff\1\145\1\154\1\75\2\uffff\1\101\1\146\1\uffff\1\146\1\151\1\157\1\156\1\151\1\150\1\141\1\157\1\145\1\141\1\56\1\60\1\57\2\uffff\1\0\1\uffff\2\0\5\uffff\1\157\1\143\6\uffff\1\147\1\144\1\163\5\uffff\2\60\1\uffff\2\60\1\166\1\60\2\144\1\162\1\154\1\164\1\165\1\60\1\145\1\160\1\154\1\162\2\156\1\164\1\162\1\uffff\1\56\2\uffff\1\56\5\uffff\1\143\1\153\1\151\1\60\1\145\4\uffff\1\60\1\156\1\uffff\2\60\1\141\2\60\1\145\1\uffff\1\156\1\145\1\163\1\60\1\143\1\163\2\60\1\uffff\1\162\2\145\1\156\1\uffff\1\60\1\uffff\1\164\2\uffff\1\171\2\uffff\3\60\1\145\1\141\1\uffff\2\164\2\uffff\1\141\2\144\1\60\1\uffff\1\157\1\60\3\uffff\1\60\1\162\1\151\1\60\1\155\1\165\1\60\1\uffff\1\60\2\uffff\1\144\1\157\1\uffff\1\60\1\162\2\uffff\1\60\1\156\1\uffff\1\145\1\uffff\2\60\2\uffff";
    static final String DFA18_maxS =
        "\1\uffff\1\56\1\162\1\52\3\uffff\1\145\1\156\1\75\2\uffff\1\172\1\156\1\uffff\1\162\2\157\1\162\1\157\1\171\1\165\1\157\1\145\1\141\2\71\1\57\2\uffff\1\uffff\1\uffff\2\uffff\5\uffff\1\157\1\143\6\uffff\1\147\1\144\1\163\5\uffff\2\172\1\uffff\2\172\1\166\1\172\2\144\1\162\1\154\1\164\1\165\1\172\1\145\1\160\1\154\1\162\2\156\1\164\1\162\1\uffff\1\71\2\uffff\1\71\5\uffff\1\147\1\153\1\151\1\172\1\145\4\uffff\1\172\1\156\1\uffff\2\172\1\141\2\172\1\145\1\uffff\1\156\1\145\1\163\1\172\1\143\1\163\2\172\1\uffff\1\162\2\145\1\156\1\uffff\1\172\1\uffff\1\164\2\uffff\1\171\2\uffff\3\172\1\145\1\141\1\uffff\2\164\2\uffff\1\141\2\144\1\172\1\uffff\1\157\1\172\3\uffff\1\172\1\162\1\151\1\172\1\155\1\165\1\172\1\uffff\1\172\2\uffff\1\144\1\157\1\uffff\1\172\1\162\2\uffff\1\172\1\156\1\uffff\1\145\1\uffff\2\172\2\uffff";
    static final String DFA18_acceptS =
        "\4\uffff\1\4\1\5\1\6\3\uffff\1\13\1\14\2\uffff\1\17\15\uffff\2\55\1\uffff\1\62\2\uffff\1\54\1\66\1\67\1\41\1\1\2\uffff\1\62\1\61\1\3\1\4\1\5\1\6\3\uffff\1\12\1\11\1\13\1\14\1\15\2\uffff\1\17\23\uffff\1\57\1\uffff\1\52\1\53\1\uffff\1\65\1\54\1\55\1\64\1\66\5\uffff\1\16\1\34\1\20\1\44\2\uffff\1\33\6\uffff\1\31\10\uffff\1\56\4\uffff\1\10\1\uffff\1\21\1\uffff\1\22\1\23\1\uffff\1\24\1\27\5\uffff\1\30\2\uffff\1\45\1\46\4\uffff\1\36\2\uffff\1\25\1\35\1\40\7\uffff\1\7\1\uffff\1\43\1\26\2\uffff\1\37\2\uffff\1\42\1\32\2\uffff\1\2\1\uffff\1\47\2\uffff\1\51\1\50";
    static final String DFA18_specialS =
        "\1\3\35\uffff\1\2\1\uffff\1\1\1\0\u008d\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\44\2\43\2\44\1\43\22\44\1\43\1\44\1\40\4\44\1\41\1\3\1\4\1\42\1\32\1\6\1\32\1\1\1\33\12\31\1\11\1\5\1\34\1\16\1\35\2\44\32\37\1\12\1\44\1\13\1\14\1\37\1\44\1\22\1\7\1\26\1\20\1\10\1\25\2\37\1\15\3\37\1\21\1\23\1\17\1\2\2\37\1\27\1\24\1\37\1\30\4\37\1\36\uff84\44",
            "\1\45",
            "\1\50\20\uffff\1\47",
            "\1\52",
            "",
            "",
            "",
            "\1\57",
            "\1\61\1\uffff\1\60",
            "\1\62",
            "",
            "",
            "\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\70\7\uffff\1\67",
            "",
            "\1\73\13\uffff\1\72",
            "\1\74\5\uffff\1\75",
            "\1\76",
            "\1\77\3\uffff\1\100",
            "\1\101\5\uffff\1\102",
            "\1\105\6\uffff\1\104\2\uffff\1\103\6\uffff\1\106",
            "\1\107\15\uffff\1\110\5\uffff\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\117\1\uffff\12\116",
            "\12\121",
            "\1\122",
            "",
            "",
            "\0\52",
            "",
            "\0\125",
            "\0\125",
            "",
            "",
            "",
            "",
            "",
            "\1\127",
            "\1\130",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\131",
            "\1\132",
            "\1\133",
            "",
            "",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\140",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\26\51\1\141\3\51",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "",
            "\1\117\1\uffff\12\116",
            "",
            "",
            "\1\117\1\uffff\12\121",
            "",
            "",
            "",
            "",
            "",
            "\1\164\3\uffff\1\163",
            "\1\165",
            "\1\166",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\170",
            "",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\172",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\175",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0080",
            "",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\26\51\1\u0084\3\51",
            "\1\u0086",
            "\1\u0087",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u008f",
            "",
            "",
            "\1\u0090",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0094",
            "\1\u0095",
            "",
            "\1\u0096",
            "\1\u0097",
            "",
            "",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u009c",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u009f",
            "\1\u00a0",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00a2",
            "\1\u00a3",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\1\u00a6",
            "\1\u00a7",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00a9",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00ab",
            "",
            "\1\u00ac",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | RULE_NUMERIC_SUBRANGE | RULE_ADDITION_OPERATOR | RULE_MULTIPLICATION_OPERATOR | RULE_RELATIONAL_OPERATOR | RULE_SIGNED_INTEGER_NUMBER | RULE_INTEGER_NUMBER | RULE_DIGIT_SEQUENCE | RULE_ML_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_33 = input.LA(1);

                        s = -1;
                        if ( ((LA18_33>='\u0000' && LA18_33<='\uFFFF')) ) {s = 85;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_32 = input.LA(1);

                        s = -1;
                        if ( ((LA18_32>='\u0000' && LA18_32<='\uFFFF')) ) {s = 85;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_30 = input.LA(1);

                        s = -1;
                        if ( ((LA18_30>='\u0000' && LA18_30<='\uFFFF')) ) {s = 42;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='.') ) {s = 1;}

                        else if ( (LA18_0=='p') ) {s = 2;}

                        else if ( (LA18_0=='(') ) {s = 3;}

                        else if ( (LA18_0==')') ) {s = 4;}

                        else if ( (LA18_0==';') ) {s = 5;}

                        else if ( (LA18_0==',') ) {s = 6;}

                        else if ( (LA18_0=='b') ) {s = 7;}

                        else if ( (LA18_0=='e') ) {s = 8;}

                        else if ( (LA18_0==':') ) {s = 9;}

                        else if ( (LA18_0=='[') ) {s = 10;}

                        else if ( (LA18_0==']') ) {s = 11;}

                        else if ( (LA18_0=='^') ) {s = 12;}

                        else if ( (LA18_0=='i') ) {s = 13;}

                        else if ( (LA18_0=='=') ) {s = 14;}

                        else if ( (LA18_0=='o') ) {s = 15;}

                        else if ( (LA18_0=='d') ) {s = 16;}

                        else if ( (LA18_0=='m') ) {s = 17;}

                        else if ( (LA18_0=='a') ) {s = 18;}

                        else if ( (LA18_0=='n') ) {s = 19;}

                        else if ( (LA18_0=='t') ) {s = 20;}

                        else if ( (LA18_0=='f') ) {s = 21;}

                        else if ( (LA18_0=='c') ) {s = 22;}

                        else if ( (LA18_0=='s') ) {s = 23;}

                        else if ( (LA18_0=='v') ) {s = 24;}

                        else if ( ((LA18_0>='0' && LA18_0<='9')) ) {s = 25;}

                        else if ( (LA18_0=='+'||LA18_0=='-') ) {s = 26;}

                        else if ( (LA18_0=='/') ) {s = 27;}

                        else if ( (LA18_0=='<') ) {s = 28;}

                        else if ( (LA18_0=='>') ) {s = 29;}

                        else if ( (LA18_0=='{') ) {s = 30;}

                        else if ( ((LA18_0>='A' && LA18_0<='Z')||LA18_0=='_'||(LA18_0>='g' && LA18_0<='h')||(LA18_0>='j' && LA18_0<='l')||(LA18_0>='q' && LA18_0<='r')||LA18_0=='u'||(LA18_0>='w' && LA18_0<='z')) ) {s = 31;}

                        else if ( (LA18_0=='\"') ) {s = 32;}

                        else if ( (LA18_0=='\'') ) {s = 33;}

                        else if ( (LA18_0=='*') ) {s = 34;}

                        else if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {s = 35;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||LA18_0=='!'||(LA18_0>='#' && LA18_0<='&')||(LA18_0>='?' && LA18_0<='@')||LA18_0=='\\'||LA18_0=='`'||(LA18_0>='|' && LA18_0<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}