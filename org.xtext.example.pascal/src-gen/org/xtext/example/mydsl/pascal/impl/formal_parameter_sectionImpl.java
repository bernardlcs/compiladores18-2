/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.pascal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.pascal.PascalPackage;
import org.xtext.example.mydsl.pascal.abstraction_heading;
import org.xtext.example.mydsl.pascal.formal_parameter_section;
import org.xtext.example.mydsl.pascal.value_parameter_section;
import org.xtext.example.mydsl.pascal.variable_parameter_section;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>formal parameter section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.formal_parameter_sectionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.formal_parameter_sectionImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.formal_parameter_sectionImpl#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.formal_parameter_sectionImpl#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class formal_parameter_sectionImpl extends MinimalEObjectImpl.Container implements formal_parameter_section
{
  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected value_parameter_section value;

  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected variable_parameter_section variable;

  /**
   * The cached value of the '{@link #getProcedure() <em>Procedure</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcedure()
   * @generated
   * @ordered
   */
  protected abstraction_heading procedure;

  /**
   * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction()
   * @generated
   * @ordered
   */
  protected abstraction_heading function;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected formal_parameter_sectionImpl()
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
    return PascalPackage.Literals.FORMAL_PARAMETER_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public value_parameter_section getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(value_parameter_section newValue, NotificationChain msgs)
  {
    value_parameter_section oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FORMAL_PARAMETER_SECTION__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(value_parameter_section newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FORMAL_PARAMETER_SECTION__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FORMAL_PARAMETER_SECTION__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FORMAL_PARAMETER_SECTION__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variable_parameter_section getVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariable(variable_parameter_section newVariable, NotificationChain msgs)
  {
    variable_parameter_section oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FORMAL_PARAMETER_SECTION__VARIABLE, oldVariable, newVariable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(variable_parameter_section newVariable)
  {
    if (newVariable != variable)
    {
      NotificationChain msgs = null;
      if (variable != null)
        msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FORMAL_PARAMETER_SECTION__VARIABLE, null, msgs);
      if (newVariable != null)
        msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FORMAL_PARAMETER_SECTION__VARIABLE, null, msgs);
      msgs = basicSetVariable(newVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FORMAL_PARAMETER_SECTION__VARIABLE, newVariable, newVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public abstraction_heading getProcedure()
  {
    return procedure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProcedure(abstraction_heading newProcedure, NotificationChain msgs)
  {
    abstraction_heading oldProcedure = procedure;
    procedure = newProcedure;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FORMAL_PARAMETER_SECTION__PROCEDURE, oldProcedure, newProcedure);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProcedure(abstraction_heading newProcedure)
  {
    if (newProcedure != procedure)
    {
      NotificationChain msgs = null;
      if (procedure != null)
        msgs = ((InternalEObject)procedure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FORMAL_PARAMETER_SECTION__PROCEDURE, null, msgs);
      if (newProcedure != null)
        msgs = ((InternalEObject)newProcedure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FORMAL_PARAMETER_SECTION__PROCEDURE, null, msgs);
      msgs = basicSetProcedure(newProcedure, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FORMAL_PARAMETER_SECTION__PROCEDURE, newProcedure, newProcedure));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public abstraction_heading getFunction()
  {
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunction(abstraction_heading newFunction, NotificationChain msgs)
  {
    abstraction_heading oldFunction = function;
    function = newFunction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FORMAL_PARAMETER_SECTION__FUNCTION, oldFunction, newFunction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunction(abstraction_heading newFunction)
  {
    if (newFunction != function)
    {
      NotificationChain msgs = null;
      if (function != null)
        msgs = ((InternalEObject)function).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FORMAL_PARAMETER_SECTION__FUNCTION, null, msgs);
      if (newFunction != null)
        msgs = ((InternalEObject)newFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FORMAL_PARAMETER_SECTION__FUNCTION, null, msgs);
      msgs = basicSetFunction(newFunction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FORMAL_PARAMETER_SECTION__FUNCTION, newFunction, newFunction));
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
      case PascalPackage.FORMAL_PARAMETER_SECTION__VALUE:
        return basicSetValue(null, msgs);
      case PascalPackage.FORMAL_PARAMETER_SECTION__VARIABLE:
        return basicSetVariable(null, msgs);
      case PascalPackage.FORMAL_PARAMETER_SECTION__PROCEDURE:
        return basicSetProcedure(null, msgs);
      case PascalPackage.FORMAL_PARAMETER_SECTION__FUNCTION:
        return basicSetFunction(null, msgs);
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
      case PascalPackage.FORMAL_PARAMETER_SECTION__VALUE:
        return getValue();
      case PascalPackage.FORMAL_PARAMETER_SECTION__VARIABLE:
        return getVariable();
      case PascalPackage.FORMAL_PARAMETER_SECTION__PROCEDURE:
        return getProcedure();
      case PascalPackage.FORMAL_PARAMETER_SECTION__FUNCTION:
        return getFunction();
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
      case PascalPackage.FORMAL_PARAMETER_SECTION__VALUE:
        setValue((value_parameter_section)newValue);
        return;
      case PascalPackage.FORMAL_PARAMETER_SECTION__VARIABLE:
        setVariable((variable_parameter_section)newValue);
        return;
      case PascalPackage.FORMAL_PARAMETER_SECTION__PROCEDURE:
        setProcedure((abstraction_heading)newValue);
        return;
      case PascalPackage.FORMAL_PARAMETER_SECTION__FUNCTION:
        setFunction((abstraction_heading)newValue);
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
      case PascalPackage.FORMAL_PARAMETER_SECTION__VALUE:
        setValue((value_parameter_section)null);
        return;
      case PascalPackage.FORMAL_PARAMETER_SECTION__VARIABLE:
        setVariable((variable_parameter_section)null);
        return;
      case PascalPackage.FORMAL_PARAMETER_SECTION__PROCEDURE:
        setProcedure((abstraction_heading)null);
        return;
      case PascalPackage.FORMAL_PARAMETER_SECTION__FUNCTION:
        setFunction((abstraction_heading)null);
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
      case PascalPackage.FORMAL_PARAMETER_SECTION__VALUE:
        return value != null;
      case PascalPackage.FORMAL_PARAMETER_SECTION__VARIABLE:
        return variable != null;
      case PascalPackage.FORMAL_PARAMETER_SECTION__PROCEDURE:
        return procedure != null;
      case PascalPackage.FORMAL_PARAMETER_SECTION__FUNCTION:
        return function != null;
    }
    return super.eIsSet(featureID);
  }

} //formal_parameter_sectionImpl
