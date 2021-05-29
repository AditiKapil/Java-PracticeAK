public class average
{
   public static void main (String[]args)
  {
    new average();
  }
  public average()
  {
    System.out.println ("Enter the percentage earned on each test.");
    int mark1 = IBIO.inputInt ("What is the student #1's mark?");
    int mark2 = IBIO.inputInt ("What is the student #2's mark?");
    int mark3 = IBIO.inputInt ("What is the student #3's mark?");
    int mark4 = IBIO.inputInt ("What is the student #4's mark?");
    int mark5 = IBIO.inputInt ("What is the student #5's mark?");
    int mark6 = IBIO.inputInt ("What is the student #6's mark?");
    System.out.println ("\nThere are six students in the class.");
    double avg = (mark1 + mark2 + mark3 + mark4 + mark5 + mark6) / 6.0;
    System.out.print ("The average mark was" + avg + "%");
  }
}
