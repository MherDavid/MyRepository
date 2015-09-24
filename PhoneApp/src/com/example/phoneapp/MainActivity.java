package com.example.phoneapp;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends Activity implements
		SeekBar.OnSeekBarChangeListener {
	
	private TextView myTextValue;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ListView listView = (ListView) findViewById(R.id.myListView);
		myTextValue = (TextView) findViewById(R.id.myTextView);
		final SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);
		seekBar.setOnSeekBarChangeListener(this);
		Button myButton = (Button) findViewById(R.id.myButton);
		myButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			    	Intent intent = new Intent(MainActivity.this, ActivityTwo.class);
				      startActivity(intent);	 
			}
		});
		
		List<String> nameList = new ArrayList<>();

		for (int i = 0; i < 1000; ++i) {
			String name = "Name " + Integer.toString(i);
			nameList.add(name);
		}

		ArrayAdapter<String> gugoAdapter = new ArrayAdapter<>(this,
				android.R.layout.simple_list_item_1, nameList);

		listView.setAdapter(gugoAdapter);

	}

	@Override
	public void onProgressChanged(SeekBar seekBar, int progress,
			boolean fromUser) {
		// TODO Auto-generated method stub
		myTextValue.setText("Значение: "+String.valueOf(seekBar.getProgress()));
	}

	@Override
	public void onStartTrackingTouch(SeekBar seekBar) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onStopTrackingTouch(SeekBar seekBar) {
		// TODO Auto-generated method stub
		myTextValue.setText("Значение: "+String.valueOf(seekBar.getProgress()));
	}

}
