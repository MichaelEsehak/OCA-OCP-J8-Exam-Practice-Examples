/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Michael
 */
public class Person implements Comparable<Person>, Humman {

    public static void main(String[] args) {

        List<? extends Employee> per = new ArrayList<>();
        //Humman h = new Person();

        //per.add(h); // DOES NOT COMPILE
//        per.add(new Employee()); // DOES NOT COMPILE
//        per.add(new Person()); 
//        per.add(new Employee());
//        List<Person> p=new ArrayList<>();
//        p.add(new Employee());
//        
//        Person pp =new Employee();
        List<String> strings = new ArrayList<String>();
        strings.add("tweet");
        List<Object> objects = new ArrayList<Object>(strings);
        addSound(strings);
        addSound(objects);

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
    public static boolean  isActive(Person p){
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

    
    public String tosString() {
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
