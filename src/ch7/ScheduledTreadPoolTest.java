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
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ScheduledTreadPoolTest {

    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(3);
        service.schedule(() -> System.out.println("michael"), 0, TimeUnit.SECONDS);
        service.scheduleAtFixedRate(() -> {
            for (int i = 0; i < 50; i++) {
                System.out.println("++++++++");
            }
        }, 0, 1, TimeUnit.SECONDS);

        service.scheduleWithFixedDelay(() -> {
            for (int i = 50; i < 100; i++) {
                System.out.println("---------------------");
            }
        }, 0, 5, TimeUnit.SECONDS);

//        if (service != null) {
//            service.shutdown();
//        }
    }
}
