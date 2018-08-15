/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OCA;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Michael
 */
public class ThreadTest extends Thread {

//    public static void main(String[] args) throws InterruptedException {
//        Bank b = new Bank();
//        System.out.println("Intial balance:" + b.getTotalBalance());
//
//        //MyRunnable r2 = new MyRunnable("R2", b);
//        for (int i = 0;i<130; i++) {
//            MyRunnable r1 = new MyRunnable("R1", b);
//
//            Thread t1 = new Thread(r1);
//            //Thread t2 = new Thread(r2);
//            t1.start();
//        }
//        //t2.start();
//        //System.out.println("Final balance:" + b.getTotalBalance());
//
//        //ThreadTest t3 = new ThreadTest();
//        //t3.sleep(100);
//        //System.out.println(t1.getState());
//    }

    public ThreadTest() {
        // start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 12; i++) {
            System.out.println("T3" + ":" + i);
        }
    }

}

class MyRunnable implements Runnable {

    private String name;
    private Bank b;

    public MyRunnable(String name, Bank b) {
        this.b = b;
        this.name = name;
    }

    @Override
    public void run() {

        try {
            b.transfer((int) (Math.random()* 10), (int) (Math.random() * 10), (int) (Math.random() * 100));
        } catch (InterruptedException ex) {
            Logger.getLogger(MyRunnable.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}




class Bank {

    int[] accounts = new int[10];
    private Lock lock = new ReentrantLock();
    private Condition sufficientFunds=lock.newCondition();
    

    public Bank() {
        for (int i = 0; i < 10; i++) {
            accounts[i] = 100;
        }
    }

    public void transfer(int from, int to, int amount) throws InterruptedException {
        lock.lock();
        System.out.println("from:" + from + " FromAmount:" + accounts[from] + " Amount:" + amount);

        try {
            if (accounts[from] < amount) {
                System.out.println("wait");
                sufficientFunds.await();
            }
                accounts[from] -= amount;
                Thread.sleep(500);
                accounts[to] += amount;
                System.out.println("Total P:"+getTotalBalance());
                sufficientFunds.signalAll();
            
        } finally {
            lock.unlock();
        }
    }

    public int getTotalBalance() {
        int total = 0;
        for (int account : accounts) {
            total += account;
        }
        return total;
    }

}
