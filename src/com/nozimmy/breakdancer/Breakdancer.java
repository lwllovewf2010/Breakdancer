package com.nozimmy.breakdancer;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

// Main class
//
public class Breakdancer extends Activity 
{

	MyGLView myGLView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		myGLView = new MyGLView(this);
		setContentView(myGLView);
	}

	@Override
	protected void onResume()
	{
		super.onResume();
		myGLView.onResume();
	}
	  
	@Override
	protected void onPause()
	{
		super.onPause();
		myGLView.onPause();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_breakdancer, menu);
		return true;
	}

}
