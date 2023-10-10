import java.util.scannar;
public class Voting
{
	public static void main(string[]args)
	{
			int age,shrt;
			Scanner scan=new Scanner(System.in);
			System.out.println("enter ur age:");
			age=scan.nextlnt();
			if(age>=18)
			{
				System.out.println("can do voting");
			}
			else
			{
				shrt=(18-age);
				system.out.println("sorry,u can vote after:"+shrt+"years");
			}
	}
}



