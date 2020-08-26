import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Gigasecond {

    //https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html
    //LocalDateTime has a very convenient method for solving this particular task called plusSeconds()
    private LocalDateTime finalDate;

    public Gigasecond(LocalDate moment) {
        finalDate = moment.atTime(0, 0);
    }

    public Gigasecond(LocalDateTime moment) {
        finalDate = moment;
    }

    public LocalDateTime getDateTime() {
        return finalDate.plusSeconds(1000000000);


    }
}
