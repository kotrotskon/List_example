package com.example.list_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.list);

        String[] colors = {"Black", "Red", "Blue", "Green", "Yellow", "Orange", "Pink", "Brown"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, R.layout.item, R.id.textView, colors);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                TextView txtVw = (TextView) view.findViewById(R.id.textView);
                Log.d("ITEM_CLICK", txtVw.getText().toString());
            }
        });
    }
}