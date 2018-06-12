package _11_03_FlowControlStatements;

import java.util.Scanner;

public class _02OddOrEven 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=scan.nextInt();
		if(no%2==0)
			System.out.println(no+" is even");
		else
			System.out.println(no+" is odd");
		scan.close();
	}
}
