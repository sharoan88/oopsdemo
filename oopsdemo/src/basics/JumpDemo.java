package basics;
//Program to demonstrate jump statements in java-break & continue

public class JumpDemo {
	public static void main(String[] args) {
		
		int i;
	       
        System.out.println("********** Break Demo ***********");
       
        for(i=1;i<=10;i++)
        {
           if(i==8)
           {
        	   //break;//Terminates the Loop
        	   continue; // Skips the Current Iteration
           }
            System.out.println(i+" Sharmila");
        }
		
	}

}
