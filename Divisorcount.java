import java.util.*;
class Divisorcount
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
int val = sc.nextInt();
Divisorcount call = new Divisorcount();
call.find_divisor_count(val);
}
void find_divisor_count(int num){
int count =0;
int div =1;
while(div<=num)
{
if(num % div == 0)
{
count ++;
}
div ++;
}
System.out.println("Divisors count :" + count);
}
}
