import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by gzuber on 05/08/16.
 */
public class CarExample {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CarConf.class);
        Car car = context.getBean(Car.class);
        car.start();
    }
}
