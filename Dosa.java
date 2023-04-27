import java.util.*;
class Dosa{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the remaining Dosas ");
int rem = sc.nextInt();
Dosa call = new Dosa();
call.find_count(rem);
}
void find_count(int rem)
{
int count=3;
int sum = 0;
int eaten = 0;
while(count>0)
{
eaten = eaten + (rem/2);
sum = rem + (rem/2);
rem = sum;
count--;
}
System.out.println("Total dosa's eaten : " + eaten );
}
}
