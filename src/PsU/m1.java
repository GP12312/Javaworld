package PsU;
import PsU.m2;

public class m1{
	
	int a = 1000;
	
	public static void main (String[] args) {	
					   System.out.println(" Hello Idiots in m1 ..!");
				
						m2 mx = new m2();
						int y = mx.a;
						mx.min();
	
						m1 mq = new m1();
						System.out.println(mq.a);
						System.out.println(mq.padString("Hello"));	
	}
	
	
	String padString(String q) {
		String paddedq = "<<<<< "+ q +" >>>>>>";
		return paddedq;
	}
	
}