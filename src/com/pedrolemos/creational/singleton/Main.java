package com.pedrolemos.creational.singleton;

public class Main {
    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getInstance();
        System.out.println(singleObject);

        //Will print the same reference
        singleObject = SingleObject.getInstance();
        System.out.println(singleObject);

        //Will print new reference, but keeps Singleton (One instance only.)
        singleObject = SingleObject.getNewInstance();
        System.out.println(singleObject);
    }
}
