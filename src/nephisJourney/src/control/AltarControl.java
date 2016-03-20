/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nephisJourney.src.control;

import nephisJourney.src.exceptions.AltarControlException;

/**
 *
 * @author Jenaca
 */
public class AltarControl {

//modifiers returnType functionName (datatype paramerer1, ...)
    public int calcAltarSize(int height, int width) 
            throws AltarControlException { 
        if (height < 1 || height > 4){  //test to check if the height is 
                                        //in range
		throw new AltarControlException("The height of the altar needs"
                        + "to be between 1 and 4.");
        }
	if (width < 1 || width > 4) {   //test to check if the width is 
                                        //in range
		throw new AltarControlException("The width of the altar needs"
                        + "to be between 1 and 4.");
        }
        
        double radius = width / 2.0; //divides the width to give the radius
        int volume =(int) (Math.PI * Math.pow(radius, 2) * height);
        /*finds the volume of the Altar and return it as a whole number of 
        stones needed
        */ 
        return volume;

    }

    
}
