package _12_06_StringStringBuffer;

public class Assign_12_06_String_07 {

	public static void main(String[] args) {
		
		String strInput = "xHix";
		int len = strInput.length();
		
		if(strInput.charAt(0) == 'x')
			if(strInput.charAt(len-1) == 'x')
				System.out.println(strInput.substring(1, len-1));
			else
				System.out.println(strInput.substring(1));
		else if(strInput.charAt(len-1) == 'x')
			System.out.println(strInput.substring(0, len-1));

	}

}
