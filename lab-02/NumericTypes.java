import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.swing.JOptionPane;
import javax.swing.JFrame;

// TASK #2(Alternate)
// Add an import statement for the JOptionPane class

/**
   This program demonstrates how numeric types and
   operators behave in Java.
*/

public class NumericTypes
{
   public static void main (String [] args)
   {
      Scanner myObj = new Scanner(System.in);
      String test1= JOptionPane.showInputDialog("Please input mark for test 1: ");

        String test2= JOptionPane.showInputDialog("Please input mark for test 2: ");

        String test3= JOptionPane.showInputDialog("Please input mark for test 3: ");

      

      // Identifier declarations
      final int NUMBER = 2 ;        // Number of scores
      final int SCORE1 = 100;       // First test score
      final int SCORE2 = 95;        // Second test score
      final int BOILING_IN_F = 212; // Boiling temperature
      double fToC;                     // Temperature Celsius
      double average;               // Arithmetic average
      String output;                // Line of output

      System.out.println("Enter first name");
      String firstName = myObj.nextLine();  // Read user input
      System.out.println("Last name");
      String lastName = myObj.nextLine();  // Read user input
      String fullName = firstName + " " + lastName;
      System.out.println(fullName);
      // TASK #3 declare variables used here
      // TASK #4 declare variables used here

      // Find an arithmetic average.
      average = (SCORE1 + SCORE2) / NUMBER;
      output = SCORE1 + " and " + SCORE2 +
               " have an average of " + average;
      System.out.println(output);

      // Convert Fahrenheit temperature to Celsius.
      fToC = 5./9. * (BOILING_IN_F*1.0 - 32);
      output = BOILING_IN_F + " in Fahrenheit is " +
               fToC + " in Celsius.";
      System.out.println(output);
      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #2 HERE
      // Prompt the user for first name
      // Read the user's first name
      // Prompt the user for last name
      // Read the user's last name
      // Concatenate the user's first and last names
      // Print out the user's full name

      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #3 HERE
      // Get the first character from the user's first name
      // Print out the user's first initial
      // Convert the user's full name to uppercase
      // Print out the user's full name in uppercase

      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #4 HERE
      // Prompt the user for a diameter of a sphere
      // Read the diameter
      // Calculate the radius
      // Calculate the volume
      // Print out the volume
   }
}