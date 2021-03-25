package ro.ase.cts.seminar_5.singleton;

public class EagerSchoppingCarExample {
	public static final EagerSchoppingCarExample INSTANCE ; 
	
	static {
		INSTANCE = new EagerSchoppingCarExample();
	}
	
	private EagerSchoppingCarExample() {}
}
