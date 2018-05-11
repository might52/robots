package robots_annotation.impls.pool;

import custom_annotation.Format;
import custom_annotation.interfaces.Genre;
import custom_annotation.interfaces.RobotQualifier;
import org.springframework.beans.factory.annotation.Autowired;
import robots_annotation.interfaces.Robot;
import robots_annotation.interfaces.RobotPool;

import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.ArrayBlockingQueue;

public class T1000Pool {
    @Autowired
    @RobotQualifier(genre="greenRobot", format = Format.GREEN)
    private Robot greenRobot;
    @Autowired
    @RobotQualifier(genre="redRobot", format = Format.RED)
    private Robot redRobot;
    @Autowired
    @RobotQualifier(genre="blueRobot", format = Format.BLUE)
    private Robot blueRobot;
    @Autowired
    @RobotQualifier(genre="goldenRobot", format = Format.GOLDEN)
    private Robot goldenRobot;

    private Collection<Robot> robotCollection = new HashSet<>();

    public void beginShow(){
        robotCollection.add(greenRobot);
        robotCollection.add(redRobot);
        robotCollection.add(blueRobot);
        robotCollection.add(goldenRobot);

        for (Robot robot: robotCollection) {
            robot.action();
            System.out.println("");
        }
    }
}
