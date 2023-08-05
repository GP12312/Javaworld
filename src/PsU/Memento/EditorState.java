package PsU.Memento;

public class EditorState {
	
	private final String content ;
	

	public EditorState(String s ) {
		this.content = s;
	}
	
	public String getCOntent() {
		return content;
	}

}
	