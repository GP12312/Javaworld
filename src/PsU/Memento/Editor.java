package PsU.Memento;

public class Editor {
	
	private String str;

	public Editor() {
		// TODO Auto-generated constructor stub
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	public EditorState createState(){
		
		return new EditorState(getStr());		
	}
	
	public void restore(EditorState s) {
		str = s.getCOntent();
	}

}
