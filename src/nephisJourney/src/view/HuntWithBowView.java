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
                + "\nN - North"
                + "\nE - East"
                + "\nS - South"
                + "\nW - West"
                + "\nQ - Quit Hunt");
    }

   @Override
    public boolean doAction(String value) {

        value = value.toUpperCase();

        switch (value) {
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

        if (randomNum == 'W') {
            HuntingControl getWest = new HuntingControl();
        } else {
            return;
        }
        if (randomNum == 'N') {
            HuntingControl getNorth = new HuntingControl();
        } else {
            return;
        }
        if (randomNum == 'E') {
            HuntingControl getEast = new HuntingControl();
        } else {
            return;
        }
        if (randomNum == 'S') {
            HuntingControl getSouth = new HuntingControl();
        } else {;
        }
    }

    private static void calcHuntWeight() {
        System.out.println("\n This will be changed");
    }

    private void getNorth() {
        System.out.println("\n Nothing here, keep searching!");
    }

    private void getSouth() {
        System.out.println("\n Nothing here, keep searching!");
    }

    private void getWest() {
        System.out.println("\n Nothing here, keep searching!");
    }

    private void getEast() {
        System.out.println("\n Nothing here, keep searching!");
    }
}
