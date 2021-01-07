package matthieu.airbnb.outils;
    
import java.util.Date;

public class MaDate extends Date {

    private Date date;

    public MaDate(Date pDate){
        date = pDate;
    }

    @Override
    public String toString() {
        return "MaDate{" +
                "date=" + date +
                '}';
    }
}
