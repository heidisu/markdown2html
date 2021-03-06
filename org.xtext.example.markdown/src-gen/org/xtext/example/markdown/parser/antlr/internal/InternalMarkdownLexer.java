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
    public static final int RULE_ID=6;
    public static final int RULE_WS=7;
    public static final int RULE_NEWLINE=4;
    public static final int RULE_STRING=9;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=8;
    public static final int T__18=18;
    public static final int RULE_ML_COMMENT=10;
    public static final int RULE_TEXT=5;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
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
    // $ANTLR end "T__18"

    // $ANTLR start "RULE_TEXT"
    public final void mRULE_TEXT() throws RecognitionException {
        try {
            int _type = RULE_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:598:11: ( ( 'a' .. '\\u00E5' | 'A' .. '\\u00C5' ) ( RULE_ID | RULE_WS )+ )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:598:13: ( 'a' .. '\\u00E5' | 'A' .. '\\u00C5' ) ( RULE_ID | RULE_WS )+
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='\u00E5') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:598:43: ( RULE_ID | RULE_WS )+
            int cnt1=0;
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='A' && LA1_0<='\u00E5')) ) {
                    alt1=1;
                }
                else if ( (LA1_0=='\t'||LA1_0==' ') ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:598:44: RULE_ID
            	    {
            	    mRULE_ID(); 

            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:598:52: RULE_WS
            	    {
            	    mRULE_WS(); 

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
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:600:9: ( ( ' ' | '\\t' )+ )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:600:11: ( ' ' | '\\t' )+
            {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:600:11: ( ' ' | '\\t' )+
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
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:602:14: ( ( '\\r' )? '\\n' )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:602:16: ( '\\r' )? '\\n'
            {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:602:16: ( '\\r' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:602:16: '\\r'
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
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:604:9: ( ( 'a' .. '\\u00E5' | 'A' .. '\\u00C5' ) ( 'a' .. '\\u00E5' | 'A' .. '\\u00C5' | '0' .. '9' | '!' | '?' )* )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:604:11: ( 'a' .. '\\u00E5' | 'A' .. '\\u00C5' ) ( 'a' .. '\\u00E5' | 'A' .. '\\u00C5' | '0' .. '9' | '!' | '?' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='\u00E5') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:604:41: ( 'a' .. '\\u00E5' | 'A' .. '\\u00C5' | '0' .. '9' | '!' | '?' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='!'||(LA4_0>='0' && LA4_0<='9')||LA4_0=='?'||(LA4_0>='A' && LA4_0<='\u00E5')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:
            	    {
            	    if ( input.LA(1)=='!'||(input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='?'||(input.LA(1)>='A' && input.LA(1)<='\u00E5') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
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
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:606:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:606:12: ( '0' .. '9' )+
            {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:606:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:606:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:608:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:608:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:608:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:608:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:608:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:608:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:608:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:608:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:608:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:608:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:608:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop7;
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
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:610:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:610:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:610:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:610:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:612:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:612:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:612:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:612:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:612:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:612:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:612:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:612:41: '\\r'
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
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:614:16: ( . )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:614:18: .
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
        // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | RULE_TEXT | RULE_WS | RULE_NEWLINE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER )
        int alt13=15;
        alt13 = dfa13.predict(input);
        switch (alt13) {
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
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:46: RULE_TEXT
                {
                mRULE_TEXT(); 

                }
                break;
            case 8 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:56: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 9 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:64: RULE_NEWLINE
                {
                mRULE_NEWLINE(); 

                }
                break;
            case 10 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:77: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 11 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:85: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 12 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:94: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 13 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:106: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 14 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:122: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 15 :
                // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:1:138: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\14\1\20\1\22\1\24\1\uffff\1\14\2\uffff\3\14\5\uffff"+
        "\1\35\1\uffff\1\25\10\uffff\1\25\1\uffff\1\25";
    static final String DFA13_eofS =
        "\37\uffff";
    static final String DFA13_minS =
        "\1\0\1\40\1\52\2\11\1\uffff\1\12\2\uffff\2\0\1\52\5\uffff\1\11"+
        "\1\uffff\1\41\10\uffff\1\41\1\uffff\1\41";
    static final String DFA13_maxS =
        "\1\uffff\1\43\1\52\2\u00e5\1\uffff\1\12\2\uffff\2\uffff\1\57\5"+
        "\uffff\1\u00e5\1\uffff\1\u00e5\10\uffff\1\u00e5\1\uffff\1\u00e5";
    static final String DFA13_acceptS =
        "\5\uffff\1\10\1\uffff\1\11\1\13\3\uffff\1\17\1\1\1\2\1\5\1\3\1"+
        "\uffff\1\4\1\uffff\1\12\1\7\1\10\1\11\1\13\1\14\1\15\1\16\1\uffff"+
        "\1\6\1\uffff";
    static final String DFA13_specialS =
        "\1\1\10\uffff\1\0\1\2\24\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\14\1\5\1\7\2\14\1\6\22\14\1\5\1\14\1\11\1\1\3\14\1\12\2"+
            "\14\1\2\4\14\1\13\12\10\7\14\36\4\1\3\u0086\4\uff1a\14",
            "\1\15\2\uffff\1\16",
            "\1\17",
            "\1\25\26\uffff\1\25\1\24\16\uffff\12\24\5\uffff\1\24\1\uffff"+
            "\36\23\1\21\u0086\23",
            "\1\25\26\uffff\1\25\40\uffff\u00a5\23",
            "",
            "\1\27",
            "",
            "",
            "\0\31",
            "\0\31",
            "\1\32\4\uffff\1\33",
            "",
            "",
            "",
            "",
            "",
            "\1\25\26\uffff\1\25\1\36\16\uffff\12\36\5\uffff\1\36\1\uffff"+
            "\u00a5\34",
            "",
            "\1\36\16\uffff\12\36\5\uffff\1\36\1\uffff\u00a5\34",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\36\16\uffff\12\36\5\uffff\1\36\1\uffff\u00a5\34",
            "",
            "\1\36\16\uffff\12\36\5\uffff\1\36\1\uffff\u00a5\34"
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | RULE_TEXT | RULE_WS | RULE_NEWLINE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_9 = input.LA(1);

                        s = -1;
                        if ( ((LA13_9>='\u0000' && LA13_9<='\uFFFF')) ) {s = 25;}

                        else s = 12;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='#') ) {s = 1;}

                        else if ( (LA13_0=='*') ) {s = 2;}

                        else if ( (LA13_0=='_') ) {s = 3;}

                        else if ( ((LA13_0>='A' && LA13_0<='^')||(LA13_0>='`' && LA13_0<='\u00E5')) ) {s = 4;}

                        else if ( (LA13_0=='\t'||LA13_0==' ') ) {s = 5;}

                        else if ( (LA13_0=='\r') ) {s = 6;}

                        else if ( (LA13_0=='\n') ) {s = 7;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 8;}

                        else if ( (LA13_0=='\"') ) {s = 9;}

                        else if ( (LA13_0=='\'') ) {s = 10;}

                        else if ( (LA13_0=='/') ) {s = 11;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='$' && LA13_0<='&')||(LA13_0>='(' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='.')||(LA13_0>=':' && LA13_0<='@')||(LA13_0>='\u00E6' && LA13_0<='\uFFFF')) ) {s = 12;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_10 = input.LA(1);

                        s = -1;
                        if ( ((LA13_10>='\u0000' && LA13_10<='\uFFFF')) ) {s = 25;}

                        else s = 12;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}