// Input and print
import java.util.Scanner; //imports the Scanner class from the java.util package

public class Main {
    public static void main(String[] args) { //the main method is the entry point of the program
        Scanner scanner = new Scanner(System.in); //creates a scanner object to read input from the user

        System.out.print("Enter a number: ");//prompts the user to enter a number
        int num = scanner.nextInt();//reads the number entered by the user


        System.out.println("You entered: " + num); //prints the number entered by the user
        scanner.close();  //used to close the scanner and free up resources
    }
}
