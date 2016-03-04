/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nephisJourney.src.view;

import java.util.Scanner;

/**
 *
 * @author adamh_000
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;

    public View() {
    }

    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {

        boolean done = false; // set flag to not done
        do {
            // prompt for and get user's menu option
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // user wants to quit
            {
                return; // exit view
            }
            // do the requested action and display the next view
            done = this.doAction(value);

        } while (!done);
    }

    @Override
    public String getInput() {
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false; // set flag to not done
        String value = null;

        while (!valid) {
            System.out.println("\n" + this.displayMessage);
            // get the value entered from the keyboard
            value = keyboard.nextLine();
            value = value.trim();

            if (value.length() < 1) { //blank value entered
                System.out.println("\n*** You must enter a value ***");
                continue;
            }
            break;
        }
        return value;
    }
}
