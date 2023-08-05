package PsU.Visitor;

public class Book implements ItemElement {
	
	private double price;
	private int ISBNNumber;


	
	public Book(double p, int I) {
		this.price=p;
		this.ISBNNumber=I;		
	}
	

	public double getPrice() {
		return price;
	}
	
	public int getISBNNumber() {
		return ISBNNumber;
	}
	
	
	@Override
	public double accept(ShoppinCartVisitor v2) {
		return v2.visit(this);
	}
}
