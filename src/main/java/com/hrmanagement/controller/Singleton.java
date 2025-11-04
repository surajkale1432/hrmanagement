package com.hrmanagement.controller;

//single ton design

public class Singleton{
    private static Singleton instance;

    private Singleton()
    {
    }

    public static Singleton getInstance()
    {
        if( instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args)
    {
        Singleton singleton = Singleton.getInstance();
        Singleton s1= new Singleton();

        System.out.println(singleton);
        System.out.println(s1);

    }

}