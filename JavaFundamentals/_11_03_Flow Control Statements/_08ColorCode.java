package _11_03_FlowControlStatements;

import java.util.Scanner;

public class _08ColorCode
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the color code(R/G/O/Y/W):");
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		switch(ch)
		{
		case 'R':
			System.out.println("RED");
			break;
		case 'G':
			System.out.println("GREEN");
			break;
		case 'O':
			System.out.println("ORANGE");
			break;
		case 'Y':
			System.out.println("YELLOW");
			break;
		case 'W':
			System.out.println("White");
			break;
			default:
				System.out.println("Enter the valid color code");
		}
		s.close();
	}
}
