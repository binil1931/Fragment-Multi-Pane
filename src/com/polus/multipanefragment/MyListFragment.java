package com.polus.multipanefragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MyListFragment extends Fragment implements OnClickListener {

	Button apple,orange,bannana;
	
	private Communication communicator;
	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
		
		if(activity instanceof Communication)
		{
			communicator = (Communication) activity;
		}
		else
		{
			throw new ClassCastException(activity.toString() + "value will not pass" );
		}
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		View view = inflater.inflate(R.layout.list_fragment, container,false);
		
		apple   = (Button) view.findViewById(R.id.apple);
		orange  = (Button) view.findViewById(R.id.orange);
		bannana = (Button) view.findViewById(R.id.bannana);
		
		
		apple.setOnClickListener(this);
		orange.setOnClickListener(this);
		bannana.setOnClickListener(this);
		
		return view;
	}
	
	
	public interface Communication {

		public void Message(String fruit);
	}

	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.apple:
			updateMessage("Apple");
			break;
			
		case R.id.orange:
			updateMessage("Orange");
			break;
			
		case R.id.bannana:
			updateMessage("Bannana");
			break;
			
		default:
			break;
		}
		
	}

	private void updateMessage(String fruit) 
	{
		Log.e("tag ", "name " + fruit);
		communicator.Message(fruit);
	}
	
	

}
