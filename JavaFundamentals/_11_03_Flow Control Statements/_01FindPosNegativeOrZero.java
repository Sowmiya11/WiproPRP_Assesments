package _11_03_FlowControlStatements;

import java.util.Scanner;

public class_01FindPosNegativeOrZero 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		int no=scan.nextInt();
		if(no<0)
			System.out.println("Given number is negative");
		else if(no==0)
			System.out.println("Given number is zero");
		else
			System.out.println("Given number is positive");
		scan.close();
	}
}
