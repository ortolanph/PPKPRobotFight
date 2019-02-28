package org.portolan.ppkp.robot.fight.service;

import org.springframework.stereotype.Component;

import static org.portolan.ppkp.robot.fight.engine.RobotParts.COILS;

@Component
public class RobotFightService {

    public boolean checkCoils(int coilAmmount) {
        return COILS.checkAvailability(coilAmmount);
    }

}
