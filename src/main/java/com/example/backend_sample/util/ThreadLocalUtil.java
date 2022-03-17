package com.example.backend_sample.util;

import java.util.UUID;

public class ThreadLocalUtil {
    public static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void createUUID() {
        threadLocal.set(UUID.randomUUID().toString());
    }

    public static void deleteUUID() {
        threadLocal.remove();
    }

    public static String getUUID() {
        return threadLocal.get();
    }
}
