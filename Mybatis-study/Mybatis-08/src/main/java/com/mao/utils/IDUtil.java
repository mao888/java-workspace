package com.mao.utils;

import java.util.UUID;

public class IDUtil {
    public static String genId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
