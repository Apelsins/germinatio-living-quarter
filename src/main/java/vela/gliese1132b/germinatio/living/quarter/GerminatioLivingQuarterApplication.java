package vela.gliese1132b.germinatio.living.quarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class GerminatioLivingQuarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(GerminatioLivingQuarterApplication.class, args);
    }

}
