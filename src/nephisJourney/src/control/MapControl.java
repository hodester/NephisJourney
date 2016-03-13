package nephisJourney.src.control;

import javafx.scene.Scene;
import nephisJourney.NephisJourney;
import nephisJourney.src.enums.SceneType;
import nephisJourney.src.model.Game;
import nephisJourney.src.model.Map;
import nephisJourney.src.enums.Actor;
import nephisJourney.src.enums.Item;
import nephisJourney.src.enums.SceneType;
import nephisJourney.src.model.Game;
import nephisJourney.src.model.Location;
import nephisJourney.src.model.Map;
import nephisJourney.src.model.ResourceSceneType;
import nephisJourney.src.model.WarehouseSceneType;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;
import static nephisJourney.src.control.GameControl.assignScenesToLocations;
/**
 *
 * @author Jenaca
 */
public class MapControl {

    public static Map createMap() {
        // create the map
        Map map = new Map(8, 8);
        
        // create the scenes for the game
        Scene[] location = createScenes();
        
        // assign scenes to locations
        assignScenesToLocations(map, location);
        
        return map;
    }

    private static Scene[] createScenes() {
        Game game = NephisJourney.getCurrentGame();
        
        Location[] location = new Location[SceneType.values().length];
        
        Location Nephi1_4aScene = new Location();
        Nephi1_4aScene.setDescription(
                "\n  Jerusalem during reign of Zedekiah, king of Judah."
        );
        Nephi1_4aScene.setMapSymbol(" JZ ");
        Nephi1_4aScene.setBlocked(false);
        location[SceneType.Nephi1_4a.ordinal()] = Nephi1_4aScene;
        
        Location Nephi1_4Scene = new Location();
        Nephi1_4Scene.setDescription(
                "\n  Enters the wilderness, traveled the shores of the Red Sea."
        );
        Nephi1_4Scene.setMapSymbol(" WD ");
        Nephi1_4Scene.setBlocked(false);
        location[SceneType.Nephi1_4.ordinal()] = Nephi1_4Scene;
        
        Location Nephi2_4to5Scene = new Location();
        Nephi2_4to5Scene.setDescription(
                "\n  Lehi’s tent by the Red Sea."
        );
        Nephi2_4to5Scene.setMapSymbol(" TS ");
        Nephi2_4to5Scene.setBlocked(false);
        location[SceneType.Nephi2_4to5.ordinal()] = Nephi2_4to5Scene;
        
        Location Nephi3_1Scene = new Location();
        Nephi3_1Scene.setDescription(
                "\n  Wilderness - Return to Jerusalem to get the Plates of Brass."
        );
        Nephi3_1Scene.setMapSymbol(" PB ");
        Nephi3_1Scene.setBlocked(false);
        location[SceneType.Nephi3_1.ordinal()] = Nephi3_1Scene;
        
        Location Nephi3_2to3Scene = new Location();
        Nephi3_2to3Scene.setDescription(
                "\n  Jerusalem – House of Laban."
        );
        Nephi3_2to3Scene.setMapSymbol(" HL ");
        Nephi3_2to3Scene.setBlocked(false);
        location[SceneType.Nephi3_2to3.ordinal()] = Nephi3_2to3Scene;
        
        Location Nephi3_10Scene = new Location();
        Nephi3_10Scene.setDescription(
                "\n  Lehi’s house – collect treasures."
        );
        Nephi3_10Scene.setMapSymbol(" CT ");
        Nephi3_10Scene.setBlocked(false);
        location[SceneType.Nephi3_10.ordinal()] = Nephi3_10Scene;
        
        Location Nephi3_16Scene = new Location();
        Nephi3_16Scene.setDescription(
                "\n  House of Laban with treasures."
        );
        Nephi3_16Scene.setMapSymbol(" LT ");
        Nephi3_16Scene.setBlocked(false);
        location[SceneType.Nephi3_16.ordinal()] = Nephi3_16Scene;
        
        Location Nephi3_24to25Scene = new Location();
        Nephi3_24to25Scene.setDescription(
                "\n  Wilderness – flee from Laban’s servants."
        );
        Nephi3_24to25Scene.setMapSymbol(" FW ");
        Nephi3_24to25Scene.setBlocked(false);
        location[SceneType.Nephi3_24to25.ordinal()] = Nephi3_24to25Scene;
        
        Location Nephi3_26Scene = new Location();
        Nephi3_26Scene.setDescription(
                "\n  Angel visit."
        );
        Nephi3_26Scene.setMapSymbol(" AV ");
        Nephi3_26Scene.setBlocked(false);
        location[SceneType.Nephi3_26.ordinal()] = Nephi3_26Scene;
        
        Location Nephi3_29Scene = new Location();
        Nephi3_29Scene.setDescription(
                "\n  Streets of Jerusalem, night time – try3 – Nephi slays Laban."
        );
        Nephi3_29Scene.setMapSymbol(" SJ ");
        Nephi3_29Scene.setBlocked(false);
        location[SceneType.Nephi3_29.ordinal()] = Nephi3_29Scene;
        
        Location Nephi4_7to18Scene = new Location();
        Nephi4_7to18Scene.setDescription(
                "\n  House of Laban, retrieve plates."
        );
        Nephi4_7to18Scene.setMapSymbol(" LP ");
        Nephi4_7to18Scene.setBlocked(false);
        location[SceneType.Nephi4_7to18.ordinal()] = Nephi4_7to18Scene;
        
        Location Nephi4_20Scene = new Location();
        Nephi4_20Scene.setDescription(
                "\n  Laban’s treasury."
        );
        Nephi4_20Scene.setMapSymbol(" LT ");
        Nephi4_20Scene.setBlocked(false);
        location[SceneType.Nephi4_20.ordinal()] = Nephi4_20Scene;
        
        Location Nephi4_24Scene = new Location();
        Nephi4_24Scene.setDescription(
                "\n  Wilderness with Zoram, return to Lehi."
        );
        Nephi4_24Scene.setMapSymbol(" WZ ");
        Nephi4_24Scene.setBlocked(false);
        location[SceneType.Nephi4_24.ordinal()] = Nephi4_24Scene;
        
        Location Nephi4_28_38Scene = new Location();
        Nephi4_28_38Scene.setDescription(
                "\n  Lehi’s camp, Sariah rejoices."
        );
        Nephi4_28_38Scene.setMapSymbol(" SR ");
        Nephi4_28_38Scene.setBlocked(false);
        location[SceneType.Nephi4_28_38.ordinal()] = Nephi4_28_38Scene;
        
        Location Nephi5_7to8Scene = new Location();
        Nephi5_7to8Scene.setDescription(
                "\n  Ishmael’s home to get Wives."
        );
        Nephi5_7to8Scene.setMapSymbol(" WI ");
        Nephi5_7to8Scene.setBlocked(false);
        location[SceneType.Nephi5_7to8.ordinal()] = Nephi5_7to8Scene;
        
        Location Nephi7_3to5Scene = new Location();
        Nephi7_3to5Scene.setDescription(
                "\n  Wilderness – rebellion of brothers."
        );
        Nephi7_3to5Scene.setMapSymbol(" RB ");
        Nephi7_3to5Scene.setBlocked(false);
        location[SceneType.Nephi7_3to5.ordinal()] = Nephi7_3to5Scene;
        
        Location Nephi7_6to7Scene = new Location();
        Nephi7_6to7Scene.setDescription(
                "\n  Lehi’s camp with Ishmael’s family."
        );
        Nephi7_6to7Scene.setMapSymbol(" LC ");
        Nephi7_6to7Scene.setBlocked(false);
        location[SceneType.Nephi7_6to7.ordinal()] = Nephi7_6to7Scene;
        
        Location Nephi7_22Scene = new Location();
        Nephi7_22Scene.setDescription(
                "\n  Plate making – Lehi’s camp."
        );
        Nephi7_22Scene.setMapSymbol(" PM ");
        Nephi7_22Scene.setBlocked(false);
        location[SceneType.Nephi7_22.ordinal()] = Nephi7_22Scene;
        
        Location Nephi9_2Scene = new Location();
        Nephi9_2Scene.setDescription(
                "\n  Valley of Lemuel, Marriage."
        );
        Nephi9_2Scene.setMapSymbol(" VL ");
        Nephi9_2Scene.setBlocked(false);
        location[SceneType.Nephi9_2.ordinal()] = Nephi9_2Scene;
        
        Location Nephi16_7Scene = new Location();
        Nephi16_7Scene.setDescription(
                "\n  Lehi’s tent – finds the Liahona."
        );
        Nephi16_7Scene.setMapSymbol(" FL ");
        Nephi16_7Scene.setBlocked(false);
        location[SceneType.Nephi16_7.ordinal()] = Nephi16_7Scene;
        
        Location Nephi16_10Scene = new Location();
        Nephi16_10Scene.setDescription(
                "\n  River Laman crossing."
        );
        Nephi16_10Scene.setMapSymbol(" RL ");
        Nephi16_10Scene.setBlocked(false);
        location[SceneType.Nephi16_10.ordinal()] = Nephi16_10Scene;
        
        Location Nephi16_12Scene = new Location();
        Nephi16_12Scene.setDescription(
                "\n  Travel to Shazer."
        );
        Nephi16_12Scene.setMapSymbol(" TS ");
        Nephi16_12Scene.setBlocked(false);
        location[SceneType.Nephi16_12.ordinal()] = Nephi16_12Scene;
        
        Location Nephi16_13Scene = new Location();
        Nephi16_13Scene.setDescription(
                "\n  Hunting by Shazer."
        );
        Nephi16_13Scene.setMapSymbol(" HS ");
        Nephi16_13Scene.setBlocked(false);
        location[SceneType.Nephi16_13.ordinal()] = Nephi16_13Scene;
        
        Location Nephi16_14Scene = new Location();
        Nephi16_14Scene.setDescription(
                "\n  Wilderness travel."
        );
        Nephi16_14Scene.setMapSymbol(" WT ");
        Nephi16_14Scene.setBlocked(false);
        location[SceneType.Nephi16_14.ordinal()] = Nephi16_14Scene;
        
        Location Nephi16_17Scene = new Location();
        Nephi16_17Scene.setDescription(
                "\n  Hunting – Nephi breaks bow."
        );
        Nephi16_17Scene.setMapSymbol(" HB ");
        Nephi16_17Scene.setBlocked(false);
        location[SceneType.Nephi16_17.ordinal()] = Nephi16_17Scene;
        
        Location Nephi16_18Scene = new Location();
        Nephi16_18Scene.setDescription(
                "\n  Lehi consults Liahona, where Nephi needs to hunt."
        );
        Nephi16_18Scene.setMapSymbol(" LI ");
        Nephi16_18Scene.setBlocked(false);
        location[SceneType.Nephi16_18.ordinal()] = Nephi16_18Scene;
        
        Location Nephi16_27to30Scene = new Location();
        Nephi16_27to30Scene.setDescription(
                "\n  Wilderness travel east."
        );
        Nephi16_27to30Scene.setMapSymbol(" WE ");
        Nephi16_27to30Scene.setBlocked(false);
        location[SceneType.Nephi16_27to30.ordinal()] = Nephi16_27to30Scene;
        
        Location Nephi17_1Scene = new Location();
        Nephi17_1Scene.setDescription(
                "\n  Land of Bountiful."
        );
        Nephi17_1Scene.setMapSymbol(" LB ");
        Nephi17_1Scene.setBlocked(false);
        location[SceneType.Nephi17_1.ordinal()] = Nephi17_1Scene;
        
        Location Nephi17_5Scene = new Location();
        Nephi17_5Scene.setDescription(
                "\n  Nephi Builds a ship."
        );
        Nephi17_5Scene.setMapSymbol(" BS ");
        Nephi17_5Scene.setBlocked(false);
        location[SceneType.Nephi17_5.ordinal()] = Nephi17_5Scene;
        
        Location Nephi17_8Scene = new Location();
        Nephi17_8Scene.setDescription(
                "\n  Shocking experience."
        );
        Nephi17_8Scene.setMapSymbol(" SE ");
        Nephi17_8Scene.setBlocked(false);
        location[SceneType.Nephi17_8.ordinal()] = Nephi17_8Scene;
        
        Location Nephi17_54Scene = new Location();
        Nephi17_54Scene.setDescription(
                "\n  Enter the ship."
        );
        Nephi17_54Scene.setMapSymbol(" ES ");
        Nephi17_54Scene.setBlocked(false);
        location[SceneType.Nephi17_54.ordinal()] = Nephi17_54Scene;
        
        Location Nephi18_5Scene = new Location();
        Nephi18_5Scene.setDescription(
                "\n  Sail to the promised land."
        );
        Nephi18_5Scene.setMapSymbol(" SP ");
        Nephi18_5Scene.setBlocked(false);
        location[SceneType.Nephi18_5.ordinal()] = Nephi18_5Scene;
        
        Location Nephi18_8Scene = new Location();
        Nephi18_8Scene.setDescription(
                "\n  Arrive at promised land."
        );
        Nephi18_8Scene.setMapSymbol(" PL ");
        Nephi18_8Scene.setBlocked(false);
        location[SceneType.Nephi18_8.ordinal()] = Nephi18_8Scene;    
        
        return null;
    }
    
     public static void moveActorsToStartingLocaton(Map map) {
        System.out.println("\n moveActorsToStartingLocation called.");
    }
}
