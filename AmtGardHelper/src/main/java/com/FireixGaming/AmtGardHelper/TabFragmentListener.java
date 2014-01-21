package com.FireixGaming.AmtGardHelper;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.app.ActionBar.TabListener;

import roboguice.fragment.RoboSherlockFragment;

public class TabFragmentListener extends RoboSherlockFragment implements TabListener {

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onViewCreated(view, savedInstanceState);
		ActionBar ab = getSherlockActivity().getSupportActionBar();
		if (savedInstanceState == null) {
			ActionBar.Tab orkTab= ab.newTab().setText(getResources().getString(R.string.ork_title)).setTabListener(this);
			ab.addTab(orkTab);
			ActionBar.Tab spellsTab= ab.newTab().setText(getResources().getString(R.string.spells_title)).setTabListener(this); 
			ab.addTab(spellsTab);
			ActionBar.Tab rulesTab= ab.newTab().setText(getResources().getString(R.string.rules_title)).setTabListener(this);
			ab.addTab(rulesTab);
			ActionBar.Tab favoritesTab= ab.newTab().setText(getResources().getString(R.string.favorites_title)).setTabListener(this);
			ab.addTab(favoritesTab);
			
			
			
	}
	
	}

}

