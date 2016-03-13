package nephisJourney.src.view;

import java.io.PrintWriter;
import java.util.Scanner;
import javafx.scene.Scene;
import nephisJourney.NephisJourney;
import nephisJourney.src.control.GameControl;
import nephisJourney.src.model.Location;
import nephisJourney.src.model.SupplyInventory;

/**
 *
 * @author Jenaca
 */
public class GameMenuView extends View {
//promptMessage = "Please select a letter...: "

    /*private final String promptMessage;

    public GameMenuView() {
        this.promptMessage = "\nPlease select the letter corresponding "
                + "to the menu item: ";
    }*/

    public GameMenuView() {
        super(
                "\n"
                + "\n--------------------------------------------"
                + "\n|Game Menu                                 |"
                + "\n--------------------------------------------"
                + "\nV - View map"
                + "\nI - View Inventory"
                + "\nA - View list of characters"
                + "\nS - View path status"
                + "\nL - View contents of location"
                + "\nM - Move person to a new location"
                + "\nC - Consult the Liahona"
                + "\nD - Design altar"
                + "\nT - Collect treasure"
                + "\nG - Gather stones"
                + "\nB - Use bow to hunt"
                + "\nW - Build altar"
                + "\nP - Pack ship"
                + "\nJ - Launch ship"
                + "\nQ - Quit"
                + "\n--------------------------------------------");

    }

    /*public void displayGameMenuView() {

        boolean done = false; // set flag to not done
        do {
            // prompt for and get user's menu option
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
            {
                //Create mainMenuView object when user quits game menu
                //display main menu and exit the game menu
                MainMenuView mainMenuView = new MainMenuView();
                return; // exit the game menu
            }
            // do the requested action and display the next view
            done = this.doAction(menuOption);

        } while (!done);
    }*/

    /*private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid

        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);

            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim(); //trim off leading and trailing white space

            if (value.length() < 1) { //value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            if (value.length() > 1) { //value is too long
                System.out.println("\nInvalid value: Please select the letter "
                        + "corresponding to the menu item.");
                continue;
            }
            break; //end the loop
        }

        return value; //return the value entered
    }*/

    @Override
    public boolean doAction(String menuOption) {

        menuOption = menuOption.toUpperCase(); // convert choice to upper case

        switch (menuOption) {
            case "V": // View map
                this.displayMap();
                break;
            case "I": // View a list of items in inventory
                this.viewInventory();
                break;
            case "A": // View list of characters
                this.viewCharacters();
                break;
            case "S": // View path status
                this.viewStatus();
                break;
            case "L": // View contents of the location
                this.viewLocationContents();
                break;
            case "M": // Move person to new location
                this.moveToNewLocation();
                break;
            case "C": // Consult the Liahona 
                this.consultLiahona();
                break;
            case "D": // Design altar
                this.designAltar();
                break;
            case "T": // Collect treasure
                this.collectTreasure();
                break;
            case "G": // Gather stones
                this.gatherStones();
                break;
            case "B": // Use bow to hunt
                this.huntWithBow();
                break;
            case "W": // Build altar
                this.buildAltar();
                break;
            case "P": // Pack ship
                this.packShip();
                break;
            case "J": // Launch ship
                this.launchShip();
                break;
            default:
                System.out.println("\n*** Invalid selection ***"
                        + " Please select a valid display option ***");
                break;

        }
        return false;

    }

    public void displayMap() {
        this.viewMap(NephisJourney.getOutFile());
    }

