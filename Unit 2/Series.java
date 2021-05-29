  public class Series
{
    public static void main (String[] args)
    {
        new Series ();
    }
    
    public Series()
    {
    System.out.println ("Group A Counting");
    
    for (int num1=0; num1<=12; num1++)
      { 
        System.out.print(num1 + " " );
      }
      System.out.println(" "); 
      
      for (int num2=1; num2<=19; num2++)
      { 
        System.out.print(num2 + " " );
      }
      System.out.println(" "); 
      
      for (int num3=12; num3<=22; num3++)
      { 
        System.out.print(num3 + " " );
      }
      System.out.println(" "); 
      
      for (int num4=101; num4<=115; num4++)
      { 
        System.out.print(num4 + " " );
      }
      System.out.println(" ");
      
      {
    System.out.println ("Group B Backwards");
    for (int num5=12; num5>=1; num5+=-1)
      { 
        System.out.print(num5 + " " );
      }
      System.out.println(" ");
      
      for (int num6=20; num6>0; num6+=-1)
      { 
        System.out.print(num6 + " " );
      }
      System.out.println(" "); 
      
      for (int num7=22; num7>11; num7+=-1)
      { 
        System.out.print(num7 + " " );
      }
      System.out.println(" ");
      
      for (int num8=115; num8>100; num8+=-1)
      { 
        System.out.print(num8 + " " );
      }
      System.out.println(" ");
    }
      {
      System.out.println("Group C Skip Counting");
    for (int num9=0; num9<=18; num9+=2)
      { 
        System.out.print(num9 + " " );
      }
      System.out.println(" ");
      
      for (int num=1; num<=19; num+=2)
      { 
        System.out.print(num + " " );
      }
      System.out.println(" "); 
      
      for (int num=0; num<=30; num+=3)
      { 
        System.out.print(num + " " );
      }
      System.out.println(" ");
      
      for (int num=0; num<=40; num+=4)
      { 
        System.out.print(num + " " );
      }
      System.out.println(" ");
      
      for (double num=1.0; num<=5.5; num+=0.5)
      { 
        System.out.print(num + " " );
      }
      System.out.println(" ");
    }
      {
      System.out.println("Group D One thing, Repeated");
     for (int i=1; i <=13; i++)
      { 
        System.out.print(" * " );
      }
      System.out.println(" ");
      
      for (int num=1; num<=13; num++)
      { 
        System.out.print(" 2 ");
      }
      System.out.println(" "); 
      
      for (int num=1; num<=13; num++)
      { 
        System.out.print(" 1 0 " );
      }
      System.out.println(" ");
      
      for (int num=1; num<=20; num++)
      { 
        System.out.print("la" );
      }
      System.out.println(" ");
      
      for (int num=1; num<=6; num++)
      { 
        System.out.print( "- 1 + 1" );
      }
      System.out.println(" ");
    }
      {
           System.out.println ("Group E Powers - Multiply and Divide");
            for (int num = 0 ; num <= 12 ; num++)
            {
                System.out.print (num * num + " ");
            }
            System.out.println (" ");

            for (int num = 0 ; num <= 12 ; num++)
            {
                System.out.print (num * num * num + " ");
            }
            System.out.println (" ");

            for (int num = 0 ; num <= 11 ; num++)
            {
                System.out.print ( (int) Math.pow (2, num) + " ");
            }
            System.out.println (" ");

            for (int num = 0 ; num <= 10 ; num++)
            {
                System.out.print ( (int) Math.pow (3, num) + " ");
            }
            System.out.println (" ");

            for (double num = 3 ; num >= -2 ; num += -1)
            {
                System.out.print ( (int) Math.pow (10, num) + " ");
            }
            System.out.println (" ");
        }
    }
}