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
import org.xtext.example.mydsl.pascal.expression_list;
import org.xtext.example.mydsl.pascal.var_;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>var </b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.var_Impl#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.var_Impl#getArray <em>Array</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.var_Impl#isAccessor <em>Accessor</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.var_Impl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.var_Impl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.var_Impl#getPointer <em>Pointer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class var_Impl extends MinimalEObjectImpl.Container implements var_
{
  /**
   * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressions()
   * @generated
   * @ordered
   */
  protected expression_list expressions;

  /**
   * The cached value of the '{@link #getArray() <em>Array</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArray()
   * @generated
   * @ordered
   */
  protected var_ array;

  /**
   * The default value of the '{@link #isAccessor() <em>Accessor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAccessor()
   * @generated
   * @ordered
   */
  protected static final boolean ACCESSOR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAccessor() <em>Accessor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAccessor()
   * @generated
   * @ordered
   */
  protected boolean accessor = ACCESSOR_EDEFAULT;

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
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected var_ variable;

  /**
   * The cached value of the '{@link #getPointer() <em>Pointer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPointer()
   * @generated
   * @ordered
   */
  protected var_ pointer;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected var_Impl()
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
    return PascalPackage.Literals.VAR_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression_list getExpressions()
  {
    return expressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressions(expression_list newExpressions, NotificationChain msgs)
  {
    expression_list oldExpressions = expressions;
    expressions = newExpressions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.VAR___EXPRESSIONS, oldExpressions, newExpressions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpressions(expression_list newExpressions)
  {
    if (newExpressions != expressions)
    {
      NotificationChain msgs = null;
      if (expressions != null)
        msgs = ((InternalEObject)expressions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VAR___EXPRESSIONS, null, msgs);
      if (newExpressions != null)
        msgs = ((InternalEObject)newExpressions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VAR___EXPRESSIONS, null, msgs);
      msgs = basicSetExpressions(newExpressions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.VAR___EXPRESSIONS, newExpressions, newExpressions));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public var_ getArray()
  {
    return array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArray(var_ newArray, NotificationChain msgs)
  {
    var_ oldArray = array;
    array = newArray;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.VAR___ARRAY, oldArray, newArray);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArray(var_ newArray)
  {
    if (newArray != array)
    {
      NotificationChain msgs = null;
      if (array != null)
        msgs = ((InternalEObject)array).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VAR___ARRAY, null, msgs);
      if (newArray != null)
        msgs = ((InternalEObject)newArray).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VAR___ARRAY, null, msgs);
      msgs = basicSetArray(newArray, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.VAR___ARRAY, newArray, newArray));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAccessor()
  {
    return accessor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccessor(boolean newAccessor)
  {
    boolean oldAccessor = accessor;
    accessor = newAccessor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.VAR___ACCESSOR, oldAccessor, accessor));
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
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.VAR___NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public var_ getVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariable(var_ newVariable, NotificationChain msgs)
  {
    var_ oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.VAR___VARIABLE, oldVariable, newVariable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(var_ newVariable)
  {
    if (newVariable != variable)
    {
      NotificationChain msgs = null;
      if (variable != null)
        msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VAR___VARIABLE, null, msgs);
      if (newVariable != null)
        msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VAR___VARIABLE, null, msgs);
      msgs = basicSetVariable(newVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.VAR___VARIABLE, newVariable, newVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public var_ getPointer()
  {
    return pointer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPointer(var_ newPointer, NotificationChain msgs)
  {
    var_ oldPointer = pointer;
    pointer = newPointer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.VAR___POINTER, oldPointer, newPointer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPointer(var_ newPointer)
  {
    if (newPointer != pointer)
    {
      NotificationChain msgs = null;
      if (pointer != null)
        msgs = ((InternalEObject)pointer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VAR___POINTER, null, msgs);
      if (newPointer != null)
        msgs = ((InternalEObject)newPointer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VAR___POINTER, null, msgs);
      msgs = basicSetPointer(newPointer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.VAR___POINTER, newPointer, newPointer));
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
      case PascalPackage.VAR___EXPRESSIONS:
        return basicSetExpressions(null, msgs);
      case PascalPackage.VAR___ARRAY:
        return basicSetArray(null, msgs);
      case PascalPackage.VAR___VARIABLE:
        return basicSetVariable(null, msgs);
      case PascalPackage.VAR___POINTER:
        return basicSetPointer(null, msgs);
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
      case PascalPackage.VAR___EXPRESSIONS:
        return getExpressions();
      case PascalPackage.VAR___ARRAY:
        return getArray();
      case PascalPackage.VAR___ACCESSOR:
        return isAccessor();
      case PascalPackage.VAR___NAME:
        return getName();
      case PascalPackage.VAR___VARIABLE:
        return getVariable();
      case PascalPackage.VAR___POINTER:
        return getPointer();
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
      case PascalPackage.VAR___EXPRESSIONS:
        setExpressions((expression_list)newValue);
        return;
      case PascalPackage.VAR___ARRAY:
        setArray((var_)newValue);
        return;
      case PascalPackage.VAR___ACCESSOR:
        setAccessor((Boolean)newValue);
        return;
      case PascalPackage.VAR___NAME:
        setName((String)newValue);
        return;
      case PascalPackage.VAR___VARIABLE:
        setVariable((var_)newValue);
        return;
      case PascalPackage.VAR___POINTER:
        setPointer((var_)newValue);
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
      case PascalPackage.VAR___EXPRESSIONS:
        setExpressions((expression_list)null);
        return;
      case PascalPackage.VAR___ARRAY:
        setArray((var_)null);
        return;
      case PascalPackage.VAR___ACCESSOR:
        setAccessor(ACCESSOR_EDEFAULT);
        return;
      case PascalPackage.VAR___NAME:
        setName(NAME_EDEFAULT);
        return;
      case PascalPackage.VAR___VARIABLE:
        setVariable((var_)null);
        return;
      case PascalPackage.VAR___POINTER:
        setPointer((var_)null);
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
      case PascalPackage.VAR___EXPRESSIONS:
        return expressions != null;
      case PascalPackage.VAR___ARRAY:
        return array != null;
      case PascalPackage.VAR___ACCESSOR:
        return accessor != ACCESSOR_EDEFAULT;
      case PascalPackage.VAR___NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PascalPackage.VAR___VARIABLE:
        return variable != null;
      case PascalPackage.VAR___POINTER:
        return pointer != null;
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (accessor: ");
    result.append(accessor);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //var_Impl
