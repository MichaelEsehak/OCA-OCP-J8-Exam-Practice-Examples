/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1;

/**
 *
 * @author Michael
 */
public class StaticNestedClasseTest {

    public  class Inner {

        int id;

        public int getID() {
            return OClass.id;
        }
    }
    
     public static class Inner2 {

        int id;

        public int getID() {
            return OClass.id;
        }
    }
//
//    public static void main(String[] args) {
//        //System.out.println(OClass.id);
////        OClass.Inner in = new OClass.Inner();
////        in.id = 5;
////        System.out.println(in.id);
////        OClass.Inner in2 = new OClass.Inner();
////        System.out.println(in2.id);
//    }
}

class OClass {

    static int id = 1;

//    static class Inner {
//
//        int id;
//
//        public int getID() {
//            return OClass.id;
//        }
//    }
}
