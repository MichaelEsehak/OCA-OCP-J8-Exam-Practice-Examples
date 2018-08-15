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
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;
import java.lang.InterruptedException;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class CollableTest {

    public static void main(String[] arg) {
        ExecutorService service = Executors.newSingleThreadExecutor();

        Future f = service.submit(() -> {
            List<Person> list = new ArrayList();
            for (int i = 0; i < 10; i++) {
                list.add(new Person(i + ""));
            }
            return list;
        });
//        Future f2 = service.submit(() -> {
//            List<Person> list = new ArrayList();
//            for (int i = 10; i < 20; i++) {
//                list.add(new Person(i + ""));
//            }
//            return list;
//        });
//        Future f3 = service.submit(() -> {
//            List<Person> list = new ArrayList();
//            for (int i = 20; i < 30; i++) {
//                list.add(new Person(i + ""));
//            }
//            return list;
//        });
        try {
            //((List<Person>) f.get()).forEach(System.out::println);
//            ((List<Person>) f2.get()).forEach(System.out::println);
//            ((List<Person>) f3.get()).forEach(System.out::println);
            if (service != null) {
                service.shutdown();
            }
            if (service != null) {
                service.awaitTermination(1, TimeUnit.MINUTES);
                if (service.isTerminated()) {
                    System.out.println("All tasks finished");
                } else {
                    System.out.println("At least one task is still running");
                }
            }
            System.out.println("michael");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }

    }
}

class Person {

    String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name;
    }

}
