package com.pedrolemos.structural.decorator;

public class ModelX implements Tesla {
    @Override
    public String getExtras() {
        return "Tesla Model X";
    }

    @Override
    public int getPrice() {
        return 80000;
    }
}
