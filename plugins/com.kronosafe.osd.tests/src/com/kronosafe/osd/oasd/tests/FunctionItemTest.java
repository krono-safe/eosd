/**
 * Copyright Krono-Safe S.A. 2018. All rights reserved.
 */
package com.kronosafe.osd.oasd.tests;

import com.kronosafe.osd.core.tests.NamedElementTest;
import com.kronosafe.osd.oasd.FunctionItem;
import com.kronosafe.osd.oasd.oasdFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Function Item</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionItemTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FunctionItemTest.class);
	}

	/**
	 * Constructs a new Function Item test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionItemTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Function Item test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FunctionItem getFixture() {
		return (FunctionItem)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(oasdFactory.eINSTANCE.createFunctionItem());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //FunctionItemTest
