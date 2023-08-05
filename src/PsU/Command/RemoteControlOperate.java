package PsU.Command;

public class RemoteControlOperate {
	
	

	public static void main (String[] args){
		 
		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		Light lt = new Light();
		Stereo st = new Stereo();
		
		remote.setCommand(new CommandLightON(lt));
		remote.buttonWasPressed();
		
		remote.setCommand(new CommandStereoON_DVD(st));
		remote.buttonWasPressed();	
			
		}
		
		
	}


