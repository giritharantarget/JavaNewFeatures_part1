package com.projects.javanewfeature_1.service;

import java.time.DayOfWeek;
import java.util.stream.Stream;

public class SwitchExpression {

    public static void main(String[] args) {

        Stream.of(DayOfWeek.values())
                .forEach(DayOfWeek -> System.out.println(process(DayOfWeek)));

    }

    public static String process(DayOfWeek day) {

        return switch (day) {
            case MONDAY -> null;
            case WEDNESDAY -> null;
            case THURSDAY, TUESDAY -> "hello";

            //System.out.println(day);
            case FRIDAY -> null;
            case SATURDAY -> null;
            case SUNDAY -> null;
        };

    }
}
