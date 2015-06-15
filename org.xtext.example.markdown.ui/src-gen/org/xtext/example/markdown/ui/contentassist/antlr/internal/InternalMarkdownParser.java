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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NEWLINE", "RULE_HEADER_VALUE", "RULE_TEXT", "RULE_ID", "RULE_WS", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'#'", "'##'", "'*'", "'_'", "'**'", "'__'"
    };
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

                if ( (LA1_0==RULE_TEXT||(LA1_0>=14 && LA1_0<=19)) ) {
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


    // $ANTLR start "entryRuleHeader1"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:116:1: entryRuleHeader1 : ruleHeader1 EOF ;
    public final void entryRuleHeader1() throws RecognitionException {
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:117:1: ( ruleHeader1 EOF )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:118:1: ruleHeader1 EOF
            {
             before(grammarAccess.getHeader1Rule()); 
            pushFollow(FOLLOW_ruleHeader1_in_entryRuleHeader1182);
            ruleHeader1();

            state._fsp--;

             after(grammarAccess.getHeader1Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeader1189); 

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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:125:1: ruleHeader1 : ( ( rule__Header1__Group__0 ) ) ;
    public final void ruleHeader1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:129:2: ( ( ( rule__Header1__Group__0 ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:130:1: ( ( rule__Header1__Group__0 ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:130:1: ( ( rule__Header1__Group__0 ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:131:1: ( rule__Header1__Group__0 )
            {
             before(grammarAccess.getHeader1Access().getGroup()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:132:1: ( rule__Header1__Group__0 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:132:2: rule__Header1__Group__0
            {
            pushFollow(FOLLOW_rule__Header1__Group__0_in_ruleHeader1215);
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:144:1: entryRuleHeader2 : ruleHeader2 EOF ;
    public final void entryRuleHeader2() throws RecognitionException {
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:145:1: ( ruleHeader2 EOF )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:146:1: ruleHeader2 EOF
            {
             before(grammarAccess.getHeader2Rule()); 
            pushFollow(FOLLOW_ruleHeader2_in_entryRuleHeader2242);
            ruleHeader2();

            state._fsp--;

             after(grammarAccess.getHeader2Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeader2249); 

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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:153:1: ruleHeader2 : ( ( rule__Header2__Group__0 ) ) ;
    public final void ruleHeader2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:157:2: ( ( ( rule__Header2__Group__0 ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:158:1: ( ( rule__Header2__Group__0 ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:158:1: ( ( rule__Header2__Group__0 ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:159:1: ( rule__Header2__Group__0 )
            {
             before(grammarAccess.getHeader2Access().getGroup()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:160:1: ( rule__Header2__Group__0 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:160:2: rule__Header2__Group__0
            {
            pushFollow(FOLLOW_rule__Header2__Group__0_in_ruleHeader2275);
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:172:1: entryRulePlainText : rulePlainText EOF ;
    public final void entryRulePlainText() throws RecognitionException {
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:173:1: ( rulePlainText EOF )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:174:1: rulePlainText EOF
            {
             before(grammarAccess.getPlainTextRule()); 
            pushFollow(FOLLOW_rulePlainText_in_entryRulePlainText302);
            rulePlainText();

            state._fsp--;

             after(grammarAccess.getPlainTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlainText309); 

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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:181:1: rulePlainText : ( ( rule__PlainText__ValueAssignment ) ) ;
    public final void rulePlainText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:185:2: ( ( ( rule__PlainText__ValueAssignment ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:186:1: ( ( rule__PlainText__ValueAssignment ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:186:1: ( ( rule__PlainText__ValueAssignment ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:187:1: ( rule__PlainText__ValueAssignment )
            {
             before(grammarAccess.getPlainTextAccess().getValueAssignment()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:188:1: ( rule__PlainText__ValueAssignment )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:188:2: rule__PlainText__ValueAssignment
            {
            pushFollow(FOLLOW_rule__PlainText__ValueAssignment_in_rulePlainText335);
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:200:1: entryRuleItalic : ruleItalic EOF ;
    public final void entryRuleItalic() throws RecognitionException {
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:201:1: ( ruleItalic EOF )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:202:1: ruleItalic EOF
            {
             before(grammarAccess.getItalicRule()); 
            pushFollow(FOLLOW_ruleItalic_in_entryRuleItalic362);
            ruleItalic();

            state._fsp--;

             after(grammarAccess.getItalicRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItalic369); 

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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:209:1: ruleItalic : ( ( rule__Italic__Alternatives ) ) ;
    public final void ruleItalic() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:213:2: ( ( ( rule__Italic__Alternatives ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:214:1: ( ( rule__Italic__Alternatives ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:214:1: ( ( rule__Italic__Alternatives ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:215:1: ( rule__Italic__Alternatives )
            {
             before(grammarAccess.getItalicAccess().getAlternatives()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:216:1: ( rule__Italic__Alternatives )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:216:2: rule__Italic__Alternatives
            {
            pushFollow(FOLLOW_rule__Italic__Alternatives_in_ruleItalic395);
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:228:1: entryRuleBold : ruleBold EOF ;
    public final void entryRuleBold() throws RecognitionException {
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:229:1: ( ruleBold EOF )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:230:1: ruleBold EOF
            {
             before(grammarAccess.getBoldRule()); 
            pushFollow(FOLLOW_ruleBold_in_entryRuleBold422);
            ruleBold();

            state._fsp--;

             after(grammarAccess.getBoldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBold429); 

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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:237:1: ruleBold : ( ( rule__Bold__Alternatives ) ) ;
    public final void ruleBold() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:241:2: ( ( ( rule__Bold__Alternatives ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:242:1: ( ( rule__Bold__Alternatives ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:242:1: ( ( rule__Bold__Alternatives ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:243:1: ( rule__Bold__Alternatives )
            {
             before(grammarAccess.getBoldAccess().getAlternatives()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:244:1: ( rule__Bold__Alternatives )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:244:2: rule__Bold__Alternatives
            {
            pushFollow(FOLLOW_rule__Bold__Alternatives_in_ruleBold455);
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:256:1: rule__Content__EntityAlternatives_0_0 : ( ( ruleHeader1 ) | ( ruleHeader2 ) | ( ruleItalic ) | ( ruleBold ) | ( rulePlainText ) );
    public final void rule__Content__EntityAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:260:1: ( ( ruleHeader1 ) | ( ruleHeader2 ) | ( ruleItalic ) | ( ruleBold ) | ( rulePlainText ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 16:
            case 17:
                {
                alt2=3;
                }
                break;
            case 18:
            case 19:
                {
                alt2=4;
                }
                break;
            case RULE_TEXT:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:261:1: ( ruleHeader1 )
                    {
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:261:1: ( ruleHeader1 )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:262:1: ruleHeader1
                    {
                     before(grammarAccess.getContentAccess().getEntityHeader1ParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_ruleHeader1_in_rule__Content__EntityAlternatives_0_0491);
                    ruleHeader1();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getEntityHeader1ParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:267:6: ( ruleHeader2 )
                    {
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:267:6: ( ruleHeader2 )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:268:1: ruleHeader2
                    {
                     before(grammarAccess.getContentAccess().getEntityHeader2ParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_ruleHeader2_in_rule__Content__EntityAlternatives_0_0508);
                    ruleHeader2();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getEntityHeader2ParserRuleCall_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:273:6: ( ruleItalic )
                    {
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:273:6: ( ruleItalic )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:274:1: ruleItalic
                    {
                     before(grammarAccess.getContentAccess().getEntityItalicParserRuleCall_0_0_2()); 
                    pushFollow(FOLLOW_ruleItalic_in_rule__Content__EntityAlternatives_0_0525);
                    ruleItalic();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getEntityItalicParserRuleCall_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:279:6: ( ruleBold )
                    {
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:279:6: ( ruleBold )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:280:1: ruleBold
                    {
                     before(grammarAccess.getContentAccess().getEntityBoldParserRuleCall_0_0_3()); 
                    pushFollow(FOLLOW_ruleBold_in_rule__Content__EntityAlternatives_0_0542);
                    ruleBold();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getEntityBoldParserRuleCall_0_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:285:6: ( rulePlainText )
                    {
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:285:6: ( rulePlainText )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:286:1: rulePlainText
                    {
                     before(grammarAccess.getContentAccess().getEntityPlainTextParserRuleCall_0_0_4()); 
                    pushFollow(FOLLOW_rulePlainText_in_rule__Content__EntityAlternatives_0_0559);
                    rulePlainText();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getEntityPlainTextParserRuleCall_0_0_4()); 

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


    // $ANTLR start "rule__Italic__Alternatives"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:296:1: rule__Italic__Alternatives : ( ( ( rule__Italic__Group_0__0 ) ) | ( ( rule__Italic__Group_1__0 ) ) );
    public final void rule__Italic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:300:1: ( ( ( rule__Italic__Group_0__0 ) ) | ( ( rule__Italic__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:301:1: ( ( rule__Italic__Group_0__0 ) )
                    {
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:301:1: ( ( rule__Italic__Group_0__0 ) )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:302:1: ( rule__Italic__Group_0__0 )
                    {
                     before(grammarAccess.getItalicAccess().getGroup_0()); 
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:303:1: ( rule__Italic__Group_0__0 )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:303:2: rule__Italic__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Italic__Group_0__0_in_rule__Italic__Alternatives591);
                    rule__Italic__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getItalicAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:307:6: ( ( rule__Italic__Group_1__0 ) )
                    {
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:307:6: ( ( rule__Italic__Group_1__0 ) )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:308:1: ( rule__Italic__Group_1__0 )
                    {
                     before(grammarAccess.getItalicAccess().getGroup_1()); 
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:309:1: ( rule__Italic__Group_1__0 )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:309:2: rule__Italic__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Italic__Group_1__0_in_rule__Italic__Alternatives609);
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:318:1: rule__Italic__ValueAlternatives_0_1_0 : ( ( rulePlainText ) | ( ruleBold ) );
    public final void rule__Italic__ValueAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:322:1: ( ( rulePlainText ) | ( ruleBold ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_TEXT) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=18 && LA4_0<=19)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:323:1: ( rulePlainText )
                    {
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:323:1: ( rulePlainText )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:324:1: rulePlainText
                    {
                     before(grammarAccess.getItalicAccess().getValuePlainTextParserRuleCall_0_1_0_0()); 
                    pushFollow(FOLLOW_rulePlainText_in_rule__Italic__ValueAlternatives_0_1_0642);
                    rulePlainText();

                    state._fsp--;

                     after(grammarAccess.getItalicAccess().getValuePlainTextParserRuleCall_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:329:6: ( ruleBold )
                    {
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:329:6: ( ruleBold )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:330:1: ruleBold
                    {
                     before(grammarAccess.getItalicAccess().getValueBoldParserRuleCall_0_1_0_1()); 
                    pushFollow(FOLLOW_ruleBold_in_rule__Italic__ValueAlternatives_0_1_0659);
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


    // $ANTLR start "rule__Italic__ValueAlternatives_1_1_0"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:340:1: rule__Italic__ValueAlternatives_1_1_0 : ( ( rulePlainText ) | ( ruleBold ) );
    public final void rule__Italic__ValueAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:344:1: ( ( rulePlainText ) | ( ruleBold ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_TEXT) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=18 && LA5_0<=19)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:345:1: ( rulePlainText )
                    {
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:345:1: ( rulePlainText )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:346:1: rulePlainText
                    {
                     before(grammarAccess.getItalicAccess().getValuePlainTextParserRuleCall_1_1_0_0()); 
                    pushFollow(FOLLOW_rulePlainText_in_rule__Italic__ValueAlternatives_1_1_0691);
                    rulePlainText();

                    state._fsp--;

                     after(grammarAccess.getItalicAccess().getValuePlainTextParserRuleCall_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:351:6: ( ruleBold )
                    {
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:351:6: ( ruleBold )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:352:1: ruleBold
                    {
                     before(grammarAccess.getItalicAccess().getValueBoldParserRuleCall_1_1_0_1()); 
                    pushFollow(FOLLOW_ruleBold_in_rule__Italic__ValueAlternatives_1_1_0708);
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:362:1: rule__Bold__Alternatives : ( ( ( rule__Bold__Group_0__0 ) ) | ( ( rule__Bold__Group_1__0 ) ) );
    public final void rule__Bold__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:366:1: ( ( ( rule__Bold__Group_0__0 ) ) | ( ( rule__Bold__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:367:1: ( ( rule__Bold__Group_0__0 ) )
                    {
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:367:1: ( ( rule__Bold__Group_0__0 ) )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:368:1: ( rule__Bold__Group_0__0 )
                    {
                     before(grammarAccess.getBoldAccess().getGroup_0()); 
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:369:1: ( rule__Bold__Group_0__0 )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:369:2: rule__Bold__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Bold__Group_0__0_in_rule__Bold__Alternatives740);
                    rule__Bold__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBoldAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:373:6: ( ( rule__Bold__Group_1__0 ) )
                    {
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:373:6: ( ( rule__Bold__Group_1__0 ) )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:374:1: ( rule__Bold__Group_1__0 )
                    {
                     before(grammarAccess.getBoldAccess().getGroup_1()); 
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:375:1: ( rule__Bold__Group_1__0 )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:375:2: rule__Bold__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Bold__Group_1__0_in_rule__Bold__Alternatives758);
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:384:1: rule__Bold__ValueAlternatives_0_1_0 : ( ( rulePlainText ) | ( ruleItalic ) );
    public final void rule__Bold__ValueAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:388:1: ( ( rulePlainText ) | ( ruleItalic ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_TEXT) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=16 && LA7_0<=17)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:389:1: ( rulePlainText )
                    {
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:389:1: ( rulePlainText )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:390:1: rulePlainText
                    {
                     before(grammarAccess.getBoldAccess().getValuePlainTextParserRuleCall_0_1_0_0()); 
                    pushFollow(FOLLOW_rulePlainText_in_rule__Bold__ValueAlternatives_0_1_0791);
                    rulePlainText();

                    state._fsp--;

                     after(grammarAccess.getBoldAccess().getValuePlainTextParserRuleCall_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:395:6: ( ruleItalic )
                    {
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:395:6: ( ruleItalic )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:396:1: ruleItalic
                    {
                     before(grammarAccess.getBoldAccess().getValueItalicParserRuleCall_0_1_0_1()); 
                    pushFollow(FOLLOW_ruleItalic_in_rule__Bold__ValueAlternatives_0_1_0808);
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:406:1: rule__Bold__ValueAlternatives_1_1_0 : ( ( rulePlainText ) | ( ruleItalic ) );
    public final void rule__Bold__ValueAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:410:1: ( ( rulePlainText ) | ( ruleItalic ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_TEXT) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=16 && LA8_0<=17)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:411:1: ( rulePlainText )
                    {
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:411:1: ( rulePlainText )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:412:1: rulePlainText
                    {
                     before(grammarAccess.getBoldAccess().getValuePlainTextParserRuleCall_1_1_0_0()); 
                    pushFollow(FOLLOW_rulePlainText_in_rule__Bold__ValueAlternatives_1_1_0840);
                    rulePlainText();

                    state._fsp--;

                     after(grammarAccess.getBoldAccess().getValuePlainTextParserRuleCall_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:417:6: ( ruleItalic )
                    {
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:417:6: ( ruleItalic )
                    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:418:1: ruleItalic
                    {
                     before(grammarAccess.getBoldAccess().getValueItalicParserRuleCall_1_1_0_1()); 
                    pushFollow(FOLLOW_ruleItalic_in_rule__Bold__ValueAlternatives_1_1_0857);
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:430:1: rule__Content__Group__0 : rule__Content__Group__0__Impl rule__Content__Group__1 ;
    public final void rule__Content__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:434:1: ( rule__Content__Group__0__Impl rule__Content__Group__1 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:435:2: rule__Content__Group__0__Impl rule__Content__Group__1
            {
            pushFollow(FOLLOW_rule__Content__Group__0__Impl_in_rule__Content__Group__0887);
            rule__Content__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Content__Group__1_in_rule__Content__Group__0890);
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:442:1: rule__Content__Group__0__Impl : ( ( ( rule__Content__EntityAssignment_0 ) ) ( ( rule__Content__EntityAssignment_0 )* ) ) ;
    public final void rule__Content__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:446:1: ( ( ( ( rule__Content__EntityAssignment_0 ) ) ( ( rule__Content__EntityAssignment_0 )* ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:447:1: ( ( ( rule__Content__EntityAssignment_0 ) ) ( ( rule__Content__EntityAssignment_0 )* ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:447:1: ( ( ( rule__Content__EntityAssignment_0 ) ) ( ( rule__Content__EntityAssignment_0 )* ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:448:1: ( ( rule__Content__EntityAssignment_0 ) ) ( ( rule__Content__EntityAssignment_0 )* )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:448:1: ( ( rule__Content__EntityAssignment_0 ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:449:1: ( rule__Content__EntityAssignment_0 )
            {
             before(grammarAccess.getContentAccess().getEntityAssignment_0()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:450:1: ( rule__Content__EntityAssignment_0 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:450:2: rule__Content__EntityAssignment_0
            {
            pushFollow(FOLLOW_rule__Content__EntityAssignment_0_in_rule__Content__Group__0__Impl919);
            rule__Content__EntityAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getEntityAssignment_0()); 

            }

            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:453:1: ( ( rule__Content__EntityAssignment_0 )* )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:454:1: ( rule__Content__EntityAssignment_0 )*
            {
             before(grammarAccess.getContentAccess().getEntityAssignment_0()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:455:1: ( rule__Content__EntityAssignment_0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_TEXT||(LA9_0>=14 && LA9_0<=19)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:455:2: rule__Content__EntityAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Content__EntityAssignment_0_in_rule__Content__Group__0__Impl931);
            	    rule__Content__EntityAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getContentAccess().getEntityAssignment_0()); 

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
    // $ANTLR end "rule__Content__Group__0__Impl"


    // $ANTLR start "rule__Content__Group__1"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:466:1: rule__Content__Group__1 : rule__Content__Group__1__Impl ;
    public final void rule__Content__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:470:1: ( rule__Content__Group__1__Impl )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:471:2: rule__Content__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Content__Group__1__Impl_in_rule__Content__Group__1964);
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:477:1: rule__Content__Group__1__Impl : ( ( ( RULE_NEWLINE ) ) ( ( RULE_NEWLINE )* ) ) ;
    public final void rule__Content__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:481:1: ( ( ( ( RULE_NEWLINE ) ) ( ( RULE_NEWLINE )* ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:482:1: ( ( ( RULE_NEWLINE ) ) ( ( RULE_NEWLINE )* ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:482:1: ( ( ( RULE_NEWLINE ) ) ( ( RULE_NEWLINE )* ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:483:1: ( ( RULE_NEWLINE ) ) ( ( RULE_NEWLINE )* )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:483:1: ( ( RULE_NEWLINE ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:484:1: ( RULE_NEWLINE )
            {
             before(grammarAccess.getContentAccess().getNEWLINETerminalRuleCall_1()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:485:1: ( RULE_NEWLINE )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:485:3: RULE_NEWLINE
            {
            match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rule__Content__Group__1__Impl994); 

            }

             after(grammarAccess.getContentAccess().getNEWLINETerminalRuleCall_1()); 

            }

            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:488:1: ( ( RULE_NEWLINE )* )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:489:1: ( RULE_NEWLINE )*
            {
             before(grammarAccess.getContentAccess().getNEWLINETerminalRuleCall_1()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:490:1: ( RULE_NEWLINE )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_NEWLINE) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:490:3: RULE_NEWLINE
            	    {
            	    match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_rule__Content__Group__1__Impl1007); 

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:505:1: rule__Header1__Group__0 : rule__Header1__Group__0__Impl rule__Header1__Group__1 ;
    public final void rule__Header1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:509:1: ( rule__Header1__Group__0__Impl rule__Header1__Group__1 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:510:2: rule__Header1__Group__0__Impl rule__Header1__Group__1
            {
            pushFollow(FOLLOW_rule__Header1__Group__0__Impl_in_rule__Header1__Group__01044);
            rule__Header1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header1__Group__1_in_rule__Header1__Group__01047);
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:517:1: rule__Header1__Group__0__Impl : ( '#' ) ;
    public final void rule__Header1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:521:1: ( ( '#' ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:522:1: ( '#' )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:522:1: ( '#' )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:523:1: '#'
            {
             before(grammarAccess.getHeader1Access().getNumberSignKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Header1__Group__0__Impl1075); 
             after(grammarAccess.getHeader1Access().getNumberSignKeyword_0()); 

            }


            }

        }
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:536:1: rule__Header1__Group__1 : rule__Header1__Group__1__Impl ;
    public final void rule__Header1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:540:1: ( rule__Header1__Group__1__Impl )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:541:2: rule__Header1__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Header1__Group__1__Impl_in_rule__Header1__Group__11106);
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:547:1: rule__Header1__Group__1__Impl : ( ( rule__Header1__ValueAssignment_1 ) ) ;
    public final void rule__Header1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:551:1: ( ( ( rule__Header1__ValueAssignment_1 ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:552:1: ( ( rule__Header1__ValueAssignment_1 ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:552:1: ( ( rule__Header1__ValueAssignment_1 ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:553:1: ( rule__Header1__ValueAssignment_1 )
            {
             before(grammarAccess.getHeader1Access().getValueAssignment_1()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:554:1: ( rule__Header1__ValueAssignment_1 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:554:2: rule__Header1__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Header1__ValueAssignment_1_in_rule__Header1__Group__1__Impl1133);
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:568:1: rule__Header2__Group__0 : rule__Header2__Group__0__Impl rule__Header2__Group__1 ;
    public final void rule__Header2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:572:1: ( rule__Header2__Group__0__Impl rule__Header2__Group__1 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:573:2: rule__Header2__Group__0__Impl rule__Header2__Group__1
            {
            pushFollow(FOLLOW_rule__Header2__Group__0__Impl_in_rule__Header2__Group__01167);
            rule__Header2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header2__Group__1_in_rule__Header2__Group__01170);
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:580:1: rule__Header2__Group__0__Impl : ( '##' ) ;
    public final void rule__Header2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:584:1: ( ( '##' ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:585:1: ( '##' )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:585:1: ( '##' )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:586:1: '##'
            {
             before(grammarAccess.getHeader2Access().getNumberSignNumberSignKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Header2__Group__0__Impl1198); 
             after(grammarAccess.getHeader2Access().getNumberSignNumberSignKeyword_0()); 

            }


            }

        }
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:599:1: rule__Header2__Group__1 : rule__Header2__Group__1__Impl ;
    public final void rule__Header2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:603:1: ( rule__Header2__Group__1__Impl )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:604:2: rule__Header2__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Header2__Group__1__Impl_in_rule__Header2__Group__11229);
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:610:1: rule__Header2__Group__1__Impl : ( ( rule__Header2__ValueAssignment_1 ) ) ;
    public final void rule__Header2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:614:1: ( ( ( rule__Header2__ValueAssignment_1 ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:615:1: ( ( rule__Header2__ValueAssignment_1 ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:615:1: ( ( rule__Header2__ValueAssignment_1 ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:616:1: ( rule__Header2__ValueAssignment_1 )
            {
             before(grammarAccess.getHeader2Access().getValueAssignment_1()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:617:1: ( rule__Header2__ValueAssignment_1 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:617:2: rule__Header2__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Header2__ValueAssignment_1_in_rule__Header2__Group__1__Impl1256);
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:631:1: rule__Italic__Group_0__0 : rule__Italic__Group_0__0__Impl rule__Italic__Group_0__1 ;
    public final void rule__Italic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:635:1: ( rule__Italic__Group_0__0__Impl rule__Italic__Group_0__1 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:636:2: rule__Italic__Group_0__0__Impl rule__Italic__Group_0__1
            {
            pushFollow(FOLLOW_rule__Italic__Group_0__0__Impl_in_rule__Italic__Group_0__01290);
            rule__Italic__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Italic__Group_0__1_in_rule__Italic__Group_0__01293);
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:643:1: rule__Italic__Group_0__0__Impl : ( '*' ) ;
    public final void rule__Italic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:647:1: ( ( '*' ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:648:1: ( '*' )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:648:1: ( '*' )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:649:1: '*'
            {
             before(grammarAccess.getItalicAccess().getAsteriskKeyword_0_0()); 
            match(input,16,FOLLOW_16_in_rule__Italic__Group_0__0__Impl1321); 
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:662:1: rule__Italic__Group_0__1 : rule__Italic__Group_0__1__Impl rule__Italic__Group_0__2 ;
    public final void rule__Italic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:666:1: ( rule__Italic__Group_0__1__Impl rule__Italic__Group_0__2 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:667:2: rule__Italic__Group_0__1__Impl rule__Italic__Group_0__2
            {
            pushFollow(FOLLOW_rule__Italic__Group_0__1__Impl_in_rule__Italic__Group_0__11352);
            rule__Italic__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Italic__Group_0__2_in_rule__Italic__Group_0__11355);
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:674:1: rule__Italic__Group_0__1__Impl : ( ( ( rule__Italic__ValueAssignment_0_1 ) ) ( ( rule__Italic__ValueAssignment_0_1 )* ) ) ;
    public final void rule__Italic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:678:1: ( ( ( ( rule__Italic__ValueAssignment_0_1 ) ) ( ( rule__Italic__ValueAssignment_0_1 )* ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:679:1: ( ( ( rule__Italic__ValueAssignment_0_1 ) ) ( ( rule__Italic__ValueAssignment_0_1 )* ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:679:1: ( ( ( rule__Italic__ValueAssignment_0_1 ) ) ( ( rule__Italic__ValueAssignment_0_1 )* ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:680:1: ( ( rule__Italic__ValueAssignment_0_1 ) ) ( ( rule__Italic__ValueAssignment_0_1 )* )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:680:1: ( ( rule__Italic__ValueAssignment_0_1 ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:681:1: ( rule__Italic__ValueAssignment_0_1 )
            {
             before(grammarAccess.getItalicAccess().getValueAssignment_0_1()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:682:1: ( rule__Italic__ValueAssignment_0_1 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:682:2: rule__Italic__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Italic__ValueAssignment_0_1_in_rule__Italic__Group_0__1__Impl1384);
            rule__Italic__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getItalicAccess().getValueAssignment_0_1()); 

            }

            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:685:1: ( ( rule__Italic__ValueAssignment_0_1 )* )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:686:1: ( rule__Italic__ValueAssignment_0_1 )*
            {
             before(grammarAccess.getItalicAccess().getValueAssignment_0_1()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:687:1: ( rule__Italic__ValueAssignment_0_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_TEXT||(LA11_0>=18 && LA11_0<=19)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:687:2: rule__Italic__ValueAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_rule__Italic__ValueAssignment_0_1_in_rule__Italic__Group_0__1__Impl1396);
            	    rule__Italic__ValueAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:698:1: rule__Italic__Group_0__2 : rule__Italic__Group_0__2__Impl ;
    public final void rule__Italic__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:702:1: ( rule__Italic__Group_0__2__Impl )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:703:2: rule__Italic__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Italic__Group_0__2__Impl_in_rule__Italic__Group_0__21429);
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:709:1: rule__Italic__Group_0__2__Impl : ( '*' ) ;
    public final void rule__Italic__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:713:1: ( ( '*' ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:714:1: ( '*' )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:714:1: ( '*' )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:715:1: '*'
            {
             before(grammarAccess.getItalicAccess().getAsteriskKeyword_0_2()); 
            match(input,16,FOLLOW_16_in_rule__Italic__Group_0__2__Impl1457); 
             after(grammarAccess.getItalicAccess().getAsteriskKeyword_0_2()); 

            }


            }

        }
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:734:1: rule__Italic__Group_1__0 : rule__Italic__Group_1__0__Impl rule__Italic__Group_1__1 ;
    public final void rule__Italic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:738:1: ( rule__Italic__Group_1__0__Impl rule__Italic__Group_1__1 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:739:2: rule__Italic__Group_1__0__Impl rule__Italic__Group_1__1
            {
            pushFollow(FOLLOW_rule__Italic__Group_1__0__Impl_in_rule__Italic__Group_1__01494);
            rule__Italic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Italic__Group_1__1_in_rule__Italic__Group_1__01497);
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:746:1: rule__Italic__Group_1__0__Impl : ( '_' ) ;
    public final void rule__Italic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:750:1: ( ( '_' ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:751:1: ( '_' )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:751:1: ( '_' )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:752:1: '_'
            {
             before(grammarAccess.getItalicAccess().get_Keyword_1_0()); 
            match(input,17,FOLLOW_17_in_rule__Italic__Group_1__0__Impl1525); 
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:765:1: rule__Italic__Group_1__1 : rule__Italic__Group_1__1__Impl rule__Italic__Group_1__2 ;
    public final void rule__Italic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:769:1: ( rule__Italic__Group_1__1__Impl rule__Italic__Group_1__2 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:770:2: rule__Italic__Group_1__1__Impl rule__Italic__Group_1__2
            {
            pushFollow(FOLLOW_rule__Italic__Group_1__1__Impl_in_rule__Italic__Group_1__11556);
            rule__Italic__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Italic__Group_1__2_in_rule__Italic__Group_1__11559);
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:777:1: rule__Italic__Group_1__1__Impl : ( ( ( rule__Italic__ValueAssignment_1_1 ) ) ( ( rule__Italic__ValueAssignment_1_1 )* ) ) ;
    public final void rule__Italic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:781:1: ( ( ( ( rule__Italic__ValueAssignment_1_1 ) ) ( ( rule__Italic__ValueAssignment_1_1 )* ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:782:1: ( ( ( rule__Italic__ValueAssignment_1_1 ) ) ( ( rule__Italic__ValueAssignment_1_1 )* ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:782:1: ( ( ( rule__Italic__ValueAssignment_1_1 ) ) ( ( rule__Italic__ValueAssignment_1_1 )* ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:783:1: ( ( rule__Italic__ValueAssignment_1_1 ) ) ( ( rule__Italic__ValueAssignment_1_1 )* )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:783:1: ( ( rule__Italic__ValueAssignment_1_1 ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:784:1: ( rule__Italic__ValueAssignment_1_1 )
            {
             before(grammarAccess.getItalicAccess().getValueAssignment_1_1()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:785:1: ( rule__Italic__ValueAssignment_1_1 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:785:2: rule__Italic__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Italic__ValueAssignment_1_1_in_rule__Italic__Group_1__1__Impl1588);
            rule__Italic__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getItalicAccess().getValueAssignment_1_1()); 

            }

            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:788:1: ( ( rule__Italic__ValueAssignment_1_1 )* )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:789:1: ( rule__Italic__ValueAssignment_1_1 )*
            {
             before(grammarAccess.getItalicAccess().getValueAssignment_1_1()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:790:1: ( rule__Italic__ValueAssignment_1_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_TEXT||(LA12_0>=18 && LA12_0<=19)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:790:2: rule__Italic__ValueAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_rule__Italic__ValueAssignment_1_1_in_rule__Italic__Group_1__1__Impl1600);
            	    rule__Italic__ValueAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:801:1: rule__Italic__Group_1__2 : rule__Italic__Group_1__2__Impl ;
    public final void rule__Italic__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:805:1: ( rule__Italic__Group_1__2__Impl )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:806:2: rule__Italic__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Italic__Group_1__2__Impl_in_rule__Italic__Group_1__21633);
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:812:1: rule__Italic__Group_1__2__Impl : ( '_' ) ;
    public final void rule__Italic__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:816:1: ( ( '_' ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:817:1: ( '_' )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:817:1: ( '_' )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:818:1: '_'
            {
             before(grammarAccess.getItalicAccess().get_Keyword_1_2()); 
            match(input,17,FOLLOW_17_in_rule__Italic__Group_1__2__Impl1661); 
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:837:1: rule__Bold__Group_0__0 : rule__Bold__Group_0__0__Impl rule__Bold__Group_0__1 ;
    public final void rule__Bold__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:841:1: ( rule__Bold__Group_0__0__Impl rule__Bold__Group_0__1 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:842:2: rule__Bold__Group_0__0__Impl rule__Bold__Group_0__1
            {
            pushFollow(FOLLOW_rule__Bold__Group_0__0__Impl_in_rule__Bold__Group_0__01698);
            rule__Bold__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bold__Group_0__1_in_rule__Bold__Group_0__01701);
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:849:1: rule__Bold__Group_0__0__Impl : ( '**' ) ;
    public final void rule__Bold__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:853:1: ( ( '**' ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:854:1: ( '**' )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:854:1: ( '**' )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:855:1: '**'
            {
             before(grammarAccess.getBoldAccess().getAsteriskAsteriskKeyword_0_0()); 
            match(input,18,FOLLOW_18_in_rule__Bold__Group_0__0__Impl1729); 
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:868:1: rule__Bold__Group_0__1 : rule__Bold__Group_0__1__Impl rule__Bold__Group_0__2 ;
    public final void rule__Bold__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:872:1: ( rule__Bold__Group_0__1__Impl rule__Bold__Group_0__2 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:873:2: rule__Bold__Group_0__1__Impl rule__Bold__Group_0__2
            {
            pushFollow(FOLLOW_rule__Bold__Group_0__1__Impl_in_rule__Bold__Group_0__11760);
            rule__Bold__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bold__Group_0__2_in_rule__Bold__Group_0__11763);
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:880:1: rule__Bold__Group_0__1__Impl : ( ( ( rule__Bold__ValueAssignment_0_1 ) ) ( ( rule__Bold__ValueAssignment_0_1 )* ) ) ;
    public final void rule__Bold__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:884:1: ( ( ( ( rule__Bold__ValueAssignment_0_1 ) ) ( ( rule__Bold__ValueAssignment_0_1 )* ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:885:1: ( ( ( rule__Bold__ValueAssignment_0_1 ) ) ( ( rule__Bold__ValueAssignment_0_1 )* ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:885:1: ( ( ( rule__Bold__ValueAssignment_0_1 ) ) ( ( rule__Bold__ValueAssignment_0_1 )* ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:886:1: ( ( rule__Bold__ValueAssignment_0_1 ) ) ( ( rule__Bold__ValueAssignment_0_1 )* )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:886:1: ( ( rule__Bold__ValueAssignment_0_1 ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:887:1: ( rule__Bold__ValueAssignment_0_1 )
            {
             before(grammarAccess.getBoldAccess().getValueAssignment_0_1()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:888:1: ( rule__Bold__ValueAssignment_0_1 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:888:2: rule__Bold__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Bold__ValueAssignment_0_1_in_rule__Bold__Group_0__1__Impl1792);
            rule__Bold__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getBoldAccess().getValueAssignment_0_1()); 

            }

            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:891:1: ( ( rule__Bold__ValueAssignment_0_1 )* )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:892:1: ( rule__Bold__ValueAssignment_0_1 )*
            {
             before(grammarAccess.getBoldAccess().getValueAssignment_0_1()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:893:1: ( rule__Bold__ValueAssignment_0_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_TEXT||(LA13_0>=16 && LA13_0<=17)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:893:2: rule__Bold__ValueAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_rule__Bold__ValueAssignment_0_1_in_rule__Bold__Group_0__1__Impl1804);
            	    rule__Bold__ValueAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:904:1: rule__Bold__Group_0__2 : rule__Bold__Group_0__2__Impl ;
    public final void rule__Bold__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:908:1: ( rule__Bold__Group_0__2__Impl )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:909:2: rule__Bold__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Bold__Group_0__2__Impl_in_rule__Bold__Group_0__21837);
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:915:1: rule__Bold__Group_0__2__Impl : ( '**' ) ;
    public final void rule__Bold__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:919:1: ( ( '**' ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:920:1: ( '**' )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:920:1: ( '**' )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:921:1: '**'
            {
             before(grammarAccess.getBoldAccess().getAsteriskAsteriskKeyword_0_2()); 
            match(input,18,FOLLOW_18_in_rule__Bold__Group_0__2__Impl1865); 
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:940:1: rule__Bold__Group_1__0 : rule__Bold__Group_1__0__Impl rule__Bold__Group_1__1 ;
    public final void rule__Bold__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:944:1: ( rule__Bold__Group_1__0__Impl rule__Bold__Group_1__1 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:945:2: rule__Bold__Group_1__0__Impl rule__Bold__Group_1__1
            {
            pushFollow(FOLLOW_rule__Bold__Group_1__0__Impl_in_rule__Bold__Group_1__01902);
            rule__Bold__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bold__Group_1__1_in_rule__Bold__Group_1__01905);
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:952:1: rule__Bold__Group_1__0__Impl : ( '__' ) ;
    public final void rule__Bold__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:956:1: ( ( '__' ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:957:1: ( '__' )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:957:1: ( '__' )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:958:1: '__'
            {
             before(grammarAccess.getBoldAccess().get__Keyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__Bold__Group_1__0__Impl1933); 
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:971:1: rule__Bold__Group_1__1 : rule__Bold__Group_1__1__Impl rule__Bold__Group_1__2 ;
    public final void rule__Bold__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:975:1: ( rule__Bold__Group_1__1__Impl rule__Bold__Group_1__2 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:976:2: rule__Bold__Group_1__1__Impl rule__Bold__Group_1__2
            {
            pushFollow(FOLLOW_rule__Bold__Group_1__1__Impl_in_rule__Bold__Group_1__11964);
            rule__Bold__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bold__Group_1__2_in_rule__Bold__Group_1__11967);
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:983:1: rule__Bold__Group_1__1__Impl : ( ( ( rule__Bold__ValueAssignment_1_1 ) ) ( ( rule__Bold__ValueAssignment_1_1 )* ) ) ;
    public final void rule__Bold__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:987:1: ( ( ( ( rule__Bold__ValueAssignment_1_1 ) ) ( ( rule__Bold__ValueAssignment_1_1 )* ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:988:1: ( ( ( rule__Bold__ValueAssignment_1_1 ) ) ( ( rule__Bold__ValueAssignment_1_1 )* ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:988:1: ( ( ( rule__Bold__ValueAssignment_1_1 ) ) ( ( rule__Bold__ValueAssignment_1_1 )* ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:989:1: ( ( rule__Bold__ValueAssignment_1_1 ) ) ( ( rule__Bold__ValueAssignment_1_1 )* )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:989:1: ( ( rule__Bold__ValueAssignment_1_1 ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:990:1: ( rule__Bold__ValueAssignment_1_1 )
            {
             before(grammarAccess.getBoldAccess().getValueAssignment_1_1()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:991:1: ( rule__Bold__ValueAssignment_1_1 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:991:2: rule__Bold__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Bold__ValueAssignment_1_1_in_rule__Bold__Group_1__1__Impl1996);
            rule__Bold__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBoldAccess().getValueAssignment_1_1()); 

            }

            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:994:1: ( ( rule__Bold__ValueAssignment_1_1 )* )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:995:1: ( rule__Bold__ValueAssignment_1_1 )*
            {
             before(grammarAccess.getBoldAccess().getValueAssignment_1_1()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:996:1: ( rule__Bold__ValueAssignment_1_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_TEXT||(LA14_0>=16 && LA14_0<=17)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:996:2: rule__Bold__ValueAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_rule__Bold__ValueAssignment_1_1_in_rule__Bold__Group_1__1__Impl2008);
            	    rule__Bold__ValueAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1007:1: rule__Bold__Group_1__2 : rule__Bold__Group_1__2__Impl ;
    public final void rule__Bold__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1011:1: ( rule__Bold__Group_1__2__Impl )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1012:2: rule__Bold__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Bold__Group_1__2__Impl_in_rule__Bold__Group_1__22041);
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1018:1: rule__Bold__Group_1__2__Impl : ( '__' ) ;
    public final void rule__Bold__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1022:1: ( ( '__' ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1023:1: ( '__' )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1023:1: ( '__' )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1024:1: '__'
            {
             before(grammarAccess.getBoldAccess().get__Keyword_1_2()); 
            match(input,19,FOLLOW_19_in_rule__Bold__Group_1__2__Impl2069); 
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1044:1: rule__Markdown__ContentAssignment : ( ruleContent ) ;
    public final void rule__Markdown__ContentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1048:1: ( ( ruleContent ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1049:1: ( ruleContent )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1049:1: ( ruleContent )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1050:1: ruleContent
            {
             before(grammarAccess.getMarkdownAccess().getContentContentParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleContent_in_rule__Markdown__ContentAssignment2111);
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1059:1: rule__Content__EntityAssignment_0 : ( ( rule__Content__EntityAlternatives_0_0 ) ) ;
    public final void rule__Content__EntityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1063:1: ( ( ( rule__Content__EntityAlternatives_0_0 ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1064:1: ( ( rule__Content__EntityAlternatives_0_0 ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1064:1: ( ( rule__Content__EntityAlternatives_0_0 ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1065:1: ( rule__Content__EntityAlternatives_0_0 )
            {
             before(grammarAccess.getContentAccess().getEntityAlternatives_0_0()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1066:1: ( rule__Content__EntityAlternatives_0_0 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1066:2: rule__Content__EntityAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__Content__EntityAlternatives_0_0_in_rule__Content__EntityAssignment_02142);
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


    // $ANTLR start "rule__Header1__ValueAssignment_1"
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1075:1: rule__Header1__ValueAssignment_1 : ( RULE_HEADER_VALUE ) ;
    public final void rule__Header1__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1079:1: ( ( RULE_HEADER_VALUE ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1080:1: ( RULE_HEADER_VALUE )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1080:1: ( RULE_HEADER_VALUE )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1081:1: RULE_HEADER_VALUE
            {
             before(grammarAccess.getHeader1Access().getValueHEADER_VALUETerminalRuleCall_1_0()); 
            match(input,RULE_HEADER_VALUE,FOLLOW_RULE_HEADER_VALUE_in_rule__Header1__ValueAssignment_12175); 
             after(grammarAccess.getHeader1Access().getValueHEADER_VALUETerminalRuleCall_1_0()); 

            }


            }

        }
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1090:1: rule__Header2__ValueAssignment_1 : ( RULE_HEADER_VALUE ) ;
    public final void rule__Header2__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1094:1: ( ( RULE_HEADER_VALUE ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1095:1: ( RULE_HEADER_VALUE )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1095:1: ( RULE_HEADER_VALUE )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1096:1: RULE_HEADER_VALUE
            {
             before(grammarAccess.getHeader2Access().getValueHEADER_VALUETerminalRuleCall_1_0()); 
            match(input,RULE_HEADER_VALUE,FOLLOW_RULE_HEADER_VALUE_in_rule__Header2__ValueAssignment_12206); 
             after(grammarAccess.getHeader2Access().getValueHEADER_VALUETerminalRuleCall_1_0()); 

            }


            }

        }
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1105:1: rule__PlainText__ValueAssignment : ( RULE_TEXT ) ;
    public final void rule__PlainText__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1109:1: ( ( RULE_TEXT ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1110:1: ( RULE_TEXT )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1110:1: ( RULE_TEXT )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1111:1: RULE_TEXT
            {
             before(grammarAccess.getPlainTextAccess().getValueTEXTTerminalRuleCall_0()); 
            match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_rule__PlainText__ValueAssignment2237); 
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1120:1: rule__Italic__ValueAssignment_0_1 : ( ( rule__Italic__ValueAlternatives_0_1_0 ) ) ;
    public final void rule__Italic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1124:1: ( ( ( rule__Italic__ValueAlternatives_0_1_0 ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1125:1: ( ( rule__Italic__ValueAlternatives_0_1_0 ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1125:1: ( ( rule__Italic__ValueAlternatives_0_1_0 ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1126:1: ( rule__Italic__ValueAlternatives_0_1_0 )
            {
             before(grammarAccess.getItalicAccess().getValueAlternatives_0_1_0()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1127:1: ( rule__Italic__ValueAlternatives_0_1_0 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1127:2: rule__Italic__ValueAlternatives_0_1_0
            {
            pushFollow(FOLLOW_rule__Italic__ValueAlternatives_0_1_0_in_rule__Italic__ValueAssignment_0_12268);
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1136:1: rule__Italic__ValueAssignment_1_1 : ( ( rule__Italic__ValueAlternatives_1_1_0 ) ) ;
    public final void rule__Italic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1140:1: ( ( ( rule__Italic__ValueAlternatives_1_1_0 ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1141:1: ( ( rule__Italic__ValueAlternatives_1_1_0 ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1141:1: ( ( rule__Italic__ValueAlternatives_1_1_0 ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1142:1: ( rule__Italic__ValueAlternatives_1_1_0 )
            {
             before(grammarAccess.getItalicAccess().getValueAlternatives_1_1_0()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1143:1: ( rule__Italic__ValueAlternatives_1_1_0 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1143:2: rule__Italic__ValueAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__Italic__ValueAlternatives_1_1_0_in_rule__Italic__ValueAssignment_1_12301);
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1152:1: rule__Bold__ValueAssignment_0_1 : ( ( rule__Bold__ValueAlternatives_0_1_0 ) ) ;
    public final void rule__Bold__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1156:1: ( ( ( rule__Bold__ValueAlternatives_0_1_0 ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1157:1: ( ( rule__Bold__ValueAlternatives_0_1_0 ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1157:1: ( ( rule__Bold__ValueAlternatives_0_1_0 ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1158:1: ( rule__Bold__ValueAlternatives_0_1_0 )
            {
             before(grammarAccess.getBoldAccess().getValueAlternatives_0_1_0()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1159:1: ( rule__Bold__ValueAlternatives_0_1_0 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1159:2: rule__Bold__ValueAlternatives_0_1_0
            {
            pushFollow(FOLLOW_rule__Bold__ValueAlternatives_0_1_0_in_rule__Bold__ValueAssignment_0_12334);
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
    // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1168:1: rule__Bold__ValueAssignment_1_1 : ( ( rule__Bold__ValueAlternatives_1_1_0 ) ) ;
    public final void rule__Bold__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1172:1: ( ( ( rule__Bold__ValueAlternatives_1_1_0 ) ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1173:1: ( ( rule__Bold__ValueAlternatives_1_1_0 ) )
            {
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1173:1: ( ( rule__Bold__ValueAlternatives_1_1_0 ) )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1174:1: ( rule__Bold__ValueAlternatives_1_1_0 )
            {
             before(grammarAccess.getBoldAccess().getValueAlternatives_1_1_0()); 
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1175:1: ( rule__Bold__ValueAlternatives_1_1_0 )
            // ../org.xtext.example.markdown.ui/src-gen/org/xtext/example/markdown/ui/contentassist/antlr/internal/InternalMarkdown.g:1175:2: rule__Bold__ValueAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__Bold__ValueAlternatives_1_1_0_in_rule__Bold__ValueAssignment_1_12367);
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
    public static final BitSet FOLLOW_rule__Markdown__ContentAssignment_in_ruleMarkdown94 = new BitSet(new long[]{0x00000000000FC042L});
    public static final BitSet FOLLOW_ruleContent_in_entryRuleContent122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContent129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Content__Group__0_in_ruleContent155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader1_in_entryRuleHeader1182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeader1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header1__Group__0_in_ruleHeader1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader2_in_entryRuleHeader2242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeader2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header2__Group__0_in_ruleHeader2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlainText_in_entryRulePlainText302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlainText309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PlainText__ValueAssignment_in_rulePlainText335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalic_in_entryRuleItalic362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItalic369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Italic__Alternatives_in_ruleItalic395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBold_in_entryRuleBold422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBold429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bold__Alternatives_in_ruleBold455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader1_in_rule__Content__EntityAlternatives_0_0491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader2_in_rule__Content__EntityAlternatives_0_0508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalic_in_rule__Content__EntityAlternatives_0_0525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBold_in_rule__Content__EntityAlternatives_0_0542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlainText_in_rule__Content__EntityAlternatives_0_0559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Italic__Group_0__0_in_rule__Italic__Alternatives591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Italic__Group_1__0_in_rule__Italic__Alternatives609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlainText_in_rule__Italic__ValueAlternatives_0_1_0642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBold_in_rule__Italic__ValueAlternatives_0_1_0659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlainText_in_rule__Italic__ValueAlternatives_1_1_0691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBold_in_rule__Italic__ValueAlternatives_1_1_0708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bold__Group_0__0_in_rule__Bold__Alternatives740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bold__Group_1__0_in_rule__Bold__Alternatives758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlainText_in_rule__Bold__ValueAlternatives_0_1_0791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalic_in_rule__Bold__ValueAlternatives_0_1_0808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlainText_in_rule__Bold__ValueAlternatives_1_1_0840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalic_in_rule__Bold__ValueAlternatives_1_1_0857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Content__Group__0__Impl_in_rule__Content__Group__0887 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Content__Group__1_in_rule__Content__Group__0890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Content__EntityAssignment_0_in_rule__Content__Group__0__Impl919 = new BitSet(new long[]{0x00000000000FC040L});
    public static final BitSet FOLLOW_rule__Content__EntityAssignment_0_in_rule__Content__Group__0__Impl931 = new BitSet(new long[]{0x00000000000FC042L});
    public static final BitSet FOLLOW_rule__Content__Group__1__Impl_in_rule__Content__Group__1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rule__Content__Group__1__Impl994 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_rule__Content__Group__1__Impl1007 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Header1__Group__0__Impl_in_rule__Header1__Group__01044 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Header1__Group__1_in_rule__Header1__Group__01047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Header1__Group__0__Impl1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header1__Group__1__Impl_in_rule__Header1__Group__11106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header1__ValueAssignment_1_in_rule__Header1__Group__1__Impl1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header2__Group__0__Impl_in_rule__Header2__Group__01167 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Header2__Group__1_in_rule__Header2__Group__01170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Header2__Group__0__Impl1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header2__Group__1__Impl_in_rule__Header2__Group__11229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header2__ValueAssignment_1_in_rule__Header2__Group__1__Impl1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Italic__Group_0__0__Impl_in_rule__Italic__Group_0__01290 = new BitSet(new long[]{0x00000000000FC040L});
    public static final BitSet FOLLOW_rule__Italic__Group_0__1_in_rule__Italic__Group_0__01293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Italic__Group_0__0__Impl1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Italic__Group_0__1__Impl_in_rule__Italic__Group_0__11352 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Italic__Group_0__2_in_rule__Italic__Group_0__11355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Italic__ValueAssignment_0_1_in_rule__Italic__Group_0__1__Impl1384 = new BitSet(new long[]{0x00000000000FC042L});
    public static final BitSet FOLLOW_rule__Italic__ValueAssignment_0_1_in_rule__Italic__Group_0__1__Impl1396 = new BitSet(new long[]{0x00000000000FC042L});
    public static final BitSet FOLLOW_rule__Italic__Group_0__2__Impl_in_rule__Italic__Group_0__21429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Italic__Group_0__2__Impl1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Italic__Group_1__0__Impl_in_rule__Italic__Group_1__01494 = new BitSet(new long[]{0x00000000000FC040L});
    public static final BitSet FOLLOW_rule__Italic__Group_1__1_in_rule__Italic__Group_1__01497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Italic__Group_1__0__Impl1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Italic__Group_1__1__Impl_in_rule__Italic__Group_1__11556 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Italic__Group_1__2_in_rule__Italic__Group_1__11559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Italic__ValueAssignment_1_1_in_rule__Italic__Group_1__1__Impl1588 = new BitSet(new long[]{0x00000000000FC042L});
    public static final BitSet FOLLOW_rule__Italic__ValueAssignment_1_1_in_rule__Italic__Group_1__1__Impl1600 = new BitSet(new long[]{0x00000000000FC042L});
    public static final BitSet FOLLOW_rule__Italic__Group_1__2__Impl_in_rule__Italic__Group_1__21633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Italic__Group_1__2__Impl1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bold__Group_0__0__Impl_in_rule__Bold__Group_0__01698 = new BitSet(new long[]{0x00000000000FC040L});
    public static final BitSet FOLLOW_rule__Bold__Group_0__1_in_rule__Bold__Group_0__01701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Bold__Group_0__0__Impl1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bold__Group_0__1__Impl_in_rule__Bold__Group_0__11760 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Bold__Group_0__2_in_rule__Bold__Group_0__11763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bold__ValueAssignment_0_1_in_rule__Bold__Group_0__1__Impl1792 = new BitSet(new long[]{0x00000000000FC042L});
    public static final BitSet FOLLOW_rule__Bold__ValueAssignment_0_1_in_rule__Bold__Group_0__1__Impl1804 = new BitSet(new long[]{0x00000000000FC042L});
    public static final BitSet FOLLOW_rule__Bold__Group_0__2__Impl_in_rule__Bold__Group_0__21837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Bold__Group_0__2__Impl1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bold__Group_1__0__Impl_in_rule__Bold__Group_1__01902 = new BitSet(new long[]{0x00000000000FC040L});
    public static final BitSet FOLLOW_rule__Bold__Group_1__1_in_rule__Bold__Group_1__01905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Bold__Group_1__0__Impl1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bold__Group_1__1__Impl_in_rule__Bold__Group_1__11964 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Bold__Group_1__2_in_rule__Bold__Group_1__11967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bold__ValueAssignment_1_1_in_rule__Bold__Group_1__1__Impl1996 = new BitSet(new long[]{0x00000000000FC042L});
    public static final BitSet FOLLOW_rule__Bold__ValueAssignment_1_1_in_rule__Bold__Group_1__1__Impl2008 = new BitSet(new long[]{0x00000000000FC042L});
    public static final BitSet FOLLOW_rule__Bold__Group_1__2__Impl_in_rule__Bold__Group_1__22041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Bold__Group_1__2__Impl2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContent_in_rule__Markdown__ContentAssignment2111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Content__EntityAlternatives_0_0_in_rule__Content__EntityAssignment_02142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEADER_VALUE_in_rule__Header1__ValueAssignment_12175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEADER_VALUE_in_rule__Header2__ValueAssignment_12206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TEXT_in_rule__PlainText__ValueAssignment2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Italic__ValueAlternatives_0_1_0_in_rule__Italic__ValueAssignment_0_12268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Italic__ValueAlternatives_1_1_0_in_rule__Italic__ValueAssignment_1_12301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bold__ValueAlternatives_0_1_0_in_rule__Bold__ValueAssignment_0_12334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bold__ValueAlternatives_1_1_0_in_rule__Bold__ValueAssignment_1_12367 = new BitSet(new long[]{0x0000000000000002L});

}