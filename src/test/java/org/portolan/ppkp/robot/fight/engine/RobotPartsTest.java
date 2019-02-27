package org.portolan.ppkp.robot.fight.engine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RobotPartsTest {

    private static final int SUFFICIENT_COILS = 9;
    private static final int INSUFFICIENT_COILS = 8;

    private static final int SUFFICIENT_LINGOTS = 56;
    private static final int INSUFFICIENT_LINGOTS = 55;

    private static final int SUFFICIENT_BOLTS = 70;
    private static final int INSUFFICIENT_BOLTS = 69;

    private static final int SUFFICIENT_COINS = 1000;
    private static final int INSUFFICIENT_COINS = 999;

    @Test
    public void coilsShouldBeSufficient() {
        assertTrue(RobotParts.COILS.checkAvailability(SUFFICIENT_COILS));
    }

    @Test
    public void coilsShouldBeInsufficient() {
        assertFalse(RobotParts.COILS.checkAvailability(INSUFFICIENT_COILS));
    }

    @Test
    public void lingotsShouldBeSufficient() {
        assertTrue(RobotParts.LINGOTS.checkAvailability(SUFFICIENT_LINGOTS));
    }

    @Test
    public void lingotsShouldBeInsufficient() {
        assertFalse(RobotParts.LINGOTS.checkAvailability(INSUFFICIENT_LINGOTS));
    }

    @Test
    public void boltsShouldBeSufficient() {
        assertTrue(RobotParts.BOLTS.checkAvailability(SUFFICIENT_BOLTS));
    }

    @Test
    public void boltsShouldBeInsufficient() {
        assertFalse(RobotParts.BOLTS.checkAvailability(INSUFFICIENT_BOLTS));
    }

    @Test
    public void coinsShouldBeSufficient() {
        assertTrue(RobotParts.COINS.checkAvailability(SUFFICIENT_COINS));
    }

    @Test
    public void coinsShouldBeInsufficient() {
        assertFalse(RobotParts.COINS.checkAvailability(INSUFFICIENT_COINS));
    }
}