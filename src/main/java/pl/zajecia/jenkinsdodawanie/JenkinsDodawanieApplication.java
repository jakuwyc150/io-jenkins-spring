package pl.zajecia.jenkinsdodawanie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDodawanieApplication {
    public static void main(String[] args) {
        SpringApplication.run(JenkinsDodawanieApplication.class, args);
    }

    public int add(int a, int b) {
        return a + b;
    }
}
