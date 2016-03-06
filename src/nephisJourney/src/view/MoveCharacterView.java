package nephisJourney.src.view;

import java.util.Scanner;
import nephisJourney.NephisJourney;
import nephisJourney.src.model.Player;

/**
 *
 * @author Hodes
 */
public class MoveCharacterView extends View {

    private String promptMessage;

    public MoveCharacterView() {
        super(
                "\n"
                + "\n ************************************"
                + "\n|  Which direction do you want to move  |"
                + "\n ************************************"
                + "\n"
                + "\nN - Move North"
                + "\nE - Move East"
                + "\nS - Move South"
                + "\nW - Move West"
                + "\nQ - Quit"
                + "\n--------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();

        switch (value) {
            case "N":
                this.getMoveNorth();
                break;
            case "E":
                this.getMoveEast();
                break;
            case "S":
                this.getMoveSouth();
                break;
            case "W":
                this.getMoveWest();
                break;
            default:
                System.out.println("\n*** Invalid selection"
                        + "Please select a valid display option.");

        }
        return false;
    }

    private void getMoveNorth() {
        System.out.println("\nMove the Character North to the next spot.");
    }

    private void getMoveEast() {
        System.out.println("\nMove the Character East to the next spot.");
    }

    private void getMoveSouth() {
        System.out.println("\nMove the Character South to the next spot.");
    }

    private void getMoveWest() {
        System.out.println("\nMove the Character West to the next spot.");
    }

}
