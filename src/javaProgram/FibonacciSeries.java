package javaProgram;

import java.util.Iterator;

public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		int n1=0;//1//1//2//3
		int n2=1;//1//2//3
		int n3=0;//1//2//3//5
		
		for (int i = 1; i <=10; i++) //i=1;1<=10//2//3//4
		{
			n3=n1+n2;//0+1=1//1+1=2//1+2=3//2+2=4//3+2=5
			n1=n2;
			n2=n3;
			System.out.println(n3);//1//2//3
		}
		
	}

}
 