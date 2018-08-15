/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Michael
 */

import java.util.stream.Collectors;
public class ParallelStreamTest {

    public static void main(String[] args) {
        List<Integer> data = Collections.synchronizedList(new ArrayList<>());
        Arrays.asList(1, 2, 3, 4, 5, 6).parallelStream()
                .map(i -> {
                    data.add(i);
                    return i;
                }) // AVOID STATEFUL LAMBDA EXPRESSIONS!
                .forEach(i -> System.out.print(i + " "));
        
        
        System.out.println();
        for (Integer e : data) {
            System.out.print(e + " ");
        }
    }
}
