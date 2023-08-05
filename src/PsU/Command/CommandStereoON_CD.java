package PsU.Command;

public class CommandStereoON_CD implements Command {
	
	Stereo stereo;

	public CommandStereoON_CD(Stereo s) {
		this.stereo = s;		 
	}

	@Override
	public void execute() {
		
		stereo.on();
		stereo.setStereoToCD();
		stereo.setVolume(42);

	}

}
