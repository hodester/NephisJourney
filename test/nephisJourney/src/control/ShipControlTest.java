/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nephisJourney.src.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hodes
 */
public class ShipControlTest {
    
    public ShipControlTest() {
    }

    /**
     * Test of calcWeightSupplies method, of class ShipControl.
     */
    @Test
    public void testCalcWeightSupplies() {
        System.out.println("calcWeightSupplies");
        double wFood = 4800.0;
        double wHorse = 10200.0;
        double wSheep = 2000.0;
        double wCow = 16000.0;
        double wAnimalFeed = 5000.0;
        double wChicken = 500.0;
        double wActorMale = 900.0;
        double wActorFemal = 650.0;
        ShipControl instance = new ShipControl();
        double expResult = -1.0;
        double result = instance.calcWeightSupplies(wFood, wHorse, wSheep, wCow, wAnimalFeed, wChicken, wActorMale, wActorFemal);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The total weight of the supplies exceeds the maximum carring "
                + "capacity of the ship.");
    }

    /**
     * Test of calcSqFtSupplies method, of class ShipControl.
     */
    @Test
    public void testCalcSqFtSupplies() {
        System.out.println("calcSqFtSupplies");
        double sqFood = 960.0;
        double sqHorse = 600.0;
        double sqSheep = 200.0;
        double sqCow = 150.0;
        double sqAnimalFeed = 500.0;
        double sqChicken = 300.0;
        double sqActorMale = 175.0;
        double sqActorFemale = 175.0;
        ShipControl instance = new ShipControl();
        double expResult = -2.0;
        double result = instance.calcSqFtSupplies(sqFood, sqHorse, sqSheep, sqCow, sqAnimalFeed, sqChicken, sqActorMale, sqActorFemale);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The total square feet used exceeds the available space on the ship.");
    }

    /**
     * Test of shipCapacity method, of class ShipControl.
     */
    @Test
    public void testShipCapacity() {
        System.out.println("shipCapacity");
        double totalWeightSupplies = 40050.0;
        double totalSqFtSupplies = 3060.0;
        ShipControl instance = new ShipControl();
        boolean expResult = false;
        boolean result = instance.shipCapacity(totalWeightSupplies, totalSqFtSupplies);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Please check you quantities.");
    }
    
}
