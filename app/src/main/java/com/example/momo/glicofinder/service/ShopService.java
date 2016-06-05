package com.example.momo.glicofinder.service;

import android.location.Location;

import com.example.momo.glicofinder.model.Icecream;
import com.example.momo.glicofinder.model.Shop;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Momo on 3/6/2559.
 */
public class ShopService {
    private List<Shop> shopList;
    List<Icecream> allIcecreamList;
    private Icecream Palitte_white,Palitte_dark,Seventeen_mint,Seventeen_cookie,Panapp_staw,Panapp_grape,Giant_nut,Giant_cookie;

    public ShopService(){
        initIcecream();
        initShop();
    }

    public void initShop(){
        shopList = new ArrayList<Shop>();

        List<Icecream> icecreams1 = new ArrayList<Icecream>();
        icecreams1.add(Palitte_white); icecreams1.add(Palitte_dark); icecreams1.add(Seventeen_cookie);
        icecreams1.add(Panapp_staw);icecreams1.add(Giant_cookie);

        List<Icecream> icecreams2 = new ArrayList<Icecream>();
        icecreams1.add(Palitte_white); icecreams1.add(Palitte_dark); icecreams1.add(Seventeen_mint);
        icecreams1.add(Panapp_staw);icecreams1.add(Giant_nut);

        List<Icecream> icecreams3 = new ArrayList<Icecream>();
        icecreams1.add(Palitte_white); icecreams1.add(Palitte_dark); icecreams1.add(Panapp_staw);
        icecreams1.add(Panapp_grape);icecreams1.add(Giant_cookie);

        List<Icecream> icecreams4 = new ArrayList<Icecream>();
        icecreams1.add(Seventeen_mint); icecreams1.add(Seventeen_cookie); icecreams1.add(Panapp_staw);
        icecreams1.add(Panapp_grape);icecreams1.add(Giant_cookie);

        shopList.add(new Shop(1,"Family Mart","Shop 1","งาม 1",13.843780, 100.568729,icecreams1));
        shopList.add(new Shop(2,"Family Mart","Shop 2","งาม 3",13.844947, 100.566884,icecreams2));
        shopList.add(new Shop(3,"Family Mart","Shop 3","ศร 1",13.846687, 100.570757,icecreams1));
        shopList.add(new Shop(4,"Family Mart","Shop 4","home ville",13.841291, 100.572173,icecreams2));
        shopList.add(new Shop(5,"Family Mart","Shop 5","สังคมศาสตร์",13.850197, 100.570446,icecreams3));
        shopList.add(new Shop(6,"Family Mart","Shop 6","pola pola",13.845500, 100.564266,icecreams4));
        shopList.add(new Shop(7,"Family Mart","Shop 7","ครัวชวนชม ไกลมาก",13.851969, 100.554224,icecreams1));
        shopList.add(new Shop(8,"Family Mart","Shop 8","ตลาดนัด ไกลมาก",13.855927, 100.564352,icecreams2));
        shopList.add(new Shop(9,"Family Mart","Shop 9","คณะมนุษ",13.847521, 100.570457,icecreams3));
        shopList.add(new Shop(10,"Family Mart","Shop 10","โรมแรมมารวย",13.845593, 100.579694,icecreams4));
        shopList.add(new Shop(11,"Family Mart","Shop 11","บ้านแมว",13.982554, 100.576498,icecreams1));
    }

    public List<Shop> getShopList(){
        return shopList;
    }

    public void initIcecream(){
        allIcecreamList = new ArrayList<Icecream>();

         Palitte_white = new Icecream(1,"Palitte Vanilla and White Chocolate","ss");
         Palitte_dark = new Icecream(2,"Palitte Vanilla and Dark Chocolate","ss");
         Seventeen_mint = new Icecream(3,"Seventeen Ice Choco mint","ss");
         Seventeen_cookie = new Icecream(4,"Seventeen Ice Choco cookie","ss");
         Panapp_staw = new Icecream(5,"Panapp strawberry","ss");
         Panapp_grape = new Icecream(6,"Panapp grape","ss");
         Giant_nut = new Icecream(5,"Giant Cone Dhocolate & Nut","ss");
         Giant_cookie = new Icecream(6,"Giant Cone Chocolate & Cookie","ss");

        allIcecreamList.add(Palitte_white);
        allIcecreamList.add(Palitte_dark);
        allIcecreamList.add(Seventeen_mint);
        allIcecreamList.add(Seventeen_cookie);
        allIcecreamList.add(Panapp_staw);
        allIcecreamList.add(Panapp_grape);
        allIcecreamList.add(Giant_nut);
        allIcecreamList.add(Giant_cookie);

    }

    public List<Icecream> getIcecreamList(){
        return allIcecreamList;
    }



}
