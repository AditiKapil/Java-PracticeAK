public class Triangles
{
  public static void main (String[] args)
  {
     new Triangles();
  }
  public Triangles()
  {
    int ang1 = IBIO.inputInt ("Enter the first angle: ");
    int ang2 = IBIO.inputInt ("Enter the second angle: ");
    int ang3 = IBIO.inputInt ("Enter the third angle: ");
    
    if (ang1+ang2+ang3 != 180)
      System.out.println ("Error");
   else if (ang1 == 60 && ang2 == 60 && ang3 == 60)
      System.out.println ("Equilateral");
   else if (ang1 == 90 || ang2 == 90 || ang3 == 90)
      System.out.println ("Right-Angled");
   else if (ang1 == ang2 || ang2 == ang3 ||  ang1 == ang3)
      System.out.println ("Isosceles");
   else
     System.out.println ("Scalene");
  }
}
    