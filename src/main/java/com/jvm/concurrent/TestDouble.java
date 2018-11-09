package com.jvm.concurrent;

/**
 * Created by a0285 on 2018/7/11.
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class TestDouble {

    public static void main(String[] args) {

        List<String> teamEngland = Arrays.asList("Alex", "Bell", "Broad");
        List<String> teamNewZeland = Arrays.asList("Kane", "Nathan", "Vettori");


        List<String> collect = Stream.of(teamEngland, teamNewZeland).flatMap(itemList -> itemList.stream()).collect(Collectors.toList());

        collect.forEach(item->{
            System.out.println(item);
        });





    }
}
