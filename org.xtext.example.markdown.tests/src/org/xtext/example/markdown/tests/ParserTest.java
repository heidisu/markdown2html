package org.xtext.example.markdown.tests;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.markdown.MarkdownInjectorProvider;
import org.xtext.example.markdown.markdown.Content;
import org.xtext.example.markdown.markdown.Header1;
import org.xtext.example.markdown.markdown.Header2;
import org.xtext.example.markdown.markdown.Markdown;
import com.google.inject.Inject;

@RunWith(XtextRunner.class)
@InjectWith(MarkdownInjectorProvider.class)
public class ParserTest {	
	private static final String TEXT1 = "En veldig fin tekst";
	private static final String TEXT2 = "En enda bedre og langt finere tekst";
	private static final String H1PREFIX = "# ";
	private static final String H2PREFIX = "## ";

	
	@Inject private ParseHelper<Markdown> parseHelper;

	@Test
	public void testH1() throws Exception{
		String text = H1PREFIX+ TEXT1;
		Markdown markdown = parseHelper.parse(text);
	    EObject obj =  markdown.getContent().get(0).getEntity().get(0);
	    Assert.assertTrue(obj instanceof Header1);
	    Header1 h2 = (Header1) obj;
	    Assert.assertEquals(TEXT1, h2.getValue().trim());
	}
	
	@Test
	public void testH2() throws Exception{
		String text = H2PREFIX + TEXT1;
		Markdown markdown = parseHelper.parse(text);
	    EObject obj =  markdown.getContent().get(0).getEntity().get(0);
	    Assert.assertTrue(obj instanceof Header2);
	    Header2 h2 = (Header2) obj;
	    Assert.assertEquals(TEXT1, h2.getValue().trim());
	}
	
	@Test
	public void testCombination() throws Exception{
		String text = H1PREFIX + TEXT1 + "\n" + H2PREFIX + TEXT2 + "\n" + TEXT1 + "\n" + H2PREFIX + TEXT2;
		Markdown markdown = parseHelper.parse(text);
		EList<Content> objList = markdown.getContent();
		Assert.assertEquals(4, objList.size());
	}	
}
