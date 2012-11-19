package com.nozimmy.breakdancer;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Breakdancer extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_breakdancer);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_breakdancer, menu);
		return true;
	}

}
