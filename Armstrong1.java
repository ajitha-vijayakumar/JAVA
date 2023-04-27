class Armstrong1{
public static void main (String [] args)
{
Armstrong1 call = new Armstrong1();
int num = 127;
int count = call.findcount(num);
call.find_armstrong(num,count);
}
int findcount(int num)
{
int count =0;

while(num>0)
{
count++;
num=num/10;
}
return count;
}
void find_armstrong(int num,int count)
{
int given = num;
int power = count;
int rem =0;
int sum = 0;
while(count>0)
{
rem = num%10;
sum = sum + find_power(rem,power);
num = num/10;
count = count-1;
}
if(given==sum)
{
System.out.println("Given number is a armstrong number");
}
else{
System.out.println("Not an armstrong number");
}
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


