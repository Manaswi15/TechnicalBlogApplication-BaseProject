package technicalblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AutoConfigurationPackage
public class TechnicalBlogApplication {

    public static void main(String [] args){
        SpringApplication.run(TechnicalBlogApplication.class, args);
    }

}
