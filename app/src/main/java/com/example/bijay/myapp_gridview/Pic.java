package com.example.bijay.myapp_gridview;

import android.graphics.Bitmap;

/**
 * Created by Bijay on 18-05-2016.
 */
public class Pic {
    Bitmap image;

    public Pic(){}

    public Pic(Bitmap image){
        super();
        this.image =image;
    }
    public Bitmap getImage(){return image;}
    public void setImage(Bitmap image){this.image=image;}
}
