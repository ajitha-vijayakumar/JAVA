import java.util.*;
class SpyNumber
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("ENTER THE NUMBER");
int num = sc.nextInt();
SpyNumber call = new SpyNumber();
int sum = call.find_sum_of_digits(num);
int product = call.find_product_of_digits(num);
if(sum == product)
{
System.out.println("Given number is a spy number");
}
else
{
System.out.println("Not a spy number");
}}
int find_sum_of_digits(int num){
int sum = 0;
while(num>0)
{
sum = sum + (num%10);
num = num/10;
}
return sum;
}
int find_product_of_digits(int num){
int product = 1;
while(num>0)
{
product = product * (num%10);
num=num/10;
}
return product;
}
}

