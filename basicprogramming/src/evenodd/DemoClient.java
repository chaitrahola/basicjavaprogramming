package evenodd;

import java.util.Scanner;

public class DemoClient {
	public static void main(String[] args)
	{
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("enter number=");
		
		int num= scanner.nextInt();
		
		EvenOdd obj=new EvenOdd();
		
		boolean b=obj.EvenOdd(num);
		
		if (b==true)
		{
			System.out.println("even");
	
	}
		else
		{
			System.out.println("odd");
		}
	}}

