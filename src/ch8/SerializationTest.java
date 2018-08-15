/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8;

/**
 *
 * @author Michael
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SerializationTest {

    public static List<Animal> getAnimals(File dataFile) throws IOException, ClassNotFoundException {

        List<Animal> animals = new ArrayList<Animal>();

        try (ObjectInputStream in = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(dataFile)))) {
            while (true) {
                Object object = in.readObject();
                if (object instanceof Animal) {
                    animals.add((Animal) object);
                }
            }
        } catch (EOFException e) {
// File end reached
        }
        return animals;
    }

    public static void createAnimalsFile(List<Animal> animals, File dataFile) throws IOException {

        try (ObjectOutputStream out = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(dataFile)))) {
            for (Animal animal : animals) {
                out.writeObject(animal);
            }
        }
    }

    public static void main(String[] args) throws IOException,
            ClassNotFoundException {
        List<Animal> animals = new ArrayList<Animal>();
//        animals.add(new Animal("Tommy Tiger", 5, 'T'));
//        animals.add(new Animal("Peter Penguin", 8, 'P'));
        File dataFile = new File("animal.data");
//        createAnimalsFile(animals, dataFile);
        System.out.println(getAnimals(dataFile));
    }
}

class Animal extends Parent implements Serializable {

    private static final long serialVersionUID = 2L;
    private String name;
    private int age = 10;
    private static char type = 'C';
    private static final int test;

    static {

        test = 1;
    }

    {
        this.age = 14;
    }

//    public Animal() {
//
//        this.name = "Unknown";
//        this.age = 12;
//        this.type = 'Q';
//
//    }
    public Animal(String name, int age, char type) {
        
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + ", age=" + age + ", type=" + type + ", test=" + test + "]";
    }

}

class Parent implements Serializable{

    public Parent() {
        System.out.println("ser");
    }
}
