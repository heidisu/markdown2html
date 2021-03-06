/*
 * generated by Xtext
 */
grammar InternalMarkdown;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.xtext.example.markdown.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleMarkdown
entryRuleMarkdown returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMarkdownRule()); }
	 iv_ruleMarkdown=ruleMarkdown 
	 { $current=$iv_ruleMarkdown.current; } 
	 EOF 
;

// Rule Markdown
ruleMarkdown returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getMarkdownAccess().getContentContentParserRuleCall_0()); 
	    }
		lv_content_0_0=ruleContent		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMarkdownRule());
	        }
       		add(
       			$current, 
       			"content",
        		lv_content_0_0, 
        		"Content");
	        afterParserOrEnumRuleCall();
	    }

)
)*
;





// Entry rule entryRuleContent
entryRuleContent returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getContentRule()); }
	 iv_ruleContent=ruleContent 
	 { $current=$iv_ruleContent.current; } 
	 EOF 
;

// Rule Content
ruleContent returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
(
		{ 
	        newCompositeNode(grammarAccess.getContentAccess().getEntityHeader1ParserRuleCall_0_0_0()); 
	    }
		lv_entity_0_1=ruleHeader1		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getContentRule());
	        }
       		set(
       			$current, 
       			"entity",
        		lv_entity_0_1, 
        		"Header1");
	        afterParserOrEnumRuleCall();
	    }

    |		{ 
	        newCompositeNode(grammarAccess.getContentAccess().getEntityHeader2ParserRuleCall_0_0_1()); 
	    }
		lv_entity_0_2=ruleHeader2		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getContentRule());
	        }
       		set(
       			$current, 
       			"entity",
        		lv_entity_0_2, 
        		"Header2");
	        afterParserOrEnumRuleCall();
	    }

    |		{ 
	        newCompositeNode(grammarAccess.getContentAccess().getEntityTextBlockParserRuleCall_0_0_2()); 
	    }
		lv_entity_0_3=ruleTextBlock		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getContentRule());
	        }
       		set(
       			$current, 
       			"entity",
        		lv_entity_0_3, 
        		"TextBlock");
	        afterParserOrEnumRuleCall();
	    }

)

)
)this_NEWLINE_1=RULE_NEWLINE
    { 
    newLeafNode(this_NEWLINE_1, grammarAccess.getContentAccess().getNEWLINETerminalRuleCall_1()); 
    }
)
;





// Entry rule entryRuleTextBlock
entryRuleTextBlock returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTextBlockRule()); }
	 iv_ruleTextBlock=ruleTextBlock 
	 { $current=$iv_ruleTextBlock.current; } 
	 EOF 
;

// Rule TextBlock
ruleTextBlock returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
(
		{ 
	        newCompositeNode(grammarAccess.getTextBlockAccess().getTextPlainTextParserRuleCall_0_0()); 
	    }
		lv_text_0_1=rulePlainText		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTextBlockRule());
	        }
       		add(
       			$current, 
       			"text",
        		lv_text_0_1, 
        		"PlainText");
	        afterParserOrEnumRuleCall();
	    }

    |		{ 
	        newCompositeNode(grammarAccess.getTextBlockAccess().getTextItalicParserRuleCall_0_1()); 
	    }
		lv_text_0_2=ruleItalic		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTextBlockRule());
	        }
       		add(
       			$current, 
       			"text",
        		lv_text_0_2, 
        		"Italic");
	        afterParserOrEnumRuleCall();
	    }

    |		{ 
	        newCompositeNode(grammarAccess.getTextBlockAccess().getTextBoldParserRuleCall_0_2()); 
	    }
		lv_text_0_3=ruleBold		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTextBlockRule());
	        }
       		add(
       			$current, 
       			"text",
        		lv_text_0_3, 
        		"Bold");
	        afterParserOrEnumRuleCall();
	    }

)

)
)+
;





// Entry rule entryRuleHeader1
entryRuleHeader1 returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getHeader1Rule()); }
	 iv_ruleHeader1=ruleHeader1 
	 { $current=$iv_ruleHeader1.current; } 
	 EOF 
;

// Rule Header1
ruleHeader1 returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='# ' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getHeader1Access().getNumberSignSpaceKeyword_0());
    }
(
(
		lv_value_1_0=RULE_TEXT
		{
			newLeafNode(lv_value_1_0, grammarAccess.getHeader1Access().getValueTEXTTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getHeader1Rule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"TEXT");
	    }

)
))
;





// Entry rule entryRuleHeader2
entryRuleHeader2 returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getHeader2Rule()); }
	 iv_ruleHeader2=ruleHeader2 
	 { $current=$iv_ruleHeader2.current; } 
	 EOF 
;

// Rule Header2
ruleHeader2 returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='## ' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getHeader2Access().getNumberSignNumberSignSpaceKeyword_0());
    }
(
(
		lv_value_1_0=RULE_TEXT
		{
			newLeafNode(lv_value_1_0, grammarAccess.getHeader2Access().getValueTEXTTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getHeader2Rule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"TEXT");
	    }

)
))
;





// Entry rule entryRulePlainText
entryRulePlainText returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPlainTextRule()); }
	 iv_rulePlainText=rulePlainText 
	 { $current=$iv_rulePlainText.current; } 
	 EOF 
