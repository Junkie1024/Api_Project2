package com.example.api_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class Repo_info extends AppCompatActivity {

    TextView Name,lang,cont,ownerdetails,ownername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repo_info);


        Name= findViewById(R.id.Name);
        lang= findViewById(R.id.lang);
        cont= findViewById(R.id.cont);
        ownerdetails=findViewById(R.id.ownerdetails);

        //ownerdetails =  findViewById(R.id.ownerdetails);

        Intent i = getIntent();

        List_Products p = i.getParcelableExtra("data");

        String name = p.getname();

        System.out.println(" "+p.getname());

//        Picasso.get().load(p.getPimg()).into(pimg);

        Name.setText(p.getname());
        cont.setText(p.getCont());
        lang.setText(p.getLang());
        ownerdetails.setText(""+p.getOwnerdetails());

        System.out.println("This is from products page: "+name);


        System.out.println("This is from products page: "+cont);

        System.out.println("This is from products page: "+lang);

        System.out.println("This is from products page: "+ownerdetails);


    }
}
