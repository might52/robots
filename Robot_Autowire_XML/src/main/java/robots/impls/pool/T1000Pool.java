package robots.impls.pool;

import robots.impls.robot.T100Conveyer;
import robots.interfaces.Robot;
import robots.interfaces.RobotPool;

import java.util.Collection;
import java.util.Map;

public class T1000Pool implements RobotPool {
//    private Map<String, Robot> robotCollection;
    private Collection<Robot> robotCollection;

    public T1000Pool() {
    }

    public void setRobotCollection(Collection<Robot> robotCollection) {
        this.robotCollection = robotCollection;
    }

    @Override
    public Collection<Robot> getRobotCollection() {
        return robotCollection;
    }

    public void beginShow(){
        for (Robot robot: robotCollection) {
            robot.action();
            System.out.println("");
        }
    }
}
