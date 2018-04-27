package robots.main;

//import org.springframework.boot.SpringApplication;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import robots.impls.pool.T1000Pool;


//@SpringBootApplication
public class RobotApplication {
    private static final Logger logger = LogManager.getLogger(RobotApplication.class);
    public static void main(String[] args) {
        //SpringApplication.run(RobotApplication.class, args);
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        //region General
/*
        Object obj = context.getBean("t1000");
        if (obj instanceof ModelT1000){
            ModelT1000 t1000 = (ModelT1000)obj;
            t1000.dance();
            t1000.beginShow();
        }

        Class myObjectClass = ModelT1000.class;
        Method[] methods = myObjectClass.getMethods();
        for (Method method: methods) {
            System.out.println("method = " + method.getName());
        }
        Field[] fields = myObjectClass.getFields();
        for (Field field : fields) {
            System.out.println("field = " + field.getName());
        }

        ModelT1000 t1000 = context.getBean("t1000", ModelT1000.class);
        System.out.println(t1000);
        t1000 = context.getBean("t1000", ModelT1000.class);
        System.out.println(t1000);
*/
        //endregion
        //region Conveyer
/*
        RobotConveyer t1000Conveyer = context.getBean("t1000Conveyer", RobotConveyer.class);

        Robot terminator1 = t1000Conveyer.createRobot();
        Robot terminator2 = t1000Conveyer.createRobot();
        Robot terminator3 = t1000Conveyer.createRobot();

        logger.info("terminator1: " + terminator1);
        logger.info("terminator2: " + terminator2);
        logger.info("terminator3: " + terminator3);
*/
        //endregion
        //region Collections
/*
        logger.info("\n\nCollection in spring\n");
        T1000Pool t1000Pool = context.getBean("T1000Pool", T1000Pool.class);
        t1000Pool.beginShow();
*/
        //endregion
        //region SpEL
        System.out.println("SpEL");
        T1000Pool t1000GoldenPool1 = context.getBean("t1000GoldenPool", T1000Pool.class);
        t1000GoldenPool1.beginShow();
        //endregion
    }
}
