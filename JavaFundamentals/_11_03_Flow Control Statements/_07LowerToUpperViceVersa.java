package _11_03_FlowControlStatements;

import java.util.Scanner;

public class _07LowerToUpperViceVersa 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter character:");
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		if(ch>=65&&ch<=92)
			System.out.println((char)(ch+32));
		else
			System.out.println((char)(ch-32));
		s.close();
	}
}
