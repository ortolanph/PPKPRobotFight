package org.portolan.ppkp.robot.fight.parts;

import java.util.Date;
import java.util.List;

public class RobotBuildingInfo {
    public List<PartInfo> billOfMaterials;
    public List<PartInfo> partitionList;
    public int maximumBuilds;
    public boolean canBuild;
    public Date generatedAt;
}
