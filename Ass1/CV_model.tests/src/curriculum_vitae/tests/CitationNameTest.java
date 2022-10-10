/**
 */
package curriculum_vitae.tests;

import curriculum_vitae.CitationName;
import curriculum_vitae.Curriculum_vitaeFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Citation Name</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CitationNameTest extends TestCase {

	/**
	 * The fixture for this Citation Name test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CitationName fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CitationNameTest.class);
	}

	/**
	 * Constructs a new Citation Name test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitationNameTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Citation Name test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CitationName fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Citation Name test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CitationName getFixture() {
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
		setFixture(Curriculum_vitaeFactory.eINSTANCE.createCitationName());
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

} //CitationNameTest
