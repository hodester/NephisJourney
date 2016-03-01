
package nephisJourney.src.view;

import java.util.Scanner;
import nephisJourney.NephisJourney;
import nephisJourney.src.model.SupplyInventory;
/**
 *
 * @author adamh_000
 */
public class ResourceInventoryView {
    
    // Prompt message = "Please select from the following options:"
    private String promptMessage;
    
    public ResourceInventoryView(){
        
          this.promptMessage = "\nPlease select from the following options:";
    
    }

    public void displayMenu() {
        
        System.out.println(
         "/n"
        +"/n-------------------------------------------"
        +"/n|            Resource Inventor            |"
        +"/n-------------------------------------------"
        +"/n                                           "
        +"/n P - Plates of Brass"
        +"/n L - Liahona"
        +"/n B - Bow"
        +"/n S - Stones"
        +"/n M - Meat"
        +"/n T - Timber"        
        +"/n O - Ore"
        +"/n G - Grains"
        +"/n O - Oil"
        +"/n W - Water"
        +"/n H - Honey"
        +"/n A - Salt"
        +"/n Q - Quit"
        +"/n-------------------------------------------"
        );
       
    }
    
    public void displayResourceInventoryView(){
        
        boolean done = false; //set flag to not done
        do{
            // promt for and get players option
            String menuOption = this.getMenuOptions();
            if (menuOption.toUpperCase().equals("Q"))// user wants to quit
            {
                //allow player to go back to game menu
                //display game menu on exit
                GameMenuView gameMenu = new GameMenuView();
                
                return;
        }
            // do the requested action and display the next view
            done = this.doAction(menuOption);
            
           }while (!done);
         }
    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false; //option not valid
        
        //while a valid name has not been received 
        while (!valid) { 
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length()<1){ //blank value
                System.out.println("\n*** Invalid selection *** Try again");
                continue;
            }
            if (value.length()>1){//value is too long
                System.out.println("\n*** Invalid selection *** Try again");
                continue;
            }
            break;
        }
        return value; 
        }
    public void doAction(char choice) {
        
        switch (choice){
            case 'P': // access plates of brass
                this.platesOfBrass();
                break;
            case 'L': // access the Liahona inventory
                this.liahona();
                break;
            case 'B': // access Bow inventory
                this.bow();
                break;
            case 'S': // show amount of stones
                this.stones();
                break;
            case 'M': // show how much meat is collected
                this.meat();
                break;
            case 'T': // show amount of timber
                this.timber();
                break;
            case 'O': // show amount of ore in inventory
                this.ore();
                break;
            case 'W': // show amount of water in inventory
                this.water();
                break;
            case 'H': // show amount of honey in inventory
                this.honey();
                break;
            case 'A': // show amount of salt in inventory
                this.salt();
                break;
            default:
                System.out.println("\n*** Invalid selection ***"
                                + "Please select a valid display option ***");
                break;
               
        }
    }
    
    private void platesOfBrass(){
        System.out.println("\n displays amount in inventory");
 }
    
     private void liahona(){
        System.out.println("\n displays amount in inventory");
 }
   private void bow(){
       System.out.println("\n displays amount in inventory");
 }
    private void stones(){
        System.out.println("\n displays amount in inventory");
 }
     private void meat(){
        System.out.println("\n displays amount in inventory");
 }
      private void timber(){
       System.out.println("\n displays amount in inventory");
 }
       private void ore(){
       System.out.println("\n displays amount in inventory");
       }
       private void grains(){
        System.out.println("\n displays amount in inventory");
 }
       private void oil(){
        System.out.println("\n displays amount in inventory");
 }
       private void water(){
        System.out.println("\n displays amount in inventory");
 }
       private void honey(){
        System.out.println("\n displays amount in inventory");
       }
       private void salt(){
        System.out.println("\n displays amount in inventory");
       }

    private String getMenuOptions() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean doAction(String menuOption) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}