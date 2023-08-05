package PsU.CommandD;

public class ActionSave implements ActionListenerCommand {
	
	private Document document;

	public ActionSave(Document d) {
		this.document = d;
	}

	@Override
	public void execute() {
		document.save();

	}

}
