/**
 */
package universities.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import universities.UniversitiesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassTest extends TestCase {

	/**
	 * The fixture for this Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected universities.Class fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClassTest.class);
	}

	/**
	 * Constructs a new Class test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(universities.Class fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected universities.Class getFixture() {
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
		setFixture(UniversitiesFactory.eINSTANCE.createClass());
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

} //ClassTest
