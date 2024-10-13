package javaProgram;

public class WordRevers 
{
public static void main(String[] args) 
{
	String st="I Love programming";
	String[]word=st.split(" ");
	
	String reverse=" ";
	
	for (String w : word) 
	{
		String reversew =" ";
		
		for (int i=w.length()-1;i>=0;i--)
		{
			reversew=reversew+w.charAt(i);
		}
		
		reverse=reverse+reversew;
	}
	System.out.println(reverse);
}
}
