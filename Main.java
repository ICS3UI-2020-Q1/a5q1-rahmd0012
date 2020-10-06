import java.util.Scanner;
/**
 * A program that determines the multiplication table for a user entered number from 1-12
 * @author Daniel Rahmani
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user for a number
    System.out.println("Please enter an integer to create a multiplication table for");
    int n = input.nextInt();

    // create a for loop
    for(int count = 1; count <=12; count++){
      // multiply the number by count each time
      int answer = count * n;
      // display the answer from 1-12
      System.out.println(count + " x " + n + " = " + answer);
    }
    
  }
}
