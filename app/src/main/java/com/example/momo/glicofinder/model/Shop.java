package com.example.momo.glicofinder.model;

import java.util.List;

/**
 * Created by Momo on 2/6/2559.
 */
public class Shop {
    private int id;
    private String name;
    private String descripe;
    private double posX;
    private double posY;
    private List<Icecream> icecreams;

    public Shop(int id, String name, String descripe, double posX, double posY) {
        this.id = id;
        this.name = name;
        this.descripe = descripe;
        this.posX = posX;
        this.posY = posY;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripe() {
        return descripe;
    }

    public void setDescripe(String descripe) {
        this.descripe = descripe;
    }

    public double getPosX() {
        return posX;
    }

    public void setPosX(double posX) {
        this.posX = posX;
    }

    public double getPosY() {
        return posY;
    }

    public void setPosY(double posY) {
        this.posY = posY;
    }
}
