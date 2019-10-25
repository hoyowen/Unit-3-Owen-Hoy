import java.util.Scanner;

public class DrinkingDriving
{
   public static void main (String[] args)
   {
      final int MINOR = 21;
      final int DRIVING = 17;
      final int ADULT = 22;
      Scanner scan = new Scanner (System.in);

      System.out.print ("Enter your age: ");
      int age = scan.nextInt();

      System.out.println ("You entered: " + age);

      if (age < MINOR)
         System.out.println ("You are too young to drink, but enjoy driving!");
      else
      System.out.println ("You are legally allowed to drink and drive (not at the same time)!");
   }
}
