package org.docksidestage.bizfw.basic.buyticket;

/**
 * @author yama
 *
 */
public class DaysTicket implements Ticket {

    private final TicketType type;
    private int remainingDays = 0; //チケットの残入場日数
    private boolean alreadyIn = false; //既に入場しているか:1日でも入場したらとりあえずtrue

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
        //こういうときってどっちの書き方のほうが良いんでしょうか？
        alreadyIn = true;
        //if(!alreadyIn) alreadyIn = true;
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
