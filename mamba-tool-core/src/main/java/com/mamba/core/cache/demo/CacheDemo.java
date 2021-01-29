package com.mamba.core.cache.demo;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import java.time.Duration;
import java.util.concurrent.ExecutionException;

/**
 * @Author JoeBig7
 * @date 2021/1/28 17:39:38
 * @description use guava  build  in-memory cache  system
 */
public class CacheDemo {

    public static void main(String[] args) {

        //builder模式赋值
        Cache<String, String> cache = CacheBuilder.newBuilder()
                .initialCapacity(16)
                .maximumSize(100)
                .expireAfterAccess(Duration.ofSeconds(1))
                .build();


        cache.put("a", "1");

        System.out.println(cache.getIfPresent("a"));

        try {
            //如果cache中拿不到值就自定义一个
            String a = cache.get("b", () -> "test");

            System.out.println(a);

            System.out.println(cache.getIfPresent("b"));
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
