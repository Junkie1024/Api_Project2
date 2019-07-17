package com.example.api_project;

import android.content.Intent;
import android.media.Image;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

public class Repo_desc extends AppCompatActivity {


    ImageView pimg;
    TextView pname,price,pbrand,pdesc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc__owner);

        pimg= findViewById(R.id.profilepic);
        pname= findViewById(R.id.desc_pname);
        pbrand= findViewById(R.id.desc_brand);
        price= findViewById(R.id.desc_price);
        pdesc =  findViewById(R.id.desc_pdesc);

        Intent i = getIntent();

        List_Products p = i.getParcelableExtra("data");

        String name = p.getname();

       // System.out.println("ProductDesc "+p.getPimg());

        //Picasso.get().load(p.getPimg()).into(pimg);

        pname.setText(p.getname());
        /*pdesc.setText(p.getDesc());
        pbrand.setText(p.getBrand());
        price.setText(""+p.getPrice());
*/
        System.out.println("This is from products page: "+name);
    }
}

