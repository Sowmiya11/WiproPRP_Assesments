package _12_06_StringStringBuffer;

public class Assign_12_06_String_06 {

	public static void main(String[] args) {
		
		String strOne = "hi";
		String strTwo = "hello";
		
		if(strOne.length()<strTwo.length())
			System.out.println(strOne+strTwo+strOne);
		else
			System.out.println(strTwo+strOne+strTwo);

	}

}
