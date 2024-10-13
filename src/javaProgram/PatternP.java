package javaProgram;

public class PatternP
{
	public static void main(String[] args) 
	{
		int V=1;
		for (int r = 1; r <=5; r++) 
		{
			for (int c = 1; c <=5; c++)
			{
				if (V==1)
				{
					V=1;
					
				}
				if ((r+c)%2==0) 
				{
					System.out.print("*"+" ");
					
					
				}
				else {
					System.out.print(V++);
				}
			}
			System.out.println();
		}
		
	}

}
