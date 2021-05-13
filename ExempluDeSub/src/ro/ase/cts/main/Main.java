package ro.ase.cts.main;

import ro.ase.cts.adapter.AdapterClase;
import ro.ase.cts.adapter.BanckAccount;
import ro.ase.cts.factory.ContBancar;
import ro.ase.cts.single.SingleBanca;

public class Main {

	public static void main(String[] args) {
		SingleBanca singleBacna= SingleBanca.getInstance("BCR", "Centru");
		System.out.println(SingleBanca.nrCurent);
		
		ContBancar bancar = singleBacna.bancar("Credit");
	
		
		ContBancar bancar2 = singleBacna.bancar("Debit");
		System.out.println(SingleBanca.nrCurent);
		

	
		
		ContBancar adapter = new AdapterClase();
		System.out.println(adapter);
		
		BanckAccount account = new AdapterClase();
		adapter.depunere(400);
		
		adapter.transfer(adapter, 344);
		
		adapter.transfer(adapter, 299);
		((BanckAccount)adapter).accountTransfer(account, 200);
		
	
	}

}
