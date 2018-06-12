package _12_06_StringStringBuffer;

public class Assign_12_06_String_09 {

	public static void main(String[] args) {
		
		StringBuffer strInput = new StringBuffer("ab*cd");
		//StringBuffer strOutput = "";
		int len =  strInput.length();
		int index = strInput.indexOf("*");
		
		System.out.println(strInput.delete(index-1, index+2));
/*
		if(strInput.startsWith("**")){
			if(len>3)
				strOutput += strInput.substring(3);
		}
		else if(strInput.startsWith("*")){
			if(len>2)
				strOutput += strInput.substring(2);
		} 
		else if(strInput.indexOf("**") != -1){
			if(len>)
			int index = strInput.indexOf("**");
			strOutput += strInput.substring(0, index-2);
			if(index+3<len)
					strOutput += strInput.substring(index+2);
			}
		}
				*/
		
		
			
		
		
	}

}
