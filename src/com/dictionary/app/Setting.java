package com.dictionary.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Setting extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.setting);
		String array_spinner[];
		String array_spinner1[];
		//@Override
		array_spinner=new String[5];
		array_spinner[0]="Red";
		array_spinner[1]="White";
		array_spinner[2]="Black";
		array_spinner[3]="Green";
		array_spinner[4]="Yellow";
		Spinner s = (Spinner) findViewById(R.id.Spinner01);
		ArrayAdapter<CharSequence> adapter = new ArrayAdapter<CharSequence>(this,
		android.R.layout.simple_list_item_multiple_choice, array_spinner);
		s.setAdapter(adapter);
		
		///
		array_spinner1=new String[3];
		array_spinner1[0]="Normal";
		array_spinner1[1]="Small";
		array_spinner1[2]="Large";
		
		Spinner sr = (Spinner) findViewById(R.id.Spinner02);
		ArrayAdapter<CharSequence> adapter1 = new ArrayAdapter<CharSequence>(this,
		android.R.layout.simple_list_item_multiple_choice, array_spinner1);
		sr.setAdapter(adapter1);
		
	}
	

}
