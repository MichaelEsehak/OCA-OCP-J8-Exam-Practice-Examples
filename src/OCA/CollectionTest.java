/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OCA;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Michael
 */
public class CollectionTest {

//    public static void main(String[] args) {
//        List<Employee> ec = new LinkedList<>();
//        Employee e1 = new Employee("michael", 1);
//        Employee e2 = new Employee("beshoy", 2);
//        Employee e3 = new Employee("mina", 3);
//        Employee e4 = new Employee("nader", 4);
//
////        System.out.println(ec.add(e1));
////        System.out.println(ec.add(e1));
//        ec.add(e4);
//        ec.add(e2);
//        ec.add(e1);
//        ec.add(e3);
//        //System.out.println(ec.add(e1));
//
//        ListIterator<Employee> lit = ec.listIterator();
//        lit.next();
////        lit.next();
////        lit.next();
////        lit.previous();
//        //lit.add(e4);
//        //lit.remove();
//        lit.set(e2);
//        System.out.println(ec.toString());
//        ec.forEach((cnsmr) -> {
//            System.out.println(cnsmr);
//        });
//
////        it = ec.iterator();
////        while (it.hasNext()) {
////            System.out.println(it.next().toString());
////
////        }
////        ec.forEach((employee) -> {
////            System.out.println(employee);
////        });
//        //   System.out.println(ec.isEmpty());
//        Collection<Employee> test = new ArrayList<>();
//        test.add(e4);
//        test.add(e3);
//        // ec.clear();
////        ec.forEach((cnsmr) -> {
////            System.out.println(cnsmr);
////        });
//
//        //System.out.println(search(ec, e4));
////        for (Employee employee : ec) {
////            System.out.println(employee);
////            
////        }
//    }

    private static <T extends Comparable> boolean search(Collection<T> col, T e) {

        for (T t : col) {
            if (t.compareTo(e) == 0) {
                return true;
            }
        }
        return false;
    }

}
