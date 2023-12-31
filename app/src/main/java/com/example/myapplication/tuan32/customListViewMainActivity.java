package com.example.myapplication.tuan32;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplication.R;

import java.util.ArrayList;

public class customListViewMainActivity extends AppCompatActivity {
    ListView lvContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customlv_main);
        lvContact = findViewById(R.id.customLv);
        ArrayList<contact> arrContact = new ArrayList<>();
        contact contact1 = new contact("Nguyen Van A","0123456789","Red");
        contact contact2 = new contact("Nguyen Van B","0123456789","Red");
        arrContact.add(contact1);
        arrContact.add(contact2);

        customAdapter adapter = new customAdapter(this,R.layout.item_list_view,arrContact);
        lvContact.setAdapter(adapter);

    }
}