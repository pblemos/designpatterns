package com.pedrolemos.creational.builder;

public class Main {
    public static void main(String[] args) {
        CakeBuilder cakeBuilder = new CakeBuilder();
        cakeBuilder.addEggs(2)
                .addFlour(100)
                .addSugar(150);

        Cake cake = cakeBuilder.build();

        System.out.println(cake);

    }
}
