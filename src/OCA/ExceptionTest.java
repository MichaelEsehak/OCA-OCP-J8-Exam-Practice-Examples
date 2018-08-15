/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OCA;

import java.io.FileNotFoundException;

/**
 *
 * @author Michael
 */
public class ExceptionTest {
    public static void main(String[] args) {
        try{
            test();
        }catch(E3 e){
            System.out.println("R3");
        }catch (E2 e){
            System.out.println("R2");
        }catch (E1 e){
            System.out.println("R1");
            char[]c = new char[2];
            
        }
    }
    public static void test ()throws E2{
        E2 r=new E3();
        throw r;
    }
}


class E1 extends Exception{
    
}
class E2 extends E1{
    
}
class E3 extends E2{
    
}

class R1 extends RuntimeException{
    
}
class R2 extends R1{
    
}