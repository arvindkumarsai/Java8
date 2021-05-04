package com.karan.practice.practice.algorithems.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class StringTokenizerTest {

    public static void main(String[] args) {

        String str = "1,2,3";

        StringTokenizer st = new StringTokenizer(str, ",");

        List<Integer> list = new ArrayList<>();

        while (st.hasMoreElements()) {
            list.add(Integer.parseInt((String) st.nextElement()));
        }

        List<String> s = Arrays.asList(str.split(","));

        int su = s.stream().mapToInt(i -> Integer.parseInt(i)).sum();

        int ss1 = Arrays.asList(str.split(",")).stream().mapToInt(i -> Integer.parseInt(i)).sum();

        System.out.println(s);

        System.out.println(su);
        System.out.println(ss1);

        Integer a[] = {15, 2, 5, 4, 7, 8, 1};
        Optional<Integer> min = Arrays.asList(a).stream().min(Integer::compareTo);

        System.out.println("Min -> " + Arrays.asList(a).stream().min(Integer::compare));
        System.out.println("Max -> " + Arrays.asList(a).stream().max(Integer::compare));
        System.out.println("Sum -> " + Arrays.asList(a).stream().mapToInt(i -> i).sum());

        Arrays.asList(a).stream().filter((i) -> (i % 2 == 0)).forEach((i) -> System.out.print(i + " "));
        System.out.println("\nEven");
        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8).stream().filter(i -> (i % 2 == 0)).map(i -> i * 5).forEach((i) -> System.out.print(i + " "));
        System.out.println("\nOdd");
        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8).stream().filter(i -> (i % 2 == 1)).forEach((i) -> System.out.print(i + " "));
        System.out.println("\nSum");
        int sum1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8).stream().mapToInt(i -> i).sum();

        Optional <Integer> q = Arrays.asList(1,2,3).stream().reduce( (c,b) ->  c*b);
        System.out.println(q);

        Arrays.asList(a).stream().forEachOrdered((n) -> System.out.print(n + " "));
        System.out.println("\nList even numbers:   " + Arrays.asList(1,2,3,4,5,6,7,8).stream().filter(i -> (i%2 ==0)).collect(Collectors.toList()));


    }
}
