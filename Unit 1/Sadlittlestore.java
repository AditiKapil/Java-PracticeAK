public class Sadlittlestore
{
   public static void main (String[] args)
   {
     new Sadlittlestore();
   }
   public Sadlittlestore()
   {
     System.out.println("**************************************");
     System.out.println("Welcome to Aditi's Asian Grocery Store");
     System.out.println("**************************************");
     
     int dumplings = IBIO.inputInt ("1. How many bags of dumplings would you like? (24 per bag)");
     int samosas = IBIO.inputInt ("2. How many samosas would you like?");
     int ramen = IBIO.inputInt ("3. How many packets of ramen would you like?");
     int naan = IBIO.inputInt ("4. How many bags of naan would you like? (6 per bage)");
     int sushi = IBIO.inputInt ("5. How many trays of Sushi would you like? (12 pieces per tray)");
     
     System.out.println("**************************************");
     System.out.println("  Aditi's Asian Grocery Store Bill    ");
     System.out.println("**************************************");
     
     double dumplings2 = (dumplings*6.00);
     double samosas2 = (samosas*1.25);
     double ramen2 = (ramen*2.00);
     double naan2 = (naan*4.50);
     double sushi2 = (sushi*6.25);
     
     System.out.println (""+dumplings+" @ $6.00 = "+dumplings2);
     System.out.println (""+samosas+" @ $1.25 = "+samosas2);
     System.out.println (""+ramen+" @ $2.00 = "+ramen2);
     System.out.println (""+naan+" @ $4.50 = "+naan2);
     System.out.println (""+sushi+" @ $6.25 = "+sushi2);
     
     double subtotal = (dumplings2+samosas2+ramen2+naan2+sushi2);
     double tax = (subtotal*0.13);
     double total = (subtotal*1.13);
     System.out.println ("Subtotal: $" +subtotal);
     System.out.println ("Taxes: $" +tax);
     System.out.println ("Total: $" +total);
     
     double amount = IBIO.inputDouble ("Enter the amount of money paid: $");
     
     if (amount < total)
       System.out.println("That's not enough. You need an aditional of" +total+ - +amount);
     if (amount < total)
       System.out.println("Here is your change." +amount+ - +total);
     if (amount == total)
       System.out.println("Have a good day!");
   }
}