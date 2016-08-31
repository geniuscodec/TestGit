/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingground;

/**
 *
 * @author PC
 */
import java.util.Scanner;

public class AdventureGame {

    public static void main(String[] args) {
        System.out.println("WELCOME TO THE CREEPY HOUSE ADVENTURE !");
        System.out.println("You are in the creepy house!Would you like to go \"1-Upstairs\" or into the \"2-Kitchen?\": ");
        String one = "Upstairs";
        String two = "Kitchen";
        String three ="Refrigerator";
        String four  = "Cabinet";
        
        System.out.println("The Choices are");
        System.out.println("1:" + " " + one);
        System.out.println("2:" + " " + two );
        System.out.println("In the Kitchen we have:");
        System.out.println("3:" + " " + three);
        System.out.println("4:" + " " + four);
        Scanner new_scan = new Scanner(System.in);
        String err = "Invalid selection, please try again:";
     
        boolean start = true;
        int user_input;
        user_input = new_scan.nextInt();
        if (user_input == -1) {
            System.exit(0);
        }
        
            switch (user_input) {
                case 1:
                while (start) {
                    String choice = "You are in a creepy house Upstairs Choose 1 to continue:";
                    System.out.println(choice);

                    user_input = new_scan.nextInt();
                    if (user_input==1) {
                        System.out.println("You have chosen" + " " + user_input);
                        System.out.println("Unless you are going to sleep, there is no food upstairs, you better try the kitchen");
                    start = false;
                    } else if (user_input == -1) {
                        System.exit(0);
                    } else {
                        System.out.println(err);
                        continue;
                    }
                }
                break;
                case 2:
                    while (start) {
                        String choice = "You are in a creepy house Kitchen, choose 2 to continue:";
                        System.out.println(choice);
                    
                        user_input = new_scan.nextInt();
                       
                        if (user_input == 2) {
                            System.out.println("You have chosen" + " " + user_input);
                            System.out.println("There is a long countertop with dirty dishes everywhere \n"+
                            " Off to one side, there is, as you'd expect, a refrigerator.\n" +
                            "You may open the refrigerator or look in a cabinet.Choose 3 or 4");
                                                 
                    user_input = new_scan.nextInt();          
                 if (user_input == 3) {
                 System.out.println("You have chosen" + " " + user_input); 
                 System.out.println("Inside the refrigerator, you see food and stuff. \n"
                                    + "It looks pretty nasty.\n"
                                    + "Would you like to eat some of the food? (5: no or 6: yes)");
                 user_input = new_scan.nextInt();
               if (user_input==5){
                System.out.println("You die, because we all need food and water.");
                System.exit(0);
             
              
               }else if (user_input==6){
                   System.out.println("Prepare some you are in the Kitchen");
                   System.exit(0);
            }
                    }else if (user_input == 4) {
                        System.out.println("You have chosen" + " " + user_input); 
                        System.out.println("Sorry you look lost,there is nothing in cabinet");
                        System.exit(0);     
                    
                    }
              
              start=false;
                        }else if (user_input == -1) {
                        System.exit(0);
                    } else {
                        System.out.println(err);
                        continue;
                    }   
               break;     
            }
                 
                default:
                System.out.println("Invalid");
                break;
            }
                
     } 
            
        }
    
        