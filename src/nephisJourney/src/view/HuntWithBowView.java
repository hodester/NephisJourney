package nephisJourney.src.view;

import java.util.Random;
import java.util.Scanner;
import nephisJourney.NephisJourney;
import nephisJourney.src.control.HuntingControl;

/**
 *
 * @author adamh_000
 */
public class HuntWithBowView {
    private static Object rand;
    
    private String promptMessage;
    private Object randomCommand;
    
    public HuntWithBowView(){
        
          this.promptMessage = "\nChoose which direction you want to go:";
    }
    public void displayMenu () {
        
        System.out.println(
         "\n--------------------------------------------------------------"
        +"\n|  Choose Direction                                          |"
        +"\n--------------------------------------------------------------"         
        +"\nN - North"
        +"\nE - East"
        +"\nS - South"
        +"\nW - West"
        +"\nQ - Quit Hunt");
    }
    
    public void displayHuntWithBowView(){
        
        boolean done = false; //set flag
        do {
            // to go back to game menu
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
            {
                GameMenuView gameMenuView = new GameMenuView ();
                
                gameMenuView.displayMenu();
                return;
            }
            done = this.doAction(menuOption);
            
        }while (!done);
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner (System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length()< 1){
                System.out.println("\nInvalid Selection");
                continue;
                }
            if (value.length()> 1){
                System.out.println("\nInvalid Selection");
                continue;
            }
        break;
        }
        return value;
    }
    
public boolean doAction(String menuOption) {        
      
     menuOption = menuOption.toUpperCase();

     switch (menuOption) {
         case "N": //north
             this.getNorth();
             break;
         case "S": //south
             this.getSouth();
             break;
         case "W": //west
             this.getWest();
             break;
         case "E": //east
             this.getEast();
             break;
         case "C"://Determine weight and type
             this.calcHuntWeight();
             break;
         default:
             System.out.println("\n*** Invalid selection");
             break;
     }
     return false;       
  } 
    
    
   
    private static void viewHunt() {
     String randomCommand = "NSWE";
     Random rand = null;
     int randomNum = rand.nextInt(randomCommand.length() + 1);
     String selectedRandomCommand = Character.toString(randomCommand.charAt(randomNum));
        
        if (randomNum == 'W'){
            System.out.println("You found an animal!");
        }
        else{ return;
        }
        if (randomNum == 'N'){
            System.out.println("You found an animal!");
        } else{ return;
        }
        if (randomNum == 'E'){
            System.out.println("You found an animal!");
        } else{ return;
        }
        if (randomNum == 'S'){
            System.out.println("You found an animal!");
        } else{;
        }
    }

    private void calcHuntWeight() {
        System.out.println("\n This will be changed");    
    }

    private void getNorth() {
        System.out.println("\n This will be changed");    
    }
    private void getSouth() {
        System.out.println("\n This will be changed");    
    }

    private void getWest() {
        System.out.println("\n This will be changed");    
    }    

    private void getEast() {
        System.out.println("\n This will be changed");    
    }
}   
    

