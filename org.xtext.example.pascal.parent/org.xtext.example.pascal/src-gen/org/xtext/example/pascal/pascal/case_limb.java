/**
 * generated by Xtext 2.16.0-SNAPSHOT
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>case limb</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.case_limb#getCases <em>Cases</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.case_limb#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getcase_limb()
 * @model
 * @generated
 */
public interface case_limb extends EObject
{
  /**
   * Returns the value of the '<em><b>Cases</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cases</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cases</em>' containment reference.
   * @see #setCases(case_label_list)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getcase_limb_Cases()
   * @model containment="true"
   * @generated
   */
  case_label_list getCases();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.case_limb#getCases <em>Cases</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cases</em>' containment reference.
   * @see #getCases()
   * @generated
   */
  void setCases(case_label_list value);

  /**
   * Returns the value of the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' containment reference.
   * @see #setStatement(statement)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getcase_limb_Statement()
   * @model containment="true"
   * @generated
   */
  statement getStatement();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.case_limb#getStatement <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' containment reference.
   * @see #getStatement()
   * @generated
   */
  void setStatement(statement value);

} // case_limb
