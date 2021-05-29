public class eqline
{
   public static void main (String args [])
   {
    new eqline();
   }
    public eqline ()
   {
   System.out.println ("Equation Calculator");
   double x1 = IBIO.inputInt ("\nEnter the first x co-ordinate:");
   double y1 = IBIO.inputInt ("\nEnter the first y co-ordinate:");
   double x2 = IBIO.inputInt ("\nEnter the second x co-ordinate:");
   double y2 = IBIO.inputInt ("\nEnter the second y co-ordinate:");
   
   double slope = (y2 - y1) / (x2 - y2);
   double yintercept = (y1 - slope * x1);
   double distance = Math.sqrt((x2 - x1)^2 + (y2 - y1)^2);
   
   System.out.println ("The slope is " + slope);
   System.out.println ("The y-intercept is " + yintercept);
   System.out.println ("The distance between the two points is " + distance);
  }
}