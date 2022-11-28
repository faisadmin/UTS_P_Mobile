package com.example.liblaresmusic;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity2 extends Activity {

    ListView simpleList;
    String countryList[] = {"Selfi Yamma-Aku Rindu ayah", "Felix Irwan-Gereja Tua", "Fresly Nikijuluw-Mantan", "Wizz Baker-Kenapa Begitu",};
    int flags[] = {R.drawable.ayah, R.drawable.gereja, R.drawable.mantan, R.drawable.wizz,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList = (ListView) findViewById(R.id.simpleListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), countryList, flags);
        simpleList.setAdapter(customAdapter);
    }
}