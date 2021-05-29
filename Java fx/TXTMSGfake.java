public class TXTMSGfake
{
  public static void main (String args [])
  {
    new TXTMSGfake();
  }
  public TXTMSGfake ()
  {
    System.out.println ("---Welcome to the I Speak TXTMSG Program---");
    String abbvr;
    abbvr = IBIO.inputString("Enter Phrase:");
    while (!abbvr.equals("TTYL"))
    {
      if (abbvr.equals("CU"))
        System.out.println ("see you");
      
      else if (abbvr.equals(":-)"))
        System.out.println ("I'm happy");
      
      else if (abbvr.equals(":-("))
        System.out.println ("I'm unhappy");
      
      else if (abbvr.equals(";-)"))
        System.out.println ("wink");
      
      else if (abbvr.equals(":-P"))
        System.out.println ("stick out my toungue");
      
      else if (abbvr.equals("(~.~)"))
        System.out.println ("sleepy");
      
      else if (abbvr.equals("TA"))
        System.out.println ("totally awsome");
      
      else if (abbvr.equals("CUZ"))
        System.out.println ("because");
      
      else if (abbvr.equals("TY")) 
        System.out.println ("thank-you");
      
      else if (abbvr.equals("YW"))
        System.out.println ("you're welcome");
      
      else if (abbvr.equals("TTYL"))
        System.out.println ("talk to you later");
      else 
        System.out.println (abbvr);
      abbvr = IBIO.inputString("Enter Phrase:");
    }
    System.out.println ("talk to you later");
  }  
 }
    