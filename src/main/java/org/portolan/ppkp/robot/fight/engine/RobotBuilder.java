package org.portolan.ppkp.robot.fight.engine;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.portolan.ppkp.robot.fight.engine.RobotParts.*;

public class RobotBuilder {

    /**
     * Check if the robot can be built or not
     *
     * @param coils   the amount of coils
     * @param lingots the amount of lingots
     * @param bolts   the amount of bolts
     * @param coins   the coins earned
     * @return <code>true</code> if the robot can be built or <code>false</code>
     */
    public boolean canBuild(int coils, int lingots, int bolts, int coins) {
        return COILS.checkAvailability(coils) &&
                LINGOTS.checkAvailability(lingots) &&
                SCREWS.checkAvailability(bolts) &&
                COINS.checkAvailability(coins);
    }

    /**
     * Provide the number of times that the robot can be built. Returns zero if the Robot cannot.
     *
     * @param coils   the amount of coils
     * @param lingots the amount of lingots
     * @param bolts   the amount of bolts
     * @param coins   the coins earned
     * @return the number of times that the robot can be built
     */
    public int maximumBuilds(int coils, int lingots, int bolts, int coins) {
        List<Integer> partitionList = new ArrayList<>();

        partitionList.add(COILS.partition(coils));
        partitionList.add(LINGOTS.partition(lingots));
        partitionList.add(SCREWS.partition(bolts));
        partitionList.add(COINS.partition(coins));

        return partitionList.stream().min(Comparator.naturalOrder()).get();
    }

}
