public class BloodTypes
{
  public static void main (String args[])
  {
    new BloodTypes ();
  }
  public BloodTypes ()
  { 
    String type[] = {"O", "A", "B", "AB"};
    double num[] = {46, 40, 10, 4};
    
   System.out.println ("Chart 1");
    for (int i = 0 ; i < num.length ; i++)
      System.out.print (num[i]+ " ");
    System.out.println ("");
    System.out.println ("");
    
    System.out.println("Chart 2");
    System.out.println ("Blood Types");
    for (int i = 0 ; i < type.length ; i++)
      System.out.println (type[i]);
    System.out.println ("");
    System.out.println ("");
    
    System.out.println ("Chart 3");
    System.out.println ("The blood types are");
    for (int i = 0 ; i < type.length ; i++)
      System.out.print (type[i]+", ");
    System.out.println ("");
    System.out.println ("");
    
    System.out.println ("Chart 4");
    System.out.println ("The percentages are");
    for (int i = 0 ; i < num.length ; i++)
      System.out.print (+num[i]+"%, ");
    System.out.println ("");
    System.out.println ("");
    
    System.out.println ("Chart 5");
    for (int i = 0 ; i < type.length ; i++)
      System.out.println ((i+1)+ ". " +type[i]+ " has " +num[i]+"%");
    System.out.println ("");
    System.out.println ("");
    
    
    System.out.println ("Chart 6");
      for (int i = 0 ; i < type.length ; i++)
      System.out.println (+num[i]+"% of the population has blood type" +type[i]+".");
    System.out.println ("");
    System.out.println ("");
    
    System.out.println ("Chart 7");
    System.out.println ("Type Percentage");
    System.out.println ("---------------");
    for (int i = 0 ; i < type.length ; i++)
      System.out.println (type[i]+" " +num[i]);
    System.out.println ("");
    System.out.println ("");
    
    
    System.out.println ("Chart 8");
    System.out.println ("Blood Type %");
    System.out.println ("---------------");
    for (int i = 0 ; i < type.length ; i++)
      System.out.println (type[i]+" " +num[i]+ "%");
    System.out.println ("");
    System.out.println ("");
    
    
    System.out.println ("Chart 9");
    System.out.println ("Blood Type:");
    for (int i = 0 ; i < type.length ; i++)
      System.out.print (type[i]+ " ");
    System.out.println ("");
    System.out.println ("Percentage:");
    for (int n = 0 ; n < num.length ; n++)
      System.out.print (num[n]+ " ");
  }
}