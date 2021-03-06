package ru.nordwest.maryl;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(ru.nordwest.maryl.R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(ru.nordwest.maryl.R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(ru.nordwest.maryl.R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case ru.nordwest.maryl.R.id.action_settings:

            {
                Intent intent = new Intent(this, SettingsActivity.class);
                startActivity(intent);
            }

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
