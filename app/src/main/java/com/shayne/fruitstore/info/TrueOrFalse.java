package com.shayne.fruitstore.info;

/**
 * huwei1993 on 2016/8/9 09:37
 */
public class TrueOrFalse {
    private boolean isloading;    // 用来判断是否登录
    private boolean isRemember;   //  判断是否记住密码
    private boolean isRadioChecked;  //  判断是否选择加入购物车
    private boolean isRadioAllChecked;   //  判断是否全选

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
