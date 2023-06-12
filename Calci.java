package Calculator;
import java.util.*;
public class Calci {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 Calci call = new Calci();
		 System.out.println("Enter two numbers : ");
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 call.calc(a,b);
	}

	 void calc(int a, int b) {
		Scanner sc = new Scanner(System.in);
		System.out.println("For Addition enter '1' ");
	    System.out.println("For Subtraction enter '2' ");
	    System.out.println("For Multiplication enter '3' ");
	    System.out.println("For Division enter '4' ");
	    int input = sc.nextInt();
	    int res = operation(input,a,b);
	    continuation(res);
	}
	 void continuation(int res) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Do you want to continue ? [Y/N] :");
		 char ch = sc.next().charAt(0);
		    if(ch=='Y' || ch=='y') {
		    	System.out.println("Enter new input : ");
		    	int num2 = sc.nextInt();
		    	calc(res,num2);
		    }else if(ch=='n' || ch=='N') {
		    	System.out.println("Thank you for using!!");
		    }else {
		    	System.out.println("Invalid input ! Try again");
		    	continuation(res);
		    }
	 }

	private int operation(int input,int f,int s) {
		int result = 0;
		if(input==1)
	    {
	      System.out.println("Addition of given numbers "+f+" + "+s + " = "+(f+s) );
	      result = f+s;
	    }
	    else if(input==2)
	    {
	      System.out.println("Subtraction of given numbers "+f+" - "+s + " = "+(f-s) );
	      result = f-s;
	      
	    }
	    else if(input==3)
	    {
	      System.out.println("Multiplication of given numbers "+f+" * "+s + " ="+(f*s) );
	      result = f*s;
	      
	    }
	    else if(input==4)
	    {
	      System.out.println("Division of given numbers "+f+" / "+s + " = "+(f/s) );
	      result = f/s;
	    }
	    else
	    {
	      System.out.println("Given choice is invalid enter valid option");
	    }
		return result;
	}
	

}
