import acm.program.*;
import java.io.*;

public class StringWriterTwo implements IStringWriter
{
	private ACMConsole m_consoleProgram = new ACMConsole();

	public void writeString( String text )
	{
//		String beginning = "import acm.program.*;public class ACMConsole extends ConsoleProgram{public void run(){println(";
//		String end = ");}}";
//		new BufferedWriter( new FileWriter( "ACMConsole.java" )).write( beginning + text + end );
//		Process p2 = new ProcessBuilder( "javac", "-cp", ".:acm.jar", "ACMConsole.java" ).start();
//		p2.waitFor();
//		Process p1 = new ProcessBuilder( "java", "-cp", ".:acm.jar", "ACMConsole" ).start();
//		p1.waitFor();
		m_consoleProgram.start( new String[0] );
		m_consoleProgram.run();
		m_consoleProgram.println( text );
	}
}
