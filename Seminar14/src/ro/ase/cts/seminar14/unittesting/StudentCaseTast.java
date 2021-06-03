package ro.ase.cts.seminar14.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import ro.ase.cts.seminar14.Student;
import ro.ase.cts.seminar14.StudentExcceptionWrongValue;

class StudentCaseTast {

	/* test fixtures */
	static Student student;
	static String DEFAULT_NAME = "Anonim";
	static int DEFAULT_VARSTA = 18;
	static int DEFAULT_NOATE[] = {};
	static int NR_NOTE_DEFAULT = 3;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		DEFAULT_NOATE = new int[NR_NOTE_DEFAULT];
		DEFAULT_NOATE[0] = 9;
		DEFAULT_NOATE[1] = 9;
		DEFAULT_NOATE[2] = 10;
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		student = new Student(DEFAULT_NAME, DEFAULT_VARSTA, DEFAULT_NOATE);

	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalculMedie() throws StudentExcceptionWrongValue {
		// specific testului de ordonance este faptul ca inputul este
		// dat intr-o anumita ordine
		int note[] = { 8, 6, 7, 7 };
		student.setNote(note);
		float medie = student.calculMedie();
		float expectedValue = 7;
		assertEquals(expectedValue, medie, "Media nu corespunde");

	}
	@Tag("")
	// cardinality test - zero elemente
	@Test
	void testCalculMedieCardinalityZero() {
		// imp pt testul de cardinalitate este faptul ca nu avem note in vector
		int note[] = new int[3];
		try {
			student.setNote(note);
		} catch (StudentExcceptionWrongValue e) {
			fail("Exceptie generata de setNote");
		}

		assertThrows(StudentExcceptionWrongValue.class, () -> {
			student.calculMedie();
		});
	}
	@Tag("importante")
	// cardinality test - 1 element
	@Test
	void testCalculMedieCardinalityOne() {
		// imp pt testul de cardinalitate este faptul ca nu avem note in vector
		int note[] = new int[1];
		note[0] = 9;
		try {
			student.setNote(note);
		} catch (StudentExcceptionWrongValue e) {
			fail("Exceptie generata de setNote");
		}

		assertThrows(StudentExcceptionWrongValue.class, () -> {
			student.calculMedie();
		});
	}

}
