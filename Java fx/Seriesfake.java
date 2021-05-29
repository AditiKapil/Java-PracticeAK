public class Seriesfake
{
    public static void main (String[] args)
    {
        new Seriesfake ();
    }
    
    public Seriesfake()
    {
      System.out.println("Group A Counting"); 
        
      for (int num=0; num<=12; num++)
      { 
        System.out.print(num + " " );
      }
      System.out.println(" "); 
      
      for (int num=1; num<=19; num++)
      { 
        System.out.print(num + " " );
      }
      System.out.println(" "); 
      
      for (int num=12; num<=22; num++)
      { 
        System.out.print(num + " " );
      }
      System.out.println(" "); 
      
      for (int num=101; num<=115; num++)
      { 
        System.out.print(num + " " );
      }
      System.out.println(" ");
      
   {
      System.out.println(" ");
      System.out.println("Group B Backwards"); 
        
      for (int num=12; num>=1; num+=-1)
      { 
        System.out.print(num + " " );
      }
      System.out.println(" ");
      
      for (int num=20; num>0; num+=-1)
      { 
        System.out.print(num + " " );
      }
      System.out.println(" "); 
      
      for (int num=22; num>11; num+=-1)
      { 
        System.out.print(num + " " );
      }
      System.out.println(" ");
      
      for (int num=115; num>100; num+=-1)
      { 
        System.out.print(num + " " );
      }
      System.out.println(" ");
    }
   
      {
      System.out.println(" ");
      System.out.println("Group C Skip Counting"); 
        
      for (int num=0; num<=18; num+=2)
      { 
        System.out.print(num + " " );
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
      System.out.println(" ");
      System.out.println("Group D One thing Repeated");
      
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
      System.out.println (" ");
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
  