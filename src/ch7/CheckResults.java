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
import java.util.concurrent.ExecutorService;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;


public class CheckResults {

    private static int counter = 0;

    public static void main(String[] args) {

        ExecutorService service = null;

        try {

            service = Executors.newSingleThreadExecutor();
            Future f = service.submit(() -> {
                for (int i = 0; i < 5000; i++) {
                    CheckResults.counter++;
                    System.out.println(i);
                }
            });
            Object o=f.get(2, TimeUnit.SECONDS);
            
            System.out.println(o);
        } catch (ExecutionException | InterruptedException | TimeoutException e) {
            e.printStackTrace();
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }

    }

}
