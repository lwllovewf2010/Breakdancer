package com.nozimmy.breakdancer;

import android.content.Context;
import android.opengl.GLSurfaceView;

public class MyGLView extends GLSurfaceView
{

	MyRenderer myRenderer;

	public MyGLView(Context context)
	{
		super(context);
		myRenderer = new MyRenderer();
		setRenderer(myRenderer);
	}
	
	public void rotateView(float r)
	{
		myRenderer.setRoatation(r);
	}

}
