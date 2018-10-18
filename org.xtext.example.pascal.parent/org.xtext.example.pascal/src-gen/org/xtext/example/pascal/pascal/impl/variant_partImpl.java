/**
 * generated by Xtext 2.16.0-SNAPSHOT
 */
package org.xtext.example.pascal.pascal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.pascal.pascal.PascalPackage;
import org.xtext.example.pascal.pascal.tag_field;
import org.xtext.example.pascal.pascal.variant;
import org.xtext.example.pascal.pascal.variant_part;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>variant part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.variant_partImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.variant_partImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.variant_partImpl#getVariants <em>Variants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class variant_partImpl extends MinimalEObjectImpl.Container implements variant_part
{
  /**
   * The cached value of the '{@link #getTag() <em>Tag</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTag()
   * @generated
   * @ordered
   */
  protected tag_field tag;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getVariants() <em>Variants</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariants()
   * @generated
   * @ordered
   */
  protected EList<variant> variants;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected variant_partImpl()
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
    return PascalPackage.Literals.VARIANT_PART;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public tag_field getTag()
  {
    return tag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTag(tag_field newTag, NotificationChain msgs)
  {
    tag_field oldTag = tag;
    tag = newTag;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.VARIANT_PART__TAG, oldTag, newTag);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTag(tag_field newTag)
  {
    if (newTag != tag)
    {
      NotificationChain msgs = null;
      if (tag != null)
        msgs = ((InternalEObject)tag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VARIANT_PART__TAG, null, msgs);
      if (newTag != null)
        msgs = ((InternalEObject)newTag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VARIANT_PART__TAG, null, msgs);
      msgs = basicSetTag(newTag, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.VARIANT_PART__TAG, newTag, newTag));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.VARIANT_PART__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<variant> getVariants()
  {
    if (variants == null)
    {
      variants = new EObjectContainmentEList<variant>(variant.class, this, PascalPackage.VARIANT_PART__VARIANTS);
    }
    return variants;
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
      case PascalPackage.VARIANT_PART__TAG:
        return basicSetTag(null, msgs);
      case PascalPackage.VARIANT_PART__VARIANTS:
        return ((InternalEList<?>)getVariants()).basicRemove(otherEnd, msgs);
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
      case PascalPackage.VARIANT_PART__TAG:
        return getTag();
      case PascalPackage.VARIANT_PART__NAME:
        return getName();
      case PascalPackage.VARIANT_PART__VARIANTS:
        return getVariants();
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
      case PascalPackage.VARIANT_PART__TAG:
        setTag((tag_field)newValue);
        return;
      case PascalPackage.VARIANT_PART__NAME:
        setName((String)newValue);
        return;
      case PascalPackage.VARIANT_PART__VARIANTS:
        getVariants().clear();
        getVariants().addAll((Collection<? extends variant>)newValue);
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
      case PascalPackage.VARIANT_PART__TAG:
        setTag((tag_field)null);
        return;
      case PascalPackage.VARIANT_PART__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PascalPackage.VARIANT_PART__VARIANTS:
        getVariants().clear();
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
      case PascalPackage.VARIANT_PART__TAG:
        return tag != null;
      case PascalPackage.VARIANT_PART__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PascalPackage.VARIANT_PART__VARIANTS:
        return variants != null && !variants.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //variant_partImpl