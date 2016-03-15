package nephisJourney.src.control;

/**
 *
 * @author Mark
 */
public class ShipControl {
// 

    public double calcWeightSupplies(int[] weight) {

        double total = 0;
        for (int i = 0; i < 8; i++) {
            total += weight[i];
        }

        return total;
        /*The total carring capacity of the ship must be below
             40000 pounds. If weight exceed maximum then the total
             individual weights will need to be modified.*/
    }

    public int[] calcSqFtSupplies(int[] sqFt) {

        double total = 0;
        for (int i = 0; i < 8; i++) {
            total += sqFt[i];
        }
        return sqFt;
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
            double wCow, double wAnimalFeed, double wChicken, double wActorMale, double wActorFemal) {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }

    double calcSqFtSupplies(double sqFood, double sqHorse, double sqSheep, double sqCow, double sqAnimalFeed, double sqChicken, double sqActorMale, double sqActorFemale) {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }
}
