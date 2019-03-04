package org.portolan.ppkp.robot.fight.engine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RobotPartTest {

    private static final int SUFFICIENT_COILS = 9;
    private static final int INSUFFICIENT_COILS = 8;

    private static final int SUFFICIENT_LINGOTS = 56;
    private static final int INSUFFICIENT_LINGOTS = 55;

    private static final int SUFFICIENT_SCREWS = 70;
    private static final int INSUFFICIENT_SCREWS = 69;

    private static final int SUFFICIENT_COINS = 1000;
    private static final int INSUFFICIENT_COINS = 999;

    @Test
    public void coilsShouldBeSufficient() {
        assertTrue(RobotPart.COILS.checkAvailability(SUFFICIENT_COILS));
    }

    @Test
    public void coilsShouldBeInsufficient() {
        assertFalse(RobotPart.COILS.checkAvailability(INSUFFICIENT_COILS));
    }

    @Test
    public void lingotsShouldBeSufficient() {
        assertTrue(RobotPart.LINGOTS.checkAvailability(SUFFICIENT_LINGOTS));
    }

    @Test
    public void lingotsShouldBeInsufficient() {
        assertFalse(RobotPart.LINGOTS.checkAvailability(INSUFFICIENT_LINGOTS));
    }

    @Test
    public void screwsShouldBeSufficient() {
        assertTrue(RobotPart.SCREWS.checkAvailability(SUFFICIENT_SCREWS));
    }

    @Test
    public void screwsShouldBeInsufficient() {
        assertFalse(RobotPart.SCREWS.checkAvailability(INSUFFICIENT_SCREWS));
    }

    @Test
    public void coinsShouldBeSufficient() {
        assertTrue(RobotPart.COINS.checkAvailability(SUFFICIENT_COINS));
    }

    @Test
    public void coinsShouldBeInsufficient() {
        assertFalse(RobotPart.COINS.checkAvailability(INSUFFICIENT_COINS));
    }
}