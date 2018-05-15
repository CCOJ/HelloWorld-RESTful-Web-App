package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Standalone application class which deploys Spring's support for embedding the Tomcat
 * servlet container as the HTTP runtime. This allows us to not deploy any external instance.
 */

/**
 * Adds
 * -@Configuration: Tags class as source of bean definition
 * -@EnableAutoConfiguration: Tells Spring Boot to add beans based on settings
 * -@EnableWebMvc: When it sees spring-webmvc in classpath,
 *                 it flags the application as a web app and sets up DispatcherServlet
 *  -@ComponentScan: Tells Spring to look for other components, configs, and services within the hello package
 *                   which allows to find the controllers
 */
@SpringBootApplication
public class Application {

    /**
     * Uses Spring Boot's SpringApplication.run to launch the application.
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
