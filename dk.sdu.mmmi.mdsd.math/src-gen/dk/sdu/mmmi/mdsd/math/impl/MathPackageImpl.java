/**
 * generated by Xtext 2.33.0
 */
package dk.sdu.mmmi.mdsd.math.impl;

import dk.sdu.mmmi.mdsd.math.Binding;
import dk.sdu.mmmi.mdsd.math.Div;
import dk.sdu.mmmi.mdsd.math.Expression;
import dk.sdu.mmmi.mdsd.math.LetBinding;
import dk.sdu.mmmi.mdsd.math.MathExp;
import dk.sdu.mmmi.mdsd.math.MathFactory;
import dk.sdu.mmmi.mdsd.math.MathNumber;
import dk.sdu.mmmi.mdsd.math.MathPackage;
import dk.sdu.mmmi.mdsd.math.Minus;
import dk.sdu.mmmi.mdsd.math.Mult;
import dk.sdu.mmmi.mdsd.math.Plus;
import dk.sdu.mmmi.mdsd.math.VarBinding;
import dk.sdu.mmmi.mdsd.math.VariableUse;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MathPackageImpl extends EPackageImpl implements MathPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mathExpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass varBindingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass letBindingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bindingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableUseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass plusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass minusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass divEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mathNumberEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see dk.sdu.mmmi.mdsd.math.MathPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MathPackageImpl()
  {
    super(eNS_URI, MathFactory.eINSTANCE);
  }
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link MathPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MathPackage init()
  {
    if (isInited) return (MathPackage)EPackage.Registry.INSTANCE.getEPackage(MathPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredMathPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    MathPackageImpl theMathPackage = registeredMathPackage instanceof MathPackageImpl ? (MathPackageImpl)registeredMathPackage : new MathPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theMathPackage.createPackageContents();

    // Initialize created meta-data
    theMathPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMathPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MathPackage.eNS_URI, theMathPackage);
    return theMathPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMathExp()
  {
    return mathExpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMathExp_Variables()
  {
    return (EReference)mathExpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getVarBinding()
  {
    return varBindingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getVarBinding_Expression()
  {
    return (EReference)varBindingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLetBinding()
  {
    return letBindingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLetBinding_Binding()
  {
    return (EReference)letBindingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLetBinding_Body()
  {
    return (EReference)letBindingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getBinding()
  {
    return bindingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getBinding_Name()
  {
    return (EAttribute)bindingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getVariableUse()
  {
    return variableUseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getVariableUse_Ref()
  {
    return (EReference)variableUseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPlus()
  {
    return plusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPlus_Left()
  {
    return (EReference)plusEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPlus_Right()
  {
    return (EReference)plusEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMinus()
  {
    return minusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMinus_Left()
  {
    return (EReference)minusEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMinus_Right()
  {
    return (EReference)minusEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMult()
  {
    return multEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMult_Left()
  {
    return (EReference)multEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMult_Right()
  {
    return (EReference)multEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDiv()
  {
    return divEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDiv_Left()
  {
    return (EReference)divEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDiv_Right()
  {
    return (EReference)divEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMathNumber()
  {
    return mathNumberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMathNumber_Value()
  {
    return (EAttribute)mathNumberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MathFactory getMathFactory()
  {
    return (MathFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    mathExpEClass = createEClass(MATH_EXP);
    createEReference(mathExpEClass, MATH_EXP__VARIABLES);

    varBindingEClass = createEClass(VAR_BINDING);
    createEReference(varBindingEClass, VAR_BINDING__EXPRESSION);

    expressionEClass = createEClass(EXPRESSION);

    letBindingEClass = createEClass(LET_BINDING);
    createEReference(letBindingEClass, LET_BINDING__BINDING);
    createEReference(letBindingEClass, LET_BINDING__BODY);

    bindingEClass = createEClass(BINDING);
    createEAttribute(bindingEClass, BINDING__NAME);

    variableUseEClass = createEClass(VARIABLE_USE);
    createEReference(variableUseEClass, VARIABLE_USE__REF);

    plusEClass = createEClass(PLUS);
    createEReference(plusEClass, PLUS__LEFT);
    createEReference(plusEClass, PLUS__RIGHT);

    minusEClass = createEClass(MINUS);
    createEReference(minusEClass, MINUS__LEFT);
    createEReference(minusEClass, MINUS__RIGHT);

    multEClass = createEClass(MULT);
    createEReference(multEClass, MULT__LEFT);
    createEReference(multEClass, MULT__RIGHT);

    divEClass = createEClass(DIV);
    createEReference(divEClass, DIV__LEFT);
    createEReference(divEClass, DIV__RIGHT);

    mathNumberEClass = createEClass(MATH_NUMBER);
    createEAttribute(mathNumberEClass, MATH_NUMBER__VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    varBindingEClass.getESuperTypes().add(this.getBinding());
    letBindingEClass.getESuperTypes().add(this.getExpression());
    letBindingEClass.getESuperTypes().add(this.getBinding());
    variableUseEClass.getESuperTypes().add(this.getExpression());
    plusEClass.getESuperTypes().add(this.getExpression());
    minusEClass.getESuperTypes().add(this.getExpression());
    multEClass.getESuperTypes().add(this.getExpression());
    divEClass.getESuperTypes().add(this.getExpression());
    mathNumberEClass.getESuperTypes().add(this.getExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(mathExpEClass, MathExp.class, "MathExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMathExp_Variables(), this.getVarBinding(), null, "variables", null, 0, -1, MathExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(varBindingEClass, VarBinding.class, "VarBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVarBinding_Expression(), this.getExpression(), null, "expression", null, 0, 1, VarBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(letBindingEClass, LetBinding.class, "LetBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLetBinding_Binding(), this.getExpression(), null, "binding", null, 0, 1, LetBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLetBinding_Body(), this.getExpression(), null, "body", null, 0, 1, LetBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bindingEClass, Binding.class, "Binding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBinding_Name(), ecorePackage.getEString(), "name", null, 0, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableUseEClass, VariableUse.class, "VariableUse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariableUse_Ref(), this.getBinding(), null, "ref", null, 0, 1, VariableUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(plusEClass, Plus.class, "Plus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPlus_Left(), this.getExpression(), null, "left", null, 0, 1, Plus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPlus_Right(), this.getExpression(), null, "right", null, 0, 1, Plus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(minusEClass, Minus.class, "Minus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMinus_Left(), this.getExpression(), null, "left", null, 0, 1, Minus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMinus_Right(), this.getExpression(), null, "right", null, 0, 1, Minus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multEClass, Mult.class, "Mult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMult_Left(), this.getExpression(), null, "left", null, 0, 1, Mult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMult_Right(), this.getExpression(), null, "right", null, 0, 1, Mult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(divEClass, Div.class, "Div", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDiv_Left(), this.getExpression(), null, "left", null, 0, 1, Div.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDiv_Right(), this.getExpression(), null, "right", null, 0, 1, Div.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mathNumberEClass, MathNumber.class, "MathNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMathNumber_Value(), ecorePackage.getEInt(), "value", null, 0, 1, MathNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //MathPackageImpl
