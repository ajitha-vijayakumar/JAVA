import java.util.*;
class Findmultiples{
public static void main(String [] srgs)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number :");
int num = sc.nextInt();
System.out.println("Until which line do you want to print :");
int val = sc.nextInt();
Findmultiples call = new Findmultiples ();
call.printtables(num,val);
}
void printtables(int num,int val)
{
int count = 1;
while(count<=val)
{
System.out.println(count+" * "+num+" = "+(count * num));
count++;
}
}
}
