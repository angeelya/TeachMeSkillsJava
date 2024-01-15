package work36;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringHelloRunner {
    public static void main(String[] args) {
        // Xml
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring=hello-bean.xml");
//        SpringHelloWorld springHelloWorld = (SpringHelloWorld) applicationContext.getBean("springHelloWorld");
//        springHelloWorld.getHelloMessage();
        //Annotation
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(applicationContext.getBean("message"));
        SpringHelloWorld springHelloWorld = applicationContext.getBean("springHelloWorld", SpringHelloWorld.class);
        springHelloWorld.getHelloMessage();
    }
}
