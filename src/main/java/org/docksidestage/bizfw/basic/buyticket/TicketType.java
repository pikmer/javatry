package org.docksidestage.bizfw.basic.buyticket;

/**
 * @author yama
 *
 */
public enum TicketType {
    ONEDAY(1, 7400), //通常1日
    TWODAY(2, 13200), //通常2日
    FOURDAY(4, 22400), //通常4日
    ;

    private final int price;
    private final int entrancePossibleDays;

    private TicketType(final int price, final int entrancePossibleDays) {
        this.price = price;
        this.entrancePossibleDays = entrancePossibleDays;
    }

    public int getPrice() {
        return this.price;
    }

    public int getDays() {
        return this.entrancePossibleDays;
    }

}