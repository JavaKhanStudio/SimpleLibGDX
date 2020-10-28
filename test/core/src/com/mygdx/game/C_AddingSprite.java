package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Animation.PlayMode;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;

public class C_AddingSprite extends ApplicationAdapter
{
	
	public static void main (String[] arg) 
	{
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new C_AddingSprite(), config);
	}
	
	
	public Animation<TextureRegion> currentState ;
	public TextureRegion currentFrame ; 
	SpriteBatch batch;
	
	float stateTime ; 
	
	@Override
	public void create () 
	{
		batch = new SpriteBatch();
		
		TextureAtlas textureAtlas = new TextureAtlas(Gdx.files.internal("jumpAtlas.atlas"));
		Array<AtlasRegion> regions = textureAtlas.findRegions("Pouki_An_Jump_v02") ;
		currentState = new Animation(0.030f, regions) ;
//		currentState = new Animation(0.0130f, regions) ;
		
		currentState.setPlayMode(PlayMode.LOOP);
	}

	@Override
	public void render () 
	{
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
				
		stateTime += Gdx.graphics.getDeltaTime();
		currentFrame = currentState.getKeyFrame(stateTime, PlayMode.LOOP == currentState.getPlayMode());
		batch.begin();
		batch.draw(currentFrame, 0, 0, currentFrame.getRegionWidth(), currentFrame.getRegionHeight()); 
		batch.end(); 
	}

}