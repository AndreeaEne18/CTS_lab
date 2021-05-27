package ro.ase.cts.seminar13.unittesting;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import ro.ase.cts.seminar13.Student;
import ro.ase.cts.seminar13.excceptions.StudentExcceptionWrongValue;

class StudentTestCase {
	
	/*test fixtures*/
	static Student student;
	static String DEFAULT_NAME =  "Anonim";
	static int DEFAULT_VARSTA = 18;
	static int DEFAULT_NOATE[] = {}; 
	static int NR_NOTE_DEFAULT =3;;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		DEFAULT_NOATE = new int[NR_NOTE_DEFAULT];
		DEFAULT_NOATE[0] = 9;
		DEFAULT_NOATE[1] =  9;
		DEFAULT_NOATE[2] = 10;
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
		student= new Student(DEFAULT_NAME, DEFAULT_VARSTA, DEFAULT_NOATE);
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
	/*Error condition
	 * existance*/
	@Test
	void testStudentSetVarstaErrorCondition() {
		assertThrows(StudentExcceptionWrongValue.class, new Executable() {
			
			@Override
			public void execute() throws Throwable {
				student.setVarsta(-1);
				
			}
		});
		
	}

	@Test
	void testStudentGetVarstaRight() {
		int expectedValue = DEFAULT_VARSTA;
		int actualValue = student.getVarsta();
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	void testCalculMedieErrorCondition() {
		try{
			student.setNote(null);
			}
		catch(Exception ex) {
			
		}
		assertThrows(StudentExcceptionWrongValue.class, ()->{
			student.calculMedie();
		});
	}
	
	@Test
	void testCalculMedieRightDouaZecimale() throws StudentExcceptionWrongValue {
		float expectedValue = 9.33f;
		float actualValue = student.calculMedie();
		assertEquals(expectedValue, actualValue);
	}
	
	//boundary check
	@Test
	void testSetNoteBoundaryCondition() {
		int invalidDatasetNote[]= new int[3];
		for(int i=0; i<2; i++) {
			invalidDatasetNote[i]=8;
		}
		invalidDatasetNote[2]=20;
		assertThrows(StudentExcceptionWrongValue.class, ()->{
			student.setNote(invalidDatasetNote);
		});
	}
}
