package PsU.Prototype;

import java.util.HashMap;
import java.util.Map;

public class ColorPalette {

	 private  static  Map<String, Color>  colormapH = new HashMap<String, Color>();
	 
	 static  {		 
		 colormapH.put("Blackkey", new ColorBlue());
		 colormapH.put("Bluekey", new ColorBlack());	 
	 }
	 
	 public static Color getColor(String dwsg) {
		 
		 return (Color) colormapH.get(dwsg).clone();		 
	 }
		 
}
