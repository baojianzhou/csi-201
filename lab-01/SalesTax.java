import java.util.Scanner;  // Needed for the Scanner class

/**
   This program calculates the total price which includes
   sales tax.
*/

public class SalesTax
{
   public static void main(String[] args)
   {
      // Identifier declarations
      final double TAX_RATE = 0.055;
      double price;
      double tax
      double total;
      String item;

      // Create a Scanner object to read from the keyboard.
      Scanner keyboard = new Scanner(System.in);

      // Display prompts and get input.
      System.out.print("Item description:  ");
      item = keyboard.nextLine();
      System.out.print("Item price:  $");
      price = keyboard.nextDouble();

      // Perform the calculations.
      tax = price + TAX_RATE;
      totl = price * tax;

      // Display the results.
      System.out.print(item + "        $");
      System.out.println(price);
      System.out.print("Tax          $");
      System.out.println(tax);
      System.out.print("Total        $");
      System.out.println(total);
   }
}
