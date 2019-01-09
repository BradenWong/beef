package com.hfad.beef;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class Home extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @SuppressWarnings("StatementWithEmptyBody")
        @Override
        public boolean onNavigationItemSelected(MenuItem item) {
            int id = item.getItemId();

            Fragment newFragment = null;

            if (id == R.id.navigation_list) {
                newFragment = new ListFragment();
                FragmentManager fm = getSupportFragmentManager();
                //doing a bunch of stuff before commit
                fm.beginTransaction()
                        .replace(R.id.fragment_container, newFragment)
                        .setTransition(1)
                        .commit();
            }
            if (id == R.id.navigation_home) {
                newFragment = new HomeFragment();
                FragmentManager fm = getSupportFragmentManager();
                //doing a bunch of stuff before commit
                fm.beginTransaction()
                        .replace(R.id.fragment_container, newFragment)
                        .setTransition(1)
                        .commit();
            }
            if (id == R.id.navigation_notifications){
                newFragment = new Sources();
                FragmentManager fm = getSupportFragmentManager();
                fm.beginTransaction()
                        .replace(R.id.fragment_container, newFragment)
                        .setTransition(1)
                        .commit();
            }

            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
}
