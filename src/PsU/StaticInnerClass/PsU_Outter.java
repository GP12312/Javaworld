package PsU.StaticInnerClass;

public class PsU_Outter {
	
	
	static int x = 20;
	
	public static void display() {
		System.out.println(" Value of x; located in the outter class is   " + x );
	}
	
	
	// This is the inner class .  Because the top level classes can neve4r be made static . 
	//So if need be use the static property for the inner class
	static class PsU_Inner{
		
		static int y = 56;
		
		PsU_Inner(){
			System.out.println(" Inside the inner calss");
			System.out.println(" Value of x called from the inner calss = " + x + "<>local inner y is <>" +y);
		}
	}
	

	public static void main(String[] args) {
		System.out.println(" Starting Inner class");
		System.out.println(x);
		display();
		
		// To display  ( access ) from the inner class
		PsU_Outter.PsU_Inner did = new PsU_Outter.PsU_Inner();
		System.out.println(PsU_Outter.PsU_Inner.y);
		

	}

}
