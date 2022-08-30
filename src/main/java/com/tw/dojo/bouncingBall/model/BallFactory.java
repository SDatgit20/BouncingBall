package com.tw.dojo.bouncingBall.model;

public class BallFactory {

    public static Ball[] all() {
        return new Ball[]{
                bouncingBall(75, 50, BouncingBallAlgo.DOWN),
                elasticBall(250, 100, Ball.DEFAULT_RADIUS, ElasticBallAlgo.SHRINK),
                // bouncingElasticBall() --> Let's make a new ball!
                bouncingElasticBall(350,150,Ball.DEFAULT_RADIUS, ElasticBallAlgo.SHRINK, BouncingBallAlgo.DOWN)
        };
    }

    public static Ball bouncingBall(int centerX, int centerY, int direction) {
        return new BouncingBallAlgo(centerX, centerY, direction);
    }

    public static Ball elasticBall(int centerX, int centerY, int radius, int direction) {
        return new ElasticBall(centerX, centerY, radius, direction);
    }

    public static Ball bouncingElasticBall(int centerX, int centerY, int radius, int growthDirection, int direction){
        return new BouncingElasticBall(centerX,centerY,radius,growthDirection, direction);
    }

}
