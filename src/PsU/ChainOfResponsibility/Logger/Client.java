package PsU.ChainOfResponsibility.Logger;

public class Client {
	
	
	public static void main(String args[]) {
		
		AbstractLogger logch = getChainOfLoggers();
		
		logch.logMessage(AbstractLogger.INFO," INORMATION ");
		logch.logMessage(AbstractLogger.DEBUG," DEBUG  INFORMATION  ");
		logch.logMessage(AbstractLogger.ERROR," ERROR INFORMAITON ");
		
	}
	
	

		private static AbstractLogger getChainOfLoggers() {
			
			
			AbstractLogger errorLogger = new LoggerError(AbstractLogger.ERROR);
			AbstractLogger fileLogger = new LoggerFile(AbstractLogger.DEBUG);
			AbstractLogger consoleLogger = new LoggerConsole(AbstractLogger.INFO);
			
			errorLogger.setNextLogger(consoleLogger);
			consoleLogger.setNextLogger(fileLogger);
			
			return errorLogger;
		}
		
		

}
