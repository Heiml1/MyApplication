package com.example.myapplication.tuan21;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.myapplication.R;

public class tuan22MainActivity extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan22_main);
        lv = findViewById(R.id.tuan22Listview);
        String[] arr = new String[]{"Mon 1","Tuan 2","Mon 3","Mon 4","Mon 6","Tuan 6","aaa","bbb"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arr);
        lv.setAdapter(adapter);


    }

}