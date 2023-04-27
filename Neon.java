import java.util.*;
class Neon{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
Neon call= new Neon();
int num = sc.nextInt();
int square = num*num;
int sum_of_digits = call.find_sumofdigits(square);
if(num==sum_of_digits)
{
System.out.println("The given number is a Neon number");
}else{
System.out.println("The given number is not a Neon number");
}
}
int find_sumofdigits(int num)
{
int sum=0;
while(num>0)
{
sum += num%10;
num/=10;
}
return sum;
}
}
