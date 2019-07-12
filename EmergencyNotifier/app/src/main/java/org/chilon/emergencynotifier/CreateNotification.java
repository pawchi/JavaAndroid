package org.chilon.emergencynotifier;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

public class CreateNotification extends AppCompatActivity {

    LinearLayout myparent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_notifier);

        //Inflate with phone number view
        myparent = findViewById(R.id.content_main_layout_to_inflate_into);
        LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View myview = layoutInflater.inflate(R.layout.enter_phone_number, null, false);
        myparent.addView(myview);


    }
}
