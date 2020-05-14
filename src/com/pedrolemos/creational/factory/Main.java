package com.pedrolemos.creational.factory;
import com.pedrolemos.creational.factory.Objects.ExampleObject;

public class Main {
    public static void main(String[] args) {
        ExampleFactory exampleFactory = new ExampleFactory();

        ExampleObject exampleObject = exampleFactory.create();
        exampleObject.print();
    }
}