package org.xtext.example.markdown.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.markdown.services.MarkdownGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMarkdownParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NEWLINE", "RULE_TEXT", "RULE_ID", "RULE_WS", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'*'", "'* '", "'# '", "'## '", "'_'", "'**'", "'__'"
    };
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


        public InternalMarkdownParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMarkdownParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMarkdownParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g"; }


     
     	private MarkdownGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MarkdownGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleMarkdown"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:60:1: entryRuleMarkdown : ruleMarkdown EOF ;
    public final void entryRuleMarkdown() throws RecognitionException {
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:61:1: ( ruleMarkdown EOF )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:62:1: ruleMarkdown EOF
            {
             before(grammarAccess.getMarkdownRule()); 
            pushFollow(FOLLOW_ruleMarkdown_in_entryRuleMarkdown61);
            ruleMarkdown();

            state._fsp--;

             after(grammarAccess.getMarkdownRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkdown68); 

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
    // $ANTLR end "entryRuleMarkdown"


    // $ANTLR start "ruleMarkdown"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:69:1: ruleMarkdown : ( ( rule__Markdown__ContentAssignment )* ) ;
    public final void ruleMarkdown() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:73:2: ( ( ( rule__Markdown__ContentAssignment )* ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:74:1: ( ( rule__Markdown__ContentAssignment )* )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:74:1: ( ( rule__Markdown__ContentAssignment )* )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:75:1: ( rule__Markdown__ContentAssignment )*
            {
             before(grammarAccess.getMarkdownAccess().getContentAssignment()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:76:1: ( rule__Markdown__ContentAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_TEXT||LA1_0==13||(LA1_0>=15 && LA1_0<=19)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:76:2: rule__Markdown__ContentAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Markdown__ContentAssignment_in_ruleMarkdown94);
            	    rule__Markdown__ContentAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getMarkdownAccess().getContentAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMarkdown"


    // $ANTLR start "entryRuleContent"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:88:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:89:1: ( ruleContent EOF )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:90:1: ruleContent EOF
            {
             before(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_ruleContent_in_entryRuleContent122);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getContentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContent129); 

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
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:97:1: ruleContent : ( ( rule__Content__Group__0 ) ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:101:2: ( ( ( rule__Content__Group__0 ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:102:1: ( ( rule__Content__Group__0 ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:102:1: ( ( rule__Content__Group__0 ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:103:1: ( rule__Content__Group__0 )
            {
             before(grammarAccess.getContentAccess().getGroup()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:104:1: ( rule__Content__Group__0 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:104:2: rule__Content__Group__0
            {
            pushFollow(FOLLOW_rule__Content__Group__0_in_ruleContent155);
            rule__Content__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleTextBlock"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:116:1: entryRuleTextBlock : ruleTextBlock EOF ;
    public final void entryRuleTextBlock() throws RecognitionException {
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:117:1: ( ruleTextBlock EOF )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:118:1: ruleTextBlock EOF
            {
             before(grammarAccess.getTextBlockRule()); 
            pushFollow(FOLLOW_ruleTextBlock_in_entryRuleTextBlock182);
            ruleTextBlock();

            state._fsp--;

             after(grammarAccess.getTextBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextBlock189); 

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
    // $ANTLR end "entryRuleTextBlock"


    // $ANTLR start "ruleTextBlock"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:125:1: ruleTextBlock : ( ( ( rule__TextBlock__TextAssignment ) ) ( ( rule__TextBlock__TextAssignment )* ) ) ;
    public final void ruleTextBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:129:2: ( ( ( ( rule__TextBlock__TextAssignment ) ) ( ( rule__TextBlock__TextAssignment )* ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:130:1: ( ( ( rule__TextBlock__TextAssignment ) ) ( ( rule__TextBlock__TextAssignment )* ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:130:1: ( ( ( rule__TextBlock__TextAssignment ) ) ( ( rule__TextBlock__TextAssignment )* ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:131:1: ( ( rule__TextBlock__TextAssignment ) ) ( ( rule__TextBlock__TextAssignment )* )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:131:1: ( ( rule__TextBlock__TextAssignment ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:132:1: ( rule__TextBlock__TextAssignment )
            {
             before(grammarAccess.getTextBlockAccess().getTextAssignment()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:133:1: ( rule__TextBlock__TextAssignment )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:133:2: rule__TextBlock__TextAssignment
            {
            pushFollow(FOLLOW_rule__TextBlock__TextAssignment_in_ruleTextBlock217);
            rule__TextBlock__TextAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTextBlockAccess().getTextAssignment()); 

            }

            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:136:1: ( ( rule__TextBlock__TextAssignment )* )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:137:1: ( rule__TextBlock__TextAssignment )*
            {
             before(grammarAccess.getTextBlockAccess().getTextAssignment()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:138:1: ( rule__TextBlock__TextAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_TEXT||LA2_0==13||(LA2_0>=17 && LA2_0<=19)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:138:2: rule__TextBlock__TextAssignment
            	    {
            	    pushFollow(FOLLOW_rule__TextBlock__TextAssignment_in_ruleTextBlock229);
            	    rule__TextBlock__TextAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getTextBlockAccess().getTextAssignment()); 

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
    // $ANTLR end "ruleTextBlock"


    // $ANTLR start "entryRuleHeader1"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:151:1: entryRuleHeader1 : ruleHeader1 EOF ;
    public final void entryRuleHeader1() throws RecognitionException {
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:152:1: ( ruleHeader1 EOF )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:153:1: ruleHeader1 EOF
            {
             before(grammarAccess.getHeader1Rule()); 
            pushFollow(FOLLOW_ruleHeader1_in_entryRuleHeader1259);
            ruleHeader1();

            state._fsp--;

             after(grammarAccess.getHeader1Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeader1266); 

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
    // $ANTLR end "entryRuleHeader1"


    // $ANTLR start "ruleHeader1"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:160:1: ruleHeader1 : ( ( rule__Header1__Group__0 ) ) ;
    public final void ruleHeader1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:164:2: ( ( ( rule__Header1__Group__0 ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:165:1: ( ( rule__Header1__Group__0 ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:165:1: ( ( rule__Header1__Group__0 ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:166:1: ( rule__Header1__Group__0 )
            {
             before(grammarAccess.getHeader1Access().getGroup()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:167:1: ( rule__Header1__Group__0 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:167:2: rule__Header1__Group__0
            {
            pushFollow(FOLLOW_rule__Header1__Group__0_in_ruleHeader1292);
            rule__Header1__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeader1Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHeader1"


    // $ANTLR start "entryRuleHeader2"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:179:1: entryRuleHeader2 : ruleHeader2 EOF ;
    public final void entryRuleHeader2() throws RecognitionException {
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:180:1: ( ruleHeader2 EOF )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:181:1: ruleHeader2 EOF
            {
             before(grammarAccess.getHeader2Rule()); 
            pushFollow(FOLLOW_ruleHeader2_in_entryRuleHeader2319);
            ruleHeader2();

            state._fsp--;

             after(grammarAccess.getHeader2Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeader2326); 

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
    // $ANTLR end "entryRuleHeader2"


    // $ANTLR start "ruleHeader2"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:188:1: ruleHeader2 : ( ( rule__Header2__Group__0 ) ) ;
    public final void ruleHeader2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:192:2: ( ( ( rule__Header2__Group__0 ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:193:1: ( ( rule__Header2__Group__0 ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:193:1: ( ( rule__Header2__Group__0 ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:194:1: ( rule__Header2__Group__0 )
            {
             before(grammarAccess.getHeader2Access().getGroup()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:195:1: ( rule__Header2__Group__0 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:195:2: rule__Header2__Group__0
            {
            pushFollow(FOLLOW_rule__Header2__Group__0_in_ruleHeader2352);
            rule__Header2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeader2Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHeader2"


    // $ANTLR start "entryRulePlainText"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:207:1: entryRulePlainText : rulePlainText EOF ;
    public final void entryRulePlainText() throws RecognitionException {
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:208:1: ( rulePlainText EOF )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:209:1: rulePlainText EOF
            {
             before(grammarAccess.getPlainTextRule()); 
            pushFollow(FOLLOW_rulePlainText_in_entryRulePlainText379);
            rulePlainText();

            state._fsp--;

             after(grammarAccess.getPlainTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlainText386); 

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
    // $ANTLR end "entryRulePlainText"


    // $ANTLR start "rulePlainText"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:216:1: rulePlainText : ( ( rule__PlainText__ValueAssignment ) ) ;
    public final void rulePlainText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:220:2: ( ( ( rule__PlainText__ValueAssignment ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:221:1: ( ( rule__PlainText__ValueAssignment ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:221:1: ( ( rule__PlainText__ValueAssignment ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:222:1: ( rule__PlainText__ValueAssignment )
            {
             before(grammarAccess.getPlainTextAccess().getValueAssignment()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:223:1: ( rule__PlainText__ValueAssignment )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:223:2: rule__PlainText__ValueAssignment
            {
            pushFollow(FOLLOW_rule__PlainText__ValueAssignment_in_rulePlainText412);
            rule__PlainText__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPlainTextAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlainText"


    // $ANTLR start "entryRuleItalic"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:235:1: entryRuleItalic : ruleItalic EOF ;
    public final void entryRuleItalic() throws RecognitionException {
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:236:1: ( ruleItalic EOF )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:237:1: ruleItalic EOF
            {
             before(grammarAccess.getItalicRule()); 
            pushFollow(FOLLOW_ruleItalic_in_entryRuleItalic439);
            ruleItalic();

            state._fsp--;

             after(grammarAccess.getItalicRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItalic446); 

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
    // $ANTLR end "entryRuleItalic"


    // $ANTLR start "ruleItalic"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:244:1: ruleItalic : ( ( rule__Italic__Alternatives ) ) ;
    public final void ruleItalic() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:248:2: ( ( ( rule__Italic__Alternatives ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:249:1: ( ( rule__Italic__Alternatives ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:249:1: ( ( rule__Italic__Alternatives ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:250:1: ( rule__Italic__Alternatives )
            {
             before(grammarAccess.getItalicAccess().getAlternatives()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:251:1: ( rule__Italic__Alternatives )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:251:2: rule__Italic__Alternatives
            {
            pushFollow(FOLLOW_rule__Italic__Alternatives_in_ruleItalic472);
            rule__Italic__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getItalicAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItalic"


    // $ANTLR start "entryRuleBold"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:263:1: entryRuleBold : ruleBold EOF ;
    public final void entryRuleBold() throws RecognitionException {
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:264:1: ( ruleBold EOF )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:265:1: ruleBold EOF
            {
             before(grammarAccess.getBoldRule()); 
            pushFollow(FOLLOW_ruleBold_in_entryRuleBold499);
            ruleBold();

            state._fsp--;

             after(grammarAccess.getBoldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBold506); 

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
    // $ANTLR end "entryRuleBold"


    // $ANTLR start "ruleBold"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:272:1: ruleBold : ( ( rule__Bold__Alternatives ) ) ;
    public final void ruleBold() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:276:2: ( ( ( rule__Bold__Alternatives ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:277:1: ( ( rule__Bold__Alternatives ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:277:1: ( ( rule__Bold__Alternatives ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:278:1: ( rule__Bold__Alternatives )
            {
             before(grammarAccess.getBoldAccess().getAlternatives()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:279:1: ( rule__Bold__Alternatives )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:279:2: rule__Bold__Alternatives
            {
            pushFollow(FOLLOW_rule__Bold__Alternatives_in_ruleBold532);
            rule__Bold__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBoldAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBold"


    // $ANTLR start "rule__Content__EntityAlternatives_0_0"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:291:1: rule__Content__EntityAlternatives_0_0 : ( ( ruleHeader1 ) | ( ruleHeader2 ) | ( ruleTextBlock ) );
    public final void rule__Content__EntityAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:295:1: ( ( ruleHeader1 ) | ( ruleHeader2 ) | ( ruleTextBlock ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case RULE_TEXT:
            case 13:
            case 17:
            case 18:
            case 19:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:296:1: ( ruleHeader1 )
                    {
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:296:1: ( ruleHeader1 )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:297:1: ruleHeader1
                    {
                     before(grammarAccess.getContentAccess().getEntityHeader1ParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_ruleHeader1_in_rule__Content__EntityAlternatives_0_0568);
                    ruleHeader1();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getEntityHeader1ParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:302:6: ( ruleHeader2 )
                    {
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:302:6: ( ruleHeader2 )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:303:1: ruleHeader2
                    {
                     before(grammarAccess.getContentAccess().getEntityHeader2ParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_ruleHeader2_in_rule__Content__EntityAlternatives_0_0585);
                    ruleHeader2();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getEntityHeader2ParserRuleCall_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:308:6: ( ruleTextBlock )
                    {
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:308:6: ( ruleTextBlock )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:309:1: ruleTextBlock
                    {
                     before(grammarAccess.getContentAccess().getEntityTextBlockParserRuleCall_0_0_2()); 
                    pushFollow(FOLLOW_ruleTextBlock_in_rule__Content__EntityAlternatives_0_0602);
                    ruleTextBlock();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getEntityTextBlockParserRuleCall_0_0_2()); 

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
    // $ANTLR end "rule__Content__EntityAlternatives_0_0"


    // $ANTLR start "rule__TextBlock__TextAlternatives_0"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:319:1: rule__TextBlock__TextAlternatives_0 : ( ( rulePlainText ) | ( ruleItalic ) | ( ruleBold ) );
    public final void rule__TextBlock__TextAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:323:1: ( ( rulePlainText ) | ( ruleItalic ) | ( ruleBold ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_TEXT:
                {
                alt4=1;
                }
                break;
            case 13:
            case 17:
                {
                alt4=2;
                }
                break;
            case 18:
            case 19:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:324:1: ( rulePlainText )
                    {
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:324:1: ( rulePlainText )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:325:1: rulePlainText
                    {
                     before(grammarAccess.getTextBlockAccess().getTextPlainTextParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_rulePlainText_in_rule__TextBlock__TextAlternatives_0634);
                    rulePlainText();

                    state._fsp--;

                     after(grammarAccess.getTextBlockAccess().getTextPlainTextParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:330:6: ( ruleItalic )
                    {
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:330:6: ( ruleItalic )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:331:1: ruleItalic
                    {
                     before(grammarAccess.getTextBlockAccess().getTextItalicParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleItalic_in_rule__TextBlock__TextAlternatives_0651);
                    ruleItalic();

                    state._fsp--;

                     after(grammarAccess.getTextBlockAccess().getTextItalicParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:336:6: ( ruleBold )
                    {
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:336:6: ( ruleBold )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:337:1: ruleBold
                    {
                     before(grammarAccess.getTextBlockAccess().getTextBoldParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_ruleBold_in_rule__TextBlock__TextAlternatives_0668);
                    ruleBold();

                    state._fsp--;

                     after(grammarAccess.getTextBlockAccess().getTextBoldParserRuleCall_0_2()); 

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
    // $ANTLR end "rule__TextBlock__TextAlternatives_0"


    // $ANTLR start "rule__Italic__Alternatives"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:347:1: rule__Italic__Alternatives : ( ( ( rule__Italic__Group_0__0 ) ) | ( ( rule__Italic__Group_1__0 ) ) );
    public final void rule__Italic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:351:1: ( ( ( rule__Italic__Group_0__0 ) ) | ( ( rule__Italic__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:352:1: ( ( rule__Italic__Group_0__0 ) )
                    {
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:352:1: ( ( rule__Italic__Group_0__0 ) )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:353:1: ( rule__Italic__Group_0__0 )
                    {
                     before(grammarAccess.getItalicAccess().getGroup_0()); 
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:354:1: ( rule__Italic__Group_0__0 )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:354:2: rule__Italic__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Italic__Group_0__0_in_rule__Italic__Alternatives700);
                    rule__Italic__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getItalicAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:358:6: ( ( rule__Italic__Group_1__0 ) )
                    {
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:358:6: ( ( rule__Italic__Group_1__0 ) )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:359:1: ( rule__Italic__Group_1__0 )
                    {
                     before(grammarAccess.getItalicAccess().getGroup_1()); 
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:360:1: ( rule__Italic__Group_1__0 )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:360:2: rule__Italic__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Italic__Group_1__0_in_rule__Italic__Alternatives718);
                    rule__Italic__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getItalicAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Italic__Alternatives"


    // $ANTLR start "rule__Italic__ValueAlternatives_0_1_0"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:369:1: rule__Italic__ValueAlternatives_0_1_0 : ( ( rulePlainText ) | ( ruleBold ) );
    public final void rule__Italic__ValueAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:373:1: ( ( rulePlainText ) | ( ruleBold ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_TEXT) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=18 && LA6_0<=19)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:374:1: ( rulePlainText )
                    {
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:374:1: ( rulePlainText )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:375:1: rulePlainText
                    {
                     before(grammarAccess.getItalicAccess().getValuePlainTextParserRuleCall_0_1_0_0()); 
                    pushFollow(FOLLOW_rulePlainText_in_rule__Italic__ValueAlternatives_0_1_0751);
                    rulePlainText();

                    state._fsp--;

                     after(grammarAccess.getItalicAccess().getValuePlainTextParserRuleCall_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:380:6: ( ruleBold )
                    {
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:380:6: ( ruleBold )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:381:1: ruleBold
                    {
                     before(grammarAccess.getItalicAccess().getValueBoldParserRuleCall_0_1_0_1()); 
                    pushFollow(FOLLOW_ruleBold_in_rule__Italic__ValueAlternatives_0_1_0768);
                    ruleBold();

                    state._fsp--;

                     after(grammarAccess.getItalicAccess().getValueBoldParserRuleCall_0_1_0_1()); 

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
    // $ANTLR end "rule__Italic__ValueAlternatives_0_1_0"


    // $ANTLR start "rule__Italic__Alternatives_0_2"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:391:1: rule__Italic__Alternatives_0_2 : ( ( '*' ) | ( '* ' ) );
    public final void rule__Italic__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:395:1: ( ( '*' ) | ( '* ' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            else if ( (LA7_0==14) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:396:1: ( '*' )
                    {
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:396:1: ( '*' )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:397:1: '*'
                    {
                     before(grammarAccess.getItalicAccess().getAsteriskKeyword_0_2_0()); 
                    match(input,13,FOLLOW_13_in_rule__Italic__Alternatives_0_2801); 
                     after(grammarAccess.getItalicAccess().getAsteriskKeyword_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:404:6: ( '* ' )
                    {
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:404:6: ( '* ' )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:405:1: '* '
                    {
                     before(grammarAccess.getItalicAccess().getAsteriskSpaceKeyword_0_2_1()); 
                    match(input,14,FOLLOW_14_in_rule__Italic__Alternatives_0_2821); 
                     after(grammarAccess.getItalicAccess().getAsteriskSpaceKeyword_0_2_1()); 

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
    // $ANTLR end "rule__Italic__Alternatives_0_2"


    // $ANTLR start "rule__Italic__ValueAlternatives_1_1_0"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:417:1: rule__Italic__ValueAlternatives_1_1_0 : ( ( rulePlainText ) | ( ruleBold ) );
    public final void rule__Italic__ValueAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:421:1: ( ( rulePlainText ) | ( ruleBold ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_TEXT) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=18 && LA8_0<=19)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:422:1: ( rulePlainText )
                    {
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:422:1: ( rulePlainText )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:423:1: rulePlainText
                    {
                     before(grammarAccess.getItalicAccess().getValuePlainTextParserRuleCall_1_1_0_0()); 
                    pushFollow(FOLLOW_rulePlainText_in_rule__Italic__ValueAlternatives_1_1_0855);
                    rulePlainText();

                    state._fsp--;

                     after(grammarAccess.getItalicAccess().getValuePlainTextParserRuleCall_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:428:6: ( ruleBold )
                    {
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:428:6: ( ruleBold )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:429:1: ruleBold
                    {
                     before(grammarAccess.getItalicAccess().getValueBoldParserRuleCall_1_1_0_1()); 
                    pushFollow(FOLLOW_ruleBold_in_rule__Italic__ValueAlternatives_1_1_0872);
                    ruleBold();

                    state._fsp--;

                     after(grammarAccess.getItalicAccess().getValueBoldParserRuleCall_1_1_0_1()); 

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
    // $ANTLR end "rule__Italic__ValueAlternatives_1_1_0"


    // $ANTLR start "rule__Bold__Alternatives"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:439:1: rule__Bold__Alternatives : ( ( ( rule__Bold__Group_0__0 ) ) | ( ( rule__Bold__Group_1__0 ) ) );
    public final void rule__Bold__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:443:1: ( ( ( rule__Bold__Group_0__0 ) ) | ( ( rule__Bold__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            else if ( (LA9_0==19) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:444:1: ( ( rule__Bold__Group_0__0 ) )
                    {
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:444:1: ( ( rule__Bold__Group_0__0 ) )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:445:1: ( rule__Bold__Group_0__0 )
                    {
                     before(grammarAccess.getBoldAccess().getGroup_0()); 
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:446:1: ( rule__Bold__Group_0__0 )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:446:2: rule__Bold__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Bold__Group_0__0_in_rule__Bold__Alternatives904);
                    rule__Bold__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBoldAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:450:6: ( ( rule__Bold__Group_1__0 ) )
                    {
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:450:6: ( ( rule__Bold__Group_1__0 ) )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:451:1: ( rule__Bold__Group_1__0 )
                    {
                     before(grammarAccess.getBoldAccess().getGroup_1()); 
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:452:1: ( rule__Bold__Group_1__0 )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:452:2: rule__Bold__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Bold__Group_1__0_in_rule__Bold__Alternatives922);
                    rule__Bold__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBoldAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Bold__Alternatives"


    // $ANTLR start "rule__Bold__ValueAlternatives_0_1_0"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:461:1: rule__Bold__ValueAlternatives_0_1_0 : ( ( rulePlainText ) | ( ruleItalic ) );
    public final void rule__Bold__ValueAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:465:1: ( ( rulePlainText ) | ( ruleItalic ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_TEXT) ) {
                alt10=1;
            }
            else if ( (LA10_0==13||LA10_0==17) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:466:1: ( rulePlainText )
                    {
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:466:1: ( rulePlainText )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:467:1: rulePlainText
                    {
                     before(grammarAccess.getBoldAccess().getValuePlainTextParserRuleCall_0_1_0_0()); 
                    pushFollow(FOLLOW_rulePlainText_in_rule__Bold__ValueAlternatives_0_1_0955);
                    rulePlainText();

                    state._fsp--;

                     after(grammarAccess.getBoldAccess().getValuePlainTextParserRuleCall_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:472:6: ( ruleItalic )
                    {
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:472:6: ( ruleItalic )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:473:1: ruleItalic
                    {
                     before(grammarAccess.getBoldAccess().getValueItalicParserRuleCall_0_1_0_1()); 
                    pushFollow(FOLLOW_ruleItalic_in_rule__Bold__ValueAlternatives_0_1_0972);
                    ruleItalic();

                    state._fsp--;

                     after(grammarAccess.getBoldAccess().getValueItalicParserRuleCall_0_1_0_1()); 

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
    // $ANTLR end "rule__Bold__ValueAlternatives_0_1_0"


    // $ANTLR start "rule__Bold__ValueAlternatives_1_1_0"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:483:1: rule__Bold__ValueAlternatives_1_1_0 : ( ( rulePlainText ) | ( ruleItalic ) );
    public final void rule__Bold__ValueAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:487:1: ( ( rulePlainText ) | ( ruleItalic ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_TEXT) ) {
                alt11=1;
            }
            else if ( (LA11_0==13||LA11_0==17) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:488:1: ( rulePlainText )
                    {
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:488:1: ( rulePlainText )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:489:1: rulePlainText
                    {
                     before(grammarAccess.getBoldAccess().getValuePlainTextParserRuleCall_1_1_0_0()); 
                    pushFollow(FOLLOW_rulePlainText_in_rule__Bold__ValueAlternatives_1_1_01004);
                    rulePlainText();

                    state._fsp--;

                     after(grammarAccess.getBoldAccess().getValuePlainTextParserRuleCall_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:494:6: ( ruleItalic )
                    {
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:494:6: ( ruleItalic )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:495:1: ruleItalic
                    {
                     before(grammarAccess.getBoldAccess().getValueItalicParserRuleCall_1_1_0_1()); 
                    pushFollow(FOLLOW_ruleItalic_in_rule__Bold__ValueAlternatives_1_1_01021);
                    ruleItalic();

                    state._fsp--;

                     after(grammarAccess.getBoldAccess().getValueItalicParserRuleCall_1_1_0_1()); 

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
    // $ANTLR end "rule__Bold__ValueAlternatives_1_1_0"


    // $ANTLR start "rule__Content__Group__0"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:507:1: rule__Content__Group__0 : rule__Content__Group__0__Impl rule__Content__Group__1 ;
    public final void rule__Content__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:511:1: ( rule__Content__Group__0__Impl rule__Content__Group__1 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:512:2: rule__Content__Group__0__Impl rule__Content__Group__1
            {
            pushFollow(FOLLOW_rule__Content__Group__0__Impl_in_rule__Content__Group__01051);
            rule__Content__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Content__Group__1_in_rule__Content__Group__01054);
            rule__Content__Group__1();

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
    // $ANTLR end "rule__Content__Group__0"


    // $ANTLR start "rule__Content__Group__0__Impl"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:519:1: rule__Content__Group__0__Impl : ( ( rule__Content__EntityAssignment_0 ) ) ;
    public final void rule__Content__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:523:1: ( ( ( rule__Content__EntityAssignment_0 ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:524:1: ( ( rule__Content__EntityAssignment_0 ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:524:1: ( ( rule__Content__EntityAssignment_0 ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:525:1: ( rule__Content__EntityAssignment_0 )
            {
             before(grammarAccess.getContentAccess().getEntityAssignment_0()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:526:1: ( rule__Content__EntityAssignment_0 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:526:2: rule__Content__EntityAssignment_0
            {
            pushFollow(FOLLOW_rule__Content__EntityAssignment_0_in_rule__Content__Group__0__Impl1081);
            rule__Content__EntityAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getEntityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__0__Impl"


    // $ANTLR start "rule__Content__Group__1"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:536:1: rule__Content__Group__1 : rule__Content__Group__1__Impl ;
    public final void rule__Content__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:540:1: ( rule__Content__Group__1__Impl )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:541:2: rule__Content__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Content__Group__1__Impl_in_rule__Content__Group__11111);
            rule__Content__Group__1__Impl();

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
    // $ANTLR end "rule__Content__Group__1"


    // $ANTLR start "rule__Content__Group__1__Impl"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:547:1: rule__Content__Group__1__Impl : ( ( ( RULE_NEWLINE ) ) ( ( RULE_NEWLINE )* ) ) ;
    public final void rule__Content__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:551:1: ( ( ( ( RULE_NEWLINE ) ) ( ( RULE_NEWLINE )* ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:552:1: ( ( ( RULE_NEWLINE ) ) ( ( RULE_NEWLINE )* ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:552:1: ( ( ( RULE_NEWLINE ) ) ( ( RULE_NEWLINE )* ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:553:1: ( ( RULE_NEWLINE ) ) ( ( RULE_NEWLINE )* )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:553:1: ( ( RULE_NEWLINE ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:554:1: ( RULE_NEWLINE )
            {
             before(grammarAccess.getContentAccess().getNEWLINETerminalRuleCall_1()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:555:1: ( RULE_NEWLINE )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:555:3: RULE_NEWLINE
            {
            match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rule__Content__Group__1__Impl1141); 

            }

             after(grammarAccess.getContentAccess().getNEWLINETerminalRuleCall_1()); 

            }

            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:558:1: ( ( RULE_NEWLINE )* )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:559:1: ( RULE_NEWLINE )*
            {
             before(grammarAccess.getContentAccess().getNEWLINETerminalRuleCall_1()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:560:1: ( RULE_NEWLINE )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_NEWLINE) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:560:3: RULE_NEWLINE
            	    {
            	    match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rule__Content__Group__1__Impl1154); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getContentAccess().getNEWLINETerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Content__Group__1__Impl"


    // $ANTLR start "rule__Header1__Group__0"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:575:1: rule__Header1__Group__0 : rule__Header1__Group__0__Impl rule__Header1__Group__1 ;
    public final void rule__Header1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:579:1: ( rule__Header1__Group__0__Impl rule__Header1__Group__1 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:580:2: rule__Header1__Group__0__Impl rule__Header1__Group__1
            {
            pushFollow(FOLLOW_rule__Header1__Group__0__Impl_in_rule__Header1__Group__01191);
            rule__Header1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header1__Group__1_in_rule__Header1__Group__01194);
            rule__Header1__Group__1();

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
    // $ANTLR end "rule__Header1__Group__0"


    // $ANTLR start "rule__Header1__Group__0__Impl"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:587:1: rule__Header1__Group__0__Impl : ( '# ' ) ;
    public final void rule__Header1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:591:1: ( ( '# ' ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:592:1: ( '# ' )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:592:1: ( '# ' )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:593:1: '# '
            {
             before(grammarAccess.getHeader1Access().getNumberSignSpaceKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Header1__Group__0__Impl1222); 
             after(grammarAccess.getHeader1Access().getNumberSignSpaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header1__Group__0__Impl"


    // $ANTLR start "rule__Header1__Group__1"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:606:1: rule__Header1__Group__1 : rule__Header1__Group__1__Impl ;
    public final void rule__Header1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:610:1: ( rule__Header1__Group__1__Impl )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:611:2: rule__Header1__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Header1__Group__1__Impl_in_rule__Header1__Group__11253);
            rule__Header1__Group__1__Impl();

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
    // $ANTLR end "rule__Header1__Group__1"


    // $ANTLR start "rule__Header1__Group__1__Impl"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:617:1: rule__Header1__Group__1__Impl : ( ( rule__Header1__ValueAssignment_1 ) ) ;
    public final void rule__Header1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:621:1: ( ( ( rule__Header1__ValueAssignment_1 ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:622:1: ( ( rule__Header1__ValueAssignment_1 ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:622:1: ( ( rule__Header1__ValueAssignment_1 ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:623:1: ( rule__Header1__ValueAssignment_1 )
            {
             before(grammarAccess.getHeader1Access().getValueAssignment_1()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:624:1: ( rule__Header1__ValueAssignment_1 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:624:2: rule__Header1__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Header1__ValueAssignment_1_in_rule__Header1__Group__1__Impl1280);
            rule__Header1__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHeader1Access().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header1__Group__1__Impl"


    // $ANTLR start "rule__Header2__Group__0"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:638:1: rule__Header2__Group__0 : rule__Header2__Group__0__Impl rule__Header2__Group__1 ;
    public final void rule__Header2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:642:1: ( rule__Header2__Group__0__Impl rule__Header2__Group__1 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:643:2: rule__Header2__Group__0__Impl rule__Header2__Group__1
            {
            pushFollow(FOLLOW_rule__Header2__Group__0__Impl_in_rule__Header2__Group__01314);
            rule__Header2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header2__Group__1_in_rule__Header2__Group__01317);
            rule__Header2__Group__1();

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
    // $ANTLR end "rule__Header2__Group__0"


    // $ANTLR start "rule__Header2__Group__0__Impl"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:650:1: rule__Header2__Group__0__Impl : ( '## ' ) ;
    public final void rule__Header2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:654:1: ( ( '## ' ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:655:1: ( '## ' )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:655:1: ( '## ' )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:656:1: '## '
            {
             before(grammarAccess.getHeader2Access().getNumberSignNumberSignSpaceKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Header2__Group__0__Impl1345); 
             after(grammarAccess.getHeader2Access().getNumberSignNumberSignSpaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header2__Group__0__Impl"


    // $ANTLR start "rule__Header2__Group__1"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:669:1: rule__Header2__Group__1 : rule__Header2__Group__1__Impl ;
    public final void rule__Header2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:673:1: ( rule__Header2__Group__1__Impl )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:674:2: rule__Header2__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Header2__Group__1__Impl_in_rule__Header2__Group__11376);
            rule__Header2__Group__1__Impl();

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
    // $ANTLR end "rule__Header2__Group__1"


    // $ANTLR start "rule__Header2__Group__1__Impl"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:680:1: rule__Header2__Group__1__Impl : ( ( rule__Header2__ValueAssignment_1 ) ) ;
    public final void rule__Header2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:684:1: ( ( ( rule__Header2__ValueAssignment_1 ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:685:1: ( ( rule__Header2__ValueAssignment_1 ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:685:1: ( ( rule__Header2__ValueAssignment_1 ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:686:1: ( rule__Header2__ValueAssignment_1 )
            {
             before(grammarAccess.getHeader2Access().getValueAssignment_1()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:687:1: ( rule__Header2__ValueAssignment_1 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:687:2: rule__Header2__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Header2__ValueAssignment_1_in_rule__Header2__Group__1__Impl1403);
            rule__Header2__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHeader2Access().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header2__Group__1__Impl"


    // $ANTLR start "rule__Italic__Group_0__0"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:701:1: rule__Italic__Group_0__0 : rule__Italic__Group_0__0__Impl rule__Italic__Group_0__1 ;
    public final void rule__Italic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:705:1: ( rule__Italic__Group_0__0__Impl rule__Italic__Group_0__1 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:706:2: rule__Italic__Group_0__0__Impl rule__Italic__Group_0__1
            {
            pushFollow(FOLLOW_rule__Italic__Group_0__0__Impl_in_rule__Italic__Group_0__01437);
            rule__Italic__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Italic__Group_0__1_in_rule__Italic__Group_0__01440);
            rule__Italic__Group_0__1();

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
    // $ANTLR end "rule__Italic__Group_0__0"


    // $ANTLR start "rule__Italic__Group_0__0__Impl"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:713:1: rule__Italic__Group_0__0__Impl : ( '*' ) ;
    public final void rule__Italic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:717:1: ( ( '*' ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:718:1: ( '*' )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:718:1: ( '*' )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:719:1: '*'
            {
             before(grammarAccess.getItalicAccess().getAsteriskKeyword_0_0()); 
            match(input,13,FOLLOW_13_in_rule__Italic__Group_0__0__Impl1468); 
             after(grammarAccess.getItalicAccess().getAsteriskKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Italic__Group_0__0__Impl"


    // $ANTLR start "rule__Italic__Group_0__1"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:732:1: rule__Italic__Group_0__1 : rule__Italic__Group_0__1__Impl rule__Italic__Group_0__2 ;
    public final void rule__Italic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:736:1: ( rule__Italic__Group_0__1__Impl rule__Italic__Group_0__2 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:737:2: rule__Italic__Group_0__1__Impl rule__Italic__Group_0__2
            {
            pushFollow(FOLLOW_rule__Italic__Group_0__1__Impl_in_rule__Italic__Group_0__11499);
            rule__Italic__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Italic__Group_0__2_in_rule__Italic__Group_0__11502);
            rule__Italic__Group_0__2();

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
    // $ANTLR end "rule__Italic__Group_0__1"


    // $ANTLR start "rule__Italic__Group_0__1__Impl"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:744:1: rule__Italic__Group_0__1__Impl : ( ( ( rule__Italic__ValueAssignment_0_1 ) ) ( ( rule__Italic__ValueAssignment_0_1 )* ) ) ;
    public final void rule__Italic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:748:1: ( ( ( ( rule__Italic__ValueAssignment_0_1 ) ) ( ( rule__Italic__ValueAssignment_0_1 )* ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:749:1: ( ( ( rule__Italic__ValueAssignment_0_1 ) ) ( ( rule__Italic__ValueAssignment_0_1 )* ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:749:1: ( ( ( rule__Italic__ValueAssignment_0_1 ) ) ( ( rule__Italic__ValueAssignment_0_1 )* ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:750:1: ( ( rule__Italic__ValueAssignment_0_1 ) ) ( ( rule__Italic__ValueAssignment_0_1 )* )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:750:1: ( ( rule__Italic__ValueAssignment_0_1 ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:751:1: ( rule__Italic__ValueAssignment_0_1 )
            {
             before(grammarAccess.getItalicAccess().getValueAssignment_0_1()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:752:1: ( rule__Italic__ValueAssignment_0_1 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:752:2: rule__Italic__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Italic__ValueAssignment_0_1_in_rule__Italic__Group_0__1__Impl1531);
            rule__Italic__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getItalicAccess().getValueAssignment_0_1()); 

            }

            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:755:1: ( ( rule__Italic__ValueAssignment_0_1 )* )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:756:1: ( rule__Italic__ValueAssignment_0_1 )*
            {
             before(grammarAccess.getItalicAccess().getValueAssignment_0_1()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:757:1: ( rule__Italic__ValueAssignment_0_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_TEXT||(LA13_0>=18 && LA13_0<=19)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:757:2: rule__Italic__ValueAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_rule__Italic__ValueAssignment_0_1_in_rule__Italic__Group_0__1__Impl1543);
            	    rule__Italic__ValueAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getItalicAccess().getValueAssignment_0_1()); 

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
    // $ANTLR end "rule__Italic__Group_0__1__Impl"


    // $ANTLR start "rule__Italic__Group_0__2"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:768:1: rule__Italic__Group_0__2 : rule__Italic__Group_0__2__Impl ;
    public final void rule__Italic__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:772:1: ( rule__Italic__Group_0__2__Impl )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:773:2: rule__Italic__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Italic__Group_0__2__Impl_in_rule__Italic__Group_0__21576);
            rule__Italic__Group_0__2__Impl();

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
    // $ANTLR end "rule__Italic__Group_0__2"


    // $ANTLR start "rule__Italic__Group_0__2__Impl"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:779:1: rule__Italic__Group_0__2__Impl : ( ( rule__Italic__Alternatives_0_2 ) ) ;
    public final void rule__Italic__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:783:1: ( ( ( rule__Italic__Alternatives_0_2 ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:784:1: ( ( rule__Italic__Alternatives_0_2 ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:784:1: ( ( rule__Italic__Alternatives_0_2 ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:785:1: ( rule__Italic__Alternatives_0_2 )
            {
             before(grammarAccess.getItalicAccess().getAlternatives_0_2()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:786:1: ( rule__Italic__Alternatives_0_2 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:786:2: rule__Italic__Alternatives_0_2
            {
            pushFollow(FOLLOW_rule__Italic__Alternatives_0_2_in_rule__Italic__Group_0__2__Impl1603);
            rule__Italic__Alternatives_0_2();

            state._fsp--;


            }

             after(grammarAccess.getItalicAccess().getAlternatives_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Italic__Group_0__2__Impl"


    // $ANTLR start "rule__Italic__Group_1__0"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:802:1: rule__Italic__Group_1__0 : rule__Italic__Group_1__0__Impl rule__Italic__Group_1__1 ;
    public final void rule__Italic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:806:1: ( rule__Italic__Group_1__0__Impl rule__Italic__Group_1__1 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:807:2: rule__Italic__Group_1__0__Impl rule__Italic__Group_1__1
            {
            pushFollow(FOLLOW_rule__Italic__Group_1__0__Impl_in_rule__Italic__Group_1__01639);
            rule__Italic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Italic__Group_1__1_in_rule__Italic__Group_1__01642);
            rule__Italic__Group_1__1();

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
    // $ANTLR end "rule__Italic__Group_1__0"


    // $ANTLR start "rule__Italic__Group_1__0__Impl"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:814:1: rule__Italic__Group_1__0__Impl : ( '_' ) ;
    public final void rule__Italic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:818:1: ( ( '_' ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:819:1: ( '_' )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:819:1: ( '_' )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:820:1: '_'
            {
             before(grammarAccess.getItalicAccess().get_Keyword_1_0()); 
            match(input,17,FOLLOW_17_in_rule__Italic__Group_1__0__Impl1670); 
             after(grammarAccess.getItalicAccess().get_Keyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Italic__Group_1__0__Impl"


    // $ANTLR start "rule__Italic__Group_1__1"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:833:1: rule__Italic__Group_1__1 : rule__Italic__Group_1__1__Impl rule__Italic__Group_1__2 ;
    public final void rule__Italic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:837:1: ( rule__Italic__Group_1__1__Impl rule__Italic__Group_1__2 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:838:2: rule__Italic__Group_1__1__Impl rule__Italic__Group_1__2
            {
            pushFollow(FOLLOW_rule__Italic__Group_1__1__Impl_in_rule__Italic__Group_1__11701);
            rule__Italic__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Italic__Group_1__2_in_rule__Italic__Group_1__11704);
            rule__Italic__Group_1__2();

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
    // $ANTLR end "rule__Italic__Group_1__1"


    // $ANTLR start "rule__Italic__Group_1__1__Impl"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:845:1: rule__Italic__Group_1__1__Impl : ( ( ( rule__Italic__ValueAssignment_1_1 ) ) ( ( rule__Italic__ValueAssignment_1_1 )* ) ) ;
    public final void rule__Italic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:849:1: ( ( ( ( rule__Italic__ValueAssignment_1_1 ) ) ( ( rule__Italic__ValueAssignment_1_1 )* ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:850:1: ( ( ( rule__Italic__ValueAssignment_1_1 ) ) ( ( rule__Italic__ValueAssignment_1_1 )* ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:850:1: ( ( ( rule__Italic__ValueAssignment_1_1 ) ) ( ( rule__Italic__ValueAssignment_1_1 )* ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:851:1: ( ( rule__Italic__ValueAssignment_1_1 ) ) ( ( rule__Italic__ValueAssignment_1_1 )* )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:851:1: ( ( rule__Italic__ValueAssignment_1_1 ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:852:1: ( rule__Italic__ValueAssignment_1_1 )
            {
             before(grammarAccess.getItalicAccess().getValueAssignment_1_1()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:853:1: ( rule__Italic__ValueAssignment_1_1 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:853:2: rule__Italic__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Italic__ValueAssignment_1_1_in_rule__Italic__Group_1__1__Impl1733);
            rule__Italic__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getItalicAccess().getValueAssignment_1_1()); 

            }

            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:856:1: ( ( rule__Italic__ValueAssignment_1_1 )* )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:857:1: ( rule__Italic__ValueAssignment_1_1 )*
            {
             before(grammarAccess.getItalicAccess().getValueAssignment_1_1()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:858:1: ( rule__Italic__ValueAssignment_1_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_TEXT||(LA14_0>=18 && LA14_0<=19)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:858:2: rule__Italic__ValueAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_rule__Italic__ValueAssignment_1_1_in_rule__Italic__Group_1__1__Impl1745);
            	    rule__Italic__ValueAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getItalicAccess().getValueAssignment_1_1()); 

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
    // $ANTLR end "rule__Italic__Group_1__1__Impl"


    // $ANTLR start "rule__Italic__Group_1__2"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:869:1: rule__Italic__Group_1__2 : rule__Italic__Group_1__2__Impl ;
    public final void rule__Italic__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:873:1: ( rule__Italic__Group_1__2__Impl )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:874:2: rule__Italic__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Italic__Group_1__2__Impl_in_rule__Italic__Group_1__21778);
            rule__Italic__Group_1__2__Impl();

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
    // $ANTLR end "rule__Italic__Group_1__2"


    // $ANTLR start "rule__Italic__Group_1__2__Impl"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:880:1: rule__Italic__Group_1__2__Impl : ( '_' ) ;
    public final void rule__Italic__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:884:1: ( ( '_' ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:885:1: ( '_' )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:885:1: ( '_' )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:886:1: '_'
            {
             before(grammarAccess.getItalicAccess().get_Keyword_1_2()); 
            match(input,17,FOLLOW_17_in_rule__Italic__Group_1__2__Impl1806); 
             after(grammarAccess.getItalicAccess().get_Keyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Italic__Group_1__2__Impl"


    // $ANTLR start "rule__Bold__Group_0__0"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:905:1: rule__Bold__Group_0__0 : rule__Bold__Group_0__0__Impl rule__Bold__Group_0__1 ;
    public final void rule__Bold__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:909:1: ( rule__Bold__Group_0__0__Impl rule__Bold__Group_0__1 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:910:2: rule__Bold__Group_0__0__Impl rule__Bold__Group_0__1
            {
            pushFollow(FOLLOW_rule__Bold__Group_0__0__Impl_in_rule__Bold__Group_0__01843);
            rule__Bold__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bold__Group_0__1_in_rule__Bold__Group_0__01846);
            rule__Bold__Group_0__1();

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
    // $ANTLR end "rule__Bold__Group_0__0"


    // $ANTLR start "rule__Bold__Group_0__0__Impl"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:917:1: rule__Bold__Group_0__0__Impl : ( '**' ) ;
    public final void rule__Bold__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:921:1: ( ( '**' ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:922:1: ( '**' )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:922:1: ( '**' )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:923:1: '**'
            {
             before(grammarAccess.getBoldAccess().getAsteriskAsteriskKeyword_0_0()); 
            match(input,18,FOLLOW_18_in_rule__Bold__Group_0__0__Impl1874); 
             after(grammarAccess.getBoldAccess().getAsteriskAsteriskKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bold__Group_0__0__Impl"


    // $ANTLR start "rule__Bold__Group_0__1"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:936:1: rule__Bold__Group_0__1 : rule__Bold__Group_0__1__Impl rule__Bold__Group_0__2 ;
    public final void rule__Bold__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:940:1: ( rule__Bold__Group_0__1__Impl rule__Bold__Group_0__2 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:941:2: rule__Bold__Group_0__1__Impl rule__Bold__Group_0__2
            {
            pushFollow(FOLLOW_rule__Bold__Group_0__1__Impl_in_rule__Bold__Group_0__11905);
            rule__Bold__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bold__Group_0__2_in_rule__Bold__Group_0__11908);
            rule__Bold__Group_0__2();

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
    // $ANTLR end "rule__Bold__Group_0__1"


    // $ANTLR start "rule__Bold__Group_0__1__Impl"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:948:1: rule__Bold__Group_0__1__Impl : ( ( ( rule__Bold__ValueAssignment_0_1 ) ) ( ( rule__Bold__ValueAssignment_0_1 )* ) ) ;
    public final void rule__Bold__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:952:1: ( ( ( ( rule__Bold__ValueAssignment_0_1 ) ) ( ( rule__Bold__ValueAssignment_0_1 )* ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:953:1: ( ( ( rule__Bold__ValueAssignment_0_1 ) ) ( ( rule__Bold__ValueAssignment_0_1 )* ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:953:1: ( ( ( rule__Bold__ValueAssignment_0_1 ) ) ( ( rule__Bold__ValueAssignment_0_1 )* ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:954:1: ( ( rule__Bold__ValueAssignment_0_1 ) ) ( ( rule__Bold__ValueAssignment_0_1 )* )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:954:1: ( ( rule__Bold__ValueAssignment_0_1 ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:955:1: ( rule__Bold__ValueAssignment_0_1 )
            {
             before(grammarAccess.getBoldAccess().getValueAssignment_0_1()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:956:1: ( rule__Bold__ValueAssignment_0_1 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:956:2: rule__Bold__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Bold__ValueAssignment_0_1_in_rule__Bold__Group_0__1__Impl1937);
            rule__Bold__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getBoldAccess().getValueAssignment_0_1()); 

            }

            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:959:1: ( ( rule__Bold__ValueAssignment_0_1 )* )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:960:1: ( rule__Bold__ValueAssignment_0_1 )*
            {
             before(grammarAccess.getBoldAccess().getValueAssignment_0_1()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:961:1: ( rule__Bold__ValueAssignment_0_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_TEXT||LA15_0==13||LA15_0==17) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:961:2: rule__Bold__ValueAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_rule__Bold__ValueAssignment_0_1_in_rule__Bold__Group_0__1__Impl1949);
            	    rule__Bold__ValueAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getBoldAccess().getValueAssignment_0_1()); 

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
    // $ANTLR end "rule__Bold__Group_0__1__Impl"


    // $ANTLR start "rule__Bold__Group_0__2"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:972:1: rule__Bold__Group_0__2 : rule__Bold__Group_0__2__Impl ;
    public final void rule__Bold__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:976:1: ( rule__Bold__Group_0__2__Impl )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:977:2: rule__Bold__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Bold__Group_0__2__Impl_in_rule__Bold__Group_0__21982);
            rule__Bold__Group_0__2__Impl();

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
    // $ANTLR end "rule__Bold__Group_0__2"


    // $ANTLR start "rule__Bold__Group_0__2__Impl"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:983:1: rule__Bold__Group_0__2__Impl : ( '**' ) ;
    public final void rule__Bold__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:987:1: ( ( '**' ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:988:1: ( '**' )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:988:1: ( '**' )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:989:1: '**'
            {
             before(grammarAccess.getBoldAccess().getAsteriskAsteriskKeyword_0_2()); 
            match(input,18,FOLLOW_18_in_rule__Bold__Group_0__2__Impl2010); 
             after(grammarAccess.getBoldAccess().getAsteriskAsteriskKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bold__Group_0__2__Impl"


    // $ANTLR start "rule__Bold__Group_1__0"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1008:1: rule__Bold__Group_1__0 : rule__Bold__Group_1__0__Impl rule__Bold__Group_1__1 ;
    public final void rule__Bold__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1012:1: ( rule__Bold__Group_1__0__Impl rule__Bold__Group_1__1 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1013:2: rule__Bold__Group_1__0__Impl rule__Bold__Group_1__1
            {
            pushFollow(FOLLOW_rule__Bold__Group_1__0__Impl_in_rule__Bold__Group_1__02047);
            rule__Bold__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bold__Group_1__1_in_rule__Bold__Group_1__02050);
            rule__Bold__Group_1__1();

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
    // $ANTLR end "rule__Bold__Group_1__0"


    // $ANTLR start "rule__Bold__Group_1__0__Impl"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1020:1: rule__Bold__Group_1__0__Impl : ( '__' ) ;
    public final void rule__Bold__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1024:1: ( ( '__' ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1025:1: ( '__' )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1025:1: ( '__' )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1026:1: '__'
            {
             before(grammarAccess.getBoldAccess().get__Keyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__Bold__Group_1__0__Impl2078); 
             after(grammarAccess.getBoldAccess().get__Keyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bold__Group_1__0__Impl"


    // $ANTLR start "rule__Bold__Group_1__1"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1039:1: rule__Bold__Group_1__1 : rule__Bold__Group_1__1__Impl rule__Bold__Group_1__2 ;
    public final void rule__Bold__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1043:1: ( rule__Bold__Group_1__1__Impl rule__Bold__Group_1__2 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1044:2: rule__Bold__Group_1__1__Impl rule__Bold__Group_1__2
            {
            pushFollow(FOLLOW_rule__Bold__Group_1__1__Impl_in_rule__Bold__Group_1__12109);
            rule__Bold__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bold__Group_1__2_in_rule__Bold__Group_1__12112);
            rule__Bold__Group_1__2();

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
    // $ANTLR end "rule__Bold__Group_1__1"


    // $ANTLR start "rule__Bold__Group_1__1__Impl"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1051:1: rule__Bold__Group_1__1__Impl : ( ( ( rule__Bold__ValueAssignment_1_1 ) ) ( ( rule__Bold__ValueAssignment_1_1 )* ) ) ;
    public final void rule__Bold__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1055:1: ( ( ( ( rule__Bold__ValueAssignment_1_1 ) ) ( ( rule__Bold__ValueAssignment_1_1 )* ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1056:1: ( ( ( rule__Bold__ValueAssignment_1_1 ) ) ( ( rule__Bold__ValueAssignment_1_1 )* ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1056:1: ( ( ( rule__Bold__ValueAssignment_1_1 ) ) ( ( rule__Bold__ValueAssignment_1_1 )* ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1057:1: ( ( rule__Bold__ValueAssignment_1_1 ) ) ( ( rule__Bold__ValueAssignment_1_1 )* )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1057:1: ( ( rule__Bold__ValueAssignment_1_1 ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1058:1: ( rule__Bold__ValueAssignment_1_1 )
            {
             before(grammarAccess.getBoldAccess().getValueAssignment_1_1()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1059:1: ( rule__Bold__ValueAssignment_1_1 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1059:2: rule__Bold__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Bold__ValueAssignment_1_1_in_rule__Bold__Group_1__1__Impl2141);
            rule__Bold__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBoldAccess().getValueAssignment_1_1()); 

            }

            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1062:1: ( ( rule__Bold__ValueAssignment_1_1 )* )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1063:1: ( rule__Bold__ValueAssignment_1_1 )*
            {
             before(grammarAccess.getBoldAccess().getValueAssignment_1_1()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1064:1: ( rule__Bold__ValueAssignment_1_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_TEXT||LA16_0==13||LA16_0==17) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1064:2: rule__Bold__ValueAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_rule__Bold__ValueAssignment_1_1_in_rule__Bold__Group_1__1__Impl2153);
            	    rule__Bold__ValueAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getBoldAccess().getValueAssignment_1_1()); 

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
    // $ANTLR end "rule__Bold__Group_1__1__Impl"


    // $ANTLR start "rule__Bold__Group_1__2"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1075:1: rule__Bold__Group_1__2 : rule__Bold__Group_1__2__Impl ;
    public final void rule__Bold__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1079:1: ( rule__Bold__Group_1__2__Impl )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1080:2: rule__Bold__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Bold__Group_1__2__Impl_in_rule__Bold__Group_1__22186);
            rule__Bold__Group_1__2__Impl();

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
    // $ANTLR end "rule__Bold__Group_1__2"


    // $ANTLR start "rule__Bold__Group_1__2__Impl"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1086:1: rule__Bold__Group_1__2__Impl : ( '__' ) ;
    public final void rule__Bold__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1090:1: ( ( '__' ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1091:1: ( '__' )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1091:1: ( '__' )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1092:1: '__'
            {
             before(grammarAccess.getBoldAccess().get__Keyword_1_2()); 
            match(input,19,FOLLOW_19_in_rule__Bold__Group_1__2__Impl2214); 
             after(grammarAccess.getBoldAccess().get__Keyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bold__Group_1__2__Impl"


    // $ANTLR start "rule__Markdown__ContentAssignment"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1112:1: rule__Markdown__ContentAssignment : ( ruleContent ) ;
    public final void rule__Markdown__ContentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1116:1: ( ( ruleContent ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1117:1: ( ruleContent )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1117:1: ( ruleContent )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1118:1: ruleContent
            {
             before(grammarAccess.getMarkdownAccess().getContentContentParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleContent_in_rule__Markdown__ContentAssignment2256);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getMarkdownAccess().getContentContentParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Markdown__ContentAssignment"


    // $ANTLR start "rule__Content__EntityAssignment_0"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1127:1: rule__Content__EntityAssignment_0 : ( ( rule__Content__EntityAlternatives_0_0 ) ) ;
    public final void rule__Content__EntityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1131:1: ( ( ( rule__Content__EntityAlternatives_0_0 ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1132:1: ( ( rule__Content__EntityAlternatives_0_0 ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1132:1: ( ( rule__Content__EntityAlternatives_0_0 ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1133:1: ( rule__Content__EntityAlternatives_0_0 )
            {
             before(grammarAccess.getContentAccess().getEntityAlternatives_0_0()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1134:1: ( rule__Content__EntityAlternatives_0_0 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1134:2: rule__Content__EntityAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__Content__EntityAlternatives_0_0_in_rule__Content__EntityAssignment_02287);
            rule__Content__EntityAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getEntityAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__EntityAssignment_0"


    // $ANTLR start "rule__TextBlock__TextAssignment"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1143:1: rule__TextBlock__TextAssignment : ( ( rule__TextBlock__TextAlternatives_0 ) ) ;
    public final void rule__TextBlock__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1147:1: ( ( ( rule__TextBlock__TextAlternatives_0 ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1148:1: ( ( rule__TextBlock__TextAlternatives_0 ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1148:1: ( ( rule__TextBlock__TextAlternatives_0 ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1149:1: ( rule__TextBlock__TextAlternatives_0 )
            {
             before(grammarAccess.getTextBlockAccess().getTextAlternatives_0()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1150:1: ( rule__TextBlock__TextAlternatives_0 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1150:2: rule__TextBlock__TextAlternatives_0
            {
            pushFollow(FOLLOW_rule__TextBlock__TextAlternatives_0_in_rule__TextBlock__TextAssignment2320);
            rule__TextBlock__TextAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTextBlockAccess().getTextAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextBlock__TextAssignment"


    // $ANTLR start "rule__Header1__ValueAssignment_1"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1159:1: rule__Header1__ValueAssignment_1 : ( RULE_TEXT ) ;
    public final void rule__Header1__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1163:1: ( ( RULE_TEXT ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1164:1: ( RULE_TEXT )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1164:1: ( RULE_TEXT )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1165:1: RULE_TEXT
            {
             before(grammarAccess.getHeader1Access().getValueTEXTTerminalRuleCall_1_0()); 
            match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_rule__Header1__ValueAssignment_12353); 
             after(grammarAccess.getHeader1Access().getValueTEXTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header1__ValueAssignment_1"


    // $ANTLR start "rule__Header2__ValueAssignment_1"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1174:1: rule__Header2__ValueAssignment_1 : ( RULE_TEXT ) ;
    public final void rule__Header2__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1178:1: ( ( RULE_TEXT ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1179:1: ( RULE_TEXT )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1179:1: ( RULE_TEXT )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1180:1: RULE_TEXT
            {
             before(grammarAccess.getHeader2Access().getValueTEXTTerminalRuleCall_1_0()); 
            match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_rule__Header2__ValueAssignment_12384); 
             after(grammarAccess.getHeader2Access().getValueTEXTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header2__ValueAssignment_1"


    // $ANTLR start "rule__PlainText__ValueAssignment"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1189:1: rule__PlainText__ValueAssignment : ( RULE_TEXT ) ;
    public final void rule__PlainText__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1193:1: ( ( RULE_TEXT ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1194:1: ( RULE_TEXT )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1194:1: ( RULE_TEXT )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1195:1: RULE_TEXT
            {
             before(grammarAccess.getPlainTextAccess().getValueTEXTTerminalRuleCall_0()); 
            match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_rule__PlainText__ValueAssignment2415); 
             after(grammarAccess.getPlainTextAccess().getValueTEXTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlainText__ValueAssignment"


    // $ANTLR start "rule__Italic__ValueAssignment_0_1"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1204:1: rule__Italic__ValueAssignment_0_1 : ( ( rule__Italic__ValueAlternatives_0_1_0 ) ) ;
    public final void rule__Italic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1208:1: ( ( ( rule__Italic__ValueAlternatives_0_1_0 ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1209:1: ( ( rule__Italic__ValueAlternatives_0_1_0 ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1209:1: ( ( rule__Italic__ValueAlternatives_0_1_0 ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1210:1: ( rule__Italic__ValueAlternatives_0_1_0 )
            {
             before(grammarAccess.getItalicAccess().getValueAlternatives_0_1_0()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1211:1: ( rule__Italic__ValueAlternatives_0_1_0 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1211:2: rule__Italic__ValueAlternatives_0_1_0
            {
            pushFollow(FOLLOW_rule__Italic__ValueAlternatives_0_1_0_in_rule__Italic__ValueAssignment_0_12446);
            rule__Italic__ValueAlternatives_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getItalicAccess().getValueAlternatives_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Italic__ValueAssignment_0_1"


    // $ANTLR start "rule__Italic__ValueAssignment_1_1"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1220:1: rule__Italic__ValueAssignment_1_1 : ( ( rule__Italic__ValueAlternatives_1_1_0 ) ) ;
    public final void rule__Italic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1224:1: ( ( ( rule__Italic__ValueAlternatives_1_1_0 ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1225:1: ( ( rule__Italic__ValueAlternatives_1_1_0 ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1225:1: ( ( rule__Italic__ValueAlternatives_1_1_0 ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1226:1: ( rule__Italic__ValueAlternatives_1_1_0 )
            {
             before(grammarAccess.getItalicAccess().getValueAlternatives_1_1_0()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1227:1: ( rule__Italic__ValueAlternatives_1_1_0 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1227:2: rule__Italic__ValueAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__Italic__ValueAlternatives_1_1_0_in_rule__Italic__ValueAssignment_1_12479);
            rule__Italic__ValueAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getItalicAccess().getValueAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Italic__ValueAssignment_1_1"


    // $ANTLR start "rule__Bold__ValueAssignment_0_1"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1236:1: rule__Bold__ValueAssignment_0_1 : ( ( rule__Bold__ValueAlternatives_0_1_0 ) ) ;
    public final void rule__Bold__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1240:1: ( ( ( rule__Bold__ValueAlternatives_0_1_0 ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1241:1: ( ( rule__Bold__ValueAlternatives_0_1_0 ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1241:1: ( ( rule__Bold__ValueAlternatives_0_1_0 ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1242:1: ( rule__Bold__ValueAlternatives_0_1_0 )
            {
             before(grammarAccess.getBoldAccess().getValueAlternatives_0_1_0()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1243:1: ( rule__Bold__ValueAlternatives_0_1_0 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1243:2: rule__Bold__ValueAlternatives_0_1_0
            {
            pushFollow(FOLLOW_rule__Bold__ValueAlternatives_0_1_0_in_rule__Bold__ValueAssignment_0_12512);
            rule__Bold__ValueAlternatives_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBoldAccess().getValueAlternatives_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bold__ValueAssignment_0_1"


    // $ANTLR start "rule__Bold__ValueAssignment_1_1"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1252:1: rule__Bold__ValueAssignment_1_1 : ( ( rule__Bold__ValueAlternatives_1_1_0 ) ) ;
    public final void rule__Bold__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1256:1: ( ( ( rule__Bold__ValueAlternatives_1_1_0 ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1257:1: ( ( rule__Bold__ValueAlternatives_1_1_0 ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1257:1: ( ( rule__Bold__ValueAlternatives_1_1_0 ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1258:1: ( rule__Bold__ValueAlternatives_1_1_0 )
            {
             before(grammarAccess.getBoldAccess().getValueAlternatives_1_1_0()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1259:1: ( rule__Bold__ValueAlternatives_1_1_0 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1259:2: rule__Bold__ValueAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__Bold__ValueAlternatives_1_1_0_in_rule__Bold__ValueAssignment_1_12545);
            rule__Bold__ValueAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBoldAccess().getValueAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bold__ValueAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleMarkdown_in_entryRuleMarkdown61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkdown68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Markdown__ContentAssignment_in_ruleMarkdown94 = new BitSet(new long[]{0x00000000000FA022L});
    public static final BitSet FOLLOW_ruleContent_in_entryRuleContent122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContent129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Content__Group__0_in_ruleContent155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextBlock_in_entryRuleTextBlock182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextBlock189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextBlock__TextAssignment_in_ruleTextBlock217 = new BitSet(new long[]{0x00000000000FA020L});
    public static final BitSet FOLLOW_rule__TextBlock__TextAssignment_in_ruleTextBlock229 = new BitSet(new long[]{0x00000000000FA022L});
    public static final BitSet FOLLOW_ruleHeader1_in_entryRuleHeader1259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeader1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header1__Group__0_in_ruleHeader1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader2_in_entryRuleHeader2319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeader2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header2__Group__0_in_ruleHeader2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlainText_in_entryRulePlainText379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlainText386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlainText__ValueAssignment_in_rulePlainText412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalic_in_entryRuleItalic439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItalic446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Italic__Alternatives_in_ruleItalic472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBold_in_entryRuleBold499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBold506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bold__Alternatives_in_ruleBold532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader1_in_rule__Content__EntityAlternatives_0_0568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader2_in_rule__Content__EntityAlternatives_0_0585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextBlock_in_rule__Content__EntityAlternatives_0_0602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlainText_in_rule__TextBlock__TextAlternatives_0634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalic_in_rule__TextBlock__TextAlternatives_0651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBold_in_rule__TextBlock__TextAlternatives_0668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Italic__Group_0__0_in_rule__Italic__Alternatives700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Italic__Group_1__0_in_rule__Italic__Alternatives718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlainText_in_rule__Italic__ValueAlternatives_0_1_0751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBold_in_rule__Italic__ValueAlternatives_0_1_0768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Italic__Alternatives_0_2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Italic__Alternatives_0_2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlainText_in_rule__Italic__ValueAlternatives_1_1_0855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBold_in_rule__Italic__ValueAlternatives_1_1_0872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bold__Group_0__0_in_rule__Bold__Alternatives904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bold__Group_1__0_in_rule__Bold__Alternatives922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlainText_in_rule__Bold__ValueAlternatives_0_1_0955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalic_in_rule__Bold__ValueAlternatives_0_1_0972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlainText_in_rule__Bold__ValueAlternatives_1_1_01004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalic_in_rule__Bold__ValueAlternatives_1_1_01021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Content__Group__0__Impl_in_rule__Content__Group__01051 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Content__Group__1_in_rule__Content__Group__01054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Content__EntityAssignment_0_in_rule__Content__Group__0__Impl1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Content__Group__1__Impl_in_rule__Content__Group__11111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rule__Content__Group__1__Impl1141 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rule__Content__Group__1__Impl1154 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Header1__Group__0__Impl_in_rule__Header1__Group__01191 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Header1__Group__1_in_rule__Header1__Group__01194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Header1__Group__0__Impl1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header1__Group__1__Impl_in_rule__Header1__Group__11253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header1__ValueAssignment_1_in_rule__Header1__Group__1__Impl1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header2__Group__0__Impl_in_rule__Header2__Group__01314 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Header2__Group__1_in_rule__Header2__Group__01317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Header2__Group__0__Impl1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header2__Group__1__Impl_in_rule__Header2__Group__11376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header2__ValueAssignment_1_in_rule__Header2__Group__1__Impl1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Italic__Group_0__0__Impl_in_rule__Italic__Group_0__01437 = new BitSet(new long[]{0x00000000000FA020L});
    public static final BitSet FOLLOW_rule__Italic__Group_0__1_in_rule__Italic__Group_0__01440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Italic__Group_0__0__Impl1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Italic__Group_0__1__Impl_in_rule__Italic__Group_0__11499 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Italic__Group_0__2_in_rule__Italic__Group_0__11502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Italic__ValueAssignment_0_1_in_rule__Italic__Group_0__1__Impl1531 = new BitSet(new long[]{0x00000000000FA022L});
    public static final BitSet FOLLOW_rule__Italic__ValueAssignment_0_1_in_rule__Italic__Group_0__1__Impl1543 = new BitSet(new long[]{0x00000000000FA022L});
    public static final BitSet FOLLOW_rule__Italic__Group_0__2__Impl_in_rule__Italic__Group_0__21576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Italic__Alternatives_0_2_in_rule__Italic__Group_0__2__Impl1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Italic__Group_1__0__Impl_in_rule__Italic__Group_1__01639 = new BitSet(new long[]{0x00000000000FA020L});
    public static final BitSet FOLLOW_rule__Italic__Group_1__1_in_rule__Italic__Group_1__01642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Italic__Group_1__0__Impl1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Italic__Group_1__1__Impl_in_rule__Italic__Group_1__11701 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Italic__Group_1__2_in_rule__Italic__Group_1__11704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Italic__ValueAssignment_1_1_in_rule__Italic__Group_1__1__Impl1733 = new BitSet(new long[]{0x00000000000FA022L});
    public static final BitSet FOLLOW_rule__Italic__ValueAssignment_1_1_in_rule__Italic__Group_1__1__Impl1745 = new BitSet(new long[]{0x00000000000FA022L});
    public static final BitSet FOLLOW_rule__Italic__Group_1__2__Impl_in_rule__Italic__Group_1__21778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Italic__Group_1__2__Impl1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bold__Group_0__0__Impl_in_rule__Bold__Group_0__01843 = new BitSet(new long[]{0x0000000000022020L});
    public static final BitSet FOLLOW_rule__Bold__Group_0__1_in_rule__Bold__Group_0__01846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Bold__Group_0__0__Impl1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bold__Group_0__1__Impl_in_rule__Bold__Group_0__11905 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Bold__Group_0__2_in_rule__Bold__Group_0__11908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bold__ValueAssignment_0_1_in_rule__Bold__Group_0__1__Impl1937 = new BitSet(new long[]{0x0000000000022022L});
    public static final BitSet FOLLOW_rule__Bold__ValueAssignment_0_1_in_rule__Bold__Group_0__1__Impl1949 = new BitSet(new long[]{0x0000000000022022L});
    public static final BitSet FOLLOW_rule__Bold__Group_0__2__Impl_in_rule__Bold__Group_0__21982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Bold__Group_0__2__Impl2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bold__Group_1__0__Impl_in_rule__Bold__Group_1__02047 = new BitSet(new long[]{0x0000000000022020L});
    public static final BitSet FOLLOW_rule__Bold__Group_1__1_in_rule__Bold__Group_1__02050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Bold__Group_1__0__Impl2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bold__Group_1__1__Impl_in_rule__Bold__Group_1__12109 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Bold__Group_1__2_in_rule__Bold__Group_1__12112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bold__ValueAssignment_1_1_in_rule__Bold__Group_1__1__Impl2141 = new BitSet(new long[]{0x0000000000022022L});
    public static final BitSet FOLLOW_rule__Bold__ValueAssignment_1_1_in_rule__Bold__Group_1__1__Impl2153 = new BitSet(new long[]{0x0000000000022022L});
    public static final BitSet FOLLOW_rule__Bold__Group_1__2__Impl_in_rule__Bold__Group_1__22186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Bold__Group_1__2__Impl2214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContent_in_rule__Markdown__ContentAssignment2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Content__EntityAlternatives_0_0_in_rule__Content__EntityAssignment_02287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextBlock__TextAlternatives_0_in_rule__TextBlock__TextAssignment2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TEXT_in_rule__Header1__ValueAssignment_12353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TEXT_in_rule__Header2__ValueAssignment_12384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TEXT_in_rule__PlainText__ValueAssignment2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Italic__ValueAlternatives_0_1_0_in_rule__Italic__ValueAssignment_0_12446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Italic__ValueAlternatives_1_1_0_in_rule__Italic__ValueAssignment_1_12479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bold__ValueAlternatives_0_1_0_in_rule__Bold__ValueAssignment_0_12512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bold__ValueAlternatives_1_1_0_in_rule__Bold__ValueAssignment_1_12545 = new BitSet(new long[]{0x0000000000000002L});

}