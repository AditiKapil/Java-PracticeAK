public class flower
{
  public static void main(String args[])
  {
    new flower();
  }
  public flower()
  {
    int ship = IBIO.inputInt("Enter the number of flower pots to ship: ");
    System.out.println("We will ship: ");
    int largepots = ship/9;
    int leftover = ship%9;
    int bigpots = leftover/4;
    int leftover2 = leftover%4;
    int small = leftover2/1;
    int together = small+bigpots+largepots;
    System.out.println("\t"+largepots+" very big box(es)\n \t"+bigpots+" big box(es)\n \t"+small+" small box(es)\nThis is a total of "+together+" boxes");
  }
}
  