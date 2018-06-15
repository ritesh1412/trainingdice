package training;
import java.util.Random;
import java.util.Scanner;
public class Dice 
{
	int faces;
	public Dice(int faces)
	{
		this.faces=faces;
	}
	public String Roll()
	{
		Random rn = new Random();
	    String coin[]={"head","tail"};
	    String dices6[]={"one","two","three","four","five","six"};
	    String dices4[]={"one","two","three","four"};
		if(this.faces==2)
		{
			int  output = rn.nextInt(this.faces);
			return coin[output];
		}
		if(this.faces==4)
		{
			int output=rn.nextInt(this.faces);
			return dices4[output];
		}
		else
		{
			int output=rn.nextInt(this.faces);
			return dices6[output];
		}
		}
	public static void main(String Args[])
	{
		System.out.println("enter the no.of faces");
		Scanner s=new Scanner(System.in);
		int faces=s.nextInt();
		Dice ob=new Dice(faces);
		System.out.println("dice no is" + " "+ ob.Roll());
	}

}
