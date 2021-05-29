/* *
* File: .java
* Author: Haider Ali Khan
* Date: Mar. 00 , 2018
* Description: This program...
*/
//generate random number print index
public class magic
{
  public static void main(String args[])
  {
    new magic();
  }
  public magic()
  {
    int num = IBIO.inputInt("Enter a yes or no question: ");
    String[] ball = {"outlook not so good","don't count on it","my sources say no","without a doubt","reply hazy, try again","it is certain","you may rely on it","cannot perdict now","outlook good","better not tell you now","very doubtful","yes definitely","concentrate and ask again"};
    for(int a=0; a<ball.length;a++)
      System.out.println("The Magic 8 Ball says: \n"+ball[a]);
  }
}