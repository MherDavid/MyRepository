package com.example.phoneapp;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.app.Activity;


public class MainActivity extends Activity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ListView gugonerView = (ListView) findViewById(R.id.myListView);

		
		List<String> gugonerList = new ArrayList<>();
		
		for (int i = 0; i < 1000; ++i) {
			String gugo = "Gugo #" + Integer.toString(i);
			gugonerList.add(gugo);
		}
		
		ArrayAdapter<String> gugoAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, gugonerList);
		
		gugonerView.setAdapter(gugoAdapter);

	}

}
