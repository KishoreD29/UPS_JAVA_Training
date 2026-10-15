import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.*;


public class DateTime {
    public static void main(String[] args) {
        // date
        LocalDate date=LocalDate.now();
        System.out.println("DATE"+" "+date);
        System.out.println("YEAR"+" "+date.getYear());
        System.out.println("Month"+" "+date.getMonth());

        // time
        LocalTime time =LocalTime.now();
        System.out.println(time);
        System.out.println("HOUR"+" "+time.getHour());
        System.out.println("MIN"+" "+time.getMinute());

        // format
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(dt.format(formatter));
        
    }
    
   
    
    
}
