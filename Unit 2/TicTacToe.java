public class TicTacToe
{
  public static void main (String args[])
  {
    new TicTacToe ();
  }
  
  
  /* Again, your job is to complete the code in the methods as specified */
  
  char a = ' ';
  char b = ' ';
  char c = ' ';
  char d = ' ';
  char e = ' ';
  char f = ' ';
  char g = ' ';
  char h = ' ';
  char i = ' ';
  
  char turn = 'x';
  
  public TicTacToe ()
  {
    while (!winner ())
    {
      printboard ();
      makemove (turn);
      if (turn == 'x')
        turn = 'o';
      else
        turn = 'x';
    }
    printboard ();
    System.out.println ("The winner is " + printWinner ());
    
  }
  
  public void printboard ()
  {
    /* Print out the board like this:
     1   2   3
     1  a | b | c
     ------------
     2  d | e | f
     ------------
     3  g | h | i
     Instead of actually printing a, b, c etc, output the variables in that postion
     */
    
    System.out.println("1   2   3");
    System.out.println("1  "+a+" | "+b+" | "+c+"");
    System.out.println("------------");
    System.out.println("2  "+d+" | "+e+" | "+f+"");
    System.out.println("------------");
    System.out.println("3  "+g+" | "+h+" | "+i+"");
    
  }
  
  
  public void makemove (char piece)
  {
    int x = IBIO.inputInt ("\nEnter the x-coordinate: ");
    int y = IBIO.inputInt ("Enter the y-coordinate: ");
    while (!isValid (x, y))
    {
      System.out.println ("Error - invalid coordinate. Try again.");
      x = IBIO.inputInt ("\nEnter the x-coordinate: ");
      y = IBIO.inputInt ("Enter the y-coordinate: ");
    }
    if (x == 1 && y == 1)
      a = piece;
    else if (x == 2 && y == 1)
      b = piece;
    else if (x == 3 && y == 1)
      c = piece;
    else if (x == 1 && y == 2)
      d = piece;
    else if (x == 2 && y == 2)
      e = piece;
    else if (x == 3 && y == 2)
      f = piece;
    else if (x == 1 && y == 3)
      g = piece;
    else if (x == 2 && y == 3)
      h = piece;
    else if (x == 3 && y == 3)
      i = piece;
    //complete the other 7 spaces
    
    
  }
  
  
  public boolean isValid (int x, int y)
  {
    //make it return false if invalid
    // eg, x and y must be between 1 and 3
    // also the position can not be full (eg. if x==1 && y==1 && a!=' ') - then they picked postion a AND it is full
    if(x==1 && y==1 && a!=' '){
      return false;
    }else if(x==2 && y==1 && b!=' '){
      return false;
    }else if(x==3 && y==1 && c!=' '){
      return false;
    }else if(x==1 && y==2 && d!=' '){
      return false;
    }else if(x==2 && y==2 && e!=' '){
      return false;
    }else if(x==3 && y==2 && f!=' '){
      return false;
    }else if(x==1 && y==3 && g!=' '){
      return false;
    }else if(x==2 && y==3 && h!=' '){
      return false;
    }else if(x==3 && y==3 && i!=' '){
      return false;
    }else if((x >3 || x < 1) || (y > 3 || y < 1)){
      return false;
    }else{
      return true;
    } 
  }
  
  
  public boolean winner ()
  { //the first line a-b-c is a match
    if (a == b && a == c && a != ' ')
      return true;
    else if (d == e && d == f && d != ' ')
      return true;
    else if (g == h && g == i && g != ' ')
      return true;
    else if (a == d && a == g && a != ' ')
      return true;
    else if (b == e && b == h && b != ' ')
      return true;
    else if (c == f && c == i && c != ' ')
      return true;
    else if (a == e && a == i && a != ' ')
      return true;
    else if (c == e && c == g && c != ' ')
      return true;
    else
      return false;
  }
  
  
  public char printWinner ()
  { //returns who is in the winning condition
    if (a == b && a == c && a != ' ')
      return a;
    else if (d == e && d == f && d != ' ')
      return d;
    else if (g == h && g == i && g != ' ')
      return g;
    else if (a == d && a == g && a != ' ')
      return a;
    else if (b == e && b == h && b != ' ')
      return b;
    else if (c == f && c == i && c != ' ')
      return c;
    else if (a == e && a == i && a != ' ')
      return a;
    else if (c == e && c == g && c != ' ')
      return c;
    else 
//if (c == e && c == g && c != ' ') - diagonal backwards
      return c;
    
  }
}