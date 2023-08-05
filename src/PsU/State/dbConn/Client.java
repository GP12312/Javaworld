package PsU.State.dbConn;

public class Client {
	
	Controller cont;
	
	Client(String s ){
		var cont = new Controller();
		
	if(s.equalsIgnoreCase("accounting")){ cont.setAccountingConnection();		}
	if(s.equalsIgnoreCase("management"))	{ cont.setManagementConnection();		}
	if(s.equalsIgnoreCase("sales"))		{ cont.setSalesConnection();			}
	cont.open();
	cont.log();
	cont.close();
	cont.log();
	cont.update();	
	}
	
	public static void main(String args[]) {
		new Client("management");		
	}
}
