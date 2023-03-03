package untitled.common;


import untitled.VideoProcessApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { VideoProcessApplication.class })
public class CucumberSpingConfiguration {
    
}
