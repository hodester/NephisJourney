package nephisJourney.src.control;

import java.util.Scanner;
import nephisJourney.src.exceptions.ShipControlException;

/**
 *
 * @author Mark
 */
public class ShipControl {
// 
    public static void shipLoad(String[] args){
        Object[][] shipArray = {
            {"ITEM", "SQUARE FEET", "WEIGHT", "QUANTITY","TOTAL SqFT", "TOTAL WEIGH"},
            {"Food",1,5,q1,q1*1,q1*5},
            {"Horse",30,850,q2,q2*30,q2*850},
            {"Sheep",10,100,q3,q3*10,q3*100},
            {"Cow",15,1600,q4,q4*15,q4*1600},
            {"Chicken",2,3,q5,q5*2,q5*3},
            {"Animal Feed",5,50,q6,q6*5,q6*50},
            {"Men",35,180,q7,q7*35,q7*180},
            {"Women",35,130,q8,q8*35,q8*180}
        };
        
        
    public double calcWeightSupplies(int[] weight) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the quantity of Food you want to load "
                + "onto the ship: ");
        int q1 = input.nextInt();
        System.out.println("Enter the quantity of Horse(s) you want to load "
                + "onto the ship: ");
        int q2 = input.nextInt();
        System.out.println("Enter the quantity of Sheep(s) you want to load "
                + "onto the ship: ");
        int q3 = input.nextInt();
        System.out.println("Enter the quantity of Cow(s) you want to load "
                + "onto the ship: ");
        int q5 = input.nextInt();
        System.out.println("Enter the quantity of Chicken(s) you want to load "
                + "onto the ship: ");
        int q6 = input.nextInt();
        System.out.println("Enter the quantity of Animal Feed you want to"
                + " load onto the ship: ");
        int q7 = input.nextInt();
        System.out.println("Enter the quantity of Men you want to load "
                + "onto the ship: ");
        int q8 = input.nextInt();
        System.out.println("Enter the quantity of Women you want to load "
                + "onto the ship: ");
        int q9 = input.nextInt();
        
        }
    
        double totalW = 0;
        for (int i = 0; i < 8; i++) {
            totalW += weight[i];
        }

        return totalW;
        /*The total carring capacity of the ship must be below
             40000 pounds. If weight exceed maximum then the total
             individual weights will need to be modified.*/
    }

    public double calcSqFtSupplies(int[] sqFt) {

        double totalS = 0;
        for (int i = 0; i < 8; i++) {
            totalS += sqFt[i];
        }
        return totalS;
        /*The total combined square feet needs to be less
             the total available square feet of the ship.  The
             total available space is 3000 square feet. */
    }

    public boolean shipCapacity(double totalWeightSupplies,
            double totalSqFtSupplies) {
        if (totalWeightSupplies <= 40000 && totalSqFtSupplies <= 3000) {
            boolean sailMessage = true;
        }
        boolean shipCapacity = true;
        return shipCapacity;
    }

    double calcWeightSupplies(double wFood, double wHorse, double wSheep,
            double wCow, double wAnimalFeed, double wChicken, double wActorMale
            , double wActorFemal) {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }

    double calcSqFtSupplies(double sqFood, double sqHorse, double sqSheep
            , double sqCow, double sqAnimalFeed, double sqChicken
            , double sqActorMale, double sqActorFemale) {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }
}
