package com.list;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List.of("one","two","three").forEach(System.out::println);
    }
}
