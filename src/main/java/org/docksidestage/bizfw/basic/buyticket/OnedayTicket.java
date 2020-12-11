package org.docksidestage.bizfw.basic.buyticket;

/**
 * @author yama
 *
 */
public class OnedayTicket implements Ticket {

    private final TicketProperty property = TicketProperty.getPropertyForType(TicketType.ONEDAY);
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
            throw new IllegalStateException("Already in park by this ticket: displayedPrice=" + property.getPrice());
        }
        alreadyIn = true;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public int getPrice() {
        return property.getPrice();
    }

    public String getDisplayPrice() {
        return property.getPrice() + "円";
    }

    public TicketType getType() {
        return property.getType();
    }

    public boolean isAlreadyIn() {
        return alreadyIn;
    }
}