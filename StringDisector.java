import java.util.Scanner;

public class StringDisector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input string : ");

        // Step 1
        String str = scanner.nextLine();
        String userInput = scanner.nextLine();
        scanner.close();

        // Step 2
        str = str.toLowerCase();

        int vCount = 0;
        int cCount = 0;
        int Y = 0;
        int N = 0;

        // Step 3
        for (int i = 0; i < str.length(); i++)
        {
            // Step 4 checks whether a character is a vowel or not
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                               || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                // Increments the vowel counter
                vCount++;
            }
            // Step 5 checks whether a character is a consonant or not
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
            {
                // Increments the consonant counter
                cCount++;
            }
        }
        // Step 6, it prints it out
        System.out.println("Number of vowels: " + vCount);
        System.out.println("Number of consonants: " + cCount);

        // Step 7, ask the user if they would like to use it again
      System.out.println("Would you like to use the program again?: Y or N");
      if (userInput.equals("Y")){
        System.out.println("Here you go!");
      }
      else{
        System.out.println("Thanks for using the program!");
        System.out.println("Play again?(Y/N)");
    }
  }
}
