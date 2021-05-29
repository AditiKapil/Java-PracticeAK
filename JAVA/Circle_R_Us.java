public class Circle_R_Us
{
  public static void main(String args[])
  {
    new Circle_R_Us();
  }
  public Circle_R_Us()
  {
    double radius = IBIO.inputDouble("Enter a radius: ");
    System.out.println("\nOn a circle: ");
    double diameter = 2*radius;
    double area = Math.PI*Math.pow(radius,2);
    double circumference = 2*Math.PI*radius;
    System.out.println("The diameter is "+diameter);
    System.out.println("The area is "+area);
    System.out.println("The circumference is "+circumference);
    System.out.println("\nOn a sphere: ");
    double surfaceArea = area*4;
    double volume = (4*Math.PI*Math.pow(radius,3))/3;
    System.out.println("The surface area is "+surfaceArea);
    System.out.println("The volume is "+volume);
  }
}
    
    