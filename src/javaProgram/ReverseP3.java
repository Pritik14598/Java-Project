package javaProgram;

public class ReverseP3 {

	public static void main(String[] args)
	{

		String s="I Am Working on Pc";
		String Reverse=" ";
		
		String[]Word=s.split(" \\s");
		
		
		for (int i=Word.length-1;i>=0;i--) 
		{
			
			Reverse=Reverse+Word[i]+" ";
		}
		System.out.println(Reverse);
	}

}
