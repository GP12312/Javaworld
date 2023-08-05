package PsU.State.dbConn;

public class DBManagement implements Connection {

 
	@Override
	public void open() {
		System.out.println("Open Database for Management");
	}

	@Override
	public void close() {
		System.out.println("Close Database");

	}

	@Override
	public void log() {
		System.out.println("log updated");

	}

	@Override
	public void update() {
		System.out.println("Management Updated");

	}

}
