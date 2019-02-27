package org.portolan.ppkp.robot.fight.engine;

import org.jetbrains.annotations.Contract;

public enum RobotParts {

    /**
     * Coils parts
     */
    COILS(9),
    /**
     * Iron lingots parts
     */
    LINGOTS(56),
    /**
     * Bolts parts
     */
    BOLTS(70),
    /**
     * Coins earned
     */
    COINS(1000);

    private int minimum;

    RobotParts(int minimum) {
        this.minimum = minimum;
    }

    /**
     * Check if a certain amount of coins are eligible for build the robot.
     *
     * @param ammount the earned coin amount
     * @return <code>true</code> if the amount earned can be used to buy this part or <code>false</code> if not
     */
    @Contract(pure = true)
    public boolean checkAvailability(int ammount) {
        return ammount >= minimum;
    }

    /**
     * Returns the partition between a current amount of a part and the minimum of this part
     *
     * @param amount the current player's amount
     * @return the partition between a current amount of a part and the minimum of this part
     */
    @Contract(pure = true)
    public int partition(int amount) {
        return amount / minimum;
    }
}
