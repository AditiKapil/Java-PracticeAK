/* *
* File: HaiderTrafficTicketCalculator.java
* Author: Haider Ali Khan
* Date: Mar. 08 , 2018
* Description: This program will compute a person's traffic fines and produce a traffic ticket showing name, 
* license plate #, speeding fines, and other fines.  
*/

public class HaiderTrafficTicketCalculator
{
    public static void main (String [] args)
    {
        new HaiderTrafficTicketCalculator();
    }
    
    public HaiderTrafficTicketCalculator()
    {
      // Display questions and recieve user input for the following options:
      String firstN = IBIO.inputString("First Name: ");
      String lastN = IBIO.inputString("Last Name: ");
      String plateN = IBIO.inputString("License plate #: ");
      double vehicleS = IBIO.inputDouble("Vehicle speed: ");
      double postedS = IBIO.inputDouble("Posted speed: ");
      String valid = IBIO.inputString("Valid License Plate Sticker? ");
     
      //Print first 2 lines of sample outputs with the name and plate # 
      System.out.println("Name: "+firstN+" "+lastN);
      System.out.println("License Plate #: "+plateN);
      
      //Set variables for total fine and extra fine. They will be added to throughout the program
      double fine = 0;
      double otherF = 0;
      //For Km/h over speed limit create a variable which subtracts vehicles speed from posted speed.
      double speedL = vehicleS - postedS; 
      if (speedL>1 && speedL<=20)
        fine+=95;
      else if (speedL<=30)
        fine+=220;
      else if (speedL<=40)
        fine+=295;
      else if (speedL<=50)
        fine+=360;
      else
        fine+=500;
      //inputed values to fine as a result of these if statements above
      
      //Check if the plate is valid and add to total fine(variable fine) and other fine(variable otherF).
      if (valid.equals("N") || valid.equals("n")){
        fine+=100;
        otherF+=100;
      }
      else if (valid.equals("Y") || valid.equals("y")){
        fine+=0;
        otherF+=0;
      }
      else 
        System.out.println("Input either T or F next time. ");

      // Final Prints with if statement for speed limit. 
      if (speedL>0){
        System.out.println("Km/h over speed limit: "+speedL);
      }
      else if (speedL<=0)
      {
        System.out.println("Km/h over speed limit: 0");
      }
      else
        System.out.println("Try Again. ");
      
      
      
      System.out.println("Other Traffic Fines: $"+otherF);
      System.out.println("Total: $"+fine);
    }
}
        
        
        