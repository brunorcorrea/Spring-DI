package xyz.brunocorrea.sfgdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import xyz.brunocorrea.sfgdi.repositories.EnglishGreetingRepository;
import xyz.brunocorrea.sfgdi.repositories.EnglishGreetingRepositoryImpl;
import xyz.brunocorrea.sfgdi.services.ConstructorGreetingService;
import xyz.brunocorrea.sfgdi.services.I18nEnglishGreetingService;
import xyz.brunocorrea.sfgdi.services.I18nSpanishGreetingService;
import xyz.brunocorrea.sfgdi.services.PrimaryGreetingService;
import xyz.brunocorrea.sfgdi.services.PropertyGreetingService;
import xyz.brunocorrea.sfgdi.services.SetterGreetingService;

@Configuration
public class GreetingServiceConfig {

    @Profile({"ES", "default"})
    @Bean("i18nService")
    I18nSpanishGreetingService i18nSpanishGreetingService () {
        return new I18nSpanishGreetingService();
    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository() {
        return new EnglishGreetingRepositoryImpl();
    }

    @Profile("EN")
    @Bean
    I18nEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository) {
        return new I18nEnglishGreetingService(englishGreetingRepository);
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }

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
