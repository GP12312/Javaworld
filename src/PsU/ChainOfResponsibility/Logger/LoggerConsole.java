package PsU.ChainOfResponsibility.Logger;

public class LoggerConsole extends AbstractLogger {

	public LoggerConsole(int t) {
		 this.level = t ;
	}

	@Override
	protected void write(String g) {
		System.out.println("Standard Console ::  Logger " + g);

	}

}
