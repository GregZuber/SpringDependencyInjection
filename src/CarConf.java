import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by gzuber on 05/08/16.
 */
@Configuration
public class CarConf {

    @Bean
    public Engine slowEngine() {
        return new SlowEngine();
    }

    @Bean
    public Car slowCar() {
        return new Car(slowEngine());
    }
}
