/**
 * generated by Xtext 2.16.0-SNAPSHOT
 */
package org.xtext.example.pascal.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.pascal.pascal.program#getHeading <em>Heading</em>}</li>
 *   <li>{@link org.xtext.example.pascal.pascal.program#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.pascal.pascal.PascalPackage#getprogram()
 * @model
 * @generated
 */
public interface program extends EObject
{
  /**
   * Returns the value of the '<em><b>Heading</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Heading</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Heading</em>' containment reference.
   * @see #setHeading(program_heading_block)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getprogram_Heading()
   * @model containment="true"
   * @generated
   */
  program_heading_block getHeading();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.program#getHeading <em>Heading</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Heading</em>' containment reference.
   * @see #getHeading()
   * @generated
   */
  void setHeading(program_heading_block value);

  /**
   * Returns the value of the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' containment reference.
   * @see #setBlock(block)
   * @see org.xtext.example.pascal.pascal.PascalPackage#getprogram_Block()
   * @model containment="true"
   * @generated
   */
  block getBlock();

  /**
   * Sets the value of the '{@link org.xtext.example.pascal.pascal.program#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(block value);

} // program
