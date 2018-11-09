package com.jvm.jdk8;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by LENOVO on 2017/1/7.
 */
public class ComposedAndThen {

    public static void main(String[] args) {
        ComposedAndThen cat = new ComposedAndThen();
        int compute = cat.compute(3, value -> 3 * value, value -> value * value);//27
        int compute2 = cat.compute2(5, value -> 3 * value, value -> value * value);//225
        int compute4 = cat.compute4(2, 3, (value1, value2) -> value1 + value2, value -> value * value * 10);
        System.out.println("第一个个值是： " + compute + "第二个值是 ：" + compute2 + "第三个值是 ：" + compute4);

    }

    public int compute(int a, Function<Integer, Integer> function1, Function<Integer, Integer> function2) {
        return function1.compose(function2).apply(a);
    }

    public int compute2(int a, Function<Integer, Integer> function1, Function<Integer, Integer> function2) {
        return function1.andThen(function2).apply(a);
    }

    public int compute4(int a, int b, BiFunction<Integer, Integer, Integer> bi, Function<Integer, Integer> function) {

        return bi.andThen(function).apply(a, b);
    }

}
