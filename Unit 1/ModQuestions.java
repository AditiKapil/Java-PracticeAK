public class ModQuestions
{
public static void main (String args[])
{
new ModQuestions ();
}
public ModQuestions ()
{
System.out.println("Question 0\n");
int n = IBIO.inputInt ("Enter the number of cents: ");
System.out.println ("That is " + (n / 200) + " toonies.");
n = n % 200;
System.out.println ("That is " + (n / 100) + " loonies.");
n = n % 100;
System.out.println ("That is " + (n / 25) + " quarters.");
n = n % 25;
System.out.println ("That is " + (n / 10) + " dimes.");
n = n % 10;
System.out.println ("That is " + (n / 5) + " nickels.");
n = n % 5;
System.out.println ("That is " + (n) + " pennies.");
}
}