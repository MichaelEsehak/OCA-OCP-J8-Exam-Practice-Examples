/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 *
 * @author Michael
 */
public class Animal {

    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String speciesName, boolean hopper, boolean swimmer) {
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
    }

    public boolean canHop() {
        return canHop;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public String toString() {
        return species;
    }

    public static void main(String[] args) {
        List<Animal> list = new ArrayList<>();
        list.add(new Animal("fish1", true, true));
        list.add(new Animal("fish2", false, false));
        list.add(new Animal("fish3", false, true));
        list.add(new Animal("fish4", true, false));

        for (Animal animal : list) {

            //print(animal,1,(a,x) -> animal.canSwim()&&x!=0);
            Predicate<Animal> t = (a -> a.canHop());

            System.out.println(t.test(animal) ? animal.toString() : "");

        }

        list.forEach((animal) -> {
            //print(animal,1,(a,x) -> animal.canSwim()&&x!=0);
            Predicate<Animal> t = (a) -> a.canHop();

            System.out.println(t.test(animal) ? animal.toString() : "");
        });

    }

}

interface CheckTrait {

    public abstract boolean test(Animal a, int x);

}
