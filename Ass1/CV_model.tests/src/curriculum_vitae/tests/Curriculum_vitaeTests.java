/**
 */
package curriculum_vitae.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>curriculum_vitae</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class Curriculum_vitaeTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new Curriculum_vitaeTests("curriculum_vitae Tests");
		suite.addTestSuite(IdiomTest.class);
		suite.addTestSuite(TechnologyTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Curriculum_vitaeTests(String name) {
		super(name);
	}

} //Curriculum_vitaeTests
