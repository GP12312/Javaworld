package PsU.State.dbConn;

public class Controller {

	public static DBAccounting acct;
	public static DBSales sale;
	public static DBManagement mngt;
	public static Connection con;
	
	Controller(){
		acct = new DBAccounting();
		sale = new DBSales();
		mngt = new DBManagement();		
	}
	
	public void setAccountingConnection() {
		con = acct;		
	}
	
	public void setSalesConnection() {
		con = sale;		
	}
	
	public void setManagementConnection() {
		con = mngt	;		
	}
	
	public void open() {
		con.open();
	}
	
	public void close() {
		con.close();
	}
	
	public void log() {
		con.log();
	}
	
	
	public void update() {
		con.update();
	}
	
	

	

}
