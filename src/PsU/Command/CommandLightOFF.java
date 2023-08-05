package PsU.Command;

public class CommandLightOFF implements Command {
	
	Light light;

	public CommandLightOFF(Light l) {
		 this.light = l;
	}

	@Override
	public void execute() {
		light.lightOFF();
	}

}
