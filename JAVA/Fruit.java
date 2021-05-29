public class Fruit 
{
public static void main (String[]args)
  {
new Fruit();
  }
public Fruit()
    {
        System.out.println("Welcome to Fruit Pop");
        int p = IBIO.inputInt("How many points do you have? ");
        System.out.println("You can have these icons;");
        if(p>10)
            System.out.print("Apple,");
        if(p>0)
            System.out.print(" Blueberry,");
        if(3000>>p>2000)
            System.out.print(" Coin,");
        if(p>2000)
            System.out.print(" Extra Time,");
        if(p>1000||p<400)
            System.out.print(" Heart,");
        if(p<1500)
            System.out.print(" Lemon,");
        if(p>50||p<2000)
            System.out.print(" Lime,");
        if(p>100)
            System.out.print(" Orange,");
        if(p>1500)
            System.out.print(" Robot.");
    }
}
