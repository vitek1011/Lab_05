package com.example.lab_05;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainActivity extends AppCompatActivity {

    private TextView catInfo;
    private View colorInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        catInfo = findViewById(R.id.catInfo);
        colorInfo = findViewById(R.id.colorInfo);

        Cat cat = new Cat("Мурзик", 5, Color.BLACK);

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        String resultGson = gson.toJson(cat);
        Log.i("GSON", resultGson);

        String jsonText = "{'name':'Мурзик','color':-16777216,'age':8}";
//        System.out.println(resultGson);

        Cat receivedCat = gson.fromJson(jsonText, Cat.class);

        catInfo.setText(receivedCat.toString());
        colorInfo.setBackgroundColor(receivedCat.color);
    }
}
