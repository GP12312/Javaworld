package PsU.Visitor;

public interface ShoppinCartVisitor {
	
		double visit(Book b);
		int visit(Fruit f);

}
