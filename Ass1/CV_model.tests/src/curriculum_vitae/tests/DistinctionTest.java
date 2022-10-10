/**
 */
package curriculum_vitae.tests;

import curriculum_vitae.Curriculum_vitaeFactory;
import curriculum_vitae.Distinction;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Distinction</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DistinctionTest extends TestCase {

	/**
	 * The fixture for this Distinction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Distinction fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DistinctionTest.class);
	}

	/**
	 * Constructs a new Distinction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistinctionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Distinction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Distinction fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Distinction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Distinction getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Curriculum_vitaeFactory.eINSTANCE.createDistinction());
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

} //DistinctionTest
