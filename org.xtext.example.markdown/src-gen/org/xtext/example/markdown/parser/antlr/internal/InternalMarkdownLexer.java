package org.xtext.example.markdown.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMarkdownLexer extends Lexer {
    public static final int RULE_NEWLINE=4;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=7;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=8;
    public static final int RULE_ML_COMMENT=10;
    public static final int RULE_TEXT=5;

    // delegates
    // delegators

    public InternalMarkdownLexer() {;} 
    public InternalMarkdownLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMarkdownLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:11:7: ( '# ' )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:11:9: '# '
            {
            match("# "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:12:7: ( '## ' )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:12:9: '## '
            {
            match("## "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:13:7: ( '*' )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:13:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:14:7: ( '* ' )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:14:9: '* '
            {
            match("* "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:15:7: ( '_' )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:15:9: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:16:7: ( '**' )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:16:9: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:17:7: ( '__' )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:17:9: '__'
            {
            match("__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "RULE_TEXT"
    public final void mRULE_TEXT() throws RecognitionException {
        try {
            int _type = RULE_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:603:11: ( ( 'a' .. '\\u00E5' | 'A' .. '\\u00C5' ) ( RULE_ID | RULE_WS | '!' | '?' )+ )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:603:13: ( 'a' .. '\\u00E5' | 'A' .. '\\u00C5' ) ( RULE_ID | RULE_WS | '!' | '?' )+
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='\u00E5') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:603:43: ( RULE_ID | RULE_WS | '!' | '?' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=5;
                switch ( input.LA(1) ) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '^':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt1=1;
                    }
                    break;
                case '\t':
                case ' ':
                    {
                    alt1=2;
                    }
                    break;
                case '!':
                    {
                    alt1=3;
                    }
                    break;
                case '?':
                    {
                    alt1=4;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:603:44: RULE_ID
            	    {
            	    mRULE_ID(); 

            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:603:52: RULE_WS
            	    {
            	    mRULE_WS(); 

            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:603:60: '!'
            	    {
            	    match('!'); 

            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:603:64: '?'
            	    {
            	    match('?'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TEXT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:605:9: ( ( ' ' | '\\t' )+ )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:605:11: ( ' ' | '\\t' )+
            {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:605:11: ( ' ' | '\\t' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\t'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_NEWLINE"
    public final void mRULE_NEWLINE() throws RecognitionException {
        try {
            int _type = RULE_NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:607:14: ( ( '\\r' )? '\\n' )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:607:16: ( '\\r' )? '\\n'
            {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:607:16: ( '\\r' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:607:16: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NEWLINE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:609:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:609:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:609:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:609:11: '^'
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

            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:609:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:
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
            	    break loop5;
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
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:611:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:611:12: ( '0' .. '9' )+
            {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:611:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:611:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:613:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:613:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:613:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:613:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:613:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:613:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:613:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:613:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:613:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:613:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:613:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop8;
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

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:615:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:615:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:615:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:615:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:617:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:617:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:617:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:617:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop11;
                }
            } while (true);

            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:617:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:617:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:617:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:617:41: '\\r'
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

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:619:16: ( . )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:619:18: .
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
        // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | RULE_TEXT | RULE_WS | RULE_NEWLINE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER )
        int alt14=16;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:52: RULE_TEXT
                {
                mRULE_TEXT(); 

                }
                break;
            case 9 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:62: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 10 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:70: RULE_NEWLINE
                {
                mRULE_NEWLINE(); 

                }
                break;
            case 11 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:83: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 12 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:91: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 13 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:100: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 14 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:112: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 15 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:128: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 16 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:144: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\1\16\1\23\1\25\1\16\1\uffff\1\16\1\uffff\1\30\1\16\1\uffff"+
        "\3\16\6\uffff\1\40\1\uffff\1\27\2\uffff\1\27\7\uffff\2\27";
    static final String DFA14_eofS =
        "\43\uffff";
    static final String DFA14_minS =
        "\1\0\2\40\2\11\1\uffff\1\12\1\uffff\2\11\1\uffff\2\0\1\52\6\uffff"+
        "\1\11\1\uffff\1\60\2\uffff\1\60\7\uffff\2\60";
    static final String DFA14_maxS =
        "\1\uffff\1\43\1\52\2\172\1\uffff\1\12\1\uffff\2\172\1\uffff\2\uffff"+
        "\1\57\6\uffff\1\172\1\uffff\1\172\2\uffff\1\172\7\uffff\2\172";
    static final String DFA14_acceptS =
        "\5\uffff\1\11\1\uffff\1\12\2\uffff\1\14\3\uffff\1\20\1\1\1\2\1"+
        "\4\1\6\1\3\1\uffff\1\5\1\uffff\1\10\1\13\1\uffff\1\11\1\12\1\14"+
        "\1\15\1\16\1\17\1\7\2\uffff";
    static final String DFA14_specialS =
        "\1\1\12\uffff\1\2\1\0\26\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\16\1\5\1\7\2\16\1\6\22\16\1\5\1\16\1\13\1\1\3\16\1\14\2"+
            "\16\1\2\4\16\1\15\12\12\7\16\32\10\3\11\1\4\1\3\1\11\32\10\153"+
            "\11\uff1a\16",
            "\1\17\2\uffff\1\20",
            "\1\21\11\uffff\1\22",
            "\1\27\26\uffff\2\27\16\uffff\12\30\5\uffff\1\27\1\uffff\32"+
            "\26\3\uffff\1\27\1\24\1\uffff\32\26",
            "\1\27\26\uffff\2\27\35\uffff\1\27\1\uffff\32\31\3\uffff\1"+
            "\27\1\31\1\uffff\32\31",
            "",
            "\1\33",
            "",
            "\1\27\26\uffff\2\27\35\uffff\1\27\1\uffff\32\26\3\uffff\1"+
            "\27\1\26\1\uffff\32\26",
            "\1\27\26\uffff\2\27\35\uffff\1\27\1\uffff\32\27\3\uffff\2"+
            "\27\1\uffff\32\27",
            "",
            "\0\35",
            "\0\35",
            "\1\36\4\uffff\1\37",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\27\26\uffff\2\27\16\uffff\12\42\5\uffff\1\27\1\uffff\32"+
            "\41\3\uffff\1\27\1\41\1\uffff\32\41",
            "",
            "\12\42\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\12\42\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\42\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\42\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41"
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | RULE_TEXT | RULE_WS | RULE_NEWLINE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_12 = input.LA(1);

                        s = -1;
                        if ( ((LA14_12>='\u0000' && LA14_12<='\uFFFF')) ) {s = 29;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='#') ) {s = 1;}

                        else if ( (LA14_0=='*') ) {s = 2;}

                        else if ( (LA14_0=='_') ) {s = 3;}

                        else if ( (LA14_0=='^') ) {s = 4;}

                        else if ( (LA14_0=='\t'||LA14_0==' ') ) {s = 5;}

                        else if ( (LA14_0=='\r') ) {s = 6;}

                        else if ( (LA14_0=='\n') ) {s = 7;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||(LA14_0>='a' && LA14_0<='z')) ) {s = 8;}

                        else if ( ((LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\u00E5')) ) {s = 9;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 10;}

                        else if ( (LA14_0=='\"') ) {s = 11;}

                        else if ( (LA14_0=='\'') ) {s = 12;}

                        else if ( (LA14_0=='/') ) {s = 13;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='$' && LA14_0<='&')||(LA14_0>='(' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='.')||(LA14_0>=':' && LA14_0<='@')||(LA14_0>='\u00E6' && LA14_0<='\uFFFF')) ) {s = 14;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_11 = input.LA(1);

                        s = -1;
                        if ( ((LA14_11>='\u0000' && LA14_11<='\uFFFF')) ) {s = 29;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}