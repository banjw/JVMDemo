package com.learn.demo.jvm.oom;

public class JavaHeapSpaceDemo {
    /**
     * 设置堆内存为5M
     * -Xms5m -Xmx5m
     * @param args
     */
    public static void main(String[] args) {
        String str = "JavaHeapSpace Test";
        while (true){
            str+=str;//java.lang.OutOfMemoryError: Java heap space
        }
    }
}
