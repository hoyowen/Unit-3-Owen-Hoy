import java.util.Scanner;

public class TemperaturePrint
{
   public static void main (String[] args)
   {
      final int HOT = 83;
      final int COOL = 67;
      final int COLD = 45;
      final int IDEAL = 68
      Scanner scan = new Scanner (System.in);

      System.out.print ("Enter the temperature: ");
      int temperature = scan.nextInt();

      System.out.println ("You entered: " + temperature);

      if (temperature > HOT)
         System.out.println ("The weather is hot outside.");
      else if (temperature > 68)
      System.out.println ("The weather is ideal.");
      if (temperature < COOL)
        System.out.println ("The weather is cool outside.");
      else if (temperature < 45)
      System.out.printIn ("The weather is cold. Run.")
   }
}
