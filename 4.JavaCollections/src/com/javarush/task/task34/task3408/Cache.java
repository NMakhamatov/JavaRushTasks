package com.javarush.task.task34.task3408;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.WeakHashMap;

public class Cache<K, V> {
    private Map<K, V> cache = new WeakHashMap<>();

    public V getByKey(K key, Class<V> clazz) throws Exception {
        V result = cache.get(key);

        if (result == null) {
            Constructor<V> constructor = clazz.getConstructor(key.getClass());

            put(constructor.newInstance(key));
        }
        return cache.get(key);
    }

    public boolean put(V obj) throws Exception {
        try {
            Method method = obj.getClass().getDeclaredMethod("getKey");

            method.setAccessible(true);
            K key = (K) method.invoke(obj);
            cache.put(key, obj);

            return cache.containsKey(key);
        } catch (Exception e) {
            return false;
        }
    }

    public int size() {
        return cache.size();
    }
}
