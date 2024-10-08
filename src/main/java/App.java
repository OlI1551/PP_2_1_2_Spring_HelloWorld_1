import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat catBean1 =
                (Cat) applicationContext.getBean("cat");
        catBean1.setName("Fluffy");
        System.out.println(catBean1.getName());

        Cat catBean2 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(catBean2.getName());

        System.out.println(bean.equals(bean1));
        System.out.println(catBean1.equals(catBean2));

    }
}