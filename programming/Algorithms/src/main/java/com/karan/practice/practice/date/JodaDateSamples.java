package com.karan.practice.practice.date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class JodaDateSamples {

    public static void main(String[] args) {


        Date date = new Date(114, 2, 18);
        //System.out.println(date);
        LocalDate lData = LocalDate.of(2014, 3, 18);
        int year = lData.getYear();
        int day = lData.getDayOfMonth();
        DayOfWeek dow = lData.getDayOfWeek();
        int len = lData.lengthOfMonth();
        boolean leap = lData.isLeapYear();
        System.out.println(year);
        System.out.println(day);
        System.out.println(dow);
        System.out.println(len);
        System.out.println(leap);
        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println(today.get(ChronoField.YEAR));
        System.out.println(today.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(today.get(ChronoField.DAY_OF_MONTH));

        LocalTime time = LocalTime.parse("13:45:20");
        System.out.println("Time :    " + time);

        LocalDateTime dt1 = LocalDateTime.of(2014, Month.MARCH, 18, 13, 45, 20);
        System.out.println("Date and Time:   " + dt1);

        DateTimeFormatter italianFormatter = new DateTimeFormatterBuilder()
                .appendText(ChronoField.DAY_OF_MONTH)
                .appendLiteral(". ")
                .appendText(ChronoField.MONTH_OF_YEAR)
                .appendLiteral(" ")
                .appendText(ChronoField.YEAR)
                .parseCaseInsensitive()
                .toFormatter(Locale.ITALIAN);
        System.out.println("italianFormatter :  " + italianFormatter);

        ZoneId romeZone = ZoneId.of("Europe/Rome");
        System.out.println("romeZone:   "+romeZone);
        ZoneId zoneId = TimeZone.getDefault().toZoneId();
        System.out.println("zoneId:   "+zoneId);

        LocalDate date1 = LocalDate.of(2014, Month.MARCH, 18);
        ZonedDateTime zdt1 = date1.atStartOfDay(romeZone);
        System.out.println("zdt1:  "+zdt1);

        LocalDateTime dateTime = LocalDateTime.of(2014, Month.MARCH, 18, 13, 45);
        ZonedDateTime zdt2 = dateTime.atZone(romeZone);

        System.out.println("zdt2:   "+zdt2);

        Instant instant = Instant.now();
        ZonedDateTime zdt3 = instant.atZone(romeZone);
        System.out.println("zdt3:   "+zdt3);
    }
}
