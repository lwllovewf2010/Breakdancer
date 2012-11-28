package com.nozimmy.breakdancer;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class MotherCube extends Activity implements OnTouchListener
{
	MyGLView myGLView;
	float initPosX;
	float dragDistX;
	float initPosY;
	float dragDistY;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		myGLView = new MyGLView(this);
		myGLView.setOnTouchListener((OnTouchListener) this);
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

	@Override
	public boolean onTouch(View v, MotionEvent event)
	{
		int action = event.getAction() & MotionEvent.ACTION_MASK;
		switch (action) {
		case MotionEvent.ACTION_DOWN:
		case MotionEvent.ACTION_POINTER_DOWN:
			dragDistX = 0;
			initPosX = event.getX();
			dragDistY = 0;
			initPosY = event.getY();
			break;
		case MotionEvent.ACTION_UP:
		case MotionEvent.ACTION_POINTER_UP:
		case MotionEvent.ACTION_OUTSIDE:
		case MotionEvent.ACTION_CANCEL:
		case MotionEvent.ACTION_MOVE:
			dragDistX = event.getX() - initPosX;
			initPosX = event.getX();
			dragDistY = event.getY() - initPosY;
			initPosY = event.getY();
			break;
		}
		myGLView.rotateView(dragDistX / 2, dragDistY / 2);
		
		return true;
	}

}
