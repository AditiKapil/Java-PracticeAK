public class equation
{
  public static void main(String args[])
  {
    new equation();
  }
  public equation()
  {
    System.out.println("Equation Calculator\n");
    int fx = IBIO.inputInt("Enter the first x co-ordinate: ");
    int fy = IBIO.inputInt("Enter the first y co-ordinate: ");
    int sx = IBIO.inputInt("Enter the second x co-ordinate: ");
    int sy = IBIO.inputInt("Enter the second y co-ordinate: ");
    int slope = (sy-fy)/(sx-fx);
    System .out.println("\nThe slope is "+slope);
    int e = slope*fx;
    int f = fy - e;
    System.out.println("The y intercept is "+f);
    int a = sx-fx;
    int b = sy-fy;
    double c = Math.pow(a,2);
    double d = Math.pow(b,2);
    double root = Math.sqrt(c+d);
    System.out.println("The distance between the two points is "+root);
  }
}
   
    
      
  