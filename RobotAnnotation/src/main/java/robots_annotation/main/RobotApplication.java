package robots_annotation.main;

import custom_annotation.RobotRecommender;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import robots_annotation.impls.pool.T1000Pool;
import robots_annotation.impls.robot.ModelT1000;

public class RobotApplication {
    private static final Logger logger = LogManager.getLogger(RobotApplication.class);
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        //region Autowire
/*        System.out.println("Autowire");
        ModelT1000 t1000 = context.getBean("t1000", ModelT1000.class);
        t1000.action();*/
        //endregion

        //region Genre Annotation
        System.out.println("\nGenre Annotation\n");
        RobotRecommender recommender = context.getBean("robotRecommender", RobotRecommender.class);
        recommender.getGreenRobot().action();
        recommender.getRedRobot().action();
        //endregion

        //region RebotQualifier Annotation
        System.out.println("\nRebotQualifier Annotation\n");
        T1000Pool robotQualifier = context.getBean("robotQualifier", T1000Pool.class);
        robotQualifier.beginShow();
        //endregion

    }
}
