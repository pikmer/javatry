package org.docksidestage.bizfw.basic.buyticket;

/**
 * @author yama
 *
 */
public class DaysTicket implements Ticket {

    private final TicketType type;
    private int remainingDays = 0; //チケットの残入場日数

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DaysTicket(TicketType type) {
        this.type = type;
        this.remainingDays = type.getDays();
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
        return type.getPrice();
    }

    public String getDisplayPrice() {
        return type.getPrice() + "円";
    }

    public TicketType getType() {
        return type;
    }
}
