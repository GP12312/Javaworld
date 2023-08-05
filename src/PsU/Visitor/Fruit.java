package PsU.Visitor;

public class Fruit implements ItemElement {
	
	
	private int pricePerKg;
	private int weight;
	private String name ;
	
	

	public Fruit(String s, int i , int w) {
		this.name=s;
		this.pricePerKg=i;
		this.weight=w;
	}
	
	
	public int getPrice() {
		return pricePerKg;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public double accept(ShoppinCartVisitor v1) {
		 return v1.visit(this);
	}

}
