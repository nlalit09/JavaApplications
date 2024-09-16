package com.Emailapp;

public class EmailApp {

    public static void main(String[] args) {
        Email e=new Email("Lalitha","Nali");
        e.setAlternateEmail("lalithanali@gmail.com");
        System.out.println(e.getInfo());
    }
}
