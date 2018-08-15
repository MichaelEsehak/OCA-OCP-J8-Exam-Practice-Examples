/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

/**
 *
 * @author Michael
 */
public class WeightCalculator extends RecursiveAction{
    
    private Integer[] weights;
    private int start;
    private int end;
    public WeightCalculator(Integer[] weights,int start, int end){
        this.weights=weights;
        this.start=start;
        this.end = end;
                
    }
    
    
    protected void compute(){
        int size =end-start;
        int middle = start+(size/2);
        if(size<=3){
            for (int i = start; i < end; i++) {
                weights[i]=new Random().nextInt(10);
                System.out.println(weights[i]);
            }
        }else{
            System.out.println("[start="+start+",middle="+middle+",end="+end+"]");
            invokeAll(new WeightCalculator(weights,start,middle),new WeightCalculator(weights, middle, end));
        }
    }
    public static void main(String[] args) {
        Integer[] weights=new Integer[10];
        RecursiveAction r=new WeightCalculator(weights, 0, weights.length);
        ForkJoinPool fjp=new ForkJoinPool();
        fjp.invoke(r);
        System.out.println("Result");
        Arrays.asList(weights).stream().forEach(System.out::print);
    }
}
