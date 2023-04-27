import java.util.*;
class Power{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the base value : ");
int base = sc.nextInt();
System.out.println("Enter the power value : ");
int power = sc.nextInt();
Power call = new Power();
call.find_power(base,power);
}
void find_power(int base,int power)
{
int val = 1;
while(power>0)
{
val = val*base;
power--;
}
System.out.println("The value is : "+val);
}
}
