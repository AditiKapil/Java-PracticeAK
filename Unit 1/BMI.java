public class BMI
{
   public static void main (String[]args)
   {
     new BMI();
   }
   public BMI()
   {
     double weight = IBIO.inputDouble ("Enter your weight (kg): ");
     double height = IBIO.inputDouble ("Enter the height (m): ");
     double bmi = (weight/(height*height));
     System.out.println ("Your BMI is" +bmi);
     if (bmi >= 25)
       System.out.println ("Overweight");
     else if (bmi >= 18.5)
       System.out.println ("Normal Weight");
     else
       System.out.println ("Underweight");
   }
}