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
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=7;
    public static final int RULE_WS=8;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_HEADER_VALUE=5;
    public static final int RULE_INT=9;
    public static final int RULE_ML_COMMENT=11;
    public static final int RULE_TEXT=6;

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

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:11:7: ( '#' )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:11:9: '#'
            {
            match('#'); 

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
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:12:7: ( '##' )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:12:9: '##'
            {
            match("##"); 


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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:14:7: ( '_' )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:14:9: '_'
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
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:15:7: ( '**' )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:15:9: '**'
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
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:16:7: ( '__' )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:16:9: '__'
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
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:556:11: ( ( 'a' .. '\\u00E5' | 'A' .. '\\u00C5' ) ( RULE_ID | RULE_WS )* )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:556:13: ( 'a' .. '\\u00E5' | 'A' .. '\\u00C5' ) ( RULE_ID | RULE_WS )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='\u00E5') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:556:43: ( RULE_ID | RULE_WS )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='A' && LA1_0<='Z')||(LA1_0>='^' && LA1_0<='_')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }
                else if ( (LA1_0=='\t'||LA1_0==' ') ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:556:44: RULE_ID
            	    {
            	    mRULE_ID(); 

            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:556:52: RULE_WS
            	    {
            	    mRULE_WS(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TEXT"

    // $ANTLR start "RULE_HEADER_VALUE"
    public final void mRULE_HEADER_VALUE() throws RecognitionException {
        try {
            int _type = RULE_HEADER_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:558:19: ( ' ' (~ ( ( '\\n' | '\\r' ) ) )* )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:558:21: ' ' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match(' '); 
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:558:25: (~ ( ( '\\n' | '\\r' ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:558:25: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEADER_VALUE"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:560:9: ( ( ' ' | '\\t' )+ )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:560:11: ( ' ' | '\\t' )+
            {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:560:11: ( ' ' | '\\t' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\t'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
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
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:562:14: ( ( '\\r' )? '\\n' )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:562:16: ( '\\r' )? '\\n'
            {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:562:16: ( '\\r' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:562:16: '\\r'
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
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:564:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:564:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:564:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:564:11: '^'
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

            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:564:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
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
            	    break loop6;
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
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:566:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:566:12: ( '0' .. '9' )+
            {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:566:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:566:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:568:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:568:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:568:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:568:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:568:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:568:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:568:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:568:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:568:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:568:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:568:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop9;
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
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:570:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:570:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:570:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:570:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
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
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:572:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:572:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:572:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:572:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop12;
                }
            } while (true);

            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:572:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:572:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:572:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:572:41: '\\r'
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
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:574:16: ( . )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:574:18: .
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
        // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | RULE_TEXT | RULE_HEADER_VALUE | RULE_WS | RULE_NEWLINE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER )
        int alt15=16;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:46: RULE_TEXT
                {
                mRULE_TEXT(); 

                }
                break;
            case 8 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:56: RULE_HEADER_VALUE
                {
                mRULE_HEADER_VALUE(); 

                }
                break;
            case 9 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:74: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 10 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:82: RULE_NEWLINE
                {
                mRULE_NEWLINE(); 

                }
                break;
            case 11 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:95: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 12 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:103: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 13 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:112: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 14 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:124: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 15 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:140: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 16 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:156: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\1\21\1\23\1\27\1\25\1\33\1\uffff\1\17\1\uffff\1\25\2\uffff"+
        "\3\17\5\uffff\1\43\1\uffff\1\25\2\uffff\1\25\1\33\7\uffff\1\25\1"+
        "\uffff\1\25";
    static final String DFA15_eofS =
        "\45\uffff";
    static final String DFA15_minS =
        "\1\0\1\43\1\52\1\11\1\101\1\11\1\uffff\1\12\1\uffff\1\60\2\uffff"+
        "\2\0\1\52\5\uffff\1\11\1\uffff\1\60\2\uffff\1\60\1\11\7\uffff\1"+
        "\60\1\uffff\1\60";
    static final String DFA15_maxS =
        "\1\uffff\1\43\1\52\2\172\1\40\1\uffff\1\12\1\uffff\1\172\2\uffff"+
        "\2\uffff\1\57\5\uffff\1\172\1\uffff\1\172\2\uffff\1\172\1\40\7\uffff"+
        "\1\172\1\uffff\1\172";
    static final String DFA15_acceptS =
        "\6\uffff\1\11\1\uffff\1\12\1\uffff\1\7\1\14\3\uffff\1\20\1\2\1"+
        "\1\1\5\1\3\1\uffff\1\7\1\uffff\1\4\1\13\2\uffff\1\10\1\11\1\12\1"+
        "\14\1\15\1\16\1\17\1\uffff\1\6\1\uffff";
    static final String DFA15_specialS =
        "\1\1\13\uffff\1\2\1\0\27\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\17\1\6\1\10\2\17\1\7\22\17\1\5\1\17\1\14\1\1\3\17\1\15"+
            "\2\17\1\2\4\17\1\16\12\13\7\17\32\11\3\12\1\4\1\3\1\12\32\11"+
            "\153\12\uff1a\17",
            "\1\20",
            "\1\22",
            "\1\25\26\uffff\1\25\17\uffff\12\30\7\uffff\32\26\3\uffff\1"+
            "\25\1\24\1\uffff\32\26",
            "\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\32\26\uffff\1\32",
            "",
            "\1\35",
            "",
            "\12\30\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "\0\37",
            "\0\37",
            "\1\40\4\uffff\1\41",
            "",
            "",
            "",
            "",
            "",
            "\1\25\26\uffff\1\25\17\uffff\12\44\7\uffff\32\42\3\uffff\1"+
            "\25\1\42\1\uffff\32\42",
            "",
            "\12\44\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\12\44\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\32\26\uffff\1\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\44\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\44\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42"
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | RULE_TEXT | RULE_HEADER_VALUE | RULE_WS | RULE_NEWLINE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_13 = input.LA(1);

                        s = -1;
                        if ( ((LA15_13>='\u0000' && LA15_13<='\uFFFF')) ) {s = 31;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='#') ) {s = 1;}

                        else if ( (LA15_0=='*') ) {s = 2;}

                        else if ( (LA15_0=='_') ) {s = 3;}

                        else if ( (LA15_0=='^') ) {s = 4;}

                        else if ( (LA15_0==' ') ) {s = 5;}

                        else if ( (LA15_0=='\t') ) {s = 6;}

                        else if ( (LA15_0=='\r') ) {s = 7;}

                        else if ( (LA15_0=='\n') ) {s = 8;}

                        else if ( ((LA15_0>='A' && LA15_0<='Z')||(LA15_0>='a' && LA15_0<='z')) ) {s = 9;}

                        else if ( ((LA15_0>='[' && LA15_0<=']')||LA15_0=='`'||(LA15_0>='{' && LA15_0<='\u00E5')) ) {s = 10;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 11;}

                        else if ( (LA15_0=='\"') ) {s = 12;}

                        else if ( (LA15_0=='\'') ) {s = 13;}

                        else if ( (LA15_0=='/') ) {s = 14;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='$' && LA15_0<='&')||(LA15_0>='(' && LA15_0<=')')||(LA15_0>='+' && LA15_0<='.')||(LA15_0>=':' && LA15_0<='@')||(LA15_0>='\u00E6' && LA15_0<='\uFFFF')) ) {s = 15;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_12 = input.LA(1);

                        s = -1;
                        if ( ((LA15_12>='\u0000' && LA15_12<='\uFFFF')) ) {s = 31;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}