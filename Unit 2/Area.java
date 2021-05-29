//Fill in the methods at the bottom to make the program run correctly

public class Area
{
  public static void main (String args[])
  {
    new Area ();
  }
  
  public Area ()
  {
    char more = 'y';
    
    while (more == 'Y' || more == 'y')
    {
      printmenu ();
      int answer = IBIO.inputInt ("Which object do you have? (1-5) ");
      double area = -1;
      if (answer == 1)
        area = circle ();
      else if (answer == 2)
        area = rectangle ();
      else if (answer == 3)
        area = triangle ();
      else if (answer == 4)
        area = square ();
      else if (answer == 5)
        area = sphere ();
      
      if (area == -1)
        System.out.println ("You must choose 1 to 5.");
      else
        System.out.println ("The area is " + area);
      
      System.out.println ("");
      more = IBIO.inputChar ("Do you want to find the area of anything else? (y/n) ");
    } //while
    
    System.out.println ("Goodbye!");
  } //constructor
  
  
  public void printmenu ()
  {
    /*Add the Code to print the menu:
     *** Menu ***
     1. circle
     2. rectangle
     3. triangle
     4. square
     5. sphere
     */
    System.out.println(" *** Menu *** ");
    System.out.println(" 1. Circle ");
    System.out.println(" 2. Rectangle ");
    System.out.println(" 3. Triangle ");
    System.out.println(" 4. Square ");
    System.out.println(" 5. Sphere ");
  }
  
  
  public double circle ()
  { //Code to get info needed and calculate area of a circle
      double radius = IBIO.inputDouble("Enter the radius: ");
      //Area of the Circle
      double areac = Math.PI * (radius * radius);
      System.out.println("The area of the circle is: " + areac);
    
    //change the return line to return the area you calculated
    return areac ;
  } //circle
  
  
  public double rectangle ()
  { //Code to get info needed and calculate area of a rectangle
    double length = IBIO.inputDouble("Enter the length of Rectangle:");
    double width = IBIO.inputDouble("Enter the width of Rectangle:");
    //Area of the Rectangle
    double arear = length*width;
    System.out.println("The area of the Rectangle is:" + arear);
    
    //change the return line to return the area you calculated
    return arear;
  } //rectangle
  
  
  public double triangle ()
  { //Code to get info needed and calculate area of a triangle
      double base = IBIO.inputDouble("Enter the width of the Triangle:");
      double height = IBIO.inputDouble("Enter the height of the Triangle:");
      //Area of the Triangle
      double areat = (base* height)/2;
      System.out.println("Area of the Triangle is: " + areat);
      
    //change the return line to return the area you calculated
    return areat;
  } //triangle
  
  
  public double square ()
  { //Code to get info needed and calculate area of a square
       double side = IBIO.inputDouble("Enter Side of Square:");
   //Area of the Square
       double areas = side*side; 
       System.out.println("Area of the Square is: "+areas);
    //change the return line to return the area you calculated
    return areas;
  } //square
  
  
  public double sphere ()
  { //Code to get info needed and calculate surface area of a sphere
      double areasp = 0;
      double radiussp = 0;
      radiussp = IBIO.inputDouble("Radius of Sphere: "); 
    //Surface area of a sphere
       areasp = 4 * Math.PI * Math.pow(radiussp, 2);
       System.out.println("The Surface Area of the Sphere: " + areasp);
    //change the return line to return the surface area you calculated
    return areasp;
  } //sphere
} //class