public class Muffins 
{
public static void main (String[]args)
  {
new Muffins();
  }
public Muffins()
    {
        int n = IBIO.inputInt("Enter amount of muffins you want ");
        int tm1 = n * 5;
        int tm2 = n * 3;
        int tm3 = n * 2;
        int tm4 = n * 1;
        if (n<=9){
            System.out.println("Each muffin costs $5");
            System.out.println("The cost is $"+tm1);
        }
        if (n>=10 && n<=19){
            System.out.println("Each muffin costs $3");
            System.out.println("The cost is $"+tm2);
        }
        if (n>=20 && n<=39){
            System.out.println("Each muffin costs $2");
            System.out.println("The cost is $"+tm3);
        }
        if (n>=40){
            System.out.println("Each muffin costs $1");
            System.out.println("The cost is $"+tm4);
        }
    }
}
