package _11_03_FlowControlStatements;

import java.util.Scanner;

public class _12PalindromOrNot
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=scan.nextInt();
		int temp=num;
		int digit,no=0;
		for(digit=0;temp>0;temp/=10)
		{
			digit=temp%10;
			no=(no*10)+digit;
		}
		if(no==num)
			System.out.println(num+" is a palindrome");
		else
			System.out.println(num+" is a not palindrome");
		scan.close();

	}

}
