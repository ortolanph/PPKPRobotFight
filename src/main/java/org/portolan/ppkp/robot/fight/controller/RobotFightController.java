package org.portolan.ppkp.robot.fight.controller;

import org.portolan.ppkp.robot.fight.service.RobotFightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RobotFightController {

    @Autowired
    private RobotFightService robotFightService;

    @GetMapping("/api/robots/check/coils/{amount}")
    public @ResponseBody boolean checkCoils(@PathVariable("amount") int amount) {
        return robotFightService.checkCoils(amount);
    }

}
