package com.example.utente.vacanzeromane;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Piazze extends Fragment {

    public Piazze() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_layout, container, false);

        final ArrayList<Tour> tour = new ArrayList<>();

        tour.add(new Tour(getString(R.string.piazze_cat), getString(R.string.sanPietro), getString(R.string.sanPietroDesc), getString(R.string.infoSanPietro), R.drawable.sanpietro_pic));

        tour.add(new Tour(getString(R.string.piazze_cat), getString(R.string.delPopolo), getString(R.string.delPopoloDesc), getString(R.string.infodelPopolo), R.drawable.delpopolo_pic));

        tour.add(new Tour(getString(R.string.piazze_cat), getString(R.string.dellaRotonda), getString(R.string.dellaRotondaDesc), getString(R.string.infoRotonda), R.drawable.dellarotonda_pic));

        tour.add(new Tour(getString(R.string.piazze_cat), getString(R.string.Navona), getString(R.string.NavonaDesc), getString(R.string.infoNavona), R.drawable.navona_pic));

        TourAdapter placeAdapter = new TourAdapter(getActivity(), tour);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(placeAdapter);

        return rootView;
    }
}
