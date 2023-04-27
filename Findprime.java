import java.util.*;
class Findprime
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
int val = sc.nextInt();
Findprime call = new Findprime();
call.check_prime(val);
}
void check_prime(int num){
int count =0;
int div =2;
while(div<(num/2))
{
if(num % div == 0)
{
count ++;
}
div ++;
}
if(count == 0)
{
System.out.println("Given number is Prime");
}else
{
System.out.println("Given number is not a Prime Number");
}
}
}
