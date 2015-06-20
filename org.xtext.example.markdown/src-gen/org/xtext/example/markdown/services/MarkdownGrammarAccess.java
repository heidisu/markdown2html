/*
 * generated by Xtext
 */
package org.xtext.example.markdown.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class MarkdownGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class MarkdownElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Markdown");
		private final Assignment cContentAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cContentContentParserRuleCall_0 = (RuleCall)cContentAssignment.eContents().get(0);
		
		//Markdown:
		//	content+=Content*;
		@Override public ParserRule getRule() { return rule; }

		//content+=Content*
		public Assignment getContentAssignment() { return cContentAssignment; }

		//Content
		public RuleCall getContentContentParserRuleCall_0() { return cContentContentParserRuleCall_0; }
	}

	public class ContentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Content");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cEntityAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Alternatives cEntityAlternatives_0_0 = (Alternatives)cEntityAssignment_0.eContents().get(0);
		private final RuleCall cEntityHeader1ParserRuleCall_0_0_0 = (RuleCall)cEntityAlternatives_0_0.eContents().get(0);
		private final RuleCall cEntityHeader2ParserRuleCall_0_0_1 = (RuleCall)cEntityAlternatives_0_0.eContents().get(1);
		private final RuleCall cEntityTextBlockParserRuleCall_0_0_2 = (RuleCall)cEntityAlternatives_0_0.eContents().get(2);
		private final RuleCall cNEWLINETerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//Content:
		//	entity=(Header1 | Header2 | TextBlock) NEWLINE;
		@Override public ParserRule getRule() { return rule; }

		//entity=(Header1 | Header2 | TextBlock) NEWLINE
		public Group getGroup() { return cGroup; }

		//entity=(Header1 | Header2 | TextBlock)
		public Assignment getEntityAssignment_0() { return cEntityAssignment_0; }

		//Header1 | Header2 | TextBlock
		public Alternatives getEntityAlternatives_0_0() { return cEntityAlternatives_0_0; }

		//Header1
		public RuleCall getEntityHeader1ParserRuleCall_0_0_0() { return cEntityHeader1ParserRuleCall_0_0_0; }

		//Header2
		public RuleCall getEntityHeader2ParserRuleCall_0_0_1() { return cEntityHeader2ParserRuleCall_0_0_1; }

		//TextBlock
		public RuleCall getEntityTextBlockParserRuleCall_0_0_2() { return cEntityTextBlockParserRuleCall_0_0_2; }

		//NEWLINE
		public RuleCall getNEWLINETerminalRuleCall_1() { return cNEWLINETerminalRuleCall_1; }
	}

	public class TextBlockElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TextBlock");
		private final Assignment cTextAssignment = (Assignment)rule.eContents().get(1);
		private final Alternatives cTextAlternatives_0 = (Alternatives)cTextAssignment.eContents().get(0);
		private final RuleCall cTextPlainTextParserRuleCall_0_0 = (RuleCall)cTextAlternatives_0.eContents().get(0);
		private final RuleCall cTextItalicParserRuleCall_0_1 = (RuleCall)cTextAlternatives_0.eContents().get(1);
		private final RuleCall cTextBoldParserRuleCall_0_2 = (RuleCall)cTextAlternatives_0.eContents().get(2);
		
		//TextBlock:
		//	text+=(PlainText | Italic | Bold)+;
		@Override public ParserRule getRule() { return rule; }

		//text+=(PlainText | Italic | Bold)+
		public Assignment getTextAssignment() { return cTextAssignment; }

		//PlainText | Italic | Bold
		public Alternatives getTextAlternatives_0() { return cTextAlternatives_0; }

		//PlainText
		public RuleCall getTextPlainTextParserRuleCall_0_0() { return cTextPlainTextParserRuleCall_0_0; }

		//Italic
		public RuleCall getTextItalicParserRuleCall_0_1() { return cTextItalicParserRuleCall_0_1; }

		//Bold
		public RuleCall getTextBoldParserRuleCall_0_2() { return cTextBoldParserRuleCall_0_2; }
	}

	public class Header1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Header1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignSpaceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueTEXTTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//Header1:
		//	"# " value=TEXT;
		@Override public ParserRule getRule() { return rule; }

		//"# " value=TEXT
		public Group getGroup() { return cGroup; }

		//"# "
		public Keyword getNumberSignSpaceKeyword_0() { return cNumberSignSpaceKeyword_0; }

		//value=TEXT
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }

		//TEXT
		public RuleCall getValueTEXTTerminalRuleCall_1_0() { return cValueTEXTTerminalRuleCall_1_0; }
	}

	public class Header2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Header2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignNumberSignSpaceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueTEXTTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//Header2:
		//	"## " value=TEXT;
		@Override public ParserRule getRule() { return rule; }

		//"## " value=TEXT
		public Group getGroup() { return cGroup; }

		//"## "
		public Keyword getNumberSignNumberSignSpaceKeyword_0() { return cNumberSignNumberSignSpaceKeyword_0; }

		//value=TEXT
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }

		//TEXT
		public RuleCall getValueTEXTTerminalRuleCall_1_0() { return cValueTEXTTerminalRuleCall_1_0; }
	}

	public class PlainTextElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PlainText");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueTEXTTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//PlainText:
		//	value=TEXT;
		@Override public ParserRule getRule() { return rule; }

		//value=TEXT
		public Assignment getValueAssignment() { return cValueAssignment; }

		//TEXT
		public RuleCall getValueTEXTTerminalRuleCall_0() { return cValueTEXTTerminalRuleCall_0; }
	}

	public class ItalicElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Italic");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cAsteriskKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cValueAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final Alternatives cValueAlternatives_0_1_0 = (Alternatives)cValueAssignment_0_1.eContents().get(0);
		private final RuleCall cValuePlainTextParserRuleCall_0_1_0_0 = (RuleCall)cValueAlternatives_0_1_0.eContents().get(0);
		private final RuleCall cValueBoldParserRuleCall_0_1_0_1 = (RuleCall)cValueAlternatives_0_1_0.eContents().get(1);
		private final Keyword cAsteriskKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword c_Keyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cValueAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Alternatives cValueAlternatives_1_1_0 = (Alternatives)cValueAssignment_1_1.eContents().get(0);
		private final RuleCall cValuePlainTextParserRuleCall_1_1_0_0 = (RuleCall)cValueAlternatives_1_1_0.eContents().get(0);
		private final RuleCall cValueBoldParserRuleCall_1_1_0_1 = (RuleCall)cValueAlternatives_1_1_0.eContents().get(1);
		private final Keyword c_Keyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		
		//Italic:
		//	"*" value+=(PlainText | Bold)+ "*" | "_" value+=(PlainText | Bold)+ "_";
		@Override public ParserRule getRule() { return rule; }

		//"*" value+=(PlainText | Bold)+ "*" | "_" value+=(PlainText | Bold)+ "_"
		public Alternatives getAlternatives() { return cAlternatives; }

		//"*" value+=(PlainText | Bold)+ "*"
		public Group getGroup_0() { return cGroup_0; }

		//"*"
		public Keyword getAsteriskKeyword_0_0() { return cAsteriskKeyword_0_0; }

		//value+=(PlainText | Bold)+
		public Assignment getValueAssignment_0_1() { return cValueAssignment_0_1; }

		//PlainText | Bold
		public Alternatives getValueAlternatives_0_1_0() { return cValueAlternatives_0_1_0; }

		//PlainText
		public RuleCall getValuePlainTextParserRuleCall_0_1_0_0() { return cValuePlainTextParserRuleCall_0_1_0_0; }

		//Bold
		public RuleCall getValueBoldParserRuleCall_0_1_0_1() { return cValueBoldParserRuleCall_0_1_0_1; }

		//"*"
		public Keyword getAsteriskKeyword_0_2() { return cAsteriskKeyword_0_2; }

		//"_" value+=(PlainText | Bold)+ "_"
		public Group getGroup_1() { return cGroup_1; }

		//"_"
		public Keyword get_Keyword_1_0() { return c_Keyword_1_0; }

		//value+=(PlainText | Bold)+
		public Assignment getValueAssignment_1_1() { return cValueAssignment_1_1; }

		//PlainText | Bold
		public Alternatives getValueAlternatives_1_1_0() { return cValueAlternatives_1_1_0; }

		//PlainText
		public RuleCall getValuePlainTextParserRuleCall_1_1_0_0() { return cValuePlainTextParserRuleCall_1_1_0_0; }

		//Bold
		public RuleCall getValueBoldParserRuleCall_1_1_0_1() { return cValueBoldParserRuleCall_1_1_0_1; }

		//"_"
		public Keyword get_Keyword_1_2() { return c_Keyword_1_2; }
	}

	public class BoldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Bold");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cAsteriskAsteriskKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cValueAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final Alternatives cValueAlternatives_0_1_0 = (Alternatives)cValueAssignment_0_1.eContents().get(0);
		private final RuleCall cValuePlainTextParserRuleCall_0_1_0_0 = (RuleCall)cValueAlternatives_0_1_0.eContents().get(0);
		private final RuleCall cValueItalicParserRuleCall_0_1_0_1 = (RuleCall)cValueAlternatives_0_1_0.eContents().get(1);
		private final Keyword cAsteriskAsteriskKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword c__Keyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cValueAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Alternatives cValueAlternatives_1_1_0 = (Alternatives)cValueAssignment_1_1.eContents().get(0);
		private final RuleCall cValuePlainTextParserRuleCall_1_1_0_0 = (RuleCall)cValueAlternatives_1_1_0.eContents().get(0);
		private final RuleCall cValueItalicParserRuleCall_1_1_0_1 = (RuleCall)cValueAlternatives_1_1_0.eContents().get(1);
		private final Keyword c__Keyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		
		//Bold:
		//	"**" value+=(PlainText | Italic)+ "**" | "__" value+=(PlainText | Italic)+ "__";
		@Override public ParserRule getRule() { return rule; }

		//"**" value+=(PlainText | Italic)+ "**" | "__" value+=(PlainText | Italic)+ "__"
		public Alternatives getAlternatives() { return cAlternatives; }

		//"**" value+=(PlainText | Italic)+ "**"
		public Group getGroup_0() { return cGroup_0; }

		//"**"
		public Keyword getAsteriskAsteriskKeyword_0_0() { return cAsteriskAsteriskKeyword_0_0; }

		//value+=(PlainText | Italic)+
		public Assignment getValueAssignment_0_1() { return cValueAssignment_0_1; }

		//PlainText | Italic
		public Alternatives getValueAlternatives_0_1_0() { return cValueAlternatives_0_1_0; }

		//PlainText
		public RuleCall getValuePlainTextParserRuleCall_0_1_0_0() { return cValuePlainTextParserRuleCall_0_1_0_0; }

		//Italic
		public RuleCall getValueItalicParserRuleCall_0_1_0_1() { return cValueItalicParserRuleCall_0_1_0_1; }

		//"**"
		public Keyword getAsteriskAsteriskKeyword_0_2() { return cAsteriskAsteriskKeyword_0_2; }

		//"__" value+=(PlainText | Italic)+ "__"
		public Group getGroup_1() { return cGroup_1; }

		//"__"
		public Keyword get__Keyword_1_0() { return c__Keyword_1_0; }

		//value+=(PlainText | Italic)+
		public Assignment getValueAssignment_1_1() { return cValueAssignment_1_1; }

		//PlainText | Italic
		public Alternatives getValueAlternatives_1_1_0() { return cValueAlternatives_1_1_0; }

		//PlainText
		public RuleCall getValuePlainTextParserRuleCall_1_1_0_0() { return cValuePlainTextParserRuleCall_1_1_0_0; }

		//Italic
		public RuleCall getValueItalicParserRuleCall_1_1_0_1() { return cValueItalicParserRuleCall_1_1_0_1; }

		//"__"
		public Keyword get__Keyword_1_2() { return c__Keyword_1_2; }
	}
	
	
	private final MarkdownElements pMarkdown;
	private final ContentElements pContent;
	private final TextBlockElements pTextBlock;
	private final Header1Elements pHeader1;
	private final Header2Elements pHeader2;
	private final PlainTextElements pPlainText;
	private final ItalicElements pItalic;
	private final BoldElements pBold;
	private final TerminalRule tTEXT;
	private final TerminalRule tWS;
	private final TerminalRule tNEWLINE;
	private final TerminalRule tID;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MarkdownGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pMarkdown = new MarkdownElements();
		this.pContent = new ContentElements();
		this.pTextBlock = new TextBlockElements();
		this.pHeader1 = new Header1Elements();
		this.pHeader2 = new Header2Elements();
		this.pPlainText = new PlainTextElements();
		this.pItalic = new ItalicElements();
		this.pBold = new BoldElements();
		this.tTEXT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "TEXT");
		this.tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "WS");
		this.tNEWLINE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "NEWLINE");
		this.tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ID");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.markdown.Markdown".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Markdown:
	//	content+=Content*;
	public MarkdownElements getMarkdownAccess() {
		return pMarkdown;
	}
	
	public ParserRule getMarkdownRule() {
		return getMarkdownAccess().getRule();
	}

	//Content:
	//	entity=(Header1 | Header2 | TextBlock) NEWLINE;
	public ContentElements getContentAccess() {
		return pContent;
	}
	
	public ParserRule getContentRule() {
		return getContentAccess().getRule();
	}

	//TextBlock:
	//	text+=(PlainText | Italic | Bold)+;
	public TextBlockElements getTextBlockAccess() {
		return pTextBlock;
	}
	
	public ParserRule getTextBlockRule() {
		return getTextBlockAccess().getRule();
	}

	//Header1:
	//	"# " value=TEXT;
	public Header1Elements getHeader1Access() {
		return pHeader1;
	}
	
	public ParserRule getHeader1Rule() {
		return getHeader1Access().getRule();
	}

	//Header2:
	//	"## " value=TEXT;
	public Header2Elements getHeader2Access() {
		return pHeader2;
	}
	
	public ParserRule getHeader2Rule() {
		return getHeader2Access().getRule();
	}

	//PlainText:
	//	value=TEXT;
	public PlainTextElements getPlainTextAccess() {
		return pPlainText;
	}
	
	public ParserRule getPlainTextRule() {
		return getPlainTextAccess().getRule();
	}

	//Italic:
	//	"*" value+=(PlainText | Bold)+ "*" | "_" value+=(PlainText | Bold)+ "_";
	public ItalicElements getItalicAccess() {
		return pItalic;
	}
	
	public ParserRule getItalicRule() {
		return getItalicAccess().getRule();
	}

	//Bold:
	//	"**" value+=(PlainText | Italic)+ "**" | "__" value+=(PlainText | Italic)+ "__";
	public BoldElements getBoldAccess() {
		return pBold;
	}
	
	public ParserRule getBoldRule() {
		return getBoldAccess().getRule();
	}

	//// ListItem:
	////	'* ' value=TextBlock
	//// ;
	//terminal TEXT:
	//	("a".."å" | "A".."Å") (ID | WS)+;
	public TerminalRule getTEXTRule() {
		return tTEXT;
	} 

	//terminal WS:
	//	(" " | "\t")+;
	public TerminalRule getWSRule() {
		return tWS;
	} 

	//terminal NEWLINE:
	//	"\r"? "\n";
	public TerminalRule getNEWLINERule() {
		return tNEWLINE;
	} 

	//terminal ID:
	//	("a".."å" | "A".."Å") ("a".."å" | "A".."Å" | "0".."9" | "!" | "?")*;
	public TerminalRule getIDRule() {
		return tID;
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
