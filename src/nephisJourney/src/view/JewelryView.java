package nephisJourney.src.view;

import java.util.Scanner;
import nephisJourney.NephisJourney;
import nephisJourney.src.control.TreasureControl;

/**
 *
 * @author Jenaca
 */
public class JewelryView {

        protected String promptMessage;

    public JewelryView() {
        this.promptMessage = "\nPlease enter how many pieces of jewelry "
                + "you wish to collect: ";
    }

    public void displayJewelryView() {
        boolean done = false; // set flag to not done
        do {
            // prompt for and get number of pieces of jewelry
            int numJewelry = this.getNumJewelry();
            if (numJewelry == 0) // user wants to quit
            {
                //Create collectTreasureView object when user quits inventory view
                //display collectTreasureView and exit the inventory view
                CollectTreasureView collectTreasureView = new CollectTreasureView();
                return; // exit the inventory view
            } else {
            }
            // do the requested action and display the next view
            done = this.doAction(numJewelry);

        } while (!done);
    }

    public int getNumJewelry() {
        //Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        int value = Integer.parseInt(System.console().readLine()); //value to be returned
        boolean valid = false; //initialize to not valid

        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);

            //value = keyboard.nextLine(); //get next line typed on keyboard
            //value = value.trim(); //trim off leading and trailing white space

            if (value < 1) { //value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            if (value > 4) { //value is too long
                System.out.println("\nInvalid value: Please enter how many "
                        + "pieces of jewelry you would like to collect.");
                continue;
            }
            break; //end the loop
        }

        return value; //return the value entered

    }
    
    private boolean doAction(int numJewelry) {
       System.out.println("\n doAction calcJewelryWeight called ");
            // call treasure control to calculate jewelryWeight
      //TreasureControl.calcJewelryWeight(numJewelry);
        return true;
    }

   

    

}

