/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OCA;

/**
 *
 * @author Michael
 */
public class InterfaceTest extends Test3 implements Test1 {

//    public void t1(){
//        System.out.println("overide");
//    }
    public static void main(String[] args) {

        new InterfaceTest().t1();
    }
}

abstract interface Test1 {

    public default void t1() {
        System.out.println("t1");
    }

}

interface Test2 {

    public default void t1() {
        System.out.println("test21");
    }
}

abstract class Test3 {

    public void t1() {
        System.out.println("abstract");
    }
}

