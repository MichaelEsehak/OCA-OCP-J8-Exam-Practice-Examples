/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Michael
 */
public class DataAccessTest {

    private int sheepCount = 0;

    public static void main(String[] args) {
        ExecutorService service = null;
        service = Executors.newFixedThreadPool(20);

        DataAccessTest t = new DataAccessTest();

        for (int i = 0; i < 10; i++) {
            service.execute(() -> t.incrementAndReport());
        }

    }

    public synchronized void incrementAndReport() {

        System.out.print(++sheepCount + " ");

    }
}
