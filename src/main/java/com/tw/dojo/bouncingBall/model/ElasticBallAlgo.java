package com.tw.dojo.bouncingBall.model;

public class ElasticBallAlgo {
    public static final int GROWTH_RATE = 2;

    static final int GROW = 1;
    static final int SHRINK = -1;

    private int growthDirection;

    private int radius;

    ElasticBallAlgo(Ball ball, int growthDirection) {
        this.radius=ball.radius;
        this.growthDirection = growthDirection;
    }

//    @Override
//    public void update() {
//        growthDirection = reverseGrowthDirectionIfNecessary();
//        radius = next();
//    }

    /***********************************************************************************
     *
     * Do not change Elastic ALGORITHM below.
     *
     ***********************************************************************************/

    public void reverseGrowthDirectionIfNecessary() {
        if (growingTooBig() || shrinkingTooSmall()) {
            growthDirection=switchDirection();
        }

        this.growthDirection=growthDirection;
    }

    private boolean shrinkingTooSmall() {
        return radius <= 0 && shrinking();
    }

    private boolean growingTooBig() {
        return radius >=Ball.DEFAULT_RADIUS && growing();
    }

    private int switchDirection() {
        return growing() ? SHRINK : GROW;
    }

    public void next() {
        this.radius=radius + (GROWTH_RATE * growthDirection);
    }

    private boolean shrinking() {
        return growthDirection == SHRINK;
    }

    private boolean growing() {
        return growthDirection == GROW;
    }
}
