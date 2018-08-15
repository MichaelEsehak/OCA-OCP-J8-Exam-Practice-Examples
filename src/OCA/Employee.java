/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OCA;

import org.omg.CORBA.MARSHAL;

/**
 *
 * @author Michael
 */
 class Employee implements Comparable<Employee> {

    String name;
    Integer id;

//    public static void main(String[] args) {
//        Panda.eat();
//        Bear.eat();
//        Kangaroo joey = new Kangaroo();
//        Marsupial joey2 = new Marsupial();
//        joey.printLength();
//        joey2.printLength();
//        joey.getDescription();
//        joey2.getDescription();
//        System.out.println(joey.tailLength);
//        System.out.println(joey2.tailLength);
//        getDescription();
//        
//    }
    public static void getDescription() throws NullPointerException{
        return;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", id=" + id + '}';
    }

    public Employee() {
        this("mmm", 1);
        System.out.println("Emp no args");
    }

    public Employee(String name, Integer id) {
        this.name = name;
        this.id = id;
        System.out.println("Emp 2 args");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public int compareTo(Employee other) {
        return this.id.compareTo(other.id);
    }

}

class InsufficientDataException extends Exception {
}

class Reptile {

    protected boolean hasLegs() throws InsufficientDataException {
        throw new InsufficientDataException();
    }

    protected double getWeight() throws Exception {
        return 2;
    }
}

class Snake extends Reptile {

    @Override
    protected boolean hasLegs() {

        return false;
    }

    protected double getWeight() throws InsufficientDataException {
        return 2;
    }
}

class Bear {


    public static void eat() {
        System.out.println("Bear is eating");
    }
}

class Panda extends Bear {

    public static void eat() {
        System.out.println("Panda bear is chewing");
    }

}

class Marsupial {

    protected int tailLength = 4;

    protected  static boolean isBiped() {
        return false;
    }

    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs: " + isBiped());
    }

    public void getDescription() throws NullPointerException{
        System.out.println("Marsupial walks on two legs: " + isBiped());
    }

    public void printLength() {
        System.out.println("parent:" + tailLength);
    }
}

class Kangaroo extends Marsupial {

    public int tailLength = 8;

    public static boolean isBiped() {
        return true;
    }

    public void getDescription() {
        System.out.println("Marsupial walks on two legs: " + isBiped());
    }

    public void getKangarooDescription() {
        System.out.println("Kangaroo hops on two legs: " + isBiped());
    }

    public void printLength() {
        System.out.println("child:" + tailLength);
    }

}
