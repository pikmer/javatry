package org.docksidestage.bizfw.basic.buyticket;

/**
 * @author yama
 *
 */
public class OnedayTicket implements Ticket {

    private final TicketType type = TicketType.ONEDAY;
    private boolean alreadyIn = false; //既に入場しているか

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public OnedayTicket() {
    }

    // ===================================================================================
    //                                                                             In Park
    //                                                                             =======
    public void doInPark() {
        if (alreadyIn) {
            throw new IllegalStateException("Already in park by this ticket: displayedPrice=" + type.getPrice());
        }
        alreadyIn = true;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public int getPrice() {
        return type.getPrice();
    }

    public String getDisplayPrice() {
        return type.getPrice() + "円";
    }

    public TicketType getType() {
        return type;
    }

    public boolean isAlreadyIn() {
        return alreadyIn;
    }
}