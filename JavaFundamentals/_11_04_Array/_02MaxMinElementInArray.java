package _11_04_Array;

import java.util.Arrays;

public class _02MaxMinElementInArray {

	public static void main(String[] args) 
	{
		int arr[]=new int[] {12,123,54,8,346};
		int max=arr[0],min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Minimum value is:"+min);
		System.out.println("Max value is:"+max);
		
	}

}
