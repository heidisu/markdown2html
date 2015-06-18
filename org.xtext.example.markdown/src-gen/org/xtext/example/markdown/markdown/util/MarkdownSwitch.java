/**
 */
package org.xtext.example.markdown.markdown.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.markdown.markdown.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.markdown.markdown.MarkdownPackage
 * @generated
 */
public class MarkdownSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MarkdownPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MarkdownSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MarkdownPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MarkdownPackage.MARKDOWN:
      {
        Markdown markdown = (Markdown)theEObject;
        T result = caseMarkdown(markdown);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MarkdownPackage.CONTENT:
      {
        Content content = (Content)theEObject;
        T result = caseContent(content);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MarkdownPackage.TEXT_BLOCK:
      {
        TextBlock textBlock = (TextBlock)theEObject;
        T result = caseTextBlock(textBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MarkdownPackage.HEADER1:
      {
        Header1 header1 = (Header1)theEObject;
        T result = caseHeader1(header1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MarkdownPackage.HEADER2:
      {
        Header2 header2 = (Header2)theEObject;
        T result = caseHeader2(header2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MarkdownPackage.PLAIN_TEXT:
      {
        PlainText plainText = (PlainText)theEObject;
        T result = casePlainText(plainText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MarkdownPackage.ITALIC:
      {
        Italic italic = (Italic)theEObject;
        T result = caseItalic(italic);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MarkdownPackage.BOLD:
      {
        Bold bold = (Bold)theEObject;
        T result = caseBold(bold);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Markdown</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Markdown</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMarkdown(Markdown object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Content</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Content</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContent(Content object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextBlock(TextBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Header1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Header1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHeader1(Header1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Header2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Header2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHeader2(Header2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plain Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plain Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlainText(PlainText object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Italic</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Italic</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItalic(Italic object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bold</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bold</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBold(Bold object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MarkdownSwitch
