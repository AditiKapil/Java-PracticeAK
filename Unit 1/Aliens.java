public class Aliens
{
  public static void main (String[] args)
  {
  new Aliens();
   }
  public Aliens()
   {
    int antena = IBIO.inputInt ("How many attenae did you see one the Alien?");
    int eyes = IBIO.inputInt ("How many eyes did you see on the Alien?");
    
    if (antena <= 2 && eyes <= 3)
      System.out.println ("Mercurian");
    if (antena <= 6 && eyes >= 2)
      System.out.println ("Saturian");
    if (antena >= 3 && eyes <= 4)
      System.out.println ("Martian");
    
  }
  }