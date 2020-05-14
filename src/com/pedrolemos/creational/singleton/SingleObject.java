package com.pedrolemos.creational.singleton;

public class SingleObject {
    private SingleObject() {}
    static SingleObject currentInstance = null;

    public static SingleObject getInstance() {
        if (currentInstance == null) {
            return currentInstance = new SingleObject();
        }
        return currentInstance;
    }

    public static SingleObject getNewInstance(){
        return currentInstance = new SingleObject();
    }
}
