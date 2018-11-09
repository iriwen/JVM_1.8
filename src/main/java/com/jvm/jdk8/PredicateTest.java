package com.jvm.jdk8;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by LENOVO on 2017/1/8.
 */
public class PredicateTest {

    public static void main(String[] args) {
        PredicateTest pt = new PredicateTest();

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        pt.getEvenNumber(nums, numItem -> numItem % 2 == 0);

    }

    public void getEvenNumber(List<Integer> list, Predicate<Integer> pre) {
        for (Integer item : list) {
            if (pre.test(item)) {
                System.out.println(item);
            }
        }
    }

}
