package robots.impls.robot;

import robots.interfaces.Robot;
import robots.interfaces.RobotConveyer;

public abstract class T100Conveyer implements RobotConveyer {
    @Override
    public abstract Robot createRobot();
}
