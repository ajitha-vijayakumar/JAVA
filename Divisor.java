import java.util.*;
class Divisor
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
int val = sc.nextInt();
Divisor call = new Divisor();
call.find_divisor(val);
}
void find_divisor(int num){
int count =1;
while(count<=num)
{
if(num % count == 0)
{
System.out.println("Divisible by : " + count);
}
count ++;
}
}
}
