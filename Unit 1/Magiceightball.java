public class Magiceightball
{
   public static void main (String[]args)
   {
     new Magiceightball();
   }
   public Magiceightball()
   {
     System.out.println ("Welcome to the Magic 8 Ball");
     int num = (int) (Math.random () * 16) + 1;
     String answer = IBIO.inputString ("Enter a Yes or No question");
     if (num == 1)
       System.out.println ("Outlook not so good");
     else if (num == 2)
       System.out.println ("Don't count on it");
     else if (num == 3)
       System.out.println ("My sources say no");
     else if (num == 4)
       System.out.println ("Without a doubt");
     else if (num == 5)
       System.out.println ("Reply hazy, try again");
     else if (num == 6)
       System.out.println ("It is certain");
     else if (num == 7)
       System.out.println ("My reply is no");
     else if (num == 8)
       System.out.println ("As I see it is");
     else if (num == 9)
       System.out.println ("most likely");
     else if (num == 10)
       System.out.println ("You may rely on it");
     else if (num == 11)
       System.out.println ("Cannont predict now");
     else if (num == 12)
       System.out.println ("Outlook good");
     else if (num == 13)
       System.out.println ("Better not tell you now");
     else if (num == 14)
       System.out.println ("Very doubtful");
     else if (num == 15)
       System.out.println ("Yes definitely");
     else
       System.out.println ("Concentrate and try again");
   }
}
     