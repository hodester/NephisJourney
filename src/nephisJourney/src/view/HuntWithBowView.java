package nephisJourney.src.view;

import java.util.Random;
import java.util.Scanner;
import nephisJourney.NephisJourney;
import nephisJourney.src.control.HuntingControl;

/**
 *
 * @author adamh_000
 */
public class HuntWithBowView extends View {

    private static Object rand;

    private String promptMessage;
    private Object randomCommand;

    public HuntWithBowView() {

        super(
                "\n--------------------------------------------------------------"
                + "\n|  Choose Direction                                          |"
                + "\n--------------------------------------------------------------"
                + "\n1 - North"
                + "\n2 - East"
                + "\n3 - South"
                + "\n4 - West"
                + "\nC - Total Weight of Meat"
                + "\nQ - Quit Hunt");
    }

    @Override
    public boolean doAction(String menuOption) {

        menuOption = menuOption.toUpperCase();

        switch (menuOption) {
            case "1": //north
                this.getNorth();
                break;
            case "2": //south
                this.getSouth();
                break;
            case "3": //west
                this.getWest();
                break;
            case "4": //east
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

    private void getNorth() {
        {
            String[] args = null;
            HuntingControl.main(args);
        }
    }

    private void getSouth() {
        {
            String[] args = null;
            HuntingControl.main(args);
        }
    }

    private void getWest() {
        {
            String[] args = null;
            HuntingControl.main(args);        
        }
    }

    private void getEast() {
        {
            String[] args = null;
           HuntingControl.main(args);
        }
    }  
    private void calcHuntWeight() {
        HuntingControl.totalWeight();
    
    }
    
   // Should return to menu to allow player to hunt again,
        // calculate total meat or quit.

    @Override
    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }


