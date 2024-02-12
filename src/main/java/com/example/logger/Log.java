package com.example.logger;

public class Log {
    public static void debug(String str) {
        System.out.println(str);
    }
    public static void error(String str) {
        System.err.println(str);
    }
}
