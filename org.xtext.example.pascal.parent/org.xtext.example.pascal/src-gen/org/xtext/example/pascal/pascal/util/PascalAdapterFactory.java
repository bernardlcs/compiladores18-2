/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.pascal.pascal.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.example.pascal.pascal.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.pascal.pascal.PascalPackage
 * @generated
 */
public class PascalAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PascalPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PascalAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PascalPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PascalSwitch<Adapter> modelSwitch =
    new PascalSwitch<Adapter>()
    {
      @Override
      public Adapter casepascal(pascal object)
      {
        return createpascalAdapter();
      }
      @Override
      public Adapter caseprogram(program object)
      {
        return createprogramAdapter();
      }
      @Override
      public Adapter caseprogram_heading_block(program_heading_block object)
      {
        return createprogram_heading_blockAdapter();
      }
      @Override
      public Adapter caseidentifier_list(identifier_list object)
      {
        return createidentifier_listAdapter();
      }
      @Override
      public Adapter caseblock(block object)
      {
        return createblockAdapter();
      }
      @Override
      public Adapter casevariable_declaration_part(variable_declaration_part object)
      {
        return createvariable_declaration_partAdapter();
      }
      @Override
      public Adapter casevariable_section(variable_section object)
      {
        return createvariable_sectionAdapter();
      }
      @Override
      public Adapter casevariable_identifier_list(variable_identifier_list object)
      {
        return createvariable_identifier_listAdapter();
      }
      @Override
      public Adapter casetype_definition_part(type_definition_part object)
      {
        return createtype_definition_partAdapter();
      }
      @Override
      public Adapter casetype_definition(type_definition object)
      {
        return createtype_definitionAdapter();
      }
      @Override
      public Adapter caseconstant_definition_part(constant_definition_part object)
      {
        return createconstant_definition_partAdapter();
      }
      @Override
      public Adapter caseconstant_definition(constant_definition object)
      {
        return createconstant_definitionAdapter();
      }
      @Override
      public Adapter caselabel_declaration_part(label_declaration_part object)
      {
        return createlabel_declaration_partAdapter();
      }
      @Override
      public Adapter caseterm(term object)
      {
        return createtermAdapter();
      }
      @Override
      public Adapter casefactor(factor object)
      {
        return createfactorAdapter();
      }
      @Override
      public Adapter casefunction_designator(function_designator object)
      {
        return createfunction_designatorAdapter();
      }
      @Override
      public Adapter casestatement_part(statement_part object)
      {
        return createstatement_partAdapter();
      }
      @Override
      public Adapter casestatement_sequence(statement_sequence object)
      {
        return createstatement_sequenceAdapter();
      }
      @Override
      public Adapter casestatement(statement object)
      {
        return createstatementAdapter();
      }
      @Override
      public Adapter caselabel(label object)
      {
        return createlabelAdapter();
      }
      @Override
      public Adapter casestructured_statement(structured_statement object)
      {
        return createstructured_statementAdapter();
      }
      @Override
      public Adapter caseassignment_statement(assignment_statement object)
      {
        return createassignment_statementAdapter();
      }
      @Override
      public Adapter caseexpression(expression object)
      {
        return createexpressionAdapter();
      }
      @Override
      public Adapter casesimple_expression(simple_expression object)
      {
        return createsimple_expressionAdapter();
      }
      @Override
      public Adapter caseunsigned_number(unsigned_number object)
      {
        return createunsigned_numberAdapter();
      }
      @Override
      public Adapter casevariable(variable object)
      {
        return createvariableAdapter();
      }
      @Override
      public Adapter casevar_(var_ object)
      {
        return createvar_Adapter();
      }
      @Override
      public Adapter casesimple_statement(simple_statement object)
      {
        return createsimple_statementAdapter();
      }
      @Override
      public Adapter caseset(set object)
      {
        return createsetAdapter();
      }
      @Override
      public Adapter caseexpression_list(expression_list object)
      {
        return createexpression_listAdapter();
      }
      @Override
      public Adapter caseset_type(set_type object)
      {
        return createset_typeAdapter();
      }
      @Override
      public Adapter casetype(type object)
      {
        return createtypeAdapter();
      }
      @Override
      public Adapter casesimple_type(simple_type object)
      {
        return createsimple_typeAdapter();
      }
      @Override
      public Adapter casesubrange_type(subrange_type object)
      {
        return createsubrange_typeAdapter();
      }
      @Override
      public Adapter caseenumerated_type(enumerated_type object)
      {
        return createenumerated_typeAdapter();
      }
      @Override
      public Adapter caseconstant(constant object)
      {
        return createconstantAdapter();
      }
      @Override
      public Adapter casenumber(number object)
      {
        return createnumberAdapter();
      }
      @Override
      public Adapter caseany_number(any_number object)
      {
        return createany_numberAdapter();
      }
      @Override
      public Adapter casesigned_number(signed_number object)
      {
        return createsigned_numberAdapter();
      }
      @Override
      public Adapter casefor_statement(for_statement object)
      {
        return createfor_statementAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.pascal <em>pascal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.pascal
   * @generated
   */
  public Adapter createpascalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.program <em>program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.program
   * @generated
   */
  public Adapter createprogramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.program_heading_block <em>program heading block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.program_heading_block
   * @generated
   */
  public Adapter createprogram_heading_blockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.identifier_list <em>identifier list</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.identifier_list
   * @generated
   */
  public Adapter createidentifier_listAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.block <em>block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.block
   * @generated
   */
  public Adapter createblockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.variable_declaration_part <em>variable declaration part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.variable_declaration_part
   * @generated
   */
  public Adapter createvariable_declaration_partAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.variable_section <em>variable section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.variable_section
   * @generated
   */
  public Adapter createvariable_sectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.variable_identifier_list <em>variable identifier list</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.variable_identifier_list
   * @generated
   */
  public Adapter createvariable_identifier_listAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.type_definition_part <em>type definition part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.type_definition_part
   * @generated
   */
  public Adapter createtype_definition_partAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.type_definition <em>type definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.type_definition
   * @generated
   */
  public Adapter createtype_definitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.constant_definition_part <em>constant definition part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.constant_definition_part
   * @generated
   */
  public Adapter createconstant_definition_partAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.constant_definition <em>constant definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.constant_definition
   * @generated
   */
  public Adapter createconstant_definitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.label_declaration_part <em>label declaration part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.label_declaration_part
   * @generated
   */
  public Adapter createlabel_declaration_partAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.term <em>term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.term
   * @generated
   */
  public Adapter createtermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.factor <em>factor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.factor
   * @generated
   */
  public Adapter createfactorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.function_designator <em>function designator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.function_designator
   * @generated
   */
  public Adapter createfunction_designatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.statement_part <em>statement part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.statement_part
   * @generated
   */
  public Adapter createstatement_partAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.statement_sequence <em>statement sequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.statement_sequence
   * @generated
   */
  public Adapter createstatement_sequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.statement <em>statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.statement
   * @generated
   */
  public Adapter createstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.label <em>label</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.label
   * @generated
   */
  public Adapter createlabelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.structured_statement <em>structured statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.structured_statement
   * @generated
   */
  public Adapter createstructured_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.assignment_statement <em>assignment statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.assignment_statement
   * @generated
   */
  public Adapter createassignment_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.expression <em>expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.expression
   * @generated
   */
  public Adapter createexpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.simple_expression <em>simple expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.simple_expression
   * @generated
   */
  public Adapter createsimple_expressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.unsigned_number <em>unsigned number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.unsigned_number
   * @generated
   */
  public Adapter createunsigned_numberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.variable <em>variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.variable
   * @generated
   */
  public Adapter createvariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.var_ <em>var </em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.var_
   * @generated
   */
  public Adapter createvar_Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.simple_statement <em>simple statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.simple_statement
   * @generated
   */
  public Adapter createsimple_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.set <em>set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.set
   * @generated
   */
  public Adapter createsetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.expression_list <em>expression list</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.expression_list
   * @generated
   */
  public Adapter createexpression_listAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.set_type <em>set type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.set_type
   * @generated
   */
  public Adapter createset_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.type <em>type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.type
   * @generated
   */
  public Adapter createtypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.simple_type <em>simple type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.simple_type
   * @generated
   */
  public Adapter createsimple_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.subrange_type <em>subrange type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.subrange_type
   * @generated
   */
  public Adapter createsubrange_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.enumerated_type <em>enumerated type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.enumerated_type
   * @generated
   */
  public Adapter createenumerated_typeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.constant <em>constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.constant
   * @generated
   */
  public Adapter createconstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.number <em>number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.number
   * @generated
   */
  public Adapter createnumberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.any_number <em>any number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.any_number
   * @generated
   */
  public Adapter createany_numberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.signed_number <em>signed number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.signed_number
   * @generated
   */
  public Adapter createsigned_numberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.pascal.pascal.for_statement <em>for statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.pascal.pascal.for_statement
   * @generated
   */
  public Adapter createfor_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //PascalAdapterFactory