;

// Rule PlainText
rulePlainText returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_value_0_0=RULE_TEXT
		{
			newLeafNode(lv_value_0_0, grammarAccess.getPlainTextAccess().getValueTEXTTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPlainTextRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"TEXT");
	    }

)
)
;





// Entry rule entryRuleItalic
entryRuleItalic returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getItalicRule()); }
	 iv_ruleItalic=ruleItalic 
	 { $current=$iv_ruleItalic.current; } 
	 EOF 
;

// Rule Italic
ruleItalic returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='*' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getItalicAccess().getAsteriskKeyword_0_0());
    }
(
(
(
		{ 
	        newCompositeNode(grammarAccess.getItalicAccess().getValuePlainTextParserRuleCall_0_1_0_0()); 
	    }
		lv_value_1_1=rulePlainText		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getItalicRule());
	        }
       		add(
       			$current, 
       			"value",
        		lv_value_1_1, 
        		"PlainText");
	        afterParserOrEnumRuleCall();
	    }

    |		{ 
	        newCompositeNode(grammarAccess.getItalicAccess().getValueBoldParserRuleCall_0_1_0_1()); 
	    }
		lv_value_1_2=ruleBold		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getItalicRule());
	        }
       		add(
       			$current, 
       			"value",
        		lv_value_1_2, 
        		"Bold");
	        afterParserOrEnumRuleCall();
	    }

)

)
)+	otherlv_2='*' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getItalicAccess().getAsteriskKeyword_0_2());
    }
)
    |(	otherlv_3='_' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getItalicAccess().get_Keyword_1_0());
    }
(
(
(
		{ 
	        newCompositeNode(grammarAccess.getItalicAccess().getValuePlainTextParserRuleCall_1_1_0_0()); 
	    }
		lv_value_4_1=rulePlainText		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getItalicRule());
	        }
       		add(
       			$current, 
       			"value",
        		lv_value_4_1, 
        		"PlainText");
	        afterParserOrEnumRuleCall();
	    }

    |		{ 
	        newCompositeNode(grammarAccess.getItalicAccess().getValueBoldParserRuleCall_1_1_0_1()); 
	    }
		lv_value_4_2=ruleBold		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getItalicRule());
	        }
       		add(
       			$current, 
       			"value",
        		lv_value_4_2, 
        		"Bold");
	        afterParserOrEnumRuleCall();
	    }

)

)
)+	otherlv_5='_' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getItalicAccess().get_Keyword_1_2());
    }
))
;





// Entry rule entryRuleBold
entryRuleBold returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBoldRule()); }
	 iv_ruleBold=ruleBold 
	 { $current=$iv_ruleBold.current; } 
	 EOF 
;

// Rule Bold
ruleBold returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='**' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getBoldAccess().getAsteriskAsteriskKeyword_0_0());
    }
(
(
(
		{ 
	        newCompositeNode(grammarAccess.getBoldAccess().getValuePlainTextParserRuleCall_0_1_0_0()); 
	    }
		lv_value_1_1=rulePlainText		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBoldRule());
	        }
       		add(
       			$current, 
       			"value",
        		lv_value_1_1, 
        		"PlainText");
	        afterParserOrEnumRuleCall();
	    }

    |		{ 
	        newCompositeNode(grammarAccess.getBoldAccess().getValueItalicParserRuleCall_0_1_0_1()); 
	    }
		lv_value_1_2=ruleItalic		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBoldRule());
	        }
       		add(
       			$current, 
       			"value",
        		lv_value_1_2, 
        		"Italic");
	        afterParserOrEnumRuleCall();
	    }

)

)
)+	otherlv_2='**' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getBoldAccess().getAsteriskAsteriskKeyword_0_2());
    }
)
    |(	otherlv_3='__' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getBoldAccess().get__Keyword_1_0());
    }
(
(
(
		{ 
	        newCompositeNode(grammarAccess.getBoldAccess().getValuePlainTextParserRuleCall_1_1_0_0()); 
	    }
		lv_value_4_1=rulePlainText		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBoldRule());
	        }
       		add(
       			$current, 
       			"value",
        		lv_value_4_1, 
        		"PlainText");
	        afterParserOrEnumRuleCall();
	    }

    |		{ 
	        newCompositeNode(grammarAccess.getBoldAccess().getValueItalicParserRuleCall_1_1_0_1()); 
	    }
		lv_value_4_2=ruleItalic		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBoldRule());
	        }
       		add(
       			$current, 
       			"value",
        		lv_value_4_2, 
        		"Italic");
	        afterParserOrEnumRuleCall();
	    }

)

)
)+	otherlv_5='__' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getBoldAccess().get__Keyword_1_2());
    }
))
;





RULE_TEXT : ('a'..'\u00E5'|'A'..'\u00C5') (RULE_ID|RULE_WS)+;

RULE_WS : (' '|'\t')+;

RULE_NEWLINE : '\r'? '\n';

RULE_ID : ('a'..'\u00E5'|'A'..'\u00C5') ('a'..'\u00E5'|'A'..'\u00C5'|'0'..'9'|'!'|'?')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_ANY_OTHER : .;


