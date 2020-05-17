package com.learn.demo.jvm.oom;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

class OOMTest{

}

public class MetaSpaceDemo {
    /**
     * 设置MaxMetaspaceSize内存为8M
     * -XX:MetaspaceSize=8m -XX:MaxMetaspaceSize=8m
     * @param args
     */
    public static void main(String[] args) {
        int i = 0;
        try {
            while (true){//java.lang.OutOfMemoryError: Metaspace
                i++;
                Enhancer enhancer = new Enhancer();
                enhancer.setSuperclass(OOMTest.class);
                enhancer.setUseCache(false);
                enhancer.setCallback(new MethodInterceptor() {
                    @Override
                    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                        return methodProxy.invokeSuper(o, args);
                    }
                });
                enhancer.create();
            }
        } catch (Exception e) {
            System.out.println("=============================i:"+i);
            e.printStackTrace();
        }
    }
}
