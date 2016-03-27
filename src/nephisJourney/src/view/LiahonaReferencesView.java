package nephisJourney.src.view;

import java.io.Console;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import nephisJourney.src.model.LiahonaReferences;

/**
 *
 * @author Hodes
 */
public abstract class LiahonaReferencesView extends View {

    private String promptMessage;
    private int nephi2_4;

    private void displayBanner() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                    *"
                + "\n The menu below will allow you to see the scriptures *"
                + "\n associated with the location of your player. The    *"
                + "\n scriptures come from The Book of Mormon, Another    *"
                + "\n Testament of Jesus Christ.                           *"
                + "\n                                                     *"
                + "\n******************************************************"
        );
    }

    private LiahonaReferencesView() {
        super(
                "\n"
                + "\n--------------------------------------------"
                + "\n|Liahona Reference Menu                    |"
                + "\n--------------------------------------------"
                + "\n01 - Jerusalem during the reign of Zedekiah, king of Judah."
                + "\n02 - Enters the wilderness, traveled the shores of the Red Sea."
                + "\n03 - Lehi’s tent by the Red Sea."
                + "\n04 - Wilderness - Return to Jerusalem to get the Plates of Brass."
                + "\n05 - Jerusalem – House of Laban."
                + "\n06 - Lehi’s house – collect treasures."
                + "\n07 - House of Laban with treasures."
                + "\n08 - Wilderness – flee from Laban’s servants."
                + "\n09 - Angel visit."
                + "\n10 - Streets of Jerusalem, night time – try3 – Nephi slays Laban."
                + "\n11 - House of Laban, retrieve plates."
                + "\n12 - Laban’s treasury."
                + "\n13 - Wilderness with Zoram, return to Lehi."
                + "\n14 - Lehi’s camp, Sariah rejoices."
                + "\n15 - Ishmael’s home to get Wives."
                + "\n16 - Wilderness – rebellion of brothers."
                + "\n17 - Lehi’s camp with Ishmael’s family."
                + "\n18 - Plate making – Lehi’s camp."
                + "\n19 - Valley of Lemuel, Marriage."
                + "\n20 - Lehi’s tent – finds the Liahona."
                + "\n21 - River Laman crossing."
                + "\n22 - Travel to Shazer."
                + "\n23 - Hunting by Shazer."
                + "\n24 - Wilderness travel."
                + "\n25 - Hunting – Nephi breaks bow."
                + "\n26 - Lehi consults Liahona, where Nephi needs to hunt."
                + "\n27 - Wilderness travel east."
                + "\n28 - Land of Bountiful."
                + "\n29 - Nephi Builds a ship."
                + "\n30 - Shocking experience."
                + "\n31 - Enter the ship."
                + "\n32 - Sail to the promised land."
                + "\n33 - Arrive at promised land."
                + "\nP  - Print the list of scriputers"
                + "\nQ  - Return to previous menu"
                + "\n--------------------------------------------"
        );

    }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); // convert choice to upper case

        switch (value) {
            case "01": //  Jerusalem during the reign of Zedekiah, king of Judah.
                this.Nephi1_4();
                break;
            case "02": // Enters the wilderness, traveled the shores of the Red Sea.
                this.nephi2_4to5();
                break;
            case "03": // Lehi’s tent by the Red Sea.
                this.nephi3_1();
                break;
            case "04": // Wilderness - Return to Jerusalem to get the Plates of Brass.
                this.nephi3_2to3();
                break;
            case "05": // Jerusalem – House of Laban.
                this.nephi3_10();
                break;
            case "06": // Lehi’s house – collect treasures.
                this.nephi3_16();
                break;
            case "07": // House of Laban with treasures.
                this.nephi3_24to25();
                break;
            case "08": // Wilderness – flee from Laban’s servants.
                this.nephi3_26();
                break;
            case "09": // Angel visit.
                this.nephi3_29();
                break;
            case "10": // Streets of Jerusalem, night time – try3 – Nephi slays Laban. 
                this.nephi4_7to18();
                break;
            case "11": // House of Laban, retrieve plates.
                this.nephi4_20();
                break;
            case "12": // Laban’s treasury.
                this.nephi4_24();
                break;
            case "13": // Wilderness with Zoram, return to Lehi. 
                this.nephi4_28_38();
                break;
            case "14": // Lehi’s camp, Sariah rejoices.
                this.nephi5_7to8();
                break;
            case "15": // Ishmael’s home to get Wives.
                this.nephi7_3to5();
                break;
            case "16": // Wilderness – rebellion of brothers.
                this.nephi7_6to7();
                break;
            case "17": // Lehi’s camp with Ishmael’s family.
                this.nephi7_22();
                break;
            case "18": //Plate making – Lehi’s camp.
                this.nephi9_2();
                break;
            case "19": // Valley of Lemuel, Marriage.
                this.nephi16_7();
                break;
            case "20": // Lehi’s tent – finds the Liahona.
                this.nephi16_10();
                break;
            case "21": //  River Laman crossing.
                this.nephi16_12();
                break;
            case "22": // Travel to Shazer.
                this.nephi16_13();
                break;
            case "23": //  Hunting by Shazer.
                this.nephi16_14();
                break;
            case "24": // Wilderness travel. 
                this.nephi16_17();
                break;
            case "25": //  Hunting – Nephi breaks bow.
                this.nephi16_18();
                break;
            case "26": // Lehi consults Liahona, where Nephi needs to hunt.
                this.nephi16_27to30();
                break;
            case "27": // Wilderness travel east.
                this.nephi17_1();
                break;
            case "28": //  Land of Bountiful.
                this.nephi17_5();
                break;
            case "29": // Nephi Builds a ship.
                this.nephi17_8();
                break;
            case "30": // Shocking experience. 
                this.nephi17_54();
                break;
            case "31": // Enter the ship.
                this.nephi18_5();
                break;
            case "32": // Sail to the promised land. 
                this.nephi18_8();
                break;
            case "33": // Arrive at promised land.
                this.nephi18_23();
                break;
            case "P": 
        {
            try {
                this.printScriptureList();
            } catch (IOException ex) {
                Logger.getLogger(LiahonaReferencesView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            default:
                System.out.println("\n*** Invalid selection ***"
                        + " Please select a valid display option ***");
                break;

        }
        return false;
    }

    private void Nephi1_4() {
        System.out.println(
                "\n************************************************************"
                + "\n"
                + "\n   For it came to pass in the commencement of the first"
                + "\n year of the reign of Zedekiah, king of Judah, (my father,"
                + "\n Lehi, having dwelt at Jerusalem in all his days);"
                + "\n same year there came many prophets, prophesying"
                + "\n unto the people that they must repent, or the great city"
                + "\n Jerusalem must be destroyed."
                + "\n"
                + "\n**********************************************************"
        );
    }

    private void nephi2_4to5() {
        System.out.println(
                  "\n**********************************************************"
                + "\n"
                + "\n 4. And it came to pass that he departed into the"
                + "\n wilderness. And he left his house, and the land of his"
                + "\n inheritance, and his gold, and his silver, and his precious"
                + "\n things, and took nothing with him, save it were his family,"
                + "\n and provisions, and tents, and departed into the wilderness."
                + "\n"
                + "\n 5. And he came down by the borders near the shore of the"
                + "\n Red Sea; and he traveled in the wilderness in the borders"
                + "\n which are nearer the Red Sea; and he did travel in the"
                + "\n wilderness with his family, which consisted of my mother,"
                + "\n Sariah, and my elder brothers, who were Laman, Lemuel,"
                + "\n and Sam."
                + "\n"
                + "\n**********************************************************"
        );
    }

    private void nephi3_1() {
        System.out.println(
                "\n************************************************************"
                + "\n"
                + "\n*   And it came to pass that I, Nephi, returned from"
                + "\n* speaking with the Lord, to the tent of my father."
                + "\n"
                + "\n**********************************************************"
        );
    }

    private void nephi3_2to3() {
        System.out.println(
                "\n************************************************************"
                + "\n                                                          "
                + "\n2 And it came to pass that he spake unto me, saying:"
                + "\n Behold I have dreamed a dream, in the which the Lord"
                + "\n hath commanded me that thou and thy brethren shall"
                + "\n return to Jerusalem."
                + "\n"
                + "\n3 For behold, Laban hath the record of the Jews and also a"
                + "\n genealogy of my forefathers, and they are engraven upon"
                + "\n plates of brass."
                + "\n"
                + "\n**********************************************************"
        );
    }

    private void nephi3_10() {
        System.out.println(
                "\n************************************************************"
                + "\n"
                + "\n   And it came to pass that when we had gone up to the"
                + "\n land of Jerusalem, I and my brethren did consult one with"
                + "\n another."
                + "\n"
                + "\n**********************************************************"
        );
    }

    private void nephi3_16() {
        System.out.println(
                "\n************************************************************"
                + "\n"
                + "\n   Wherefore, let us be faithful in keeping the"
                + "\n commandments of the Lord; therefore let us go down to"
                + "\n the land of our father’s inheritance, for behold he left gold"
                + "\n and silver, and all manner of riches. And all this he hath"
                + "\n done because of the commandments of the Lord."
                + "\n"
                + "\n**********************************************************"
        );
    }

    private void nephi3_24to25() {
        System.out.println(
                "\n************************************************************"
                + "\n"
                + "\n24 And it came to pass that we went in unto Laban, and"
                + "\n desired him that he would give unto us the records which"
                + "\n were engraven upon the plates of brass, for which we"
                + "\n would give unto him our gold, and our silver, and all our"
                + "\n precious things."
                + "\n"
                + "\n25 And it came to pass that when Laban saw our"
                + "\n property, and that it was exceedingly great, he did lust"
                + "\n after it, insomuch that he thrust us out, and sent his"
                + "\n servants to slay us, that he might obtain our property."
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    private void nephi3_26() {
        System.out.println(
                "\n************************************************************"
                + "\n"
                + "\n   And it came to pass that we did flee before the servants"
                + "\n of Laban, and we were obliged to leave behind our"
                + "\n property, and it fell into the hands of Laban."
                + "\n"
                + "\n**********************************************************"
        );
    }

    private void nephi3_29() {
        System.out.println(
                "\n************************************************************"
                + "\n"
                + "\n   And it came to pass as they smote us with a rod,"
                + "\n behold, an angel of the Lord came and stood before them,"
                + "\n and he spake unto them, saying: Why do ye smite your "
                + "\n younger brother with a rod? Know ye not that the Lord"
                + "\n hath chosen him to be a ruler over you, and this because of"
                + "\n your iniquities? Behold ye shall go up to Jerusalem again,"
                + "\n and the Lord will deliver Laban into your hands."
                + "\n"
                + "\n**********************************************************"
        );
    }

    private void nephi4_7to18() {
        System.out.println(
                "\n*******************************************************"
                + "\n"
                + "\n7 Nevertheless I went forth, and as I came near unto the"
                + "\n house of Laban I beheld a man, and he had fallen to the"
                + "\n earth before me, for he was drunken with wine."
                + "\n"
                + "\n 8 And when I came to him I found that it was Laban."
                + "\n"
                + "\n**********************************************************"
        );
    }

    private void nephi4_20() {
        System.out.println(
                "\n************************************************************"
                + "\n"
                + "\n   And after I had done this, I went forth unto the"
                + "\n treasury of Laban. And as I went forth towards the"
                + "\n treasury of Laban, behold, I saw the servant of Laban who"
                + "\n had the keys of the treasury. And I commanded him in the"
                + "\n voice of Laban, that he should go with me into the"
                + "\n treasury."
                + "\n"
                + "\n**********************************************************"
        );
    }

    private void nephi4_24() {
        System.out.println(
                "\n************************************************************"
                + "\n"
                + "\n   And I also spake unto him that I should carry the"
                + "\n engravings, which were upon the plates of brass, to my"
                + "\n elder brethren, who were without the walls."
                + "\n"
                + "\n**********************************************************"
        );
    }

    private void nephi4_28_38() {
        System.out.println(
                "\n************************************************************"
                + "\n"
                + "\n28 And it came to pass that when Laman saw me he was"
                + "\n exceedingly frightened, and also Lemuel and Sam. And"
                + "\n they fled from before my presence; for they supposed it"
                + "\n was Laban, and that he had slain me and had sought to"
                + "\n take away their lives also."
                + "\n"
                + "\n38 And it came to pass that we took the plates of brass and"
                + "\n the servant of Laban, and departed into the wilderness,"
                + "\n and journeyed unto the tent of our father."
                + "\n*                                                     *"
                + "\n**********************************************************"
        );
    }

    private void nephi5_7to8() {
        System.out.println(
                "\n************************************************************"
                + "\n"
                + "\n7 And when we had returned to the tent of my father,"
                + "\n behold their joy was full, and my mother was comforted." 
                + "\n" 
                + "\n 8 And she spake, saying: Now I know of a surety that the"
                + "\n Lord hath commanded my husband to flee into the"
                + "\n wilderness; yea, and I also know of a surety that the Lord"
                + "\n hath protected my sons, and delivered them out of the"
                + "\n hands of Laban, and given them power whereby they"
                + "\n could accomplish the thing which the Lord hath"
                + "\n commanded them. And after this manner of language did"
                + "\n she speak."
                + "\n"
                + "\n**********************************************************"
        );
    }

    private void nephi7_3to5() {
        System.out.println(
                "\n************************************************************"
                + "\n"
                + "\n3 And it came to pass that I, Nephi, did again, with my"
                + "\n brethren, go forth into the wilderness to go up to"
                + "\n Jerusalem."
                + "\n"
                + "\n4 And it came to pass that we went up unto the house of"
                + "\n Ishmael, and we did gain favor in the sight of Ishmael,"
                + "\n insomuch that we did speak unto him the words of the"
                + "\n Lord." 
                + "\n"
                + "\n5 And it came to pass that the Lord did soften the heart of"
                + "\n Ishmael, and also his household, insomuch that they took"
                + "\n their journey with us down into the wilderness to the tent"
                + "\n of our father."
                + "\n"
                + "\n**********************************************************"
        );
    }

    private void nephi7_6to7() {
        System.out.println(
                "\n************************************************************"
                + "\n"
                + "\n6 And it came to pass that as we journeyed in the"
                + "\n wilderness, behold Laman and Lemuel, and two of the"
                + "\n daughters of Ishmael, and the two sons of Ishmael and"
                + "\n their families, did rebel against us; yea, against me, Nephi,"
                + "\n and Sam, and their father, Ishmael, and his wife, and his"
                + "\n three other daughters." 
                + "\n"
                + "\n7 And it came to pass in the which rebellion, they were"
                + "\n desirous to return unto the land of Jerusalem."
                + "\n"
                + "\n**********************************************************"
        );
    }

    private void nephi7_22() {
        System.out.println(
                "\n************************************************************"
                + "\n"
                + "\n   And it came to pass that we did come down unto the"
                + "\n tent of our father. And after I and my brethren and all the"
                + "\n house of Ishmael had come down unto the tent of my"
                + "\n father, they did give thanks unto the Lord their God; and"
                + "\n they did offer sacrifice and burnt offerings unto him."
                + "\n"
                + "\n**********************************************************"
        );
    }

    private void nephi9_2() {
        System.out.println(
                "\n************************************************************"
                + "\n"
                + "\n   And now, as I have spoken concerning these plates,"
                + "\n behold they are not the plates upon which I make a full"
                + "\n account of the history of my people; for the plates upon"
                + "\n which I make a full account of my people I have given the"
                + "\n name of Nephi; wherefore, they are called the plates of"
                + "\n Nephi, after mine own name; and these plates also are"
                + "\n called the plates of Nephi."
                + "\n"
                + "\n**********************************************************"
        );
    }

    private void nephi16_7() {
        System.out.println(
                "\n************************************************************"
                + "\n"
                + "\n   And it came to pass that I, Nephi, took one of the"
                + "\n daughters of Ishmael to wife; and also, my brethren took"
                + "\n of the daughters of Ishmael to wife; and also Zoram took"
                + "\n the eldest daughter of Ishmael to wife."
                + "\n"
                + "\n**********************************************************"
        );
    }

    private void nephi16_10() {
        System.out.println(
                "\n************************************************************"
                + "\n*                                                     *"
                + "\n   And it came to pass that as my father arose in the"
                + "\n morning, and went forth to the tent door, to his great"
                + "\n astonishment he beheld upon the ground a round ball of"
                + "\n curious workmanship; and it was of fine brass. And within"
                + "\n the ball were two spindles; and the one pointed the way"
                + "\n whither we should go into the wilderness."
                + "\n"
                + "\n**********************************************************"
        );
    }

    private void nephi16_12() {
        System.out.println(
                "\n************************************************************"
                + "\n*                                                     *"
                + "\n   And it came to pass that we did take our tents and"
                + "\n depart into the wilderness, across the river Laman."
                + "\n"
                + "\n**********************************************************"
        );
    }

    private void nephi16_13() {
        System.out.println(
                "\n************************************************************"
                + "\n"
                + "\n   And it came to pass that we traveled for the space of"
                + "\n four days, nearly a south-southeast direction, and we did"
                + "\n pitch our tents again; and we did call the name of the place"
                + "\n Shazer."
                + "\n"
                + "\n**********************************************************"
        );
    }

    private void nephi16_14() {
        System.out.println(
                "\n************************************************************"
                + "\n   And it came to pass that we did take our bows and our"
                + "\n arrows, and go forth into the wilderness to slay food for"
                + "\n our families; and after we had slain food for our families"
                + "\n we did return again to our families in the wilderness, to"
                + "\n the place of Shazer. And we did go forth again in the"
                + "\n wilderness, following the same direction, keeping in the"
                + "\n most fertile parts of the wilderness, which were in the"
                + "\n borders near the Red Sea."
                + "\n"
                + "\n**********************************************************"
        );
    }

    private void nephi16_17() {
        System.out.println(
                "\n************************************************************"
                + "\n*                                                     *"
                + "\n   And after we had traveled for the space of many days,"
                + "\n we did pitch our tents for the space of a time, that we"
                + "\n might again rest ourselves and obtain food for our"
                + "\n families"
                + "\n"
                + "\n**********************************************************"
        );
    }

    private void nephi16_18() {
        System.out.println(
                "\n************************************************************"
                + "\n"
                + "\n   And it came to pass that as I, Nephi, went forth to slay"
                + "\n food, behold, I did break my bow, which was made of fine"
                + "\n steel; and after I did break my bow, behold, my brethren"
                + "\n were angry with me because of the loss of my bow, for we"
                + "\n did obtain no food."
                + "\n"
                + "\n**********************************************************"
        );
    }

    private void nephi16_27to30() {
        System.out.println(
                "\n************************************************************"
                + "\n"
                + "\n27 And it came to pass that when my father beheld the"
                + "\n things which were written upon the ball, he did fear and"
                + "\n tremble exceedingly, and also my brethren and the sons of"
                + "\n Ishmael and our wives."
                + "\n"
                + "\n28 And it came to pass that I, Nephi, beheld the pointers"
                + "\n which were in the ball, that they did work according to the"
                + "\n faith and diligence and heed which we did give unto them."
                + "\n"
                + "\n29 And there was also written upon them a new writing,"
                + "\n which was plain to be read, which did give us"
                + "\n understanding concerning the ways of the Lord; and it was"
                + "\n written and changed from time to time, according to the"
                + "\n faith and diligence which we gave unto it. And thus we"
                + "\n see that by small means the Lord can bring about great"
                + "\n things."
                + "\n"
                + "\n 30 And it came to pass that I, Nephi, did go forth up into"
                + "\n the top of the mountain, according to the directions"
                + "\n which were given upon the ball."
                + "\n"
                + "\n**********************************************************"
        );
    }

    private void nephi17_1() {
        System.out.println(
                "\n************************************************************"
                + "\n"
                + "\n*   And it came to pass that we did again take our journey"
                + "\n in the wilderness; and we did travel nearly eastward from"
                + "\n that time forth. And we did travel and wade through"
                + "\n much affliction in the wilderness; and our women did bear"
                + "\n children in the wilderness."
                + "\n"
                + "\n**********************************************************"
        );
    }

    private void nephi17_5() {
        System.out.println(
                "\n************************************************************"
                + "\n"
                + "\n   And we did come to the land which we called Bountiful,"
                + "\n because of its much fruit and also wild honey; and all"
                + "\n these things were prepared of the Lord that we might not"
                + "\n perish. And we beheld the sea, which we called Irreantum,"
                + "\n which, being interpreted, is many waters."
                + "\n"
                + "\n**********************************************************"
        );
    }

    private void nephi17_8() {
        System.out.println(
                "\n************************************************************"
                + "\n"
                + "\n   And it came to pass that the Lord spake unto me,"
                + "\n saying: Thou shalt construct a ship, after the manner "
                + "\n which I shall show thee, that I may carry thy people across"
                + "\n these waters."
                + "\n"
                + "\n**********************************************************"
        );
    }

    private void nephi17_54() {
        System.out.println(
                "\n************************************************************"
                + "\n*                                                     *"
                + "\n   And it came to pass that I stretched forth my hand unto"
                + "\n my brethren, and they did not wither before me; but the"
                + "\n Lord did shake them, even according to the word which"
                + "\n he had spoken."
                + "\n"
                + "\n**********************************************************"
        );
    }

    private void nephi18_5() {
        System.out.println(
                "\n************************************************************"
                + "\n"
                + "\n   And it came to pass that the voice of the Lord came unto"
                + "\n my father, that we should arise and go down into the ship."
                + "\n"
                + "\n**********************************************************"
        );
    }

    private void nephi18_8() {
        System.out.println(
                "\n************************************************************"
                + "\n"
                + "\n   And it came to pass after we had all gone down into the"
                + "\n ship, and had taken with us our provisions and things"
                + "\n which had been commanded us, we did put forth into the"
                + "\n sea and were driven forth before the wind towards the"
                + "\n promised land."
                + "\n"
                + "\n**********************************************************"
        );
    }

    private void nephi18_23() {
        System.out.println(
                "\n************************************************************"
                + "\n"
                + "\n   And it came to pass that after we had sailed for the"
                + "\n space of many days we did arrive at the promised land;"
                + "\n and we went forth upon the land, and did pitch our tents;"
                + "\n and we did call it the promised land."
                + "\n"        
                + "\n**********************************************************"
        );
    }

    private void printScriptureList() throws IOException {
        FileWriter outFile = null; 
        Console console = System.console();
        String s = console.readLine();
        int i = Integer.parseInt(console.readLine());
        String fileLocation = console.readLine();
        
        try{
            outFile = new FileWriter(fileLocation);
            
            // write the scripture referece and location to a file
            outFile.write("Nephi1:4a Jerusalem during reign of Zedekiah, king of Judah.\n");
            outFile.write("Nephi1:4 Enters the wilderness, traveled the shores of the Red Sea.\n");
            outFile.write("Nephi2:4-5 Lehi’s tent by the Red Sea.\n");
            outFile.write("Nephi3:1 Wilderness - Return to Jerusalem to get the Plates of Brass.\n");
            outFile.write("Nephi3:2-3 Jerusalem – House of Laban.\n");
            outFile.write("Nephi3:10 Lehi’s house – collect treasures.\n");
            outFile.write("Nephi3:16 House of Laban with treasures.\n");
            outFile.write("Nephi3:24-25 Wilderness – flee from Laban’s servants.\n");
            outFile.write("Nephi3:26 Angel visit.\n");
            outFile.write("Nephi3:29 Streets of Jerusalem, night time – try3 – Nephi slays Laban.\n");
            outFile.write("Nephi4:7-18 House of Laban, retrieve plates.\n");
            outFile.write("Nephi4:20 Laban’s treasury.\n");
            outFile.write("Nephi4:24 Wilderness with Zoram, return to Lehi.\n");
            outFile.write("Nephi4:28,38 Lehi’s camp, Sariah rejoices.\n");
            outFile.write("Nephi5:7-8 Ishmael’s home to get Wives.\n");
            outFile.write("Nephi7:3-5 Wilderness – rebellion of brothers.\n");
            outFile.write("Nephi7:6-7 Lehi’s camp with Ishmael’s family.\n");
            outFile.write("Nephi7:22 Plate making – Lehi’s camp.\n");
            outFile.write("Nephi9:2 Valley of Lemuel, Marriage.\n");
            outFile.write("Nephi16:7 Lehi’s tent – finds the Liahona.\n");
            outFile.write("Nephi16:10 River Laman crossing.\n");
            outFile.write("Nephi16:12 Travel to Shazer.\n");
            outFile.write("Nephi16:13 Hunting by Shazer.\n");
            outFile.write("Nephi16:14 Wilderness travel.\n");
            outFile.write("Nephi16:17 Hunting – Nephi breaks bow.\n");
            outFile.write("Nephi16:18 Lehi consults Liahona, where Nephi needs to hunt.\n");
            outFile.write("Nephi16:27-30 Wilderness travel east.\n");
            outFile.write("Nephi17:1 Land of Bountiful.\n");
            outFile.write("Nephi17:5 Nephi Builds a ship.\n");
            outFile.write("Nephi17:8 Shocking experience.\n");
            outFile.write("Nephi17:54 Enter the ship.\n");
            outFile.write("Nephi18:5 Sail to the promised land.\n");
            outFile.write("Nephi18:8 Arrive at promised land.\n");
            
            outFile.flush();
        }catch (IOException ex) {
            ErrorView.display(this.getClass().getName(),
                            "Error creating the scripture list");
        }finally {
            if (outFile != null) {
                outFile.close();
                }
            }
}
    
}

