package work36;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean("springHelloWorld")
    public SpringHelloWorld getSpringHelloWorld() {
        return new SpringHelloWorld("Hello, spring");
    }
    @Bean("message")
    public String getMessage()
    {
        return "Hello,Spring";
    }
}
