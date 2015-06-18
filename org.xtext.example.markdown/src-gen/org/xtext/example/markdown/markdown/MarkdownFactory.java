/**
 */
package org.xtext.example.markdown.markdown;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.markdown.markdown.MarkdownPackage
 * @generated
 */
public interface MarkdownFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MarkdownFactory eINSTANCE = org.xtext.example.markdown.markdown.impl.MarkdownFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Markdown</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Markdown</em>'.
   * @generated
   */
  Markdown createMarkdown();

  /**
   * Returns a new object of class '<em>Content</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Content</em>'.
   * @generated
   */
  Content createContent();

  /**
   * Returns a new object of class '<em>Text Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text Block</em>'.
   * @generated
   */
  TextBlock createTextBlock();

  /**
   * Returns a new object of class '<em>Header1</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Header1</em>'.
   * @generated
   */
  Header1 createHeader1();

  /**
   * Returns a new object of class '<em>Header2</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Header2</em>'.
   * @generated
   */
  Header2 createHeader2();

  /**
   * Returns a new object of class '<em>Plain Text</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plain Text</em>'.
   * @generated
   */
  PlainText createPlainText();

  /**
   * Returns a new object of class '<em>Italic</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Italic</em>'.
   * @generated
   */
  Italic createItalic();

  /**
   * Returns a new object of class '<em>Bold</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bold</em>'.
   * @generated
   */
  Bold createBold();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MarkdownPackage getMarkdownPackage();

} //MarkdownFactory
