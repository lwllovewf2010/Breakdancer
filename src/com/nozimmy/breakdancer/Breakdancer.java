package com.nozimmy.breakdancer;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.Toast;

public class Breakdancer extends Activity implements OnTouchListener
{
	Button danceButton;
	Button settingsButton;
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_breakdancer);		
		
		danceButton = (Button)findViewById(R.id.BeginDance);
		danceButton.setOnClickListener(btnListener);
		
		settingsButton = (Button)findViewById(R.id.Settings);
		settingsButton.setOnClickListener(btnListener);
	}
	
	private OnClickListener btnListener = new OnClickListener()
	{
		public void onClick(View v)
		{
			/*Toast.makeText(getBaseContext(),
					((Button) v).getText() + "was pushed",
					Toast.LENGTH_SHORT).show();*/
			Intent intent = new Intent(Breakdancer.this, MotherCube.class);
			startActivity(intent);
		}
	};

	@Override
	public boolean onTouch(View v, MotionEvent event) 
	{
		// TODO Auto-generated method stub
		return false;
	}

}
