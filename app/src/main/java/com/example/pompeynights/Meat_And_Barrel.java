package com.example.pompeynights;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class Meat_And_Barrel extends AppCompatActivity {

    ViewFlipper v_flipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meatandbarrel);

        int images[] = {R.drawable.meatandbarrel,R.drawable.meatandbarrel1, R.drawable.meatandbarrel2};
        v_flipper = findViewById(R.id.flipper);
        for (int i = 0; i < images.length; i++) {
            flipperImages(images[i]);
        }

        ImageView smokingAreaIcon = (ImageView) findViewById(R.id.smokingArea);
        smokingAreaIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastSmokingArea();
            }
        });

        ImageView disabledIcon = (ImageView) findViewById(R.id.disabled);
        disabledIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastDisabled();
            }
        });

        ImageView wifiIcon = (ImageView) findViewById(R.id.wifi);
        wifiIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastWifi();
            }
        });

        ImageView maskIcon = (ImageView) findViewById(R.id.mask);
        maskIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastMask();
            }
        });

        ImageView takeawayIcon = (ImageView) findViewById(R.id.takeaway);
        takeawayIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastTakeaway();
            }
        });


        ImageView internetLink = (ImageView) findViewById(R.id.internetLink);
        internetLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String google = "https://www.meatandbarrel.net/";
                Uri googleaddress = Uri.parse(google);

                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, googleaddress);
                if (gotoGoogle.resolveActivity(getPackageManager()) != null) {
                    startActivity(gotoGoogle);
                }
            }
        });


        ImageView facebookLink = (ImageView) findViewById(R.id.facebookLink);
        facebookLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String facebook = "https://www.facebook.com/meatandbarrel";
                Uri facebookaddress = Uri.parse(facebook);

                Intent gotoFacebook = new Intent(Intent.ACTION_VIEW, facebookaddress);
                if (gotoFacebook.resolveActivity(getPackageManager()) != null) {
                    startActivity(gotoFacebook);
                }
            }
        });

        ImageView mapLink = (ImageView) findViewById(R.id.mapIcon);
        mapLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String maps = "https://www.google.com/maps?rlz=1C1CHBF_en-GBGB813GB813&sxsrf=ALeKk00gclvCRIcgwSRAaHeS033cVK9Bpg:1612609331736&q=meat+and+barrel&gs_lcp=CgZwc3ktYWIQAxgAMgQIIxAnMgsILhDHARCvARCRAjIFCAAQsQMyBQguELEDMgIILjIFCAAQsQMyBwgAEBQQhwIyAggAMgIIADICCAA6BQgAEJECOgQILhBDOgsILhCxAxDHARCjAjoICAAQsQMQgwE6BAgAEEM6CgguEMcBEK8BEEM6CAguELEDEIMBOgsILhCxAxDHARCvAToHCC4QFBCHAjoHCAAQsQMQQzoKCAAQsQMQFBCHAjoICC4QxwEQrwE6CgguEMcBEK8BEAo6BAgAEAo6DQguEMcBEK8BEAoQkwI6BAguEApQ1QtYshtgkCNoA3AAeACAAc4CiAHQCZIBBzEuNy4wLjGYAQCgAQGqAQdnd3Mtd2l6wAEB&um=1&ie=UTF-8&sa=X&ved=2ahUKEwjrppSLlNXuAhXLVRUIHV-kCT8Q_AUoAXoECAcQAw";
                Uri googleMaps = Uri.parse(maps);

                Intent gotoMaps = new Intent(Intent.ACTION_VIEW, googleMaps);
                if (gotoMaps.resolveActivity(getPackageManager()) != null) {
                    startActivity(gotoMaps);
                }
            }
        });


    }

    public void flipperImages(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(4000);
        v_flipper.setAutoStart(true);

        v_flipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }

    public void showToastSmokingArea(){
        LayoutInflater smokingAreaInflater = getLayoutInflater();
        View smokingAreaLayout = smokingAreaInflater.inflate(R.layout.smokingareaicon, (ViewGroup) findViewById(R.id.smokingLayout));
        Toast smokingAreaToast = new Toast(getApplicationContext());
        smokingAreaToast.setGravity(Gravity.CENTER, 0,0);
        smokingAreaToast.setDuration(Toast.LENGTH_SHORT);
        smokingAreaToast.setView(smokingAreaLayout);
        smokingAreaToast.show();
    }

    public void showToastDisabled(){
        LayoutInflater disabledInflater = getLayoutInflater();
        View disabledLayout = disabledInflater.inflate(R.layout.disabledicon, (ViewGroup) findViewById(R.id.disabledLayout));
        Toast disabledToast = new Toast(getApplicationContext());
        disabledToast.setGravity(Gravity.CENTER, 0,0);
        disabledToast.setDuration(Toast.LENGTH_SHORT);
        disabledToast.setView(disabledLayout);
        disabledToast.show();
    }

    public void showToastWifi(){
        LayoutInflater wifiInflater = getLayoutInflater();
        View wifiLayout = wifiInflater.inflate(R.layout.wifiicon, (ViewGroup) findViewById(R.id.wifiLayout));
        Toast wifiToast = new Toast(getApplicationContext());
        wifiToast.setGravity(Gravity.CENTER, 0,0);
        wifiToast.setDuration(Toast.LENGTH_SHORT);
        wifiToast.setView(wifiLayout);
        wifiToast.show();
    }

    public void showToastMask(){
        LayoutInflater maskInflater = getLayoutInflater();
        View maskLayout = maskInflater.inflate(R.layout.maskicon, (ViewGroup) findViewById(R.id.maskLayout));
        Toast maskToast = new Toast(getApplicationContext());
        maskToast.setGravity(Gravity.CENTER, 0,0);
        maskToast.setDuration(Toast.LENGTH_SHORT);
        maskToast.setView(maskLayout);
        maskToast.show();
    }

    public void showToastTakeaway(){
        LayoutInflater takeawayInflater = getLayoutInflater();
        View maskLayout = takeawayInflater.inflate(R.layout.takeawayicon, (ViewGroup) findViewById(R.id.takeawayLayout));
        Toast takeawayToast = new Toast(getApplicationContext());
        takeawayToast.setGravity(Gravity.CENTER, 0,0);
        takeawayToast.setDuration(Toast.LENGTH_SHORT);
        takeawayToast.setView(maskLayout);
        takeawayToast.show();
    }
}