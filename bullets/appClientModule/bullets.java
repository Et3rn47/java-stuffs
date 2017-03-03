// the purpose of this program is to make sure I can do shit
import java.util.*;
public class bullets
{
	/// because the java told me to.... for the input to not have an error?
	private static Scanner keyboard;
	///SO IT BEGINS
	public static void main(String[] args)
	{
	int numberOfBullets, numberOfGuns, totalBullets;
	
	keyboard = new Scanner(System.in);
	System.out.print("Enter the max number of bullets in each gun:");
	numberOfBullets = keyboard.nextInt();
	System.out.println("Enter the number of Guns:");
	numberOfGuns = keyboard.nextInt();
	
	totalBullets = numberOfBullets * numberOfGuns;
	
	System.out.println("If you have");
	System.out.println(numberOfBullets + " bullets in all your guns and you have");
	System.out.println(numberOfGuns + " guns, as long as your count is correct,");
	System.out.println("the total number of bullets available is " + totalBullets);
	
	System.out.println("Now, for no other reason than to do simple math, we will take 2 bullets from the maximum of each gun, (keep in mind this means you have to have 3 or more max bullets in each gun for this second equation to be worth having)");
	
	numberOfBullets = numberOfBullets - 2;
	totalBullets = numberOfBullets * numberOfGuns;
	
	System.out.println("If you didn't break your math, you now have");
	System.out.println(numberOfBullets + " maximum bullets available per gun and");
	System.out.println("the same amount of guns, or "+ numberOfGuns);
	System.out.println("So, now, our new total number of bullets available is " +totalBullets);
	}

}