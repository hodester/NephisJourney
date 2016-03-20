/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nephisJourney.src.exceptions;

/**
 *
 * @author Hodes
 */
public class ShipControlException extends Exception {

    public ShipControlException() {
    }

    public ShipControlException(String string) {
        super(string);
    }

    public ShipControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public ShipControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public ShipControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
