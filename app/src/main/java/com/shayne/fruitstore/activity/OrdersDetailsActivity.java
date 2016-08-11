package com.shayne.fruitstore.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.shayne.fruitstore.R;

public class OrdersDetailsActivity extends AppCompatActivity {

    private TextView tv_userName_activity_orders_details;
    private TextView tv_userPhone_activity_orders_details;
    private String userName;
    private String userPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders_details);
        initView();
        initData();
    }

    /**
     * 数据绑定
     */
    private void initData() {
        userName = getIntent().getStringExtra("userName");
        userPhone = getIntent().getStringExtra("userPhone");
        tv_userName_activity_orders_details.setText(userName);
        tv_userPhone_activity_orders_details.setText(userPhone);
    }

    /**
     *  初始化界面
     */
    private void initView() {
        tv_userName_activity_orders_details = (TextView) findViewById(R.id.tv_userName_activity_orders_details);
        tv_userPhone_activity_orders_details = (TextView) findViewById(R.id.tv_userPhone_activity_orders_details);
    }


}
