package org.portolan.ppkp.robot.fight.controller;

import org.portolan.ppkp.robot.fight.service.RobotFightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/robots")
public class RobotFightController {

    @Autowired
    private RobotFightService robotFightService;

    @GetMapping("/check/coils/{amount}")
    public @ResponseBody boolean checkCoils(@PathVariable("amount") int amount) {
        return robotFightService.checkCoils(amount);
    }

}
