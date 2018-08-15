/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OCA;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author Michael
 */
interface i1 {

    default void print() {
        System.out.println("interface print");
    }
    //void print();
}

abstract class t1 {
//    public void print(){
//        System.out.println("print");
//    }

//    abstract void print();
}

class CTest extends t1 implements i1 {

//    public void  print() {
//
//    }
}

public class APITest {

    public static void main(String... args) {
//        CTest ct = new CTest();
//        ct.print();
        stringTest();
        stringBuilderTest();
        //arrayListTest();
        //arrayTest();

        // localDateTest();
        // localTimeTest();
        //localDateTimeTest();
        //primitiveTypesTest();
        //floating-point literals
        //numericPromotionRulesTest();
        //extends abstracct and implments interface
    }

    static void numericPromotionRulesTest() {
        byte b = 1;
        char c = '0';
        short s = 1;
        int i = 1;
        long l = 1;
        float f = 1.0f;
        double d = 1.0;
        int x = (int) l + b;
        System.out.println(x);

    }

    static void primitiveTypesTest() {

        byte b = 1;
        char c = 1;
        c = (char) b;
        //c=b;
        short s = 1;
        //s=c;
        s = (short) c;
        //c=s;
        c = (char) s;

        s = b;
        int i = 1;
        i = b;
        i = c;
        i = s;

        long l = 1;
        l = b;
        l = s;
        l = c;
        l = i;
        float f = 1.1f;
        f = b;
        f = c;
        f = s;
        f = i;
        f = l;
        double d = 1.1;
        d = b;
        d = c;
        d = s;
        d = i;
        d = l;
        d = f;

        /////
        i = (int) l;
        i = (int) f;
        i = (int) d;

        l = (long) f;
        l = (long) d;
        b = (byte) d;
        c = (char) d;
        s = (short) d;

        test((short) 1);
    }

    static void test(short f) {
        System.out.println("Float:" + f);
    }
//    static void test(double d){
//        System.out.println("double:"+d);
//    }

