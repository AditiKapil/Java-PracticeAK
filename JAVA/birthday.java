//Remove Inputs
public class birthday
{
  public static void main(String args[])
  {
    new birthday();
  }
  public birthday()
  {
    int a = IBIO.inputInt("Enter the number 7 : ");
    System.out.println(a);
    int b = IBIO.inputInt("Multiply by the month of your birthday : ");
    int ba = b*7;
    System.out.println(ba);
    int c = IBIO.inputInt("Subtract 1 : ");
    int ca = ba-1;
    System.out.println(ca);
    int d = IBIO.inputInt("Multiply by 13 : ");
    int da = ca*13;
    System.out.println(da);
    int e = IBIO.inputInt("Add the day of your birth : ");
    int ea = da+e;
    System.out.println(ea);
    int f = IBIO.inputInt("Add 3 : ");
    int fa = ea+3;
    System.out.println(fa);
    int g = IBIO.inputInt("Multiply by 11 : ");
    int ga = fa*11;
    System.out.println(ga);
    int h = IBIO.inputInt("Subtract the month of your birth : ");
    int ha = ga-h;
    System.out.println(ha);
    int i = IBIO.inputInt("Subtract the day of your birth : ");
    int ia = ha-i;
    System.out.println(ia);
    int j = IBIO.inputInt("Divide by 10 : ");
    int ja = ia/10;
    System.out.println(ja);
    int k = IBIO.inputInt("Add 11 : ");
    double ka = ja+11;
    System.out.println(ka);
    double l = IBIO.inputDouble("Divide by 100 : ");
    System.out.println(ka/100);
  }
}
    
    
      
      