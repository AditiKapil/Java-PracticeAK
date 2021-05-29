public class GuessingGame
{
public static void main (String[] args)
{
    
new GuessingGame ();
}
      
public GuessingGame ()
{
    // File: GuessingGame.java
    // Name: Aditi Kapil
    // Date: April 11, 2018                   
    // This Program prints GuessingGame
 System.out.println ("Welcome to the Guessing Game");
 System.out.println ("The computer has picked a number between 1 and 100. Try to guess it.");
 char continu = 'y';
 while (continu == 'y')
 {
 int random = (int) (Math.random () * 100 + 1);
 System.out.println ("random:");
 
 {        
 int numguess = 1; 
 int num = IBIO.inputInt ("Guess #" + numguess + ": ");
 
 {
 while (num != random)
 {
     if (num < random)
     {
  numguess ++;
  System.out.println ("That is too low.");
     }
     else if (num > random)
     {
  numguess ++;
  System.out.println ("That is too high.");
     }
     
     num = IBIO.inputInt ("Guess #" + numguess + ": ");

 }
 //When you get the right answer
 System.out.println ("That is right.");
 System.out.println ("It only took " + numguess + " guesses. Good Job");
   
    }
 
 continu = IBIO.inputChar ("Do you want to play again (y/n)");
    }

    }
}
}