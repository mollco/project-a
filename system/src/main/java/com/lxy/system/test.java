package com.lxy.system;

import org.springframework.util.StringUtils;

public class test {
    public static void main(String[] args) {
        String a = "nihjcbdkjs_20240988_22222";
        int first=a.indexOf('_');
        int second=a.indexOf('_',first+1);
        System.out.println(a.substring(first+1,second));
    }
}
