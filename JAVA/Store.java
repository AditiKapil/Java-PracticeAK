import java.text.DecimalFormat;
public class Store
{
public static void main (String [] args)
{
    new Store();
}
public Store()
        {
            DecimalFormat df = new DecimalFormat("###########.##");
            System.out.println("Welcome to the Store, enter the number of each item you want");
            double a = IBIO.inputDouble("Apples $0.5 ");
            double o = IBIO.inputDouble("Oranges $0.75 ");
            double f = IBIO.inputDouble("Ferraris $500,000 ");
            double b = IBIO.inputDouble("Bananas $0.04 ");
            double k = IBIO.inputDouble("Kids $50,000 ");
            double as = a*0.05;
            double os = o*0.75;
            double fs = f*500000;
            double bs = b*0.04;
            double ks = k*50000;
            System.out.println("*****BILL******");
            System.out.println(+a+" Apples @ $0.5 = "+as);
            System.out.println(+o+" Oranges @ $0.75 = "+os);
            System.out.println(+f+" Ferraris @ $500,000 = "+fs);
            System.out.println(+b+" Bananas @ $0.04 = "+bs);
            System.out.println(+k+" Kids @ $50,000 = "+ks);
            double stotal = as+os+fs+bs+ks;
            System.out.println("The subtotal is = $"+df.format(stotal));
            double tax = 0.13*stotal;
            System.out.println("The tax is = $"+df.format(tax));
            double t = tax+stotal;
            System.out.println("The total is = $"+df.format(t));
            double p = IBIO.inputDouble("How much will you pay? ");
            double ch = p - t;
            double mo = t - p;
            if (p==t)
                System.out.println("Have a good day");
            if (p>t)
                System.out.println("Your change is $"+df.format(ch));
            if (p<t)
                System.out.println("You need $"+df.format(mo));
                       
        }
}