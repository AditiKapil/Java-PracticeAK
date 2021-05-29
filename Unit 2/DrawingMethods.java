/*
 Call the circ and line methods inside
 drawingMethods to draw a
 circle, tree, spoon and barbell.

     **      **     **     **
    *  *    *  *   *  *   *  *
     **      **     **     **
     ||      ||     ||
     ||      ||
     **
    *  *
     **
*/

public class DrawingMethods
{
  public static void main (String args[])
  {
    new DrawingMethods ();
  }
  
  
  public DrawingMethods ()
  {
    System.out.println ("Here is a circle:");
    circ ();
    System.out.println ("Here is a tree:");
    circ ();
    lines ();
    System.out.println ("Here is a spoon:");
    circ ();
    lines ();
    lines ();
    System.out.println ("Here is a barbell:");
    circ ();
    lines ();
    lines ();
    circ ();
  }
  
  
  public void circ ()
  {
    System.out.println ("  **");
    System.out.println (" *  *");
    System.out.println ("  **");
  }
  
  
  public void lines ()
  {
    System.out.println ("  ||");
  }
}
