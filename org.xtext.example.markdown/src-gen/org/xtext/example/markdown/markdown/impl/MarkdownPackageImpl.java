/**
 */
package org.xtext.example.markdown.markdown.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.example.markdown.markdown.Bold;
import org.xtext.example.markdown.markdown.Content;
import org.xtext.example.markdown.markdown.Header1;
import org.xtext.example.markdown.markdown.Header2;
import org.xtext.example.markdown.markdown.Italic;
import org.xtext.example.markdown.markdown.Markdown;
import org.xtext.example.markdown.markdown.MarkdownFactory;
import org.xtext.example.markdown.markdown.MarkdownPackage;
import org.xtext.example.markdown.markdown.PlainText;
import org.xtext.example.markdown.markdown.TextBlock;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MarkdownPackageImpl extends EPackageImpl implements MarkdownPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass markdownEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass header1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass header2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass plainTextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass italicEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boldEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.example.markdown.markdown.MarkdownPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MarkdownPackageImpl()
  {
    super(eNS_URI, MarkdownFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link MarkdownPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MarkdownPackage init()
  {
    if (isInited) return (MarkdownPackage)EPackage.Registry.INSTANCE.getEPackage(MarkdownPackage.eNS_URI);

    // Obtain or create and register package
    MarkdownPackageImpl theMarkdownPackage = (MarkdownPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MarkdownPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MarkdownPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMarkdownPackage.createPackageContents();

    // Initialize created meta-data
    theMarkdownPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMarkdownPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MarkdownPackage.eNS_URI, theMarkdownPackage);
    return theMarkdownPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMarkdown()
  {
    return markdownEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMarkdown_Content()
  {
    return (EReference)markdownEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContent()
  {
    return contentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContent_Entity()
  {
    return (EReference)contentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextBlock()
  {
    return textBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextBlock_Text()
  {
    return (EReference)textBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHeader1()
  {
    return header1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHeader1_Value()
  {
    return (EAttribute)header1EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHeader2()
  {
    return header2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHeader2_Value()
  {
    return (EAttribute)header2EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlainText()
  {
    return plainTextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPlainText_Value()
  {
    return (EAttribute)plainTextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getItalic()
  {
    return italicEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getItalic_Value()
  {
    return (EReference)italicEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBold()
  {
    return boldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBold_Value()
  {
    return (EReference)boldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MarkdownFactory getMarkdownFactory()
  {
    return (MarkdownFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    markdownEClass = createEClass(MARKDOWN);
    createEReference(markdownEClass, MARKDOWN__CONTENT);

    contentEClass = createEClass(CONTENT);
    createEReference(contentEClass, CONTENT__ENTITY);

    textBlockEClass = createEClass(TEXT_BLOCK);
    createEReference(textBlockEClass, TEXT_BLOCK__TEXT);

    header1EClass = createEClass(HEADER1);
    createEAttribute(header1EClass, HEADER1__VALUE);

    header2EClass = createEClass(HEADER2);
    createEAttribute(header2EClass, HEADER2__VALUE);

    plainTextEClass = createEClass(PLAIN_TEXT);
    createEAttribute(plainTextEClass, PLAIN_TEXT__VALUE);

    italicEClass = createEClass(ITALIC);
    createEReference(italicEClass, ITALIC__VALUE);

    boldEClass = createEClass(BOLD);
    createEReference(boldEClass, BOLD__VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(markdownEClass, Markdown.class, "Markdown", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMarkdown_Content(), this.getContent(), null, "content", null, 0, -1, Markdown.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contentEClass, Content.class, "Content", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContent_Entity(), ecorePackage.getEObject(), null, "entity", null, 0, 1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(textBlockEClass, TextBlock.class, "TextBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTextBlock_Text(), ecorePackage.getEObject(), null, "text", null, 0, -1, TextBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(header1EClass, Header1.class, "Header1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHeader1_Value(), ecorePackage.getEString(), "value", null, 0, 1, Header1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(header2EClass, Header2.class, "Header2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHeader2_Value(), ecorePackage.getEString(), "value", null, 0, 1, Header2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(plainTextEClass, PlainText.class, "PlainText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPlainText_Value(), ecorePackage.getEString(), "value", null, 0, 1, PlainText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(italicEClass, Italic.class, "Italic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getItalic_Value(), ecorePackage.getEObject(), null, "value", null, 0, -1, Italic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(boldEClass, Bold.class, "Bold", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBold_Value(), ecorePackage.getEObject(), null, "value", null, 0, -1, Bold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //MarkdownPackageImpl
