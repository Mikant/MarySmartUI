package ru.nordwest.maryl;

import android.os.Bundle;
import android.preference.PreferenceFragment;

public class SettingsFragment extends PreferenceFragment {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(ru.nordwest.maryl.R.xml.settings);
    }

    /*
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //getView().setBackgroundColor(ContextCompat.getColor(getContext(), R.color.colorPrimary));
        getView().setClickable(true);
    }
    */
}