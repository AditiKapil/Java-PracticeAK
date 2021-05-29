public class YourBirthday
{
   public static void main (String[]args)
  {
    new YourBirthday();
  }
  public YourBirthday()
  {
    System.out.println ("Does this math trick actually work?");
    int month = IBIO.inputInt ("What month are you born in? ");
    int day = IBIO.inputInt ("What day are you born? ");
    
    int num = IBIO.inputInt ("Enter the number 7 ");
    int mult = IBIO.inputInt ("Multiply by the month of your birth " +num*month);
    int sub = IBIO.inputInt ("Subtract by 1 " +mult+ - 1);
    int mult13 = IBIO.inputInt ("Multiply by 13 " +sub++ *13);
    int addbirth = IBIO.inputInt ("Add the day of your birth " +mult13+ +day);
    int add3 = IBIO.inputInt ("Add 3 " +addbirth+3);
    int mult11 = IBIO.inputInt ("Multiply by 11 " +add3*11);
    int subm = IBIO.inputInt ("Subtract the month of your birth " +mult11+ - month);
    int subd = IBIO.inputInt ("Subtract the day of your birth " +subm+ - day);
    int divid = IBIO.inputInt ("Divide by 10 " +subd/10);
    int add11 = IBIO.inputInt ("Add 11 " +divid+11);
    int div100 = IBIO.inputInt ("Divide by 100 " +add11/100);
  }
}
    
    