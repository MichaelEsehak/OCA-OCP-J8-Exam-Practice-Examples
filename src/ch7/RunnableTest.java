/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7;

/**
 *
 * @author Michael
 */
import java.lang.Runnable;

public class RunnableTest {

    public static void main(String[] args) {
        new Thread(() -> System.out.println("michael")).run();
        new Thread(new Test()).run();
    }
}

class Test implements Runnable {

    public void run() {
        System.out.println("michael");
    }
}
