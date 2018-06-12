package _11_04_Array;

import java.util.Arrays;

public class _05MaxMinTwoElements
{
	public static void main(String[] args) 
	{
		int arr[]=new int[] {12,2,56,3,87,98,0};
		int max=arr[0],min=arr[0];
		int secMax=arr[0],secMin=arr[0];
		int max_Firstpos=0,min_Firstpos=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				max_Firstpos=i;
			}
			if(arr[i]<min)
			{
				min=arr[i];
				min_Firstpos=i;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>secMax&&max_Firstpos!=i)
			{
				secMax=arr[i];
			}
			if(arr[i]<secMin&&min_Firstpos!=i)
			{
				secMin=arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Max Elements:"+max+" "+secMax);
		System.out.println("Min elemnts:"+min+" "+secMin);
	}
}
