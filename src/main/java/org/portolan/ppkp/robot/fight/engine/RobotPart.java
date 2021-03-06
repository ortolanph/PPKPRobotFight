package org.portolan.ppkp.robot.fight.engine;

public enum RobotPart {

    /**
     * Coils parts
     */
    COILS(9),
    /**
     * Iron lingots parts
     */
    LINGOTS(56),
    /**
     * Screws parts
     */
    SCREWS(70),
    /**
     * Coins earned
     */
    COINS(1000);

    private int minimum;

    RobotPart(int minimum) {
        this.minimum = minimum;
    }

    /**
     * Check if a certain amount of certain part are eligible for build the robot.
     *
     * @param amount the earned certain part amount
     * @return <code>true</code> if the amount earned can be used to buy this part or <code>false</code> if not
     */
    public boolean checkAvailability(int amount) {
        return amount >= minimum;
    }

    /**
     * Returns the partition between a current amount of a part and the minimum of this part
     *
     * @param amount the current player's amount
     * @return the partition between a current amount of a part and the minimum of this part
     */
    public int partition(int amount) {
        return amount / minimum;
    }

    public int getMinimum() {
        return minimum;
    }
}
