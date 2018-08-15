/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OCA;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.List;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author Michael
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        //list2.add(null);
        list2.add(3);
        list2.get(2);

        Collections.sort(list2);

        Integer[] arr = new Integer[]{3, 4, 5};
        list2.toArray(arr);
        List<Integer> list3 = Arrays.asList(arr);

        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

//        DateTimeFormatter shortDateTime
//                = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
//        System.out.println(dateTime.format(shortDateTime));
//        System.out.println(date.format(shortDateTime));
//        System.out.println(time.format(shortDateTime));

        DateTimeFormatter shortDateTime
                = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(dateTime.format(shortDateTime));
        System.out.println(date.format(shortDateTime));
        System.out.println(time.format(shortDateTime));
        //System.out.println(d.format(ff));

        //Arrays.sort(arr);
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));

        //System.out.println(list2.toString());
//        Sum<Integer> sum = (v1, v2) ->  v1+v2 ;
        //Integer v3=3;
        //Integer v4=4;
//        Integer sumed = sum.sum(3, 4);
//        System.out.println(sumed);    // 123
//        Lambda4 l4 =new Lambda4();
//        l4.testScopes();
//        System.out.println(l4.outerStaticNum);
        List<Pair<PairTest>> list = new ArrayList<>();

        list.add(new Pair("michael", "michael"));
        PairTest<String, String> pt = new PairTest<>();
        pt.setFirst("mina");
        pt.setSecond("monty");
        Pair<PairTest> pp = new Pair<>();
        list.add(new Pair(pp, pp));
        //pp.setFirst("mi");
        //pp.setFirst("mmm");
        Pair ppp = new Pair("mmm", "mmm");
        list.add(ppp);

        list.add(new Pair("michael", "michael"));
        list.add(new Pair(1, 2));

        Pair<PairTest> test = list.get(0);
        System.out.println(test.toString());

        System.out.println(list.toString());
//        Integer[] list1 = {1, 2, 3, -1, 0, 17, 7, 8, 9, 10};
//        String[] list2 = {"a", "b", "c", "d", "e"};
//
//        Algorithm<Integer> s1 = new Algorithm<>();
//        Algorithm<String> s2 = new Algorithm<>();
//
//        Pair<Integer> p1 =new Pair<>();//= s1.getMinMax(list1);
//        if(p1 instanceof Pair) {
//            System.out.println("true");
//        } //        Pair<String> p2 = s2.getMinMax(list2);
//
//        //System.out.println(s2.<Integer>middle(list1,1));
//        ArrayList<Employee> e = new ArrayList();
//        e.add(new Employee("miran", 1));
//        e.add(new Employee("mary", 2));
//        e.add(new Employee("guoda", 3));
//        e.add(new Manager("michael", 4, true));
////
//        Algorithm<Employee> ea = new Algorithm();
//        Pair<Employee> p3 = ea.getMinMax(e.toArray(new Employee[e.size()]));
////        //System.out.println( ea.<Employee>middle(e.toArray(new Employee[e.size()]),new Employee("guoda", 1)));
////        System.out.println(ea.<Employee>at(e.toArray(new Employee[e.size()]), 3).toString());
////        //System.out.println( ea.<String>at(list2,3));
//        Pair<? extends Employee> p4 = new Pair<Manager>(new Manager("mm4", 5, true), new Manager("mm44", 5, true));
        //p3=p4;
//        p3.setFirst(p4.getFirst());
//        p3.setSecond(p4.getSecond());
        //p3 = p4;
//        Pair<? extends Employee> p5 = p4;
//        printBuddies(p4);
//
//        System.out.println("min=" + p3.getFirst().toString());
//        System.out.println("max=" + p3.getSecond().toString());
//        Collection< PairTest<String, Long>> c1 = new ArrayList<>();
//        Collection< PairTest<String, Long>> c2 = c1;  // fine 
//        //Collection< PairTest<String, ?>> c3 = c1;  // error 
//        //Collection< PairTest<String,?> > c3 = new ArrayList<PairTest<String,? >>();
//        Collection<? extends PairTest<String, ?>> c4 = c1;  // fine

        //printAll(e.size(), e.get(0), e.get(1), e.get(2), e.get(3));
    }

    public static void printBuddies(Pair<? extends Employee> p) {
        Employee first = p.getFirst();
        Employee second = p.getSecond();
        System.out.println(first.getName() + " and " + second.getName() + " are buddies.");
    }

    @SafeVarargs
    public static <T> void printAll(int size, T... all) {
        for (int i = 0; i < size; i++) {
            System.out.println(all[i].toString());
        }

    }

}
