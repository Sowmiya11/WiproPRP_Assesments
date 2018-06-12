package _11_03_FlowControlStatements;

public class _06InterestCalculation 
{
	public static void main(String[] args) 
	{
		String gender=args[0];
		int age=Integer.parseInt(args[1]);
		if(gender.equalsIgnoreCase("female")&& (age>=1&&age<=58))
			System.out.println("Interest: 8.2%");
		else if(gender.equalsIgnoreCase("female")&& (age>=59&&age<=120))
			System.out.println("Interest: 7.6%");
		else if(gender.equalsIgnoreCase("female")&& (age>=1&&age<=58))
			System.out.println("Interest: 9.2%");
		else if(gender.equalsIgnoreCase("female")&& (age>=1&&age<=58))
			System.out.println("Interest: 8.3%");
	}
}
