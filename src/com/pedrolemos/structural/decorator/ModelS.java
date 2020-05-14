package com.pedrolemos.structural.decorator;

public class ModelS implements Tesla {
    @Override
    public String getExtras() {
        return "Tesla Model S";
    }

    @Override
    public int getPrice() {
        return 50000;
    }
}
