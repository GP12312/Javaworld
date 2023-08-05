package PsU.Flyweight;

public class BrushMedium implements Brush {
	
	final BrushSize brushsize = BrushSize.MEDIUM;
	private String color = null;

	@Override
	public void setColor(String s) {
		color = s;
	}

	@Override
	public void draw(String content) {
		System.out.println("Drawing" + content + "in medium color" + color);
		
	}

}
