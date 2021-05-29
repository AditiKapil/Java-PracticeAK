public class Magic8
{
  public static void main(String args[])
  {
    new Magic8();
  }
  public Magic8()
  {
    System.out.println("***Ask the Magic 8 Ball ***");
    String question = IBIO.inputString("Enter a yes or no question: ");
    int num = (int) (Math.random () * 16) + 1;
    if (num==1)
      System.out.println("outlook not so good");
    if (num==2)
      System.out.println("don't count on it");
    if (num==3)
      System.out.println("my sources say no");
    if (num==4)
      System.out.println("without a doubt");
    if (num==5)
      System.out.println("reply hazy, try again");
    if (num==6)
      System.out.println("it is certain");
    if (num==7)
      System.out.println("my reply is no");
    if (num==8)
      System.out.println("as I see it yes");
    if (num==9)
      System.out.println("most likely");
    if (num==10)
      System.out.println("you may rely on it");
    if (num==11)
      System.out.println("cannot predict now");
    if (num==12)
      System.out.println("outlook good");
    if (num==13)
      System.out.println("better not tell you now");
    if (num==14)
      System.out.println("very doubtful");
    if (num==15)
      System.out.println("yes definitely");
    if (num==16)
      System.out.println("concentrate and ask again");
  }
}