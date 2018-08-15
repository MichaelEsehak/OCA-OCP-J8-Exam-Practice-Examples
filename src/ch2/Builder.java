/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Michael
 */
public class Builder {

    private String name;
    private int id;
    private List<Person> childreens;
    private LocalDate date;

    public Builder setDate(LocalDate date) {
        this.date = date;
        return this;
    }

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public Builder setId(int id) {
        this.id = id;
        return this;
    }

    public Builder setChildreens(List<Person> childreens) {
        this.childreens = childreens;
        return this;
    }

    public ImmutablePerson build() {
        return new ImmutablePerson(childreens, name, id, date);
    }

    public static void main(String[] args) {

        ImmutablePerson s = new Builder().setChildreens(new ArrayList<>(Arrays.asList(new Person(1), new Person(2)))).setName("michael").setId(1).setDate(LocalDate.of(2018, 5, 7)).build();

        List<Person> arr = s.getChildreens();
        Person p = arr.get(0);

        System.out.println(p.getId());
        p.setId(10);
        System.out.println(p.getId());
        System.out.println(s.getChildreens().get(0).getId());

    }
}

final class ImmutablePerson {

    private final String name;
    private final int id;
    private final List<Person> childreens;
    private final LocalDate date;

    public ImmutablePerson(List<Person> childreens, String name, int id, LocalDate date) {
        assert childreens == null;
        this.childreens = new ArrayList<>(childreens);
        this.name = name;
        this.id = id;
        this.date = LocalDate.of(date.getYear(), date.getMonthValue(), date.getDayOfMonth());
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<Person> getChildreens() {
        //return new ArrayList<>(childreens);
        List<Person> p = new ArrayList<>(childreens.size());
        for (Person childreen : childreens) {
            p.add(new Person(childreen.getId()));
        }
        return p;
    }

    public LocalDate getDate() {
        return date;
    }

}

class Person {

    private int id;

    public Person(int id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

}
