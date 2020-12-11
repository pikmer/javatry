package org.docksidestage.bizfw.basic.buyticket;

/**
 * @author yama
 *
 */
public class TicketProperty {

    //key-valueに帰る、TicketTypeファイル独立
    private static final TicketProperty TICKET_PROPATEIS[] = { //チケットごとの情報格納
            new TicketProperty(TicketType.ONEDAY, 7400, 1), //通常の1日チケット
            new TicketProperty(TicketType.TWODAY, 13200, 2), //通常の2日チケット
            new TicketProperty(TicketType.FOURDAY, 22400, 4), //通常の4日チケット
    };

    private final int price;
    private final TicketType type;
    private final int entrancePossibleDays;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TicketProperty(TicketType type, int price, int entrancePossibleDays) {
        this.type = type;
        this.price = price;
        this.entrancePossibleDays = entrancePossibleDays;
    }

    // ===================================================================================
    //                                                                       static method
    //                                                                         ===========
    public static TicketProperty getPropertyForType(TicketType type) {
        for (TicketProperty ticketProperty : TICKET_PROPATEIS) {
            if (ticketProperty.getType() == type) {
                return ticketProperty;
            }
        }
        throw new IllegalStateException(type + "の値段はない！");
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public int getPrice() {
        return price;
    }

    public int getDays() {
        return entrancePossibleDays;
    }

    public TicketType getType() {
        return type;
    }
}
