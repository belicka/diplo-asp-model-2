/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messages;

/**
 *
 * @author martin
 */
public class StopMessage extends Message {

    public StopMessage() {
        super(-1, null);
    }
    
     @Override
     public String toString() {
        return "StopMessage";
    }
}
