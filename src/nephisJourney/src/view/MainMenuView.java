package nephisJourney.src.view;

import java.util.Scanner;
import nephisJourney.NephisJourney;
import nephisJourney.src.control.GameControl;

/**
 *
 * @author Hodes
 */
public class MainMenuView extends View {

    //promptMessage = "Please select from the following options: "
    private String promptMessage;

    public MainMenuView() {
        super(
                "\n"
                + "\n--------------------------------------------"
                + "\n|Main Menu                                 |"
                + "\n--------------------------------------------"
                + "\nN - Start new game"
                + "\nG - Get and start saved game"
                + "\nH - Get help on how to play the game"
                + "\nT - High Scores"
                + "\nS - Save game"
                + "\nR - Reference Menu"
                + "\nL - Location List"
                + "\nQ - Quit"
                + "\n--------------------------------------------");

    }

    
   @Override
    public boolean doAction(String value) { 

        value = value.toUpperCase(); // convert choice to upper case

        switch (value) {
            case "N": // create and start a new game
                this.startNewGame();
                break;
            case "G": // get and start an existing game
                this.startSavedGame();
                break;
            case "H": // display the help menu
                this.displayHelpMenu();
                break;
            case "T":
                this.playerView();
                break;
            case "S": // save the current game
                this.saveGame();
                break;
            case "R": // display Reference Menu
                this.displayReferenceMenu();
                break;
            case "L": // display Location list
                this.displayLocationList();
                break;
            default:
                System.out.println("\n*** Invalid selection ***"
                        + " Please select a valid display option ***");
                break;

        }
        return false;

    }

    private void startNewGame() {
        // create a new game
        GameControl.createNewGame(NephisJourney.getPlayer());

        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        /*GameMenuView.View();*/

        //Create gameMenuView object
        GameMenuView gameMenuView = new GameMenuView();

        //Display the game menu view
        gameMenuView.display();
    }

    private void startSavedGame() {
        this.console.println("\n\nEnter the file path for file where the "
                + " game is to be saved.");
        
        String filePath = this.getInput();
        
        try {
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();        
    }

    private void displayHelpMenu() {
        //Create helpMenuView object
        HelpMenuView helpMenuView = new HelpMenuView();

        //Display the help menu view
        helpMenuView.display();
    }
    
    private void playerView() {
        PlayerView playerView = new PlayerView();
        
        playerView.display();
    }

    private void saveGame() {
        this.console.println("\n\nEnter the file path for file where the"
                + " game is to be saved.");
        String filePath = this.getInput();
        
        try {
            GameControl.saveGame(NephisJourney.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    private void displayReferenceMenu() {
        System.out.println("*** displayReference function was called ***");
    }

    private void displayLocationList() {
        System.out.println("*** displayLocation function was called ***");
    }

    public void display() {
        System.out.println("*** MMView display function was called ***");
    }
}
