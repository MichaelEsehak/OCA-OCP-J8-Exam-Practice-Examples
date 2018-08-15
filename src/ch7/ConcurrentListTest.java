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
import java.util.ArrayDeque;
import java.util.concurrent.ConcurrentMap;

import java.util.List;

import java.util.Set;
import java.util.NavigableSet;
import java.util.SortedSet;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

import java.util.concurrent.ConcurrentHashMap;

import java.util.Queue;
import java.util.Deque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ConcurrentLinkedDeque;

import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentListTest {

    public static void main(String[] args) {
        try {
            BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
            blockingQueue.offer(39);
            blockingQueue.offer(3, 4, TimeUnit.SECONDS);

            System.out.println(blockingQueue.poll());
            System.out.println(blockingQueue.poll(10, TimeUnit.MILLISECONDS));

            
            
            Deque<Integer> concurrentDeque=new ConcurrentLinkedDeque<>();
            BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>();
            blockingDeque.offer(91);
            blockingDeque.offerFirst(5, 2, TimeUnit.MINUTES);
            blockingDeque.offerLast(47, 100, TimeUnit.MICROSECONDS);
            blockingDeque.offer(3, 4, TimeUnit.SECONDS);
            System.out.println(blockingDeque.poll());
            System.out.println(blockingDeque.poll(950, TimeUnit.MILLISECONDS));
            System.out.println(blockingDeque.pollFirst(200, TimeUnit.NANOSECONDS));
            System.out.println(blockingDeque.pollLast(1, TimeUnit.SECONDS));
            
            
            

        } catch (InterruptedException e) {
// Handle interruption
        }
    }
}
