package com.shayne.fruitstore.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import com.shayne.fruitstore.R;
import com.shayne.fruitstore.info.Goods;

import java.util.List;

/**
 * huwei1993 on 2016/8/5 09:20
 */
public class MyAdapterListViewGoodsCarinfo extends BaseAdapter {

    private LayoutInflater inflater;
    private List<Goods>  dataList;
    private int tv_num_edt_int =1;
    private ItemOnclick itemOnclick;
    boolean flag = true;


    public MyAdapterListViewGoodsCarinfo(Context context, ItemOnclick itemOnclick, List<Goods> datalist){
        inflater= LayoutInflater.from(context);    //  获取上下文
        this.itemOnclick = itemOnclick;             //  按钮点击事件
        this.dataList = datalist;                   // 数据源
    }

    @Override
    public int getCount() {
        return dataList.size();
    }

    @Override
    public Object getItem(int i) {
        return dataList.get(i);
    }

    @Override
    public long getItemId(int position) {
        Log.d("i=","显示数据"+position);
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        Log.d("-#$#$" ,"11");

        ViewHolder viewHolder ;

        if (view == null) {
            view = inflater.inflate(R.layout.item_list_goods_car_info, null);
            // 初始化控件
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);   //
        }else {
            viewHolder = (ViewHolder) view.getTag();
        }
        // 设置数据
        viewHolder.tv_des_item_list_goods_car_info.setText(dataList.get(position).getName() + "");
        viewHolder.tv_parameter_item_list_goods_car_info.setText(dataList.get(position).getAttention() + "");
        viewHolder.tv_price_item_list_goods_car_info.setText(dataList.get(position).getPrice() +"");
        viewHolder.tv_num_item_list_goods_car_info.setText(dataList.get(position).getSalesNum() + "");
        //  设置点击事件
        viewHolder.tv_price_item_list_goods_car_info.setOnClickListener(new MyListen(position));

        /*//  是否被选中商品
           initData();
        String tv_num_str = viewHolder.tv_num_item_list_goods_car_info.getText().toString().trim();// 获取商品数量
        int tv_num_int = Integer.parseInt(tv_num_str);   // 强制转换成int类型
        final String tv_num_edt_str = viewHolder.tv_num_gone_item_list_goods_car_info.getText().toString().trim();  // 获取编辑时候的数据
        tv_num_edt_int =  Integer.parseInt(tv_num_edt_str);// 强制转换
        viewHolder. tv_add_gone_item_list_goods_car_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_num_edt_int++;
                viewHolder.tv_num_item_list_goods_car_info.setText(tv_num_edt_int+"");

            }
        });
*/      /*  //   减少数量
        tv_reduce_num_gone_item_list_goods_car_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_num_edt_int--;
                tv_num_item_list_goods_car_info.setText(tv_num_edt_int+"");
            }
        });
        //  标题框的编辑按钮
        btn_edt_or_success_shoppingCarFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ll_edt_item_list_goods_car_info.clearAnimation();
                btn_edt_or_success_shoppingCarFragment.clearAnimation();
                if (flag){
                    ShowToast.show(getActivity(),"*****");
                    btn_edt_or_success_shoppingCarFragment.setText("完成");
                    ll_edt_item_list_goods_car_info.setVisibility(View.VISIBLE);
                    Log.d(("***"),ll_edt_item_list_goods_car_info.hashCode()+"");
                    ll_success_item_list_goods_car_info.setVisibility(View.INVISIBLE);
                    Log.d(("***"),ll_success_item_list_goods_car_info.hashCode()+"");
                    flag = false;
                }else  {
                    btn_edt_or_success_shoppingCarFragment.setText("编辑");
                    ll_edt_item_list_goods_car_info.setVisibility(View.INVISIBLE);
                    ll_success_item_list_goods_car_info.setVisibility(View.VISIBLE);
                    Log.d(("---"),ll_success_item_list_goods_car_info.hashCode()+"");
                    Log.d(("---"),ll_edt_item_list_goods_car_info.hashCode()+"");
                    flag = true;
                }
                System.out.println(ll_success_item_list_goods_car_info.getVisibility());

            }
        });
        //  每个条目的选择按钮
        rb_item_list_goods_car_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rb_item_list_goods_car_info.isChecked()) {
                    rb_item_list_goods_car_info.setChecked(false);
                }else {
                    rb_item_list_goods_car_info.setChecked(true);
                }
            }
        });
        // 全选按钮
        rb_all_checked_shoppingCarFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rb_all_checked_shoppingCarFragment.isChecked()){
                    rb_all_checked_shoppingCarFragment.setChecked(false);
                }else {
                    rb_all_checked_shoppingCarFragment.setChecked(true);
                }
            }
        });*/

        return view;
    }

    //　　条目内部的数据捆绑
    public void initData(){

    }

    // 设置ListView的点击事件
    private class  MyListen implements View.OnClickListener{
        int position;
        public  MyListen(int position){
            this.position = position;
        }

        @Override
        public void onClick(View view) {
            itemOnclick.duceCarShop();
        }
    }
    public interface  ItemOnclick {
        // 各种点击事件
        public void duceCarShop();
        public void addCarShop();
    }
    // 用于缓存
    public class ViewHolder{
         RadioButton rb_item_list_goods_car_info;
         ImageView iv_pic_item_list_goods_car_info;
         LinearLayout ll_edt_item_list_goods_car_info,ll_success_item_list_goods_car_info;
         TextView tv_des_item_list_goods_car_info,tv_parameter_item_list_goods_car_info,tv_price_item_list_goods_car_info,
                 tv_num_item_list_goods_car_info,tv_add_gone_item_list_goods_car_info,tv_num_gone_item_list_goods_car_info,
                 tv_reduce_num_gone_item_list_goods_car_info;

        public  ViewHolder(View view){
           rb_item_list_goods_car_info = (RadioButton) view.findViewById(R.id.rb_item_list_goods_car_info);
            // 商品图片
           iv_pic_item_list_goods_car_info = (ImageView) view.findViewById(R.id.iv_pic_item_list_goods_car_info);
            // 显示可见或不可见
           ll_edt_item_list_goods_car_info = (LinearLayout) view.findViewById(R.id.ll_edt_item_list_goods_car_info);
            // 描述商品信息 名称
           tv_des_item_list_goods_car_info = (TextView) view.findViewById(R.id.tv_des_item_list_goods_car_info);
            //   描述商品信息的参数
           tv_parameter_item_list_goods_car_info = (TextView) view.findViewById(R.id.tv_parameter_item_list_goods_car_info);
            // 商品价格
           tv_price_item_list_goods_car_info = (TextView) view.findViewById(R.id.tv_price_item_list_goods_car_info);
            // 商品数量
           tv_num_item_list_goods_car_info = (TextView) view.findViewById(R.id.tv_num_item_list_goods_car_info);
            // 隐式的LinearLayout     编辑商品数量
           ll_success_item_list_goods_car_info = (LinearLayout) view.findViewById(R.id.ll_success_item_list_goods_car_info);
            // 减少商品数量
           tv_reduce_num_gone_item_list_goods_car_info = (TextView) view.findViewById(R.id.tv_reduce_num_gone_item_list_goods_car_info);
            //  显示商品数量
           tv_num_gone_item_list_goods_car_info = (TextView) view.findViewById(R.id.tv_num_gone_item_list_goods_car_info);
            // 增加商品数量的按钮
           tv_add_gone_item_list_goods_car_info = (TextView) view.findViewById(R.id.tv_add_gone_item_list_goods_car_info);

        }
    }

    //  实现接口调用方法



}

