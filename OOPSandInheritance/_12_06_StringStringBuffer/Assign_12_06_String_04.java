package _12_06_StringStringBuffer;

public class Assign_12_06_String_04 {

	public static void main(String[] args) {
	
		String strInput = "CatDog";
		int len = strInput.length();
		
		if(len%2 == 0){
			System.out.println(strInput.substring(0, len/2));
		}
		/*
		else
			retrun null;
			*/

	}

}
