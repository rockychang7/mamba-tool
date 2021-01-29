package com.mamba.core.collection.demo;

import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import java.util.Collections;
import java.util.List;

/**
 * @Author JoeBig7
 * @date 2021/1/28 18:25:46
 */
public class CollectDemo {

    public static void main(String[] args) {

        List<String> list = Lists.newArrayList("a", "b", "c");

        List<String> jdkList = Collections.unmodifiableList(list);
        List<String> guavaList = ImmutableList.copyOf(list);
//        jdkList.add("d");
//        guavaList.add("d");
          list.add("d");

        System.out.println(jdkList);
        System.out.println(guavaList);
    }
}
