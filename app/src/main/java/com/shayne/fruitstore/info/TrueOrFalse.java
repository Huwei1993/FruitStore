package com.shayne.fruitstore.info;

/**
 * huwei1993 on 2016/8/9 09:37
 */
public class TrueOrFalse {
    private boolean isloading;    // 用来判断是否登录
    private boolean isRemember;   //  判断是否记住密码
    private boolean isRadioChecked;  //  判断是否选择加入购物车
    private boolean isRadioAllChecked;   //  判断是否全选
    private boolean isStoreShops;     //  是否收藏商品
    private boolean isAddShopCar;    //  是否加入购物车
    private boolean isOrders;      //  是否下订单

    public boolean isStoreShops() {
        return isStoreShops;
    }

    public void setStoreShops(boolean storeShops) {
        isStoreShops = storeShops;
    }

    public boolean isAddShopCar() {
        return isAddShopCar;
    }

    public void setAddShopCar(boolean addShopCar) {
        isAddShopCar = addShopCar;
    }

    public boolean isOrders() {
        return isOrders;
    }

    public void setOrders(boolean orders) {
        isOrders = orders;
    }



    public boolean isloading() {
        return isloading;
    }

    public void setIsloading(boolean isloading) {
        this.isloading = isloading;
    }

    public boolean isRemember() {
        return isRemember;
    }

    public void setRemember(boolean remember) {
        isRemember = remember;
    }

    public boolean isRadioChecked() {
        return isRadioChecked;
    }

    public void setRadioChecked(boolean radioChecked) {
        isRadioChecked = radioChecked;
    }

    public boolean isRadioAllChecked() {
        return isRadioAllChecked;
    }

    public void setRadioAllChecked(boolean radioAllChecked) {
        isRadioAllChecked = radioAllChecked;
    }
}
