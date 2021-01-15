package org.docksidestage.bizfw.basic.buyticket;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yama
 *
 */
public class TicketProperty {

    //key-valueに帰る、TicketTypeファイル独立
    private static final Map<TicketType, TicketProperty> TicketProperties = new HashMap<>();
    private static final TicketProperty TICKET_PROPATEIS[];

    private final int price;
    private final TicketType type;
    private final int entrancePossibleDays;

    static {
        for (TicketType ticketType : TicketType.values()) {
            TicketProperty ticketProperty = new TicketProperty(ticketType, ticketType.getPrice(), ticketType.getDays());
            TicketProperties.put(ticketType, ticketProperty);
        }
    }

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
        throw new IllegalStateException(type + "のチケットはない！");
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
