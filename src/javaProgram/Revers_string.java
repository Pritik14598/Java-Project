package javaProgram;

public class Revers_string
{
public static void main(String[] args) 
{
	String str="rverse";
	String rever=" ";
	char ch;
	
	for (int i = 0; i < str.length(); i++) 
	{
		ch=str.charAt(i);
		
		rever=ch+rever;
		
	}
	System.out.println(rever);
	
}
}
