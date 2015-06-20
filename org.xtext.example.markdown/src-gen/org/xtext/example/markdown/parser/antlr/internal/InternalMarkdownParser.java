package org.xtext.example.markdown.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.markdown.services.MarkdownGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMarkdownParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NEWLINE", "RULE_TEXT", "RULE_ID", "RULE_WS", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'# '", "'## '", "'*'", "'_'", "'**'", "'__'"
    };
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


        public InternalMarkdownParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMarkdownParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMarkdownParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g"; }



     	private MarkdownGrammarAccess grammarAccess;
     	
        public InternalMarkdownParser(TokenStream input, MarkdownGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Markdown";	
       	}
       	
       	@Override
       	protected MarkdownGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMarkdown"
    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:67:1: entryRuleMarkdown returns [EObject current=null] : iv_ruleMarkdown= ruleMarkdown EOF ;
    public final EObject entryRuleMarkdown() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkdown = null;


        try {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:68:2: (iv_ruleMarkdown= ruleMarkdown EOF )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:69:2: iv_ruleMarkdown= ruleMarkdown EOF
            {
             newCompositeNode(grammarAccess.getMarkdownRule()); 
            pushFollow(FOLLOW_ruleMarkdown_in_entryRuleMarkdown75);
            iv_ruleMarkdown=ruleMarkdown();

            state._fsp--;

             current =iv_ruleMarkdown; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMarkdown85); 

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
    // $ANTLR end "entryRuleMarkdown"


    // $ANTLR start "ruleMarkdown"
    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:76:1: ruleMarkdown returns [EObject current=null] : ( (lv_content_0_0= ruleContent ) )* ;
    public final EObject ruleMarkdown() throws RecognitionException {
        EObject current = null;

        EObject lv_content_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:79:28: ( ( (lv_content_0_0= ruleContent ) )* )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:80:1: ( (lv_content_0_0= ruleContent ) )*
            {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:80:1: ( (lv_content_0_0= ruleContent ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_TEXT||(LA1_0>=13 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:81:1: (lv_content_0_0= ruleContent )
            	    {
            	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:81:1: (lv_content_0_0= ruleContent )
            	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:82:3: lv_content_0_0= ruleContent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMarkdownAccess().getContentContentParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleContent_in_ruleMarkdown130);
            	    lv_content_0_0=ruleContent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMarkdownRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"content",
            	            		lv_content_0_0, 
            	            		"Content");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
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
    // $ANTLR end "ruleMarkdown"


    // $ANTLR start "entryRuleContent"
    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:106:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:107:2: (iv_ruleContent= ruleContent EOF )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:108:2: iv_ruleContent= ruleContent EOF
            {
             newCompositeNode(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_ruleContent_in_entryRuleContent166);
            iv_ruleContent=ruleContent();

            state._fsp--;

             current =iv_ruleContent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContent176); 

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
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:115:1: ruleContent returns [EObject current=null] : ( ( ( (lv_entity_0_1= ruleHeader1 | lv_entity_0_2= ruleHeader2 | lv_entity_0_3= ruleTextBlock ) ) ) this_NEWLINE_1= RULE_NEWLINE ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        Token this_NEWLINE_1=null;
        EObject lv_entity_0_1 = null;

        EObject lv_entity_0_2 = null;

        EObject lv_entity_0_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:118:28: ( ( ( ( (lv_entity_0_1= ruleHeader1 | lv_entity_0_2= ruleHeader2 | lv_entity_0_3= ruleTextBlock ) ) ) this_NEWLINE_1= RULE_NEWLINE ) )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:119:1: ( ( ( (lv_entity_0_1= ruleHeader1 | lv_entity_0_2= ruleHeader2 | lv_entity_0_3= ruleTextBlock ) ) ) this_NEWLINE_1= RULE_NEWLINE )
            {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:119:1: ( ( ( (lv_entity_0_1= ruleHeader1 | lv_entity_0_2= ruleHeader2 | lv_entity_0_3= ruleTextBlock ) ) ) this_NEWLINE_1= RULE_NEWLINE )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:119:2: ( ( (lv_entity_0_1= ruleHeader1 | lv_entity_0_2= ruleHeader2 | lv_entity_0_3= ruleTextBlock ) ) ) this_NEWLINE_1= RULE_NEWLINE
            {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:119:2: ( ( (lv_entity_0_1= ruleHeader1 | lv_entity_0_2= ruleHeader2 | lv_entity_0_3= ruleTextBlock ) ) )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:120:1: ( (lv_entity_0_1= ruleHeader1 | lv_entity_0_2= ruleHeader2 | lv_entity_0_3= ruleTextBlock ) )
            {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:120:1: ( (lv_entity_0_1= ruleHeader1 | lv_entity_0_2= ruleHeader2 | lv_entity_0_3= ruleTextBlock ) )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:121:1: (lv_entity_0_1= ruleHeader1 | lv_entity_0_2= ruleHeader2 | lv_entity_0_3= ruleTextBlock )
            {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:121:1: (lv_entity_0_1= ruleHeader1 | lv_entity_0_2= ruleHeader2 | lv_entity_0_3= ruleTextBlock )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case RULE_TEXT:
            case 15:
            case 16:
            case 17:
            case 18:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:122:3: lv_entity_0_1= ruleHeader1
                    {
                     
                    	        newCompositeNode(grammarAccess.getContentAccess().getEntityHeader1ParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleHeader1_in_ruleContent224);
                    lv_entity_0_1=ruleHeader1();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContentRule());
                    	        }
                           		set(
                           			current, 
                           			"entity",
                            		lv_entity_0_1, 
                            		"Header1");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:137:8: lv_entity_0_2= ruleHeader2
                    {
                     
                    	        newCompositeNode(grammarAccess.getContentAccess().getEntityHeader2ParserRuleCall_0_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleHeader2_in_ruleContent243);
                    lv_entity_0_2=ruleHeader2();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContentRule());
                    	        }
                           		set(
                           			current, 
                           			"entity",
                            		lv_entity_0_2, 
                            		"Header2");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:152:8: lv_entity_0_3= ruleTextBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getContentAccess().getEntityTextBlockParserRuleCall_0_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleTextBlock_in_ruleContent262);
                    lv_entity_0_3=ruleTextBlock();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContentRule());
                    	        }
                           		set(
                           			current, 
                           			"entity",
                            		lv_entity_0_3, 
                            		"TextBlock");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            this_NEWLINE_1=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_ruleContent276); 
             
                newLeafNode(this_NEWLINE_1, grammarAccess.getContentAccess().getNEWLINETerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleTextBlock"
    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:182:1: entryRuleTextBlock returns [EObject current=null] : iv_ruleTextBlock= ruleTextBlock EOF ;
    public final EObject entryRuleTextBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextBlock = null;


        try {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:183:2: (iv_ruleTextBlock= ruleTextBlock EOF )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:184:2: iv_ruleTextBlock= ruleTextBlock EOF
            {
             newCompositeNode(grammarAccess.getTextBlockRule()); 
            pushFollow(FOLLOW_ruleTextBlock_in_entryRuleTextBlock311);
            iv_ruleTextBlock=ruleTextBlock();

            state._fsp--;

             current =iv_ruleTextBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextBlock321); 

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
    // $ANTLR end "entryRuleTextBlock"


    // $ANTLR start "ruleTextBlock"
    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:191:1: ruleTextBlock returns [EObject current=null] : ( ( (lv_text_0_1= rulePlainText | lv_text_0_2= ruleItalic | lv_text_0_3= ruleBold ) ) )+ ;
    public final EObject ruleTextBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_text_0_1 = null;

        EObject lv_text_0_2 = null;

        EObject lv_text_0_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:194:28: ( ( ( (lv_text_0_1= rulePlainText | lv_text_0_2= ruleItalic | lv_text_0_3= ruleBold ) ) )+ )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:195:1: ( ( (lv_text_0_1= rulePlainText | lv_text_0_2= ruleItalic | lv_text_0_3= ruleBold ) ) )+
            {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:195:1: ( ( (lv_text_0_1= rulePlainText | lv_text_0_2= ruleItalic | lv_text_0_3= ruleBold ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_TEXT||(LA4_0>=15 && LA4_0<=18)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:196:1: ( (lv_text_0_1= rulePlainText | lv_text_0_2= ruleItalic | lv_text_0_3= ruleBold ) )
            	    {
            	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:196:1: ( (lv_text_0_1= rulePlainText | lv_text_0_2= ruleItalic | lv_text_0_3= ruleBold ) )
            	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:197:1: (lv_text_0_1= rulePlainText | lv_text_0_2= ruleItalic | lv_text_0_3= ruleBold )
            	    {
            	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:197:1: (lv_text_0_1= rulePlainText | lv_text_0_2= ruleItalic | lv_text_0_3= ruleBold )
            	    int alt3=3;
            	    switch ( input.LA(1) ) {
            	    case RULE_TEXT:
            	        {
            	        alt3=1;
            	        }
            	        break;
            	    case 15:
            	    case 16:
            	        {
            	        alt3=2;
            	        }
            	        break;
            	    case 17:
            	    case 18:
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
            	            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:198:3: lv_text_0_1= rulePlainText
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getTextBlockAccess().getTextPlainTextParserRuleCall_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_rulePlainText_in_ruleTextBlock368);
            	            lv_text_0_1=rulePlainText();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getTextBlockRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"text",
            	                    		lv_text_0_1, 
            	                    		"PlainText");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:213:8: lv_text_0_2= ruleItalic
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getTextBlockAccess().getTextItalicParserRuleCall_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleItalic_in_ruleTextBlock387);
            	            lv_text_0_2=ruleItalic();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getTextBlockRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"text",
            	                    		lv_text_0_2, 
            	                    		"Italic");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:228:8: lv_text_0_3= ruleBold
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getTextBlockAccess().getTextBoldParserRuleCall_0_2()); 
            	            	    
            	            pushFollow(FOLLOW_ruleBold_in_ruleTextBlock406);
            	            lv_text_0_3=ruleBold();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getTextBlockRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"text",
            	                    		lv_text_0_3, 
            	                    		"Bold");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
    // $ANTLR end "ruleTextBlock"


    // $ANTLR start "entryRuleHeader1"
    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:254:1: entryRuleHeader1 returns [EObject current=null] : iv_ruleHeader1= ruleHeader1 EOF ;
    public final EObject entryRuleHeader1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader1 = null;


        try {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:255:2: (iv_ruleHeader1= ruleHeader1 EOF )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:256:2: iv_ruleHeader1= ruleHeader1 EOF
            {
             newCompositeNode(grammarAccess.getHeader1Rule()); 
            pushFollow(FOLLOW_ruleHeader1_in_entryRuleHeader1445);
            iv_ruleHeader1=ruleHeader1();

            state._fsp--;

             current =iv_ruleHeader1; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeader1455); 

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
    // $ANTLR end "entryRuleHeader1"


    // $ANTLR start "ruleHeader1"
    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:263:1: ruleHeader1 returns [EObject current=null] : (otherlv_0= '# ' ( (lv_value_1_0= RULE_TEXT ) ) ) ;
    public final EObject ruleHeader1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:266:28: ( (otherlv_0= '# ' ( (lv_value_1_0= RULE_TEXT ) ) ) )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:267:1: (otherlv_0= '# ' ( (lv_value_1_0= RULE_TEXT ) ) )
            {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:267:1: (otherlv_0= '# ' ( (lv_value_1_0= RULE_TEXT ) ) )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:267:3: otherlv_0= '# ' ( (lv_value_1_0= RULE_TEXT ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleHeader1492); 

                	newLeafNode(otherlv_0, grammarAccess.getHeader1Access().getNumberSignSpaceKeyword_0());
                
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:271:1: ( (lv_value_1_0= RULE_TEXT ) )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:272:1: (lv_value_1_0= RULE_TEXT )
            {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:272:1: (lv_value_1_0= RULE_TEXT )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:273:3: lv_value_1_0= RULE_TEXT
            {
            lv_value_1_0=(Token)match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_ruleHeader1509); 

            			newLeafNode(lv_value_1_0, grammarAccess.getHeader1Access().getValueTEXTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHeader1Rule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"TEXT");
            	    

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
    // $ANTLR end "ruleHeader1"


    // $ANTLR start "entryRuleHeader2"
    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:297:1: entryRuleHeader2 returns [EObject current=null] : iv_ruleHeader2= ruleHeader2 EOF ;
    public final EObject entryRuleHeader2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader2 = null;


        try {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:298:2: (iv_ruleHeader2= ruleHeader2 EOF )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:299:2: iv_ruleHeader2= ruleHeader2 EOF
            {
             newCompositeNode(grammarAccess.getHeader2Rule()); 
            pushFollow(FOLLOW_ruleHeader2_in_entryRuleHeader2550);
            iv_ruleHeader2=ruleHeader2();

            state._fsp--;

             current =iv_ruleHeader2; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeader2560); 

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
    // $ANTLR end "entryRuleHeader2"


    // $ANTLR start "ruleHeader2"
    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:306:1: ruleHeader2 returns [EObject current=null] : (otherlv_0= '## ' ( (lv_value_1_0= RULE_TEXT ) ) ) ;
    public final EObject ruleHeader2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:309:28: ( (otherlv_0= '## ' ( (lv_value_1_0= RULE_TEXT ) ) ) )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:310:1: (otherlv_0= '## ' ( (lv_value_1_0= RULE_TEXT ) ) )
            {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:310:1: (otherlv_0= '## ' ( (lv_value_1_0= RULE_TEXT ) ) )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:310:3: otherlv_0= '## ' ( (lv_value_1_0= RULE_TEXT ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleHeader2597); 

                	newLeafNode(otherlv_0, grammarAccess.getHeader2Access().getNumberSignNumberSignSpaceKeyword_0());
                
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:314:1: ( (lv_value_1_0= RULE_TEXT ) )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:315:1: (lv_value_1_0= RULE_TEXT )
            {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:315:1: (lv_value_1_0= RULE_TEXT )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:316:3: lv_value_1_0= RULE_TEXT
            {
            lv_value_1_0=(Token)match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_ruleHeader2614); 

            			newLeafNode(lv_value_1_0, grammarAccess.getHeader2Access().getValueTEXTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHeader2Rule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"TEXT");
            	    

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
    // $ANTLR end "ruleHeader2"


    // $ANTLR start "entryRulePlainText"
    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:340:1: entryRulePlainText returns [EObject current=null] : iv_rulePlainText= rulePlainText EOF ;
    public final EObject entryRulePlainText() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlainText = null;


        try {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:341:2: (iv_rulePlainText= rulePlainText EOF )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:342:2: iv_rulePlainText= rulePlainText EOF
            {
             newCompositeNode(grammarAccess.getPlainTextRule()); 
            pushFollow(FOLLOW_rulePlainText_in_entryRulePlainText655);
            iv_rulePlainText=rulePlainText();

            state._fsp--;

             current =iv_rulePlainText; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlainText665); 

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
    // $ANTLR end "entryRulePlainText"


    // $ANTLR start "rulePlainText"
    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:349:1: rulePlainText returns [EObject current=null] : ( (lv_value_0_0= RULE_TEXT ) ) ;
    public final EObject rulePlainText() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:352:28: ( ( (lv_value_0_0= RULE_TEXT ) ) )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:353:1: ( (lv_value_0_0= RULE_TEXT ) )
            {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:353:1: ( (lv_value_0_0= RULE_TEXT ) )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:354:1: (lv_value_0_0= RULE_TEXT )
            {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:354:1: (lv_value_0_0= RULE_TEXT )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:355:3: lv_value_0_0= RULE_TEXT
            {
            lv_value_0_0=(Token)match(input,RULE_TEXT,FOLLOW_RULE_TEXT_in_rulePlainText706); 

            			newLeafNode(lv_value_0_0, grammarAccess.getPlainTextAccess().getValueTEXTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPlainTextRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"TEXT");
            	    

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
    // $ANTLR end "rulePlainText"


    // $ANTLR start "entryRuleItalic"
    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:379:1: entryRuleItalic returns [EObject current=null] : iv_ruleItalic= ruleItalic EOF ;
    public final EObject entryRuleItalic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItalic = null;


        try {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:380:2: (iv_ruleItalic= ruleItalic EOF )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:381:2: iv_ruleItalic= ruleItalic EOF
            {
             newCompositeNode(grammarAccess.getItalicRule()); 
            pushFollow(FOLLOW_ruleItalic_in_entryRuleItalic746);
            iv_ruleItalic=ruleItalic();

            state._fsp--;

             current =iv_ruleItalic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItalic756); 

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
    // $ANTLR end "entryRuleItalic"


    // $ANTLR start "ruleItalic"
    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:388:1: ruleItalic returns [EObject current=null] : ( (otherlv_0= '*' ( ( (lv_value_1_1= rulePlainText | lv_value_1_2= ruleBold ) ) )+ otherlv_2= '*' ) | (otherlv_3= '_' ( ( (lv_value_4_1= rulePlainText | lv_value_4_2= ruleBold ) ) )+ otherlv_5= '_' ) ) ;
    public final EObject ruleItalic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_1_1 = null;

        EObject lv_value_1_2 = null;

        EObject lv_value_4_1 = null;

        EObject lv_value_4_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:391:28: ( ( (otherlv_0= '*' ( ( (lv_value_1_1= rulePlainText | lv_value_1_2= ruleBold ) ) )+ otherlv_2= '*' ) | (otherlv_3= '_' ( ( (lv_value_4_1= rulePlainText | lv_value_4_2= ruleBold ) ) )+ otherlv_5= '_' ) ) )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:392:1: ( (otherlv_0= '*' ( ( (lv_value_1_1= rulePlainText | lv_value_1_2= ruleBold ) ) )+ otherlv_2= '*' ) | (otherlv_3= '_' ( ( (lv_value_4_1= rulePlainText | lv_value_4_2= ruleBold ) ) )+ otherlv_5= '_' ) )
            {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:392:1: ( (otherlv_0= '*' ( ( (lv_value_1_1= rulePlainText | lv_value_1_2= ruleBold ) ) )+ otherlv_2= '*' ) | (otherlv_3= '_' ( ( (lv_value_4_1= rulePlainText | lv_value_4_2= ruleBold ) ) )+ otherlv_5= '_' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            else if ( (LA9_0==16) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:392:2: (otherlv_0= '*' ( ( (lv_value_1_1= rulePlainText | lv_value_1_2= ruleBold ) ) )+ otherlv_2= '*' )
                    {
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:392:2: (otherlv_0= '*' ( ( (lv_value_1_1= rulePlainText | lv_value_1_2= ruleBold ) ) )+ otherlv_2= '*' )
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:392:4: otherlv_0= '*' ( ( (lv_value_1_1= rulePlainText | lv_value_1_2= ruleBold ) ) )+ otherlv_2= '*'
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleItalic794); 

                        	newLeafNode(otherlv_0, grammarAccess.getItalicAccess().getAsteriskKeyword_0_0());
                        
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:396:1: ( ( (lv_value_1_1= rulePlainText | lv_value_1_2= ruleBold ) ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_TEXT||(LA6_0>=17 && LA6_0<=18)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:397:1: ( (lv_value_1_1= rulePlainText | lv_value_1_2= ruleBold ) )
                    	    {
                    	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:397:1: ( (lv_value_1_1= rulePlainText | lv_value_1_2= ruleBold ) )
                    	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:398:1: (lv_value_1_1= rulePlainText | lv_value_1_2= ruleBold )
                    	    {
                    	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:398:1: (lv_value_1_1= rulePlainText | lv_value_1_2= ruleBold )
                    	    int alt5=2;
                    	    int LA5_0 = input.LA(1);

                    	    if ( (LA5_0==RULE_TEXT) ) {
                    	        alt5=1;
                    	    }
                    	    else if ( ((LA5_0>=17 && LA5_0<=18)) ) {
                    	        alt5=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 5, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt5) {
                    	        case 1 :
                    	            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:399:3: lv_value_1_1= rulePlainText
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getItalicAccess().getValuePlainTextParserRuleCall_0_1_0_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_rulePlainText_in_ruleItalic817);
                    	            lv_value_1_1=rulePlainText();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getItalicRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"value",
                    	                    		lv_value_1_1, 
                    	                    		"PlainText");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:414:8: lv_value_1_2= ruleBold
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getItalicAccess().getValueBoldParserRuleCall_0_1_0_1()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleBold_in_ruleItalic836);
                    	            lv_value_1_2=ruleBold();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getItalicRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"value",
                    	                    		lv_value_1_2, 
                    	                    		"Bold");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }
                    	            break;

                    	    }


                    	    }


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

                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleItalic852); 

                        	newLeafNode(otherlv_2, grammarAccess.getItalicAccess().getAsteriskKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:437:6: (otherlv_3= '_' ( ( (lv_value_4_1= rulePlainText | lv_value_4_2= ruleBold ) ) )+ otherlv_5= '_' )
                    {
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:437:6: (otherlv_3= '_' ( ( (lv_value_4_1= rulePlainText | lv_value_4_2= ruleBold ) ) )+ otherlv_5= '_' )
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:437:8: otherlv_3= '_' ( ( (lv_value_4_1= rulePlainText | lv_value_4_2= ruleBold ) ) )+ otherlv_5= '_'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleItalic872); 

                        	newLeafNode(otherlv_3, grammarAccess.getItalicAccess().get_Keyword_1_0());
                        
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:441:1: ( ( (lv_value_4_1= rulePlainText | lv_value_4_2= ruleBold ) ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_TEXT||(LA8_0>=17 && LA8_0<=18)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:442:1: ( (lv_value_4_1= rulePlainText | lv_value_4_2= ruleBold ) )
                    	    {
                    	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:442:1: ( (lv_value_4_1= rulePlainText | lv_value_4_2= ruleBold ) )
                    	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:443:1: (lv_value_4_1= rulePlainText | lv_value_4_2= ruleBold )
                    	    {
                    	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:443:1: (lv_value_4_1= rulePlainText | lv_value_4_2= ruleBold )
                    	    int alt7=2;
                    	    int LA7_0 = input.LA(1);

                    	    if ( (LA7_0==RULE_TEXT) ) {
                    	        alt7=1;
                    	    }
                    	    else if ( ((LA7_0>=17 && LA7_0<=18)) ) {
                    	        alt7=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 7, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt7) {
                    	        case 1 :
                    	            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:444:3: lv_value_4_1= rulePlainText
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getItalicAccess().getValuePlainTextParserRuleCall_1_1_0_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_rulePlainText_in_ruleItalic895);
                    	            lv_value_4_1=rulePlainText();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getItalicRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"value",
                    	                    		lv_value_4_1, 
                    	                    		"PlainText");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:459:8: lv_value_4_2= ruleBold
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getItalicAccess().getValueBoldParserRuleCall_1_1_0_1()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleBold_in_ruleItalic914);
                    	            lv_value_4_2=ruleBold();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getItalicRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"value",
                    	                    		lv_value_4_2, 
                    	                    		"Bold");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleItalic930); 

                        	newLeafNode(otherlv_5, grammarAccess.getItalicAccess().get_Keyword_1_2());
                        

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
    // $ANTLR end "ruleItalic"


    // $ANTLR start "entryRuleBold"
    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:489:1: entryRuleBold returns [EObject current=null] : iv_ruleBold= ruleBold EOF ;
    public final EObject entryRuleBold() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBold = null;


        try {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:490:2: (iv_ruleBold= ruleBold EOF )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:491:2: iv_ruleBold= ruleBold EOF
            {
             newCompositeNode(grammarAccess.getBoldRule()); 
            pushFollow(FOLLOW_ruleBold_in_entryRuleBold967);
            iv_ruleBold=ruleBold();

            state._fsp--;

             current =iv_ruleBold; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBold977); 

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
    // $ANTLR end "entryRuleBold"


    // $ANTLR start "ruleBold"
    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:498:1: ruleBold returns [EObject current=null] : ( (otherlv_0= '**' ( ( (lv_value_1_1= rulePlainText | lv_value_1_2= ruleItalic ) ) )+ otherlv_2= '**' ) | (otherlv_3= '__' ( ( (lv_value_4_1= rulePlainText | lv_value_4_2= ruleItalic ) ) )+ otherlv_5= '__' ) ) ;
    public final EObject ruleBold() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_1_1 = null;

        EObject lv_value_1_2 = null;

        EObject lv_value_4_1 = null;

        EObject lv_value_4_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:501:28: ( ( (otherlv_0= '**' ( ( (lv_value_1_1= rulePlainText | lv_value_1_2= ruleItalic ) ) )+ otherlv_2= '**' ) | (otherlv_3= '__' ( ( (lv_value_4_1= rulePlainText | lv_value_4_2= ruleItalic ) ) )+ otherlv_5= '__' ) ) )
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:502:1: ( (otherlv_0= '**' ( ( (lv_value_1_1= rulePlainText | lv_value_1_2= ruleItalic ) ) )+ otherlv_2= '**' ) | (otherlv_3= '__' ( ( (lv_value_4_1= rulePlainText | lv_value_4_2= ruleItalic ) ) )+ otherlv_5= '__' ) )
            {
            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:502:1: ( (otherlv_0= '**' ( ( (lv_value_1_1= rulePlainText | lv_value_1_2= ruleItalic ) ) )+ otherlv_2= '**' ) | (otherlv_3= '__' ( ( (lv_value_4_1= rulePlainText | lv_value_4_2= ruleItalic ) ) )+ otherlv_5= '__' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            else if ( (LA14_0==18) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:502:2: (otherlv_0= '**' ( ( (lv_value_1_1= rulePlainText | lv_value_1_2= ruleItalic ) ) )+ otherlv_2= '**' )
                    {
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:502:2: (otherlv_0= '**' ( ( (lv_value_1_1= rulePlainText | lv_value_1_2= ruleItalic ) ) )+ otherlv_2= '**' )
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:502:4: otherlv_0= '**' ( ( (lv_value_1_1= rulePlainText | lv_value_1_2= ruleItalic ) ) )+ otherlv_2= '**'
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleBold1015); 

                        	newLeafNode(otherlv_0, grammarAccess.getBoldAccess().getAsteriskAsteriskKeyword_0_0());
                        
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:506:1: ( ( (lv_value_1_1= rulePlainText | lv_value_1_2= ruleItalic ) ) )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_TEXT||(LA11_0>=15 && LA11_0<=16)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:507:1: ( (lv_value_1_1= rulePlainText | lv_value_1_2= ruleItalic ) )
                    	    {
                    	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:507:1: ( (lv_value_1_1= rulePlainText | lv_value_1_2= ruleItalic ) )
                    	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:508:1: (lv_value_1_1= rulePlainText | lv_value_1_2= ruleItalic )
                    	    {
                    	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:508:1: (lv_value_1_1= rulePlainText | lv_value_1_2= ruleItalic )
                    	    int alt10=2;
                    	    int LA10_0 = input.LA(1);

                    	    if ( (LA10_0==RULE_TEXT) ) {
                    	        alt10=1;
                    	    }
                    	    else if ( ((LA10_0>=15 && LA10_0<=16)) ) {
                    	        alt10=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 10, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt10) {
                    	        case 1 :
                    	            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:509:3: lv_value_1_1= rulePlainText
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getBoldAccess().getValuePlainTextParserRuleCall_0_1_0_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_rulePlainText_in_ruleBold1038);
                    	            lv_value_1_1=rulePlainText();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getBoldRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"value",
                    	                    		lv_value_1_1, 
                    	                    		"PlainText");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:524:8: lv_value_1_2= ruleItalic
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getBoldAccess().getValueItalicParserRuleCall_0_1_0_1()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleItalic_in_ruleBold1057);
                    	            lv_value_1_2=ruleItalic();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getBoldRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"value",
                    	                    		lv_value_1_2, 
                    	                    		"Italic");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);

                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleBold1073); 

                        	newLeafNode(otherlv_2, grammarAccess.getBoldAccess().getAsteriskAsteriskKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:547:6: (otherlv_3= '__' ( ( (lv_value_4_1= rulePlainText | lv_value_4_2= ruleItalic ) ) )+ otherlv_5= '__' )
                    {
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:547:6: (otherlv_3= '__' ( ( (lv_value_4_1= rulePlainText | lv_value_4_2= ruleItalic ) ) )+ otherlv_5= '__' )
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:547:8: otherlv_3= '__' ( ( (lv_value_4_1= rulePlainText | lv_value_4_2= ruleItalic ) ) )+ otherlv_5= '__'
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleBold1093); 

                        	newLeafNode(otherlv_3, grammarAccess.getBoldAccess().get__Keyword_1_0());
                        
                    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:551:1: ( ( (lv_value_4_1= rulePlainText | lv_value_4_2= ruleItalic ) ) )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_TEXT||(LA13_0>=15 && LA13_0<=16)) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:552:1: ( (lv_value_4_1= rulePlainText | lv_value_4_2= ruleItalic ) )
                    	    {
                    	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:552:1: ( (lv_value_4_1= rulePlainText | lv_value_4_2= ruleItalic ) )
                    	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:553:1: (lv_value_4_1= rulePlainText | lv_value_4_2= ruleItalic )
                    	    {
                    	    // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:553:1: (lv_value_4_1= rulePlainText | lv_value_4_2= ruleItalic )
                    	    int alt12=2;
                    	    int LA12_0 = input.LA(1);

                    	    if ( (LA12_0==RULE_TEXT) ) {
                    	        alt12=1;
                    	    }
                    	    else if ( ((LA12_0>=15 && LA12_0<=16)) ) {
                    	        alt12=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 12, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt12) {
                    	        case 1 :
                    	            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:554:3: lv_value_4_1= rulePlainText
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getBoldAccess().getValuePlainTextParserRuleCall_1_1_0_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_rulePlainText_in_ruleBold1116);
                    	            lv_value_4_1=rulePlainText();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getBoldRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"value",
                    	                    		lv_value_4_1, 
                    	                    		"PlainText");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.xtext.example.markdown/src-gen/org/xtext/example/markdown/parser/antlr/internal/InternalMarkdown.g:569:8: lv_value_4_2= ruleItalic
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getBoldAccess().getValueItalicParserRuleCall_1_1_0_1()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleItalic_in_ruleBold1135);
                    	            lv_value_4_2=ruleItalic();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getBoldRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"value",
                    	                    		lv_value_4_2, 
                    	                    		"Italic");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);

                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleBold1151); 

                        	newLeafNode(otherlv_5, grammarAccess.getBoldAccess().get__Keyword_1_2());
                        

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
    // $ANTLR end "ruleBold"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleMarkdown_in_entryRuleMarkdown75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMarkdown85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContent_in_ruleMarkdown130 = new BitSet(new long[]{0x000000000007E022L});
    public static final BitSet FOLLOW_ruleContent_in_entryRuleContent166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContent176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader1_in_ruleContent224 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleHeader2_in_ruleContent243 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTextBlock_in_ruleContent262 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_ruleContent276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextBlock_in_entryRuleTextBlock311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextBlock321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlainText_in_ruleTextBlock368 = new BitSet(new long[]{0x000000000007E022L});
    public static final BitSet FOLLOW_ruleItalic_in_ruleTextBlock387 = new BitSet(new long[]{0x000000000007E022L});
    public static final BitSet FOLLOW_ruleBold_in_ruleTextBlock406 = new BitSet(new long[]{0x000000000007E022L});
    public static final BitSet FOLLOW_ruleHeader1_in_entryRuleHeader1445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeader1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleHeader1492 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_TEXT_in_ruleHeader1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader2_in_entryRuleHeader2550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeader2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleHeader2597 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_TEXT_in_ruleHeader2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlainText_in_entryRulePlainText655 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlainText665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TEXT_in_rulePlainText706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItalic_in_entryRuleItalic746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItalic756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleItalic794 = new BitSet(new long[]{0x000000000007E020L});
    public static final BitSet FOLLOW_rulePlainText_in_ruleItalic817 = new BitSet(new long[]{0x000000000007E020L});
    public static final BitSet FOLLOW_ruleBold_in_ruleItalic836 = new BitSet(new long[]{0x000000000007E020L});
    public static final BitSet FOLLOW_15_in_ruleItalic852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleItalic872 = new BitSet(new long[]{0x000000000007E020L});
    public static final BitSet FOLLOW_rulePlainText_in_ruleItalic895 = new BitSet(new long[]{0x000000000007E020L});
    public static final BitSet FOLLOW_ruleBold_in_ruleItalic914 = new BitSet(new long[]{0x000000000007E020L});
    public static final BitSet FOLLOW_16_in_ruleItalic930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBold_in_entryRuleBold967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBold977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleBold1015 = new BitSet(new long[]{0x0000000000018020L});
    public static final BitSet FOLLOW_rulePlainText_in_ruleBold1038 = new BitSet(new long[]{0x0000000000038020L});
    public static final BitSet FOLLOW_ruleItalic_in_ruleBold1057 = new BitSet(new long[]{0x0000000000038020L});
    public static final BitSet FOLLOW_17_in_ruleBold1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleBold1093 = new BitSet(new long[]{0x0000000000018020L});
    public static final BitSet FOLLOW_rulePlainText_in_ruleBold1116 = new BitSet(new long[]{0x0000000000058020L});
    public static final BitSet FOLLOW_ruleItalic_in_ruleBold1135 = new BitSet(new long[]{0x0000000000058020L});
    public static final BitSet FOLLOW_18_in_ruleBold1151 = new BitSet(new long[]{0x0000000000000002L});

}