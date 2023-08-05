package PsU.Visitor;

public class Client {

	public static void main(String[] args ) {
		
	ItemElement[] items = new ItemElement[] 
			{	
					new Book (340, 20435 ),
					new Book (3400, 234682),
					new Fruit ("Apple",450,2),
					new Fruit ("Banana",125,2),		
			};

	double total = calculatePrice(items);
	System.out.println("------------------------ "); 
	System.out.println("Total Cost	: " + total); 
		
	}
	
	static double  calculatePrice(ItemElement[] ies ) {
		
		double sum =0;
		ShoppinCartVisitor scv = new ShoppinCartImpl(); 
		
		for(ItemElement ie :ies) {
			
			sum = (double) (sum + ie.accept(scv));
		}
		return sum;
		
		
	}
	
  }
	
	
