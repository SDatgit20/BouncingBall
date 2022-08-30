package com.tw.dojo.bouncingBall.model;

public class BouncingBall extends Ball {

    private int direction;
    BouncingBallAlgo bouncingBallAlgo;
    BouncingBall(int x,int y,int direction){
        super(x,y);
//        this.direction=direction;
       bouncingBallAlgo=new BouncingBallAlgo(this,-1);
    }

    @Override
    public void update() {
        bouncingBallAlgo.moveUpDown();
    }
}
