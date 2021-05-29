public class circle
{
  public static void main(String args[])
  {
    new circle();
  }
  public circle()
  {
    System.out.println("Circles R Us");
    double r = IBIO.inputDouble("\nEnter a radius: ");
    System.out.println("\nOn a circle: ");
    double d = r*2;
    System.out.println("The diameter is: "+d);    
    double ab= Math.PI*Math.pow(r,2.0);
    System.out.println("The area is: "+ab);   
    double c = 2*Math.PI*r;
    System.out.println("The circumference is: "+c);   
    System.out.println("\nOn a sphere:");
    double sa = 4*ab;
    System.out.println("The surface area is: "+sa);
    double sq2 = Math.pow(r,3);
    double v = (4*Math.PI*sq2)/3;
    System.out.println("The volume is: "+v);   
    double a= Math.PI*Math.pow(r,2.0);
  }
}
