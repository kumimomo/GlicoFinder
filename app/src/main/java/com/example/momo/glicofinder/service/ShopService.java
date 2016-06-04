package com.example.momo.glicofinder.service;

import android.location.Location;

import com.example.momo.glicofinder.model.Shop;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Momo on 3/6/2559.
 */
public class ShopService {
    private List<Shop> shopList;

    public ShopService(){
        initShop();
    }

    public void initShop(){
        shopList = new ArrayList<Shop>();

        shopList.add(new Shop(1,"Family Mart","Shop 1","งาม 1",13.843780, 100.568729));
        shopList.add(new Shop(2,"Family Mart","Shop 2","งาม 3",13.844947, 100.566884));
        shopList.add(new Shop(3,"Family Mart","Shop 3","ศร 1",13.846687, 100.570757));
        shopList.add(new Shop(4,"Family Mart","Shop 4","home ville",13.841291, 100.572173));
        shopList.add(new Shop(5,"Family Mart","Shop 5","สังคมศาสตร์",13.850197, 100.570446));
        shopList.add(new Shop(6,"Family Mart","Shop 6","pola pola",13.845500, 100.564266));
        shopList.add(new Shop(7,"Family Mart","Shop 7","ครัวชวนชม ไกลมาก",13.851969, 100.554224));
        shopList.add(new Shop(8,"Family Mart","Shop 8","ตลาดนัด ไกลมาก",13.855927, 100.564352));
        shopList.add(new Shop(9,"Family Mart","Shop 9","คณะมนุษ",13.847521, 100.570457));
        shopList.add(new Shop(10,"Family Mart","Shop 10","โรมแรมมารวย",13.845593, 100.579694));
    }

    public List<Shop> getShopList(){
        return shopList;
    }

    public List<Shop> getShopInArea(double userLat,double userLng){
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
