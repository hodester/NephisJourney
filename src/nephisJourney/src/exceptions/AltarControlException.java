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
public class AltarControlException extends Exception {

    public AltarControlException() {
    }

    public AltarControlException(String string) {
        super(string);
    }

    public AltarControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public AltarControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public AltarControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
