/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messages;

import core.Literal;
import java.util.List;

/**
 *
 * @author martin
 */
public class GetRequestMessage extends Message {
    private String initialSender;
    private List<Literal> lits;
    
    public GetRequestMessage(int id, String senderLabel, String initialSender, List<Literal> lits) {
        super(id, senderLabel);
        this.initialSender = initialSender;
        this.lits = lits;
    }
    
    @Override
    public String toString() {
        return "GetRequestMessage: Program#" + getSenderLabel() + " asks for " + getLits();
    }

    /**
     * @return the lits
     */
    public List<Literal> getLits() {
        return lits;
    }

    /**
     * @param lits the lits to set
     */
    public void setLits(List<Literal> lits) {
        this.lits = lits;
    }

    /**
     * @return the initialSender
     */
    public String getInitialSender() {
        return initialSender;
    }

    /**
     * @param initialSender the initialSender to set
     */
    public void setInitialSender(String initialSender) {
        this.initialSender = initialSender;
    }

}
