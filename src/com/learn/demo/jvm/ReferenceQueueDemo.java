package com.learn.demo.jvm;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class ReferenceQueueDemo {
    public static void main(String[] args) {
        Object obj = new Object();
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        WeakReference<Object> weakReference = new WeakReference<>(obj, referenceQueue);
        System.out.println(obj);
        System.out.println(weakReference.get());
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
        System.out.println(weakReference.get());
        System.out.println(referenceQueue.poll());
    }
}
