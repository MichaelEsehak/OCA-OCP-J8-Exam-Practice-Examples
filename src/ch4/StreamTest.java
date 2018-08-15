/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4;

/**
 *
 * @author Michael
 */
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {
        Stream<String> empty = Stream.empty(); // count = 0
        Stream<Integer> singleElement = Stream.of(1); // count = 1
        Stream<Integer> fromArray = Stream.of(1, 2, 3); // count = 2
        //System.out.println(fromArray.count());

        Integer[] arr1 = {1, 2, 3, 4, 5};
        String[] arr2 = {"1", "2", "3", "4", "5"};
        List<Integer> l1 = Arrays.asList(arr1);
        List<String> l2 = Arrays.asList(arr2);
        Stream<Integer> s1 = l1.stream();
        Stream<String> s2 = l2.stream();
        Stream<String> s3 = Stream.of("1", "2", "3", "5", "4", "4");

        //StringBuilder bb = s3.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        //List<String> bb = s3.collect(Collectors.toCollection(ArrayList::new));
        //s3.filter((a)-> {int x=Integer.parseInt(a);return x>1;}).forEach(System.out::println);
        //ArrayList<Integer> intarr = s3.map(x -> Integer.parseInt(x) + 1).skip(1).limit(5).filter(x -> x > 3).distinct().sorted(StreamTest::CustomCompare).peek(System.out::println).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        //  System.out.println(intarr);
        //List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
        //list.stream().filter(x->x.length()==4).limit(2).forEach(System.out::println);
        //System.out.println(bb.toString());
        Stream<Integer> ss = Stream.of(1, 2, 3, 4, 5);
//        IntStream is = ss.mapToInt(b -> b);
//        IntSummaryStatistics stats = is.summaryStatistics();
//           Map<Integer, List<Integer>> map = ss.collect(Collectors.toMap(x -> x.toString().length(), y->Arrays.asList(y),(a,b)->a+b));
        Map<Integer, List<Integer>> map = ss.collect(Collectors.toMap(k -> k.toString().length(), v -> Arrays.<Integer>asList(v), (s5, s6) -> {
            List<Integer> s8 = new ArrayList<>();
            s8.addAll(s5);
            s8.addAll(s6);

            return s8;
        }));
        System.out.println(map.toString());
//
//        List l = new ArrayList(Arrays.asList(1));
//        System.out.println(l);

        //System.out.println(is.count());
        //is.forEach(System.out::println);
        // Optional<String> oo=Optional.of("2");
        //oo.map(x->x+2).filter(x->x>2).ifPresent(System.out::println);
        //oo.map(x->x+"").map(StreamTest::calculator).ifPresent(System.out::println);
        //Optional<Optional<Integer>> result = oo.map(StreamTest::calculator); // DOES NOT COMPILE
        //System.out.println(result);
        //System.out.println(oo.get());
        //int count=(int)(s2.count());
        //System.out.println("i:"+count);
        //System.out.println(s1.max(Integer::compareTo));
        //System.out.println(s1.reduce((a,b)->a*b));
        //s1.reduce((a,b)->a*b).ifPresent(System.out::println);
        Integer x = 2;
        //System.out.println(s1.reduce(2,(a,b)->a*b));
        //System.out.println(s2.max((a,b)->a.length()-b.length()));
        //s2.max((a,b)->a.length()-b.length()).ifPresent(System.out::println);
        //s2.findAny().ifPresent(System.out::println);
        //System.out.println(s2.allMatch((x)->Character.isDigit(x.charAt(0))));
        //s2.forEach(System.out::println);
        String output = "";
        //s2.reduce((a,b)->a+b).ifPresent(System.out::println);
//        System.out.println(s2.reduce(output, String::concat));
//        System.out.println(output);

        //s2.forEach(System.out::println);
    }

    static Optional<Integer> calculator(String s) {
        return Optional.of(s.length());
    }

    public static int CustomCompare(Integer x, Integer y) {
        return x.compareTo(y);
    }
}
