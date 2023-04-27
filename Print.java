//1.PRINT 5! 4! 3! 2! 1!
//2.PRINT 1*10 2*9 3*8 4*7
class Print{
public static void main(String [] args)
{
Print call = new Print();
call.print_fact();
}
void print_fact(){
int num = 5;
while(num>0)
{
System.out.print(find_fact(num) + " ");
num = num - 1;
}
}
int find_fact(int num){
int fact = 1;
while (num>0)
{
fact = fact * num;
num--;
}
return fact;
}
}
