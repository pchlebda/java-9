package com.process;

public class Main {

    public static void main(String[] args) {

        System.out.println(ProcessHandle.current().pid());
    }
}
