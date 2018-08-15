/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4;

/**
 *
 * @author Michael
 */
import java.util.function.*;

import java.util.List;
import java.util.Optional;

public class Test {

    public static void main(String... args) {
        Supplier<Person> s = Employee::new;
        Supplier<Person> s2 = () -> new Employee(2, "mina");
        //Employee 
        Person p = s2.get();
        p.setId(1);
        //p.setName("michael");

        Consumer c = System.out::println;
        Consumer<String> c2 = p::setName;
        BiConsumer<Integer, String> c3 = p::setData;

//        c2.accept("tony");
//
//        c3.accept(4, "huda");
//        c.accept(p);
        //System.out.println(s.get());
        Predicate<String> pr = x -> x.isEmpty();
        BiPredicate<String, String> pr2 = (a, b) -> a.equals(b);
        BiPredicate<String, String> pr3 = String::equals;

        //System.out.println(pr3.test("michael", "michael"));

        BiFunction<String, String, String> f = String::concat;//(string1,string2)->string1.concat(string2);//String::concat;
        Function<String, Integer> f2 = String::length;

       // System.out.println(f.apply("michael", " Ayed"));
        
//        Optional o = Optional.ofNullable(p);
//        if(o.isPresent()){
//            o.ifPresent(c);
//            o.orElse(o);
//        }else{
//            System.out.println("false");
//        }
       // o.ifPresent(c);
        

    }

}

class Person implements Comparable<Person>, Humman {

//    public static void main(String[] args) {
//
//        List<? extends Employee> per = new ArrayList<>();
//        //Humman h = new Person();
//
//        //per.add(h); // DOES NOT COMPILE
////        per.add(new Employee()); // DOES NOT COMPILE
////        per.add(new Person()); 
////        per.add(new Employee());
////        List<Person> p=new ArrayList<>();
////        p.add(new Employee());
////        
////        Person pp =new Employee();
//        List<String> strings = new ArrayList<String>();
//        strings.add("tweet");
//        List<Object> objects = new ArrayList<Object>(strings);
//        addSound(strings);
//        addSound(objects);
//
//    }
    public void setData(Integer id, String name) {
        this.id = id.intValue();
        this.name = name;
    }

    public static void addSound(List<? super String> list) {
        list.add("quack");
    }

    private int id;
    private String name;

    public Person() {

    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Person t) {
        assert t == null;
        return this.id - t.id;
    }

    @Override
    public String toString() {
        return "Person:" + name + ":" + id;
    }

    public static boolean isActive(Person p) {
        return true;
    }

}

interface Humman {
}

class Employee extends Person {

    public Employee() {
    }

    public Employee(int id, String name) {
        super(id, name);
    }

    public String toString() {
        return "Employee:" + getName() + ":" + getId();
    }

}

class Doctor extends Employee {

    public Doctor() {
    }

    public Doctor(int id, String name) {
        super(id, name);
    }

    public String toString() {
        return "Doctor:" + getName() + ":" + getId();
    }

}

class Student extends Person {

    public Student() {
    }

    public Student(int id, String name) {
        super(id, name);
    }

    public String toString() {
        return "Student:" + getName() + ":" + getId();
    }

}
