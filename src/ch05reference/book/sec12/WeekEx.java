package ch05reference.book.sec12;

import java.util.Calendar;

public class WeekEx {
    public static void main(String[] args) {
        Week today = null;

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE,4);

        int week = cal.get(Calendar.DAY_OF_WEEK);

        switch (week) {
            case 1: today = Week.SUNDAY;    break;
            case 2: today = Week.MONDAY;    break;
            case 3: today = Week.TUESDAY;   break;
            case 4: today = Week.WDNESDAY;  break;
            case 5: today = Week.THURSDAY;  break;
            case 6: today = Week.FRIDAY;    break;
            case 7: today = Week.SATURDAY;  break;
        }

        if (today == Week.SUNDAY) {
            System.out.println("오늘은 일요일");
        } else {
            System.out.println("일요일 아님");
        }
    }
}
