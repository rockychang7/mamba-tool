package com.mamba.core.clazz;

import java.lang.reflect.Field;

/**
 * @Author JoeBig7
 * @date 2021/11/25 11:30:36
 * @description 通过反射操作类
 */
public class ClassUtils {

    /**
     * 通过Class设置object属性值
     *
     * @param obj
     * @param clazz
     * @param fieldName
     * @param value
     * @return
     */
    public static void setField(Object obj, Class clazz, String fieldName, Object value) throws NoSuchFieldException {
        try {
            Field field = clazz.getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(obj, value);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }


    /**
     * 根据Class获取属性值
     *
     * @param obj
     * @param fieldName
     * @return
     */
    public static Object getField(Object obj, String fieldName) {
        try {
            Field field = obj.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.get(obj);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
