package com.openclassrooms.realestatemanageroc.async;

import android.os.AsyncTask;

import com.openclassrooms.realestatemanageroc.db.RealEstateDao;
import com.openclassrooms.realestatemanageroc.model.RealEstate;

public class AsyncDBSelect extends AsyncTask<RealEstate, Void, Void> {

    private RealEstateDao dao;

    public AsyncDBSelect(RealEstateDao dao) {
        this.dao = dao;
    }

    @Override
    protected Void doInBackground(RealEstate... realEstates) {
      //  dao.getRealEstateWithCursor(realEstates);
        return null;
    }
}
