package PsU.Memento;

public class Client {

	public static void main(String[] arg) {
		var ed = new Editor();
		var hi = new History();
		
		ed.setStr("Java");
		hi.save(ed.createState());
		
		ed.setStr("Java is");
		hi.save(ed.createState());
		
		ed.setStr("Java is a");
		hi.save(ed.createState());
		
		ed.setStr("Java is a good");
		hi.save(ed.createState());
		
		ed.setStr("Java is a good language");
		hi.save(ed.createState());
		
		System.out.println("<--------------  Now rweverting --------->");
		
		System.out.println(ed.getStr());
		hi.revert(ed);
		
		System.out.println(ed.getStr());
		hi.revert(ed);
		
		System.out.println(ed.getStr());
		hi.revert(ed);
		
		System.out.println(ed.getStr());
		hi.revert(ed);
		
		System.out.println(ed.getStr());
		hi.revert(ed);
		
		System.out.println(ed.getStr());
		hi.revert(ed);
		
		System.out.println(ed.getStr());

 }
}
