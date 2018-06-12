package _12_06_StringStringBuffer;

public class Assign_12_06_String_10_11 {

	public static void main(String[] args) {
		
		String strOne = "Hello";
		String strTwo = "World";
		String strOutput = "";
		int lenOne = strOne.length();
		int lenTwo = strTwo.length();
		int max = lenOne<lenTwo?lenTwo:lenOne;
		
		for(int i=0;i<max;i++){
			if(i<lenOne)				
				strOutput = strOutput+strOne.charAt(i);
			if(i<lenTwo)
				strOutput = strOutput+strTwo.charAt(i);
		}

		System.out.println(strOutput);		
	}

}
