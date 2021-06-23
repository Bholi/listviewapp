package com.bholi.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    String s [] = {"This", "is", " my name", "bholi", "Ansari","This", "is", " my name", "bholi", "Ansari","This", "is", " my name", "bholi", "Ansari"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = findViewById(R.id.listview);
        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, s);
        listview.setAdapter(ad);
    }
}