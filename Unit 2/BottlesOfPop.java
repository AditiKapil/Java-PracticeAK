public class BottlesOfPop
{
  public static void main (String args[])
  {
    new BottlesOfPop ();
  }
  public BottlesOfPop ()
  {
    for (int n = 100; n > 2; n--)
    {
      
      System.out.println(n+ " bottles of pop on the wall.");
      System.out.println(n+ " bottles of pop.");
      System.out.println("If one of those bottles should happen to fall...");
      System.out.println("There would be " +(n-1)+ " bottles of pop on the wall.");
    }
    
   System.out.println("2 bottles of pop on the wall.");
   System.out.println("2 bottles of pop.");
   System.out.println("If one of those bottles should happen to fall...");
   System.out.println("There would be 1 last bottle of pop on the wall.");
   
   
   System.out.println("1 bottle of pop on the wall.");
   System.out.println("1 bottle of pop.");
   System.out.println("If that bottle should happen to fall...");
   System.out.println("There would be no more bottles of pop on the wall...");
  }
}