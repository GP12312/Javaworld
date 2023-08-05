package PsU.Prototype;

public abstract class Color implements Cloneable {
	
	protected String colorName;
	
	abstract void addColor() ;
	
	public Object clone() {
		
		Object c = null;
		
		try {
			c = super.clone();
		}
		catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }		
		return c;		
	}	
}
