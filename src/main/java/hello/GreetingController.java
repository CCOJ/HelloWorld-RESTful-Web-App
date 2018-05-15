package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Difference between RESTful web service controller and MVC controller is based on the HTTP response body.
 * Instead of view technology for server-side rendering of greeting data to HTML, RESTful web service
 * controller returns a Greeting object. This object writes directly to the HTTP response as JSON.
 */
@RestController //Marks class as controller where every method returns a domain object instead of view
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    /**
     * Returns a new Greeting object with id and content based on next value from counter.
     * Formats accordingly to the template and given name value.
     */
    @RequestMapping("/greeting") //Http requests to /greeting are mapped to greeting() method
    public Greeting greeting(@RequestParam(value="name", defaultValue = "World") String name) { //Binds value into name
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
