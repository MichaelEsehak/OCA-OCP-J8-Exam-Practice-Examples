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
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecuterTest {

    public static void main(String[] args) {
        ExecutorService e = Executors.newSingleThreadExecutor();
        System.out.println("begin");
        try {
            e.execute(()
                    -> System.out.println("michael")
            );
            e.execute(() -> {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i=" + i);
                }
            });
            e.execute(() -> System.out.println("zoo"));
            System.out.println("end");

            Future f = e.submit(() -> {
                for (int i = 0; i < 4000; i++) {
                    System.out.print(i);
                }
            });
            
            
        } finally {
            if (e != null) {
                e.shutdown();
            }
        }
    }
}
