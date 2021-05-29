public class TimeMethods
{
  public static void main (String args[])
  {
    new TimeMethods ();
  }
  
  
  public TimeMethods ()
  {
    
    System.out.println ("What is the 3rd day of the week? " + weekday (3));
    System.out.println ("What is the 3rd month? " + month (3));
    System.out.println ("How many days in March? " + numDays ("MARCH"));
    System.out.println ("Is 2012 a leap year? " + isLeapYear (2012));
  }
  
  
   public String weekday (int n)
  { //returns the name of the day
    //1 == "Sunday", 2=="Monday"
    if(n == 1)
    {
      return "Sunday";
    }
    else if(n == 2)
    {
      return "Monday";
    }
    else if(n == 3)
    {
      return "Tuesday";
    }
    else if(n == 4)
    {
      return "Wednesday";
    }
    else if(n == 5)
    {
      return "Thursday";
    }
    else if(n == 6)
    {
      return "Friday";
    }
    else if(n == 7)
    {
      return "Saterday";
    }
    else
    {
      return "Invalid";
    }
    
  }
  
  
  public String month (int n)
  { //returns month name
    //if n ==1, the name is "January" etc.
    if(n == 1){
      return "January";
    }else if(n == 2){
      return "Feburary";
    }else if(n == 3){
      return "March";
    }else if(n == 4){
      return "April";
    }else if(n == 5){
      return "May";
    }else if(n == 6){
      return "June";
    }else if(n == 7){
      return "July";
    }else if(n == 8){
      return "August";
    }else if(n == 9){
      return "September";
    }else if(n == 10){
      return "October";
    }else if(n == 11){
      return "November";
    }else if(n == 12){
      return "December";
    }else{
      return "Invalid";
    }
    
  }
  
  
  public int numDays (String month)
  { //returns the number of days in a month - OCTOBER, October, october are all valid input
    //http://www.eudesign.com/mnems/dayspcm.htm
    if(month.equalsIgnoreCase("January")){
      return 31;
    }else if(month.equalsIgnoreCase("Feburary")){
      return 30;
    }else if(month.equalsIgnoreCase("March")){
      return 31;
    }else if(month.equalsIgnoreCase("April")){
      return 30;
    }else if(month.equalsIgnoreCase("May")){
      return 31;
    }else if(month.equalsIgnoreCase("June")){
      return 30;
    }else if(month.equalsIgnoreCase("July")){
      return 31;
    }else if(month.equalsIgnoreCase("August")){
      return 31;
    }else if(month.equalsIgnoreCase("September")){
      return 30;
    }else if(month.equalsIgnoreCase("October")){
      return 31;
    }else if(month.equalsIgnoreCase("November")){
      return 30;
    }else if(month.equalsIgnoreCase("December")){
      return 31;
    }else{
      return 0;
    }
    
  }
  
  
  public boolean isLeapYear (int year)
  { //http://en.wikipedia.org/wiki/Leap_year
    //returns true if year is a leap year and false if it isn't.
    if( (year%400==0 || year%100!=0) &&(year%4==0)){
      return true;
    }else{
      return false;
    }
  }
  
  
  public int dayOfWeek (int k, int m, int C, int Y)
  { //http://www.cs.uwaterloo.ca/~alopez-o/math-faq/node73.html
    //How to determine the day of the week, given the month, day and year
    //Bonus... but very cool.
    
    //k is day (1 to 31)
    //m is month (1 = March, ..., 10 = December, 11 = Jan, 12 = Feb) Treat Jan & Feb as months of the preceding year
    //C is century (1987 has C = 19)
    //Y is year (1987 has Y = 87 except Y = 86 for Jan & Feb)
    
    //Take the last two digits of the year.
    //Divide by 4, discarding any fraction.
    //Add the day of the month.
    //Add the month's key value: JFM AMJ JAS OND 144 025 036 146
    //Subtract 1 for January or February of a leap year.
    //For a Gregorian date, add 0 for 1900's, 6 for 2000's, 4 for 1700's, 2 for 1800's; for other years, add or subtract multiples of 400.
    //For a Julian date, add 1 for 1700's, and 1 for every additional century you go back.
    //Add the last two digits of the year.
    //Divide by 7 and take the remainder.
    //Now 1 is Sunday, the first day of the week, 2 is Monday, and so on.
    
    return 1;
    
  }
}
  