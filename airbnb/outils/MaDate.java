package matthieu.airbnb.outils;

import java.util.Date;

public class MaDate extends Date {

    private int year;
    private int month;
    private int day;

    public MaDate(int year, int month, int date){
        super(year, month, date);
        this.year = year;
        this.month = month;
        this.day = date;
    }



    @Override
    public String toString() {
        return "MaDate{" +
                "date=" + year + "/" + month + "/" + day +
                '}';
    }
}
