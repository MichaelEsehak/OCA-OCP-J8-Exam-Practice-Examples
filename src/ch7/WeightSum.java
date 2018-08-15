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
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

/**
 *
 * @author Michael
 */
public class WeightSum extends RecursiveTask {

    private Integer[] weights;
    private int start;
    private int end;

    public WeightSum(Integer[] weights, int start, int end) {
        this.weights = weights;
        this.start = start;
        this.end = end;

    }

    protected Integer compute() {
        int size = end - start;
        int middle = start + (size / 2);
        if (size <= 3) {
            int sum = 0;
            for (int i = start; i < end; i++) {
                weights[i] = new Random().nextInt(2);
                System.out.println(weights[i]);

                sum += weights[i];

            }
            return sum;
        } else {
            System.out.println("[start=" + start + ",middle=" + middle + ",end=" + end + "]");
//            RecursiveTask<Integer> t=new WeightSum(weights,start,middle);
//            t.fork();
//            
//            return new WeightSum(weights,middle,end).compute()+t.join();

//            RecursiveTask<Integer> t = new WeightSum(weights, start, middle);
//            t.fork();
//            RecursiveTask<Integer> t2 = new WeightSum(weights, middle, end);
//            t2.fork();
//            return t2.join() + t.join();
//            RecursiveTask<Integer> t=new WeightSum(weights,start,middle);
//            t.fork();
//            int x=t.join();
//            return x+new WeightSum(weights,middle,end).compute();
            int y = new WeightSum(weights, start, middle).compute();
            
            int x = new WeightSum(weights, middle, end).compute();
            return x + y;
        }
    }

    public static void main(String[] args) {
        Integer[] weights = new Integer[10];
        RecursiveTask r = new WeightSum(weights, 0, weights.length);
        ForkJoinPool fjp = new ForkJoinPool();
        System.out.println("Total:" + fjp.invoke(r));
        System.out.println("Result");
        Arrays.asList(weights).stream().forEach(System.out::print);
    }
}
