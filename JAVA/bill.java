public class bill
{
  public static void main(String args[])
  {
    new bill();
  }
  public bill()
  {
    System.out.println("Welcome to the Bill Subtotalling Program\n");
    int p1 = IBIO.inputInt("Please enter the price of item #1: $");
    int p2 = IBIO.inputInt("Please enter the price of item #2: $");
    int p3 = IBIO.inputInt("Please enter the price of item #3: $");
    int p4 = IBIO.inputInt("Please enter the price of item #4: $");
    int p5 = IBIO.inputInt("Please enter the price of item #5: $");
    double sub = p1+p2+p3+p4+p5;
    System.out.println("The subtotal is: $"+sub);
    double tax = sub*.13;
    System.out.println("The tax is (13%): $"+tax);
    double tot = sub+tax;
    System.out.println("The total is: $"+tot);
  }
}

    