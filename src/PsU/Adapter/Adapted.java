package PsU.Adapter;

public class Adapted extends  Adapter_Cal{
	
	@Override 
	public void op_add_num_by_5(int y ){
		
		int r = y +5;
		System.out.println("After adding 5, the result is : " + r );
		System.out.println("After subtracting 5, the result is : " + r );
	}
	
	@Override 
	public void op_subtract_num_by_5(int y ){
		
		int r = y - 5;
		System.out.println("After subtracting 5, the result is : " + r );
	}
	
	
	public static void main(String[] args) {
		
		Adapted a = new Adapted();
		a.op_add_num_by_5(167);
		
		Adapted b = new Adapted();
		b.op_subtract_num_by_5(167);
 

	}

}
