public class FirstMethods
{
  public static void main (String args[])
  {
    new FirstMethods ();
  }
  
  
  public FirstMethods ()
  {
    square ();
    blank ();
    circle ();
    blank ();
    bunny ();
    blank ();
    line ();
    blank ();
    count ();
    blank ();
    signature ();
  }
  
  
  public void blank ()
  {
  System.out.println ("     ");
  }
  
  
  public void square ()
  {
  System.out.println ("----------");
  System.out.println ("----------");
  System.out.println ("----------");
  System.out.println ("----------");
  System.out.println ("----------");
  }
  
  public void circle ()
  {
                  System.out.println ("    ooo OOO OOO ooo " );
               System.out.println ("   oOO                 OOo ");
          System.out.println   ("  oOO                         OOo ");
        System.out.println  (" oOO                               OOo ");
       System.out.println  ("oOO                                   OOo ");
    System.out.println ("  oOO                                       OOo ");
    System.out.println (" oOO                                         OOo ");
   System.out.println (" oOO                                           OOo ");
  System.out.println (" oOO                                             OOo ");
   System.out.println ("oOO                                             OOo ");
  System.out.println (" oOO                                             OOo ") ;
  System.out.println (" oOO                                             OOo ");
  System.out.println (" oOO                                             OOo ") ;
   System.out.println ("oOO                                           OOo ");
    System.out.println (" oOO                                         OOo ");
    System.out.println  (" oOO                                       OOo ");
      System.out.println ("  oOO                                   OOo ");
        System.out.println   ("oO                                OOo ");
          System.out.println   (" oOO                         OOo ");
                System.out.println (" oOO                 OOo ");
                 System.out.println   ("  ooo OOO OOO ooo ");
  }
  
  public void bunny ()
  {
   System.out.println("                      .'. ");
   System.out.println("                     /  o");
   System.out.println("                     /  /");
   System.out.println("                    / , /");
   System.out.println("        .-------.--- / ");
   System.out.println("       '._ __.-/ o. o /. "); 
   System.out.println("          '   (    Y  ) '");
   System.out.println("               )     / ");
   System.out.println("              /     ( ");
   System.out.println("             /       Y  ");
   System.out.println("         .-'         o  ");
   System.out.println("        /  _     /    /  ");
   System.out.println("       /    `. '. ) /' ) ");
   System.out.println("      Y       )( / /(,/  ");
   System.out.println("     ,o      /     )   ");
   System.out.println("    ( o     /     /   ");
   System.out.println("     ' /_  (__   (__  ");
   System.out.println("         '-._,)--._,)  ");               
   }

  public void line ()
  {
  for (int i = 1; i <= 15; i++)
  {
    System.out.println ("*");
  }
  }
                     
  public void count ()
  {
  for (int b = 0; b <= 11; b++)
  {
    System.out.println ("b");
  }
  }
  
  public void signature ()
  {
  System.out.println (" Aditi Kapil [Extended French] ");
  System.out.print (" Quote: No one can underestimante the power of a woman");
  }
  }