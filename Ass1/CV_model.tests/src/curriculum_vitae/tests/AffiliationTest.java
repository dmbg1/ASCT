/**
 */
package curriculum_vitae.tests;

import curriculum_vitae.Affiliation;
import curriculum_vitae.Curriculum_vitaeFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Affiliation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AffiliationTest extends TestCase {

	/**
	 * The fixture for this Affiliation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Affiliation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AffiliationTest.class);
	}

	/**
	 * Constructs a new Affiliation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AffiliationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Affiliation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Affiliation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Affiliation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Affiliation getFixture() {
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
		setFixture(Curriculum_vitaeFactory.eINSTANCE.createAffiliation());
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

} //AffiliationTest
