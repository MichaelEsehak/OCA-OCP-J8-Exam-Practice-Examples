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
import java.lang.Thread;

public class ThreadTest extends Thread {

    public static void main(String[] args) {
        ThreadTest t = new ThreadTest();
        t.run();
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("michael");
        }

    }
}
