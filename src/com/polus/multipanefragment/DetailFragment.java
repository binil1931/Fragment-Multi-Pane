package com.polus.multipanefragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



public class DetailFragment extends Fragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		View view = inflater.inflate(R.layout.detail_fragment, container,false);
		return view;
	}

	public void setMessage(String message)
	{
		TextView textView1 = (TextView) getView().findViewById(R.id.textView1);
		textView1.setText(message);
	}
}
