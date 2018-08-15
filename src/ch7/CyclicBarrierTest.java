/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.CyclicBarrier;

/**
 *
 * @author Michael
 */
public class CyclicBarrierTest {
    
    private void remvoeLion(){
        System.out.println("remove line");
    }
    private void clean(){
        
        System.out.println("clean");
    }
    private void putAnimal(){
        System.out.println("put back");
    }
    
    public void perform(CyclicBarrier c1,CyclicBarrier c2){
        
        try{
        remvoeLion();
        c1.await();
        clean();
        c2.await();
        putAnimal();
        }catch(InterruptedException | BrokenBarrierException e){
            e.printStackTrace();
        }
            
    }
    public static void main(String[] args) {
        ExecutorService service=null;
        CyclicBarrierTest c=new CyclicBarrierTest();
        CyclicBarrier c1=new CyclicBarrier(2);
        CyclicBarrier c2=new CyclicBarrier(2,()->System.out.println("cleand"));
    try{
        service=Executors.newFixedThreadPool(4);
        
        for (int i = 0; i < 3; i++) {
            service.submit(()->c.perform(c1,c2));
        }
        
        
        
    }finally{
        if(service!=null){
            service.shutdown();
        }
    }
    }
    
}
