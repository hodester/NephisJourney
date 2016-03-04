
package nephisJourney.src.view;

import java.util.Scanner;
import nephisJourney.NephisJourney;
import nephisJourney.src.model.SupplyInventory;
/**
 *
 * @author adamh_000
 */
public class ResourceInventoryView extends View {
    
    // Prompt message = "Please select from the following options:"
    private String promptMessage;

    public ResourceInventoryView() {
        
        super(
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
    
    
    public void doAction(char value) {
        
        switch (value){
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

    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
