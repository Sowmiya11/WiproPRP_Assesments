package _11_04_Array;

import java.util.Scanner;

public class _03ArrayElementFindingWithIndex 
{
	public static void main(String[] args) 
	{
		int arr[]=new int[] {1,34,6,89,8,9};
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the element to search:");
		int element=scan.nextInt();
		int index=0;
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			if(element==arr[i])
			{
				flag=true;
				index=i;
			}
		}
		if(flag)
			System.out.println(index+1);
		else
			System.out.println("-1");
		scan.close();
		
	}

}
