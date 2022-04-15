package com.example.intentexplicit180202022;

import java.io.Serializable;

public class Animal implements Serializable {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
