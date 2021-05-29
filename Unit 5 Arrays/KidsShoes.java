public class KidsShoes
{
  public static void main (String args[])
  {
    new KidsShoes ();
  }
  public KidsShoes ()
  {
    
    int size[] = {0, 1, 2, 3, 4, 5, 6, 7, 8};
    int num = 9;
    for (int i =0; i<num;i++)
      System.out.println("Size: " +size[i]);
    
    int brown[] = {1, 4, 5, 6, 7, 2, 1, 2, 8};
    int num1 = 9;
    for (int i =0; i<num;i++)
      System.out.println("Brown: " +brown[i]);
    
    int black[] = {4, 5, 6, 1, 8, 3, 0, 0, 0};
    int num2 = 9;
     for (int i =0; i<num2;i++)
      System.out.println("Black: " +black[i]);
     
    int tan[] = {2, 2, 3, 4, 7, 82, 4, 7, 5};
    int num3 = 9;
     for (int i =0; i<num3;i++)
      System.out.println("Tan: " +tan[i]);
   
    
    System.out.println ("KID'S SHOES MAIN MENU");
    System.out.println ("(a) Add a shoe");
    System.out.println ("(r) Remove a shoe");
    System.out.println ("(f) Find a shoe");
    System.out.println ("(p) Print all shoes");
    System.out.println ("(q) Quit");
    char choice = IBIO.inputChar ("Which would you like? >> ");
    
    if (choice=='a')
    {
      String colour = IBIO.inputString ("Enter colour (brown/black/tan) >> "); 
      int size1 = IBIO.inputInt ("Enter the size (0-8) >> ");
      if (colour.equalsIgnoreCase ("Black"))
        black [size1] = (black [size1] + 1);
      else if (colour.equalsIgnoreCase ("Brown")) 
        brown [size1] = (brown [size1] + 1);
      else if (colour.equalsIgnoreCase ("Tan"))
        tan [size1] = (tan [size1] + 1);

      System.out.println ("Shoes added.");
    }
    else if (choice == 'r') {
      String colour = IBIO.inputString ("Enter colour (brown/black/tan) >> ");
      int size2 = IBIO.inputInt ("Enter the size (0-8) >> ");
       if (colour.equalsIgnoreCase ("Black"))
        black [size2] = (black [size2] - 1);
      else if (colour.equalsIgnoreCase ("Brown")) 
        brown [size2] = (brown [size2] - 1);
      else if (colour.equalsIgnoreCase ("Tan"))
        tan [size2] = (tan [size2] - 1);
      
      System.out.println ("Shoes removed.");
    }
    else if (choice == 'f'){
      String colour1 = IBIO.inputString ("Enter colour (brown/black/tan) >> ");
      int size3 = IBIO.inputInt ("Enter the size (0-8) >> ");
      
 if (colour1.equalsIgnoreCase ("Tan"))
  System.out.println("There are" + tan[size3] + "Shoes left in stock");
if (colour1.equalsIgnoreCase ("Brown"))
  System.out.println("There are" + brown[size3] + "Shoes left in stock");
if (colour1.equalsIgnoreCase ("Black"))
  System.out.println("There are" + black[size3] + "Shows left in stock");
    }
    else if (choice == 'p'){
    for (int i = 0 ; i < size.length ; i++)
      System.out.println ("Size: " size [i] + " ");
    System.out.println();
    for (int i = 0 ; i < brown.length ; i++)
      System.out.println ("Brown: " brown [i] + " ");
    System.out.println();
    for (int i = 0 ; i < black.length ; i++)
      System.out.println ("Black: "black [i] + " ");
    System.out.println();
    for (int i = 0 ; i < tan.length ; i++)
      System.out.println ("Tan: "tan [i] + " ");
    System.out.println();
    }
    else {
      System.out.println ("Goodbye!");
    }
  }
}