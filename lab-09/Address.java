/**
   This class defines an address using a street,
   city, state, and zipcode.
*/

public class Address
{
   // The street number and name
   private String street;

   // The city in which the address is located
   private String city;

   // The state in which the address is located
   private String state;

   // The zip code associated with the city and street
   private String zip;

   /**
      Constructor
      @param road Describes the street number and name.
      @param town Describes the city.
      @param st Describes the state.
      @param zipCode Describes the zip code.
   */

   public Address(String road, String town, String st,
                  String zipCode)
   {
      street = road;
      city = town;
      state = st;
      zip = zipCode;
   }

   /**
      The toString method
      @return Information about the address.
   */

   public String toString()
   {
      return (street + ", " + city +
              ", " + state + " " + zip);
   }
}