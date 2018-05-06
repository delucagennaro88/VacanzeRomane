package com.example.utente.vacanzeromane;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TourAdapter extends ArrayAdapter<Tour> {

    private Context context = getContext();

    public TourAdapter(Activity context, ArrayList<Tour> tour) {
        super(context, 0, tour);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Tour currentTour = getItem(position);

        TextView tourTextView = listItemView.findViewById(R.id.current_tour_name);

        assert currentTour != null;
        tourTextView.setText(currentTour.getNameTour());

        TextView infoTextView = listItemView.findViewById(R.id.current_tour_info);

        infoTextView.setText(currentTour.getInfoTour());

        ImageView imageTour = listItemView.findViewById(R.id.current_tour_pic);

        if (currentTour.hasImage()) {

            imageTour.setImageResource(currentTour.getImageTour());

            imageTour.setVisibility(View.VISIBLE);

        } else {

            imageTour.setVisibility(View.GONE);
        }

        String categoryTour = currentTour.getCategoryTour();
        String nameTour = currentTour.getNameTour();
        String tourInfo = currentTour.getDescTour();
        int picTour = currentTour.getImageTour();

        final Intent itemIntent = new Intent(context, RomeActivity.class);

        itemIntent.putExtra(context.getString(R.string.tour_category), categoryTour);
        itemIntent.putExtra(context.getString(R.string.tour_name), nameTour);
        itemIntent.putExtra(context.getString(R.string.tour_info), tourInfo);
        itemIntent.putExtra(context.getString(R.string.tour_pic), picTour);

        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(itemIntent);
            }});

        return listItemView;
    }
}