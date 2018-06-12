package _12_06_StringStringBuffer;

public class Assign_12_06_String_08 {

	public static void main(String[] args) {

		String strWord = "Wipro";
		String strSeparate = "X";
		String strOutput = "";
		int n = 3;
		for(int i=0;i<n;i++){
			strOutput += strWord;
			if(i+1 != n)
				strOutput += strSeparate;
		}
		System.out.println(strOutput);
		
	}
}
