package com.caelum.string;

public class MainStringB {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("guilherme");

        System.out.println(sb.indexOf("e"));
        System.out.println(sb.lastIndexOf("e"));
        System.out.println(sb.indexOf("e") + sb.lastIndexOf("e"));

        System.out.println("----------");

        System.out.println(sb.indexOf("k"));
        System.out.println(sb.lastIndexOf("k"));
        System.out.println(sb.indexOf("k") + sb.lastIndexOf("k"));

        System.out.println("----------");
        
        sb.delete(2, 3);
        System.out.println(sb);
    }

}
