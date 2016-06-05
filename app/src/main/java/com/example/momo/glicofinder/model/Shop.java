package com.example.momo.glicofinder.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Momo on 2/6/2559.
 */
public class Shop implements Serializable{
    private int id;
    private String name;
    private String type;
    private String descripe;
    private double posX;
    private double posY;
    private List<Icecream> icecreams;

    public Shop(int id,String type, String name, String descripe, double posX, double posY,List<Icecream> icecreams) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.descripe = descripe;
        this.posX = posX;
        this.posY = posY;
        this.icecreams = icecreams;
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

    public List<Icecream> getIcecreams() {
        return icecreams;
    }

    public void setIcecreams(List<Icecream> icecreams) {
        this.icecreams = icecreams;
    }
}
