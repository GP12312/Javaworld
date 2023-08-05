package PsU.Flyweight;

public class BrushThin implements Brush {
	
	final BrushSize brushsize = BrushSize.THIN;
	private String color = null;

	@Override
	public void setColor(String s) {
		color = s;
	}

	@Override
	public void draw(String content) {
		System.out.println("Drawing" + content + "in THIN color" + color);
		
	}

}
