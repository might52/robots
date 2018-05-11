package robots.main;

//import org.springframework.boot.SpringApplication;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import robots.impls.pool.T1000Pool;
import robots.impls.robot.ModelT1000;


//@SpringBootApplication
public class RobotApplication {
    private static final Logger logger = LogManager.getLogger(RobotApplication.class);
    public static void main(String[] args) {
        //SpringApplication.run(RobotApplication.class, args);
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        //region Autowire
        System.out.println("Autowire");
//        ModelT1000 modelT1000 = context.getBean("t1000", ModelT1000.class);
//        modelT1000.action();
        T1000Pool t1000GoldenPool1 = context.getBean("t1000GoldenPool", T1000Pool.class);
        t1000GoldenPool1.beginShow();
        //endregion
    }
}
