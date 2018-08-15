/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 *
 * @author Michael
 */
public class MethodRefrence {

    public static void main(String[] args) {
//        Function<Person, Person> f = DuckHelper::compareByWeight();
        Person p1 = new Person(1, "Michael");
        Person p2 = new Employee(2, "Mina");
        Person p3 = new Doctor(3, "Dr. Emad");
        Person p4 = new Student(4, "Tony");

        List<Person> l = new ArrayList<>();
        l.add(p1);
        l.add(p2);
        l.add(p3);
        l.add(p4);

        Comparator<Person> byId = (d1, d2) -> PersonkHelper.compareById(d1, d2);
        Comparator<Person> byName = (d1, d2) -> d1.getName().compareTo(d2.getName());
        Comparator<Person> byWeight = (d1, d2) -> PersonkHelper.compareById(d1, d2);
        Predicate<Person> p = a -> a.getId() > 0;
        Predicate<Person> pr = Person::isActive;
        //Consumer<Person> c = (t) -> t.setName("michael");
        Consumer<Person> c = System.out::println;
        Collections.sort(l, PersonkHelper::compareByName);
        System.out.println(l.toString());
        //l.removeIf(p);
        //l.replaceAll(x->{x.setId(5);return x;});
        l.forEach(c);
        //l.forEach(c);
        //System.out.println(l.toString());

    }

}

class PersonkHelper {

    public static int compareById(Person d1, Person d2) {
        return d1.getId() - d2.getId();
    }

    public static int compareByName(Person d1, Person d2) {
        return d1.getName().compareTo(d2.getName());
    }
}
