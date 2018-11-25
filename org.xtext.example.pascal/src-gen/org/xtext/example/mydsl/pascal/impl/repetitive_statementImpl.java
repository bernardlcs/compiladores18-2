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
import org.xtext.example.mydsl.pascal.for_statement;
import org.xtext.example.mydsl.pascal.repetitive_statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>repetitive statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.repetitive_statementImpl#getForStmt <em>For Stmt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class repetitive_statementImpl extends MinimalEObjectImpl.Container implements repetitive_statement
{
  /**
   * The cached value of the '{@link #getForStmt() <em>For Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForStmt()
   * @generated
   * @ordered
   */
  protected for_statement forStmt;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected repetitive_statementImpl()
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
    return PascalPackage.Literals.REPETITIVE_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public for_statement getForStmt()
  {
    return forStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForStmt(for_statement newForStmt, NotificationChain msgs)
  {
    for_statement oldForStmt = forStmt;
    forStmt = newForStmt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.REPETITIVE_STATEMENT__FOR_STMT, oldForStmt, newForStmt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForStmt(for_statement newForStmt)
  {
    if (newForStmt != forStmt)
    {
      NotificationChain msgs = null;
      if (forStmt != null)
        msgs = ((InternalEObject)forStmt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.REPETITIVE_STATEMENT__FOR_STMT, null, msgs);
      if (newForStmt != null)
        msgs = ((InternalEObject)newForStmt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.REPETITIVE_STATEMENT__FOR_STMT, null, msgs);
      msgs = basicSetForStmt(newForStmt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.REPETITIVE_STATEMENT__FOR_STMT, newForStmt, newForStmt));
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
      case PascalPackage.REPETITIVE_STATEMENT__FOR_STMT:
        return basicSetForStmt(null, msgs);
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
      case PascalPackage.REPETITIVE_STATEMENT__FOR_STMT:
        return getForStmt();
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
      case PascalPackage.REPETITIVE_STATEMENT__FOR_STMT:
        setForStmt((for_statement)newValue);
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
      case PascalPackage.REPETITIVE_STATEMENT__FOR_STMT:
        setForStmt((for_statement)null);
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
      case PascalPackage.REPETITIVE_STATEMENT__FOR_STMT:
        return forStmt != null;
    }
    return super.eIsSet(featureID);
  }

} //repetitive_statementImpl