package com.polus.multipanefragment;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;

public class DetailActivity extends Activity{

	
	public static String fruit_set = "";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
		{
			finish();
			return;
		}
		
		setContentView(R.layout.detail_activity);
		
		Bundle extras = getIntent().getExtras();
		
		if(extras != null)
		{
			String name = extras.getString(fruit_set);
			
			DetailFragment detailFragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detailfragment);
			detailFragment.setMessage(name);
		}
	}
}
