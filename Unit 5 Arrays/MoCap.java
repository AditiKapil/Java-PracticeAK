public class MoCap
{
  public static void main (String args[])
  {
    new MoCap ();
  }
  public MoCap ()
  {
    int x[] = {234, 345, 348, 456, 567, 765, 654, 544, 587, 578};
    int y[] = {456, 456, 345, 347, 346, 467, 562, 562, 532, 576};
    int z[] = {345, 324, 312, 317, 304, 305, 307, 308, 309, 298};
    
    for (int i = 0 ; i < x.length ; i++)
    {
      System.out.println ( "{" +x[i]+ "," +y[i]+ "," +z[i]+ ")");
    }
    
    //Minimum x,y,z
    {
      int min = x [0];
      for (int i = 0 ; i < x.length ; i++)
      {
        if (min > x [i])
          min = x [i];
      }
      System.out.println ("\nThe minimum x co-ordinate is: " + min);
    }
    {
      int min = y [0];
      for (int i = 0 ; i < y.length ; i++)
      {
        if (min > y [i])
          min = y [i];
      }
      System.out.println ("\nThe minimum y co-ordinate is: " + min);
    }
    {
      int min = z [0];
      for (int i = 0 ; i < z.length ; i++)
      {
        if (min > z [i])
          min = z [i];
      }
      System.out.println ("\nThe minimum z co-ordinate is: " + min); 
    }
    
    //Maximum x,y,z
    {
      int max = x[0];
      for (int i=1; i< x.length; i++)
      { if (x[i]>(max))
        max = x[i];
      }
      System.out.println("The maxium x co-ordinate is " + max);
    }
    {
      int max = y[0];
      for (int i=1; i< y.length; i++)
      { if (y[i]>(max))
        max = y[i];
      }
      System.out.println("The maxium y co-ordinate is " + max);
    }
    {
      int max = z[0];
      for (int i=1; i< z.length; i++)
      { if (z[i]>(max))
        max = z[i];
      }
      System.out.println("The maxium z co-ordinate is " + max);
    }
    
    //Average x,y,z
    {
      int sum = 0;
      for (int i=0; i< x.length; i++)
        sum = sum + x[i];
      double average = sum / x.length;
      System.out.println ("The average x co-ordinate is " + average);
    }
    {
      int sum = 0;
      for (int i=0; i< y.length; i++)
        sum = sum + y[i];
      double average = sum / y.length;
      System.out.println ("The average y co-ordinate is " + average);
    }
    {
      int sum = 0;
      for (int i=0; i< z.length; i++)
        sum = sum + z[i];
      double average = sum / z.length;
      System.out.println ("The average z co-ordinate is " + average);
    }
    
    //#7 Control points close
    System.out.println ("Control points close");
    for (int i = 0; i< x.length; i++)
      if (x[i] <= 550)
      System.out.println ( "{" +x[i]+ "," +y[i]+ "," +z[i]+ ")");
    System.out.println ("");
    
    //#8 In focus points
    System.out.println ("In focus points");
    for (int i=0; i< z.length; i++)
      if (z[i] <= 315 && z[i] >= 304)
      System.out.println ( "{" +x[i]+ "," +y[i]+ "," +z[i]+ ")");
    System.out.println ("");
  }
}