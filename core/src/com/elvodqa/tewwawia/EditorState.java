package com.elvodqa.tewwawia;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.elvodqa.gameplay.PlayArea;

public class EditorState implements Screen {
    tewwawiaGame game;
    BitmapFont font = new BitmapFont();
    SpriteBatch batch;
    PlayArea playArea;

    public EditorState(tewwawiaGame game) {
        this.game = game;
        batch = new SpriteBatch();
        playArea = new PlayArea();
        Gdx.graphics.setWindowedMode(800, 600);

    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        playArea.render();
        batch.begin();

        font.draw(batch, "state: editor", 20, 20);
        batch.end();

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
