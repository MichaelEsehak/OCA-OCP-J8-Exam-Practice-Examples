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
class Algorithm<T extends Comparable> {

    public Pair<T> getMinMax(T[] list) {

        T min = list[0];
        T max = list[0];
        for (T integer : list) {
            if (integer.compareTo(min) == -1) {
                min = integer;
            }
            if (integer.compareTo(max) == 1) {
                max = integer;
            }
        }
        return new Pair<>(min, max);
    }

    public <T extends Comparable> int middle(T[] list, T var) {
        for (int i = 0; i < list.length; i++) {
            T t = list[i];
            if (t.compareTo(var) == 0) {
                return i;
            }

        }
        return -1;
        //return list[list.length/2];
    }

    public <T extends Employee> T at(T[] list, int index) {

        return list[index];
        //return list[list.length/2];
    }
}