    public void viewMap(PrintWriter out) {
        int lineLength = 0;

        // get the map for the game
        Location[][] locations = GameControl.getMapLocations();
        int columnCount = locations[0].length; // get number columns in row

        this.printTitle(out, columnCount, "NEPHI'S JOURNEY");
        this.printColumnHeaders(out, columnCount);

        for (int i = 0; i < locations.length; i++) {
            Location[] rowLocations = locations[i];
            this.printRowDivider(out, columnCount);
            out.println(); // move down one i
            if (i < 9) {
                out.print(" " + (i + 1));
            } else {
                out.print(i + 1);
            }

            // for every column in the row
            for (int column = 0; column < columnCount; column++) {
                out.print("|"); // print column divider
                Location location = rowLocations[column];
                if (location != null && location.isVisited()) { // if location is visited 

                    Scene scene = location.getScene();
                    if (scene != null) {
                        out.print(location.getMapSymbol());
                    } else {
                        out.print("    ");
                    }
                } else {
                    out.print(" ?? ");
                }
            }

            out.print("|"); // print column divider
        }

        this.printRowDivider(out, columnCount);
    }

    private void viewInventory() {

        // get the sorted list of inventory items fro the current game
        SupplyInventory[] inventory = GameControl.getSortedSupplyInventoryList();

        System.out.println("\nList of Inventory Items");
        System.out.println("Description" + "\t" + "Required" + "\t"
                + "In stock");

        //for each inventory item
        for (SupplyInventory supplyInventory : inventory) {
            //Display the description, required amount, and quantity
            System.out.println(supplyInventory.getDescription() + "\t     "
                    + supplyInventory.getRequiredAmount() + "\t     "
                    + supplyInventory.getQuantityInStock());

        }

        /* //view treasure menu
        ResourceInventoryView viewInventory = new ResourceInventoryView();
        viewInventory.display();
        //Create collectTreasureView object
        ResourceInventoryView viewInventoryView = new ResourceInventoryView();

        //Display the collect treasure view
        viewInventoryView.display();*/
    }

    private void viewCharacters() {
        System.out.println("*** viewCharacters function was called ***");
    }

    private void viewStatus() {
        System.out.println("*** viewStatus function was called ***");
    }

    private void viewLocationContents() {
        System.out.println("*** viewLocationContents function was called ***");
    }

    private void moveToNewLocation() {
        System.out.println("*** moveToNewLocation function was called ***");
    }

    private void consultLiahona() {
        System.out.println("*** consultLiahona function was called ***");
    }

    private void designAltar() {
        System.out.println("*** designAltar function was called ***");
    }

    private void collectTreasure() {
        //view treasure menu
        CollectTreasureView collectTreasure = new CollectTreasureView();
        collectTreasure.display();
        //Create collectTreasureView object
        CollectTreasureView collectTreasureView = new CollectTreasureView();

        //Display the collect treasure view
        collectTreasureView.display();
    }

    private void gatherStones() {
        System.out.println("*** gatherStones function was called ***");
    }

    private void huntWithBow() {
        //view treasure menu
        HuntWithBowView huntWithBow = new HuntWithBowView();
        huntWithBow.display();
        //Create collectTreasureView object
        HuntWithBowView huntWithBowView = new HuntWithBowView();

        //Display the collect treasure view
        huntWithBowView.display();
    }

    private void buildAltar() {
        System.out.println("*** buildAltar function was called ***");
    }

    private void packShip() {
        System.out.println("*** packShip function was called ***");
    }

    private void launchShip() {
        System.out.println("*** launchShip function was called ***");
    }

    private void printTitle(PrintWriter out, int columnCount, String title) {
        int titleLength = title.length();
        int lineLength = columnCount * 5 + 3;
        int startPosition = (lineLength / 2) - (titleLength / 2);
        out.println("\n");
        for (int i = 0; i < startPosition; i++) {
            out.print(" ");  
        }
        out.print(title);
        out.println("\n");
    }

    private void printColumnHeaders(PrintWriter out, int columnCount) {
        for (int i = 1; i < columnCount + 1; i++) {
            if (i < 10) {
                out.print("   " + i + " ");
            } else {
                out.print("  " + i + " ");
            }
        }
    }

    private void printRowDivider(PrintWriter out, int columnCount) {
        out.println();
        out.print("  ");
        for (int i = 0; i < columnCount; i++) { // print row divider
                out.print("-----");
        }
        out.print("-");
    }

}
