/**
 */
package org.xtext.example.markdown.markdown;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.markdown.markdown.MarkdownFactory
 * @model kind="package"
 * @generated
 */
public interface MarkdownPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "markdown";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/markdown/Markdown";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "markdown";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MarkdownPackage eINSTANCE = org.xtext.example.markdown.markdown.impl.MarkdownPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.markdown.markdown.impl.MarkdownImpl <em>Markdown</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.markdown.markdown.impl.MarkdownImpl
   * @see org.xtext.example.markdown.markdown.impl.MarkdownPackageImpl#getMarkdown()
   * @generated
   */
  int MARKDOWN = 0;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARKDOWN__CONTENT = 0;

  /**
   * The number of structural features of the '<em>Markdown</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARKDOWN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.markdown.markdown.impl.ContentImpl <em>Content</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.markdown.markdown.impl.ContentImpl
   * @see org.xtext.example.markdown.markdown.impl.MarkdownPackageImpl#getContent()
   * @generated
   */
  int CONTENT = 1;

  /**
   * The feature id for the '<em><b>Entity</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT__ENTITY = 0;

  /**
   * The number of structural features of the '<em>Content</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.markdown.markdown.impl.Header1Impl <em>Header1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.markdown.markdown.impl.Header1Impl
   * @see org.xtext.example.markdown.markdown.impl.MarkdownPackageImpl#getHeader1()
   * @generated
   */
  int HEADER1 = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER1__VALUE = 0;

  /**
   * The number of structural features of the '<em>Header1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER1_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.markdown.markdown.impl.Header2Impl <em>Header2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.markdown.markdown.impl.Header2Impl
   * @see org.xtext.example.markdown.markdown.impl.MarkdownPackageImpl#getHeader2()
   * @generated
   */
  int HEADER2 = 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER2__VALUE = 0;

  /**
   * The number of structural features of the '<em>Header2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER2_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.markdown.markdown.impl.PlainTextImpl <em>Plain Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.markdown.markdown.impl.PlainTextImpl
   * @see org.xtext.example.markdown.markdown.impl.MarkdownPackageImpl#getPlainText()
   * @generated
   */
  int PLAIN_TEXT = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAIN_TEXT__VALUE = 0;

  /**
   * The number of structural features of the '<em>Plain Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAIN_TEXT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.markdown.markdown.impl.ItalicImpl <em>Italic</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.markdown.markdown.impl.ItalicImpl
   * @see org.xtext.example.markdown.markdown.impl.MarkdownPackageImpl#getItalic()
   * @generated
   */
  int ITALIC = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITALIC__VALUE = 0;

  /**
   * The number of structural features of the '<em>Italic</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITALIC_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.markdown.markdown.impl.BoldImpl <em>Bold</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.markdown.markdown.impl.BoldImpl
   * @see org.xtext.example.markdown.markdown.impl.MarkdownPackageImpl#getBold()
   * @generated
   */
  int BOLD = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOLD__VALUE = 0;

  /**
   * The number of structural features of the '<em>Bold</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOLD_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.xtext.example.markdown.markdown.Markdown <em>Markdown</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Markdown</em>'.
   * @see org.xtext.example.markdown.markdown.Markdown
   * @generated
   */
  EClass getMarkdown();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.markdown.markdown.Markdown#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Content</em>'.
   * @see org.xtext.example.markdown.markdown.Markdown#getContent()
   * @see #getMarkdown()
   * @generated
   */
  EReference getMarkdown_Content();

  /**
   * Returns the meta object for class '{@link org.xtext.example.markdown.markdown.Content <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Content</em>'.
   * @see org.xtext.example.markdown.markdown.Content
   * @generated
   */
  EClass getContent();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.markdown.markdown.Content#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entity</em>'.
   * @see org.xtext.example.markdown.markdown.Content#getEntity()
   * @see #getContent()
   * @generated
   */
  EReference getContent_Entity();

  /**
   * Returns the meta object for class '{@link org.xtext.example.markdown.markdown.Header1 <em>Header1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Header1</em>'.
   * @see org.xtext.example.markdown.markdown.Header1
   * @generated
   */
  EClass getHeader1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.markdown.markdown.Header1#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.markdown.markdown.Header1#getValue()
   * @see #getHeader1()
   * @generated
   */
  EAttribute getHeader1_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.markdown.markdown.Header2 <em>Header2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Header2</em>'.
   * @see org.xtext.example.markdown.markdown.Header2
   * @generated
   */
  EClass getHeader2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.markdown.markdown.Header2#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.markdown.markdown.Header2#getValue()
   * @see #getHeader2()
   * @generated
   */
  EAttribute getHeader2_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.markdown.markdown.PlainText <em>Plain Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plain Text</em>'.
   * @see org.xtext.example.markdown.markdown.PlainText
   * @generated
   */
  EClass getPlainText();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.markdown.markdown.PlainText#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.markdown.markdown.PlainText#getValue()
   * @see #getPlainText()
   * @generated
   */
  EAttribute getPlainText_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.markdown.markdown.Italic <em>Italic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Italic</em>'.
   * @see org.xtext.example.markdown.markdown.Italic
   * @generated
   */
  EClass getItalic();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.markdown.markdown.Italic#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Value</em>'.
   * @see org.xtext.example.markdown.markdown.Italic#getValue()
   * @see #getItalic()
   * @generated
   */
  EReference getItalic_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.markdown.markdown.Bold <em>Bold</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bold</em>'.
   * @see org.xtext.example.markdown.markdown.Bold
   * @generated
   */
  EClass getBold();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.markdown.markdown.Bold#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Value</em>'.
   * @see org.xtext.example.markdown.markdown.Bold#getValue()
   * @see #getBold()
   * @generated
   */
  EReference getBold_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MarkdownFactory getMarkdownFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.markdown.markdown.impl.MarkdownImpl <em>Markdown</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.markdown.markdown.impl.MarkdownImpl
     * @see org.xtext.example.markdown.markdown.impl.MarkdownPackageImpl#getMarkdown()
     * @generated
     */
    EClass MARKDOWN = eINSTANCE.getMarkdown();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MARKDOWN__CONTENT = eINSTANCE.getMarkdown_Content();

    /**
     * The meta object literal for the '{@link org.xtext.example.markdown.markdown.impl.ContentImpl <em>Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.markdown.markdown.impl.ContentImpl
     * @see org.xtext.example.markdown.markdown.impl.MarkdownPackageImpl#getContent()
     * @generated
     */
    EClass CONTENT = eINSTANCE.getContent();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTENT__ENTITY = eINSTANCE.getContent_Entity();

    /**
     * The meta object literal for the '{@link org.xtext.example.markdown.markdown.impl.Header1Impl <em>Header1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.markdown.markdown.impl.Header1Impl
     * @see org.xtext.example.markdown.markdown.impl.MarkdownPackageImpl#getHeader1()
     * @generated
     */
    EClass HEADER1 = eINSTANCE.getHeader1();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEADER1__VALUE = eINSTANCE.getHeader1_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.markdown.markdown.impl.Header2Impl <em>Header2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.markdown.markdown.impl.Header2Impl
     * @see org.xtext.example.markdown.markdown.impl.MarkdownPackageImpl#getHeader2()
     * @generated
     */
    EClass HEADER2 = eINSTANCE.getHeader2();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEADER2__VALUE = eINSTANCE.getHeader2_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.markdown.markdown.impl.PlainTextImpl <em>Plain Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.markdown.markdown.impl.PlainTextImpl
     * @see org.xtext.example.markdown.markdown.impl.MarkdownPackageImpl#getPlainText()
     * @generated
     */
    EClass PLAIN_TEXT = eINSTANCE.getPlainText();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLAIN_TEXT__VALUE = eINSTANCE.getPlainText_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.markdown.markdown.impl.ItalicImpl <em>Italic</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.markdown.markdown.impl.ItalicImpl
     * @see org.xtext.example.markdown.markdown.impl.MarkdownPackageImpl#getItalic()
     * @generated
     */
    EClass ITALIC = eINSTANCE.getItalic();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITALIC__VALUE = eINSTANCE.getItalic_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.markdown.markdown.impl.BoldImpl <em>Bold</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.markdown.markdown.impl.BoldImpl
     * @see org.xtext.example.markdown.markdown.impl.MarkdownPackageImpl#getBold()
     * @generated
     */
    EClass BOLD = eINSTANCE.getBold();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOLD__VALUE = eINSTANCE.getBold_Value();

  }

} //MarkdownPackage
