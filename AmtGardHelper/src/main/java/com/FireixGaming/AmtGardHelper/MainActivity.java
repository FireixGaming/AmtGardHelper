package com.FireixGaming.AmtGardHelper;

import roboguice.activity.RoboSherlockFragmentActivity;
import android.os.Bundle;

import com.actionbarsherlock.view.Menu;

public class MainActivity extends RoboSherlockFragmentActivity  {

    /**
     * Called when the activity is first created.
     * @param savedInstanceState If the activity is being re-initialized after 
     * previously being shut down then this Bundle contains the data it most 
     * recently supplied in onSaveInstanceState(Bundle). <b>Note: Otherwise it is null.</b>
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ThemeUtils.ApplyTheme(this);
        setContentView(R.layout.activity_main);
    }


    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	getSupportMenuInflater().inflate(com.FireixGaming.AmtGardHelper.R.menu.main, menu);
	return true;
    }

}

