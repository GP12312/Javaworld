package PsU.Visitor;

public class ShoppinCartImpl implements ShoppinCartVisitor {

	public ShoppinCartImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double visit(Book b) {
		// Apply 5% discount if price is more than 1500;
		
		double  cost =b.getPrice();
		if( cost >1500)
		{
			cost = cost*0.95;
		}		
        System.out.println("ISBNNumber"+b.getISBNNumber() + " cost = "+cost);
		return cost;
	}

	@Override
	public int visit(Fruit f) {
	       int cost = f.getPrice()*f.getWeight();
	        System.out.println(f.getName() + " cost = "+cost);
	        return cost;
	}

}
