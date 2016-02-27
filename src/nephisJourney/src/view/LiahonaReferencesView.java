package nephisJourney.src.view;

import java.util.Scanner;
import nephisJourney.src.model.LiahonaReferences;

/**
 *
 * @author Hodes
 */
public class LiahonaReferencesView {
    
    private String promptMessage;
    private int nephi2_4;
    
    public LiahonaReferencesView(){
        //Displays a of scripture references associated with the location.
        this.promptMessage = "\n Please select the number of letter "
                + "corresponding to the menu item: ";
        
        //display the menu when the view is created
        this.displayBanner();
        this.displayMenu();
            
    }

    private void displayBanner() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                    *"
                + "\n The menu below will allow you to see the scriptures *"
                + "\n associated with the location of your player. The    *"
                + "\n scriptures come from The Book of Mormon, Another    *"
                + "\n Testiment of Jesus Crist.                           *"
                + "\n                                                     *"
                + "\n******************************************************"

       );
    }
    
    private void displayMenu() {
        System.out.println(
                "\n"
                + "\n--------------------------------------------"
                + "\n|Liahona Reference Menu                    |"
                + "\n--------------------------------------------"
                + "\n01 - What is the goal of the game"
                + "\n02 - How to move"
                + "\n03 - Estimating the amount of resources"
                + "\n04 - Collect Inventory"
                + "\n05 - Quit"
                + "\n06 - What is the goal of the game"
                + "\n07 - How to move"
                + "\n08 - Estimating the amount of resources"
                + "\n09 - Collect Inventory"
                + "\n10 - Quit"
                + "\n11 - What is the goal of the game"
                + "\n12 - How to move"
                + "\n13 - Estimating the amount of resources"
                + "\n14 - Collect Inventory"
                + "\n15 - Quit"
                + "\n16 - What is the goal of the game"
                + "\n17 - How to move"
                + "\n18 - Estimating the amount of resources"
                + "\n19 - Collect Inventory"
                + "\n20 - Quit"
                + "\n21 - What is the goal of the game"
                + "\n22 - How to move"
                + "\n23 - Estimating the amount of resources"
                + "\n24 - Collect Inventory"
                + "\n25 - Quit"
                + "\n26 - What is the goal of the game"
                + "\n27 - How to move"
                + "\n28 - Estimating the amount of resources"
                + "\n29 - Collect Inventory"
                + "\n30 - Quit"
                + "\n31 - What is the goal of the game"
                + "\n32 - How to move"
                + "\n33 - Estimating the amount of resources"
                + "\nQ - Return to previous menu"
                + "\n--------------------------------------------"
        );
        
    }
    
    public void displayLiahonaReferencesView() {
        
        boolean done = false; //set flag to not done
        do {
            //promt for and get menu choice
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) //user wants to quit
            {
                //Create mainMenuView object when user quits help menu
                //display main menu and exit help menu
                MainMenuView mainMenu = new MainMenuView();
            
                return;
            }
            // do the requested action and display the next view
            done = this.doAction(menuOption);
            
            } while (!done);
        }

    private String getMenuOption() {
        Scanner keyboard = new Scanner (System.in); //get infile for keyboard
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
            if (value.length() > 2) { //value is too long
                System.out.println("\nInvalid value: Please select the number "
                        + "or letter corresponding to the menu item.");
                continue;
            }
            break; //end the loop
        }

        return value; //return the value entered
    }

    public boolean doAction(String menuOption) {

        menuOption = menuOption.toUpperCase(); // convert choice to upper case

        switch (menuOption) {
            case "01": //  Jerusalem during the reign of Zedekiah, king of Judah.
                this.Nephi1_4();
                break;
            case "02": // Enters the wilderness, traveled the shores of the Red Sea
                this.nephi2_4to5();
                break;
            case "03": // Lehi’s tent by the Red Sea
                this.nephi3_1();
                break;
            case "04": // Wilderness - Return to Jerusalem to get the Plates of Brass
                this.nephi3_2to3();
                break;
            case "05": // Jerusalem – House of Laban
                this.nephi3_10();
                break;
            case "06": // Lehi’s house – collect treasures
                this.nephi3_16();
                break;
            case "07": // House of Laban with treasures
                this.nephi3_24to24();
                break;
            case "08": // Wilderness – flee from Laban’s servants 
                this.nephi3_26();
                break;
            case "09": // Angel visit
                this.nephi3_29();
                break;
            case "10": // Streets of Jerusalem, night time – try3 – Nephi slays Laban 
                this.nephi4_7to18();
                break;
            case "11": // House of Laban, retrieve plates
                this.nephi4_20();
                break;
            case "12": // Laban’s treasury
                this.nephi4_24();
                break;
            case "13": // Wilderness with Zoram, return to Lehi 
                this.nephi4_28_38();
                break;
            case "14": // Lehi’s camp, Sariah rejoices
                this.nephi5_7to8();
                break;
            case "15": // Ishmael’s home to get Wives 
                this.nephi7_3to5();
                break;
            case "16": // Wilderness – rebellion of brothers
                this.nephi7_6to7();
                break;
            case "17": // Lehi’s camp with Ishmael’s family
                this.nephi7_22();
                break;
            case "18": //Plate making – Lehi’s camp
                this.nephi9_2();
                break;
            case "19": // Valley of Lemuel, Marriage
                this.nephi16_7();
                break;
            case "20": // Lehi’s tent – finds the Liahona
                this.nephi16_10();
                break;
            case "21": //  River Laman crossing
                this.nephi16_12();
                break;
            case "22": // Travel to Shazer
                this.nephi16_13();
                break;
            case "23": //  Hunting by Shazer
                this.nephi16_14();
                break;
            case "24": // Wilderness travel 
                this.nephi16_17();
                break;
            case "25": //  Hunting – Nephi breaks bow
                this.nephi16_18();
                break;
            case "26": // Lehi consults Liahona, where Nephi needs to hunt
                this.nephi16_27to30();
                break;
            case "27": // Wilderness travel east
                this.nephi17_1();
                break;
            case "28": //  Land of Bountiful
                this.nephi17_5();
                break;
            case "29": // Nephi Builds a ship
                this.nephi17_8();
                break;
            case "30": // Shocking experience 
                this.nephi17_54();
                break;
            case "31": // Enter the ship
                this.nephi18_5();
                break;
            case "32": // Sail to the promised land 
                this.nephi18_8();
                break;
            case "33": // Arrive at promised land
                this.nephi18_23();
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
                "\n*******************************************************"
                + "\n"
                + "\n* For it came to pass in the commencement of the first"
                + " year of the reign of Zedekiah, king of Judah, (my"
                + " father, Lehi, having dwelt at Jerusalem in all his days);"
                + " and in that same year there came many prophets, prophesying"
                + " unto the people that they must repent, or the great city"
                + " Jerusalem must be destroyed."
                + "\n"
                + "\n*******************************************************"
        );  
    }

    private void nephi2_4to5() {
    System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n 4. And it came to pass that he departed into the "
                + "\n wilderness. And he left his house, and the land of his "
                + "\n inheritance, and his gold, and his silver, and his precious "
                + "\n things, and took nothing with him, save it were his family, "
                + "\n and provisions, and tents, and departed into the wilderness."
                + "\n" 
                + "\n 5. And he came down by the borders near the shore of the "
                + "\n Red Sea; and he traveled in the wilderness in the borders "
                + "\n which are nearer the Red Sea; and he did travel in the wilderness "
                + "\n with his family, which consisted of my mother, Sariah, "
                + "\n and my elder brothers, who were Laman, Lemuel, and Sam."
                + "\n*******************************************************"
        );  
    }

    private void nephi3_1() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert scripture here              *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );  
    }

    private void nephi3_2to3() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert scripture here              *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    private void nephi3_10() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert scripture here              *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    private void nephi3_16() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert scripture here              *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    private void nephi3_24to24() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert scripture here              *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    private void nephi3_26() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert scripture here              *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    private void nephi3_29() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert scripture here              *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    private void nephi4_7to18() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert scripture here              *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    private void nephi4_20() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert scripture here              *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    private void nephi4_24() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert scripture here              *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    private void nephi4_28_38() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert scripture here              *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    private void nephi5_7to8() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert scripture here              *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    private void nephi7_3to5() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert scripture here              *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    private void nephi7_6to7() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert scripture here              *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    private void nephi7_22() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert scripture here              *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    private void nephi9_2() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert scripture here              *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    private void nephi16_7() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert scripture here              *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    private void nephi16_10() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert scripture here              *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    private void nephi16_12() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert scripture here              *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    private void nephi16_13() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert scripture here              *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    private void nephi16_14() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert scripture here              *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    private void nephi16_17() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert scripture here              *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    private void nephi16_18() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert scripture here              *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    private void nephi16_27to30() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert scripture here             *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    private void nephi17_1() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert scripture here              *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    private void nephi17_5() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert scripture here              *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    private void nephi17_8() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert scripture here              *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    private void nephi17_54() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert scripture here              *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    private void nephi18_5() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert scripture here              *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    private void nephi18_8() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert scripture here              *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    private void nephi18_23() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n  And it came to pass that after we had sailed for the*"
                + "\n space of many days we did arrive at the promised land;*"
                + "\n and we went forth upon the land, and did pitch our tents;*"
                + "\n and we did call it the promised land."
                + "\n*******************************************************"
        );
    }
}