package com.learn.demo.jvm;

import java.lang.ref.SoftReference;

public class SoftReferenceDemo {
    static void softReferenceEnough(){
        Object obj1 = new Object();
        SoftReference<Object> softReference = new SoftReference<>(obj1);
        System.out.println(obj1);
        System.out.println(softReference.get());

        obj1 = null;
        System.gc();

        System.out.println(obj1);
        System.out.println(softReference.get());
    }

    /**
     * JVM配置，故意产生大对象并配置小内存，让OOM出现，来看看软引用的回收情况
     * -Xms5m -Xmx5m -XX:+PrintGCDetails
     */
    static void softReferenceNotEnough(){
        Object obj1 = new Object();
        SoftReference<Object> softReference = new SoftReference<>(obj1);
        System.out.println(obj1);
        System.out.println(softReference.get());

        obj1 = null;
        System.gc();
        try {
            byte[] bytes = new byte[30*1024*1024];
        } catch (Exception e) {

        } finally {
            System.out.println(obj1);
            System.out.println(softReference.get());
        }
    }

    public static void main(String[] args) {
//        softReferenceEnough();
        softReferenceNotEnough();
    }
}
