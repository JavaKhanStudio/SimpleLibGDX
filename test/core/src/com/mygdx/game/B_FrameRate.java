package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class B_FrameRate extends ApplicationAdapter 
{
	
	public static void main (String[] arg) 
	{
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
//		config.foregroundFPS = 10 ;
//		config.foregroundFPS = 30 ;
		config.foregroundFPS = 60 ;
//		config.foregroundFPS = 150 ;
		
		config.backgroundFPS = 0 ;
//		config.backgroundFPS = -1 ;
		new LwjglApplication(new B_FrameRate(), config);
	}
	
	SpriteBatch batch;
	Texture img;
	
	int valueX = 0 ; 
	
	@Override
	public void create () 
	{
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}

	/**
	 *
	 */
	@Override
	public void render () 
	{
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		Gdx.graphics.setTitle("My current FrameRate " + Gdx.graphics.getFramesPerSecond());
		
		batch.begin();
		
		
		valueX++ ; 
//		valueX += 100 * Gdx.graphics.getDeltaTime(); 
		batch.draw(img, valueX, 0);
		batch.end();
	}
	
	@Override
	public void dispose () 
	{
		batch.dispose();
		img.dispose();
	}
}