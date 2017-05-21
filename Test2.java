public class Test2
{
	public static void main( String[] args )
	{
		System.out.println( "instantiating program1");
		MyWritingProgram program1 = new MyWritingProgram( new StringWriterOne() );
		System.out.println( "program1 created with StringWriterOne" );
		System.out.println( "instantiating program2" );
		MyWritingProgram program2 = new MyWritingProgram( new StringWriterTwo() );
		System.out.println( "program2 created with StringWriterTWo" );
	}
}
