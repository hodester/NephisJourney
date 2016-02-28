package nephisJourney.src.view;

import java.util.Scanner;
import nephisJourney.src.control.GameControl;
import nephisJourney.src.model.Player;

/**
 *
 * @author adamh_000
 */
public class StartProgramView {

    //promptMessage = "Please enter your name"
    private String promptMessage;

    public StartProgramView() {

        this.promptMessage = "\nPlease enter your name: ";
        //display the banner when view is created
        this.displayBanner();
    }

    public void displayBanner() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* The game is to cover the events which took place in *"
                + "\n* the first book of Nehpi.  The basic premise is to   *"
                + "\n* use Nephi as the main character. He will follow the *"
                + "\n* trials and quests as outlined in the first book of  *"
                + "\n* Nephi.                                              *"
                + "\n*                                                     *"
                + "\n* Your task will be to guide Nephi and his family to  *"
                + "\n* the promised land.  You will need to complete a     *"
                + "\n* series of quests to reach the destination.  A       *"
                + "\n* successful completion of a quest or task will allow *"
                + "\n* you to move on to the next stage.  In order to win  *"
                + "\n* the game you must successfully complete all the     *"
                + "\n* stages.                                             *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    public void displayStartProgramView() {
        boolean done = false; //set flag to not done
        do {
            //promt for and get players name
            String playerName = this.getPlayerName();
            if (playerName.toUpperCase().equals("Q")) //user wants to quit
            {
                return; //exit the game
            }
            //do the requested action and display the next view
            done = this.doAction(playerName);

        } while (!done);
    }

    private String getPlayerName() {
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid

        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);

            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim(); //trim off leading and trailing white space

            if (value.length() < 1) { //value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }

            break; //end the loop
        }

        return value; //return the value entered
    }

    private boolean doAction(String playerName) {

        if (playerName.length() < 2) {
            System.out.println("\nInvalid player's name: "
                    + "The name must be greater than one character in length");
            return false;
        }
        //call createPlayer() control function
        Player player = GameControl.createPlayer(playerName);

        if (player == null) {//if unsuccessful
            System.out.println("\nError creating the player.");
            return false;
        }

        //display next view
        this.displayNextView(player);

        return true; // success!
    }

    private void displayNextView(Player player) {

        //display a custom welcome message
        System.out.println("\n=============================================="
                + "\n Welcome to Nephi's Journey, "
                + player.getName() + "."
                + "\n We hope you have a fun adventure!"
                + "\n=============================================="
        );

        //Create mainMenuView object
        MainMenuView mainMenuView = new MainMenuView();

        //Display the main menu view
        mainMenuView.displayMainMenuView();
    }

}
