import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationTests {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationTests.class, args);

        //SpringApplication.run(Application.class, args);
        //or
//        SpringApplication app = new SpringApplication(ApplicationTests.class);
//        app.run(args);
    }
}

