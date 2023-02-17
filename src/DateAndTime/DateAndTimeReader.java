package DateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTimeReader {

    public String getDateAndTime(){

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM dd,yyyy HH:mm");
        LocalDateTime now = LocalDateTime.now();

        String currentDate;
        int currentTime;


        currentDate = dtf.format(now);
        currentTime = Integer.parseInt(currentDate.substring(11, 13));

        if(currentTime > 12){
            currentTime -= 12;
            currentDate = currentDate.replace(currentDate.substring(11, 13), "" + currentTime);
            currentDate += " PM";
        }else{
            currentDate += " AM";
        }

        switch (currentDate.substring(0, 2)) {
            case "01" -> currentDate = currentDate.replaceFirst("01", "Jan");
            case "02" -> currentDate = currentDate.replaceFirst("02", "Feb");
            case "03" -> currentDate = currentDate.replaceFirst("03", "Mar");
            case "04" -> currentDate = currentDate.replaceFirst("04", "Apr");
            case "05" -> currentDate = currentDate.replaceFirst("05", "May");
            case "06" -> currentDate = currentDate.replaceFirst("06", "Jun");
            case "07" -> currentDate = currentDate.replaceFirst("07", "Jul");
            case "08" -> currentDate = currentDate.replaceFirst("08", "Aug");
            case "09" -> currentDate = currentDate.replaceFirst("09", "Sept");
            case "10" -> currentDate = currentDate.replaceFirst("10", "Oct");
            case "11" -> currentDate = currentDate.replaceFirst("11", "Nov");
            case "12" -> currentDate = currentDate.replaceFirst("12", "Dec");

        }

        return currentDate;

    }

}
