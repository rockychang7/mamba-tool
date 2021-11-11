package com.mamba.core.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

/**
 * @Author JoeBig7
 * @date 2021/11/11 19:01:01
 * @description 集合工具类
 */
public class CollectionsUtils<T> {

    /**
     * 判断集合是否是null对象或者是否没有元素
     *
     * @param collection
     * @return
     */
    public static boolean isEmpty(Collection collection) {
        if (!Objects.isNull(collection) && !collection.isEmpty()) {
            return false;
        }
        return true;
    }
}
