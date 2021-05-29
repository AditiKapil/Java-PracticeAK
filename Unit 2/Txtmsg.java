public class Txtmsg
{
  public static void main (String args[])
  {
    new Txtmsg ();
  }
  public Txtmsg ()
  {
    System.out.println ("---Welcome to the I Speak TXTMSG Program---");
    String shortform;
    shortform = IBIO.inputString("Enter Phrase:");
    while (!shortform.equals("TTYL"))
    {
      if (shortform.equals("CU"))
        System.out.println ("see you");
      
      else if (shortform.equals(":-)"))
        System.out.println ("I'm happy");
      
      else if (shortform.equals(":-("))
        System.out.println ("I'm unhappy");
      
      else if (shortform.equals(";-)"))
        System.out.println ("wink");
      
      else if (shortform.equals(":-P"))
        System.out.println ("stick out my toungue");
      
      else if (shortform.equals("(~.~)"))
        System.out.println ("sleepy");
      
      else if (shortform.equals("TA"))
        System.out.println ("totally awsome");
      
      else if (shortform.equals("CUZ"))
        System.out.println ("because");
      
      else if (shortform.equals("TY")) 
        System.out.println ("thank-you");
      
      else if (shortform.equals("YW"))
        System.out.println ("you're welcome");
      
      else if (shortform.equals("TTYL"))
        System.out.println ("talk to you later");
      else 
        System.out.println (shortform);
      shortform = IBIO.inputString("Enter Phrase:");
    }
    System.out.println ("talk to you later");
  }  
 }
    