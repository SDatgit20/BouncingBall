package com.tw.dojo.bouncingBall.model;

public class ElasticBall extends Ball{
    private int direction;
    ElasticBall(int x,int y,int radius,int direction){
        super(x,y,radius);
        this.direction=direction;
    }

    ElasticBallAlgo elasticBallAlgo=new ElasticBallAlgo(this,direction);

    @Override
    public void update() {
        elasticBallAlgo.reverseGrowthDirectionIfNecessary();
       elasticBallAlgo.next();
    }
}
