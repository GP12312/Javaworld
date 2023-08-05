package PsU.Command;

public class CommandStereoON_DVD implements Command {
	
	Stereo stereo;

	public CommandStereoON_DVD(Stereo s) {
		this.stereo = s;		 
	}

	@Override
	public void execute() {
		
		stereo.on();
		stereo.setStereoToDVD();
		stereo.setVolume(22);
 
	}

}
