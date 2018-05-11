package custom_annotation;

import custom_annotation.interfaces.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import robots_annotation.interfaces.Robot;

import java.util.Collection;

public class RobotRecommender {
    // first way
    @Autowired
    @Genre("greenRobot")
    private Robot greenRobot;
    @Autowired
    @Genre("redRobot")
    private Robot redRobot;

    public Robot getGreenRobot() {
        return greenRobot;
    }

    // second way
    @Autowired
    public void setGreenRobot(@Genre("greenRobot") Robot greenRobot) {
        this.greenRobot = greenRobot;
    }

    public Robot getRedRobot() {
        return redRobot;
    }

    @Autowired
    public void setRedRobot(@Genre("redRobot")Robot redRobot) {
        this.redRobot = redRobot;
    }
}
