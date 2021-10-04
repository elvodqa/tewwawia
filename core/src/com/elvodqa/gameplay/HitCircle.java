package com.elvodqa.gameplay;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;

public class HitCircle {
    private int x, y; //position
    private float circleSize = 3.5f; // circle size
    private float width, heigth;
    private Texture hitCircleTexture;
    private Texture approachCircleTexture;
    private int comboNumber;
    private long hitTime;

    public HitCircle(int x, int y, long hitTime) {
        this.x = x;
        this.y = y;
        this.hitTime = hitTime;
        this.width = 50 * circleSize;
        this.heigth = 50 * circleSize;
        hitCircleTexture = new Texture("skin/hitcircle.png");
        approachCircleTexture = new Texture("skin/approachcircle.png");
    }
    public void render(long time, long songTime, Batch batch) {
        if (hitTime - 500 == time) {
            batch.begin();

            batch.end();
        }
    }


}
