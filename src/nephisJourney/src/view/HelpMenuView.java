package nephisJourney.src.view;

import java.util.Scanner;

/**
 *
 * @author Jenaca
 */
public class HelpMenuView extends View {

    //promptMessage = "Please select from the following options: "
    private String promptMessage;

    public HelpMenuView() {

        super(
                "\n"
                + "\n--------------------------------------------"
                + "\n|Help Menu                                 |"
                + "\n--------------------------------------------"
                + "\nG - What is the goal of the game"
                + "\nM - How to move"
                + "\nE - Estimating the amount of resources"
                + "\nI - Collect Inventory"
                + "\nL - Liahona References"
                + "\nQ - Quit"
                + "\n--------------------------------------------");

    }
    @Override
    public void display() {

        boolean done = false; // set flag to not done
        do {
            // prompt for and get user's menu option
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // user wants to quit
            {
                //Create mainMenuView object when user quits help menu
                //display main menu and exit help menu
                MainMenuView mainMenu = new MainMenuView();
                return; // exit view
            }
            // do the requested action and display the next view
            done = this.doAction(value);

        } while (!done);
    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); // convert choice to upper case

        switch (value) {
            case "G": // get goal of game instructions
                this.goalOfGame();
                break;
            case "M": // how to move instructions
                this.howToMove();
                break;
            case "E": // estimate resource instructions
                this.estimateResource();
                break;
            case "I": // collect inventory instructions
                this.collectInventory();
                break;
            case "L": //Display the Liahona Reference menu
                this.displayLiahonaReference();
                break;
            default:
                System.out.println("\n*** Invalid selection ***"
                        + " Please select a valid display option ***");
                break;

        }
        return false;
    }

    private void goalOfGame() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert GOAL OF GAME help language here              *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    private void howToMove() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert HOW TO MOVE help language here               *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    private void estimateResource() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert ESTIMATE RESOURCE help language here         *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    private void collectInventory() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert COLLECT INVENTORY help language here         *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    private void displayLiahonaReference() {
                System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert Liahona Reference Menu here                  *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

}
