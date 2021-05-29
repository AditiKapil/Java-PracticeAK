public class Apartment
{
  public static void main (String args[])
  {
    new Apartment ();
  }
  public Apartment ()
  {
    int apart[] = {100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110,
      111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121,
      122, 123, 124};
    
    System.out.println ("Plumbing List - Every 5th");
    for (int i = 5 ; i < apart.length ; i+=5)
      System.out.print (apart [i] + " ");
    System.out.println ();
    
    System.out.println ("Fire Alarm - Every Aprt");
    for (int i = 0 ; i < apart.length ; i++)
      System.out.println (apart [i] + " ");
    System.out.println();
    
    System.out.println ("Voter's List - Every Aprt");
    for (int i = 0 ; i < apart.length ; i++)
      System.out.print (apart [i] + " ");
    System.out.println();
    
    System.out.println ("Light Replacements - Every even numbered Aprt");
    for (int i = 0 ; i < apart.length ; i+=2)
      System.out.println (apart [i] + " ");
    System.out.println();
    
    System.out.println ("Fridge Replacements - Every 3rd Aprt");
    for (int i = 0 ; i < apart.length ; i+=3)
      System.out.println (apart [i] + " ");
    System.out.println();
    
    System.out.println ("Carpet Cleaning - Every 4th Aprt (starting with 103)");
    for (int i = 3 ; i < apart.length ; i+=4)
      System.out.print (apart [i] + " ");
    System.out.println();
    
    System.out.println ("AC Checks - Aprt over 115");
    for (int i = 0 ; i < apart.length ; i++)
    {
      if (apart[i] > 115)
        System.out.print (apart [i] + " ");
    }
    System.out.println();
  }
}