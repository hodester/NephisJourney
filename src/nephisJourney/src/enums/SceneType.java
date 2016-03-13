package nephisJourney.src.enums;

import java.awt.Point;


/**
 *
 * @author Jenaca
 */

public enum SceneType {
    
    Nephi1_4a("Jerusalem during reign of Zedekiah, king of Judah."),
    Nephi1_4("Enters the wilderness, traveled the shores of the Red Sea."),
    Nephi2_4to5("Lehi’s tent by the Red Sea."),
    Nephi3_1("Wilderness - Return to Jerusalem to get the Plates of Brass."),
    Nephi3_2to3("Jerusalem – House of Laban."),
    Nephi3_10("Lehi’s house – collect treasures."),
    Nephi3_16("House of Laban with treasures."),
    Nephi3_24to25("Wilderness – flee from Laban’s servants."),
    Nephi3_26("Angel visit."),
    Nephi3_29("Streets of Jerusalem, night time – try3 – Nephi slays Laban."),
    Nephi4_7to18("House of Laban, retrieve plates."),
    Nephi4_20("Laban’s treasury."),
    Nephi4_24("Wilderness with Zoram, return to Lehi."),
    Nephi4_28_38("Lehi’s camp, Sariah rejoices."),
    Nephi5_7to8("Ishmael’s home to get Wives."),
    Nephi7_3to5("Wilderness – rebellion of brothers."),
    Nephi7_6to7("Lehi’s camp with Ishmael’s family."),
    Nephi7_22("Plate making – Lehi’s camp."),
    Nephi9_2("Valley of Lemuel, Marriage."),
    Nephi16_7("Lehi’s tent – finds the Liahona."),
    Nephi16_10("River Laman crossing."),
    Nephi16_12("Travel to Shazer."),
    Nephi16_13("Hunting by Shazer."),
    Nephi16_14("Wilderness travel."),
    Nephi16_17("Hunting – Nephi breaks bow."),
    Nephi16_18("Lehi consults Liahona, where Nephi needs to hunt."),
    Nephi16_27to30("Wilderness travel east."),
    Nephi17_1("Land of Bountiful."),
    Nephi17_5("Nephi Builds a ship."),
    Nephi17_8("Shocking experience."),
    Nephi17_54("Enter the ship."),
    Nephi18_5("Sail to the promised land."),
    Nephi18_8("Arrive at promised land.");
  
    private final String description;
    private final Point coordinates;

    SceneType(String description) {
        this.description = description;
        coordinates = new Point(1, 1);
        
    }
   
    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public void setName(String nephi1_4) {
        System.out.println("*** setName function was called ***");
    }

    /*public void setDescription(String lehis_house) {
        System.out.println("*** setDescription function was called ***");
    }*/

    public void setCoordinates(int i) {
        System.out.println("*** setCoordinates function was called ***");
    }
}
