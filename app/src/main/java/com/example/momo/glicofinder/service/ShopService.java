package com.example.momo.glicofinder.service;

import android.location.Location;

import com.example.momo.glicofinder.R;
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
        icecreams2.add(Palitte_white); icecreams2.add(Palitte_dark); icecreams2.add(Seventeen_mint);
        icecreams2.add(Panapp_staw);icecreams2.add(Giant_nut);

        List<Icecream> icecreams3 = new ArrayList<Icecream>();
        icecreams3.add(Palitte_white); icecreams3.add(Palitte_dark); icecreams3.add(Panapp_staw);
        icecreams3.add(Panapp_grape);icecreams3.add(Giant_cookie);

        List<Icecream> icecreams4 = new ArrayList<Icecream>();
        icecreams4.add(Seventeen_mint); icecreams4.add(Seventeen_cookie); icecreams4.add(Panapp_staw);
        icecreams4.add(Panapp_grape);icecreams4.add(Giant_cookie);

        shopList.add(new Shop(1,"Family Mart","Family Mart สาขาประตูงาม 1","งามวงวาน 1",13.843780, 100.568729,icecreams1));
        shopList.add(new Shop(2,"Family Mart","Family Mart สาขาประตูงาม 3","งามวงวาน 3",13.844947, 100.566884,icecreams2));
        shopList.add(new Shop(3,"7-11","7-11 LH1","ศร 1",13.846687, 100.570757,icecreams1));
        shopList.add(new Shop(4,"restaurant","KU beef","home ville",13.841291, 100.572173,icecreams2));
        shopList.add(new Shop(5,"7-11","7-11 คณะสังคม","คณะสังคมศาสตร์",13.850197, 100.570446,icecreams3));
        shopList.add(new Shop(6,"Family Mart","Family Mart สาขา pola pola","pola pola",13.845500, 100.564266,icecreams4));
        shopList.add(new Shop(7,"restaurant","ครัวชวนชม","ถนนงามวงวานศ์",13.851969, 100.554224,icecreams1));
        shopList.add(new Shop(8,"Family Mart","ตลาดนัดบางเขน","ถนนรามอินทรา",13.855927, 100.564352,icecreams2));
        shopList.add(new Shop(9,"7-11","7-11 คณะมนุษย์","คณะมนุษย์ศาสตร์",13.847521, 100.570457,icecreams3));
        shopList.add(new Shop(10,"restaurant","โรงแรมมารวย","ถนนพหลโยธิน",13.845593, 100.579694,icecreams4));
        shopList.add(new Shop(11,"Family Mart","Family Mart สาขาคณะบริหาร","คณะบริหารธุรกิจ",13.844370, 100.569068,icecreams1));
        shopList.add(new Shop(12,"Family Mart","Family Mart สาขากรมป่าไม้","กรมป่าไม้",13.848199, 100.580376,icecreams2));
        shopList.add(new Shop(13,"Family Mart","Family Mart สาขาสายไหม","ถนนสายไหม",13.899133, 100.618633,icecreams1));
        shopList.add(new Shop(14,"7-11","7-11 เมเจอร์รัชโยธิน","รัชโยธิน",13.828554, 100.568446,icecreams2));
        shopList.add(new Shop(15,"Family Mart","Central ladprow","แยกลาดพร้าว",13.815744, 100.559508,icecreams3));

    }

    public List<Shop> getShopList(){
        return shopList;
    }

    public void initIcecream(){
        allIcecreamList = new ArrayList<Icecream>();

         Palitte_white = new Icecream(1, R.drawable.palitte_white_chocolate,"Palitte Vanilla and White Chocolate","Reward your day with vanilla ice cream twisted with white chocolate, together with special cone from Glico which is the best combination.");
         Palitte_dark = new Icecream(2, R.drawable.palitte_chocolate,"Palitte Vanilla and Dark Chocolate","Every bite is an exciting moment of soft vanilla ice cream twisted with crispy chocolate. The special cone from Glico enhances the taste. Perfect harmony from the first bite to the last.");
         Seventeen_mint = new Icecream(3, R.drawable.seventeen_mint,"Seventeen Ice Choco mint","Creamy ice cream with special aromatic mint flavored and well-blended dark chocolate. Unique refreshment and deliciousness.");
         Seventeen_cookie = new Icecream(4, R.drawable.seventeen_chocolate,"Seventeen Ice Choco cookie","So yummy with creamy vanilla ice cream blended with chocolate cookie filling the stick , smooth taste and proper deliciousness.");
         Panapp_staw = new Icecream(5, R.drawable.panapp_strawberry,"Panapp strawberry","Vanilla ice cream with sweet scent and just the right sweetness, combined with sweet and sour strawberry sauce and crispy white chocolate. Enjoy 3 layers together for more deliciousness.");
         Panapp_grape = new Icecream(6, R.drawable.panapp_blueberry,"Panapp grape","Enjoy the vanilla ice cream with just the right sweecness combined with tasty grape sauce and crispy white chocolate. Various deliciousness combination in a cup.");
         Giant_nut = new Icecream(7, R.drawable.giant_chocolate_nut,"Giant Cone Dhocolate & Nut","Full of taste! Recharge your energy with creamy texture of vanilla ice cream, topped with rich chocolate and peanut. It will recharge your energy.");
         Giant_cookie = new Icecream(8, R.drawable.giant_chocolate_cookie,"Giant Cone Chocolate & Cookie","Premium dark chocolate topped with crispy cookie on creamy texture of vanilla ice cream, which will wake up your energy.");

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
