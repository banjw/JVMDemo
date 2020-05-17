package com.learn.demo.jvm.oom;

import java.util.ArrayList;
import java.util.List;

public class GCOverHeadDemo {
    /**
     * 设置MaxDirectMemorySize堆内存为5M
     * -Xms10m -Xmx10m -XX:+PrintGCDetails -XX:MaxDirectMemorySize=5
     * @param args
     */
    public static void main(String[] args) {
        int i = 0;
        List<String> list = new ArrayList<>();
        try {
         while (true){//java.lang.OutOfMemoryError: GC overhead limit exceeded
            list.add(String.valueOf(++i));
         }
        } catch (Throwable e) {
            System.out.println("=======================i:"+i);
            e.printStackTrace();
            throw e;
        }
    }
}
