package com.example.momo.glicofinder.model;

import java.io.Serializable;

/**
 * Created by Momo on 2/6/2559.
 */
public class Icecream implements Serializable{
    private int id;
    private String name;
    private String describe;

    public Icecream(int id,String name, String describe) {
        this.id = id;
        this.name = name;
        this.describe = describe;
    }

    public int getId(){
        return id;
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
