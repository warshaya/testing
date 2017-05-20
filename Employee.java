public class Employee
{
	public Employee( ILogger logger )
	{
		logger.writeToLog( "New employee created." );
	}
}
