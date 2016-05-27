package com.example.bijay.myapp_gridview;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Pic> gridArray = new ArrayList<Pic>();
    GridAdapterP ga;
    GridView gv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bitmap ccIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.cupcake);
        Bitmap dnIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.donought);
        Bitmap enIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.enclair);
        Bitmap frIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.froyo);
        Bitmap gbIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.gingerboard);
        Bitmap hcIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.honeycomb);
        Bitmap icIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.icecream);
        Bitmap jbIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.jellybin);
        Bitmap kkIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.kitkat);
        Bitmap lpIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.lollypop);

        gridArray.add(new Pic(ccIcon));
        gridArray.add(new Pic(dnIcon));
        gridArray.add(new Pic(enIcon));
        gridArray.add(new Pic(frIcon));
        gridArray.add(new Pic(gbIcon));
        gridArray.add(new Pic(hcIcon));
        gridArray.add(new Pic(icIcon));
        gridArray.add(new Pic(jbIcon));
        gridArray.add(new Pic(kkIcon));
        gridArray.add(new Pic(lpIcon));

        gv = (GridView) findViewById(R.id.gridView);

        ga = new GridAdapterP(this, R.layout.grid_viewlayout, gridArray);
        gv.setAdapter(ga);
    }
}
