package com.learn.demo.jvm.oom;

import java.nio.ByteBuffer;

public class DirectBufferMemoryDemo {
    /**
     * 设置MaxDirectMemorySize堆内存为5M
     * -Xms10m -Xmx10m -XX:+PrintGCDetails -XX:MaxDirectMemorySize=5
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Java默认的MaxDirectMemory(1/4主内存)："+sun.misc.VM.maxDirectMemory()/(1024*1024)+"MB");
        ByteBuffer.allocateDirect(6*1024*1024);//java.lang.OutOfMemoryError: Direct buffer memory
    }
}
