/**
 */
package org.xtext.example.markdown.markdown.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.markdown.markdown.Content;
import org.xtext.example.markdown.markdown.MarkdownPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.markdown.markdown.impl.ContentImpl#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentImpl extends MinimalEObjectImpl.Container implements Content
{
  /**
   * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntity()
   * @generated
   * @ordered
   */
  protected EObject entity;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContentImpl()
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
    return MarkdownPackage.Literals.CONTENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getEntity()
  {
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntity(EObject newEntity, NotificationChain msgs)
  {
    EObject oldEntity = entity;
    entity = newEntity;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MarkdownPackage.CONTENT__ENTITY, oldEntity, newEntity);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntity(EObject newEntity)
  {
    if (newEntity != entity)
    {
      NotificationChain msgs = null;
      if (entity != null)
        msgs = ((InternalEObject)entity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MarkdownPackage.CONTENT__ENTITY, null, msgs);
      if (newEntity != null)
        msgs = ((InternalEObject)newEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MarkdownPackage.CONTENT__ENTITY, null, msgs);
      msgs = basicSetEntity(newEntity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MarkdownPackage.CONTENT__ENTITY, newEntity, newEntity));
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
      case MarkdownPackage.CONTENT__ENTITY:
        return basicSetEntity(null, msgs);
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
      case MarkdownPackage.CONTENT__ENTITY:
        return getEntity();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MarkdownPackage.CONTENT__ENTITY:
        setEntity((EObject)newValue);
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
      case MarkdownPackage.CONTENT__ENTITY:
        setEntity((EObject)null);
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
      case MarkdownPackage.CONTENT__ENTITY:
        return entity != null;
    }
    return super.eIsSet(featureID);
  }

} //ContentImpl
