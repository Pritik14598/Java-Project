package javaProgram;

class Constructor 
{
	public Constructor()
	{
		//super()
		System.out.println("a");
	}

}
class SecondM extends Constructor{
	public SecondM() 
	{
//		super()
		System.out.println("b");
	}
}
class ThirdM extends SecondM{
	public ThirdM() 
	{
		//super()
		System.out.println("c");
	}
}
public class Main{
	 public static void main(String[] args) 
	 {
		ThirdM c=new ThirdM();
	}
 }