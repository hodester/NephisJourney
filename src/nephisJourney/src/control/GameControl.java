package nephisJourney.src.control;

import javafx.scene.Scene;
import nephisJourney.NephisJourney;
import nephisJourney.src.enums.Item;
import nephisJourney.src.enums.SceneType;
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

    public static Player createPlayer(String name) {

        if (name == null) {
            return null;
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

        MapControl.moveActorsToStartingLocaton(map);

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

    protected static void assignScenesToLocations(Map map, Scene[] location) {

        Location[][] locations = map.getLocations();

        //start point
        locations[0][1].setScene(location[SceneType.Nephi1_4a.ordinal()]);
        locations[0][1].setScene(location[SceneType.Nephi1_4.ordinal()]);
        locations[1][1].setScene(location[SceneType.Nephi2_4to5.ordinal()]);
        locations[2][1].setScene(location[SceneType.Nephi3_1.ordinal()]);
        locations[0][1].setScene(location[SceneType.Nephi3_2to3.ordinal()]);
        locations[0][1].setScene(location[SceneType.Nephi3_10.ordinal()]);
        locations[0][1].setScene(location[SceneType.Nephi3_16.ordinal()]);
        locations[0][1].setScene(location[SceneType.Nephi3_24to25.ordinal()]);
        locations[1][1].setScene(location[SceneType.Nephi3_26.ordinal()]);
        locations[1][1].setScene(location[SceneType.Nephi3_29.ordinal()]);
        locations[0][1].setScene(location[SceneType.Nephi4_7to18.ordinal()]);
        locations[0][1].setScene(location[SceneType.Nephi4_20.ordinal()]);
        locations[0][1].setScene(location[SceneType.Nephi4_24.ordinal()]);
        locations[1][1].setScene(location[SceneType.Nephi4_28_38.ordinal()]);
        locations[2][1].setScene(location[SceneType.Nephi5_7to8.ordinal()]);
        locations[0][1].setScene(location[SceneType.Nephi7_3to5.ordinal()]);
        locations[1][1].setScene(location[SceneType.Nephi7_6to7.ordinal()]);
        locations[2][1].setScene(location[SceneType.Nephi7_22.ordinal()]);
        locations[2][1].setScene(location[SceneType.Nephi9_2.ordinal()]);
        locations[2][0].setScene(location[SceneType.Nephi16_7.ordinal()]);
        locations[3][0].setScene(location[SceneType.Nephi16_10.ordinal()]);
        locations[3][1].setScene(location[SceneType.Nephi16_12.ordinal()]);
        locations[4][2].setScene(location[SceneType.Nephi16_13.ordinal()]);
        locations[4][1].setScene(location[SceneType.Nephi16_14.ordinal()]);
        locations[5][2].setScene(location[SceneType.Nephi16_17.ordinal()]);
        locations[6][2].setScene(location[SceneType.Nephi16_18.ordinal()]);
        locations[7][2].setScene(location[SceneType.Nephi16_27to30.ordinal()]);
        locations[8][4].setScene(location[SceneType.Nephi17_1.ordinal()]);
        
    }

    public static SupplyInventory[] getSortedSupplyInventoryList() {
        System.out.println("\n*** getSortedInventoryList stub function called ***");
        return null;
    }

    public static Location[][] getMapLocations() {
        System.out.println("\n*** getMapLocations stub function called ***");
        return null;
    }

}
