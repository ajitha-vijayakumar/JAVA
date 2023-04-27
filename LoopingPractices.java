import java .util.*;

public class LoopingPractices {

  public static void main(String[] args) {
    LoopingPractices today =  new LoopingPractices();
    Scanner in =  new Scanner(System.in);
    System.out.println("Enter the  first number:");
    int no1=in.nextInt();
    System.out.println("Enter the  second number:");
    int no2 = in.nextInt();
    today.find_gcd(no1, no2);
    // TODO Auto-generated method stub

  }
  public void find_gcd(int num1, int num2)
  {
     int gcd =0 , div=2, small;
     small = num1<num2?num1:num2;
     while(div<=small)
     {
       if(num1%div==0 && num2%div==0)
       {
         gcd = div;
       }
       div=div+1;
     }
     System.out.println(" Gcd is :"+gcd);
  }

}
