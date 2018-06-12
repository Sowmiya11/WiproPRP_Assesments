package _12_06_StringStringBuffer;

public class Assign_12_06_String_13 {

	public static void main(String[] args) {
		
		String strOne = "abcXY123XYijk";
		String strTwo = "XY";
		
		String strOutput = "";
		int lenOne = strOne.length();
		int lenTwo = strTwo.length();
		strOne = strOne.toLowerCase();
		strTwo = strTwo.toLowerCase();
		int index = -1;
		
		do{			
			index = strOne.indexOf(strTwo);			
			if(index != -1){
				strOutput = strOutput+strOne.charAt(index-1)+strOne.charAt(index+lenTwo);
				strOne = strOne.substring(index+lenTwo);
			}
			
		}while(lenOne > lenTwo && index != -1);
		
		System.out.println(strOutput);
	}

}
