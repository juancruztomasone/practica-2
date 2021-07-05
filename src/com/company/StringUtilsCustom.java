package com.company;

public class StringUtilsCustom extends java.lang.Object{


    public static String rpad(String s,char c,int n){
        int count = n;
        String add = "";

        while(count>=0){
            add = add + c;
        }
        s = s+add;

        System.out.println(s);
        return s;
    }

    public static String ltrim(String s){
        int i = s.length()-1;
        while (i >= 0 && Character.isWhitespace(s.charAt(i))) {
            i--;
        }
        String rtrim = s.substring(0,i+1);
        return rtrim;
    }

    public static String 1trim(String s){
        int i = s.length()-1;
        while (i >= 0 && Character.isWhitespace(s.charAt(i))) {
            i--;
        }
        String rtrim = s.substring(0,i+1);
        return rtrim;
    }

}
