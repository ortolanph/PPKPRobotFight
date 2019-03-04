package org.portolan.ppkp.robot.fight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.portolan.ppkp.robot.fight.engine.RobotParts.*;

@Component
public class RobotFightService {

    public boolean checkCoils(int amount) {
        return COILS.checkAvailability(amount);
    }

    public boolean checkLingots(int amount) {
        return LINGOTS.checkAvailability(amount);
    }

    public boolean checkScrews(int amount) {
        return SCREWS.checkAvailability(amount);
    }

    public boolean checkCoins(int amount) {
        return COINS.checkAvailability(amount);
    }

}