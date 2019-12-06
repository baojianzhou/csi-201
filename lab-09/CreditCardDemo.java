/**
   This program demonstrates the CreditCard class.
*/

public class CreditCardDemo
{
   public static void main(String[] args)
   {
      // Named constants
      final Money CREDIT_LIMIT  = new Money(1000);
      final Money FIRST_AMOUNT  = new Money(200);
      final Money SECOND_AMOUNT = new Money(10.02);
      final Money THIRD_AMOUNT  = new Money(25);
      final Money FOURTH_AMOUNT = new Money(990);

      // Create an instance of the Person class.
      Person owner = new Person("Christie", "Diane",
                     new Address("237J Harvey Hall",
                     "Menomonie", "WI", "54751"));

      // Create an instance of the CreditCard class.
      CreditCard visa = new CreditCard(owner,
                        CREDIT_LIMIT);

      // Display the credit card information.
      System.out.println(visa.getPersonals());
      System.out.println("Balance: " + visa.getBalance());
      System.out.println("Credit Limit: " +
                         visa.getCreditLimit());

      System.out.println();   // To print a new line

      // Attempt to charge the first amount and
      // display the results.
      System.out.println("Attempting to charge " +
                         FIRST_AMOUNT);
      visa.charge(FIRST_AMOUNT);
      System.out.println("Balance: " + visa.getBalance());

      System.out.println();   // To print a new line

      // Attempt to charge the second amount and
      // display the results.
      System.out.println("Attempting to charge " +
                         SECOND_AMOUNT);
      visa.charge(SECOND_AMOUNT);
      System.out.println("Balance: " + visa.getBalance());

      System.out.println();   // To print a new line

      // Attempt to pay using the third amount and
      // display the results.
      System.out.println("Attempting to pay " +
                         THIRD_AMOUNT);
      visa.payment(THIRD_AMOUNT);
      System.out.println("Balance: " + visa.getBalance());

      System.out.println();   // To print a new line

      // Attempt to charge using the fourth amount and
      // display the results.
      System.out.println("Attempting to charge " +
                         FOURTH_AMOUNT);
      visa.charge(FOURTH_AMOUNT);
      System.out.println("Balance: " + visa.getBalance());
   }
}