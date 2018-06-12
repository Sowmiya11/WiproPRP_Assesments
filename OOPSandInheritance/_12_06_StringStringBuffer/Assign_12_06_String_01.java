package _12_06_StringStringBuffer;

public class Assign_12_06_String_01 {

	public static void main(String[] args) {
		
		String strOriginal = "ravi";
		int len = strOriginal.length();
		
		String strReversed = new StringBuffer(strOriginal).reverse().toString();
		
		if(strOriginal.equals(strReversed))
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");

	}

}
