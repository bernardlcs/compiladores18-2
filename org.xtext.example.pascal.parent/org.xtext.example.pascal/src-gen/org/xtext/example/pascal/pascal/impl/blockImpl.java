/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.pascal.pascal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.pascal.pascal.PascalPackage;
import org.xtext.example.pascal.pascal.block;
import org.xtext.example.pascal.pascal.constant_definition_part;
import org.xtext.example.pascal.pascal.label_declaration_part;
import org.xtext.example.pascal.pascal.statement_part;
import org.xtext.example.pascal.pascal.type_definition_part;
import org.xtext.example.pascal.pascal.variable_declaration_part;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.blockImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.blockImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.blockImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.blockImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.blockImpl#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class blockImpl extends MinimalEObjectImpl.Container implements block
{
  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected label_declaration_part label;

  /**
   * The cached value of the '{@link #getConstant() <em>Constant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstant()
   * @generated
   * @ordered
   */
  protected constant_definition_part constant;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected type_definition_part type;

  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected variable_declaration_part variable;

  /**
   * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatement()
   * @generated
   * @ordered
   */
  protected statement_part statement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected blockImpl()
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
    return PascalPackage.Literals.BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public label_declaration_part getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLabel(label_declaration_part newLabel, NotificationChain msgs)
  {
    label_declaration_part oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.BLOCK__LABEL, oldLabel, newLabel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(label_declaration_part newLabel)
  {
    if (newLabel != label)
    {
      NotificationChain msgs = null;
      if (label != null)
        msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.BLOCK__LABEL, null, msgs);
      if (newLabel != null)
        msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.BLOCK__LABEL, null, msgs);
      msgs = basicSetLabel(newLabel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.BLOCK__LABEL, newLabel, newLabel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constant_definition_part getConstant()
  {
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstant(constant_definition_part newConstant, NotificationChain msgs)
  {
    constant_definition_part oldConstant = constant;
    constant = newConstant;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.BLOCK__CONSTANT, oldConstant, newConstant);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstant(constant_definition_part newConstant)
  {
    if (newConstant != constant)
    {
      NotificationChain msgs = null;
      if (constant != null)
        msgs = ((InternalEObject)constant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.BLOCK__CONSTANT, null, msgs);
      if (newConstant != null)
        msgs = ((InternalEObject)newConstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.BLOCK__CONSTANT, null, msgs);
      msgs = basicSetConstant(newConstant, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.BLOCK__CONSTANT, newConstant, newConstant));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_definition_part getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(type_definition_part newType, NotificationChain msgs)
  {
    type_definition_part oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.BLOCK__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(type_definition_part newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.BLOCK__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.BLOCK__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.BLOCK__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variable_declaration_part getVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariable(variable_declaration_part newVariable, NotificationChain msgs)
  {
    variable_declaration_part oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.BLOCK__VARIABLE, oldVariable, newVariable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(variable_declaration_part newVariable)
  {
    if (newVariable != variable)
    {
      NotificationChain msgs = null;
      if (variable != null)
        msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.BLOCK__VARIABLE, null, msgs);
      if (newVariable != null)
        msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.BLOCK__VARIABLE, null, msgs);
      msgs = basicSetVariable(newVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.BLOCK__VARIABLE, newVariable, newVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement_part getStatement()
  {
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatement(statement_part newStatement, NotificationChain msgs)
  {
    statement_part oldStatement = statement;
    statement = newStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.BLOCK__STATEMENT, oldStatement, newStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatement(statement_part newStatement)
  {
    if (newStatement != statement)
    {
      NotificationChain msgs = null;
      if (statement != null)
        msgs = ((InternalEObject)statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.BLOCK__STATEMENT, null, msgs);
      if (newStatement != null)
        msgs = ((InternalEObject)newStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.BLOCK__STATEMENT, null, msgs);
      msgs = basicSetStatement(newStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.BLOCK__STATEMENT, newStatement, newStatement));
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
      case PascalPackage.BLOCK__LABEL:
        return basicSetLabel(null, msgs);
      case PascalPackage.BLOCK__CONSTANT:
        return basicSetConstant(null, msgs);
      case PascalPackage.BLOCK__TYPE:
        return basicSetType(null, msgs);
      case PascalPackage.BLOCK__VARIABLE:
        return basicSetVariable(null, msgs);
      case PascalPackage.BLOCK__STATEMENT:
        return basicSetStatement(null, msgs);
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
      case PascalPackage.BLOCK__LABEL:
        return getLabel();
      case PascalPackage.BLOCK__CONSTANT:
        return getConstant();
      case PascalPackage.BLOCK__TYPE:
        return getType();
      case PascalPackage.BLOCK__VARIABLE:
        return getVariable();
      case PascalPackage.BLOCK__STATEMENT:
        return getStatement();
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
      case PascalPackage.BLOCK__LABEL:
        setLabel((label_declaration_part)newValue);
        return;
      case PascalPackage.BLOCK__CONSTANT:
        setConstant((constant_definition_part)newValue);
        return;
      case PascalPackage.BLOCK__TYPE:
        setType((type_definition_part)newValue);
        return;
      case PascalPackage.BLOCK__VARIABLE:
        setVariable((variable_declaration_part)newValue);
        return;
      case PascalPackage.BLOCK__STATEMENT:
        setStatement((statement_part)newValue);
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
      case PascalPackage.BLOCK__LABEL:
        setLabel((label_declaration_part)null);
        return;
      case PascalPackage.BLOCK__CONSTANT:
        setConstant((constant_definition_part)null);
        return;
      case PascalPackage.BLOCK__TYPE:
        setType((type_definition_part)null);
        return;
      case PascalPackage.BLOCK__VARIABLE:
        setVariable((variable_declaration_part)null);
        return;
      case PascalPackage.BLOCK__STATEMENT:
        setStatement((statement_part)null);
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
      case PascalPackage.BLOCK__LABEL:
        return label != null;
      case PascalPackage.BLOCK__CONSTANT:
        return constant != null;
      case PascalPackage.BLOCK__TYPE:
        return type != null;
      case PascalPackage.BLOCK__VARIABLE:
        return variable != null;
      case PascalPackage.BLOCK__STATEMENT:
        return statement != null;
    }
    return super.eIsSet(featureID);
  }

} //blockImpl
