package com.shayne.fruitstore.adapter;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.shayne.fruitstore.R;
import com.shayne.fruitstore.Testdb;
import com.shayne.fruitstore.info.Goods;

import java.util.List;

/**
 * huwei1993 on 2016/8/9 14:08
 */
public class AdapterFragmentActivityshops extends BaseAdapter {
    private List<Goods> listGoods;
    private  LayoutInflater inflater;
    private TextView tv_list_hot_action_activity;
    private TextView tv_true_price_hot_activity_fragment;
    private TextView tv_count_price_hot_activity_fragment;
    private TextView tv_add_shoppingCar_hot_activity;

    public AdapterFragmentActivityshops(Context context,  List<Goods> datalist){
        inflater= LayoutInflater.from(context);    //  获取上下文
        this.listGoods = datalist;                   // 数据源
    }

    // 绑定数据源
    public void initData(){
        Testdb testdb = new Testdb();
        testdb.setMode();
        listGoods = testdb.listGoods;  //  获取数据
        System.out.println("数组大小为:" + listGoods.size());
    }

    @Override
    public int getCount() {
        return listGoods.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        // 获取布局文件
       view = inflater.inflate(R.layout.hot_activity_listview_goods,null);
        tv_list_hot_action_activity = (TextView) view.findViewById(R.id.tv_list_hot_action_activity);
//        初始化空件
        // 获取真实价格
        tv_true_price_hot_activity_fragment = (TextView) view.findViewById(R.id.tv_true_price_hot_activity_fragment);
        // 原始价格
        tv_count_price_hot_activity_fragment = (TextView) view.findViewById(R.id.tv_count_price_hot_activity_fragment);
        tv_add_shoppingCar_hot_activity = (TextView) view.findViewById(R.id.tv_add_shoppingCar_hot_activity);
        //   给原价画横线
        tv_count_price_hot_activity_fragment.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG|Paint.ANTI_ALIAS_FLAG);     // 给中间画线
        tv_list_hot_action_activity.setText(listGoods.get(position).getName());
        return view;
    }
}
