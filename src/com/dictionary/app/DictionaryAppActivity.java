package com.dictionary.app;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DictionaryAppActivity extends ListActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item,
				OPTIONS));

		ListView lv = getListView();
		lv.setTextFilterEnabled(true);

		lv.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				
				Intent i;
				
				switch (position) {
				case 0: //Search through the dictionary
					i = new Intent(DictionaryAppActivity.this, SearchableDictionary.class);
					startActivityForResult(i, 0);
					//startActivity(i);
					break;
				case 1: // Daily word
					i = new Intent(DictionaryAppActivity.this, Daily.class);
					startActivity(i);
					break;
				case 2: // Display favorites words
					i = new Intent(DictionaryAppActivity.this, Favorites.class);
					startActivity(i);
					break;
				case 3: // Display setting page
					i = new Intent(DictionaryAppActivity.this, Setting.class);
					startActivityForResult(i, 0);
					break;
				}
			}
		});

	}
	static final String[] OPTIONS = new String[] { "Search",
			"Daily", "Favorites", "Setting"};
}
