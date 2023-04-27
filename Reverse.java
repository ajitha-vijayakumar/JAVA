import java.util.*;
class Reverse{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int val = sc.nextInt();
Reverse call = new Reverse();
//call.count_digits(val);
//call.print_reverse(val);
//call.find_reverse(val);
//call.find_sumofdigits(val);
call.check_palindrome(val);

}
void print_reverse(int num)
{
System.out.println("Just printing the reverse of given number");
while(num>0)
{
System.out.print(num%10);
num=num/10;
}
}
void count_digits(int num)
{
int count =0;
System.out.println("The number of digits in given Value");
while(num>0)
{
count++;
num=num/10;
}
System.out.println(count);
}
void find_reverse(int num)
{
int reverse=0;
int rem=0;
System.out.println(" ");
System.out.println("The reverse of given number is founded as : ");
while(num>0)
{
rem=num%10;
reverse= (reverse*10)+rem;
num=num/10;
}
System.out.println(reverse);
}
void find_sumofdigits(int num)
{
int sum=0;
while(num>0)
{
sum += num%10;
num/=10;
}
System.out.println("Sum of Digits: " + sum);
}
void check_palindrome(int num)
{
int given = num;
int reverse=0;
int rem=0;
while(num>0)
{
rem=num%10;
reverse= (reverse*10)+rem;
num=num/10;
}
System.out.println("ARGUMENT "+num);
System.out.println("GIVEN " +given);
System.out.println("REVERSE " +reverse);
if(reverse==given)
{
System.out.println("The given number is palindrome");
}else
{
System.out.println("The given number is not a palindrome");
}
}

}
