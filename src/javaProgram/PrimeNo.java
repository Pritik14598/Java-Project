package javaProgram;

public class PrimeNo {

	public static void main(String[] args)
	{
		int p=9;
		int count=0;
		for(int i=1;i<=p;i++)
		{
			if (p%i==0)
			{
				count++;
			
		}
	}
		
         if (count==2)
         {
        	 System.out.println("the no is prime");
        	 
         }
         else
         {
        	 System.out.println("the no is not prime");
         }
	}

}
