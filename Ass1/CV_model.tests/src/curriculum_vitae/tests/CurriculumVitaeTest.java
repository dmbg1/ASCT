/**
 */
package curriculum_vitae.tests;

import curriculum_vitae.CurriculumVitae;
import curriculum_vitae.Curriculum_vitaeFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Curriculum Vitae</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CurriculumVitaeTest extends TestCase {

	/**
	 * The fixture for this Curriculum Vitae test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurriculumVitae fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CurriculumVitaeTest.class);
	}

	/**
	 * Constructs a new Curriculum Vitae test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurriculumVitaeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Curriculum Vitae test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CurriculumVitae fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Curriculum Vitae test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurriculumVitae getFixture() {
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
		setFixture(Curriculum_vitaeFactory.eINSTANCE.createCurriculumVitae());
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

} //CurriculumVitaeTest
