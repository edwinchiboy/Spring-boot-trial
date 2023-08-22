package https.usezilla.com.contentcalendar;

import https.usezilla.com.contentcalendar.config.ContentCalendarProperties;
import https.usezilla.com.contentcalendar.model.Content;
import https.usezilla.com.contentcalendar.model.Status;
import https.usezilla.com.contentcalendar.model.Type;
import https.usezilla.com.contentcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
         SpringApplication.run(Application.class, args);


    }

//    @Bean
//    CommandLineRunner commandLineRunner(ContentRepository repository){
//        return  args->{
//            Content content = new Content(
//                    null,
//                    "My first trial of suing apllication file",
//                    "All about chat GBT",
//                    Status.IDEA,
//                    Type.VIDEO,
//                    LocalDateTime.now(),
//                    null,
//                    "");
//            repository.save(content);
//
//        };
//    }

}
