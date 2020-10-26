package co.com.servicemesh.lab.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;
import java.util.TimeZone;

@SpringBootApplication
@ComponentScan(basePackages = {"co.com.servicemesh.lab.*"})
public class Application {

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
        TimeZone.setDefault(TimeZone.getTimeZone("America/Colombia"));
        Locale.setDefault(Locale.forLanguageTag("es_CO"));
    }

}
