/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nephisJourney.src.control;

/**
 *
 * @author Mark
 */
public class ShipControl {
// 
    public double calcWeightSupplies (double wFood, double wHorse, double wSheep,
                double wCow, double wAnimalFeed, double wChicken, double wActorMale,
                 double wActorFemal) {
            double totalWeightSupplies = (wFood + wHorse + wSheep + wCow + 
                wAnimalFeed + wChicken + wActorMale + wActorFemal);
            if (totalWeightSupplies >= 40000){
                return -1; //The total carring capacity of the ship must be below
                      // 40000 pounds. If weight exceed maximum then the total
                      // individual weights will need to be modified.
             }
        return totalWeightSupplies;

    }
    
    public double calcSqFtSupplies (double sqFood, double sqHorse, 
            double sqSheep, double sqCow, double sqAnimalFeed, double sqChicken,
             double sqActorMale, double sqActorFemale){
        
        double totalSqFtSupplies = (sqFood + sqHorse + sqSheep + sqCow
                + sqAnimalFeed + sqChicken + sqActorMale + sqActorFemale);
        
        if (totalSqFtSupplies >= 3000){
                return -2; //The total combined square feet needs to be less
                            // the total available square feet of the ship.  The
                            // total available space is 3000 square feet.
        }
        return totalSqFtSupplies;
    }
    
    public boolean shipCapacity(double totalWeightSupplies, 
            double totalSqFtSupplies){
        if(totalWeightSupplies <= 40000 && totalSqFtSupplies <= 3000){
            boolean sailMessage = true;    
        }
        boolean shipCapacity = true;
        return shipCapacity;
    }
}