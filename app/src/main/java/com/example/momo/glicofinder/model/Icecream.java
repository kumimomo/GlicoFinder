package com.example.momo.glicofinder.model;

/**
 * Created by Momo on 2/6/2559.
 */
public class Icecream {
    private String name;
    private String describe;

    public Icecream(String name, String describe) {
        this.name = name;
        this.describe = describe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
