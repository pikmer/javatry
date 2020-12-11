package org.docksidestage.bizfw.basic.buyticket;

/**
 * @author yama
 *
 */
public class DaysTicket implements Ticket {

    private final TicketProperty property;
    private int remainingDays = 0; //チケットの残入場日数

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DaysTicket(TicketType type) {
        property = TicketProperty.getPropertyForType(type);
        remainingDays = property.getDays();
    }

    // ===================================================================================
    //                                                                             In Park
    //                                                                             =======
    public void doInPark() {
        if (remainingDays <= 0) {
            throw new IllegalStateException("remaining days is zero!");
        }
        remainingDays--;
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
}
