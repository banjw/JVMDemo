package com.learn.demo.jvm;

public class RuntimeMemoryDemo {
    public static void main(String[] args) {
        long totalMemory = Runtime.getRuntime().totalMemory();
        long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.println("totalMemory(-Xms)"+totalMemory+"字节"+(totalMemory/1024/1024)+"MB");
        System.out.println("maxMemory(-Xmx)"+maxMemory+"字节"+(maxMemory/1024/1024)+"MB");
    }
}
