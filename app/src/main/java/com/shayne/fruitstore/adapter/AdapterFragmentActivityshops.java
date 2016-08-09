package com.shayne.fruitstore.adapter;

import android.content.Context;
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
        tv_list_hot_action_activity.setText(listGoods.get(position).getName());
        return null;
    }





}
