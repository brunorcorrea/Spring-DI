package xyz.brunocorrea.sfgdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import xyz.brunocorrea.sfgdi.services.ConstructorGreetingService;
import xyz.brunocorrea.sfgdi.services.PropertyGreetingService;
import xyz.brunocorrea.sfgdi.services.SetterGreetingService;

@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyGreetingService propertyGreetingService() {
        return new PropertyGreetingService();
    }

    @Bean
    SetterGreetingService setterGreetingService() {
        return new SetterGreetingService();
    }
}
