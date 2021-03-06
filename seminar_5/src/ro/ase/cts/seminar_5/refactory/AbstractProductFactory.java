package ro.ase.cts.seminar_5.refactory;

public abstract class AbstractProductFactory {
	public abstract Product makeProduct()  throws UnsupportedOperationException;
	public abstract String getCatalog();
}
