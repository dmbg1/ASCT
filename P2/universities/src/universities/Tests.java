package universities;

import static org.junit.Assert.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.junit.Test;

public class Tests {

	@Test
	public void test1() {
		University university = UniversitiesFactory.eINSTANCE.createUniversity();
		EStructuralFeature universityName = university.eClass().getEStructuralFeature("name");
		
		university.eSet(universityName, "Universidade do Porto");
		
		assertTrue(university.eGet(universityName) == "Universidade do Porto");
	}
	
	@Test
	public void test2() {
		University university = UniversitiesFactory.eINSTANCE.createUniversity();
		EStructuralFeature universityName = university.eClass().getEStructuralFeature("name");
		EStructuralFeature universityFaculties = university.eClass().getEStructuralFeature("faculties");		
		university.eSet(universityName, "Universidade do Porto");
		
		assertTrue(university.eGet(universityName) == "Universidade do Porto");
		
		Faculty feup = UniversitiesFactory.eINSTANCE.createFaculty();
		Faculty fcup = UniversitiesFactory.eINSTANCE.createFaculty();
		
		EList<Faculty> univFacList = (EList<Faculty>) university.eGet(universityFaculties);
		univFacList.add(feup);
		
		assertTrue(university.getFaculties().contains(feup));
		assertFalse(university.getFaculties().contains(fcup));
	}

}