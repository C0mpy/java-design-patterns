package com.compi.singleton;

public class DbSingletonDemo {

    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();
        DbSingleton anotherInstance = DbSingleton.getInstance();

        // check if both instances are the same
        System.out.println(instance == anotherInstance);
    }
}
