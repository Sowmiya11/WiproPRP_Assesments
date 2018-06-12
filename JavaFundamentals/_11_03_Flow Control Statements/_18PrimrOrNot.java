package _11_03_FlowControlStatements;

import java.util.Scanner;

public class _18PrimrOrNot
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number:");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		boolean flag=false;
		if(num==0||num==1)
			System.out.print(num+"is even number");
		else
		{
			for(int i=2;i<=num/2;i++)
			{
				if(i%num==0)
				{
					flag=true;
					break;
				}
			}
			
		}
		if(flag)
			System.out.println(num+" is a not a prime number");
		else
			System.out.println(num+" is a prime number");
		s.close();
	}
}
