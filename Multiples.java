public class Multiples {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter in an integer");
    int number = scan.nextInt();
    System.out.println("Enter the upper limit");
    int number = scan.nextInt();
    int count = 0;
    max = scan.nextInt();
    
    for(int i = 1; i*input <= max; i++){
      count++;
      if(count % 5 == 0)
        System.out.print("/n");
      System.out.print(i*input + ",");
    }
  }
}
