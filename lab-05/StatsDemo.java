import java.util.Scanner;
// TASK #1 Add the file I/O import statement here

/**
   This class reads numbers from a file, calculates the
   mean and standard deviation, and writes the results
   to a file.
*/

public class StatsDemo
{
   // TASK #1 Add the throws clause
   public static void main(String[] args)
   {
      double sum = 0;      // The sum of the numbers
      int count = 0;       // The number of numbers added
      double mean = 0;     // The average of the numbers
      double stdDev = 0;   // The standard deviation
      String line;         // To hold a line from the file
      double difference;   // The value and mean difference

      // Create an object of type Scanner
      Scanner keyboard = new Scanner (System.in);
      String filename;     // The user input file name

      // Prompt the user and read in the file name
      System.out.println("This program calculates " +
                         "statistics on a file " +
                         "containing a series of numbers");
      System.out.print("Enter the file name:  ");
      filename = keyboard.nextLine();

      // ADD LINES FOR TASK #2 HERE
      // Create a FileReader object passing it the filename
      // Create a BufferedReader object passing FileReader
      // object
      // Perform a priming read to read the first line of
      // the file
      // Loop until you are at the end of the file
      // Convert the line to a double value and add the
      // value to sum
      // Increment the counter
      // Read a new line from the file
      // Close the input file
      // Store the calculated mean

      // ADD LINES FOR TASK #3 HERE
      // Reconnect FileReader object passing it the
      // filename
      // Reconnect BufferedReader object passing
      // FileReader object
      // Reinitialize the sum of the numbers
      // Reinitialize the number of numbers added
      // Perform a priming read to read the first line of
      // the file
      // Loop until you are at the end of the file
      // Convert the line into a double value and
      // subtract the mean
      // Add the square of the difference to the sum
      // Increment the counter
      // Read a new line from the file
      // Close the input file
      // Store the calculated standard deviation

      // ADD LINES FOR TASK #1 HERE
      // Create a FileWriter object using "Results.txt"
      // Create a PrintWriter object passing the
      // FileWriter object
      // Print the results to the output file
      // Close the output file
   }
}