public class temp
{
  public static void main(String args[])
  {
    new temp();
  }
  public temp()
  {
    String season = IBIO.inputString("What is your favourite season (summer/spring/winter/fall): ");
    String first = IBIO.inputString("What is the name of the first "+season+ " month?");
    String second = IBIO.inputString("What is the name of the second "+season+ " month?");
    String third = IBIO.inputString("What is the name of the third "+season+ " month?");
    int a = IBIO.inputInt("What is the average temprature in "+first+ " (in degrees)");
    int b = IBIO.inputInt("What is the average temprature in "+second+ "(in degrees)");
    int c = IBIO.inputInt("What is the average temprature in "+third+ "(in degrees)");
    double d = (a+b+c)/3.0;
    IBIO.inputString(" The average temprature in" +season+" time was  "+d+" :");
  }
}