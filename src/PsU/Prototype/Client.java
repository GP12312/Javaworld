package PsU.Prototype;

public class Client {

	public static void main(String[] args) {			
		
		ColorPalette.getColor("Blackkey").addColor();
		ColorPalette.getColor("Bluekey").addColor(); 
		
		System.out.println( " 1 " + ColorPalette.getColor("Bluekey").hashCode());
		System.out.println( " 2 " + ColorPalette.getColor("Blackkey").hashCode());
		
		ColorPalette.getColor("Blackkey").addColor();
		ColorPalette.getColor("Bluekey").addColor(); 
		System.out.println( " 3 " + ColorPalette.getColor("Bluekey").hashCode());
		System.out.println( " 4 " + ColorPalette.getColor("Blackkey").hashCode());
		
	}
}


/*

In this class the Hashcode value is an indicator of the  object that is created .
In the class ColoePalette in the getColor() method there is a clone() method. 
Due to which a new cloned object is returned and it has a new value - which is the Prototype object 
If that clone method is removed then, the hashcode remains the same for the key . Because the same object 
is retrived from the Hashmap


*/