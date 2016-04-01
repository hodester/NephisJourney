package nephisJourney.src.view;

/**
 * @author Jenaca
 */
public class HelpMenuView extends View {

    public HelpMenuView() {

        super(
                "\n"
                + "\n--------------------------------------------"
                + "\n|                 Help Menu                |"
                + "\n--------------------------------------------"
                + "\n G - What is the goal of the game"
                + "\n M - How to move"
                + "\n E - Estimating the amount of resources"
                + "\n I - Collect Inventory"
                + "\n L - Liahona References"
                + "\n Q - Quit"
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
    public boolean doAction(Object obj) {

        String value = (String) obj;
        char choice = value.toUpperCase().charAt(0);

        switch (choice) {
            case 'G': // get goal of game instructions
                this.goalOfGame();
                break;
            case 'M': // how to move instructions
                this.howToMove();
                break;
            case 'E': // estimate resource instructions
                this.estimateResource();
                break;
            case 'I': // collect inventory instructions
                this.collectInventory();
                break;
            case 'L': //Display the Liahona Reference menu
                this.displayLiahonaReference();
                break;
            case 'Q':
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection ***"
                        + " Please select a valid display option ***");
                break;

        }
        return false;
    }

    private void goalOfGame() {
        ErrorView.display(this.getClass().getName(),
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
        ErrorView.display(this.getClass().getName(),
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
        ErrorView.display(this.getClass().getName(),
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
        ErrorView.display(this.getClass().getName(),
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
        ErrorView.display(this.getClass().getName(),
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
