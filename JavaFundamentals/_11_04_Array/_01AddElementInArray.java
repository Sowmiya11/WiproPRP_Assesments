package _11_04_Array;
public class _01AddElementInArray 
{
	public static void main(String[] args)
	{
		int arr[]=new int[]{1,12,134,2,3};
		int add=0;
		for(int i=0;i<arr.length;i++)
		{
			add+=arr[i];
		}
		System.out.println(add/arr.length);
	}

}
