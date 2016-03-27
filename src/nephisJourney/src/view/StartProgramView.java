package nephisJourney.src.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import nephisJourney.NephisJourney;
import nephisJourney.src.control.GameControl;
import nephisJourney.src.exceptions.GameControlException;
import nephisJourney.src.model.Player;

/**
 *
 * @author adamh_000
 */
public class StartProgramView {

    //promptMessage = "Please enter your name"
    private String promptMessage;
    
    protected final BufferedReader keyboard = NephisJourney.getInFile();
    protected final PrintWriter console = NephisJourney.getOutFile();

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

    public void displayStartProgramView(String playerName) throws GameControlException {
       boolean done = false; //set flag to not done
        do {
            //promt for and get players name
            playerName = this.getPlayerName();
            if (playerName.toUpperCase().equals("Q")) //user wants to quit
            {
                return; //exit the game
            }
            //do the requested action and display the next view
            done = this.doAction(playerName);

        } while (!done);
    }

    private String getPlayerName() {
        //Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String selection = null; //value to be returned
        boolean valid = false; //initialize to not valid
        try {
        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);

            selection = this.keyboard.readLine(); //get next line typed on keyboard
            selection = selection.trim(); //trim off leading and trailing white space

            if (selection.length() < 1) { //value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }

            break; //end the loop
        }
        } catch (Exception e){
           ErrorView.display(this.getClass().getName(),
                   "Error reading input: " + e.getMessage());
        }
        return selection; //return the value entered
    }

    private boolean doAction(String playerName) throws GameControlException {
                  //Scanner scanner = new Scanner(System.in);
        int x= 1;
        do { 
        try{
        //call createPlayer() control function
        Player player = GameControl.createPlayer(playerName);        
        x=2;
      
        }catch(GameControlException e) {
            ErrorView.display(this.getClass().getName(),
                    e.getMessage());
          
        }
        }while(x==1);
        return true;
    }
      
    

    private void displayNextView(Player player) {

        //display a custom welcome message
        ErrorView.display(this.getClass().getName(),
                "\n=============================================="
                + "\n Welcome to Nephi's Journey, "
                + player.getName() + "."
                + "\n We hope you have a fun adventure!"
                + "\n=============================================="
        );

        //Create mainMenuView object
        MainMenuView mainMenuView = new MainMenuView();

        //Display the main menu view
        mainMenuView.display();
    }

    public void displayStartProgramView() {
         ErrorView.display(this.getClass().getName(),
                 "error message - StartProgramView");
    }

    
}
