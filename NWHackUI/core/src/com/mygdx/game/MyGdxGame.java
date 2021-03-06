package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.ui.ProgressBar;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	ProgressBar health;
    ProgressBar experience;

	@Override
	public void create () {
		batch = new SpriteBatch();

        //ProgressBar.ProgressBarStyle progressStyle = new ProgressBar.ProgressBarStyle();

        //health = new ProgressBar(0, 100, 1, false, progressStyle);
	}

    @Override
	public void render () {
		Gdx.gl.glClearColor(0.3f, 0.4f, 0.3f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
        //health.draw(batch, 1);
		batch.end();
	}
}
