package _11_03_FlowControlStatements;

import java.util.Scanner;

public class _15AddAllDigits
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=scan.nextInt();
		int digit;
		for(digit=0;num>0;num=num/10)
		{
			digit+=num%10;
		}
		System.out.println(digit);
		scan.close();
	}

}
