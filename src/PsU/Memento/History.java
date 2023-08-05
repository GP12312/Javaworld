package PsU.Memento;
import java.util.Stack;

public class History {

	Stack<EditorState> st = new Stack<>();
	
	public void save(EditorState s) {
		st.push(s);		
	}
	
	public void revert (Editor e) {
		if(!st.isEmpty()) {
			e.restore(st.pop());
		}
		else {
			System.out.println("Cannot Undo...!");
		}
	}
}
