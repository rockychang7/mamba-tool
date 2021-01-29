package com.mamba.core.stream;

import com.google.common.collect.Lists;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author JoeBig7
 * @date 2021/1/29 11:48:22
 */
public class StreamDemo {

    public static void main(String[] args) {

        List<String> list = Lists.newArrayList("bb", "a", "cc");
        List<String> collect = list.stream().sorted(Comparator.comparing((a) -> a.length())).collect(Collectors.toList());

        System.out.println(collect);

    }
}
