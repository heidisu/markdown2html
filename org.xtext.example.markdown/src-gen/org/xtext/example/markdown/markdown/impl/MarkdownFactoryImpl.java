/**
 */
package org.xtext.example.markdown.markdown.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.markdown.markdown.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MarkdownFactoryImpl extends EFactoryImpl implements MarkdownFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MarkdownFactory init()
  {
    try
    {
      MarkdownFactory theMarkdownFactory = (MarkdownFactory)EPackage.Registry.INSTANCE.getEFactory(MarkdownPackage.eNS_URI);
      if (theMarkdownFactory != null)
      {
        return theMarkdownFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MarkdownFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MarkdownFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MarkdownPackage.MARKDOWN: return createMarkdown();
      case MarkdownPackage.CONTENT: return createContent();
      case MarkdownPackage.TEXT_BLOCK: return createTextBlock();
      case MarkdownPackage.HEADER1: return createHeader1();
      case MarkdownPackage.HEADER2: return createHeader2();
      case MarkdownPackage.PLAIN_TEXT: return createPlainText();
      case MarkdownPackage.ITALIC: return createItalic();
      case MarkdownPackage.BOLD: return createBold();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Markdown createMarkdown()
  {
    MarkdownImpl markdown = new MarkdownImpl();
    return markdown;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Content createContent()
  {
    ContentImpl content = new ContentImpl();
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextBlock createTextBlock()
  {
    TextBlockImpl textBlock = new TextBlockImpl();
    return textBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Header1 createHeader1()
  {
    Header1Impl header1 = new Header1Impl();
    return header1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Header2 createHeader2()
  {
    Header2Impl header2 = new Header2Impl();
    return header2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlainText createPlainText()
  {
    PlainTextImpl plainText = new PlainTextImpl();
    return plainText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Italic createItalic()
  {
    ItalicImpl italic = new ItalicImpl();
    return italic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bold createBold()
  {
    BoldImpl bold = new BoldImpl();
    return bold;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MarkdownPackage getMarkdownPackage()
  {
    return (MarkdownPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MarkdownPackage getPackage()
  {
    return MarkdownPackage.eINSTANCE;
  }

} //MarkdownFactoryImpl
