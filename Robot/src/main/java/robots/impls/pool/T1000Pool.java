package robots.impls.pool;

import robots.impls.robot.T100Conveyer;
import robots.interfaces.Robot;
import robots.interfaces.RobotPool;

import java.util.Collection;
import java.util.Map;

public class T1000Pool implements RobotPool {
    private Map<String, Robot> robotCollection;

    public T1000Pool(Map<String, Robot> robotCollection) {
        this.robotCollection = robotCollection;
    }

    @Override
    public Map<String,Robot> getRobotCollection() {
        return robotCollection;
    }

    public void action(){
        for (Map.Entry<String,Robot> robot: robotCollection.entrySet()) {
            System.out.println("robot key: " + robot.getKey());
            robot.getValue().action();
            System.out.println("");
        }
    }
}
