package _11_04_Array;

public class _08HighOccuredElement 
{
	public static void main(String[] args) 
	{
		int arr[]=new int[] {10,20,10,30,40,100,99};
		int occurence=0,pos=arr.length;
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					++count;
					if(count>occurence)
					{
						pos=i;
						occurence=count;
					}
				}
			}
		}
		if(pos!=arr.length)
			System.out.println(arr[pos]);
		else
			System.out.println("No occurences");
	}

}
