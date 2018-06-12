package stringBufferAssignments;
import java.util.Scanner;
class Checking
{
	String givenName; 
	String reveseName="";
	public void  check(String s) 
	{	
		this.givenName=s;
		reveseName=new StringBuffer(s).reverse().toString();
		if(givenName.equals(reveseName))
			System.out.println("Given String "+givenName+" is palindrome");
		else
			System.out.println("Given string "+givenName+" is not palindrome");
	}
}
public class Palindrome {

	public static void main(String[] args)
	{   String name;
		Scanner pali = new Scanner(System.in);
		name=pali.nextLine();
		Checking ch=new Checking();
		ch.check(name);
		pali.close();
	}
}
