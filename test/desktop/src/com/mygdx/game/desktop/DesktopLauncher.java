package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.E_1_GravityAndControls;
import com.mygdx.game.E_2_Gravity;

public class DesktopLauncher 
{
	public static void main (String[] arg) 
	{
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
	
//		new LwjglApplication(new A_MyGdxGame(), config);
//		new LwjglApplication(new B_FrameRate(), config);
//		new LwjglApplication(new C_AddingSprite(), config);
//		new LwjglApplication(new C_AddingSprite(), config);
//		new LwjglApplication(new E_1_GravityAndControls(), config);
		new LwjglApplication(new E_2_Gravity(), config);
	}
}
