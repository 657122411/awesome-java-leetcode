package com.blankj.study.temp;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * LIst<Integer>中保存String类型
 */
public class Test14 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            list.add(i);
        }

        // https://blog.csdn.net/sulaymanyf/article/details/82228527
        /*Method[] methods  = list.getClass().getMethods();
        for (Method method : methods) {
            if("add".equals(method.getName())){
                method.invoke(list,"字符串1");
            }
        }*/

        Method m = list.getClass().getDeclaredMethod("add", Object.class);
        m.invoke(list, "字符串2");


        System.out.println(list.toString());
    }
}
