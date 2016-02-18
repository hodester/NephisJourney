/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nephisJourney.view;

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
        System.out.println("\n*** displayProgramView function called ***");
    }

}
