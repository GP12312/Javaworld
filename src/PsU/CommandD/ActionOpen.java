package PsU.CommandD;

public class ActionOpen implements ActionListenerCommand {
	
	private Document document;

	public ActionOpen(Document d) {
		this.document = d;
	}

	@Override
	public void execute() {
		document.open();
	}

}
