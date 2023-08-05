package PsU.ChainOfResponsibility.Logger;

public abstract class AbstractLogger {
	
	public static int INFO  = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;
	
	protected int level;
	
	protected AbstractLogger nextlogger;

	public void setNextLogger(AbstractLogger n) {
				this.nextlogger = n;
	}
	
	public void logMessage( int n , String msg) {
				if(this.level <= n) {
						write(msg);
				}
				if(nextlogger != null) {
					nextlogger.logMessage(n, msg);
				}
	}
	
	
	abstract protected void write (String g) ;

}
