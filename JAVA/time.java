public class time
{
  public static void main(String args[])
  {
    new time();
  }
  public time()
  {
    int ti = IBIO.inputInt("Enter the number of minutes: ");
    int hours = ti/60;
    int minutes = ti%60;
    System.out.println("This is "+hours+":"+minutes);
  }
}