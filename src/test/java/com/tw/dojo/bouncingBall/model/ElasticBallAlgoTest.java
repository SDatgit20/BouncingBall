package com.tw.dojo.bouncingBall.model;

import org.junit.jupiter.api.Test;

import static com.tw.dojo.bouncingBall.BallTestHarness.*;

public class ElasticBallAlgoTest {
    @Test
    public void shouldDecreaseRadius() {
        Ball elasticBall = BallFactory.elasticBall(0, 0, 20, ElasticBallAlgo.SHRINK);

        elasticBall.update();

        assertRadiusIs(oneStepInwardsFrom(20), elasticBall);
    }

    @Test
    public void shouldIncreaseRadiusAfterFullyShrinking() {
        Ball elasticBall = BallFactory.elasticBall(0, 0, 0, ElasticBallAlgo.SHRINK);

        elasticBall.update();

        assertRadiusIs(oneStepOutwardsFrom(0), elasticBall);
    }

    @Test
    public void shouldIncreaseInSize() {
        Ball elasticBall = BallFactory.elasticBall(250, 100, 20, ElasticBallAlgo.GROW);

        elasticBall.update();

        assertRadiusIs(oneStepOutwardsFrom(20), elasticBall);
    }

    @Test
    public void shouldDecreaseInSizeAfterFullyExpanding() {
        Ball elasticBall = BallFactory.elasticBall(0, 0, Ball.DEFAULT_RADIUS, ElasticBallAlgo.GROW);

        elasticBall.update();

        assertRadiusIs(oneStepInwardsFrom(Ball.DEFAULT_RADIUS), elasticBall);
    }

}
