package com.example.phoneapp;

import android.app.Activity;
import android.os.Bundle;

public class ActivityTwo extends Activity {
	
	@Override
	  protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.two);
	    super.onBackPressed();
	  }
	

}
