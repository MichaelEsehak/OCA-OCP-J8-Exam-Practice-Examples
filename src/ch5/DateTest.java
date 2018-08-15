/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5;

/**
 *
 * @author Michael
 */
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;



public class DateTest {
    public static void main (String[] arr){
        LocalDate d=LocalDate.now();
        DateTimeFormatter dd=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(dd.format(d));
        System.out.println(d.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println(d.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println(d.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        
        System.out.println("");
        LocalTime t=LocalTime.now();
        System.out.println(t.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
        System.out.println(t.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
//        System.out.println(t.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG)));
//        System.out.println(t.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL)));
        
        System.out.println("");
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
        System.out.println(dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
//        System.out.println(dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)));
//        System.out.println(dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)));
        
        System.out.println("");
        ZonedDateTime zdt=ZonedDateTime.now();
        System.out.println(zdt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
        System.out.println(zdt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
        System.out.println(zdt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)));
        System.out.println(zdt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)));
        
        
        LocalDate date1=LocalDate.of(2015,Month.JANUARY,20);
        LocalDate date2=LocalDate.of(2015,1,20);
        
        LocalTime time1=LocalTime.of(20,30,30,30);
        
       // System.out.println(time1);
        
        LocalDateTime dt1=LocalDateTime.of(2018,Month.MAY,11,12,25);
        
        LocalDateTime dt2=LocalDateTime.of(date1,time1);

        
        ZoneId zid=ZoneId.of("GMT+3");
        
        ZonedDateTime zdt1=ZonedDateTime.of(dt, zid);
        
        Period p=Period.ofWeeks(2);
        Duration ddd= Duration.of(1,ChronoUnit.DAYS);
        date1=date1.plus(p);
       // System.out.println(date1);
//        System.out.println(zdt1.getZone());
//        System.out.println(zdt1);
        
        //ZoneId.getAvailableZoneIds().stream().filter(x->x.toLowerCase().contains("egy")).forEach(System.out::println);
        
        Instant i=Instant.now();
        Instant x=i.plus(1, ChronoUnit.DAYS);
       // System.out.println(i);
        
        
    }
}
