package com.learn.demo.jvm;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceDemo {
    public static void main(String[] args) {
        Object obj = new Object();
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        PhantomReference<Object> phantomReference = new PhantomReference<>(obj, referenceQueue);
        System.out.println(obj);
        System.out.println(phantomReference.get());
        System.out.println(referenceQueue.poll());
        System.out.println("========================================");
        obj = null;
        System.gc();
        try {
            Thread.sleep(1000L);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(obj);
        System.out.println(phantomReference.get());
        System.out.println(referenceQueue.poll());
    }
}
