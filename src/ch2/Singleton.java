/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2;

import sun.security.jca.GetInstance;

/**
 *
 * @author Michael
 */
public class Singleton {

    private int id;
    private String name;
    private static final Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }

    private Singleton() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public synchronized void setId(int id) {
        this.id = id;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

}

final class Singleton2 {

    private String name;
    private int id;
    private static final Singleton2 instance;

    static {
        instance = new Singleton2();
    }
    public static Singleton2 getInstance()
    {
        return instance;
    }
    

    private Singleton2() {

    }
}

final class Singleton3 {

    private String name;
    private int id;
    private static Singleton3 instance;

    public static synchronized Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }

    private Singleton3() {

    }
}

class Singleton4 {

    private String name;
    private int id;
    public static volatile Singleton4 instance;

    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                instance = new Singleton4();
            }
        }
        return instance;
    }

    private Singleton4() {

    }
}
