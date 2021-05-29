public class Bmi 
{
public static void main (String[]args)
  {
new Bmi();
  }
public Bmi()
    {
        double w = IBIO.inputDouble("Enter your weight in kilograms ");
        double h = IBIO.inputDouble("Enter your height in metres ");
        double b = w/(h*h);
        System.out.println("Your Body Mass Index is "+b);
        if(b>25)
            System.out.println("You are overweight");
        if(b<18.5)
            System.out.println("You are underweight");
        if(18.5>b && b>25.0)
            System.out.println("You are normal weight");
    }
}