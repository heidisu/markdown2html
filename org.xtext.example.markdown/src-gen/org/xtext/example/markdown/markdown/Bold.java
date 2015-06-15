/**
 */
package org.xtext.example.markdown.markdown;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bold</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.markdown.markdown.Bold#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.markdown.markdown.MarkdownPackage#getBold()
 * @model
 * @generated
 */
public interface Bold extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference list.
   * @see org.xtext.example.markdown.markdown.MarkdownPackage#getBold_Value()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getValue();

} // Bold
