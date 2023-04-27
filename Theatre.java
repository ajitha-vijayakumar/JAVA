class Theatre{
public static void main(String [] args)
{
Theatre rohini_theatre = new Theatre();
rohini_theatre.show(120,4);
}
void show(int a,int b)
{
int ticket_price = a;
int no_of_persons = b;
System.out.println(ticket_price*no_of_persons);
}
}

