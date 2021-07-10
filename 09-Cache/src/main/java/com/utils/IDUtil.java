package com.utils;

import org.junit.jupiter.api.Test;

import java.util.UUID;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-07-06 14:57
 */
public class IDUtil {

    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    @Test
    public void test1(){
        System.out.println(IDUtil.getId());
        System.out.println(IDUtil.getId());
        System.out.println(IDUtil.getId());
        System.out.println(IDUtil.getId());
    }

}
