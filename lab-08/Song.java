/*
   This class stores data about a song.
*/

public class Song
{
   private String title;   // The song's title
   private String artist;  // The song's artist

   /**
      Constructor
      @param title A reference to a String object
                   containing the song's title.
      @param artist A reference to a String object
                    containing the song's artist.
   */

   public Song(String title, String artist)
   {
      this.title = title;
      this.artist = artist;
   }

   /**
      The toString method
      @return A String object containing the name
              of the song and the artist.
   */

   public String toString()
   {
      return title + " by " + artist + "\n";
   }
}