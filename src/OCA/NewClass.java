/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OCA;

import java.io.FileNotFoundException;

/**
 *
 * @author Michael
 */
public class NewClass {

}

interface I1 {

    default void drow() {
        System.out.println("I1Drow");
    }
}

interface I2 {

    default void drow() {
        System.out.println("I1Drow");
    }
}

class Cinema {

    private String name;

    public Cinema(String name) {
        this.name = name;
    }
}

class Movie extends Cinema {

    public Movie(String movie) {
        super(movie);
    }

    public static void main(String[] showing) {
        //System.out.print(new Movie("Another Trilogy").name);
    }
}

interface MusicCreator {

    public Number play();
}

abstract class StringInstrument {

    public Long play() {
        return 3L;
    }
}

class Violin extends StringInstrument implements MusicCreator {

    public Long play() {
        return 12l;
    }
}

abstract class Ball {

    protected final int size;

    public Ball(int size) {
        this.size = size;
    }
}

interface Equipment {
}

class SoccerBall extends Ball {

    public SoccerBall() {
        super(5);
    }

    public Ball get() {
        return this;
    }

    public int travel() throws Exception {
        try {
            System.out.print('A');
            throw new RuntimeException("Out of bounds!");
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.print('B');
            throw aioobe;
        } finally {
            System.out.print('C');
        }
    }

    ;
    public static void main(String[] passes) {
        Ball bb = new SoccerBall().get();
        Equipment equipment = (Equipment) bb;
        System.out.print(((SoccerBall) equipment).size);
    }
}
