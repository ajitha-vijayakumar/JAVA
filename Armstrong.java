import java.util.*;
class Armstrong{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
Armstrong call = new Armstrong();
int count = call.count_digits(num);
call.find_armstrong(num,count);
}
void find_armstrong(int num,int count){
int given = num;
int val = 0;
int rem = 0;
int pow = count;
while(count>0)
{
rem = num%10;
val = val + find_power(rem,pow);
num = num/10;
count--;
}
if(val==given)
{
System.out.println("The given number is an amstrong number");
}
else
{
System.out.println("The given number is not an amstrong number");
}
}


int count_digits(int num)
{
int count =0;

while(num>0)
{
count++;
num=num/10;
}
return count;
}


int find_power(int base,int power)
{
int val = 1;
while(power>0)
{
val = val*base;
power--;
}
return val;
}
}
