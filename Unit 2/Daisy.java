public class Daisy
{
  public static void main (String[] args)
  {
    new Daisy ();
  }
  public Daisy ()
  {
    int random = (int)(10 * Math.random() )+15;
    System.out.println(random);
    
    for(int x = 1; x <= random; x++)
    {
      if(x%2 == 0)
      {
        System.out.println("She/He loves me");
      }
      else
      {
        System.out.println("She/He loves me not");
      }
      
      try
{
Thread.sleep (100);
}
catch (InterruptedException m)
{
;
}
  }
  
  }
  }
