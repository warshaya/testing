import acm.program.*;
import java.io.*;

public class Test3
{
	public static void main( String[] args ) throws IOException, InterruptedException
	{
		ConsoleProgram otherProgram = new ACMConsole();
		System.out.println( "console created, trying to launch..." );

		otherProgram.run( );
		System.out.println( "running main method from otherProgram" );

		Process p = new ProcessBuilder( "java", "-cp", ".:acm.jar", "ACMConsole" ).start();
		System.out.println( "tring to run it with ProcessBuilder instead" );

		System.out.println( "wait for process to finish" );
		p.waitFor();
		
		System.out.println( "done, closing program" );

	}
}
