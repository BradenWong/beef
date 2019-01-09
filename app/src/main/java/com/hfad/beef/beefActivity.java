package com.hfad.beef;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class beefActivity extends Activity {
    public static final String EXTRA_BEEFID = "beefId";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beef);

        int beefId = (Integer) getIntent().getExtras().get(EXTRA_BEEFID);
        beef beefs = beef.beefs[beefId];

        TextView name = (TextView)findViewById(R.id.name);
        name.setText(beefs.getName());

        TextView description = (TextView) findViewById(R.id.description);
        description.setText(beefs.getDescription());

        TextView cookingdescription = (TextView) findViewById(R.id.cookingdescription);
        cookingdescription.setText(beefs.getCookingDescription());

        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource((beefs.getImageResourceId()));
        photo.setContentDescription(beefs.getName());
    }
}
