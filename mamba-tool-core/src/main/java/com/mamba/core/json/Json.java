package com.mamba.core.json;

/**
 * @version 1.0
 * @author: JoeBig7
 * @date: 2019/5/31 17:33
 */
public interface Json<T> {

    String toJson(Object object);

    T toObject(String var1);
}