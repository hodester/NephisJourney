package nephisJourney.src.view;

import nephisJourney.NephisJourney;
import nephisJourney.src.control.GameControl;
import nephisJourney.src.view.HelpMenuView;

/**
 * @author Hodes
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
                + "\n*****************************************"
                + "\n*                Main Menu              *"
                + "\n*****************************************"
                + "\n N - Start new game"
                + "\n G - Get and start saved game"
                + "\n H - Get help on how to play the game"
                + "\n T - High Scores"
                + "\n S - Save game"
                + "\n R - Reference Menu"
                + "\n L - Location List"
                + "\n Q - Quit"
                + "\n*****************************************");

    }

    @Override
    public boolean doAction(Object obj) {

        String value = (String) obj;
        char choice = value.toUpperCase().charAt(0); // get first upper case character

        switch (choice) {
            case 'N': // create and start a new game
                this.startNewGame();
                break;
            case 'G': // get and start an existing game
                this.startSavedGame();
                break;
            case 'H': // display the help menu
                this.displayHelpMenu();
                break;
            case 'T':
                this.playerView();
                break;
            case 'S': // save the current game
                this.saveGame();
                break;
            case 'R': // display Reference Menu
                this.displayReferenceMenu();
                break;
            case 'L': // display Location list
                this.displayLocationList();
                break;
            default:
                ErrorView.display("Main Menu View Error", " >>> Invalid Selection <<< Try again.");
                break;
        }
        return false;

    }

    private void startNewGame() {
        GameControl.createNewGame(NephisJourney.getPlayer());
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startSavedGame() {
        this.console.println("\n\nEnter the file path for file where the "
                + " game is saved.");

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

}
