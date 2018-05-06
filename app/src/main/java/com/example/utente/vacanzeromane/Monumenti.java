package com.example.utente.vacanzeromane;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Monumenti extends Fragment {

    public Monumenti() {

    }

    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.list_layout, container, false);

        final ArrayList<Tour> tour = new ArrayList<>();

        tour.add(new Tour(getString(R.string.monumenti_cat), getString(R.string.colosseo), getString(R.string.colosseoDesc), getString(R.string.infoColosseo), R.drawable.colosseo_pic));

        tour.add(new Tour(getString(R.string.monumenti_cat), getString(R.string.severo), getString(R.string.severoDesc), getString(R.string.infoSevero), R.drawable.severo_pic));

        tour.add(new Tour(getString(R.string.monumenti_cat), getString(R.string.tiberina), getString(R.string.tiberinaDesc), getString(R.string.infoTiberina), R.drawable.tiberina_pic));

        tour.add(new Tour(getString(R.string.monumenti_cat), getString(R.string.cestia), getString(R.string.cestiaDesc), getString(R.string.infoCestia), R.drawable.cestia_pic));

        TourAdapter placeAdapter = new TourAdapter(getActivity(), tour);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(placeAdapter);

        return rootView;
    }
}
