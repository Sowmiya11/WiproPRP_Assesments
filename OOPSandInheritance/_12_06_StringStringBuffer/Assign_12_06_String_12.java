package _12_06_StringStringBuffer;

public class Assign_12_06_String_12 {

	public static void main(String[] args) {

		String strInput = "Wipro";
		int n = 3;
		
		int len = strInput.length();
		
		for(int i=0;i<n;i++){
			System.out.print(strInput.substring(len-n));
		}
	}

}
