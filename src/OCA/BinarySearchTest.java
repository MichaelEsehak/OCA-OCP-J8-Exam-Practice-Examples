/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OCA;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Michael
 */
public class BinarySearchTest {

//    public static void main(String[] args) {
//
//        List<Integer> l = new ArrayList<>();
//        List<Employee> list = new ArrayList<>();
//
//        Employee e1 = new Employee("michael", 1);
//        Employee e2 = new Employee("beshoy", 2);
//        Employee e3 = new Employee("mina", 3);
//        Employee e4 = new Employee("nader", 4);
//
//        list.add(e1);
//        list.add(e2);
//        list.add(e3);
//        list.add(e4);
//
//        for (int i = 1; i <= 10; i++) {
//            l.add(i);
//        }
//
//        //System.out.println(l.size());
//        //System.out.println(binarySearchRec(l, 0, l.size(), 0));
//        System.out.println(binarySearch(list, e3));
//
//    }

    private static <T extends Comparable> int binarySearch(List<T> list, T target) {
        int start = 0;
        int end = list.size();

        while (end >= 0 && start < list.size()) {
            int middle = ((start + end) / 2);
            int direction = list.get(middle).compareTo(target);
            if (direction == 0) {
                return middle;
            } else if (direction > 0) {
                end = middle - 1;
            }
            start = middle + 1;

        }
        return -1;
    }

    private static int binarySearchRec(List<Integer> list, int start, int end, int target) {

        if (start > end || start >= list.size()) {
            return -1;
        }
        int middle = ((start + end) / 2);
        int direction = list.get(middle).compareTo(target);
        if (direction == 0) {
            return middle;
        } else if (direction > 0) {
            return binarySearchRec(list, 0, middle - 1, target);
        }
        return binarySearchRec(list, middle + 1, end, target);

    }

}
