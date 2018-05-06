package com.example.utente.vacanzeromane;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Basiliche extends Fragment {

    public Basiliche() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_layout, container, false);

        final ArrayList<Tour> tour = new ArrayList<>();

        tour.add(new Tour(getString(R.string.basiliche_cat), getString(R.string.vaticana), getString(R.string.vaticanaDesc), getString(R.string.infoVaticana), R.drawable.vaticana_pic));

        tour.add(new Tour(getString(R.string.basiliche_cat), getString(R.string.fuorimura), getString(R.string.fuorimuraDesc), getString(R.string.infoFuorimura), R.drawable.fuorilemura_pic));

        tour.add(new Tour(getString(R.string.basiliche_cat), getString(R.string.maggiore), getString(R.string.maggioreDesc), getString(R.string.infoMaggiore), R.drawable.maggiore_pic));

        tour.add(new Tour(getString(R.string.basiliche_cat), getString(R.string.laterano), getString(R.string.lateranoDesc), getString(R.string.infoLaterano), R.drawable.laterano_pic));

        TourAdapter placeAdapter = new TourAdapter(getActivity(), tour);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(placeAdapter);

        return rootView;
    }
}
