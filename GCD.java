import java.util.*;
class GCD{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
GCD call = new GCD();
int num1= sc.nextInt();
int num2 = sc.nextInt();
call.find_common_divisors(num1,num2);
}
void find_common_divisors(int num1,int num2)
{
int div = 2;
int gcd = 1;
int small = (num1>num2)?num2:num1;
while(div<=small){
if(num1%div == 0 && num2%div == 0)
{
gcd = div;
}
div = div +1;
}
System.out.println(gcd);
}
}
