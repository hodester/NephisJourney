/*
 * To change this license header, choose License Headers in Project 
 * Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nephisJourney.src.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jenaca
 */
public class TreasureControlTest {
    
    public TreasureControlTest() {
    }
    
    /**
     * Test of calcJewelryWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcJewelryWeight1() {
        System.out.println("calcJewelryWeight");
        int numJewelry = 10;
        TreasureControl instance = new TreasureControl();
        int expResult = 20;
        int result = instance.calcJewelryWeight(numJewelry);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of calcGemWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcGemWeight1() {
        System.out.println("calcGemWeight");
        int numGems = 10;
        TreasureControl instance = new TreasureControl();
        int expResult = 10;
        int result = instance.calcGemWeight(numGems);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of calcTablewareWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcTablewareWeight1() {
        System.out.println("calcTablewareWeight");
        int numTableware = 2;
        TreasureControl instance = new TreasureControl();
        int expResult = 8;
        int result = instance.calcTablewareWeight(numTableware);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of calcSilverWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcSilverWeight1() {
        System.out.println("calcSilverWeight");
        int numSilver = 4;
        TreasureControl instance = new TreasureControl();
        double expResult = 2;
        double result = instance.calcSilverWeight(numSilver);
        double delta = 2;
        assertEquals(expResult, result, delta);
       
    }

    /**
     * Test of calcGoldWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcGoldWeight1() {
        System.out.println("calcGoldWeight");
        int numGold = 10;
        TreasureControl instance = new TreasureControl();
        int expResult = 10;
        int result = instance.calcGoldWeight(numGold);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of calcTreasureWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcTreasureWeight1() {
        System.out.println("calcTreasureWeight");
        int jewelryWeight = 20;
        int gemWeight = 10;
        int tablewareWeight = 8;
        double silverWeight = 2;
        int goldWeight = 10;
        TreasureControl instance = new TreasureControl();
        int expResult = 50;
        int result = instance.calcTreasureWeight(jewelryWeight, gemWeight,
                tablewareWeight, silverWeight, goldWeight);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of calcJewelryWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcJewelryWeight2() {
        System.out.println("calcJewelryWeight");
        int numJewelry = -1;
        TreasureControl instance = new TreasureControl();
        int expResult = -1;
        int result = instance.calcJewelryWeight(numJewelry);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of calcGemWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcGemWeight2() {
        System.out.println("calcGemWeight");
        int numGems = 10;
        TreasureControl instance = new TreasureControl();
        int expResult = 10;
        int result = instance.calcGemWeight(numGems);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of calcTablewareWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcTablewareWeight2() {
        System.out.println("calcTablewareWeight");
        int numTableware = 1;
        TreasureControl instance = new TreasureControl();
        int expResult = 4;
        int result = instance.calcTablewareWeight(numTableware);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of calcSilverWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcSilverWeight2() {
        System.out.println("calcSilverWeight");
        int numSilver = 15;
        TreasureControl instance = new TreasureControl();
        double expResult = 7.5;
        double result = instance.calcSilverWeight(numSilver);
        double delta = 2;
        assertEquals(expResult, result, delta);
       
    }

    /**
     * Test of calcGoldWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcGoldWeight2() {
        System.out.println("calcGoldWeight");
        int numGold = 1;
        TreasureControl instance = new TreasureControl();
        int expResult = 1;
        int result = instance.calcGoldWeight(numGold);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of calcTreasureWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcTreasureWeight2() {
        System.out.println("calcTreasureWeight");
        int jewelryWeight = -1;
        int gemWeight = 10;
        int tablewareWeight = 4;
        double silverWeight = 7.5;
        int goldWeight = 1;
        TreasureControl instance = new TreasureControl();
        int expResult = -1;
        int result = instance.calcTreasureWeight(jewelryWeight, gemWeight, 
                tablewareWeight, silverWeight, goldWeight);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of calcJewelryWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcJewelryWeight3() {
        System.out.println("calcJewelryWeight");
        int numJewelry = 15;
        TreasureControl instance = new TreasureControl();
        int expResult = 30;
        int result = instance.calcJewelryWeight(numJewelry);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of calcGemWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcGemWeight3() {
        System.out.println("calcGemWeight");
        int numGems = 6;
        TreasureControl instance = new TreasureControl();
        int expResult = 6;
        int result = instance.calcGemWeight(numGems);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of calcTablewareWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcTablewareWeight3() {
        System.out.println("calcTablewareWeight");
        int numTableware = 20;
        TreasureControl instance = new TreasureControl();
        int expResult = -1;
        int result = instance.calcTablewareWeight(numTableware);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of calcSilverWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcSilverWeight3() {
        System.out.println("calcSilverWeight");
        int numSilver = 1;
        TreasureControl instance = new TreasureControl();
        double expResult = 0;
        double result = instance.calcSilverWeight(numSilver);
        double delta = 2;
        assertEquals(expResult, result, delta);
       
    }

    /**
     * Test of calcGoldWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcGoldWeight3() {
        System.out.println("calcGoldWeight");
        int numGold = 6;
        TreasureControl instance = new TreasureControl();
        int expResult = 6;
        int result = instance.calcGoldWeight(numGold);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of calcTreasureWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcTreasureWeight3() {
        System.out.println("calcTreasureWeight");
        int jewelryWeight = 30;
        int gemWeight = 6;
        int tablewareWeight = -1;
        double silverWeight = 0;
        int goldWeight = 6;
        TreasureControl instance = new TreasureControl();
        int expResult = -1;
        int result = instance.calcTreasureWeight(jewelryWeight, gemWeight, 
                tablewareWeight, silverWeight, goldWeight);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of calcJewelryWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcJewelryWeight4() {
        System.out.println("calcJewelryWeight");
        int numJewelry = 10;
        TreasureControl instance = new TreasureControl();
        int expResult = 20;
        int result = instance.calcJewelryWeight(numJewelry);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of calcGemWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcGemWeight4() {
        System.out.println("calcGemWeight");
        int numGems = 10;
        TreasureControl instance = new TreasureControl();
        int expResult = 10;
        int result = instance.calcGemWeight(numGems);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of calcTablewareWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcTablewareWeight4() {
        System.out.println("calcTablewareWeight");
        int numTableware = 2;
        TreasureControl instance = new TreasureControl();
        int expResult = 8;
        int result = instance.calcTablewareWeight(numTableware);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of calcSilverWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcSilverWeight4() {
        System.out.println("calcSilverWeight");
        int numSilver = 3;
        TreasureControl instance = new TreasureControl();
        double expResult = 1;
        double result = instance.calcSilverWeight(numSilver);
        double delta = 2;
        assertEquals(expResult, result, delta);
       
    }

    /**
     * Test of calcGoldWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcGoldWeight4() {
        System.out.println("calcGoldWeight");
        int numGold = 10;
        TreasureControl instance = new TreasureControl();
        int expResult = 10;
        int result = instance.calcGoldWeight(numGold);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of calcTreasureWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcTreasureWeight4() {
        System.out.println("calcTreasureWeight");
        int jewelryWeight = 20;
        int gemWeight = 10;
        int tablewareWeight = 8;
        double silverWeight = 1.5;
        int goldWeight = 10;
        TreasureControl instance = new TreasureControl();
        int expResult = -1;
        int result = instance.calcTreasureWeight(jewelryWeight, gemWeight, 
                tablewareWeight, silverWeight, goldWeight);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of calcJewelryWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcJewelryWeight5() {
        System.out.println("calcJewelryWeight");
        int numJewelry = 0;
        TreasureControl instance = new TreasureControl();
        int expResult = 0;
        int result = instance.calcJewelryWeight(numJewelry);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of calcGemWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcGemWeight5() {
        System.out.println("calcGemWeight");
        int numGems = 0;
        TreasureControl instance = new TreasureControl();
        int expResult = 0;
        int result = instance.calcGemWeight(numGems);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of calcTablewareWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcTablewareWeight5() {
        System.out.println("calcTablewareWeight");
        int numTableware = 12;
        TreasureControl instance = new TreasureControl();
        int expResult = 48;
        int result = instance.calcTablewareWeight(numTableware);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of calcSilverWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcSilverWeight5() {
        System.out.println("calcSilverWeight");
        int numSilver = 0;
        TreasureControl instance = new TreasureControl();
        double expResult = 0;
        double result = instance.calcSilverWeight(numSilver);
        double delta = 2;
        assertEquals(expResult, result, delta);
       
    }

    /**
     * Test of calcGoldWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcGoldWeight5() {
        System.out.println("calcGoldWeight");
        int numGold = 2;
        TreasureControl instance = new TreasureControl();
        int expResult = 2;
        int result = instance.calcGoldWeight(numGold);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of calcTreasureWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcTreasureWeight5() {
        System.out.println("calcTreasureWeight");
        int jewelryWeight = 0;
        int gemWeight = 0;
        int tablewareWeight = 48;
        double silverWeight = 0;
        int goldWeight = 2;
        TreasureControl instance = new TreasureControl();
        int expResult = 50;
        int result = instance.calcTreasureWeight(jewelryWeight, gemWeight, 
                tablewareWeight, silverWeight, goldWeight);
        assertEquals(expResult, result);
        
    }
    /**
     * Test of calcJewelryWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcJewelryWeight6() {
        System.out.println("calcJewelryWeight");
        int numJewelry = 25;
        TreasureControl instance = new TreasureControl();
        int expResult = 50;
        int result = instance.calcJewelryWeight(numJewelry);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of calcGemWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcGemWeight6() {
        System.out.println("calcGemWeight");
        int numGems = 0;
        TreasureControl instance = new TreasureControl();
        int expResult = 0;
        int result = instance.calcGemWeight(numGems);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of calcTablewareWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcTablewareWeight6() {
        System.out.println("calcTablewareWeight");
        int numTableware = 0;
        TreasureControl instance = new TreasureControl();
        int expResult = 0;
        int result = instance.calcTablewareWeight(numTableware);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of calcSilverWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcSilverWeight6() {
        System.out.println("calcSilverWeight");
        int numSilver = 0;
        TreasureControl instance = new TreasureControl();
        double expResult = 0;
        double result = instance.calcSilverWeight(numSilver);
        double delta = 2;
        assertEquals(expResult, result, delta);
       
    }

    /**
     * Test of calcGoldWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcGoldWeight6() {
        System.out.println("calcGoldWeight");
        int numGold = 0;
        TreasureControl instance = new TreasureControl();
        int expResult = 0;
        int result = instance.calcGoldWeight(numGold);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of calcTreasureWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcTreasureWeight6() {
        System.out.println("calcTreasureWeight");
        int jewelryWeight = 50;
        int gemWeight = 0;
        int tablewareWeight = 0;
        double silverWeight = 0;
        int goldWeight = 0;
        TreasureControl instance = new TreasureControl();
        int expResult = 50;
        int result = instance.calcTreasureWeight(jewelryWeight, gemWeight, 
                tablewareWeight, silverWeight, goldWeight);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of calcJewelryWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcJewelryWeight7() {
        System.out.println("calcJewelryWeight");
        int numJewelry = 0;
        TreasureControl instance = new TreasureControl();
        int expResult = 0;
        int result = instance.calcJewelryWeight(numJewelry);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of calcGemWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcGemWeight7() {
        System.out.println("calcGemWeight");
        int numGems = 0;
        TreasureControl instance = new TreasureControl();
        int expResult = 0;
        int result = instance.calcGemWeight(numGems);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of calcTablewareWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcTablewareWeight7() {
        System.out.println("calcTablewareWeight");
        int numTableware = 0;
        TreasureControl instance = new TreasureControl();
        int expResult = 0;
        int result = instance.calcTablewareWeight(numTableware);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of calcSilverWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcSilverWeight7() {
        System.out.println("calcSilverWeight");
        int numSilver = 100;
        TreasureControl instance = new TreasureControl();
        double expResult = 50;
        double result = instance.calcSilverWeight(numSilver);
        double delta = 2;
        assertEquals(expResult, result, delta);
       
    }

    /**
     * Test of calcGoldWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcGoldWeight7() {
        System.out.println("calcGoldWeight");
        int numGold = 0;
        TreasureControl instance = new TreasureControl();
        int expResult = 0;
        int result = instance.calcGoldWeight(numGold);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of calcTreasureWeight method, of class TreasureControl.
     */
    @Test
    public void testCalcTreasureWeight7() {
        System.out.println("calcTreasureWeight");
        int jewelryWeight = 0;
        int gemWeight = 0;
        int tablewareWeight = 0;
        double silverWeight = 50;
        int goldWeight = 0;
        TreasureControl instance = new TreasureControl();
        int expResult = 50;
        int result = instance.calcTreasureWeight(jewelryWeight, gemWeight, 
                tablewareWeight, silverWeight, goldWeight);
        assertEquals(expResult, result);
        
    }
}
