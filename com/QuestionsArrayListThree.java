package com;

import java.util.List;
import java.util.ArrayList;


public class QuestionsArrayListThree {
    
    public static void main(String[] args){

        List list = new ArrayList();
        list.add("Teste");

        List<Object> list2 = new ArrayList<>();
        list2.add("String");
        list2.add(9);
        list2.add(new StringBuilder("StringBuilder"));
        list2.add(Boolean.TRUE);
        
        System.out.println(list);
        System.out.println(list2);
    }   
}
