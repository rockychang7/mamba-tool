package com.mamba.core.collection;

import com.google.common.collect.Lists;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author JoeBig7
 * @date 2021/11/11 19:01:01
 * @description 集合工具类
 */
public class CollectionsUtils {

    /**
     * 判断集合是否是null对象或者是否没有元素
     *
     * @param collection
     * @return
     */
    public static boolean isEmpty(Collection collection) {
        return Objects.isNull(collection) || collection.isEmpty();
    }

    /**
     * 将List<String>转换成String[]
     *
     * @param list
     * @return
     */
    public static String[] toStringArray(List<String> list) {
        if (isEmpty(list)) {
            return new String[]{};
        }

        String[] strArray = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArray[i] = list.get(i);
        }
        return strArray;
    }


    public static boolean isSame(Collection var1, Collection var2) {
        if (isEmpty(var1) || isEmpty(var2)) {
            return false;
        }

        if (var1.size() != var2.size()) {
            return false;
        }

        Iterator iterator = var1.iterator();

        while (iterator.hasNext()){
            Object ele = iterator.next();
            if(!var2.contains(ele)){
               return false;
            }
        }
        return true;
    }
}
