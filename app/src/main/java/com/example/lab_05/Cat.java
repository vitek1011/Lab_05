package com.example.lab_05;

import androidx.annotation.NonNull;

public class Cat {
    public String name;
    public int age;
    public int color;


    public Cat(String name, int age, int color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @NonNull
    @Override
    public String toString() {
        return "Кот: " + name + ", " + age + " лет";
    }
}
