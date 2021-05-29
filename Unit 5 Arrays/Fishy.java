public class Fishy
{
  public static void main (String args[])
  {
    new Fishy ();
  }
  public Fishy ()
  {
    int weights[] = {226, 305, 233, 244, 224, 235, 238, 244, 222, 239, 233, 243, 221, 230, 237, 240, 309, 230, 236, 242, 222, 235, 237, 240, 220, 235, 238, 243, 222, 232, 232, 242};
  
    //Calculate average and maxium values of fish sampled
    //Average
    int sum = 0;
    for (int i=0; i<weights.length; i++)
    sum = sum + weights[i];
    double average = sum / weights.length;
    System.out.println ("The average is " + average);
    
    //Maxium
    int max = weights[0];
   for (int i=1; i<weights.length; i++)
   { if (weights[i]>(max))
     max = weights[i];
   }
   System.out.println("The maxium is " + max);
                                 
   //If the ecology of the reservioir has enough food to allow the fish to properly reporduce
   //if average weight is less than 200 grams, then the pop isn't properly reporducing
   {
     if (average < 200){
     System.out.println ("The population is not getting enough food, they will have trouble reproducing");
     }
     else{
     System.out.println ("The popualtion is getting enough food, they wont have trouble reproducing");
     }
   }
   
   //Determine if the fish are living long enough
   {
     if (max < 300) {
       System.out.println ("The fish are not living long enough to represent a healthy population");
     }
     else {
       System.out.println ("The fish are living long enough");
     }
   }
  }
}