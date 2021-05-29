public class Alien 
{
public static void main (String[]args)
  {
new Alien();
  }
public Alien()
    {
        int a = IBIO.inputInt("How many antennas? ");
        int e = IBIO.inputInt("How many eyes? ");
        if(a>=3 && e<4)
            System.out.println("Martian");
        if(a<=6 && e>=2 && e<8)
            System.out.println("Saturian");
        if(a>=2 && e<3)
            System.out.println("Mercurian");
        if(a>7 && e>6)
            System.out.println();
    }
}