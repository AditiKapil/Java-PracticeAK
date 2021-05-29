public class Mmuffins
{
  public static void main (String[]args)
  {
    new Mmuffins();
  }
  public Mmuffins()
  {
    System.out.println ("Welcome to the Marvelous Muffins");
    int muffin = IBIO.inputInt ("How many muffins would you like? ");
    int num = 0;
    
    if (muffin >=1 && muffin <=9)
    {
      System.out.println ("The cost per muffin is $5");
      num =5;
    }
    else if (muffin >=10 && muffin <=19)
    {
      System.out.println ("The cost per muffin is $3");
      num = 3;
    }
    else if (muffin >=20 && muffin <=39){
      System.out.println ("The cost per muffin is $2");
      num = (2);
    }
    else if (muffin >=40){
      System.out.println ("The cost per muffin is $1");
      num = (1);
    }
    int total = (num*muffin);
    System.out.println ("The total cost is $" +total);
  }
}