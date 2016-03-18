package nephisJourney.src.control;

import nephisJourney.src.exceptions.MapControlException;
/*import javafx.scene.Scene;*/
import nephisJourney.NephisJourney;
import nephisJourney.src.enums.SceneType;
import nephisJourney.src.model.Game;
import nephisJourney.src.model.Map;
import nephisJourney.src.enums.Actor;
import nephisJourney.src.enums.Item;
import nephisJourney.src.model.Game;
import nephisJourney.src.model.Location;
import nephisJourney.src.model.Map;
import nephisJourney.src.model.ResourceSceneType;
import nephisJourney.src.model.WarehouseSceneType;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import nephisJourney.src.model.Scene;
import nephisJourney.src.model.SupplyInventory;
/**
 *
 * @author Jenaca
 */
public class MapControl {

    Scene[] scenes;
    public static Map createMap() {
        // create the map
        Map map = new Map(8, 8);
        
        // create the scenes for the game
        Scene[] scenes = createScenes();
        
        // assign scenes to locations
        assignScenesToLocations(map, scenes);
        
        return map;
    }

    private static Scene[] createScenes() {
        Game game = NephisJourney.getCurrentGame();
        
        Scene[] scene = new Scene[SceneType.values().length];
    
        Scene Nephi1_4aScene = new Scene();
        Nephi1_4aScene.setDescription(
                "\n  Jerusalem during reign of Zedekiah, king of Judah."
        );
        Nephi1_4aScene.setMapSymbol(" JZ ");
        Nephi1_4aScene.setBlocked(false);
        /*scenes[SceneType.Nephi1_4a.ordinal()] = Nephi1_4aScene;*/
        
        Scene Nephi1_4Scene = new Scene();
        Nephi1_4Scene.setDescription(
                "\n  Enters the wilderness, traveled the shores of the Red Sea."
        );
        Nephi1_4Scene.setMapSymbol(" WD ");
        Nephi1_4Scene.setBlocked(false);
        /*scenes[SceneType.Nephi1_4.ordinal()] = Nephi1_4Scene;*/
        
        Scene Nephi2_4to5Scene = new Scene();
        Nephi2_4to5Scene.setDescription(
                "\n  Lehi’s tent by the Red Sea."
        );
        Nephi2_4to5Scene.setMapSymbol(" TS ");
        Nephi2_4to5Scene.setBlocked(false);
        /*scenes[SceneType.Nephi2_4to5.ordinal()] = Nephi2_4to5Scene;*/
        
        Scene Nephi3_1Scene = new Scene();
        Nephi3_1Scene.setDescription(
                "\n  Wilderness - Return to Jerusalem to get the Plates of Brass."
        );
        Nephi3_1Scene.setMapSymbol(" PB ");
        Nephi3_1Scene.setBlocked(false);
       /* scenes[SceneType.Nephi3_1.ordinal()] = Nephi3_1Scene;*/
        
        Scene Nephi3_2to3Scene = new Scene();
        Nephi3_2to3Scene.setDescription(
                "\n  Jerusalem – House of Laban."
        );
        Nephi3_2to3Scene.setMapSymbol(" HL ");
        Nephi3_2to3Scene.setBlocked(false);
        /*scenes[SceneType.Nephi3_2to3.ordinal()] = Nephi3_2to3Scene;*/
        
        Scene Nephi3_10Scene = new Scene();
        Nephi3_10Scene.setDescription(
                "\n  Lehi’s house – collect treasures."
        );
        Nephi3_10Scene.setMapSymbol(" CT ");
        Nephi3_10Scene.setBlocked(false);
        /*scenes[SceneType.Nephi3_10.ordinal()] = Nephi3_10Scene;*/
        
        Scene Nephi3_16Scene = new Scene();
        Nephi3_16Scene.setDescription(
                "\n  House of Laban with treasures."
        );
        Nephi3_16Scene.setMapSymbol(" LT ");
        Nephi3_16Scene.setBlocked(false);
        /*scenes[SceneType.Nephi3_16.ordinal()] = Nephi3_16Scene;*/
        
        Scene Nephi3_24to25Scene = new Scene();
        Nephi3_24to25Scene.setDescription(
                "\n  Wilderness – flee from Laban’s servants."
        );
        Nephi3_24to25Scene.setMapSymbol(" FW ");
        Nephi3_24to25Scene.setBlocked(false);
       /* scenes[SceneType.Nephi3_24to25.ordinal()] = Nephi3_24to25Scene;*/
        
        Scene Nephi3_26Scene = new Scene();
        Nephi3_26Scene.setDescription(
                "\n  Angel visit."
        );
        Nephi3_26Scene.setMapSymbol(" AV ");
        Nephi3_26Scene.setBlocked(false);
       /* scenes[SceneType.Nephi3_26.ordinal()] = Nephi3_26Scene;*/
        
        Scene Nephi3_29Scene = new Scene();
        Nephi3_29Scene.setDescription(
                "\n  Streets of Jerusalem, night time – try3 – Nephi slays Laban."
        );
        Nephi3_29Scene.setMapSymbol(" SJ ");
        Nephi3_29Scene.setBlocked(false);
        /*scenes[SceneType.Nephi3_29.ordinal()] = Nephi3_29Scene;*/
        
        Scene Nephi4_7to18Scene = new Scene();
        Nephi4_7to18Scene.setDescription(
                "\n  House of Laban, retrieve plates."
        );
        Nephi4_7to18Scene.setMapSymbol(" LP ");
        Nephi4_7to18Scene.setBlocked(false);
       /* scenes[SceneType.Nephi4_7to18.ordinal()] = Nephi4_7to18Scene;*/
        
        Scene Nephi4_20Scene = new Scene();
        Nephi4_20Scene.setDescription(
                "\n  Laban’s treasury."
        );
        Nephi4_20Scene.setMapSymbol(" LT ");
        Nephi4_20Scene.setBlocked(false);
        /*scenes[SceneType.Nephi4_20.ordinal()] = Nephi4_20Scene;*/
        
        Scene Nephi4_24Scene = new Scene();
        Nephi4_24Scene.setDescription(
                "\n  Wilderness with Zoram, return to Lehi."
        );
        Nephi4_24Scene.setMapSymbol(" WZ ");
        Nephi4_24Scene.setBlocked(false);
       /* scenes[SceneType.Nephi4_24.ordinal()] = Nephi4_24Scene;*/
        
        Scene Nephi4_28_38Scene = new Scene();
        Nephi4_28_38Scene.setDescription(
                "\n  Lehi’s camp, Sariah rejoices."
        );
        Nephi4_28_38Scene.setMapSymbol(" SR ");
        Nephi4_28_38Scene.setBlocked(false);
        /*scenes[SceneType.Nephi4_28_38.ordinal()] = Nephi4_28_38Scene;*/
        
        Scene Nephi5_7to8Scene = new Scene();
        Nephi5_7to8Scene.setDescription(
                "\n  Ishmael’s home to get Wives."
        );
        Nephi5_7to8Scene.setMapSymbol(" WI ");
        Nephi5_7to8Scene.setBlocked(false);
        /*scenes[SceneType.Nephi5_7to8.ordinal()] = Nephi5_7to8Scene;*/
        
        Scene Nephi7_3to5Scene = new Scene();
        Nephi7_3to5Scene.setDescription(
                "\n  Wilderness – rebellion of brothers."
        );
        Nephi7_3to5Scene.setMapSymbol(" RB ");
        Nephi7_3to5Scene.setBlocked(false);
        /*scenes[SceneType.Nephi7_3to5.ordinal()] = Nephi7_3to5Scene;*/
        
        Scene Nephi7_6to7Scene = new Scene();
        Nephi7_6to7Scene.setDescription(
                "\n  Lehi’s camp with Ishmael’s family."
        );
        Nephi7_6to7Scene.setMapSymbol(" LC ");
        Nephi7_6to7Scene.setBlocked(false);
        /*scenes[SceneType.Nephi7_6to7.ordinal()] = Nephi7_6to7Scene;*/
       
        Scene Nephi7_22Scene = new Scene();
        Nephi7_22Scene.setDescription(
                "\n  Plate making – Lehi’s camp."
        );
        Nephi7_22Scene.setMapSymbol(" PM ");
        Nephi7_22Scene.setBlocked(false);
        /*scenes[SceneType.Nephi7_22.ordinal()] = Nephi7_22Scene;*/
        
        Scene Nephi9_2Scene = new Scene();
        Nephi9_2Scene.setDescription(
                "\n  Valley of Lemuel, Marriage."
        );
        Nephi9_2Scene.setMapSymbol(" VL ");
        Nephi9_2Scene.setBlocked(false);
       /* scenes[SceneType.Nephi9_2.ordinal()] = Nephi9_2Scene;*/
        
        Scene Nephi16_7Scene = new Scene();
        Nephi16_7Scene.setDescription(
                "\n  Lehi’s tent – finds the Liahona."
        );
        Nephi16_7Scene.setMapSymbol(" FL ");
        Nephi16_7Scene.setBlocked(false);
        /*scenes[SceneType.Nephi16_7.ordinal()] = Nephi16_7Scene;*/
        
        Scene Nephi16_10Scene = new Scene();
        Nephi16_10Scene.setDescription(
                "\n  River Laman crossing."
        );
        Nephi16_10Scene.setMapSymbol(" RL ");
        Nephi16_10Scene.setBlocked(false);
        /*scenes[SceneType.Nephi16_10.ordinal()] = Nephi16_10Scene;*/
        
        Scene Nephi16_12Scene = new Scene();
        Nephi16_12Scene.setDescription(
                "\n  Travel to Shazer."
        );
        Nephi16_12Scene.setMapSymbol(" TS ");
        Nephi16_12Scene.setBlocked(false);
        /*scenes[SceneType.Nephi16_12.ordinal()] = Nephi16_12Scene;*/
        
        Scene Nephi16_13Scene = new Scene();
        Nephi16_13Scene.setDescription(
                "\n  Hunting by Shazer."
        );
        Nephi16_13Scene.setMapSymbol(" HS ");
        Nephi16_13Scene.setBlocked(false);
        /*scenes[SceneType.Nephi16_13.ordinal()] = Nephi16_13Scene;*/
        
        Scene Nephi16_14Scene = new Scene();
        Nephi16_14Scene.setDescription(
                "\n  Wilderness travel."
        );
        Nephi16_14Scene.setMapSymbol(" WT ");
        Nephi16_14Scene.setBlocked(false);
        /*scenes[SceneType.Nephi16_14.ordinal()] = Nephi16_14Scene;*/
        
        Scene Nephi16_17Scene = new Scene();
        Nephi16_17Scene.setDescription(
                "\n  Hunting – Nephi breaks bow."
        );
        Nephi16_17Scene.setMapSymbol(" HB ");
        Nephi16_17Scene.setBlocked(false);
        /*scenes[SceneType.Nephi16_17.ordinal()] = Nephi16_17Scene;*/
        
        Scene Nephi16_18Scene = new Scene();
        Nephi16_18Scene.setDescription(
                "\n  Lehi consults Liahona, where Nephi needs to hunt."
        );
        Nephi16_18Scene.setMapSymbol(" LI ");
        Nephi16_18Scene.setBlocked(false);
        /*scenes[SceneType.Nephi16_18.ordinal()] = Nephi16_18Scene;*/
        
        Scene Nephi16_27to30Scene = new Scene();
        Nephi16_27to30Scene.setDescription(
                "\n  Wilderness travel east."
        );
        Nephi16_27to30Scene.setMapSymbol(" WE ");
        Nephi16_27to30Scene.setBlocked(false);
        /*scenes[SceneType.Nephi16_27to30.ordinal()] = Nephi16_27to30Scene;*/
        
        Scene Nephi17_1Scene = new Scene();
        Nephi17_1Scene.setDescription(
                "\n  Land of Bountiful."
        );
        Nephi17_1Scene.setMapSymbol(" LB ");
        Nephi17_1Scene.setBlocked(false);
        /*scenes[SceneType.Nephi17_1.ordinal()] = Nephi17_1Scene;*/
        
        Scene Nephi17_5Scene = new Scene();
        Nephi17_5Scene.setDescription(
                "\n  Nephi Builds a ship."
        );
        Nephi17_5Scene.setMapSymbol(" BS ");
        Nephi17_5Scene.setBlocked(false);
       /* scenes[SceneType.Nephi17_5.ordinal()] = Nephi17_5Scene;*/
        
        Scene Nephi17_8Scene = new Scene();
        Nephi17_8Scene.setDescription(
                "\n  Shocking experience."
        );
        Nephi17_8Scene.setMapSymbol(" SE ");
        Nephi17_8Scene.setBlocked(false);
        /*scenes[SceneType.Nephi17_8.ordinal()] = Nephi17_8Scene;*/
        
        Scene Nephi17_54Scene = new Scene();
        Nephi17_54Scene.setDescription(
                "\n  Enter the ship."
        );
        Nephi17_54Scene.setMapSymbol(" ES ");
        Nephi17_54Scene.setBlocked(false);
        /*scenes[SceneType.Nephi17_54.ordinal()] = Nephi17_54Scene;*/
        
        Scene Nephi18_5Scene = new Scene();
        Nephi18_5Scene.setDescription(
                "\n  Sail to the promised land."
        );
        Nephi18_5Scene.setMapSymbol(" SP ");
        Nephi18_5Scene.setBlocked(false);
       /* scenes[SceneType.Nephi18_5.ordinal()] = Nephi18_5Scene;*/
        
        Scene Nephi18_8Scene = new Scene();
        Nephi18_8Scene.setDescription(
                "\n  Arrive at promised land."
        );
        Nephi18_8Scene.setMapSymbol(" PL ");
        Nephi18_8Scene.setBlocked(false);
       /* scenes[SceneType.Nephi18_8.ordinal()] = Nephi18_8Scene;  */
        
        /*return scenes;*/
        return null;
    }
    
