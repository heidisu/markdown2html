/**
 */
package org.xtext.example.markdown.markdown.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.markdown.markdown.MarkdownPackage;
import org.xtext.example.markdown.markdown.TextBlock;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.markdown.markdown.impl.TextBlockImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextBlockImpl extends MinimalEObjectImpl.Container implements TextBlock
{
  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected EList<EObject> text;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TextBlockImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MarkdownPackage.Literals.TEXT_BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getText()
  {
    if (text == null)
    {
      text = new EObjectContainmentEList<EObject>(EObject.class, this, MarkdownPackage.TEXT_BLOCK__TEXT);
    }
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MarkdownPackage.TEXT_BLOCK__TEXT:
        return ((InternalEList<?>)getText()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MarkdownPackage.TEXT_BLOCK__TEXT:
        return getText();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MarkdownPackage.TEXT_BLOCK__TEXT:
        getText().clear();
        getText().addAll((Collection<? extends EObject>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MarkdownPackage.TEXT_BLOCK__TEXT:
        getText().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MarkdownPackage.TEXT_BLOCK__TEXT:
        return text != null && !text.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TextBlockImpl
