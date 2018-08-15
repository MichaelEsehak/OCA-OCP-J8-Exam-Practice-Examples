/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1;

import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

/**
 *
 * @author Michael
 */
public class InnerClassTest {

//    public static void main(String[] args) {
//        OuterClass o = new OuterClass();
//        OuterClass.InnerClass inner = o.new InnerClass();
//        inner.setName("michael");
////        System.out.println(inner.getName());
//
//        OuterClass.Secret s = o.getSecret();
//        s.shh();
//
//    }
}

class OuterClass {
    
    private String name;
    int x = -1;
    
    interface Secret {
        
        public void shh();
    }
    
    public Secret getSecret() {
        
        return new DontTell();
    }
    
    private class DontTell implements Secret {
        
        int x = 1;
        OuterClass.Secret s = new OuterClass.Secret() {
            @Override
            public void shh() {
                System.out.println("dontTell");
            }
        };
        
        @Override
        public void shh() {
            final int x = 2;
            int y = 10;
            OuterClass.Secret s = new OuterClass.Secret() {
                @Override
                public void shh() {
                    System.out.println("shh-dont");
                }
            };
            class Test {
                
                OuterClass.Secret s = () -> {
                    System.out.println("test-shh-dont");
                };
//                int x = 3;
//                int y = 9;

                public void print() {
                    int x = 4;
                    //int y = 11;
                    //System.out.println("Test Print x:" + y);
                    //System.out.println("Test Print x:" + Test.this.y);
                    //OuterClass.this.shh2();
                    OuterClass.Secret s = () -> System.out.println("test-print-anno");
                    
                    this.s.shh();
                    
                }
            }
            new Test().print();
            
        }
        
        public void shh2() {
            Button b = new Button();
            
            b.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    System.out.print("mi");
                }
            });
             b.addActionListener((ActionEvent ae) -> {
                 System.out.print("mi");
            });
        }
        
    }
    
    public void shh2() {
        System.out.println("mmmouter");
    }
    
    class InnerClass {
        
        private String name;
        
        public InnerClass() {
//            System.out.println("Name:" + name);
        }
        
        public void setName(String aname) {
            OuterClass.this.name = aname;
            
        }
        
        public String getName() {
            return this.name;
        }
        
    }
}
