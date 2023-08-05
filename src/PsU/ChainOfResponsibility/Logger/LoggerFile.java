package PsU.ChainOfResponsibility.Logger;

public class LoggerFile extends AbstractLogger {

	public LoggerFile(int t) {
		 this.level = t ;
	}

	@Override
	protected void write(String g) {
		System.out.println("Error Console ::  Logger " + g);

	}

}
