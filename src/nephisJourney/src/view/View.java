package nephisJourney.src.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import nephisJourney.NephisJourney;

public abstract class View implements ViewInterface {

    private String displayMessage;

    protected final BufferedReader keyboard = NephisJourney.getInFile();
    protected final PrintWriter console = NephisJourney.getOutFile();
    private boolean message = true;

    public View() {
        this.message = true;
    }

    public View(String message) {
        this.message = true;
        this.displayMessage = message;
    }

    public View(boolean input, String message) {
        this.message = input;
        this.displayMessage = message;
    }

    public String getDisplayMessage() {
        return displayMessage;
    }

    public void setDisplayMessage(String message) {
        this.displayMessage = message;
    }

    public void display() {
        String value = "";
        boolean done = false; 
        do {
            this.console.println(this.displayMessage); // prompt only
            if (this.message) {
                value = this.getInput(); // get input
            }
            done = this.doAction(value); // do the action and return true if working

        } while (!done);
    }

    @Override
    public String getInput() {
        //Scanner keyboard = new Scanner(System.in);
        boolean valid = false; // set flag to not done
        String selection = null;
        try {
            while (!valid) {
                // get the selection entered from the keyboard
                selection = this.keyboard.readLine(); //read user input
                selection = selection.trim();

                if (selection.length() < 1) { //blank selection entered
                    ErrorView.display(this.getClass().getName(), "You Must enter a value.");
                    continue;
                }
                break;
            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
            return null;

        }
        return selection;
    }
}
