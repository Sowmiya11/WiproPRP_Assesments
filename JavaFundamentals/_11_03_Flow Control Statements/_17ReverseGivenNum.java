package _11_03_FlowControlStatements;

import java.util.Scanner;

public class _17ReverseGivenNum 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=scan.nextInt();
		int digit,no=0;
		for(digit=0;num>0;num/=10)
		{
			digit+=num%10;
			no=(no*10)+digit;
			digit=0;
		}
		System.out.println(no);
		scan.close();
	}

}
