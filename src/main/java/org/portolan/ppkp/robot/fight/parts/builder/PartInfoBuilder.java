package org.portolan.ppkp.robot.fight.parts.builder;

import org.portolan.ppkp.robot.fight.engine.RobotPart;
import org.portolan.ppkp.robot.fight.parts.PartInfo;

public class PartInfoBuilder {

    public static PartInfo buildBOMfor(RobotPart part, int amount) {
        PartInfo bomPart = new PartInfo();

        bomPart.partName = part.name();
        bomPart.required = part.getMinimum();
        bomPart.amount = amount;

        return bomPart;
    }

    public static PartInfo buildPartitionfor(RobotPart part, int amount) {
        PartInfo bomPart = new PartInfo();

        bomPart.partName = part.name();
        bomPart.required = part.getMinimum();
        bomPart.amount = part.partition(amount);

        return bomPart;
    }

}
