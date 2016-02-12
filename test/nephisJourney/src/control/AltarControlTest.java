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
 * @author adamh_000
 */
public class AltarControlTest {
    
    public AltarControlTest() {
    }

    /**
     * Test of calcAltarSize method, of class AltarControl.
     */
    @Test
    public void testCalcAltarSize1() {
        System.out.println("calcAltarSize");
        int height = 2;
        int width = 3;
        AltarControl instance = new AltarControl();
        int expResult = 14;
        int result = instance.calcAltarSize(height, width);
        assertEquals(expResult, result);
        
    }
    @Test 
    public void testCalcAltarSize2() {
        System.out.println("calcAltarSize");
        int height = 5;
        int width = 1;
        AltarControl instance = new AltarControl();
        int expResult = -1;
        int result = instance.calcAltarSize(height, width);
        assertEquals(expResult, result);
        
    }
    @Test  
    public void testCalcAltarSize3() {
        System.out.println("calcAltarSize");
        int height = 3;
        int width = -1;
        AltarControl instance = new AltarControl();
        int expResult = -2;
        int result = instance.calcAltarSize(height, width);
        assertEquals(expResult, result);
        
    }
    @Test  
    public void testCalcAltarSize4() {
        System.out.println("calcAltarSize");
        int height = -2;
        int width = 5;
        AltarControl instance = new AltarControl();
        int expResult = -1;
        int result = instance.calcAltarSize(height, width);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testCalcAltarSize5() {
        System.out.println("calcAltarSize");
        int height = 1;
        int width = 1;
        AltarControl instance = new AltarControl();
        int expResult = 0;
        int result = instance.calcAltarSize(height, width);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testCalcAltarSize6() {
        System.out.println("calcAltarSize");
        int height = 4;
        int width = 4;
        AltarControl instance = new AltarControl();
        int expResult = 50;
        int result = instance.calcAltarSize(height, width);
        assertEquals(expResult, result);
        
    }
    
}
