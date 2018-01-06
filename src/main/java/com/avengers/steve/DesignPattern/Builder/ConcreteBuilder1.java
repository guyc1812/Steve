package com.avengers.steve.DesignPattern.Builder;

public class ConcreteBuilder1 implements Builder {

    private Product product = new Product();

    public void buildPartA() {
        product.addPart("part-1");
    }

    public void buildPartB() {
        product.addPart("part-2");
    }

    public Product getResult() {
        return product;
    }
}
