package ro.ase.cts.seminar14;

import java.util.ArrayList;

public class DepartamentSecretariat {

	private static final int MIN_MEDIE_MERIT = 8;
	private static final int MIN_MEDIE_EXCELETNA = 9;
	ArrayList<StudentAbstract> studenti;

	public DepartamentSecretariat(ArrayList<StudentAbstract> studentiabs) {
		super();
		studentiabs = new ArrayList<StudentAbstract>();
	}

	public DepartamentSecretariat() {
		studenti = new ArrayList<StudentAbstract>();

	}

	public static int getMinMedieMerit() {
		return MIN_MEDIE_MERIT;
	}

	public static int getMinMedieExceletna() {
		return MIN_MEDIE_EXCELETNA;
	}

	public ArrayList<StudentAbstract> getStudenti() {
		return studenti;
	}

	public void setStudenti(ArrayList<StudentAbstract> studentiabs) {
		studentiabs = new ArrayList<StudentAbstract>();

	}

	public float calculBursa(int studentIndex) {
		float medieStudent = 0;
		try {
			medieStudent = studenti.get(studentIndex).calculMedie();
		} catch (StudentExcceptionWrongValue e) {
			System.err.println(e.getMessage());
		}
		if (medieStudent > MIN_MEDIE_EXCELETNA) {
			return TipBursaEnum.EXCELENTA.getCuantum();
		} else if (medieStudent >= MIN_MEDIE_MERIT) {
			return TipBursaEnum.MERIT.getCuantum();
		} else {
			return 0;
		}
	}

}
