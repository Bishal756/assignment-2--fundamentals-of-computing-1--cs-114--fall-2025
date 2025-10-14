import java.util.Scanner;
public class OneHundredBottlesOfBeer {
  public static void main(String[] args) 
  { 
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of verse you can to print(1-100):");
    int input= scanner.nextInt(); 
    System.out.println();

    while(input<1 || input>100){
      System.out.println("Invalid number");
      System.out.println("Enter the verse within 1-100:");
      input=scanner.nextInt();
    }

    for (int i= 100; i>100-input; i--){ 

      System.out.println( (i)+ " bottles of beer on the wall"); 
      System.out.println((i)+" bottles of beer"); 
      System.out.println("If one of those bottles should happen to fall"); 
      System.out.println((i-1) + " bottles of beer on the wall"); 
      System.out.println(); 
}
   scanner.close(); 
  } 
}