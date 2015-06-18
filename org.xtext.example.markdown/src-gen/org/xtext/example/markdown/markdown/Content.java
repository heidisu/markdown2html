/**
 */
package org.xtext.example.markdown.markdown;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.markdown.markdown.Content#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.markdown.markdown.MarkdownPackage#getContent()
 * @model
 * @generated
 */
public interface Content extends EObject
{
  /**
   * Returns the value of the '<em><b>Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' containment reference.
   * @see #setEntity(EObject)
   * @see org.xtext.example.markdown.markdown.MarkdownPackage#getContent_Entity()
   * @model containment="true"
   * @generated
   */
  EObject getEntity();

  /**
   * Sets the value of the '{@link org.xtext.example.markdown.markdown.Content#getEntity <em>Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity</em>' containment reference.
   * @see #getEntity()
   * @generated
   */
  void setEntity(EObject value);

} // Content
