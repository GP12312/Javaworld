package PsU.Command;

public class CommandLightON implements Command {
	
	Light light;

	public CommandLightON(Light l) {
		 this.light = l;
	}

	@Override
	public void execute() {
		light.lightON();
	}

}
