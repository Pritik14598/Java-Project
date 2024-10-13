package javaProgram;

public class Revrse_WordsString 
{
    public static void main(String[] args) {
		
    	 String s="I Love Java";
    	 String[]Words=s.split(" ");
    	 
    	 String Reverse=" ";
    	 
    	 for(String W:Words)
    	 {
    		 String Reversw=" ";
    		 
    		for (int i=W.length()-1;i>=0;i--)
    		{
				Reversw=Reversw+W.charAt(i);
			}    
    			
    		Reverse=Reverse+Reversw+ " ";
    	 }
    	 
    	 System.out.println(Reverse);
	}
}
