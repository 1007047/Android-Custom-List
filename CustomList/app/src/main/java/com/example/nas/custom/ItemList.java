package com.example.nas.custom;

/**
 * Created by NAS on 11/26/2015.
 */
public class ItemList {


    String s1,s;
    int img;
    public ItemList(String s, String s1, int picture) {
        this.s=s;
        this.s1=s;
        this.img=picture;

    }
    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }


}
