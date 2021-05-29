import java.util.Scanner;
 
public class pra {
    public static void main(String[] args) {

        Scanner khan = new Scanner(System.in);
 
        System.out.println("\nWhat is your name? ");
        String name = khan.nextLine();
        System.out.print("\nHow many cats do you have? ");
        int numberOfCats = khan.nextInt();
        

        System.out.println("\nHello " + name + "! You have " + numberOfCats
                + (numberOfCats > 1 ? " cats" : " cat!"));
    }
}