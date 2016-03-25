package nephisJourney.src.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import nephisJourney.NephisJourney;

/**
 *
 * @author adamh_000
 */
public abstract class View implements ViewInterface {

    private String displayMessage;
    
    protected final BufferedReader keyboard = NephisJourney.getInFile();
    protected final PrintWriter console = NephisJourney.getOutFile();
    private boolean message;

    public View() {
    }

    public View(String message) {
        this.displayMessage = message;
    }

    public void display(String selection) {

        boolean done = false; // set flag to not done
        do {
            // prompt for and get user's menu option
            this.console.println(this.message); 
            selection = this.getInput();
            if (selection.toUpperCase().equals("Q")) // user wants to quit
            {
                return; // exit view
            }
            // do the requested action and display the next view
            done = this.doAction(selection);

        } while (!done);
    }

    @Override
    public String getInput() {
        //Scanner keyboard = new Scanner(System.in);
        boolean valid = false; // set flag to not done
        String selection = null;
        try {
        while (!valid) {
            System.out.println("\n" + this.displayMessage);
            // get the selection entered from the keyboard
            selection = this.keyboard.readLine();
            selection = selection.trim();

            if (selection.length() < 1) { //blank selection entered
                //System.out.println("\n*** You must enter a selection ***");
                ErrorView.display(this.getClass().getName(), 
                        "You Must enter a value.");
                continue;
            }
            break;
        }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + e.getMessage());
            return null;
            
        }
        return selection;
    }
}
