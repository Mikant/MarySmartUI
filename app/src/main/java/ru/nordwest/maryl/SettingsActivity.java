package ru.nordwest.maryl;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Denis on 13/10/16.
 */

public class SettingsActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Display the fragment as the main content.
        getFragmentManager()
                .beginTransaction()
                .replace(android.R.id.content, new SettingsFragment())
                .commit();
    }
}
