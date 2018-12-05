/**
 * generated by Xtext 2.16.0-SNAPSHOT
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>pascal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.pascal#getProgram <em>Program</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getpascal()
 * @model
 * @generated
 */
public interface pascal extends EObject
{
  /**
   * Returns the value of the '<em><b>Program</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.pascal.pascal.program}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Program</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Program</em>' containment reference list.
   * @see org.xtext.example.pascal.pascal.PascalPackage#getpascal_Program()
   * @model containment="true"
   * @generated
   */
  EList<program> getProgram();

} // pascal
