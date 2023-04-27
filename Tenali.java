class Tenali{
public static void main (String [] args){
Tenali story = new Tenali();
//story.find_security(1024);
//story.find_flowers(7);
story.print_1();
}
void find_security(int beats)
{
	int security = 0;
	int i=1;
	while(beats>1)
	{
	beats = beats/2;
	if(beats>=1)
	{
	System.out.println("SECURITY "+i + " GETS " + beats + " BEATS");
	}
	security = security+1;
	i++;
	}
	System.out.println("NO.OF SECURITIES : "+security);
}
void find_flowers(int temples)
{
	int flowers = 1;
	int j=7;
	while(temples>0)
	{
	temples = temples-1;
	flowers = flowers*2;
	System.out.println("NO. OF FLOWERS WHILE ENTERING TEMPLE "+j+" : "+flowers);
	j--;
	}
	System.out.println("TOTAL NO. OF FLOWERS AT INITIAL STAGE: "+ flowers);
}
void print_1()
{

int i=0;
while(i<500)
{
System.out.print(1+" ");
i=i+1;
}
}
}
