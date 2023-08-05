package PsU.ChainOfResponsibility.Logger;

public class LoggerError extends AbstractLogger {

	public LoggerError(int t) {
		 this.level = t ;
	}

	@Override
	protected void write(String g) {
		System.out.println("File ::  Logger " + g);

	}

}
