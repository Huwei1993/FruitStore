package com.shayne.fruitstore;

import android.net.Uri;

import com.shayne.fruitstore.info.Address;
import com.shayne.fruitstore.info.Admin;
import com.shayne.fruitstore.info.Car;
import com.shayne.fruitstore.info.Catalogue;
import com.shayne.fruitstore.info.Common;
import com.shayne.fruitstore.info.Goods;
import com.shayne.fruitstore.info.Indent;
import com.shayne.fruitstore.info.Users;

import java.util.ArrayList;
import java.util.List;

/**
 * huwei1993 on 2016/8/4 22:46
 */
public class Testdb {
    public List<Address> listAddress = new ArrayList<Address>();
    public List<Admin> listAdmin = new ArrayList<Admin>();
    public List<Car> listCar = new ArrayList<Car>();
    public List<Catalogue> listCatalogue = new ArrayList<Catalogue>();
    public List<Common> listCommon = new ArrayList<Common>();
    public List<Goods> listGoods = new ArrayList<Goods>();
    public List<Indent> listIndent = new ArrayList<Indent>();
    public List<Users> listUsers = new ArrayList<Users>();

    // 设置地址模拟数据
    public void setMode() {
        for (int i = 1; i < 6; i++) {
            // 模拟数据
            Address address = new Address();
            address.setCity("所在城市——南昌" + i);
            address.setId(i);
            address.setOthers("自定义收货地址" + i);
            address.setProvince("所在省份——江西" + i);
            address.setUserId(i);
            listAddress.add(address);

            //   设置高级管理员
            Admin admin = new Admin();
            admin.setAccount("admin" + i);
            admin.setPassword("123" + i);
            listAdmin.add(admin);

            // 设置购物车
            Car car = new Car();
            car.setNum(5 + i);  //  商品数量
            car.setId_Car(1 + i);
            car.setGoodsId(1 + i);
            car.setGoodsName("商品名称" + i);
            car.setPrice(12.00 + i);  // 单价
            car.setTotalprice(12.00 + i);
            car.setUserId(12 + i);
            car.setUsername("用户名称：" + i);
            listCar.add(car);

            //  商品分类
            Catalogue catalogue = new Catalogue();
            catalogue.setName("商品类型" + i);
            catalogue.setId(i);
            listCatalogue.add(catalogue);
//            设置公共使用类
            Common common = new Common();
            common.setApp("App下载地址"+i);
            common.setBannerImg1("横幅一的地址BannerImg1"+i);
            common.setBannerImg2("BannerImg2"+i);
            common.setBannerImg3("BannerImg3"+i);
            common.setGuideImg1("GuideImg1引导界面一"+ i);
            common.setGuideImg2("GuideImg2引导界面一"+ i);
            common.setGuideImg3("GuideImg3引导界面一"+ i);
            common.setIcon("图标地址" + i);
            common.setSalesImg1("促销图片1" + i);
            common.setSalesImg2("促销图片2" + i);
            common.setSalesImg3("促销图片3" + i);
            common.setLabelImg1("标签图片1"+i);
            common.setLabelImg2("标签图片2"+i);
            // 商品的信息
            Goods goods = new Goods();
            goods.setId(1+i);
            goods.setNum(11+i);
            goods.setName("商品名称"+i);
            goods.setAttention(1000+i);
            goods.setCatalogueId(1+i);
            goods.setEvaluateBad(2+i);
            goods.setEvaluateGood(100+i);
            goods.setPrice(20.00+i);
            goods.setResidueNum(1000); //  剩余商品数量
            listGoods.add(goods);
            //  订单信息
            Indent indent = new Indent();
            indent.setId(1+i);
            indent.setPhone("1234567891"+i);
            indent.setName("张三" + i);
            indent.setEvaluate("收货人评价：");
            indent.setTotalPrice(100000.00 + i);
            indent.setMessage("配送信息：" + i);
//            indent.setTime(2016/12/03 12:22:00:00);
            indent.setUser_id(1+i);
            indent.setUserName("用户名称"+ i);
            indent.setGoodsName("商品名称" + i);
            indent.setGoods_id(1+ i);
            listIndent.add(indent);

            // 用户信息
            Users users = new Users();
            users.setName("李四" + i);
            users.setPassword("123"+ i);
            users.setAccount("账户" + i);
            users.setPhone("1234567891" + i);
            users.setU_id(1+ i);
            listUsers.add(users);
        }

    }

}