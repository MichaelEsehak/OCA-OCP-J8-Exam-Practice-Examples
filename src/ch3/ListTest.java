/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 *
 * @author Michael
 */
public class ListTest {

    public static void main(String[] args) {

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        System.out.println(queue.offer(1)); // true
        System.out.println(queue.offer(2)); // true
        System.out.println(queue.offer(3)); // true
        System.out.println(queue.add(4)); // true
        System.out.println(queue.add(5)); // true
        System.out.println(); // true
        //queue.push(5);
//        queue.push(5);
//        System.out.println(queue.peek());
//        System.out.println(queue.element());
//        
//        System.out.println(queue.poll());
//        System.out.println(queue.remove());

        for (Integer integer : queue) {
           // System.out.println(queue.remove());
        }
         System.out.println(queue.poll());
         System.out.println(queue.remove());
        //Integer [] list=(Integer[])queue.toArray();
        System.out.println(queue.toString());
//        System.out.println(queue.peek()); // 10
//        System.out.println(queue.poll()); // 10
//        System.out.println(queue.poll()); // 4
//        System.out.println(queue.peek()); // null

//        List<Person> list = new ArrayList<>();
//        Collection<String> c = new ArrayList<>();
//
//        
//        NavigableSet<Integer> set = new TreeSet<>();
//        for (int i = 1; i <= 20; i++) {
//            set.add(i);
//        }
//        System.out.println(set.lower(10)); // 9
//        System.out.println(set.floor(10)); // 10
//        System.out.println(set.ceiling(20)); // 20
//        System.out.println(set.higher(20)); // null        
//        List<Integer> l = new ArrayList<Integer>(Arrays.asList(3, 1, 4, 5));
//
//        
//        
//        //l.add(new Integer(1));
//        l.add(2);
//        Collections.sort(l);
//        l.remove(new Integer("10"));
//        for (Integer integer : l) {
//            System.out.println(integer);
//        }
//
//        System.out.println("Resutl:" + Collections.binarySearch(l, 8));
//        int[] arr = {3, 1, 4, 5};
//        Arrays.sort(arr);
//        for (int i : arr) {
//            System.out.println(i);
//        }
//
//        System.out.println("Resutl:" + Arrays.binarySearch(arr, 8));
        //l.remove(0);
//        for (int i = 0; i < l.size(); i++) {
//            System.out.print(l.get(i) + ",");
//
//        }
//        System.out.println("");
//        for (int i = 0; i < s.length; i++) {
//            System.out.print(s[i] + ",");
//
//        }
//        String[] s2 = (String[]) l.toArray();
////        System.out.println("0:"+s[0]);
////        System.out.println("s:"+s.length);
////        System.out.println("l:"+l.size());
//        System.out.println("");
//        for (int i = 0; i < s.length; i++) {
//            System.out.print(s2[i] + ",");
//
//        }
    }
}
