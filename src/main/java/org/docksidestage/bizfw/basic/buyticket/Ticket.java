package org.docksidestage.bizfw.basic.buyticket;

/**
 * @author yama
 *
 */
public interface Ticket {

    // ===================================================================================
    //                                                                           Attribute
    //     

    // ===================================================================================
    //                                                                             In Park
    //                                                                             =======
    void doInPark();

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    int getPrice();

    String getDisplayPrice();

    TicketType getType();
}