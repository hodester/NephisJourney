package nephisJourney.src.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
/*import javafx.scene.Scene;*/
import nephisJourney.NephisJourney;
import nephisJourney.src.control.GameControl;
import nephisJourney.src.model.Location;
import nephisJourney.src.model.SupplyInventory;
import nephisJourney.src.control.GameControl;
import nephisJourney.src.enums.Actor;
import nephisJourney.src.model.Game;
import nephisJourney.src.model.Location;
import nephisJourney.src.model.Scene;
import java.awt.Point;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Jenaca
 */
public abstract class GameMenuView extends View {
//promptMessage = "Please select a letter...: "

    /*private final String promptMessage;

    public GameMenuView() {
        this.promptMessage = "\nPlease select the letter corresponding "
                + "to the menu item: ";
    }*/
    private String displayMessage;

    protected final BufferedReader keyboard = NephisJourney.getInFile();
    protected final PrintWriter console = NephisJourney.getOutFile();
    private String promptMessage;

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
                + "\nZ - View treasure inventory"
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

 /*  private String getMenuOption() {
        //Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String selection = null; //value to be returned
        boolean valid = false; //initialize to not valid
        try {
        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);
                      
            selection = keyboard.readLine(); //get next line typed on keyboard
            selection = selection.trim(); //trim off leading and trailing white space

            if (selection.length() < 1) { //value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            if (selection.length() > 1) { //value is too long
                System.out.println("\nInvalid value: Please select the letter "
                        + "corresponding to the menu item.");
                continue;
            }
            break; //end the loop
        }
        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }

        return selection; //return the value entered
    }*/
    /* public boolean doAction(String menuOption) {*/
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase(); // convert to all upper case
        char choice = value.charAt(0); // get first character entered
       /* menuOption = menuOption.toUpperCase(); // convert choice to upper case*/

        switch (choice) {
            case 'V': // View map
                this.displayMap();
                break;
            case 'I': // View a list of items in inventory
                this.viewInventory();
                break;
            case 'A': // View list of characters
                this.viewCharacters();
                break;
            case 'S': // View path status
                this.viewStatus();
                break;
            case 'L': // View contents of the location
                this.viewLocationContents();
                break;
            case 'M': // Move person to new location
                this.moveToNewLocation();
                break;
            case 'C': // Consult the Liahona 
                this.consultLiahona();
                break;
            case 'D': // Design altar
                this.designAltar();
                break;
            case 'T': // Collect treasure
                this.collectTreasure();
                break;
            case 'Z': // View treasure
                this.viewTreasure();
                break;
            case 'G': // Gather stones
                this.gatherStones();
                break;
            case 'B': // Use bow to hunt
                this.huntWithBow();
                break;
            case 'W': // Build altar
                this.buildAltar();
                break;
            case 'P': // Pack ship
                this.packShip();
                break;
            case 'J': // Launch ship
                this.launchShip();
                break;
            default:
                ErrorView.display("GameMenuView", "*** Invalid selection *** Try again");
              

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

                    javafx.scene.Scene scene = location.getScene();
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

        //view treasure menu
        /*ResourceInventoryView viewInventory = new ResourceInventoryView();
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
        MoveActorView moveActorView = new MoveActorView();     
        moveActorView.display(); 
      /*  System.out.println("*** moveToNewLocation function was called ***");*/
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
    private void viewTreasure() {
        this.viewInventory(NephisJourney.getOutFile());
    }
    
    private void viewInventory(PrintWriter out) {
        // get the sorted list of inventory items for the current game
        SupplyInventory[] inventory = GameControl.getSortedInventoryList();
        
        out.println("\n        LIST OF COLLECTED TREASURE");
        StringBuilder line = new StringBuilder("                                                          ");
        line.insert(0, "DESCRIPTION"); 
        line.insert(20, "REQUIRED");
        line.insert(30, "IN STOCK");
        out.println(line.toString());
        
        // for each inventory item
        for (SupplyInventory supplyInventory : inventory) {
            line = new StringBuilder("                                                          ");
            line.insert(0, supplyInventory.getDescription());
            line.insert(23, supplyInventory.getRequiredAmount());
            line.insert(33, supplyInventory.getQuantityInStock());
            
            // DISPLAY COLLECTED TREASURE
            out.println(line.toString());
        }   
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

    @Override
    public void display() {
         System.out.println("*** display 343 function was called ***");
    }

    private static class MoveActorView {

        public MoveActorView() {
        }

        private void display() {
            System.out.println("*** display 353 function was called ***");
        }
    }

}
