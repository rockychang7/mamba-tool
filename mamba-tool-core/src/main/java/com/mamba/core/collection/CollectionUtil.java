package com.mamba.core.collection;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @version 1.0
 * @author: JoeBig7
 * @date: 2019/5/27 14:28
 */
public final class CollectionUtil {

    /**
     * 判断collection是否不为null并且size大于0
     *
     * @param collection
     * @param <T>
     * @return
     */
    public static <T> boolean nonEmpty(Collection<T> collection) {
        return collection != null && collection.size() > 0;
    }

    public static void main(String[] args) {
        Map<String, String> map = Maps.newHashMap();
        List<String> list = Lists.newArrayList();
        System.out.println(nonEmpty(list));
    }

}