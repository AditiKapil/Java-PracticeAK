public class average
{
  public static void main(String args[])
  {
    new average();
  }
  public average()
  {
    System.out.println("Average\n");
    System.out.println("Enter the percentage earned on each test.\n");
    double t1 = IBIO.inputDouble("What is the students #1's mark? ");
    double t2 = IBIO.inputDouble("What is the students #2's mark? ");
    double t3 = IBIO.inputDouble("What is the students #3's mark? ");
    double t4 = IBIO.inputDouble("What is the students #4's mark? ");
    double t5 = IBIO.inputDouble("What is the students #5's mark? ");
    double t6 = IBIO.inputDouble("What is the students #6's mark? ");
    System.out.println("\nThere are six students in the class.");
    double ave = (t1+t2+t3+t4+t5+t6)/6;
    System.out.println("The average mark was "+ave+"%");
  }
}
    
    