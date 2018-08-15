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

 class Test {

//    public static void main(String[] args) {
//
//        //new Employee().setId(Integer.SIZE);
//    }

}

interface Michael {

    public int ID = 1;

    static int getJumpHeight() {
        return ID;
    }
}

class NoMoreCarrotsException extends Exception {
}

class Bunny {

//    public static void main(String[] args) throws NoMoreCarrotsException {
//        eatCarrot();// DOES NOT COMPILE
//    }

    private static void eatCarrot() throws NullPointerException {
    }

    public void bad() {
        try {
            eatCarrot();
        } catch (NullPointerException e) {// DOES NOT COMPILE
            System.out.print("sad rabbit");
        }
    }
}
