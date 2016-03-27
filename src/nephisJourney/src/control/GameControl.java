package nephisJourney.src.control;

import java.awt.Point;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javafx.scene.Scene;
import nephisJourney.NephisJourney;
import nephisJourney.src.enums.Actor;
import nephisJourney.src.enums.Item;
import nephisJourney.src.enums.SceneType;
import nephisJourney.src.exceptions.GameControlException;
import nephisJourney.src.model.Game;
import nephisJourney.src.model.Location;
import nephisJourney.src.model.Map;
import nephisJourney.src.model.Player;
import nephisJourney.src.model.SupplyInventory;
import nephisJourney.src.view.GameMenuView;

/**
 *
 * @author Jenaca
 */
public class GameControl {

    public static void saveGame(Game game, String filePath)
            throws GameControlException {

        try (FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);

            output.writeObject(game);

        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }

    }

    public static void getSavedGame(String filePath)
            throws GameControlException {

        Game game = null;

        try (FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);

            game = (Game) input.readObject();

        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
        NephisJourney.setCurrentGame(game);
    }

    public static SupplyInventory[] getSortedInventoryList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public GameControl() {
    }

    public static Player createPlayer(String name)
            throws GameControlException {

        if (name.length() < 2) {
            throw new GameControlException("Name not accepted "
                    + name + " does not contain more than"
                    + " one characture, please try again.");
        }

        Player player = new Player();
        player.setName(name);

        NephisJourney.setPlayer(player); //save the player

        return player;
    }

    public static void createNewGame(Player player) {
        Game game = new Game();
        NephisJourney.setCurrentGame(game);

        game.setPlayer(player);

        SupplyInventory[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);

        Map map = MapControl.createMap();
        game.setMap(map);

        /*MapControl.moveActorToLocation(Actor actor, Point coordinates);*/
    }

    public static SupplyInventory[] createInventoryList() {
        // created array(list) of inventory items    
        SupplyInventory[] inventory
                = new SupplyInventory[12];

        SupplyInventory platesOfBrass = new SupplyInventory();
        platesOfBrass.setDescription("Plates Of Brass");
        platesOfBrass.setQuantityInStock(1);
        platesOfBrass.setRequiredAmount(1);
        inventory[Item.platesOfBrass.ordinal()] = platesOfBrass;

        SupplyInventory liahona = new SupplyInventory();
        liahona.setDescription("Liahona");
        liahona.setQuantityInStock(1);
        liahona.setRequiredAmount(1);
        inventory[Item.liahona.ordinal()] = liahona;

        SupplyInventory bow = new SupplyInventory();
        bow.setDescription("Bow");
        bow.setQuantityInStock(1);
        bow.setRequiredAmount(0);
        inventory[Item.bow.ordinal()] = bow;

        SupplyInventory stones = new SupplyInventory();
        stones.setDescription("Stones");
        stones.setQuantityInStock(0);
        stones.setRequiredAmount(4);
        inventory[Item.stones.ordinal()] = stones;

        SupplyInventory meat = new SupplyInventory();
        meat.setDescription("Life blood");
        meat.setQuantityInStock(0);
        meat.setRequiredAmount(0);
        inventory[Item.meat.ordinal()] = meat;

        SupplyInventory timber = new SupplyInventory();
        timber.setDescription("Timber");
        timber.setQuantityInStock(0);
        timber.setRequiredAmount(0);
        inventory[Item.timber.ordinal()] = timber;

        SupplyInventory grains = new SupplyInventory();
        grains.setDescription("Grains");
        grains.setQuantityInStock(0);
        grains.setRequiredAmount(0);
        inventory[Item.grains.ordinal()] = grains;

        SupplyInventory oil = new SupplyInventory();
        oil.setDescription("Oil");
        oil.setQuantityInStock(0);
        oil.setRequiredAmount(0);
        inventory[Item.oil.ordinal()] = oil;

        SupplyInventory water = new SupplyInventory();
        water.setDescription("Cell regenerator");
        water.setQuantityInStock(0);
        water.setRequiredAmount(0);
        inventory[Item.water.ordinal()] = water;

        SupplyInventory honey = new SupplyInventory();
        honey.setDescription("Honey");
        honey.setQuantityInStock(0);
        honey.setRequiredAmount(0);
        inventory[Item.honey.ordinal()] = honey;

        SupplyInventory salt = new SupplyInventory();
        salt.setDescription("Salt");
        salt.setQuantityInStock(0);
        salt.setRequiredAmount(0);
        inventory[Item.salt.ordinal()] = salt;

        return inventory;
    }

    public static SupplyInventory[] getSortedSupplyInventoryList() {
        // get inventory list for the current game
        SupplyInventory[] originalInventoryList
                = NephisJourney.getCurrentGame().getInventory();

        // make a copy of original List
        SupplyInventory[] inventoryList = originalInventoryList.clone();

        // using a BubbleSort to sort the list of inventoryList by name
        SupplyInventory tempInventoryItem;
        for (int i = 0; i < inventoryList.length - 1; i++) {
            for (int j = 0; j < inventoryList.length - 1 - i; j++) {
                if (inventoryList[j].getDescription().
                        compareToIgnoreCase(inventoryList[j + 1].getDescription()) > 0) {
                    tempInventoryItem = inventoryList[j];
                    inventoryList[j] = inventoryList[j + 1];
                    inventoryList[j + 1] = tempInventoryItem;
                }
            }
        }

        return inventoryList;
    }

    public static Location[][] getMapLocations() {
        return NephisJourney.getCurrentGame().getMap().getLocations();
    }

    public static SupplyInventory[] getInventory() {
        return NephisJourney.getCurrentGame().getInventory();
    }

}
