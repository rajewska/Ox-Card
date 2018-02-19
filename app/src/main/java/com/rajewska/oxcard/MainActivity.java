package com.rajewska.oxcard;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

// This code sends to email

public void contactUs (View view) {
    Intent contactOx = new Intent(Intent.ACTION_VIEW);
    Uri data = Uri.parse("mailto:hello@oxcollective.com");
    contactOx.setData(data);
    startActivity(contactOx);
}

// This code opens the Ox webpage

public void showWeb (View view) {
    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://oxcollective.com/"));
    startActivity(browserIntent);
}

// This code open the map and shows location

 public void showOnMap (View view) {
     Intent showAddress = new Intent(android.content.Intent.ACTION_VIEW,
             Uri.parse("https://www.google.com/maps/place/Oranienstraße+6,+10997+Berlin/@52.4998612,13.4228667,17z/data=!3m1!4b1!4m5!3m4!1s0x47a84e350a669333:0x3dc79e96d74bd57b!8m2!3d52.4998612!4d13.4250607?"));
     startActivity(showAddress);
 }


}
