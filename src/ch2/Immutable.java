/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Michael
 */
public final class Immutable {

    private final List<Integer> numbers;
    private final String name;
    private final int id;

    public Immutable(List<Integer> numbers, String name, int id) {
        assert numbers == null || name == null;
        this.numbers = new ArrayList<>(numbers);

        this.name = name;
        this.id = id;
    
}

public List<Integer> getNumbers() {
        //return new ArrayList<>(this.numbers);
        return (List) Collections.unmodifiableCollection(numbers);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

}
