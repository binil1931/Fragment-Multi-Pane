package com.polus.multipanefragment;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity implements MyListFragment.Communication {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.polus.multipanefragment.R.layout.activity_main);
   
    }



	@Override
	public void Message(String fruit) {
		// TODO Auto-generated method stub
		
		Log.e("tag ", "name  fruit " + fruit);
		
		DetailFragment detail_fragment = (DetailFragment) getFragmentManager().findFragmentById(com.polus.multipanefragment.R.id.detail_fragment);
		
		if(detail_fragment != null && detail_fragment.isInLayout())
		{
			detail_fragment.setMessage(fruit);
		}
		else
		{
			Intent intent = new Intent(getApplicationContext(),DetailActivity.class);
			Bundle extras = new Bundle();
			extras.putString(DetailActivity.fruit_set, fruit);
			intent.putExtras(extras);
			
			startActivity(intent);
		}
		
	}
}
