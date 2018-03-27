package robots.main;

//import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import robots.impls.robot.ModelT1000;


//@SpringBootApplication
public class RobotApplication {
    public static void main(String[] args) {
        //SpringApplication.run(RobotApplication.class, args);
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Object obj = context.getBean("t1000Empty");
        if (obj instanceof ModelT1000){
            ModelT1000 t1000 = (ModelT1000)obj;
            t1000.dance();
            t1000.fire();
        }

    }
}
