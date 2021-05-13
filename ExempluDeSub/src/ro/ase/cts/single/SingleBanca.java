package ro.ase.cts.single;

import ro.ase.cts.factory.ContBancar;
import ro.ase.cts.factory.ContCredit;
import ro.ase.cts.factory.ContDebit;

public class SingleBanca {
	
	private String denumire;
	private String adresa;
	public static int nrCurent;
	
	private static SingleBanca INSTANCE;

	public SingleBanca(String denumire, String adresa) {
		super();
		this.denumire = denumire;
		this.adresa = adresa;
	}
	
	public static synchronized SingleBanca getInstance(String name, String adresa) {
		if(INSTANCE==null) {
			 INSTANCE = new SingleBanca(name, adresa);
			
		}
		 return INSTANCE;
	}
	
	public ContBancar bancar(String tipCont) {
		ContBancar cont;
		switch(tipCont) {
		case "CREDIT":
			cont =new  ContCredit();
			nrCurent++;
			break;
			
		case "Debit":
			cont= new ContDebit();
			nrCurent++;
			
		default:
			cont= null;
			break;
		}
		return cont;
	}
	
}
