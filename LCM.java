import java.util.*;
class LCM{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
LCM call = new LCM();
int num1= sc.nextInt();
int num2 = sc.nextInt();
call.find_common_multiples1(num1,num2);
call.find_common_multiples2(num1,num2);
}
void find_common_multiples1(int num1,int num2)
{
int big = (num1>num2)?num1:num2;
int mul =2;
int lcm = 0;
while(true){
if(big%num1==0 && big%num2==0)
{
lcm = big;
break;
}else
{
big = big * mul;
mul = mul +1;
}
}
System.out.println(lcm);
}
void find_common_multiples2(int num1,int num2)
{
int big = (num1>num2)?num1:num2;
while(true){
if(big%num1==0 && big%num2==0)
{
System.out.println(big);
break;
}
big = big + 1;
}
}
}
