package com.elvodqa.gameplay;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.awt.*;

public class PlayArea {
    public final int width = 640;
    public final int height = 480;
    private final ShapeRenderer shapeRenderer;

    public PlayArea() {
        shapeRenderer = new ShapeRenderer();
    }
    public void render() {
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        int x = (Gdx.graphics.getWidth()) / 2 - (320);
        int y = (Gdx.graphics.getHeight()) / 2 - (240);

        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(Color.WHITE);
        shapeRenderer.rect(x,y,width,height);
        shapeRenderer.end();

    }

}
