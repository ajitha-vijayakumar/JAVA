import java.util.*;
class Strong{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
Strong call = new Strong();
call.find_strong(num);
}
void find_strong(int num){
int given = num;
int sum = 0;
int rem = 0;
while(num>0)
{
rem = num%10;
sum = sum + find_factorial(rem);
num = num/10;
}
if(given == sum)
{
System.out.println("Strong number");
}
else
{
System.out.println("Not a strong number");
}
}
int find_factorial(int num)
{
int fact = 1;
while(num>0){
fact = fact*num;
num= num-1;
}
return fact;
}
}



















