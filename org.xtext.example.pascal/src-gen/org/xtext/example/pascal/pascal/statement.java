/**
 * generated by Xtext 2.16.0-SNAPSHOT
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.statement#getLabel <em>Label</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.statement#getSimple <em>Simple</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.statement#getStructured <em>Structured</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getstatement()
 * @model
 * @generated
 */
public interface statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' containment reference.
   * @see #setLabel(label)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getstatement_Label()
   * @model containment="true"
   * @generated
   */
  label getLabel();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.statement#getLabel <em>Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' containment reference.
   * @see #getLabel()
   * @generated
   */
  void setLabel(label value);

  /**
   * Returns the value of the '<em><b>Simple</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simple</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simple</em>' containment reference.
   * @see #setSimple(simple_statement)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getstatement_Simple()
   * @model containment="true"
   * @generated
   */
  simple_statement getSimple();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.statement#getSimple <em>Simple</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simple</em>' containment reference.
   * @see #getSimple()
   * @generated
   */
  void setSimple(simple_statement value);

  /**
   * Returns the value of the '<em><b>Structured</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Structured</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Structured</em>' containment reference.
   * @see #setStructured(structured_statement)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getstatement_Structured()
   * @model containment="true"
   * @generated
   */
  structured_statement getStructured();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.statement#getStructured <em>Structured</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Structured</em>' containment reference.
   * @see #getStructured()
   * @generated
   */
  void setStructured(structured_statement value);

} // statement
