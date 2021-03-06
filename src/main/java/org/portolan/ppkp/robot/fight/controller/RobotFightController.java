package org.portolan.ppkp.robot.fight.controller;

import org.portolan.ppkp.robot.fight.parts.RobotBuildingInfo;
import org.portolan.ppkp.robot.fight.service.RobotFightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/robots")
public class RobotFightController {

    @Autowired
    private RobotFightService robotFightService;

    @GetMapping("/check/coils/{amount}")
    public @ResponseBody
    boolean checkCoils(@PathVariable("amount") int amount) {
        return robotFightService.checkCoils(amount);
    }

    @GetMapping("/check/lingots/{amount}")
    public @ResponseBody
    boolean checkLingots(@PathVariable("amount") int amount) {
        return robotFightService.checkLingots(amount);
    }

    @GetMapping("/check/screws/{amount}")
    public @ResponseBody
    boolean checkScrews(@PathVariable("amount") int amount) {
        return robotFightService.checkScrews(amount);
    }

    @GetMapping("/check/coins/{amount}")
    public @ResponseBody
    boolean checkCoins(@PathVariable("amount") int amount) {
        return robotFightService.checkCoins(amount);
    }

    @GetMapping("/check/coils/{coils}/lingots/{lingots}/screws/{screws}/coins/{coins}")
    public @ResponseBody
    boolean checkAll(
            @PathVariable("coils") int coils,
            @PathVariable("lingots") int lingots,
            @PathVariable("screws") int screws,
            @PathVariable("coins") int coins) {
        return robotFightService.canBuild(coils, lingots, screws, coins);
    }

    @GetMapping("/builds/coils/{coils}/lingots/{lingots}/screws/{screws}/coins/{coins}")
    public @ResponseBody
    int builds(@PathVariable("coils") int coils,
               @PathVariable("lingots") int lingots,
               @PathVariable("screws") int screws,
               @PathVariable("coins") int coins) {
        return robotFightService.maximumBuilds(coils, lingots, screws, coins);
    }

    @GetMapping("/info/coils/{coils}/lingots/{lingots}/screws/{screws}/coins/{coins}")
    public @ResponseBody
    RobotBuildingInfo retrieveInfo(@PathVariable("coils") int coils,
                                   @PathVariable("lingots") int lingots,
                                   @PathVariable("screws") int screws,
                                   @PathVariable("coins") int coins) {
        return robotFightService.detailedInfo(coils, lingots, screws, coins);
    }


}
