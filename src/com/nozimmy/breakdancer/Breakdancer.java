package com.nozimmy.breakdancer;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class Breakdancer extends Activity implements OnTouchListener
{
	MyGLView myGLView;
	float initPos;
	float dragDist;
	
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
	public boolean onTouch(View v, MotionEvent event) {
		int action = event.getAction() & MotionEvent.ACTION_MASK;
		switch (action) {
		case MotionEvent.ACTION_DOWN:
		case MotionEvent.ACTION_POINTER_DOWN:
			dragDist = 0;
			initPos = event.getX();
			break;
		case MotionEvent.ACTION_UP:
		case MotionEvent.ACTION_POINTER_UP:
		case MotionEvent.ACTION_OUTSIDE:
		case MotionEvent.ACTION_CANCEL:
		case MotionEvent.ACTION_MOVE:
			dragDist = event.getX() - initPos;
			initPos = event.getX();
			break;
		}
		myGLView.rotateView(dragDist / 2);
		
		return true;
	}

}
