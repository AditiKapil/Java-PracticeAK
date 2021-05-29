public class Fruitpop
{
   public static void main (String[]args)
   {
     new Fruitpop();
   }
   public Fruitpop()
   {
     System.out.println ("Welcome to Fruit Pop ICS208 version!");
     int pts = IBIO.inputInt("How many points do you have?");
     
     if (pts >= 10)
       System.out.println ("Apple");
     
     System.out.println ("Blueberry");
     
     if (pts >= 2000 && pts<= 3000)
       System.out.println ("Coin");
     
     if (pts >= 2000)
       System.out.println ("Extra Time");
     
     if (pts >= 1000 || pts <= 400)
       System.out.println ("Heart");
     
     if (pts >= 50 && pts <= 2000)
       System.out.println ("Lime");
     
     if (pts <= 1500)
       System.out.println ("Lemon");
     
     if (pts >= 100)
       System.out.println("Orange");
  
    System.out.println ("Plum");
    
     if (pts >= 1500)
       System.out.println ("Robot");
   }
}