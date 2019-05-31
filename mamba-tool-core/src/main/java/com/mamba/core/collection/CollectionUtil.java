package com.mamba.core.collection;

import java.util.Collection;

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
}