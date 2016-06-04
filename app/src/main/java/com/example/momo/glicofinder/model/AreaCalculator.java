package com.example.momo.glicofinder.model;

import com.example.momo.glicofinder.service.ShopService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Momo on 3/6/2559.
 */
public class AreaCalculator {
    private List<Shop> shopList;
    //private ShopService service;
    private double userLat,userLng;

    public AreaCalculator(double userLat,double userLng,ShopService service){
        shopList = service.getShopList();
        this.userLat = userLat;
        this.userLng = userLng;
    }


    public List<Shop> getShopInArea(List<Shop> shopList){
        List<Shop> inArea = new ArrayList<Shop>();
        double boundLatUp = userLat+0.00450045;
        double boundLatDn = userLat-0.00450045;
        double boundLngRt = userLng+0.00450045;
        double boundLngLt = userLng-0.00450045;

        for(Shop shop: shopList){
            if((shop.getPosX()<=boundLatUp&&shop.getPosX()>=boundLatDn)&&
                    (shop.getPosY()<=boundLngRt&&shop.getPosY()>=boundLngLt)){
                inArea.add(shop);
                System.out.println("Add shop:" + shop.getId());
            }
        }
        return inArea;
    }
}
