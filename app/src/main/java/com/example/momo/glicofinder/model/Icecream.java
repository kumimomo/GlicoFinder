package com.example.momo.glicofinder.model;

import java.io.Serializable;

/**
 * Created by Momo on 2/6/2559.
 */
public class Icecream implements Serializable{
    private int id;
    private String name;
    private String describe;
    private int image;

    public Icecream(int id,int image,String name, String describe) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.describe = describe;
    }

    public int getId(){
        return id;
    }

    public int getImage() {return image;}

    public void setImage(int image) {this.image = image;}

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
