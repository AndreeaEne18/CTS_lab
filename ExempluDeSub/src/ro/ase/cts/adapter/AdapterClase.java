package ro.ase.cts.adapter;

import ro.ase.cts.factory.ContBancar;

public class AdapterClase implements BanckAccount, ContBancar{
	
	private double total =500;

	@Override
	public void accountTransfer(BanckAccount accoun, double mount) {
		
		this.transfer(this, mount);
	}

	@Override
	public void transfer(ContBancar destinatie, double suma) {
		total  -=suma;
		destinatie.depunere(suma);
		System.out.println(suma + "a fost add in" + destinatie + "cont debit -> AdapterCont");
		
	}

	@Override
	public void depunere(double suma) {
		total+=suma;
		System.out.println(suma+ "de lei au fost adaugati in contul curent - debit");
		
	}

	@Override
	public String toString() {
		return "AdapterClase total= " + total;
	}
	
	

}
