package nephisJourney.src.view;

import java.util.Scanner;
import nephisJourney.NephisJourney;
import nephisJourney.src.model.Player;

/**
 *
 * @author adamh_000
 */
public class PlayerView extends View {

    private String promptMessage;

    public PlayerView() {
        super(
                "\n"
                + "\n--------------------------------------------"
                + "\n|            High Scores!                  |"
                + "\n--------------------------------------------"
                + "\n1 - First Place"
                + "\n2 - Second Place"
                + "\n3 - Third Place"
                + "\n4 - Top 10"
                + "\nQ - Quit"
                + "\n--------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();

        switch (value) {
            case "1":
                this.getFirstPlace();
                break;
            case "2":
                this.getSecondPlace();
                break;
            case "3":
                this.getThirdPlace();
                break;
            case "4":
                this.getTopTen();
                break;
            default:
                System.out.println("\n*** Invalid selection"
                        + "Please select a valid display option.");
                break;
        }
        return false;
    }

    private void getFirstPlace() {
        System.out.println("\n Insert code for ranking here.");
    }

    private void getSecondPlace() {
        System.out.println("\n Insert code for ranking here.");
    }

    private void getThirdPlace() {
        System.out.println("\n Insert code for ranking here.");
    }

    private void getTopTen() {
        System.out.println("\n Insert code for ranking here.");

    }

    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
