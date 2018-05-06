package com.example.utente.vacanzeromane;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TourPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public TourPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            return new Piazze();
        } else if (position == 1) {
            return new Palazzi();
        } else if (position == 2) {
            return new Basiliche();
        } else {
            return new Monumenti();
        }
    }

    @Override
    public int getCount() {

        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        if (position == 0) {
            return mContext.getString(R.string.piazze_cat);
        } else if (position == 1) {
            return mContext.getString(R.string.palazzi_cat);
        } else if (position == 2) {
            return mContext.getString(R.string.basiliche_cat);
        } else {
            return mContext.getString(R.string.monumenti_cat);
        }
    }
}