       /* SupplyInventory[] inventory = game.getInventory();*/
        
       private static void assignScenesToLocations(Map map, Scene[] scenes) {

        Location[][] locations = map.getLocations();

        //start point
        /*locations[0][1].setScene(scenes[SceneType.Nephi1_4a.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.Nephi1_4.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.Nephi2_4to5.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.Nephi3_1.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.Nephi3_2to3.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.Nephi3_10.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.Nephi3_16.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.Nephi3_24to25.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.Nephi3_26.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.Nephi3_29.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.Nephi4_7to18.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.Nephi4_20.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.Nephi4_24.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.Nephi4_28_38.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.Nephi5_7to8.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.Nephi7_3to5.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.Nephi7_6to7.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.Nephi7_22.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.Nephi9_2.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.Nephi16_7.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.Nephi16_10.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.Nephi16_12.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.Nephi16_13.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.Nephi16_14.ordinal()]);
        locations[5][2].setScene(scenes[SceneType.Nephi16_17.ordinal()]);
        locations[6][2].setScene(scenes[SceneType.Nephi16_18.ordinal()]);
        locations[7][2].setScene(scenes[SceneType.Nephi16_27to30.ordinal()]);
        locations[8][4].setScene(scenes[SceneType.Nephi17_1.ordinal()]);
       
        */
    

    /*public static int moveActorToLocation(Actor actor, Point coordinates) {
        
        Map map = NephisJourney.getCurrentGame().getMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        
        if (newRow < 0 || newRow >= map.getRowCount() ||
                newColumn < 0 || newColumn <= map.getColumnCount()){
            return -1;
        }
        return 0;*/
        
    
       }
}
            
        

     

