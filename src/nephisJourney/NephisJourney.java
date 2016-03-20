package nephisJourney;

import java.util.logging.Level;
import java.util.logging.Logger;
import nephisJourney.src.control.TreasureControl;
import nephisJourney.src.enums.Actor;
import nephisJourney.src.exceptions.GameControlException;
import nephisJourney.src.model.Altar;
import nephisJourney.src.model.Game;
import nephisJourney.src.model.Hunting;
import nephisJourney.src.model.Liahona;
import nephisJourney.src.model.LiahonaReferences;
import nephisJourney.src.model.Location;
import nephisJourney.src.model.Map;
import nephisJourney.src.model.Player;
import nephisJourney.src.model.Scene;
import nephisJourney.src.model.ResourceSceneType;
import nephisJourney.src.model.Ship;
import nephisJourney.src.model.SupplyInventory;
import nephisJourney.src.model.WarehouseSceneType;
import nephisJourney.src.view.StartProgramView;

/**
 *
 * @author Jenaca
 */
public class NephisJourney {

    private static Game currentGame = null;
    private static Player player = null;  
    
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        NephisJourney.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        NephisJourney.player = player;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create StartProgramViewOrig and disply the start program view
        StartProgramView startProgramView = new StartProgramView();
         
        try {
        startProgramView.displayStartProgramView();
        } catch (Throwable te) {
            System.out.println("An error occurred while running the program.");
            te.printStackTrace();
            try {
                startProgramView.displayStartProgramView();
            } catch (GameControlException ex) {
                Logger.getLogger(NephisJourney.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        Player playerOne = new Player();

        playerOne.setName("Nephi");
        playerOne.setHighScore(525600);

        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);

        Location locationOne = new Location();

        locationOne.setRow(1);
        locationOne.setColumn(1);
        locationOne.setVisited(true);
        locationOne.setAmountRemaining(3);

        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);

        ResourceSceneType ResourceSceneTypeOne = new ResourceSceneType();

        ResourceSceneTypeOne.setRow(2);
        ResourceSceneTypeOne.setColumn(2);
        ResourceSceneTypeOne.setVisited(true);
        ResourceSceneTypeOne.setAmountRemaining(3);
        ResourceSceneTypeOne.setDescription("Lehi's House");
        ResourceSceneTypeOne.setTravelTime(2);
        ResourceSceneTypeOne.setBlocked(true);
        ResourceSceneTypeOne.setAmountAvailable(25);
        ResourceSceneTypeOne.setResourceType("Treasure");

        String ResourceSceneTypeInfo = ResourceSceneTypeOne.toString();
        System.out.println(ResourceSceneTypeInfo);

        Scene RegularSceneTypeOne = new Scene();

        RegularSceneTypeOne.setRow(3);
        RegularSceneTypeOne.setColumn(3);
        RegularSceneTypeOne.setVisited(true);
        RegularSceneTypeOne.setAmountRemaining(3);
        RegularSceneTypeOne.setDescription("Promised Land");
        RegularSceneTypeOne.setTravelTime(2);
        RegularSceneTypeOne.setBlocked(true);

        String RegularSceneTypeInfo = RegularSceneTypeOne.toString();
        System.out.println(RegularSceneTypeInfo);

        WarehouseSceneType WarehouseSceneTypeOne = new WarehouseSceneType();

        WarehouseSceneTypeOne.setRow(4);
        WarehouseSceneTypeOne.setColumn(4);
        WarehouseSceneTypeOne.setVisited(true);
        WarehouseSceneTypeOne.setAmountRemaining(3);
        WarehouseSceneTypeOne.setDescription("Lehi's Tent");
        WarehouseSceneTypeOne.setTravelTime(2);
        WarehouseSceneTypeOne.setBlocked(true);
        WarehouseSceneTypeOne.setNoOfItems(1);

        String WarehouseSceneTypeInfo = WarehouseSceneTypeOne.toString();
        System.out.println(WarehouseSceneTypeInfo); Hunting HuntingOne = new Hunting();

        HuntingOne.setDescription("Deer Meat");
        HuntingOne.setFoodQuantity(1);
        HuntingOne.setTotalWeight(154.5);
        HuntingOne.setWeight(60.4);

        String HuntingInfo = HuntingOne.toString();
        System.out.println(HuntingInfo);

        /*Actor ActorOne = new Actor();
        ActorOne.setName("Lehi");
        ActorOne.setDescription("father of Nephi");
        ActorOne.setCoordinates(343);

        String ActorInfo = ActorOne.toString();
        System.out.println(ActorOne);*/

        Map MapOne = new Map();

        MapOne.setRowCount(15);
        MapOne.setColumnCount(12);

        String MapInfo = MapOne.toString();
        System.out.println(MapInfo);

        Ship ShipOne = new Ship();

        ShipOne.setDescription("Wooden Ship");
        ShipOne.setHeight(42);
        ShipOne.setLength(180);
        ShipOne.setMaxCapacity(300);
        ShipOne.setWidth(50);

        String ShipInfo = ShipOne.toString();
        System.out.println(ShipInfo);

        SupplyInventory SupplyInventoryOne = new SupplyInventory();

        SupplyInventoryOne.setInventoryType("Gold,Silver,Swords");
        SupplyInventoryOne.setQuantityInStock(5);
        SupplyInventoryOne.setRequiredAmount(10);

        String SupplyInventoryInfo = SupplyInventoryOne.toString();
        System.out.println(SupplyInventoryInfo);

        LiahonaReferences location1 = new LiahonaReferences();

        location1.setLocationName("Jerusalem during the reign of Zedekiah, King"
                + " of Judah");
        location1.setScriptureReference("1 Nephi 1:4");

        String scriptureInfo = location1.toString();
        System.out.println(scriptureInfo);

        Liahona liahonaDescription = new Liahona();

        liahonaDescription.setDescription("A brass ball of curious workmanship.");
        liahonaDescription.setDetails("A compass used to guide you on your "
                + "journey to the promised land.");

        String brassBall = liahonaDescription.toString();
        System.out.println(brassBall);

        Altar altarScene = new Altar();

        altarScene.setName("Lehi's altar of worship.");
        altarScene.setDescription("The altar Lehi used to give thanks to the"
                + " Lord after he took his family into the wilderness.");
        altarScene.setCoordinates(50);

        String altarName = altarScene.toString();
        System.out.println(altarName);

        Game gameMenu = new Game();

        gameMenu.setHighScore(525600);
        gameMenu.setNumPeople(7);
    }

   
}
