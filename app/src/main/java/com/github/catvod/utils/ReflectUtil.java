package com.github.catvod.utils;

import java.lang.reflect.Method;

public class ReflectUtil  {
    /**
     * @Description: 判断是否包含某个方法
     */
    public static Method getMethod(Object object, String methodName, Class<?> ... parameterTypes){
        Method method = null ;

        for(Class<?> clazz = object.getClass() ; clazz != Object.class ; clazz = clazz.getSuperclass()) {
            try {
                method = clazz.getMethod(methodName,parameterTypes) ;
                return method ;
            } catch (Exception e) {
                //这里甚么都不要做！并且这里的异常必须这样写，不能抛出去。
                //如果这里的异常打印或者往外抛，则就不会执行clazz = clazz.getSuperclass(),最后就不会进入到父类中了

            }
        }

        return null;
    }
}