    static void localDateTest() {
        LocalDate d = LocalDate.of(2018, Month.JANUARY, 1);
        Period p = Period.ofDays(1);
        Period.of(1, 1, 1);
        Period.ofDays(1);
        Period.ofMonths(0);
        Period.ofWeeks(0);
        Period.ofYears(1);

        d.plus(p);
        d.plusDays(1);
        d.plusWeeks(1);
        d.plusMonths(1);
        d.plusYears(1);

        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(d));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(d));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(d));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(d));

        System.out.println(d);

    }

    static void localTimeTest() {
        LocalTime t = LocalTime.of(1, 1, 1);
        Duration.ofNanos(0);
        Duration.ofMillis(0);
        Duration.ofSeconds(0);
        Duration.ofMinutes(0);
        Duration.ofHours(0);
        //Duration.of(1, TimeUnit.SECONDS);

//        System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).format(t));
//        System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).format(t));
//        DateTimeFormatter f=DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
//        System.out.println(t.format(f));
        LocalTime time = LocalTime.of(11, 12, 34);
        DateTimeFormatter shortDateTime
                = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        //System.out.println(time.format(shortDateTime));
        System.out.println(shortDateTime.format(time));

    }

    static void localDateTimeTest() {
        LocalDateTime dt = LocalDateTime.of(2018, Month.JANUARY, 1, 1, 1, 1, 1);
        //LocalDateTime dt=LocalDateTime.of(2018, Month.JANUARY, 1,12,30,30,3);
        //LocalDateTime dt=LocalDateTime.now();

        //System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).format(dt));
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM);
        //System.out.println(f.format(dt));

        Period p = Period.of(1, 1, 1);
        Duration d = Duration.ofDays(1);
        dt = dt.plus(p).plus(d);

        System.out.println(f.format(dt));
        dt = dt.plus(p).plus(d).plus(p).plus(d);
        System.out.println(f.format(dt));
    }

    static void arrayListTest() {
        List<Integer> l = new ArrayList<>();

        l.add(1);//boolean
        l.addAll(Arrays.asList(new Integer[]{2, 3, 4}));//boolean
        l.add(4, 5);//VOID VOID VOID VOID
        l.addAll(5, Arrays.asList(6, 7)); //boolean
        //System.out.println(l.toString());
        l.remove(new Integer(1)); //boolean
        l.remove(0); //returns the object removed
        l.set(0, 5);//returns the old object (the replaced one).
        l.isEmpty(); //bolean
        l.size(); //int
        l.contains(1);//boolean
        
        //l.clear(); //void
        l.equals(l); //bolean checks same size and same order 
        Integer[] in = l.toArray(new Integer[0]);
        //System.out.println(Arrays.toString(in));

        List<Integer> l1 = Arrays.asList(in);

        System.out.println(l.toString());
        l.removeIf(a -> a == 5);
        System.out.println(l.toString());

//        System.out.println(l1.contains(new Integer(1)));
//        Collections.sort(l1);
//        System.out.println("mi:"+Collections.binarySearch(l1, new Integer(5)));
        //System.out.println(l1.toString());
    }

    static void arrayTest() {
        char[] arr = new char[7];
        char ar[];
        ar = new char[7];
        Integer[] numbers2 = new Integer[]{45, 14, 99};

        Arrays.sort(numbers2);
        
        System.out.println(Arrays.toString(numbers2));
        System.out.println(Arrays.binarySearch(numbers2, 14));

        int[] numbers1 = {42, 55, 99};
        int[][] differentSize = new int[][]{{1, 4}, {3}, {9, 8, 7}};
        System.out.println(ar.length);
    }

    static void stringBuilderTest() {
        StringBuilder s = new StringBuilder("michael"); //(empty, String, CharSequence, int Capacity) 

        //Return char
        System.out.println(s.charAt(0)); //int
        

        // Retrun int
        System.out.println(s.length());
        System.out.println(s.indexOf("ch")); //String
        System.out.println(s.indexOf("ch", 3)); //String - int start

        //Return String
        System.out.println(s.substring(3)); //int
        System.out.println(s.substring(1, 7)); // int - int
        System.out.println(s.toString());

        //Return StringBuilder
        System.out.println(s.append(""));//char, int, long, float, double, boolean, String, CharSequence, Object
        System.out.println(s.insert(0, "")); //int index - char, int, long, float,double, boolean, String, CharSequence, Object
        System.out.println(s.delete(0, 0)); //int start - int end
        System.out.println(s.deleteCharAt('c')); //char,int(char)
        System.out.println(s.reverse());
        System.out.println(s.reverse());
        
        

    }

    static void stringTest() {
        String s = new String(new StringBuilder("michael"));

        // Return char
        System.out.println(s.charAt(0));

        // Retrun int
        System.out.println(s.length());
        System.out.println(s.indexOf('c')); //char
        System.out.println(s.indexOf('c', 3)); //char - int start
        System.out.println(s.indexOf("ch")); //String
        System.out.println(s.indexOf("ch", 3)); //String - int start
        System.out.println(s.indexOf(123, 4)); //int(char) - int start

        //Return String
        System.out.println(s.substring(3)); //int
        System.out.println(s.substring(1, 7)); // int - int

        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        System.out.println(s.replace('c', 'c')); //char -char
        System.out.println(s.replace("ch", "ch"));//CharSequence - CharSequence
        System.out.println(s.replace(new StringBuilder("ch"), new StringBuilder("ch")));//CharSequence -CharSequence

        System.out.println(s.trim());
        
        List magazines = new ArrayList<>();
        
        
        //return boolean
        System.out.println("Michael".equals(s));        //object
        System.out.println("michael".equalsIgnoreCase(s)); //String

        System.out.println(s.startsWith("m"));  //String
        System.out.println(s.startsWith("i", 1)); //String - int start

        System.out.println(s.endsWith("l")); //String

        System.out.println(s.contains(new StringBuilder("ch"))); //input CharSequence
        System.out.println(s.contains("c")); //input CharSequence
        
    }
}
