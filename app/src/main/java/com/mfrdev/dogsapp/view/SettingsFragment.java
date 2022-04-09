package com.mfrdev.dogsapp.view;


import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

import com.mfrdev.dogsapp.R;

public class SettingsFragment extends PreferenceFragmentCompat {


    public SettingsFragment() {
    }

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.settings, rootKey);
    }

}
