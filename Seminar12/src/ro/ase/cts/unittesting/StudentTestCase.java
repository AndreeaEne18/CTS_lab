package ro.ase.cts.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentTestCase {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class was called ");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass Class was called ");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("setUp Class was called ");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tearDown Class was called ");
	}

	@Test
	void testStudentConstructorRight() {
		String studentName = "Andreea";
		int studentAge = 23;
		int grades[]= {7, 8,8, 9};
		
		Student student = new Student(studentName, studentAge, grades);
		if(!student.nume.equals(studentName)) {
			fail("Name is not equel");
		}
	assertEquals(studentName, student.nume,"NAME IS NOT EQUAL");
		assertEquals(studentAge, student.varsta, "Age IS NOT EQUAL");
		assertEquals(grades, student.note, "GRADES IS NOT EQUAL");
	}
	
	@Test
	void test2() {
		fail("Not yet implemented - test 2");
	}

}
