package uz.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = {"uz.service","uz.controllers"})
@EnableJpaRepositories(basePackages = {"uz.repository"})
public class AppConfig {

}
