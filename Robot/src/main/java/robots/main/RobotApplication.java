package robots.main;

//import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import robots.impls.robot.ModelT1000;

import java.lang.reflect.Field;
import java.lang.reflect.Method;


//@SpringBootApplication
public class RobotApplication {
    public static void main(String[] args) {
        //SpringApplication.run(RobotApplication.class, args);
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Object obj = context.getBean("t1000");
        if (obj instanceof ModelT1000){
            ModelT1000 t1000 = (ModelT1000)obj;
            t1000.dance();
            t1000.action();
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
/*
        ModelT1000 t1000 = context.getBean("t1000", ModelT1000.class);
        System.out.println(t1000);
        t1000 = context.getBean("t1000", ModelT1000.class);
        System.out.println(t1000);
*/
    }
}
