/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OCA;

import static ch1.StaticNestedClasseTest.Inner2;
import ch1.StaticNestedClasseTest;

/**
 *
 * @author Michael
 */
class Dolls {

    public void nested() {
        nested(2, true);
    } // g1

    public int nested(int level, boolean height) {
        return nested(level);
    }

    public int nested(int level) {
        return level + 1;
    }

    ; // g2
    ;;
    ;;;;
    
public static void main(String[] outOfTheBox) {
        System.out.print("M");
    }
}

class Test {

    static public void testparam(char c) {

    }

    public static void min(double a, int b) {
        int plan = 1;
        plan = plan++ + --plan;
        System.out.println("plan:" + plan);
        int[] vars4[], space[][];
        System.out.println("mich");
        System.out.println("abc".contains("b"));
        StringBuilder sp = new StringBuilder("Animal");
        sp.insert(6, "m");
        System.out.println(sp.subSequence(0, 2));
        System.out.println(sp);
//        System.out.println("double,int");
//        int T[] = new int[5];
//        int T1[][] = {{0, 1}, {3, 4, 5}};
//        int T2[][] = new int[][]{{0, 1}, {3, 4, 5}};
//        int T3[];
//        T = new int[]{0, 1};
//        int T4[];
//
//        int[] multiArr[][];
//        multiArr = new int[2][][];
//        short x = 10;
//        short y = 3;
//
//        int yy = 10;
//        int xx = (yy > 5) ? (2 * yy) : (3 * yy);
    }

//    public static void min(int a, int b) {
//        System.out.println("int,int");
//    }
    public static void main(String[] args) {
        min(1, 2);
//        Integer x=1;
//        x.intValue();
//        Integer y=Integer.decode("1");
//        long l=323432433;
//        char c='s';
//        
//        
//        byte b='s';
//        
//        int in='s';
//        in=c;
//        long ll='s';
//        float fff=122.3f;
//        double lll=2323.23;

    }
//    public static void main(String[] args) {
////        Test t = new B();
//////        t.hello();
////
////        int i = 3;
////        float f = 5;
////
////        double xxx = 39.21;
////        float yxx = 2.1F;
////
////        short a = 14;
////        float b = 13;
////        double z = 30;
////        z = b;
////        //b=z;
////
////        //int l=3.4;
////        char c = 1;
////        byte bb = 1;
////        short sh = 1;
////        int ii = 1;
////        long ll = 1;
////        z = ii;
////        z = ll;
////
////        ll = ii;
////
////        b = i;
////
////        z = b;
////        int x = 3;
////        int y = ++x * 5 / x-- + --x;
//////        System.out.println("x is " + x);//2
//////        System.out.println("y is " + y);//7
////
////        int[] numbers = {3, 2, 1};
////        System.out.println("abcdef".replace("ab", "michael").contains("me"));
////        if (true) {
////            System.out.println(i);
////        }
////        Test t = new Test();
//////        System.out.println(m);
//////        System.out.println(t.m);
//////        A aaa = new A();
//////        aaa.createObj();
////        byte s = 1;
////        //System.out.println(aaa.m);
////        fly(new Long(3));
////        fly(4L);
////        fly(5);
////
//////        float value1 = 102;
//////        float value2 = (int) 102.0;
//////        float value3 = 1f * 0.0;
//////        float value4 = 1f * (short) 0.0;
//////        float value5 = 1f * (boolean) 0;
////        System.out.println("000000000000000000000000000");
////        //Employee eee = new Employee();
////        Manager mmm = new Manager();
////        A aaa =new B();
////        B bbb=new B();
////        bbb.createObj();
//        
//    }

    private void hello() {
        System.out.println("a:Hello");

    }
    private static String m = "michael";

    public static void fly(Integer l) {
        System.out.println("In " + l);
    }

    public static void fly(long l) {
        System.out.println("lo " + l);
    }
}

class A {

    public int MM;
    public int M;

    public A() {
        MM = 3;
    }

    public A(int mm) {
        this(mm, 1);
        MM = mm;
    }

    public A(int mm, int m) {
        MM = mm;
        M = m;
    }

    private void createObj() {
        A a = new A(1);
//        System.out.println(a.m);
//        System.out.println(m);
        System.out.println("A");
    }

    private String m = "michael2";

}

class B extends A {

    public void hello() {
        System.out.println("b:hello");
    }

    public void createObj() {

//        System.out.println(a.m);
//        System.out.println(m);
        System.out.println("B");
    }
}

class InitializationOrderSimple {

    private String name = "Torchie";

    {
        System.out.println(name);
    }

    private static int COUNT = 0;

    static {
        System.out.println(COUNT);
    }

    static {
        COUNT += 10;
        System.out.println(COUNT);
    }

    public InitializationOrderSimple() {
        System.out.println("constructor");
    }
}

class YetMoreInitializationOrder {

    static {
        add(2);
    }

    static void add(int num) {
        System.out.print(num + " ");
    }

    YetMoreInitializationOrder() {
        add(5);
    }

    static {
        add(4);
    }

    {
        add(6);
    }

    static {
        new YetMoreInitializationOrder();
    }

    {
        add(8);
    }

    public static void main(String[] args) {
        //Inner in=new Inner();
        Inner2 in2 = new Inner2();
        StaticNestedClasseTest st = new StaticNestedClasseTest();
        StaticNestedClasseTest.Inner in = st.new Inner();
        StaticNestedClasseTest.Inner2 in3 = new StaticNestedClasseTest.Inner2();
    }
}
