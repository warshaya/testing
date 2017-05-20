public class LoggerOne implements ILogger
{
	public void writeToLog( String text )
	{
		System.console().writer().println( text );
	}
}
