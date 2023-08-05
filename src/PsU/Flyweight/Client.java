package PsU.Flyweight;

public class Client {

	public static void main(String args[]) {
		
		Brush thickRED1 = BrushFactory.getThickBrush("RED");
		thickRED1.draw("Hello There ! ");
		System.out.println("Hashcode" + thickRED1.hashCode() );
		
		Brush thickRED2 = BrushFactory.getThickBrush("RED");
		thickRED2.draw("Hello There ! ");
		System.out.println("Hashcode" + thickRED2.hashCode() );
		
		//-----Even if the object reference name is different the ----same object is called -------------
		// If the key stated in the Brush factory is different then a new object is created .
		// This is thepower of Flyweight
		Brush thinGREEN1 = BrushFactory.getThinBrush("GREEN");
		thinGREEN1.draw("Hello There ! ");
		System.out.println("Hascode" + thinGREEN1.hashCode() );
		
		Brush thinGREEN2 = BrushFactory.getThinBrush("GREEN");
		thinGREEN2.draw("Hello There ! ");
		System.out.println("Hashcode" + thinGREEN2.hashCode() );
		
		//----------------------
		
		Brush medBLUE1 = BrushFactory.getMediumBrush("BLUE");
		medBLUE1.draw("Hello There ! ");
		System.out.println("Hascode" + medBLUE1.hashCode() );
		
		Brush medBLUE2 = BrushFactory.getMediumBrush("BLUE");
		medBLUE2.draw("Hello There ! ");
		System.out.println("Hashcode" + medBLUE2.hashCode() );
		
		//----------------------
		
		
	}

}
