package org.docksidestage.bizfw.basic.buyticket;

public class TicketBuyResult {

    private int change = 10;
    private Ticket ticket = null;

    public TicketBuyResult(Ticket ticket, int change) {
        this.ticket = ticket;
        this.change = change;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public int getChange() {
        return change;
    }

}
