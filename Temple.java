class Temple{
public static void main (String [] args){
Temple story = new Temple();
story.find_flowers(7);
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
}
