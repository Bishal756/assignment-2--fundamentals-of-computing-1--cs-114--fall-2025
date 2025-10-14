import java.util.Scanner;
public class PrintsVowelsandNonVowel{
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the input:");
    String input = scanner.nextLine();
    input = input.toLowerCase();

    int counta=0 , counte =0, counti = 0, counto = 0, countu = 0;
    int nonVowels=0;


    for (int i = 0; i < input.length(); i++) {
      char ch = input.charAt(i);
      if (ch == 'a') counta ++;
      
      else if (ch =='e') counte ++;
      else if (ch =='i') counti++;
      else if (ch =='o') counto++;
      else if (ch=='u') countu++;
      else if (Character.isLetter(ch)) nonVowels++;
  
  }
  System.out.println();
  System.out.println("Number of a: " + counta);
  System.out.println("Number of e: " + counte);
  System.out.println("Number of i: " + counti);
  System.out.println("Number of o: " + counto);
  System.out.println("Number of u: " + countu);
  System.out.println("Number of non-vowels character: " + nonVowels);
scanner.close();
}
}
