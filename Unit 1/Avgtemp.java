public class Avgtemp
{
   public static void main (String[]args)
  {
    new Avgtemp();
  }
  public Avgtemp()
  {
    String season = IBIO.inputString ("Which season would you like? (spring/summer/fall/winter) ");
    String month1 = IBIO.inputString ("\nWhat is the name of the first" + season + "month?");
    String month2 = IBIO.inputString ("What is the name of the second" + season + "month?");
    String month3 = IBIO.inputString ("What is the name of the third" + season + "month?");
    int temp1 = IBIO.inputInt ("\nWhat is the average temperature in" + month1 + "(in degrees)?");
    int temp2 = IBIO.inputInt ("What is the average temperature in" + month2 + "(in degrees)?");
    int temp3 = IBIO.inputInt ("What is the average temperature in" + month3 + "(in degrees)?");
    double avg = (temp1 + temp2 + temp3) / 3.0;
    System.out.println ("\nThe average temperature in the" + season + "was:" + avg + "%");
  }
}