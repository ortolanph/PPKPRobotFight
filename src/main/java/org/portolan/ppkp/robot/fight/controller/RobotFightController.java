package org.portolan.ppkp.robot.fight.controller;

import org.portolan.ppkp.robot.fight.service.RobotFightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/robots")
public class RobotFightController {

    @Autowired
    private RobotFightService robotFightService;

    @GetMapping("/check/{ammount}")
    public @ResponseBody boolean checkCoils(@PathVariable("ammount") int ammount) {
        return robotFightService.checkCoils(ammount);
    }

}
