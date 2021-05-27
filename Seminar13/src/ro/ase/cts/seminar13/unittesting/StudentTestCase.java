package ro.ase.cts.seminar13.unittesting;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ro.ase.cts.seminar13.Student;
import ro.ase.cts.seminar13.excceptions.StudentExcceptionWrongValue;

class StudentTestCase {
	
	/*test fixtures*/
	Student student;
	String defaultName =  "Anonim";
	int defaultVarsta = 18;
	int defaultNote[] = {}; 

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class was called ");
		/*
		 * se apeleaza o data pt toate
		 */
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass Class was called ");
	}

	@BeforeEach
	void setUp() throws Exception {
		student= new Student(defaultName, defaultVarsta, defaultNote);
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tearDown Class was called ");
	}
	/*right/conformance test*/
	@Test
	void testStudentConstructorRight() {
		String studentName = "Andreea";
		int studentAge = 23;
		int grades[]= {7, 8,8, 9};
		
		Student student = new Student(studentName, studentAge, grades);
		if(!student.getNume().equals(studentName)) {
			fail("Name is not equel");
		}
		assertEquals(studentName, student.getNume(),"NAME IS NOT EQUAL");
		assertEquals(studentAge, student.getVarsta(), "Age IS NOT EQUAL");
		assertEquals(grades, student.getNote(), "GRADES IS NOT EQUAL");
	}
	
	@Test
	void testStudentConstructorRightNotNull() {
		int grades[]= {7, 8,8, 9};
		Student student=null;
		try {
		 student = new Student("Ana", 19, grades);
		}catch(Exception e)	{
			fail("Constructorul nu trebuie sa arunce exceptie!");
		}
		assertNotNull(student);
	}
	
	@Test( StudentExcceptionWrongValue.class)
	void testStudentSetVarstaErrorCondition() {
		
		student.setVarsta(-1);
	
	}

}
