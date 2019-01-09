package com.hfad.beef;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class beefListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beef_list);
        /*ArrayAdapter<beef> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, beef.beefs);
        ListView listBeefs = (ListView) findViewById(R.id.list_beefs);
        listBeefs.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listBeef, View itemView, int position, long id) {
                Intent intent = new Intent(beefListActivity.this, beefActivity.class);
                intent.putExtra(beefActivity.EXTRA_BEEFID, (int) id);
                startActivity(intent);
            }
        };
        listBeefs.setOnItemClickListener(itemClickListener);*/

    }
}