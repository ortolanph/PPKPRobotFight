package org.portolan.ppkp.robot.fight.service;

import org.portolan.ppkp.robot.fight.engine.RobotBuilder;
import org.portolan.ppkp.robot.fight.parts.RobotBuildingInfo;
import org.portolan.ppkp.robot.fight.parts.builder.PartInfoBuilder;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

import static org.portolan.ppkp.robot.fight.engine.RobotPart.*;

@Component
public class RobotFightService {

    private RobotBuilder builder = new RobotBuilder();

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

    public boolean canBuild(int coils, int lingots, int screws, int coins) {
        return builder.canBuild(coils, lingots, screws, coins);
    }

    public int maximumBuilds(int coils, int lingots, int screws, int coins) {
        return builder.maximumBuilds(coils, lingots, screws, coins);
    }

    public RobotBuildingInfo detailedInfo(int coils, int lingots, int screws, int coins) {
        RobotBuildingInfo info = new RobotBuildingInfo();

        info.billOfMaterials = new ArrayList<>();

        info.billOfMaterials.add(PartInfoBuilder.buildBOMfor(COILS, coils));
        info.billOfMaterials.add(PartInfoBuilder.buildBOMfor(LINGOTS, lingots));
        info.billOfMaterials.add(PartInfoBuilder.buildBOMfor(SCREWS, screws));
        info.billOfMaterials.add(PartInfoBuilder.buildBOMfor(COINS, coins));

        info.canBuild = builder.canBuild(coils, lingots, screws, coins);
        info.maximumBuilds = builder.maximumBuilds(coils, lingots, screws, coins);
        info.generatedAt = Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant());

        return info;
    }
}