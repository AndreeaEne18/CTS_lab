package ro.ase.cts.seminar14.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ro.ase.cts.seminar14.DepartamentSecretariat;
import ro.ase.cts.seminar14.Student;
import ro.ase.cts.seminar14.StudentAbstract;
import ro.ase.cts.seminar14.StudentExcceptionWrongValue;
import ro.ase.cts.seminar14.TipBursaEnum;

class TestSecretariatCase {
	
	/*test fixtures*/
	DepartamentSecretariat secretariat;
	static final ArrayList<Student> DEFAULT_STUDENTS;
	
	static {
		DEFAULT_STUDENTS= new ArrayList<Student>();
	}

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		int defaultNote[] = { 7,8,9};
		int defaultNote2[] = { 8,9,10};
		DEFAULT_STUDENTS.add(new Student("Anonim", 100, defaultNote)); 
		DEFAULT_STUDENTS.add(new Student("Anonim", 100, defaultNote2)); 
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		secretariat= new DepartamentSecretariat();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	/*cardinality 1-right - referance test*/
	@Test
	void testCalculBursaStub() {
		/* stub clasa anonima*/
		StudentAbstract defaultStudent = new StudentAbstract() {
			
			@Override
			public float calculMedie() throws StudentExcceptionWrongValue {
				return 8;
			}
		};
		
		ArrayList<StudentAbstract> listStudent = new ArrayList<StudentAbstract>();
		listStudent.add(defaultStudent);
		secretariat.setStudenti(listStudent);
		
		float bursa= secretariat.calculBursa(0);
		assertEquals(TipBursaEnum.MERIT.getCuantum(), bursa, "cuantumul nu este corect!"); 
	}
	
	@Test
	void testCalculBursaStubCuCLasaConcreta() {
		/* stub clasa concreta*/
		StudentStub defaultStudent = new StudentStub();
		defaultStudent.setCalculMedieReturnValue(9);
		
		defaultStudent.setExceptionCase(true);
		
		ArrayList<StudentAbstract> listStudent = new ArrayList<StudentAbstract>();
		listStudent.add(defaultStudent);
		secretariat.setStudenti(listStudent);
		
		float bursa= secretariat.calculBursa(0);
		assertEquals(TipBursaEnum.EXCELENTA.getCuantum(), bursa, "cuantumul nu este corect!"); 
	}
}
