/*
 * generated by Xtext
 */
package org.xtext.example.markdown.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.markdown.markdown.Bold;
import org.xtext.example.markdown.markdown.Content;
import org.xtext.example.markdown.markdown.Header1;
import org.xtext.example.markdown.markdown.Header2;
import org.xtext.example.markdown.markdown.Italic;
import org.xtext.example.markdown.markdown.Markdown;
import org.xtext.example.markdown.markdown.MarkdownPackage;
import org.xtext.example.markdown.markdown.PlainText;
import org.xtext.example.markdown.services.MarkdownGrammarAccess;

@SuppressWarnings("all")
public class MarkdownSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MarkdownGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MarkdownPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MarkdownPackage.BOLD:
				sequence_Bold(context, (Bold) semanticObject); 
				return; 
			case MarkdownPackage.CONTENT:
				sequence_Content(context, (Content) semanticObject); 
				return; 
			case MarkdownPackage.HEADER1:
				sequence_Header1(context, (Header1) semanticObject); 
				return; 
			case MarkdownPackage.HEADER2:
				sequence_Header2(context, (Header2) semanticObject); 
				return; 
			case MarkdownPackage.ITALIC:
				sequence_Italic(context, (Italic) semanticObject); 
				return; 
			case MarkdownPackage.MARKDOWN:
				sequence_Markdown(context, (Markdown) semanticObject); 
				return; 
			case MarkdownPackage.PLAIN_TEXT:
				sequence_PlainText(context, (PlainText) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     ((value+=PlainText | value+=Italic)+ | (value+=PlainText | value+=Italic)+)
	 */
	protected void sequence_Bold(EObject context, Bold semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (entity+=Header1 | entity+=Header2 | entity+=Italic | entity+=Bold | entity+=PlainText)+
	 */
	protected void sequence_Content(EObject context, Content semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=HEADER_VALUE
	 */
	protected void sequence_Header1(EObject context, Header1 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MarkdownPackage.Literals.HEADER1__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MarkdownPackage.Literals.HEADER1__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHeader1Access().getValueHEADER_VALUETerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=HEADER_VALUE
	 */
	protected void sequence_Header2(EObject context, Header2 semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MarkdownPackage.Literals.HEADER2__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MarkdownPackage.Literals.HEADER2__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHeader2Access().getValueHEADER_VALUETerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((value+=PlainText | value+=Bold)+ | (value+=PlainText | value+=Bold)+)
	 */
	protected void sequence_Italic(EObject context, Italic semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     content+=Content*
	 */
	protected void sequence_Markdown(EObject context, Markdown semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=TEXT
	 */
	protected void sequence_PlainText(EObject context, PlainText semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MarkdownPackage.Literals.PLAIN_TEXT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MarkdownPackage.Literals.PLAIN_TEXT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPlainTextAccess().getValueTEXTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
}
