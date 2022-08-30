package com.tw.dojo.bouncingBall.model;

import com.tw.dojo.bouncingBall.ui.BallWorld;

public class BouncingBallAlgo extends Ball {
    public static final int MOVEMENT_SPEED = 12;

    static final int DOWN = 1;
    static final int UP = -1;

    private int direction;
    private int radius;

    private int x;
    private int y;

    public BouncingBallAlgo(Ball bouncingBall, int direction) {
        super(bouncingBall.x,bouncingBall.y);
        this.x=bouncingBall.x;
        this.y=bouncingBall.y;
        this.radius=bouncingBall.radius;
        this.direction=direction;
    }


//    @Override
//    public void update() {
//        direction = reverseDirectionIfNecessary();
//        y = move();
//    }

    /***********************************************************************************
     *
     * Do not change Bouncing ALGORITHM below.
     *
     ***********************************************************************************/

    public int reverseDirectionIfNecessary() {
        if (movingTooHigh() || movingTooLow()) {
            return switchDirection();
        }

        return this.direction;
    }

    public void moveUpDown(){
        direction=reverseDirectionIfNecessary();
        y=move();
    }

    private boolean movingTooLow() {
        return  y + radius >= BallWorld.BOX_HEIGHT && movingDown();
    }

    private boolean movingTooHigh() {
        return y - radius <= 0 && movingUp();
    }

    private int switchDirection() {
        return movingDown() ? UP : DOWN;
    }

    public int move() {
        return y + (MOVEMENT_SPEED * direction);
    }

    private boolean movingDown() {
        return direction == DOWN;
    }

    private boolean movingUp() {
        return direction == UP;
    }
    
}
