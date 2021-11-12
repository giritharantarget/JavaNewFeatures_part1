package com.projects.javanewfeature_1.service;

public class TextBlock {

    public static void main(String[] args) {

        System.out.println(process("Sam"));

    }

    public static String process(String name){


        String result = """
                
                Hello  %s
                
                Hope everything goes good
                
                Take care
                
                """;
        return String.format(result,name);
    }
}
