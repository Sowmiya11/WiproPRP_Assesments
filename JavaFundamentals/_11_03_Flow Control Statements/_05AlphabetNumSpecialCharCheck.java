package _11_03_FlowControlStatements;

import java.util.Scanner;

public class _05AlphabetNumSpecialCharCheck
{
	public static void main(String[] args) {
		System.out.println("Enter character:");
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		if((ch>='a'&&ch<='z') ||(ch>='A'&& ch<='Z'))
			System.out.println("given "+ch+" is Alphabet");
		else if(ch>=0)
			System.out.println("given "+ch+" is digit");
		else
			System.out.println("given"+ch+"is Special character or symbol");
      s.close();
	}

}
