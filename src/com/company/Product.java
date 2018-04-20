package com.company;

import java.security.PublicKey;
import java.util.function.Consumer;

public abstract class Product {
    String name;
    int price;
    String owner = " human";

    protected Product(String name) {
           this.name = name;

    }


}


