package ro.ase.cts.factory;

public class ContCredit implements ContBancar {
	private double total =1000;
	@Override
	public void transfer(ContBancar destinatie, double suma) {
		
		total  -=suma;
		destinatie.depunere(suma);
		System.out.println(suma + "a fost add in" + destinatie + "cont debit");
	}

	@Override
	public void depunere(double suma) {
		total+=suma;
		System.out.println(suma+ "de lei au fost adaugati in contul curent - debit");
		
	}

	@Override
	public String toString() {
		return "ContCredit [total=" + total + "]";
	}

}
