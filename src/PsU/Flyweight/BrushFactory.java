package PsU.Flyweight;

import java.util.HashMap;

public class BrushFactory {
	
	private static final HashMap <String , Brush> brushMap = new HashMap<>();

	public static Brush getThickBrush(String co) {
		
		String key = co + "-THICK" ;
		Brush b = brushMap.get(key);
		
		if( b!= null) {
			return b;
		}
		else {
			b = new BrushThick();
			b.setColor(co);
			brushMap.put(key, b);
		}
		return b;
	}
	
	public static Brush getThinBrush(String co) {
		
		String key  = co + "- Thin" ;
		Brush b = brushMap.get(key);
		
		if(b != null) {
			return b;
		}
		else {
			b = new BrushThin();
			b.setColor(co);
			brushMap.put(key,b);
		}
		return b;
	}
	
	public static  Brush getMediumBrush(String col) {
		 String key = col + "- Medium";
		 Brush b = brushMap.get(key);
		 
		 if(b != null) {
			 return b;
		 }
		 else {
			 b = new BrushMedium();
			 b.setColor(col);
			 brushMap.put(key,b);			 
		 }
		 return b;
			
	}
	
	
	
	
	
	
	
	
}
