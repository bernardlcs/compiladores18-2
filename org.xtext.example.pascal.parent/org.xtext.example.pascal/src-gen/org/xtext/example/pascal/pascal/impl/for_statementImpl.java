/**
 * generated by Xtext 2.16.0-SNAPSHOT
 */
package org.xtext.example.pascal.pascal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.pascal.pascal.PascalPackage;
import org.xtext.example.pascal.pascal.assignment_statement;
import org.xtext.example.pascal.pascal.expression;
import org.xtext.example.pascal.pascal.for_statement;
import org.xtext.example.pascal.pascal.statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>for statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.for_statementImpl#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.for_statementImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.impl.for_statementImpl#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class for_statementImpl extends MinimalEObjectImpl.Container implements for_statement
{
  /**
   * The cached value of the '{@link #getAssignment() <em>Assignment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignment()
   * @generated
   * @ordered
   */
  protected assignment_statement assignment;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected expression expression;

  /**
   * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatement()
   * @generated
   * @ordered
   */
  protected statement statement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected for_statementImpl()
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
    return PascalPackage.Literals.FOR_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public assignment_statement getAssignment()
  {
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssignment(assignment_statement newAssignment, NotificationChain msgs)
  {
    assignment_statement oldAssignment = assignment;
    assignment = newAssignment;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FOR_STATEMENT__ASSIGNMENT, oldAssignment, newAssignment);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssignment(assignment_statement newAssignment)
  {
    if (newAssignment != assignment)
    {
      NotificationChain msgs = null;
      if (assignment != null)
        msgs = ((InternalEObject)assignment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FOR_STATEMENT__ASSIGNMENT, null, msgs);
      if (newAssignment != null)
        msgs = ((InternalEObject)newAssignment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FOR_STATEMENT__ASSIGNMENT, null, msgs);
      msgs = basicSetAssignment(newAssignment, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FOR_STATEMENT__ASSIGNMENT, newAssignment, newAssignment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(expression newExpression, NotificationChain msgs)
  {
    expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FOR_STATEMENT__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FOR_STATEMENT__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FOR_STATEMENT__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FOR_STATEMENT__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement getStatement()
  {
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatement(statement newStatement, NotificationChain msgs)
  {
    statement oldStatement = statement;
    statement = newStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FOR_STATEMENT__STATEMENT, oldStatement, newStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatement(statement newStatement)
  {
    if (newStatement != statement)
    {
      NotificationChain msgs = null;
      if (statement != null)
        msgs = ((InternalEObject)statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FOR_STATEMENT__STATEMENT, null, msgs);
      if (newStatement != null)
        msgs = ((InternalEObject)newStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FOR_STATEMENT__STATEMENT, null, msgs);
      msgs = basicSetStatement(newStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FOR_STATEMENT__STATEMENT, newStatement, newStatement));
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
      case PascalPackage.FOR_STATEMENT__ASSIGNMENT:
        return basicSetAssignment(null, msgs);
      case PascalPackage.FOR_STATEMENT__EXPRESSION:
        return basicSetExpression(null, msgs);
      case PascalPackage.FOR_STATEMENT__STATEMENT:
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
      case PascalPackage.FOR_STATEMENT__ASSIGNMENT:
        return getAssignment();
      case PascalPackage.FOR_STATEMENT__EXPRESSION:
        return getExpression();
      case PascalPackage.FOR_STATEMENT__STATEMENT:
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
      case PascalPackage.FOR_STATEMENT__ASSIGNMENT:
        setAssignment((assignment_statement)newValue);
        return;
      case PascalPackage.FOR_STATEMENT__EXPRESSION:
        setExpression((expression)newValue);
        return;
      case PascalPackage.FOR_STATEMENT__STATEMENT:
        setStatement((statement)newValue);
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
      case PascalPackage.FOR_STATEMENT__ASSIGNMENT:
        setAssignment((assignment_statement)null);
        return;
      case PascalPackage.FOR_STATEMENT__EXPRESSION:
        setExpression((expression)null);
        return;
      case PascalPackage.FOR_STATEMENT__STATEMENT:
        setStatement((statement)null);
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
      case PascalPackage.FOR_STATEMENT__ASSIGNMENT:
        return assignment != null;
      case PascalPackage.FOR_STATEMENT__EXPRESSION:
        return expression != null;
      case PascalPackage.FOR_STATEMENT__STATEMENT:
        return statement != null;
    }
    return super.eIsSet(featureID);
  }

} //for_statementImpl
