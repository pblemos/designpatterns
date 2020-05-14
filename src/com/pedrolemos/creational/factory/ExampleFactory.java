package com.pedrolemos.creational.factory;

import com.pedrolemos.creational.factory.Objects.ExampleObject;
import com.pedrolemos.creational.factory.Objects.ExampleObject1;
import com.pedrolemos.creational.factory.Objects.ExampleObject2;

public class ExampleFactory {
    public ExampleObject create() {
        if (Math.random() > 0.5) { //50%
            return new ExampleObject1();
        }
        return new ExampleObject2();
    }
}