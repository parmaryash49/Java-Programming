package com.company;

public class StringMethods {
    public static void main(String[] args) {
//        String methods
        String str="My name is yash name          ";
        String s="kamesh";
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
        System.out.println(str.substring(3));
        System.out.println(str.substring(3,7));
        System.out.println(str.replace("yash","kamesh"));
        System.out.println(str.startsWith("My"));
        System.out.println(str.endsWith("My"));
        System.out.println(str.charAt(5));
        System.out.println(str.indexOf("name"));
        System.out.println(str.indexOf("name",7));
        System.out.println(str.lastIndexOf("name"));
        System.out.println(s.equals("kameshh"));
        System.out.println(s.equalsIgnoreCase("KAMESH"));
    }
}
