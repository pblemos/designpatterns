package com.pedrolemos.creational.builder;

public class Cake {
    private double flour;
    private int eggs;
    private double sugar;

    public Cake (CakeBuilder cakeBuilder){
        this.flour = cakeBuilder.getFlour();
        this.eggs = cakeBuilder.getEggs();
        this.sugar = cakeBuilder.getSugar();
    }

    @Override
    public String toString() {
        return flour + " flour, " + eggs + " eggs and " + sugar + " sugar.";
    }
}
