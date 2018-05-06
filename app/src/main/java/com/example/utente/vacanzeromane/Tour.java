package com.example.utente.vacanzeromane;

public class Tour {

    private static final int NO_IMAGE_PROVIDED = -1;

    private String mCategoryTour;

    private String mNameTour;

    private String mInfoTour;

    private String mDescTour;

    private int mImageTour = NO_IMAGE_PROVIDED;

    public Tour(String categoryTour, String nameTour, String descTour, String infoTour, int imageResourceId) {
        mCategoryTour = categoryTour;
        mNameTour = nameTour;
        mDescTour = descTour;
        mInfoTour = infoTour;
        mImageTour = imageResourceId;
    }

    public String getCategoryTour() {
        return mCategoryTour;
    }

    public String getNameTour() {
        return mNameTour;
    }

    public String getDescTour() {
        return mDescTour;
    }

    public String getInfoTour() {
        return mInfoTour;
    }

    public Integer getImageTour() {
        return mImageTour;
    }

    public boolean hasImage() {
        return mImageTour != NO_IMAGE_PROVIDED;
    }
}
