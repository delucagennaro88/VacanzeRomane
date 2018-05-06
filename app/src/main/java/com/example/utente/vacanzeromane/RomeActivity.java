package com.example.utente.vacanzeromane;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class RomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_profile);

        Bundle bundle = getIntent().getExtras();
        assert bundle != null;

        String nameTour = bundle.getString(getString(R.string.tour_name));
        final String categoryTour = bundle.getString(getString(R.string.tour_category));
        final String infoTour = bundle.getString(getString(R.string.tour_info));
        final int imageTour = bundle.getInt(getString(R.string.tour_pic));

        this.setTitle(categoryTour);

        TextView TourView = findViewById(R.id.tour_title);
        TourView.setText(nameTour);

        TextView descView = findViewById(R.id.tour_description);
        descView.setText(infoTour);

        ImageView picView = findViewById(R.id.tour_picture);
        picView.setImageResource(imageTour);

    }
}
