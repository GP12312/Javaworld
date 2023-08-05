package PsU.State.dbConn;

public interface Connection {
	
	public void open();
	public void close();
	public void log();
	public void update();
	

}
