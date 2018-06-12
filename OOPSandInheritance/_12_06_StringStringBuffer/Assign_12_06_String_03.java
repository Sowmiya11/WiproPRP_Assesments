package _12_06_StringStringBuffer;

public class Assign_12_06_String_03 {

	public static void main(String[] args) {
		
		String strInput = "Wipro";
		String strOutput = "";
		
		int len = strInput.length();
		
		
		if(len>1){
			for(int i=0;i<len;i++){
				strOutput = strOutput+strInput.substring(0, 2);
			}
			System.out.println(strOutput);
		}
		else{
			strOutput = strInput;
			System.out.println(strOutput);			
		}
	}

}
