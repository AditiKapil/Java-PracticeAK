public class billtotal
{
   public static void main (String[]args)
   {
     new billtotal();
   }
   public billtotal()
   {
     System.out.println ("Welcome to the Bill Subtotalling Program");
     double price1 = IBIO.inputDouble ("\nPlease enter the price of item #1:  $");
     double price2 = IBIO.inputDouble ("Please enter the price of item #2:  $");
     double price3 = IBIO.inputDouble ("Please enter the price of item #3:  $");
     double price4 = IBIO.inputDouble ("Please enter the price of item #4:  $");
     double price5 = IBIO.inputDouble ("Please enter the price of item #5:  $");
     double subtotal = price1 + price2 + price3 + price4 + price5;
     System.out.println ("\nThe subtotal is:  $" + subtotal ++);
     double tax = subtotal * 0.13;
     System.out.println ("The tax is (13%):  $" + tax ++);
     double total = subtotal + tax;
     System.out.println ("The total is:  $" + total ++);
   }
}