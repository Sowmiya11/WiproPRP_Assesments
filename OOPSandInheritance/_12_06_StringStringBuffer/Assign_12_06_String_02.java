package _12_06_StringStringBuffer;
public class Assign_12_06_String_02 {

	public static void main(String[] args) {
		
		String strOne = "Mark";
		String strTwo = "Gate";
		
		strOne = strOne.toLowerCase();
		strTwo = strTwo.toLowerCase();
		
		int lenOne = strOne.length();
		int lenTwo = strTwo.length();
		
		if(strOne.charAt(lenOne-1) == strTwo.charAt(0))
			System.out.println(strOne+strTwo.substring(1));
		else
			System.out.println(strOne+strTwo);
		
	}

}
