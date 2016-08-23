
import java.util.Scanner;


public class IceDrinks {
    public static void main(String[]args){
        System.out.println("Welcome to Father Joe's Ice Drinks! ");
        System.out.println("The flavors are:");
        System.out.println("1: Strawberry 12 fl. oz.");
        System.out.println("2: Apple 8 fl. oz.");
        System.out.println("3:Blueberry 16 fl.oz.");
        Scanner input= new Scanner(System.in);
   boolean valid;
   do {
     System.out.println("What flavor would you like? Enter your selection 1  ,2 or 3: ");
      int selection =input.nextInt();
      valid= selection<=3 && selection > 0;
   if(!valid){
    continue;
     }
     System.out.println("Enter how many fluid ounces to add?  (1 - 6)");
     int ounce = input.nextInt();
    valid= ounce==5 && ounce > 0;
     //valid =ounce>0 && ounce<=6;
    if (!valid) {
       System.out.println("I am sorry that is not a valid selection.");
     }
     
}while (!valid);

   System.out.println("Adding 5 fluid ounces of Strawberry to the Ice drink!");
   System.out.println(" ");
   System.out.println("yummy and so delicious ");

        } // close main 
       } // close class
       
           
        
                    
        
        
           
    