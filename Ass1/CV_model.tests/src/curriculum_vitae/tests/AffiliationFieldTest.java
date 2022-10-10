/**
 */
package curriculum_vitae.tests;

import curriculum_vitae.AffiliationField;
import curriculum_vitae.Curriculum_vitaeFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Affiliation Field</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AffiliationFieldTest extends TestCase {

	/**
	 * The fixture for this Affiliation Field test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AffiliationField fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AffiliationFieldTest.class);
	}

	/**
	 * Constructs a new Affiliation Field test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AffiliationFieldTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Affiliation Field test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AffiliationField fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Affiliation Field test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AffiliationField getFixture() {
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
		setFixture(Curriculum_vitaeFactory.eINSTANCE.createAffiliationField());
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

} //AffiliationFieldTest
