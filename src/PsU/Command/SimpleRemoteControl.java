package PsU.Command;

public class SimpleRemoteControl {

	Command comm;
	
	public void setCommand(Command c) {
		comm =c;
	}
	
	public void buttonWasPressed() {
		
		comm.execute();
	}

}
