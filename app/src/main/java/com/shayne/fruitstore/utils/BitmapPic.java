package com.shayne.fruitstore.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;

import java.io.IOException;

/**
 * des : 图片压缩工具类
 * huwei1993 on 2016/8/4 10:07
 */
public class BitmapPic  {
    /**
     *
     * @param context   上下文
     * @param view    view 对象
     * @param path    图片路径
     * @param iv       图片Id
     */
    public void loadBitmap(Context context, View view, String path, ImageView iv) {

        // String path = "mnt/sdcard/img_small_1.jpg";

        // 通过手机的屏幕的宽高和图片的宽高来计算采样率

        // 1. 屏幕宽高
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        int screenWidth = metrics.widthPixels;// 屏幕宽度
        int screenHeight = metrics.heightPixels;// 屏幕高

        // 2. 图片的宽高
        try {
            ExifInterface exif = new ExifInterface(path);
            int picWidth = exif.getAttributeInt(ExifInterface.TAG_IMAGE_WIDTH,
                    0);
            int picHeight = exif.getAttributeInt(
                    ExifInterface.TAG_IMAGE_LENGTH, 0);

            // 用图片的宽度/屏幕的宽度
            int widthSample = (int) (picWidth * 1f / screenWidth + 0.5f);// 四舍五入
            int heightSample = (int) (picHeight * 1f / screenHeight + 0.5f);// 四舍五入

            int sample = (int) (Math.sqrt(widthSample * widthSample
                    + heightSample * heightSample) + 0.5f);

            // 加载图片
            BitmapFactory.Options opts = new BitmapFactory.Options();
            // 宽和高: 1000 * 1000 --> 4 1/4 * 1/4 = 1 / 16
            opts.inSampleSize = sample;// 采样率

            Bitmap bitmap = BitmapFactory.decodeFile(path, opts);
            iv.setImageBitmap(bitmap);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
