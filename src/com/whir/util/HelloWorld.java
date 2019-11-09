package com.whir.util;

/**
 * @description: this is a class to test programer rules
 * @author: zhangtf
 * @create: 2019-07-08 17:56
 */
public class HelloWorld {
    public static void main(String[] args){
        String s = "hello world";
        System.out.println(s);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("huang").append("huang").append("huang").append("huang").append("huang").append("huang")
            .append("huang")
            .append("huang")
            .append("huang");
        System.out.println(stringBuilder.toString());
    }
    /**
     * @param userId
     * @param age
     * @return String
     */
    public String run(String userId, int age){
        String s = userId;
        int length = age;

        return userId;
    }
}
