/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OCA;

/**
 *
 * @author Michael
 */
public class DefaultTest {

}

interface Animal2 {

    public default String getName() {
        return null;
    }
}

interface Mammal {

    public default String getName() {
        return null;
    }
}

abstract class Otter implements Mammal, Animal2 {
    public abstract String getName() ;
}
