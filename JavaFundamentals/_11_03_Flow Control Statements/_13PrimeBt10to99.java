package _11_03_FlowControlStatements;
public class _13PrimeBt10to99 
{
	public static void main(String[] args) 
	{	
			for(int i=10;i<=99;i++)
			{
				int count=0;
				for(int j=i;j>=1;j--)
				{
					if(i%j==0)
						count=count+1;
				}
				if(count==2)
					System.out.println(i);
				
			}

	}
}
