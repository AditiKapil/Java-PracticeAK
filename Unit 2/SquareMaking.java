public class SquareMaking 
{
  public static void main (String args[])
  {
    new SquareMaking ();
  }
  public SquareMaking ()
  {
    System.out.println ("--Welcome to the Square Making Program--");
    System.out.println("You want squares, we make squares !");
    int star = IBIO.inputInt("What dimension of square? (-1 to quit) ");
    while (star != -1)
    {
      for (int h = 1; h <= star; h++)
      {
        for (int l = 1; l <= star; l++)
        {
          System.out.print("*");
        }
        System.out.println(" ");
      }
      star = IBIO.inputInt ("What dimension of square? (-1 to quit) ");
    }
{
  
  System.out.print("Goodbye! \n Hope you enjoyed making squares.");
}
  }
}
    