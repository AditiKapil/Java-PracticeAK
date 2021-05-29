public class CirclesRus
{
  public static void main (String[] args)
  {
     new CirclesRus();
  }
  public CirclesRus()
  {
    System.out.println ("Circles R Us");
    
    System.out.println ("\nFor a circle: ");
    int radius = IBIO.inputInt ("Enter a radius; ");
    double cdiameter = (radius*2);
    
    System.out.println ("The diameter is" + cdiameter);
    double carea = (Math.PI*Math.pow(radius,2));
    System.out.println ("The area is"+ carea);
    
    System.out.println ("For a sphere:");
    double sarea = (4*Math.PI*Math.pow(radius,2));
    
    System.out.println("The surface area is" + sarea);
    double svolume = ((4*Math.PI*Math.pow(radius,3) / 3));
    System.out.println ("The volume is " + svolume);
  }
}
                        