package com.example.utente.vacanzeromane;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Palazzi extends Fragment {

    public Palazzi() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_layout, container, false);

        final ArrayList<Tour> tour = new ArrayList<>();

        tour.add(new Tour(getString(R.string.palazzi_cat), getString(R.string.quirinale), getString(R.string.quirinaleDesc), getString(R.string.infoQuirinale), R.drawable.quirinale_pic));

        tour.add(new Tour(getString(R.string.palazzi_cat), getString(R.string.montecitorio), getString(R.string.montecitorioDesc), getString(R.string.infoMontecitorio), R.drawable.montecitorio_pic));

        tour.add(new Tour(getString(R.string.palazzi_cat), getString(R.string.farnese), getString(R.string.farneseDesc), getString(R.string.infoFarnese), R.drawable.farnese_pic));

        tour.add(new Tour(getString(R.string.palazzi_cat), getString(R.string.odescalchi), getString(R.string.odescalchiDesc), getString(R.string.infoOdescalchi), R.drawable.odescalchi_pic));

        TourAdapter placeAdapter = new TourAdapter(getActivity(), tour);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(placeAdapter);

        return rootView;
    }
}
