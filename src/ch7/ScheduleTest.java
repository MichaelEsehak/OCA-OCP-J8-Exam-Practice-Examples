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
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.time.LocalTime;

import java.util.concurrent.ExecutionException;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class ScheduleTest {

    public static void main(String[] arg) {
        ScheduledExecutorService se = null;
        se = Executors.newSingleThreadScheduledExecutor();

        ScheduledFuture f = se.scheduleAtFixedRate(() -> System.out.println(LocalTime.now()),3, 1, TimeUnit.SECONDS);

        try {
            LocalTime t = (LocalTime) f.get();
//            DateTimeFormatter ff = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
//            System.out.println(t.format(ff));
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            if (se != null) {
                se.shutdown();
            }
        }

    }

}
