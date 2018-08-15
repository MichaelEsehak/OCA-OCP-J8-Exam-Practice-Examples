/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Michael
 */
public class Test {

    public static void main(String[] args) {
        List<B> a = new ArrayList<>();
        method3(a);
    }

    public static <M extends A> M method3(List<M> list) {
        //return new B(); // DOES NOT COMPILE
        return list.get(0);
    }

    public static <T> T method1(List<? extends T> list) {
        return list.get(0);
    }
}

class A {
}

class B extends A {
}

class C extends B {
}
