package javaProgram;

public class EqualsMethod
{
	public static void main(String[] args) 
	{
		String str1="Hello";
		String str2=new String("Hello");//creating a new object
		System.out.println(str1==str2);//Compaire it with equals method at that time it will show true
		                                     //bcz the value is same of both the objects
//		(str1.equals(str2))
	}

}
