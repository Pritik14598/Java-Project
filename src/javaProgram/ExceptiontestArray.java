package javaProgram;

public class ExceptiontestArray
{
	public static void main(String[] args)
	{
		try
		{
			int ary[]= {10,34,56};
			int tempt=ary[4];
		
		}
		 catch(ArrayIndexOutOfBoundsException e1)
		{
			 System.out.println(e1.getMessage());
		}
		catch(Exception e2)
		{
			System.out.println("some exception");
		}
	}

}
