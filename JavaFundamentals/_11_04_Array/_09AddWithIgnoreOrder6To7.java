package _11_04_Array;

public class _09AddWithIgnoreOrder6To7 
{
	public static void main(String[] args) 
	{
		int arr[]=new int[] {7,1,2,3,6,7,7};
		int sum=0,count=0;
		for(int i=0;i<arr.length;)
		{
			if(arr[i]==6&&i!=arr.length-1)
			{
			     i++;
			     ++count;
				 continue;
			}
			else if(count>0)
			{
				if(arr[i]==7)
				{
					count=0;
				}
				++i;
				continue;
			}
			else
			{
				sum+=arr[i];
				System.out.println(arr[i]);
				i++;
			}
		}
		System.out.println(sum);
	}
}
