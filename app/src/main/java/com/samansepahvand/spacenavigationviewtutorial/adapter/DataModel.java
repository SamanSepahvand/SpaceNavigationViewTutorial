package com.samansepahvand.spacenavigationviewtutorial.adapter;

public class DataModel {


    String title,desc,anchor;
    int image;

    public DataModel(String title,String anchor, int image,String desc) {
        this.title = title;
        this.desc = desc;
        this.anchor = anchor;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String getAnchor() {
        return anchor;
    }

    public int getImage() {
        return image;
    }
}
