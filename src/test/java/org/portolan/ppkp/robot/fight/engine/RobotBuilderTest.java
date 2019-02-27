package org.portolan.ppkp.robot.fight.engine;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class RobotBuilderTest {

    private RobotBuilder robotBuilder;

    public static final int MINIMUM_COILS = 9;
    public static final int MINIMUM_LINGOTS = 56;
    public static final int MINIMUM_BOLTS = 70;
    public static final int MINIMUM_COINS = 1000;

    @BeforeEach
    public void setUp() {
        robotBuilder = new RobotBuilder();
    }

    @AfterEach
    public void tearDown() {
        robotBuilder = null;
    }

    @Test
    public void canBuildRobot() {
        assertTrue(robotBuilder.canBuild(MINIMUM_COILS, MINIMUM_LINGOTS, MINIMUM_BOLTS, MINIMUM_COINS));
    }

    @Test
    public void missingCoils() {
        assertFalse(robotBuilder.canBuild(MINIMUM_COILS - 1, MINIMUM_LINGOTS, MINIMUM_BOLTS, MINIMUM_COINS));
    }

    @Test
    public void missingLingots() {
        assertFalse(robotBuilder.canBuild(MINIMUM_COILS, MINIMUM_LINGOTS - 1, MINIMUM_BOLTS, MINIMUM_COINS));
    }

    @Test
    public void missingBolts() {
        assertFalse(robotBuilder.canBuild(MINIMUM_COILS, MINIMUM_LINGOTS, MINIMUM_BOLTS - 1, MINIMUM_COINS));
    }

    @Test
    public void insufficientFunds() {
        assertFalse(robotBuilder.canBuild(MINIMUM_COILS, MINIMUM_LINGOTS, MINIMUM_BOLTS, MINIMUM_COINS - 1));
    }

    @Test
    public void allMissing() {
        assertFalse(robotBuilder.canBuild(MINIMUM_COILS - 1, MINIMUM_LINGOTS - 1, MINIMUM_BOLTS - 1, MINIMUM_COINS - 1));
    }

    @Test
    @Disabled
    public void canBuildOneTime() {

    }

    @Test
    @Disabled
    public void canBuildTwoTimes() {

    }

    @Test
    @Disabled
    public void canBuildTenTimes() {

    }

    @Test
    @Disabled
    public void cannotBuildRobot() {

    }
}