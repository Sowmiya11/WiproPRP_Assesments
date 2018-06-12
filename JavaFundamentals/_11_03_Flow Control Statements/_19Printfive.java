package _11_03_FlowControlStatements;
public class _19Printfive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
	    int count=1;
		for(int i=1;count<=5;i++)
   {
	 if((i%2==0) && (i%3==0) && (i%5==0))
	 { 
		 count++;
		   System.out.println(""+i);
		   }
	    }
	}

}
