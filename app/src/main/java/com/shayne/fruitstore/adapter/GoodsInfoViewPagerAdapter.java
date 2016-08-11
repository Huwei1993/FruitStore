package com.shayne.fruitstore.adapter;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.shayne.fruitstore.R;

import java.util.ArrayList;
import java.util.List;

/**
 * huwei1993 on 2016/8/10 16:53
 */
public class GoodsInfoViewPagerAdapter extends PagerAdapter {
    // 主页面上方的滑动图片
    private int[] imageGoodsInfo = new int[] {R.drawable.shucai,R.drawable.boluo,R.drawable.warter,R.drawable.xihongshi};
    private List<ImageView> imageList;
    private Activity getActivity;

    public GoodsInfoViewPagerAdapter(Activity context){
        this.getActivity = context;
    }

    //  初始化数据，将图片设置在ViewPager当中

    public  void initData(){
        imageList = new ArrayList<ImageView>();
        for (int i =0;i<imageGoodsInfo.length;i++){
            ImageView imageView = new ImageView(getActivity);
            imageView.setImageResource(imageGoodsInfo[i]);
            imageList.add(imageView);
        }
    }


    @Override
    public int getCount() {
        initData();
        Log.d("sys","执行getCount");
        System.out.println("Sysout.system"+ imageList.size());
        return imageList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = imageList.get(position);
        container.addView(imageView);
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }



}
