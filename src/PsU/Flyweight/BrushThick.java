package PsU.Flyweight;

public class BrushThick implements Brush {
	
	final BrushSize brushsize = BrushSize.THICK;
	private String color = null;

	@Override
	public void setColor(String s) {
		color = s;
	}

	@Override
	public void draw(String content) {
		System.out.println("Drawing" + content + "in thick color" + color);
		
	}

}
