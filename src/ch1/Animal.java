/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1;

/**
 *
 * @author Michael
 */
import OCA.Manager;

 class Animal {

//    public Employee getName() throws Exception {
//        return new Manager();
//    }

//    public static void main(String[] args) {
//        HeavyAnimal h = new Hippo();
//        if (h instanceof Hippo) {
//            System.out.println("true");
//        } else {
//            System.out.println("fa");
//        }
//        if (h instanceof HeavyAnimal) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//
//        }
//
//        Hippo anotherHippo = new Hippo();
//        boolean b5 = anotherHippo instanceof Hippo;
//    }
}

class Gorilla extends Animal {

    public Manager getName() throws NullPointerException { // DOES NOT COMPILE
        return new Manager();
    }
}

class ZooKeeper {

//    public static void main(String[] args) {
//        Animal animal = new Animal();
//
//    }
}

class HeavyAnimal {
}

class Hippo extends HeavyAnimal {
}

class Elephant extends HeavyAnimal {
}
