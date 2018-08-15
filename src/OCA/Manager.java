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
public class Manager extends Employee {

    boolean isManager;

    public Manager() {
        this("michael", 1, true);
        System.out.println("Man no args");
    }

    public Manager(String name, Integer id, boolean isManager) {
        super(name, id);
        System.out.println("Man 3 args");
        this.isManager = isManager;
    }

    public boolean isIsManager() {
        return isManager;
    }
}
