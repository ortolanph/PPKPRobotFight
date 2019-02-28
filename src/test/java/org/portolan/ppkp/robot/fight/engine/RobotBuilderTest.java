package org.portolan.ppkp.robot.fight.engine;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class RobotBuilderTest {

    private RobotBuilder robotBuilder;

    public static final int MINIMUM_COILS = 9;
    public static final int MINIMUM_LINGOTS = 56;
    public static final int MINIMUM_SCREWS = 70;
    public static final int MINIMUM_COINS = 1000;

    private static final int ONE_TIME = 1;
    private static final int TWO_TIMES = 2;
    private static final int TEN_TIMES = 10;
    private static final int NO_TIME = 0;

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
        assertTrue(robotBuilder.canBuild(MINIMUM_COILS, MINIMUM_LINGOTS, MINIMUM_SCREWS, MINIMUM_COINS));
    }

    @Test
    public void missingCoils() {
        assertFalse(robotBuilder.canBuild(MINIMUM_COILS - 1, MINIMUM_LINGOTS, MINIMUM_SCREWS, MINIMUM_COINS));
    }

    @Test
    public void missingLingots() {
        assertFalse(robotBuilder.canBuild(MINIMUM_COILS, MINIMUM_LINGOTS - 1, MINIMUM_SCREWS, MINIMUM_COINS));
    }

    @Test
    public void missingBolts() {
        assertFalse(robotBuilder.canBuild(MINIMUM_COILS, MINIMUM_LINGOTS, MINIMUM_SCREWS - 1, MINIMUM_COINS));
    }

    @Test
    public void insufficientFunds() {
        assertFalse(robotBuilder.canBuild(MINIMUM_COILS, MINIMUM_LINGOTS, MINIMUM_SCREWS, MINIMUM_COINS - 1));
    }

    @Test
    public void allMissing() {
        assertFalse(robotBuilder.canBuild(MINIMUM_COILS - 1, MINIMUM_LINGOTS - 1, MINIMUM_SCREWS - 1, MINIMUM_COINS - 1));
    }

    @Test
    public void canBuildOneTime() {
        int actual = robotBuilder.maximumBuilds(MINIMUM_COILS, MINIMUM_LINGOTS, MINIMUM_SCREWS, MINIMUM_COINS);
        int expected = ONE_TIME;

        assertEquals(expected, actual);
    }

    @Test
    public void canBuildTwoTimes() {
        int actual = robotBuilder.maximumBuilds(MINIMUM_COILS * 2, MINIMUM_LINGOTS * 2, MINIMUM_SCREWS * 2, MINIMUM_COINS * 2);
        int expected = TWO_TIMES;

        assertEquals(expected, actual);
    }

    @Test
    public void canBuildTenTimes() {
        int actual = robotBuilder.maximumBuilds(MINIMUM_COILS * 10, MINIMUM_LINGOTS * 10, MINIMUM_SCREWS * 10, MINIMUM_COINS * 10);
        int expected = TEN_TIMES;

        assertEquals(expected, actual);
    }

    @Test
    public void cannotBuildRobotNoTime() {
        int actual = robotBuilder.maximumBuilds(MINIMUM_COILS - 1, MINIMUM_LINGOTS - 1, MINIMUM_SCREWS - 1, MINIMUM_COINS - 1);
        int expected = NO_TIME;

        assertEquals(expected, actual);
    }
}