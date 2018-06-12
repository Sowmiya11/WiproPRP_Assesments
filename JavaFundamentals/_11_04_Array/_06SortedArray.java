package _11_04_Array;

import java.util.Arrays;

public class _06SortedArray 
{
	public static void main(String[] args) 
	{
		int arr[]=new int[] {12,56,1,45,87,4};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length-i;j++)
			if(arr[j-1]>arr[j])
			{
				int temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
