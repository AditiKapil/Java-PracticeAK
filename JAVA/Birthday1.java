public class Birthday1 
{
  public static void main(String args[])
  {
    new Birthday1();
  }
  public Birthday1()
  {
    int a = IBIO.inputInt("Enter the number 7: ");
    System.out.println(a);
    int b = IBIO.inputInt("Multiply by the month of your birthday: ");
    System.out.println(b);
    int c = IBIO.inputInt("Subtract 1: ");
    System.out.println(c);
    int d = IBIO.inputInt("Multiply by 13: ");
    System.out.println(d);
    int e = IBIO.inputInt("Add the day of your birth: ");
    System.out.println(e);
    int f = IBIO.inputInt("Add 3: ");
    System.out.println(f);
    int g = IBIO.inputInt("Multply by 11: ");
    System.out.println(g);
    int h = IBIO.inputInt("Subtract the month of your birth: ");
    System.out.println(h);
    int i = IBIO.inputInt("Subtract the day of your birth: ");
    System.out.println(i);
    int j = IBIO.inputInt("Divide by 10: ");
    System.out.println(j);
    int k = IBIO.inputInt("Add 11: ");
    System.out.println(k);
    int l = IBIO.inputInt("Divide by 100: ");
    System.out.println(i);
    int m = ((((((((((a * b) - 1) * d) + e) +f) * g) - h) - i) / j) + k) / 100;
    System.out.println(m);
  }
}