public class quiz
{
  public static void main(String args[])
  {
    new quiz();
  }
  public quiz()
  {
    double q1 = IBIO.inputDouble("Question 1:\t2+4*(3+4) = ");
    System.out.println("Your Answer:\t"+q1);
    System.out.println("Correct Answer:\t30");
    double q2 = IBIO.inputDouble("\nQuestion 2:\t7*5 = ");
    System.out.println("Your Answer:\t"+q2);
    System.out.println("Correct Answer:\t35");
    double q3 = IBIO.inputDouble("\nQuestion 3:\t12/4 = ");
    System.out.println("Your Answer:\t"+q3);
    System.out.println("Correct Answer:\t3");
    double q4 = IBIO.inputDouble("\nQuestion 4:\t12^2 = ");
    System.out.println("Your Answer:\t"+q4);
    System.out.println("Correct Answer:\t144");
    double q5 = IBIO.inputDouble("\nQuestion 5:\t5-2 = ");
    System.out.println("Your Answer:\t"+q5);
    System.out.println("Correct Answer:\t3");
  }
}
   