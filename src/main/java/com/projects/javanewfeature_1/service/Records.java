package com.projects.javanewfeature_1.service;

public class Records {

    // JAVA 14
    record Person(String firstName, String LastName) {};

    public static void main(String[] args) {

        Person person = new Person("John","Harrie");

        System.out.println(person.firstName);

    }
}
