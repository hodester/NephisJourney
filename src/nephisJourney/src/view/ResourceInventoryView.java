package nephisJourney.src.view;

import java.util.Scanner;
import nephisJourney.NephisJourney;
import nephisJourney.src.model.SupplyInventory;

/**
 *
 * @author adamh_000
 */
public class ResourceInventoryView extends View {

    // Prompt message = "Please select from the following options:"
    private String promptMessage;

    public ResourceInventoryView() {

        super(
                "\n"
                + "\n-------------------------------------------"
                + "\n|           Resource Inventory            |"
                + "\n-------------------------------------------"
                + "\nP - Plates of Brass"
                + "\nL - Liahona"
                + "\nB - Bow"
                + "\nS - Stones"
                + "\nM - Meat"
                + "\nT - Timber"
                + "\nO - Ore"
                + "\nW - Water"
                + "\nH - Honey"
                + "\nA - Salt"
                + "\nQ - Quit"
                + "\n-------------------------------------------"
        );

    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        switch (value) {
            case "P": // access plates of brass
                this.platesOfBrass();
                break;
            case "L": // access the Liahona inventory
                this.liahona();
                break;
            case "B": // access Bow inventory
                this.bow();
                break;
            case "S": // show amount of stones
                this.stones();
                break;
            case "M": // show how much meat is collected
                this.meat();
                break;
            case "T": // show amount of timber
                this.timber();
                break;
            case "O": // show amount of ore in inventory
                this.ore();
                break;
            case "W": // show amount of water in inventory
                this.water();
                break;
            case "H": // show amount of honey in inventory
                this.honey();
                break;
            case "A": // show amount of salt in inventory
                this.salt();
                break;
            default:
                System.out.println("\n*** Invalid selection ***"
                        + "Please select a valid display option ***");
                break;

        }
        return false;
    }

    private static void platesOfBrass() {
        System.out.println("\n displays amount in inventory");
    }

    private static void liahona() {
        System.out.println("\n displays amount in inventory");
    }

    private static void bow() {
        System.out.println("\n displays amount in inventory");
    }

    private static void stones() {
        System.out.println("\n displays amount in inventory");
    }

    private static void meat() {
        System.out.println("\n displays amount in inventory");
    }

    private static void timber() {
        System.out.println("\n displays amount in inventory");
    }

    private static void ore() {
        System.out.println("\n displays amount in inventory");
    }

    private static void water() {
        System.out.println("\n displays amount in inventory");
    }

    private static void honey() {
        System.out.println("\n displays amount in inventory");
    }

    private static void salt() {
        System.out.println("\n displays amount in inventory");
    }

    @Override
    public void display() {
        System.out.println("Dispaly resource inventory view called");
    }

}
