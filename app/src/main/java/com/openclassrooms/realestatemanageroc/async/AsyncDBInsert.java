package com.openclassrooms.realestatemanageroc.async;

import android.os.AsyncTask;

import com.openclassrooms.realestatemanageroc.db.RealEstateDao;
import com.openclassrooms.realestatemanageroc.model.RealEstate;

public class AsyncDBInsert extends AsyncTask<RealEstate, Void, Void> {

    private RealEstateDao dao;

    public AsyncDBInsert(RealEstateDao dao) {
        this.dao = dao;
    }

    @Override
    protected Void doInBackground(RealEstate... realEstates) {
        dao.insertRealEstate(realEstates);
        return null;
    }
}
