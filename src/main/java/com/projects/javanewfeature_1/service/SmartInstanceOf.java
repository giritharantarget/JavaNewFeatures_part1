package com.projects.javanewfeature_1.service;

public class SmartInstanceOf {

    public static void main(String[] args) {

        instanceOf("Hello");

    }

    public static void instanceOf(Object input){


        if(input instanceof Integer){
            System.out.println("Integer value");
        }

        // SMART INSTANCE OF USAGE
        else if(input instanceof String str){
            int value = str.length();
            System.out.println("String value " + value);
        }

    }
}
