class EBCalculator
{
public static void main(String [] args)
{
EBCalculator reader= new EBCalculator();
int bill = reader.calculate_units();
System.out.println("bill="+bill);
int amount = 500;
reader.pay(amount,bill);
}
int calculate_units()
{
int units = 120;
int price = 2;
return units*price;
}
void pay(int a,int b){
System.out.println("balance="+(a-b));
}
}
